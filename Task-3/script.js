// QUESTION 1 :-

// Que 1 :- create an object in three different ways:
// 1. Using object literal
// 2. By creating instance of Object directly
// 3. By using constructor function


// 1. Using object literal
const person = {
    name: 'Nilesh',
    age: 21,
    hobbies: ['Programming','Riding','Playing'],
    greet: function(){
        console.log('Hello Everyone');
    },
    score: {
        AI: 90,
        ML: 95
    }
};
console.log(typeof person);
console.log(person.name);
console.log(person.hobbies[2]);
person.greet();
console.log(person.score.ML);



// 2. By creating instance of Object directly
const person = new Object({
    name: 'Nilesh',
    age: 21,
    hobbies: ['Programming','Riding','Playing'],
    greet: function(){
        console.log('Hello Everyone');
    },
    score: {
        AI: 90,
        ML: 95
    }
});
console.log(typeof person);
console.log(person.name);
console.log(person.hobbies[1]);
person.greet();
console.log(person.score.AI);



// 3. By using constructor function
function Person() {
    this.name = 'Nilesh',
    this.age = 20,
    this.hobbies = ['Programming','Riding','Playing'],
    this.greet = function(){
        console.log('Hello Everyone');
    },
    this.score = {
        AI:90,
        ML:95
    }
}
const person = new Person();
console.log(typeof person);
console.log(person.name);
console.log(person.hobbies[0]);
person.greet();
console.log(person.score.AI)




// *************************************************************************************************************************************************


// QUESTION 2 :-


// Que 2 :- What is a prototype chain
class Vehicle {
    constructor(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    start() {
        console.log('Starting ${this.make} ${this.model} ${this.year}.');
    }
}
class Car extends Vehicle {
    drive() {
        console.log('Driving ${this.make} ${this.model} ${this.year}.');
    }
}
const car = new Car('Honda','Civic',2023);
car.start();
car.drive();




// *****************************************************************************************************************************************************


// QUESTION 3 :-


// Que 3 :- What is the difference between Call, Apply and Bind
// Call
function greet(greeting) {
    console.log(greeting + ' ' + this.name);
}
const person1 = { name: 'Nilesh' };
greet.call(person1, 'Hello'); 

// Apply
function sum(a, b, c) {
    console.log(this.num + a + b + c);
}
const numbers = { num: 10 };
sum.apply(numbers, [1, 2, 3]); 

// Bind
function saySomething(something) {
    console.log(this.prefix + ' ' + something);
}
const context = { prefix: 'I say:' };
const boundSaySomething = saySomething.bind(context);
boundSaySomething('Hello'); 


// **********************************************************************************************************************************************************************


// QUESTION 4 :-

// Parsing JSON
let jsonString1 = '{"name": "Nilesh", "age": 21}';
let jsonObject1 = JSON.parse(jsonString1);
console.log(jsonObject1.name); 
console.log(jsonObject1.age);  

// Stringifying JavaScript Object
let person = { name: 'Nilesh', age: 21 };
let jsonString2 = JSON.stringify(person);
console.log(jsonString2);

// Accessing JSON Data
let jsonObject2 = { name: 'Nilesh', age: 21 };
console.log(jsonObject2.name); 
console.log(jsonObject2.age);  

// Modifying JSON Data
let jsonObject3 = { name: 'Nilesh', age: 21 };
jsonObject3.age = 22;
console.log(jsonObject3.age); 

// Iterating Over JSON Object
let jsonObject4 = { name: 'Nilesh', age: 21 };
for (let key in jsonObject4) {
    console.log(key + ': ' + jsonObject4[key]);
}

// Checking Property Existence
let jsonObject5 = { name: 'Nilesh', age: 21 };
if ('name' in jsonObject5) {
    console.log('Name property exists');
}


// ***************************************************************************************************************************************************


// QUESTION 5 :-


// JavaScript slice() method
let languages = ["JavaScript", "Python", "C", "C++", "Java"];
let new_arr = languages.slice();
console.log(new_arr); // Output: ["JavaScript", "Python", "C", "C++", "Java"]

let new_arr1 = languages.slice(2);
console.log(new_arr1); // Output: ["C", "C++", "Java"]

let new_arr2 = languages.slice(1, 4);
console.log(new_arr2); // Output: ["Python", "C", "C++"]

// JavaScript slice() with Negative index
const languages2 = ["JavaScript", "Python", "C", "C++", "Java"];
let new_arr3 = languages2.slice(0, -1);
console.log(new_arr3); // Output: ["JavaScript", "Python", "C", "C++"]

let new_arr4 = languages2.slice(-3);
console.log(new_arr4); // Output: ["C", "C++", "Java"]

// JavaScript slice() with Objects as Array Elements
let human = {
    name: "Nilesh",
    age: 21,
};
let arr = [Object.assign({}, human), "Nepal", "Manager"];
let new_arr5 = arr.slice();
console.log(arr[0]); 
new_arr5[0].name = "Akash";
console.log(arr[0]);



//   ***********************************************************************************************************************************************


// QUESTION 6 :-


// Que 6 :- JavaScript splice() method

// Using splice() method
let languages = ["JavaScript", "Python", "Java", "Lua"];
let removed = languages.splice(2, 2, "C", "C++");
console.log(removed); // Output: ["Java", "Lua"]
console.log(languages); // Output: ["JavaScript", "Python", "C", "C++"]

let removed1 = languages.splice(1, 0, "Java", "Lua");
console.log(removed1); // Output: []
console.log(languages); // Output: ["JavaScript", "Java", "Lua", "Python", "C", "C++"]

let removed2 = languages.splice(2, 3);
console.log(removed2); // Output: ["Lua", "Python", "C"]
console.log(languages); // Output: ["JavaScript", "Java", "C++"]

// Using splice() method for different deleteCount values
let languages2 = ["JavaScript", "Python", "Java", "Lua"];
let removed3 = languages2.splice(5, 2, "C++");
console.log(removed3); // Output: []
console.log(languages2); // Output: ["JavaScript", "Python", "Java", "Lua", "C++"]

let removed4 = languages2.splice(-1, 1, "Swift", "Scala", "Go");
console.log(removed4); // Output: ["C++"]
console.log(languages2); // Output: ["JavaScript", "Python", "Java", "Lua", "Swift", "Scala", "Go"]

// Using splice() method for different start values
let languages3 = ["JavaScript", "Python", "Java", "Lua"];
let removed5 = languages3.splice(1);
console.log(removed5); // Output: ["Python", "Java", "Lua"]
console.log(languages3); // Output: ["JavaScript"]

let removed6 = languages3.splice(1, -2, "Swift", "Scala", "Go");
console.log(removed6); // Output: []
console.log(languages3); // Output: ["JavaScript", "Swift", "Scala", "Go"]



// *******************************************************************************************************************************************************S


// QUESTION 7 :-


// Que 7 :- What is the difference between slice and splice
let arr1 = [1, 2, 3, 4, 5];
let arr2 = [1, 2, 3, 4, 5];
arr1.splice(1, 3); 
console.log(arr1); 
arr2.slice(1, 3);
console.log(arr2); 