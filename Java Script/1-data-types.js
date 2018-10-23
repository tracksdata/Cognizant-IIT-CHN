
//---------------------------------------------------
/*

  data types
  -----------

  1. simple / primitives   ==> values
        a. string
        b. number
        c. boolean
        d. undefined
  2. complex / references  ==> objects
 

*/

//---------------------------------------------------
// 1. simple / primitives   ==> values
//---------------------------------------------------

// 1. undefined

var v;

//---------------------------------------------------

// 2. string

var name = "Nag";
var selection = 'abc';
//var dynamicString = "the trainer - " + name;
// or // string interpolation ( es6 )
var dynamicString = `the trainer - ${name}`
var arithExpression = `the sum is : ${12 + 12}`

var multiLineString = `
    <div>
        <h1>${name}</h1>
    </div>
`;

//---------------------------------------------------

// 3. Number

var count = 12;
var cost = 12.12;

//---------------------------------------------------

// 4. boolean

var found = true;

/*
// imp-note:

    falsy values ==> false,0,"",null,udefined,NAN

    ref : https://dorey.github.io/JavaScript-Equality-Table/
*/


//---------------------------------------------------


//---------------------------------------------------
// 1. complex / reference   ==> objects
//---------------------------------------------------

// how to create object in .js-language?

/*
    syntax:
        var ref=new Constructor()

        imp-note:

        by default , all js-objects
        
        -  are extensible
        -  configurable

*/

var config = new Object()
config.url = "http://";
config.httpMethod = "GET";
config.onSuccess = function () {
    console.log('im running on success');
}
delete config.httpMethod;


//---------------------------------------------------
// literal-style objects
//---------------------------------------------------

// a. Object

var config = new Object()
config.url = "http://";
config.httpMethod = "GET";
config.onSuccess = function () {
    console.log('im running on success');
}

// or  ( literal-style )

var newConnfig = {
    url: 'http://',
    httpMethod: 'GET',
    onSuccess: function () {

    }
}

//---------------------------------------------------

// c. Array / List

var menu = new Array();
menu.push("idly")
menu.push("poori")
menu[2] = "chapathi";

// or literal style

var newMenu = ["item-1", "item-2", "item-3"];

//---------------------------------------------------

// c. RegExp

var adharPattern=new RegExp("\\d{4}-\\d{4}-\\d{4}");

// or literal-style

var newAdharPattern=/\d{4}-\d{4}-\d{4}/;


//---------------------------------------------------

// d. Function

var add=new Function("n1","n2","var r=n1+n2;return r;");

// or ( literal-style )

function add(n1,n2){
    var r=n1+n2;
    return r;
}


//---------------------------------------------------

// How to access obj's properties ?

/*

    way-1 : '.' notation
    way-2 : '[]' notation   if property name contains '-' or 'space' or starts with digit

*/

var person={
    name:'Nag',
    'home-address':'chennai',
    1:'one',
    100:'hundred..'
};

person.name="Nag N";
console.log(person.name);

person["home-address"]="bengalore";
console.log(person["home-address"]);
console.log(person[1])











