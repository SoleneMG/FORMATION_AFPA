const surname = document.querySelector("#surname");
const firstname = document.querySelector("#firstname");
const age = document.querySelector("#age");
const sex = document.querySelectorAll(".sex");
const form = document.querySelector(".form");
const cmdReset = document.querySelector(".reset");
const cmdValidate = document.querySelector(".valid");
const cmdprefill = document.querySelector(".prefill");
const cmdsendWithoutCheck = document.querySelector(".sendWithoutCheck");
let sexSelected = "Indéfini";
console.log(document.getElementsByName("sex")[0].value);
console.log(document.getElementById("Homme"));

//Reset
cmdReset.addEventListener("click", () => {
    for (let i = 0; i < 4; i++) {
        form[i].value = "";
    }
    surname.focus();
    sex[0].checked = "false";
});

//Pré-remplir
cmdprefill.addEventListener("click", () => {
    let informations = ["MonNom", "MonPrénom", "30"]
    for (let i = 0; i < 3; i++) {
        form[i].value = informations[i];
    }
    document.getElementById("Homme").checked = true;
    document.getElementById("Femme").checked = false;
    console.log(document.getElementsByName("sex")[0].value);
    console.log(document.getElementById("Homme"));
    
});

// Valider
cmdValidate.addEventListener("click", () => {
    getSex();
    console.log(sexSelected);
    if(checkSex(getSex) && checkAge() && isNotEmpty(surname) && isNotEmpty(firstname) && isNotEmpty(age)) {
        form.submit();
         
    } else {
        alert("Saisies incorrectes ou erronnées")
    } 
});

function isNotEmpty(variable) {
    if(variable.value == null || variable.value.length == "0" || variable.value == undefined) {
        return false;
    } else {
        return true;
    }
}

function checkSex(sex) {
    if(sex == "Indéfini"){
        return false;
    } else {
        return true;
    }
}

function getSex(){
    sexSelected = document.querySelector('input[name="sex"]:checked').value;
}

function checkAge(){
    if(!(isNaN(age.value))){
        if(age.value > 130 || age.value < 0){
            alert("âge incorrect");
            return false;
        } else {
            return true;
        }
    } else {
        return false;
    }
  
}
