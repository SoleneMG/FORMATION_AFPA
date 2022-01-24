$(document).ready(function(){
	var chaine ="";
	$("#categorie1").click(function (){
		if(chaine == ""){
		chaine =$("<div class='ligne'>"
						+"<div class='ligneLeft'>"
							+"<label for='sport'>Type Employé</label>"
						+"</div>"
						+"<div class='ligneRight'>"
							+"<select name='typeEmploye' id='sport'  class='validate[required]' >"
								+"<option value='option1'>Bibliothécaire</option>"
								+"<option value='option2'>Responsable</option>"
								+"<option value='option2'>Gestionnaire de fonds</option>"								
							+"</select></div></div>");

		chaine.insertAfter(".ligne:first");
		}
	});
	$("#categorie2").click(function (){
		$(".ligne:first").next().remove();
		chaine="";

	});
	$("#menuLivre").click(function(){
		$("#sousMenuLivre").toggle("slow");
	});
	
	$("#menuUtilisateur").click(function(){
		$("#sousMenuUtilisateur").toggle("slow");
	});

	$("#vincent").click(function(){
		$("#divRight").load("xml/vangogh/vangogh.html");
	});
	$("#cv").click(function(){
		$("#divRight").load("images/cv.html");
	});
	
	$("#demain").click(function(){
		$("#divRight").load("xml/demain/demain.html");;
	});
	$("#user").click(function(){
		$("#divRight").load("formulaire/AjouterUtilisateur.html #formID" );
	});
	
	/*
	$("#nom").blur(function(){+
		alert('ok');
		
		if(!$(this).val())// $(this).val() renvoi la valeur de l'input
			$(this).css("background-color","red");
		else{
			$(this).css("background-colo}r","white");
			chaine = $(this).value;
			alert(chaine);
		}
	})
	*/
	$(".simple").click(function(){
		/*  $("#contenu").empty();//empty supprime le contenu en gardant le conteneur #contenu */
		var contenu = $("#formID").empty();
		$("#formID").remove();
		if(contenu)
			contenu = null;
		
	});
	
});

