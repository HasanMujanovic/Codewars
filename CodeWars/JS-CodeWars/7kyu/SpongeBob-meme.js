let recenica = "stop Making spongebob Memes!";

let nova = "";

for (let i = 0; i < recenica.length; i++) {
  if (i % 2 === 0) {
    nova += recenica[i].toUpperCase();
  } else {
    nova += recenica[i];
  }
}
console.log(nova);
