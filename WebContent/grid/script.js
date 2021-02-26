let griglia= document.getElementById("griglia");
      
const righe=5;
const colonne=30;

for(i=0;i<righe;i++){
    
    let row = document.createElement("div");
    row.setAttribute("class","row");
    row.setAttribute("id",i);
    griglia.appendChild(row);

    //griglia.innerHTML=griglia.innerHTML+"   <div class=\"row\">";

    for(j=0;j<colonne;j++){

        let cell = document.createElement("div");
        cell.setAttribute("class","column");
        cell.setAttribute("id", "inputRow"+i+"col"+j);
        row.appendChild(cell);
        let text = document.createElement("input");
        text.setAttribute("id", i + "-" + j);
        text.setAttribute("type","text");
        text.setAttribute("onclick", "changeFocus(this)");
        //text.setAttribute("onmouseover", "mouseOver(this)");
        //text.setAttribute("onmouseleave", "mouseLeave(this)");
        cell.appendChild(text);

        //griglia.innerHTML=griglia.innerHTML+"   <div id=\"inputRow"+i+"col"+j+"\" class=\"column\"> <input onclick = \"changeFocus(this)\" type=\"text\" name=\"inputRow"+i+"col"+j+"\" id=\""+i+"-"+j+"\"> </div> ";
    }

    griglia.innerHTML=griglia.innerHTML+"</div> ";
}

var elementFocus;

window.onload = function() {
                    elementFocus = document.getElementById('0-0');
                    elementFocus.focus();
                };

function changeFocus(element){

    elementFocus = element;
    
}

function moveFocus(){

    let key = window.event.keyCode;
    //console.log(key);
    let currentId = elementFocus.id;
    let row = parseInt(currentId.split('-')[0]);
    let column = parseInt(currentId.split('-')[1]);
    
    //vari if per i vari tasti

    //start
    if(key == '36'){
        column = 0;
    }
    //end
    if(key == '35'){
        column = colonne-1;
    }
    //left
    if(key == '37'){

        if(column === 0)
            column = colonne-1;
        else
            column = column-1;

    }
    //up
    if(key == '38'){

        if(row === 0)
            row = righe-1;
        else
            row = row-1;
            
    }
    //right
    if(key == '39'){

        if(column === colonne-1)
            column = 0;
        else
            column = column+1;

    }
    //down
    if(key == '40'){

        if(row === righe-1)
            row = 0;
        else
            row = row+1;
            
    }
    //enter & space
    if(key == '13' || key == '32'){

        if(column === colonne-1){
            column = 0;

            if(row === righe-1)
                row = 0;
            else
                row = row+1;
        }
            
        else
            column = column+1;
            
    }
    //pag up
    if(key == '33'){
        row = 0;
    }
    //pag down
    if(key == '34'){
        row = righe - 1;
    }

    elementFocus = document.getElementById(row + '-' + column);
    elementFocus.focus();

}

/*
function mouseOver(element){
    element.style.backgroundColor = 'red';
}

function mouseLeave(element){
    element.style.backgroundColor = 'white';
    element.style.background = 'none';
    element.style.border = 'auto';
}
*/
