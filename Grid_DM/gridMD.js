let container = document.getElementsByClassName("container");
let counter = 0;
for(let i=0; i<5;i++)
{
    let row = document.createElement("div");
    row.setAttribute("class","row");
    row.setAttribute("id",i);
    container[0].appendChild(row);
    
    for(let j=0;j<30;j++)
    {
        let cell = document.createElement("div");
        cell.setAttribute("class","cell");
        cell.setAttribute("id", j);
        row.appendChild(cell);
        let text = document.createElement("input");
        text.setAttribute("class","inside");
        text.setAttribute("id","inside"+counter);
        text.setAttribute("type","text");
        text.setAttribute("value",counter+1);
        cell.appendChild(text);
        counter++;  
    }    
}