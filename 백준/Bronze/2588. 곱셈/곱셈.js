const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

let a = input[0].split('');
let b = input[1].split('');

console.log(Number(input[0]) * Number(b[2]));
console.log(Number(input[0]) * Number(b[1]));
console.log(Number(input[0]) * Number(b[0]));
console.log(Number(input[0]) * input[1]);