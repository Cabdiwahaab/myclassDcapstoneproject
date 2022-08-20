
function validate(){
    const password = document.getElementById("form3Example4cd").value;

    const a = document.getElementById('e');
    const b = document.getElementById('f');
    const c = document.getElementById('');g
  

    if ( password.match("[A-Z]")){
        a.style.color = 'green'
    } else {
        a.style.color = 'red'
    }

    if ( password.match("[a-z]")){
        b.style.color = 'green'
    } else {
        b.style.color = 'red'
    }
    
    if ( password.match("[@#!%&]")){
        c.style.color = 'green'
    } else {
        c.style.color = 'red'
    }
    
    
    if ( password.match(/[0-9]/)){
    numb.style.color = 'green'
    } else {
        numb.style.color = 'red'
    }
}