$(document).ready(function(){
   
 $('.vacation').on('click','button',function(){
 var vacation = $(this).closest('.vacation');
 var amount = vacation.data('price');
 var ticket=$(`
                <p>
                Tickets:
                <input type='number' class='quantity' value='1' />
                <p>Total Price: <span id='total'>${amount}</span></p>
                </p>
            `)
//var amount = $(this).closest('.vacation').data('price');

var price =         $(`
                    <p>From &#8377;${amount} </p>
                    `);
   // var price = $('<p>From $399.99</p>');
   //$('.vacation').append(price);
   //$(this).after(price);
   vacation.append(price);
   vacation.append(ticket);
   //$(this).closest('.vacation').append(price);
   $(this).remove();
 }) ;  


 $('#filters').on('click','.onsale-filter',function(){
    
    $('.vacation').removeClass('bg-warning');
    $('.vacation').filter('.onsale').addClass('bg-success');
   

 })  
  
 $('#filters').on('click','.expiring-filter',function(){
    $('.vacation').removeClass('bg-success');
    $('.vacation').filter('.expiringsoon').addClass('bg-warning');
})  

// -----------

$('.vacation').on('keyup click', '.quantity', function() {
    // Get the price for this vacation
    // Get the quantity entered
    // Set the total to price * quantity
    var price = +$(this).closest('.vacation').data('price');
    var quantity = +$(this).val();
   // $('#total').text(price * quantity);
    $(this).parent().parent().find('#total').text(price * quantity);

});



});