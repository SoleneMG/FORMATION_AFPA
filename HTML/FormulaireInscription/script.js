function validate(){
  
    let paragraph = document.createElement('p');

    class User{
        constructor(name, surname, age, sex){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }
    }
    let name = document.getElementById('name').value;
    let surname = document.getElementById('surname').value;
    let age = document.getElementById('age').value;
    let sex = document.getElementById('woman').checked ? document.getElementById('woman').value : document.getElementById('man').value;

    let user = new User(name, surname, age, sex);
    console.log(user.name+" "+user.age);
    paragraph.createTextNode = "bonjour";
   /* if(user.isEmpty == true){
       paragraph.innerHTML ="Bonjour l'inconnu";
    } else {
        let startOfSalutation = sex == "Homme" ? "Bonjour cher" : "Bonjour chère";
        let salutation = surname+" "+name;
        paragraph.innerHTML =startOfSalutation+" "+salutation;
    } */
    const answer = document.querySelector('#answer');
    answer.append(paragraph);


}

function isEmpty(){
    if(user.name.length == 0 || user.name == null){
        return true;
    } else if(user.surname.length == 0 || user.surname == null){
        return true;
    } else if(user.age.length == 0 || user.age == null ){
        return true;
    }else if(user.sex.length == 0 || user.sex == null){
        return true;
    } else {
        return false;
    }

}

validate();