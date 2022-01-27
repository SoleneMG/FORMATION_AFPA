// complete the table init by HTML file
const table = document.querySelector('#trigonometricTable');
const PI = Math.PI;

for (let row = 0; row <= 90; row++) {
    let newTr = document.createElement('tr');
    for (let cell = 0; cell <= 3; cell++) {
        let newTd = document.createElement('td');
        switch (cell) {
            case 0:
                newTd.innerHTML = row;
                break;
            case 1:
                newTd.innerHTML = Math.sin(row*PI/180);
                break;
            case 2:
                newTd.innerHTML = Math.cos(row*PI/180);
                break;
            case 3:
                newTd.innerHTML = Math.tan(row*PI/180);
                break;
        }
        newTr.append(newTd);
    }

    table.append(newTr);
}


const webBrowserTable = document.querySelector('#webBrowserTable');
for (let row = 0; row < 5; row++) {

    let newTr = document.createElement('tr');
    let newTd = document.createElement('td');
   

    switch (row) {
        case 0:
           newTd.innerHTML = navigator.appName;//NavigatorID.appName; // nom
            break;
        case 1:
            newTd.innerHTML = navigator.appVersion; //NavigatorID.appVersion; //version
            break;
        case 2:
            newTd.innerHTML = navigator.appCodeName; //NavigatorID.appCodeName;
            break;
        case 3:
            newTd.innerHTML = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.99 Safari/537.36"; //NavigatorID.userAgent; // userAgent
            break;
        case 4:
            newTd.innerHTML = navigator.platform; //  NavigatorID.platform;
            break; 
    }
    newTr.append(newTd);
    webBrowserTable.append(newTr);
}
