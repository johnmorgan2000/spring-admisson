function filterApplications() {
    var select = document.getElementById("sortBy");
    select.addEventListener("change", function() {
        var applications = document.querySelectorAll(".applicantContainer");
        var filter = select.value;

        for (const app of applications) {
            if (filter === "all") {
                removeClassName("hidden", app);
            } else if (filter === "eligible") {
                if (app.querySelector(".appEligible").innerText === "true") {
                    removeClassName("hidden", app);
                } else {
                    addClassName("hidden", app);
                }
            } else if (filter === "nonEligible") {
                if (app.querySelector(".appEligible").innerText === "false") {
                    removeClassName("hidden", app);
                } else {
                    addClassName("hidden", app);
                }
            }
        }
    });
}
filterApplications();

function addClassName(className, element) {
    if (!element.classList.contains(className)) {
        element.classList.add(className);
    }
}

function removeClassName(className, element) {
    if (element.classList.contains(className)) {
        element.classList.remove(className);
    }
}

// window.onload = function() {
//     if (localStorage.getItem("filter") !== null) {
//         select.value = localStorage.getItem("filter");
//     }
// };

// select.onchange = function() {
//     var parent = select.parentElement;
//     console.log(parent);
//     localStorage.setItem("filter", select.value);
//     parent.submit();
// };
