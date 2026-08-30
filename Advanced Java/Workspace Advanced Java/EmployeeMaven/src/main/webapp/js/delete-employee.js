document.getElementById("deleteForm")
    .addEventListener("submit", function(event) {

        

        const id = document.getElementById("employeeId").value;

        fetch("deleteEmployee?id=" + id, {
            method: "DELETE"
        })
        .then(function(response) {

            return response.json();

        })
        .then(function(result) {

            const resultDiv = document.getElementById("result");

            if (result.success) {

                resultDiv.innerHTML = `
                    <h3>Employee Deleted Successfully</h3>
                    <p>Employee ID: ${id}</p>
                `;

            } else {

                resultDiv.innerHTML = `
                    <h3>Employee Not Found</h3>
                    <p>No employee found with ID: ${id}</p>
                `;
            }

        })
        .catch(function(error) {

            console.error("Error:", error);

        });

    });