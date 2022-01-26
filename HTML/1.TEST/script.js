// eval(string) -> eval("x=10;y=20;console.log(x*y);");
// isNaN(x) Méthode qui retourne true si le paramètre x n’est pas un nombre.

// var getCalculeSurface = function (largeur, hauteur) {
// return largeur * hauteur;
// }; 

/*  var getCoucou = coucou;
    function coucou() { alert("coucou !"); }
    getCoucou(); // affiche "coucou !" dans une boîte de dialogue


 ->   var id = setTimeout(fct1, temps) : crée un timer qui appelle la fonction
    fct1() après le temps écoulé (en milliseconde).
 ->   var id = setInterval(fct2, temps) : crée un timer qui répète l’appel de la
    fonction fct2() à toutes les intervalles de temps (en milliseconde). 

    clearTimeout(id) qui arrête le timer avant l’expiration du délai fixé.
    clearInterval(id) qui arrête le timer avant le prochain appel de la fonction. 

    var i = 9;
    var decompte = setInterval(function() {
    console.log(i--); // décompte de 10 à 1
    }, 1000); // se lance toutes les secondes

    var temps = 10;
    setInterval(function() {
    (function(duree) {
    console.log(duree);}(temps--));
    }, 1000); 

    var minuteur = setTimeout(function() {
    var d = new Date();
    var date = d.getHours() + ":" + d.getMinutes();
    alert("Après 10 secondes, il est " + date);
    clearInterval(decompte); // stoppe le décompte
    }, 10000); // se lance après 10 secondes

    EVENEMENTS
    var btn = document.getElementById("btn1");
    btn.addEventListener("click", function(e) { … }, false); 

    CONCATENATION
    "string" $variable "string"

*/