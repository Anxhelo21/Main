
let id = $("input[name*='id']")
id.attr("readonly","readonly");


$(".btnedit").click( e =>{
    let textvalues = displayData(e);

    ;
    let Name = $("input[name*='Name']");
    let Surname = $("input[name*='Surname']");
    let Email = $("input[name*='Email']");
    let Password = $("input[name*='Password']");

    id.val(textvalues[0]);
    Name.val(textvalues[1]);
    Surname.val(textvalues[2]);
    Email.val(textvalues[3]);
    Password.val(textvalues[4]);
});


function displayData(e) {
    let id = 0;
    const td = $("#tbody tr td");
    let textvalues = [];

    for (const value of td){
        if(value.dataset.id == e.target.dataset.id){
           textvalues[id++] = value.textContent;
        }
    }
    return textvalues;

}