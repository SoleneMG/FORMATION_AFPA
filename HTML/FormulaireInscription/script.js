const answer = document.querySelector('#answer');
let paragraph = document.createElement('p');

function isEmpty(user){
    if(user.name != undefined && user.name != null && user.name.length != 0){
        return false;
    } else if(user.surname != undefined && user.surname != null && user.surname.length != 0){
        return false;
    } else if(user.age != undefined && user.age != null && user.age.length != 0){
        return false;
    }else if(user.sex != undefined && user.sex != null && user.sex.length != 0){
        return false;
    } else {
        return true;
    }
}

function isNumber(age){
    const regexExpressionForNumber = /^[0-9]+/;
    if(age.match(regexExpressionForNumber)){
        return true;
    } else {
        return false;
    }  
}


function validate(){
  
   class User{
        constructor(name, surname, age, sex){
            this.name = name;
            this.surname = surname;
            if(isNumber(age) == true && age <=130){
                this.age = age;
            } else {
                alert("L'âge n'est pas valide");
            }
            this.sex = sex;
        }
    }
    let name = document.getElementById('name').value;
    let surname = document.getElementById('surname').value;
    let age = document.getElementById('age').value;
    let sex = document.getElementById('woman').checked ? document.getElementById('woman').value : document.getElementById('man').value;

   let user = new User(name, surname, age, sex);

   if(isEmpty(user) == true){
       paragraph.innerHTML ="Bonjour l'inconnu";
       answer.append(paragraph);
       return false;
    } else {
        let startOfSalutation = sex == "Homme" ? "Bonjour cher" : "Bonjour chère";
        let salutation = surname+" "+name;
        paragraph.innerHTML =startOfSalutation+" "+salutation;
        answer.append(paragraph);
        return true;
    }
}

function submit(){
    if(validate() == true){
        document.theForm.submit();
    }
}





