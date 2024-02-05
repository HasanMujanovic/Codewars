function disemvowel(str) {
  let prazno = "";
  let vowel = "aeiouAEIOU";
  for (let i = 0; i < str.length; i++) {
    if (vowel.includes(str[i])) {
      prazno += "";
    } else {
      prazno += str[i];
    }
  }
  return prazno;
}
