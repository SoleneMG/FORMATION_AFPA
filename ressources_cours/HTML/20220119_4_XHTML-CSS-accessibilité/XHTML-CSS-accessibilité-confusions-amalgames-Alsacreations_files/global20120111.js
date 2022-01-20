
/*
   Alsacreations.com Script Global 2011-11-07
   @author Dew
*/

$(document).ready(function(){

	// Evitement
	$("#evitement a").focus(function() {
		$(this).closest("#evitement").addClass("focused");
	});
	
	var oldcr = false;
	// Placeholder sur la recherche
	/*
	$("#recherche-texte").focus(function(event) {
		if(!oldcr) oldcr = $(this).css("color");
		if($(this).val()=="recherche") $(this).attr("value","").css("color","#fff");
	});
	$("#recherche-texte").blur(function(event) {
		if($(this).val()=="" || $(this).val()=="recherche") {
			$(this).css("color",oldcr);
			$(this).val("recherche");}
	});
	*/

	// Reply
	$(".commentaire-repondre").click(function(event) {
		if($("#commentaire").val()) $("#commentaire").val($("#commentaire").val()+"\n");
		$("#commentaire").val($("#commentaire").val()+'@'+$(this).attr("title")+' : ');
		$("#commentaire").focus();
		return false;
	});

	// Notif
	$("#notif-close").click(function(event) {
		$("#notif").slideUp();
		document.cookie='hidenotif=1';
	});
  
	// Twitter
	$("#twitadd").click(function(event) {
		$(this).hide(500);
		$("#twitinput").slideDown(500);
	});
  
	$('#twitinput textarea').keyup(function() {
		var charLength = 140-($(this).val().length);
		if($(this).val().length > 140) $('#twitinput #twitchars').html('<span style="color:red">'+charLength+'</span>'); 
		else $('#twitinput #twitchars').html(charLength);
	});

});

