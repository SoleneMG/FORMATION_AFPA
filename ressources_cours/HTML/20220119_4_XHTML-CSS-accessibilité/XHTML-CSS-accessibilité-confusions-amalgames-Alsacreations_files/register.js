
/* Ajax Powa */

$(document).ready(function(){

	/* Verification pseudo existant lors de l'inscription */

	$("#register #name").keyup(function(event) {
		if($(this).attr("value").length>2) {
			$("#register #validation-login-exists").load("/ident/login_exists/",{name:$(this).attr("value")});
		} else {
			$("#register #validation-login-exists").empty("");
		}
	});

});

