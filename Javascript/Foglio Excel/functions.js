
var container = document.getElementById('containerTable');


createTable();
initFocus();

function createTable(){
    
    for(j=1;j<=5;j++){
        var row = document.createElement("div");
        row.setAttribute("class","row");
        row.setAttribute("id","row" +j);
        for(i=1;i<=30;i++){
    var div = document.createElement("div");
    div.setAttribute("id","container"+j +"x"+ i);
    var cell = document.createElement("input");
    cell.setAttribute("type","text");
    cell.setAttribute("id",j +"x"+ i);
    cell.setAttribute("name",j +"x"+ i);
    cell.setAttribute("placeholder",j +"x"+ i);
    div.appendChild(cell);
    
    row.appendChild(div)
}
container.appendChild(row);
console.log(row);
}
var input = document.getElementById('1x1').focus();
}

let a=1;
let b=1;
function initFocus(){
    document.getElementById(a + "x" + b).focus();
}

function moveInput(event){
    var x = event.keyCode;
    console.log(x);
    if(x === '37'){
        getElementById("")
    }
}

