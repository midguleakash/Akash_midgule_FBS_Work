// init.js या file च्या मदतीने आपण  mongodb मध्ये data add केला ..

const mongoose = require("mongoose");
const Chat = require("./models/chat.js");

main()
    .then( () => {
        console.log("connection successfull")
    })
    .catch((err) => console.log(err));

async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/fakewhatsapp');

}


let allChats = [
    {
        from: "neha",
        to: "poja",
        msg: "send me your exam sheets",
        created_at: new Date()
    },
    {
        from: "akash",
        to: "poja",
        msg: "can you share your notes?",
        created_at: new Date()
    },
    {
        from: "neha",
        to: "akash",
        msg: "let's discuss the assignment.",
        created_at: new Date()
    },
    {
        from: "poja",
        to: "neha",
        msg: "please help me with the project.",
        created_at: new Date()
    },
    {
        from: "akash",
        to: "neha",
        msg: "send me the exam schedule.",
        created_at: new Date()
    },
    {
        from: "poja",
        to: "akash",
        msg: "can you explain the concept of algorithms?",
        created_at: new Date()
    },
    {
        from: "neha",
        to: "poja",
        msg: "let's meet up for a group study session.",
        created_at: new Date()
    },
    {
        from: "akash",
        to: "poja",
        msg: "are you free to talk about the project?",
        created_at: new Date()
    },
    {
        from: "poja",
        to: "akash",
        msg: "I have a few questions regarding the assignment.",
        created_at: new Date()
    },
    {
        from: "neha",
        to: "akash",
        msg: "let's revise the material for the upcoming test.",
        created_at: new Date()
    },
];



Chat.insertMany(allChats);