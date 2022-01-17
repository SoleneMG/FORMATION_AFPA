/*
*  Autofill Function
*/
var bizdir_yourInfo_autofill = "Pour garder le contact";
var bizdir_companyInfo_autofill = "Information sur le site";

function bizdir_clearAutofill(id,type) {
	if(id == null || id == "" || type == null || type == "")
		return;
	var input = document.getElementById(id);
	if(input != null && type != null)
		switch(type) {
			case "YourInfo": if(input.value == bizdir_yourInfo_autofill) input.value = ""; input.style.color = "#000000"; break;
			case "CompanyInfo": if(input.value == bizdir_companyInfo_autofill) input.value = ""; input.style.color = "#000000"; break;
		}
}

function bizdir_populateAutofill() {
	var override = arguments[0] == true;
	var all_inputs = document.getElementsByTagName('input');
	for(var i=0;i<all_inputs.length;i++) {
		var input = all_inputs[i];
		switch(input.getAttribute('bizdir_autofill')) {
			case 'YourInfo': 
				if(override || input.value == bizdir_yourInfo_autofill || input.value == "" || input.value == null) {
					input.value = bizdir_yourInfo_autofill;
					input.style.color = "#999999"; 
				}
			break;
			case 'CompanyInfo':
				if(override || input.value == bizdir_companyInfo_autofill || input.value == "" || input.value == null) {
					input.value = bizdir_companyInfo_autofill;
					input.style.color = "#999999";
				}
			break;
		}
	}
	var all_textareas = document.getElementsByTagName('textarea');
	for(var i=0;i<all_textareas.length;i++) {
		var input = all_textareas[i];
		if(
		   	input.getAttribute('bizdir_autofill') == 'Description' && 
			(input.value == "" || input.value == null || input.value == bizdir_description_autofill || override)
		) {
			input.style.color = '#999999';
			input.value = bizdir_description_autofill;
		}
	}
}
/*
* ON LOAD
*/
function bizdir_onload() {
	bizdir_populateAutofill();
	var bizdir_submit = document.getElementById("bizdir_submit")
	if(bizdir_submit != null)
		bizdir_submit.disabled = false;
}

window.onload = bizdir_onload;
/*
*  HELPER FUNCTIONS
*/
function clearMessage() {
	var messages = document.getElementById('bizdir_messages');
	if(messages != null) {
		messages.className = '';
		messages.innerHTML = '';
	}
}