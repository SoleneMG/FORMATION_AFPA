function validateForms()
{
	var elementsForms;
	
	if (!document.getElementsByTagName) return false;
	elementsForms = document.getElementsByTagName("form"); 
	for (var intCounter = 0; intCounter < elementsForms.length; intCounter++) 
	{ 
		return validateForm(elementsForms[intCounter]);
	} 
}
	
function validateForm(currentForm)
{
	var blnvalidate = true;
	var elementsInputs;
	
 	elementsInputs = currentForm.getElementsByTagName("input");
 
	for (var intCounter = 0; intCounter < elementsInputs.length; intCounter++)
	{
		if (elementsInputs[intCounter].className == "reqquestion")
		{
			if (validateText(elementsInputs, intCounter))
			{
				blnvalidate = false;
 				alert("You have not let us know what you think of the article");
			}
		}
		else if (elementsInputs[intCounter].className == "reqemail")
 		{
 			if (validateEmail(elementsInputs, intCounter))
			{
 				blnvalidate = false;
 				alert("Please insert a valid email");
			}
		}
	}
	return blnvalidate;
}

function validateEmail(elementsInputs, intCounter)
{
	var emailFilter=/^.+@.+\..{2,3}$/;
	if (!emailFilter.test(elementsInputs[intCounter].value)) 
	{ 
		return true; 
	} 
}
	
function validateText(elementsInputs, intCounter, strErrorMessage)
{
	if (elementsInputs[intCounter].value == "")
	{
		return true;
	}
}
function applyOnSubmitToForms()
{
	elementsForms = document.getElementsByTagName("form"); 
	for (var intCounter = 0; intCounter < elementsForms.length; intCounter++) 
	{ 
		elementsForms[intCounter].onsubmit = function ()
		{
			if (!validateForms())
			{
				return false;
			}
		}
	} 
}		
function addLoadEvent(func) 
{
 	var oldonload = window.onload;
	if (typeof window.onload != 'function') 
	{
		window.onload = func;
	} 
	else 
	{
		window.onload = function() 
		{
	      		oldonload();
	      		func();
	    	}
	}
}

addLoadEvent(applyOnSubmitToForms);