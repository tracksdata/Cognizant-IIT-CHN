$(document).ready(function(){
   
 $('button').on('click',function(){
    var price = $('<p>From $399.99</p>');
   //$('.vacation').append(price);
   //$(this).after(price);
   $(this).closest('.vacation').append(price);
   $(this).remove();
 }) ;  


   
  


});