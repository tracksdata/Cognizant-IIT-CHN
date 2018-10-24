
function validateForm(form){
    
    var status=true;

    if(form.empId.value=="" || form.empId.value==" "){
      document.getElementById('empIdError').innerHTML='Employee id Must Be Provided';
        status=false;
    }else{
        document.getElementById('empIdError').innerHTML='';
    }

     
    if(form.empName.value=="" || form.empName.value==" "){
        document.getElementById('empNameError').innerHTML='Employee Name Must Be Provided';
         status=false;
      }else{
        document.getElementById('empNameError').innerHTML='';

      }

    return status;
}