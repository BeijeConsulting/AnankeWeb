
var container = document.getElementById('containerTable');
var button = document.getElementById('buttonClick');
var buttonSubmit = document.getElementById('buttonSubmit');
createTable();

function createTable(){
    
    for(j=1;j<=5;j++){
        var row = document.createElement("div");
        row.setAttribute("class","row");
        row.setAttribute("id","row" +j);
        for(i=1;i<=30;i++){
    var div = document.createElement("div");
    div.setAttribute("id","container"+j +""+ i);
    var cell = document.createElement("input");
    cell.setAttribute("type","text");
    cell.setAttribute("name",j +""+ i);
    cell.setAttribute("placeholder",j +""+ i);
    div.appendChild(cell);
    
    row.appendChild(div)
}
container.appendChild(row);
console.log(row);

}
}

function getTable(){
if(container.style.visibility === 'collapse'){
    container.style.visibility = 'visible';
    buttonSubmit.style.visibility = 'visible';
    button.innerHTML= "Chiudi Tabella";

}else{
    container.style.visibility = 'collapse';
    buttonSubmit.style.visibility = 'collapse';
    button.innerHTML= "Apri Tabella";
}
}