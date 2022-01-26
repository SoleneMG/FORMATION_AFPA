const numberField = document.querySelector("#number");
const lastNumberField = document.querySelector("#lastNumber");
const trialNumberField = document.querySelector("#trial");
const adviceField = document.querySelector("#advice");
const commentField = document.querySelector("#comment");

const number = document.querySelector("#number").value;
let lastNumber = document.querySelector("#lastNumber").value;
const trialNumber = document.querySelector("#trial").value;
const advice = document.querySelector("#advice").value;
const comment = document.querySelector("#comment").value;

const max = 500;
const min = 1;
const mysteryNumber = Math.floor(Math.random() * (max - min + 1)) + min;

console.log(mysteryNumber);

function isOk(){
    if(number == mysteryNumber){
        return true;
    } else {
        return false;
    }
}

//keyEvent enter