function getEmployees() {

    const employees = [

        {
            id: 101,
            fName: "Akash",
            lName: "Patil",
            department: "IT",
            salary: 50000,
            city: "Pune"
        },

        {
            id: 102,
            fName: "Rahul",
            lName: "Sharma",
            department: "HR",
            salary: 45000,
            city: "Mumbai"
        }

    ];

    const table = document.getElementById("employeeTable");

    table.innerHTML = "";

    employees.forEach(function(employee) {

        const row = `
            <tr>

                <td>${employee.id}</td>
                <td>${employee.fName}</td>
                <td>${employee.lName}</td>
                <td>${employee.department}</td>
                <td>${employee.salary}</td>
                <td>${employee.city}</td>

            </tr>
        `;

        table.innerHTML += row;

    });
}