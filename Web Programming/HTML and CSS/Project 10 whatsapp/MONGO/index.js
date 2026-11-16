const express = require("express");
const app = express();
const mongoose = require("mongoose");
const path = require("path");
const Chat = require("./models/chat.js");
const ExpressError = require("./ExpressError"); 
app.set("views" , path.join(__dirname, "views"));
app.set("view engine" , "ejs");
app.use(express.static(path.join(__dirname,"public")));
app.use(express.urlencoded({extended:true}));
const methodOverride = require("method-override");
app.use(methodOverride("_method"));

main()
    .then( () => {
        console.log("connection successfull")
    })
    .catch((err) => console.log(err));

async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/fakewhatsapp'); 

}

// Index route (/chats) for show all chat
app.get("/chats" , async (req,res) => {

    // Use the 'await' keyword to pause execution until 'Chat.find()' completes
    // This fetches all chat documents from the database
    let chats = await Chat.find();
    console.log(chats);
    res.render("index.ejs" , {chats})
});

//rout for new chat
app.get("/chats/new" , (req , res) => {
    res.render("new.ejs")
})

// rout for post data in database
app.post("/chats", (req , res) => {
    let { from , msg , to } = req.body ;
    let newChat =  new Chat( {
        from : from ,
        msg : msg ,
        to : to,
        created_at : new Date()
    });
    newChat.save().then(res =>   {
        console.log("chat was saved")
    })  .catch((err) => {
        console.log(err)
    })
    res.redirect("/chats")
});

//NEW - SHOW route
app.get("/chats/:id", async (req , res , next) => {
    let { id } = req.params;
    let chat = await Chat.findById(id);
    res.render("edit.ejs" , {chat} )
})

// Edit route
app.get("/chats/:id/edit" , async (req , res ) => {
    let {id} = req.params;
    let chat = await Chat.findById(id);
    res.render("edit.ejs" , {chat} )
});

// update route    
app.put("/chats/:id" , async(req , res) => {
    let {id} = req.params;
    let {msg : newMessage} = req.body ;
    let updatedChat = await Chat.findByIdAndUpdate(
        id, 
        {msg : newMessage},
        {runValidators : true , new : true}
    );

    res.redirect("/chats")
} );

// delete route
app.delete("/chats/:id" , async (req , res) => {
    let {id} = req.params;
    let deletedChat = await Chat.findByIdAndDelete(id);
    console.log(deletedChat);
    res.redirect("/chats")
})
 

app.get("/" ,(req , res) =>{
    res.send("hi") 
})

// Error handling Middleware
app.use( (err , req , res , next) => {
    let { status=500 , messasge="some error occurd" } = err ;
    res.status(status).messasge(messasge);
})

app.listen(8080 , () =>{   
    console.log("server was listening on port 8080");
})