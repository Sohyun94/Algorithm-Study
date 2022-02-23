let pickButton = document.querySelectorAll(".pickButton");

pickButton.forEach(function(element){
    element.addEventListener("click", handler);
})

function handler(){
    let id = this.id + "Info";
    console.log(document.getElementById(id).innerText);
}