function getEmployeeCount() {

    fetch("employeeCount")
        .then(function(response) {
            return response.text();
        })
        .then(function(count) {

            document.getElementById("count").innerText =
                "Total Employees: " + count;
        })
        .catch(function(error) {
            console.error("Error:", error);
        });
}


window.onload = function() {
    getEmployeeCount();
};