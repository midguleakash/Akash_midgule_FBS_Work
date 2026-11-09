let btn = document.querySelector("button");
let ul = document.querySelector("ul");
let inp = document.querySelector("input");

btn.addEventListener("click" , function () {
   let item = document.createElement("li") ;
   item.innerText = inp.value ;

   let delBtn = document.createElement("button") ;
   delBtn.innerText = "delete"
   delBtn.classList.add("delete") ;

   
   ul.appendChild(item);
   item.appendChild(delBtn);
   inp.value = "" ;
});

// हा event js insert केलेल्या li वरती applay होत नाही 
// let delBtns = document.querySelectorAll(".delete") ;
// for(delBtn of delBtns) {
//    delBtn.addEventListener("click" , function() {
//       let par = this.parentElement;
//       console.log(par);
//       par.remove();
//    });
// }


// हा event js insert केलेल्या li वरती applay होतो 
ul.addEventListener("click" , function(event) {
   console.log("button click")
   console.log(event.target.nodeName);

   if(event.target.nodeName == "BUTTON") {
      let listItem = event.target.parentElement;
      listItem.remove() ;
      console.log("deleted")
   }
})