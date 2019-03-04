function filterApplications() {
    var select = document.getElementById("sortBy");
    select.addEventListener("change", function() {
        var applications = document.querySelectorAll(".applicantContainer");
        var filter = select.value;

        for (const app of applications) {
            var eligible = app
                .querySelector(".applicantEligible i")
                .classList.contains("isEligible");
            if (filter === "all") {
                app.classList.remove("filtered");
            } else if (filter === "eligible") {
                if (eligible === true) {
                    app.classList.remove("filtered");
                } else {
                    app.classList.add("filtered");
                }
            } else if (filter === "nonEligible") {
                if (eligible === false) {
                    app.classList.remove("filtered");
                } else {
                    app.classList.add("filtered");
                }
            }
        }
    });
}
filterApplications();

function listenForSearch() {
    const searchBar = document.querySelector("#adminSearchBar");
    searchBar.addEventListener("input", function() {
        searchApplications();
    });
}

listenForSearch();

function searchApplications() {
    var searchInput = document
        .querySelector("#adminSearchBar")
        .value.toLowerCase();
    var applications = document.querySelectorAll(
        ".applicantContainer:not(.filtered)"
    );
    for (const app of applications) {
        var name = app.querySelector(".applicantName").innerText.toLowerCase();
        var school = app.querySelector(".appSchool").innerText.toLowerCase();
        if (name.includes(searchInput) || school.includes(searchInput)) {
            app.classList.remove("searched");
        } else {
            app.classList.add("searched");
        }
    }
}
