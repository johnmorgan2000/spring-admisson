function listenForRadioButtons() {
    const yesBtn = document.querySelector("#radioButtonYes");
    const noBtn = document.querySelector("#radioButtonNo");
    const bothBtns = document.querySelectorAll(".formRadioButton");
    const formPartTwo = document.querySelector("#formPartTwo");
    for (const btn of bothBtns) {
        btn.addEventListener("click", function() {
            if (yesBtn.checked == true) {
                requirePartTwoInputs(true);
                formPartTwo.classList.remove("hidden");
            } else if (noBtn.checked == true) {
                requirePartTwoInputs(false);
                formPartTwo.classList.add("hidden");
                clearPartTwoInputs();
            }
        });
    }
}
listenForRadioButtons();

function clearPartTwoInputs() {
    const partTwoInputs = document.querySelectorAll(".partTwoInput");
    for (const input of partTwoInputs) {
        input.value = null;
    }
}
clearPartTwoInputs();

function requirePartTwoInputs(boo) {
    const formPartTwoInputs = document.querySelectorAll("#formPartTwo input");
    const formPartTwoTextArea = document.querySelectorAll(
        "#formPartTwo textarea"
    );
    for (const input of formPartTwoInputs) {
        input.required = boo;
    }
    for (const textArea of formPartTwoTextArea) {
        textArea.required = boo;
    }
}

// document.querySelector("#phoneInput").addEventListener("input", function(e) {
//     phoneInputHandler(e.target);
// });

// function phoneInputHandler(phoneInput) {
//     var phoneValue = phoneInput.value;
//     var formatted = "";

//     sections = returnPhoneSections(phoneValue);

//     console.log(sections.areaCode);
//     if (sections.areaCode.length = 3){
        
        
//         phoneInput.value = "(" + sections.areaCode+ ")";
//     }

    
// }

// function returnPhoneSections(phoneValue) {
//     var characters = phoneValue.split("");
//     var numberString = "";

//     sections = {
//         areaCode: "",
//         prefix: "",
//         line: ""
//     };

//     characters.forEach(c => {
//         if (!isNaN(c)){
//             numberString += c;
//         }
        
//     });
    
//     var counter = 0;
//     for (var n of numberString){
//         if (counter < 3){
//             sections.areaCode += n;
//         }else if (counter < 6){
//             sections.prefix += n;
//         }else{
//             sections.line += n;
//         };
//         counter++;
//     }

//     return sections;
// }
