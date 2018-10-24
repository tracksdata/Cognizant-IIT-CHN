/*
function doTeach(){
    console.log('-- Teaching Java ');
   
    function doLearn(){
        console.log('-- Learning Java')
    }

   return doLearn; // <--- doTeach

}

let learn=doTeach(); // <-- global
learn();
learn();
learn();




var person={
   name:'James',
    sayName:function(name){
        console.log('Name is '+this.name);
    }
}


let p1={name:'Praveen'};
let p2={name:'Ria'};

person.sayName.call(p1);
person.sayName.call(p2);

*/
//let p1=person;
//p1.name='Ria';
//p1.sayName();

// Dynamic Binding
/*
    3 ways 
    ----------
    a. call
    b. apply
    c. bind

*/



function doTeach(){
    
    function doLearn(sub,from){
        console.log('Learning '+sub+' from '+this.name+' from '+from);
    }
    return doLearn;
}


let p1={name:'Praveen'};

let p2={name:'Ria'};

//doTeach.call(p1,'Java','Jan 1st');
//doTeach.call(p2);

learn=doTeach();
//learn.call(p1,'Java','Jan 1st');
//learn.call(p2,'Spring','Dec 1st');

//learn.apply(p1,['Java','Feb 2nd']);

//learn.bind(p1);

// Constructor Invocation

function Employee(name,age){
    this.name=name;
    this.age=age;

    this.sayName=function(){
        console.log('Name is '+this.name);
    }

    this.sayAge=function(){
        console.log('Age is '+this.age);
    }
}

//let e1=new Employee('Praveen',12);
//let e2=new Employee('James',123);

//e1.sayName();
//e1.sayAge();

//e2.sayName();
//e2.sayAge();

//---------------------------------------

function startSession(){

    function Employee(name){
        this.name=name;
    }

    function Trainer(name){
        this.name=name;
    }

    doTeach=function(sub){
        console.log(this.name+' is teaching '+sub);
        let self=this;
       // console.dir(self);
        console.log('-- Teachig Ends..');
        
        doLearn=function(){
            //console.dir(this);
        let notes=this.sub+' Notes';
        
        console.log(this.name+' is learning '+sub+' from '+self.name);
    }
    return doLearn;
    
    }
let e1=new Employee('A');
let e2=new Employee('B');
let trainer=new Trainer('Praveen');

let trainByPraveen=doTeach.bind(trainer);
let learn=trainByPraveen('Java');

learn.call(e1);
learn.call(e2);

}
startSession();










