var isSquare = function (n) {
  let b = Math.sqrt(n);
  let resenje = "";

  if (n < 0) {
    return (resenje = false);
  } else if (b !== Math.floor(b)) {
    return (resenje = false);
  } else if (n === 0) {
    return (resenje = true);
  } else if (n / b === b) {
    return (resnje = true);
  } else {
    return (resenje = false);
  }
  return resenje;
};
