var select = document.getElementById("sortBy");

window.onload = function() {
    if (localStorage.getItem("filter") !== null) {
        select.value = localStorage.getItem("filter");
    }
};

select.onchange = function() {
    var parent = select.parentElement;
    console.log(parent);
    localStorage.setItem("filter", select.value);
    parent.submit();
};
