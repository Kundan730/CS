const prompt = require("prompt-sync")();

let num = prompt("Enter Your Number: ")

if(num <= 1) {
  console.log("Neither prime nor composite number.")
}
let c = 2;
if(num===4) {
  console.log("Not prime");
}
else {
  while(c*c < num) {
    if(num % c === 0){
      console.log("not prime");
    }
    c++;
  }
}