function getEmployees() {

    fetch("employees")
        .then(function(response) {
            return response.json();
        })
        .then(function(employees) {

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
        })
        .catch(function(error) {
            console.error("Error:", error);
        });
}