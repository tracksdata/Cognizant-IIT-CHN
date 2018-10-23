//"use strict"


/*

 execution context/scope

//-----------------------------------------------------------------
    memory/stack-frame with given args & local-vars 
    to execute instructions in seq.
//-----------------------------------------------------------------
    phase-1 : creation / push

                => any variable declared with 'var' keyword 
                   anywhere in scope, always get hoisted 
                   to top with default value ( undefined)

    phase-2 : excution / pop

                => instructions executes in seq.
    
//-----------------------------------------------------------------

    imp-point
    
                => every .js-runtime by default has one global-scope  & global-object

                => global-scope always executed by global-object

                   global-object

                    browser-envi ==> window
                    Node.js      ==> process
                    

                => every function invocation also creates new-scope,
                   which is child of in-which scope that function declared/created
                
//-----------------------------------------------------------------

*/


//-----------------------------------------------------------------

// var v=12;
// console.log(v);

//-----------------------------------------------------------------

// var v=12;
// function f1(){
//     console.log(v);
//     var v=13;
// }
// f1();  // f1-scope  <--  global-scope


//-----------------------------------------------------------------


// Quiz

// var v = 12;
// function f1() {
//     function f2() {
//         console.log(v);
//     }
//     f2(); // f2-scope <-- f1-scope
//     var v = 13;
// }
// f1();  // f1-scope <- global-scope

//-----------------------------------------------------------------

// var v=12;
// var v=13;

//-----------------------------------------------------------------

// var v = 100;
// if (true) {
//     var v = 200;
// }
// console.log(v);

//-----------------------------------------------------------------

// problems with 'var' keyword ?

/*
    ==> variables always get hoist
    ==> we can re-declare same variable within scope
    ==> No block-scope

*/


// soln : using 'let' & 'const' keywords  with block-scope ( from ES6 )



//-----------------------------------------------------------------

// Soln-1 :

// console.log(v);
// let v=12;

//-----------------------------------------------------------------

// Soln-2 :

// var v = 12;
// let v = 13;

//-----------------------------------------------------------------

// Soln-3 :

// let v=100;
// if(true){
//     let v=200;
// }
// console.log(v);

//-----------------------------------------------------------------


// Soln-4

// const trainer={
//     name:'Nag'
// }
// // trainer=null; // error
// trainer.name="Kishore";

//----------------------------------------------------------------

// summary


    // use 'let' keyword  for mutable reference
    // use 'const' keyword  for immutable reference

    // best-practice : avoid using 'var' keyword


//----------------------------------------------------------------



// Quiz

// function func(){
//     i=100;
// }

// func();  // error in 'strict' mode

// console.log(i);


