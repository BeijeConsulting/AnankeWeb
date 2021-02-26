


var a=0;
var b=0;



initFocus();



function initFocus(){
    console.log(a,b);
    document.getElementById("inputRow"+a+"col"+b).focus();
}

function moveInput(event){
    
    var x = event.keyCode;
    console.log(x);
    if(x === 37){
       if(b != 0){
           b--;
       } else{
          if(a!=0){
              a--;
              b=30;
          } 
       }
        
    } else if(x === 38 && a != 0){
        a--;
        
    } else if( x === 39 || x === 13){
        if(b === 30){
            if(a != 4){
                a++;
                b=0;
            }
        }else{
            b++;
        }
    } else if(x === 40){
        if(a != 4){
            a++;
        }
    } 
    document.getElementById("inputRow"+a+"col"+b).focus();
}

function getID(j,i){
    a=j;
    b=i;
    document.getElementById("inputRow"+a+"col"+b).focus();
}

function validation(event){
    var enter = event.keyCode;
    if(enter === 13){
        event.preventDefault();
        return false;
    }
}


