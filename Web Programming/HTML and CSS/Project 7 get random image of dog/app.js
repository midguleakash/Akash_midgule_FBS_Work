let btn = document.querySelector("button");
let url2 = "https://dog.ceo/api/breeds/image/random"

let p = document.querySelector("p");
btn.addEventListener("click" , async ()=>{
   let link = await getImage() ;
   console.log(link);
   let img = document.querySelector("#result");
   img.setAttribute("src",link)
})




async function getImage() {
   try {
      let res = await axios.get(url2);
      return (res.data.message)
   }

   catch (e) {
      console.log("NO image  found")
      console.log(e)
   }
}


// let p = document.querySelector("p");
// btn.addEventListener("click" , async ()=>{
//    let fact = await getFacts();
//    p.innerText = fact
//    console.log(fact)
// })

// let url = "https://catfact.ninja/fact";


// async function getFacts() {
//    try {
//       let res = await axios.get(url);
//       return(res.data.fact)
//    }

//    catch (e) {
//       console.log("NO fact found")
//       console.log(e)
//    }
// }