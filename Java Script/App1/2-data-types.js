// Data types
// 1. primitives
// a. number
var num=78;
var n1=65.45;
//----------------------
// b. string
var s1='Praveen';
var s2="James";

//----------------------
// c. boolean 

var test=false;

//--------------
// d. undefined
var s3;

//-----------------------------------------

// 2. Reference / objects
var config = new Object()
config.url = "http://abc.com";
config.httpMethod = "GET";
config.post='http://xyz.com';

// with a literal style 

var emp={
    id:1024,
    name:'Praveen',
    age:76
}

emp.salary=45545;
var e1=emp;
e1.name='James';

//---------------------------------------------------

// c. Array / List

var menu = new Array();
menu.push("idly")
menu.push("poori")
menu[2] = "chapathi";

//--------------------------



var greet=function(){
    return 'Good Morning';
}

//var s1=greet();
//console.log(s1);

// 

var add=new Function("n1","n2","var r=n1+n2;return r;");

function add1(n1,n2 ){
    return n1+n2;
 }

 var add2=function(n1,n2){
     return n1+n2;
 }

 var add3=add2;
 var add4=add1(11,11);

















