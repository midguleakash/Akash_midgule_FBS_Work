let arr = [10, 20, 30, 40, 50];
arr.forEach(function (ele, index) {
    console.log(index + " : " + ele);
})


for (let ele of arr) {
    console.log(ele);
}

let student = {
    name: "akash",
    age: 25,
    city: "pune"
}

for (let key in student) {
    console.log(key + " : " + student[key]);
}


console.log("\n\n");

let students = [
    {
        name: "mahesh",
        age: 25,
        city: "khairewadi"
    },

    {
        name: "akash",
        age: 25,
        city: "pune"
    },

    {
        name: "sachin",
        age: 25,
        city: "shirur"
    }
]


for (let student of students) {
    for (let key in student) {
        console.log(key + " : " + student[key]);
    }
    console.log();
}