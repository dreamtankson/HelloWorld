// obj表示一个js对象
let a: object;
a = {};
a = function () {

};

// 在属性名后加上？表示属性是可选的
let b:{name:string,age?:number};
b ={name:'孙悟空',age:18};

let c:{name:string,[propName:string]:any};
c = {name:'猪八戒',age:18,gender:'男'};
