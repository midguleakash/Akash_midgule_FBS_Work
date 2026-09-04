document.getElementById("employeeForm")
    .addEventListener("submit", function(event) {

       

        const employee = {

            id: document.getElementById("id").value,

            fName: document.getElementById("fName").value,

            lName: document.getElementById("lName").value,

            department: document.getElementById("department").value,

            salary: document.getElementById("salary").value,

            city: document.getElementById("city").value
        };

        console.log(employee);

        document.getElementById("message").innerText =
            "Employee data collected successfully.";

    });