function listenForRadioButtons() {
    const yesBtn = document.querySelector("#radioButtonYes");
    const noBtn = document.querySelector("#radioButtonNo");
    const bothBtns = document.querySelectorAll(".formRadioButton");
    const formPartTwo = document.querySelector("#formPartTwo");
    for (const btn of bothBtns) {
        btn.addEventListener("click", function() {
            if (yesBtn.checked == true) {
                formPartTwo.classList.remove("hidden");
            } else if (noBtn.checked == true) {
                formPartTwo.classList.add("hidden");
                clearPartTwoInputs();
            }
        });
    }
}
listenForRadioButtons();

function clearPartTwoInputs() {
    const partTwoInputs = document.querySelectorAll(".partTwoInput");
    for (const inputs of partTwoInputs) {
        input.value = null;
    }
}
clearPartTwoInputs();
