let url ="http://universities.hipolabs.com/search?name=";
let btn = document.querySelector("button");

btn.addEventListener("click" , async () => {
   let country = document.querySelector("input").value;
   console.log(country);
   let collegeArray = await getCollege(country);
   console.log(collegeArray);
   show(collegeArray);
});

function show(collegeArray) {
   let list = document.querySelector("#list");
   list.innerText = "";
   for(college of collegeArray) {
      console.log(college.name);
      
      let li = document.createElement("li");
      li.innerText = college.name;
      list.appendChild(li);
   }
}




async function getCollege(country) {
   try {
      let res = await axios.get(url+country);
      return (res.data) ;
      
   } catch (e) {
      console.log(e);
      return [];
   }
}