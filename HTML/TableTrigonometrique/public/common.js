
function dateMaj() {
    frenchMonth = new Array("janvier", "février", "mars",
        "avril", "mai", "juin", "juillet",
        "aout", "septembre", "octobre",
        "novembre", "décembre");

    let dateModified = new Date(document.lastModified);
    let day = dateModified.getDate();
    let month = dateModified.getMonth();
    let year = dateModified.getFullYear();

    return "Dernière modification : " + day + " " + frenchMonth[month] + " " + year;
}

function footer() {
    const footer = document.querySelector('#footer');
    console.log(dateMaj());
    let paragraph1 = document.createElement('p');
    let a = document.createElement('a');
    a.textContent = "webMestre";
    a.href = "https://office.live.com/start/Outlook.aspx?omkt=fr%2DFR";
    
    paragraph1.innerHTML = "Pour toute question ou remarque concernant cette page, envoyer un email à ";
    paragraph1.append(a);
    let paragraph2 = document.createElement('p');
    paragraph2.innerHTML = dateMaj();
    footer.append(paragraph1);
    footer.append(paragraph2);
}

footer();

