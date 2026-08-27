document.getElementById("searchForm")
    .addEventListener("submit", function(event) {

        event.preventDefault();

        const id = document.getElementById("employeeId").value;

        console.log("Search Employee ID:", id);

        document.getElementById("result").innerHTML = `
            <h3>Searching Employee...</h3>
            <p>Employee ID: ${id}</p>
        `;

    });