 let tratto = "___";
        let risultato = '';
        let display = document.getElementById("operazioni");
        let answer;
        let count = 0;
        function get(valore) {
            let inner = valore.value;
            let temp;
            let operators = new RegExp("[+-/*%]");
            

            if(operators.test(inner) && inner != '.') {
                count++;
            }
            console.log('count:', count);
                
            if((typeof risultato === 'number' && /[0-9]/.test(inner)) || risultato == "___") {
                console.log('primo if');
                risultato = inner;
                display.value = risultato;
            } else if(operators.test(risultato.toString().charAt(risultato.length-1)) && operators.test(inner))	{
                console.log('secondo if');
                console.log('ciao:', typeof risultato);
                risultato = risultato;
            } else {
                console.log('else');
                if(count == 2) {
                    console.log('if sul count');
                    risultato = eval(risultato).toString();
                    display.value = risultato;
                    count--;
                }
                risultato += inner;
                display.value = risultato;
                console.log(risultato);
            }
        }
        function result() {
            risultato = eval(display.value);
            console.log(typeof risultato);
            display.value = eval(display.value);
            answer = risultato;
        }

        function ac() {
            display.value = (risultato = tratto);
        }

        function canc() {
            display.value = (risultato = risultato.substring(0,risultato.length-1));
        }

        function ans() {
            display.value+=answer;
        }
