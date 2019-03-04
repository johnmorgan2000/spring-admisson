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
                removeHidden(app);
            } else if (filter === "eligible") {
                if (eligible === true) {
                    removeHidden(app);
                } else {
                    addHidden(app);
                }
            } else if (filter === "nonEligible") {
                if (eligible === false) {
                    removeHidden(app);
                } else {
                    addHidden(app);
                }
            }
        }
    });
}
filterApplications();

function addHidden(element) {
    element.classList.add("hidden");
    element.classList.remove("show");
}

function removeHidden(element) {
    element.classList.remove("hidden");
    element.classList.add("show");
}

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
    var applications = document.querySelectorAll(".applicantContainer");
    for (const app of applications) {
        
            var name = app
                .querySelector(".applicantName")
                .innerText.toLowerCase();
            var school = app
                .querySelector(".appSchool")
                .innerText.toLowerCase();
            if (name.includes(searchInput) || school.includes(searchInput)) {
                removeHidden(app);
            } else {
                addHidden(app);
            }
        
    }
}
