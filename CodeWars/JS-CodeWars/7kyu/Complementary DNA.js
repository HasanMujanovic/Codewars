function DNAStrand(dna) {
  let novi = "";
  for (let i = 0; i < dna.length; i++) {
    if (dna[i] === "A") {
      novi += "T";
    } else if (dna[i] === "T") {
      novi += "A";
    } else if (dna[i] === "G") {
      novi += "C";
    } else if (dna[i] === "C") {
      novi += "G";
    }
  }
  return novi;
}
