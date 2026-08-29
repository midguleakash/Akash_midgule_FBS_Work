document.getElementById("searchForm")
    .addEventListener("submit", function(event) {

        event.preventDefault();

        const id = document.getElementById("employeeId").value;

        fetch("searchEmployee?id=" + id)
            .then(function(response) {

                return response.json();

            })
            .then(function(employee) {

                const result = document.getElementById("result");

                if (employee == null) {

                    result.innerHTML = `
                        <h3>Employee Not Found</h3>
                        <p>No employee found with ID: ${id}</p>
                    `;

                } else {

                    result.innerHTML = `
                        <h3>Employee Found</h3>

                        <p><b>ID:</b> ${employee.id}</p>
                        <p><b>First Name:</b> ${employee.fName}</p>
                        <p><b>Last Name:</b> ${employee.lName}</p>
                        <p><b>Department:</b> ${employee.department}</p>
                        <p><b>Salary:</b> ${employee.salary}</p>
                        <p><b>City:</b> ${employee.city}</p>
                    `;
                }

            })
            .catch(function(error) {

                console.error("Error:", error);

            });

    });