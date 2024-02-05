function derDieDas(wort) {
  let derdie = "";
  let brojac = 0;
  let vowel = "aeiouäöüAEIOU";
  for (let i = 0; i < wort.length; i++) {
    if (vowel.includes(wort[i])) {
      brojac++;
    }
  }

  if (brojac < 2) {
    return (derdie += "das " + wort);
  } else if (brojac === 2 || brojac === 3) {
    return (derdie += "die " + wort);
  } else if (brojac > 3) {
    return (derdie += "der " + wort);
  }

  return derdie;
  //Du kannst es schaffen!
}
