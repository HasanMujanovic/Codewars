// raymanu404;
function uncensor(infected, discovered) {
  var uncensored = "";
  uncensored = infected;
  for (var i = 0; i < discovered.length; i++) {
    uncensored = uncensored.replace("*", discovered[i]);
  }
  return uncensored;
}
