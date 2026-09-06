let arr = [10,11,12,13,14,15,16];

let result1 = arr.map(function(ele){
    return ele * 2 ;
})

let result2 = arr.filter(function(ele){
    return ele %2 == 0 ;
})

let result3 = arr.reduce(function(ele,sum){
    return ele + sum;
})

console.log(result1);
console.log(result2);
console.log(result3);

