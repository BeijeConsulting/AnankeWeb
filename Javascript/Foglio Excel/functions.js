

var container = document.getElementById('containerTable');
var a=1;
var b=1;


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
    cell.setAttribute("onclick","getID("+j +"," +i+")");
    
    div.appendChild(cell);
    
    row.appendChild(div)
}
container.appendChild(row);
console.log(row);
}
var input = document.getElementById('1x1').focus();
}


function initFocus(){
    document.getElementById(a + "x" + b).focus();
}

function moveInput(event){
    
    var x = event.keyCode;
    console.log(x);
    if(x === 37){
       if(b != 1){
           b--;
       } else{
          if(a!=1){
              a--;
              b=30;
          } 
       }
        
    } else if(x === 38 && a != 1){
        a--;
        
    } else if( x === 39 || x === 13){
        if(b === 30){
            if(a != 5){
                a++;
                b=1;
            }
        }else{
            b++;
        }
    } else if(x === 40){
        if(a != 5){
            a++;
        }
    } 
    document.getElementById(a + "x" +b).focus();
}

function getID(j,i){
    a=j;
    b=i;
    document.getElementById(a + "x" +b).focus();
}

function validation(event){
    var enter = event.keyCode;
    if(enter === 13){
        event.preventDefault();
        return false;
    }
}

let form = document.getElementById('tabella');
function sendForm(){
    
    form.submit();
    
    return true;
}


function createCsv(){
    sendForm();
    var csv= new Array(5);
    for(i=1;i<=5;i++){
    for(j=1;j<=30;j++){
        let value= document.getElementById(i + "x" +j).value;
        
        console.log(value);
        if(!value){
            value="";
        }
        csv[i-1] += value + ",";
    }
}
let csvContent = "data:text/csv;charset=utf-8,";
for(j=0;j<5;j++){
    csvContent += csv[j] + "\n";
}
var encodedUri = encodeURI(csvContent);
var link = document.createElement("a");
link.setAttribute("href", encodedUri);
link.setAttribute("download", "excel.csv");
document.body.appendChild(link); // Required for FF

link.click();
}


