/**
 * 
 */

document.getElementById("deleteForm")
    .addEventListener("submit", function(event) {

        event.preventDefault();

        const id = document.getElementById("deleteId").value;

        console.log("Delete Employee ID:", id);

        document.getElementById("message").innerText =
            "Delete request sent for Employee ID: " + id;

    });