const employeeTable = document.querySelector("#employeeTable");
const employeeCount = document.querySelector("#employeeCount");
const searchId = document.querySelector("#searchId");
const searchBtn = document.querySelector("#searchBtn");
const clearBtn = document.querySelector("#clearBtn");

const modal = document.querySelector("#employeeModal");
const closeModal = document.querySelector("#closeModal");
const viewSection = document.querySelector("#viewSection");
const updateSection = document.querySelector("#updateSection");
const modalTitle = document.querySelector("#modalTitle");
const updateForm = document.querySelector("#updateForm");

let employees = [];

function loadEmployees() {
    fetch("employees")
        .then(response => response.json())
        .then(data => {
            employees = data;
			
            renderEmployees(employees);
        })
        .catch(error => {
            console.error("Error loading employees:", error);
        });
}

function renderEmployees(employeeList) {
	
    employeeTable.innerHTML = "";
    employeeCount.textContent = employeeList.length;

    if (employeeList.length === 0) {
        employeeTable.innerHTML = `
            <tr>
                <td colspan="7">No employees found</td>
            </tr>
        `;
        return;
    }

    employeeList.forEach(employee => {
        const row = document.createElement("tr");

        row.innerHTML = `
            <td>${employee.id}</td>
            <td>${employee.fName}</td>
            <td>${employee.lName}</td>
            <td>${employee.department}</td>
            <td>${employee.salary}</td>
            <td>${employee.city}</td>
            <td>
                <button
                    class="action-btn view-btn"
                    data-id="${employee.id}">
                    View
                </button>

                <button
                    class="action-btn update-btn"
                    data-id="${employee.id}">
                    Update
                </button>

                <button
                    class="action-btn delete-btn"
                    data-id="${employee.id}">
                    Delete
                </button>
            </td>
        `;

        employeeTable.appendChild(row);
    });
}

searchBtn.addEventListener("click", function() {
    const id = Number(searchId.value);

    if (!id) {
        alert("Please enter employee ID");
        return;
    }

    const employee = employees.find(employee => employee.id === id);

    if (!employee) {
        alert("Employee not found");
        return;
    }

    renderEmployees([employee]);
});

clearBtn.addEventListener("click", function() {
    searchId.value = "";
    renderEmployees(employees);
});

employeeTable.addEventListener("click", function(event) {
    const button = event.target;
    const id = Number(button.dataset.id);

    if (button.classList.contains("view-btn")) {
        viewEmployee(id);
    } else if (button.classList.contains("update-btn")) {
        openUpdateModal(id);
    } else if (button.classList.contains("delete-btn")) {
        deleteEmployee(id);
    }
});

function viewEmployee(id) {
    const employee = employees.find(employee => employee.id === id);

    if (!employee) {
        return;
    }

    modalTitle.textContent = "Employee Details";

    document.querySelector("#viewId").textContent = employee.id;
    document.querySelector("#viewFirstName").textContent = employee.fName;
    document.querySelector("#viewLastName").textContent = employee.lName;
    document.querySelector("#viewDepartment").textContent = employee.department;
    document.querySelector("#viewSalary").textContent = employee.salary;
    document.querySelector("#viewCity").textContent = employee.city;

    viewSection.style.display = "block";
    updateSection.style.display = "none";
    modal.style.display = "flex";
}

function openUpdateModal(id) {
    const employee = employees.find(employee => employee.id === id);

    if (!employee) {
        return;
    }

    modalTitle.textContent = "Update Employee";

    document.querySelector("#updateId").value = employee.id;
    document.querySelector("#updateFirstName").value = employee.fName;
    document.querySelector("#updateLastName").value = employee.lName;
    document.querySelector("#updateDepartment").value = employee.department;
    document.querySelector("#updateSalary").value = employee.salary;
    document.querySelector("#updateCity").value = employee.city;

    viewSection.style.display = "none";
    updateSection.style.display = "block";
    modal.style.display = "flex";
}

updateForm.addEventListener("submit", function(event) {
    event.preventDefault();

    const id = Number(document.querySelector("#updateId").value);

    const updatedEmployee = {
        id: id,
        fName: document.querySelector("#updateFirstName").value,
        lName: document.querySelector("#updateLastName").value,
        department: document.querySelector("#updateDepartment").value,
        salary: Number(document.querySelector("#updateSalary").value),
        city: document.querySelector("#updateCity").value
    };

    fetch(`/api/employees/${id}`, {
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(updatedEmployee)
    })
        .then(response => {
            if (!response.ok) {
                throw new Error("Update failed");
            }

            return response.json();
        })
        .then(() => {
            closeEmployeeModal();
            loadEmployees();
        })
        .catch(error => {
            console.error(error);
            alert("Unable to update employee");
        });
});

function deleteEmployee(id) {
    const confirmed = confirm(
        "Are you sure you want to delete this employee?"
    );

    if (!confirmed) {
        return;
    }

    fetch(`/deleteEmployee/${id}`, {
        method: "DELETE"
    })
        .then(response => {
            if (!response.ok) {
                throw new Error("Delete failed");
            }

            return response.json();
        })
        .then(() => {
            loadEmployees();
        })
        .catch(error => {
            console.error(error);
            alert("Unable to delete employee");
        });
}

function closeEmployeeModal() {
    modal.style.display = "none";
}

closeModal.addEventListener("click", closeEmployeeModal);

document.querySelector("#viewCloseBtn")
    .addEventListener("click", closeEmployeeModal);

document.querySelector("#updateCancelBtn")
    .addEventListener("click", closeEmployeeModal);

window.addEventListener("click", function(event) {
    if (event.target === modal) {
        closeEmployeeModal();
    }
});

loadEmployees();