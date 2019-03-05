function setPhoneNumber() {
    const numberHolder = document.querySelector("#phoneNumber");
    const nonFormattedNumber = document.querySelector("#phoneNumber").innerText;

    numberHolder.innerText = formatPhoneNumber(nonFormattedNumber);
}

setPhoneNumber();

function formatPhoneNumber(number) {
    const numbersList = removeNonNumbers(number).split("");
    var newNumber = "";
    for (var i = 0; i < numbersList.length; i++) {
        if (i == 0) {
            newNumber += "(";
        } else if (i == 3) {
            newNumber += ") ";
        } else if (i == 6) {
            newNumber += "-";
        }
        newNumber += numbersList[i];
    }
    return newNumber;
}

function removeNonNumbers(string) {
    const characters = string.split("");
    var newString = "";
    for (var char of characters) {
        if (!isNaN(char)) {
            newString += char;
        }
    }
    return newString;
}
