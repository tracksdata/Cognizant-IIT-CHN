"use strict";


/*
//--------------------------------------------------------------------
    how to define/create 'function' in .js-lang ?
//--------------------------------------------------------------------

     1. function-declaration

            => Named function
            => function-obj created at scope-creation phase
            => always get hoisted with function-obj

     2. function-expression

            => Anonymous function
            => function-obj created at scope-execution phase
            => not get hoisted with function-obj

//--------------------------------------------------------------------
*/

//-------------------------------------------------------------------------
// 1. function-declaration
//--------------------------------------------------------------------

// console.log(add(12,13))

// function add(n1,n2){
//     return n1+n2;
// }

// console.log(add(12,13))

//-------------------------------------------------------------------------
// 2. function-expression
//--------------------------------------------------------------------

// console.log(add(12,13)) // error

// let add=function(n1,n2){
//     return n1+n2;
// }
// console.log(add(12,13))

//-------------------------------------------------------------------------

// e.g
// let userType;
// let userAction;

// function login(){
//     //...
//     userType="admin"; // guest
// }
// login();

// if(userType==="admin"){
//     userAction=function(){
//         console.log('admin-user-action');
//     }
// }
// if(userType==="guest"){
//     userAction=function(){
//         console.log('guest-user-action');
//     }
// }


//-------------------------------------------------------------------------
// function with params
//--------------------------------------------------------------------

// imp-note : function params are optional in .js-language


// function func(a){
//     console.log(a);
//     console.dir(arguments)
// }
// func()

// e.g

// function sum(){
//     let i=0,
//         len=arguments.length,
//         result=0;
//     while(i<len){
//         result+=arguments[i];
//         i++;
//     }    
//     return result;
// }


//--------------------------------------------------------------------
// Quiz
//--------------------------------------------------------------------

// can we overload function by params in .js-lang ?   No

// function getFood() {
//     return "No Food";
// }
// function getFood(pay) {
//     if (arguments.length === 0) return "No Food";
//     return "Biryani";
// }
// console.log(getFood());


//--------------------------------------------------------------------
// function with default params ( es6 )
//--------------------------------------------------------------------

// function func(a=1, b=2) {

//     // if (!a) a = 1
//     // if (!b) b = 2

//     // or

//     // a = a || 1;
//     // b = b || 2;

//     console.log(a);
//     console.log(b);
// }
// func(undefined, 20);

//--------------------------------------------------------------------
// function with rest-param ( es6 )
//--------------------------------------------------------------------

// function func(a, b, ...rest) {
//     console.log(a);
//     console.log(b);
//     console.log(rest);
//     console.log(Array.isArray(rest));
// }
// func(10, 20, 30, 40, 50, 60)


//--------------------------------------------------------------------
// FP - principles
//--------------------------------------------------------------------
/*
Functions as Values/objects

    STORE functions in variables
    PASS functions in parameters
    RETURN functions from other functions

*/
//--------------------------------------------------------------------
// STORE functions in variables
//--------------------------------------------------------------------

// function greet(){
//     console.log('hello..');
// }

//let sayHello=greet;
// sayHello();

//--------------------------------------------------------------------
// PASS functions in parameters
//--------------------------------------------------------------------

// function greet(f) {
//     if (f) { f(); return }
//     console.log('Hello...');
// }

// greet();

// let kaGreet=function(){console.log('Namaskara..')}
// greet(kaGreet)

// greet(function(){console.log('Ola..')});


// e.g

// let nums = [1, 3, 5, 7, 9, 2, 4, 6, 8, 10]
// nums.sort();
// nums.sort(function (a, b) { return a - b; });

//------------------------------------------------------------
// RETURN functions from other functions
//------------------------------------------------------------


// function teach() {
//     console.log('teaching....');
//     let learn = function () {
//         console.log('learning...');
//     }
//     // learn();
//     console.log('teaching ends..');
//     return learn;
// }

// let learnFunc = teach();
// learnFunc();
// learnFunc();

//------------------------------------------------------------

// closure(s)

/*

A closure is a function having access to the parent scope,
even after the parent function has closed.

*/

//------------------------------------------------------------

// function doTeach(sub) {
//     console.log(`teaching ${sub}`)
//     let notes = `${sub + "-notes"}`
//     let fun='bla bla';
//     function doLearn() {
//         console.log(`learning with ${notes}`)
//     }
//     //doLearn();
//     console.log('teaching ends...');
//     return doLearn;
// }

// let doLearnFunc=doTeach('.js'); // teach-scope
// doLearnFunc();

//------------------------------------------------------------

/*

    why/where we need closures ?

        - to abstract public-behav of any js-module
        - while executing func async, to access parent scope

*/

//------------------------------------------------------------

// / use:1 - to abstract public-behav of any js-module

/*
    e.g counter module
        - count
        - doCount()
        - getCount()

*/

// self-executable function pattern / IIFE ( Imme.. Invok.. Func.. Exp..) 

// const counter=(function() {
//     var count = 0; // private
//     function doCount() {
//         count++;
//     }
//     function getCount() {
//         return count;
//     }
//     return {
//         inc: doCount,
//         get: getCount
//     }
// })();


//---------------------------------------------------------------

/// Ex.

// var myFunctions = [];
// //----------------------------
// function getF(i) {
//     var f = function () { console.log(i) }
//     return f;
// }
// for (var i = 0; i < 2; i++) {
//     //myFunctions.push(getF(i))
//     myFunctions.push((function (i) { return function () { console.log(i) } })(i))
// }
// //------------------------------
// myFunctions[0]();
// myFunctions[1]();



//---------------------------------------------------------------
// Function-binding  i.e binding/invoking function by an objects
//---------------------------------------------------------------

/*

    a. static function-binding
    b. dynamic function-binding


*/

//---------------------------------------------------------------
// a. static function-binding
//---------------------------------------------------------------

// let p1={
//     name:'Nag',
//     sayName:function(){
//         console.log('im '+this.name);
//     }
// };

// let p2={
//     name:'Kishore',
//     sayName:function(){
//         console.log('im '+this.name);
//     }
// };

// or (better code)

// function sayNameForAll() {
//     console.log('im ' + this.name);
// }

// let p1 = {
//     name: 'Nag',
//     sayName: sayNameForAll
// };

// let p2 = {
//     name: 'Kishore',
//     sayName: sayNameForAll
// };

// //sayNameForAll(); // error i.e function not bound to any object
// p1.sayName(); // Im Nag
// p2.sayName(); // Im Kishore


//-----------------------------------------------------------------------

// Quiz

// // let pName = "global-scope";
// let person = {
//     pName: 'Nag', // obj's data
//     sayName: function () {
//         let pName = "local-scope";
//         console.log('im ' + pName)
//         console.log('im ' + person.pName);
//         console.log('im ' + this.pName)
//     }
// }
// // person.sayName();

// let oldPerson = person;
// person = { pName: "Ria" }
// oldPerson.sayName();


//-----------------------------------------------------------------------



//---------------------------------------------------------------
// b. dynamic function-binding
//---------------------------------------------------------------

let p = { name: 'Nag' }
let e = { name: 'wissen' }

let greetLib = {
    name: 'greet-lib',
    sayName: function (message, from) {
        console.log(message + ' im ' + this.name + " : " + from);
    }
};


// way-1 : call()
// greetLib.sayName.call(p, "hello","chennai");
// greetLib.sayName.call(e, "hey","bengalore");
// console.log()

// //way-2 : apply()
// greetLib.sayName.apply(p, ["hello","chennai"]);
// greetLib.sayName.apply(e, ["hey","bengalore"]);

//way-3 : bind()
// let personSayNameFunc=greetLib.sayName.bind(p,"hello","chennai");
// personSayNameFunc();
// personSayNameFunc();
// let empSayNameFunc=greetLib.sayName.bind(e,'dude');
// empSayNameFunc('BLR')
// empSayNameFunc('PNQ')


//----------------------------------------------------------------


// summary on function-binding


// function func() {
//     console.log(this);
// }
// func();

// let o1 = { name: 'O1', f: func } // static function-binding
// o1.f()

// let o2 = { name: 'O2' }
// func.call(o2)
// func.apply(o2);
// func.bind(o2)()


//----------------------------------------------------------------

// Quiz

// // Model
// let tnr = { name: 'Nag' }

// // Tng-service
// let nexwaveService = {
//     doTraining: function () {
//         console.log(this.name + " giving training...")
//     }
// }

// // View
// let tng=nexwaveService.doTraining.bind(tnr);
// tng();
// tng();


//--------------------------------------------------------------------

// Quiz

let e1 = { name: 'E1' }
let e2 = { name: 'E2' }

let tnr = {
    name: 'Nag',
    doTeach: function () {
        console.log(this.name + " teaching .js");
        let notes = ".js-notes";
        let self=this;
        let doLearn = function () {
            console.log(this.name + '-learning with ' + notes + " from " + self.name);
        }
        console.log('teaching ends..');
        return doLearn;
    }
}

//week-1
let doLearnFunc = tnr.doTeach();
doLearnFunc.call(e1);
doLearnFunc.call(e2);

//week-2
let newTnr={name:'kishore'}
doLearnFunc=tnr.doTeach.call(newTnr);
doLearnFunc.call(e1);
doLearnFunc.call(e2);

//---------------------------------------------------------------------------------

