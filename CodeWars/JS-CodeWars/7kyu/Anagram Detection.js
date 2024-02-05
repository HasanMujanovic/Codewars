// write the function isAnagram
var isAnagram = function (test, original) {
  let a = test.toLowerCase();
  let b = original.toLowerCase();
  let testString1 = a.split("");
  let oriString1 = b.split("");
  let testString = testString1.sort();
  let oriString = oriString1.sort();
  let brojac = 0;
  for (let i = 0; i < testString1.length; i++) {
    if (testString[i] === oriString[i]) {
      brojac++;
    }
  }
  if (testString1.length !== oriString1.length) {
    return false;
  } else if (brojac === testString1.length) {
    return true;
  } else {
    return false;
  }
};
