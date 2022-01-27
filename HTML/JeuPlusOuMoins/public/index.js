//champs
const numberField = document.querySelector("#number");
const lastNumberField = document.querySelector("#lastNumber");
const trialNumberField = document.querySelector("#trial");
const adviceField = document.querySelector("#advice");
const commentField = document.querySelector("#comment");
const btnValidate = document.querySelector("#btnValider");
const btnReset = document.querySelector("#btnReset");

let counter =0;
let indexAdvice =0;
let advices = ["Tu pensais trouver du premier coup?", "La dichotomie tu connais ?", "Encore !!!", "Allez c'pas compliqué !", "Ca devient dur là...", "Je ne sais plus comment te conseiller"];


// chiffre mystère
const max = 500;
const min = 1;
const mysteryNumber = Math.floor(Math.random() * (max - min + 1)) + min;

console.log(mysteryNumber);

document.addEventListener("keypress", (e) => { 
    if(e.key == "Enter"){
        if(check()){
            play();
        }
    }
    //console.log(e.key)
});

btnValidate.addEventListener("click", () => {
    if(check()){
        play();
    } else {
        counter++;
        trialNumberField.value = counter;
        adviceField.value = "Cliquer c'est essayer même quand tu ne rentres pas de valeurs";
        commentField.value = "Faut rentrer un chiffre quand même !!!";
    }
  
});

btnReset.addEventListener("click", () => {
    numberField.value = "";
    trialNumberField.value = 0;
    adviceField.value = "";
    commentField.value = "C'est un peu de la triche non ?"
});

function check(){
    if(numberField.value.length ==0 || numberField.value == undefined || numberField.value == null){
        return false;
    } else {
        return true;
    }
}

function play(){
    lastNumberField.value = numberField.value;
    counter++;
    trialNumberField.value = counter;
    console.log(numberField.value);
    console.log(mysteryNumber);
    if(numberField.value == mysteryNumber){
        adviceField.value = "Rien à ajouter !"
        commentField.value = "Bravo ! Tu as trouvé en "+counter+" coups !";
    } else if(numberField.value < mysteryNumber) {
        
        adviceField.value = "Trop petit !"
        if(indexAdvice >= advices.length){
            commentField.value = "Sérieusement ?!";
        } else {
            commentField.value = advices[indexAdvice];
            indexAdvice++;
        }
        
    } else {
        adviceField.value = "Trop grand !"
        if(indexAdvice > advices.length){
            commentField.value = "Sérieusement ?!";
        } else {
            commentField.value = advices[indexAdvice];
            indexAdvice++;
        }
    }
}
