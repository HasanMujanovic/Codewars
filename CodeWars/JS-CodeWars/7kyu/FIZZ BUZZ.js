// Return an array

function fizzbuzz(n) {
  let fizz = "FIZZ";
  let buzz = "BUZZ";
  let fizzbuzz = "FIZZ BUZZ";
  let array = [];
  for (let i = 1; i <= n; i++) {
    if (i % 3 === 0 && i % 5 === 0) {
      array.push("FizzBuzz");
    } else if (i % 3 === 0) {
      array.push("Fizz");
    } else if (i % 5 === 0) {
      array.push("Buzz");
    } else {
      array.push(i);
    }
  }
  return array;
}

console.log(fizzbuzz(10));
