//body
const body = document.querySelector("body");
const table = document.querySelector("table");
console.log(body);

// buttons
const btnRed = document.querySelector(".redBtn");
const btnGreen = document.querySelector(".greenBtn");
const btnBlue = document.querySelector(".blueBtn");
// input
const textRed =  document.querySelector("#red");
const textGreen =  document.querySelector("#green");
const textBlue =  document.querySelector("#blue");


btnRed.addEventListener("click", ()=> colorToRed());
btnGreen.addEventListener("click", ()=> colorToGreen());
btnBlue.addEventListener("click", ()=> colorToBlue());


textRed.addEventListener("change", ()=> changeColor());
textGreen.addEventListener("change", ()=> changeColor());
textBlue.addEventListener("change", ()=> changeColor());

function colorToRed(){
    body.style.background ="red"; 
    textRed.value = "FF";
    textGreen.value = "00";
    textBlue.value = "00";
}

function colorToGreen(){
    body.style.background ="green"; 
    textRed.value = "00";
    textGreen.value = "FF";
    textBlue.value = "00";
}

function colorToBlue(){
    body.style.background ="blue"; 
    textRed.value = "00";
    textGreen.value = "00";
    textBlue.value = "FF";
}

function changeColor(){
 
        body.style.background ="#"+textRed.value+textGreen.value+textBlue.value;
    /*
       if(textRed.value !="FF" && isNaN(textRed.value)
    || textGreen.value !="FF" && isNaN(textGreen.value)
    || textBlue.value !="FF" && isNaN(textBlue.value)
    ){
        alert("mauvaise entrée");
    } else {
        */
    
}
