function digitalRoot(n) {
  // ...
  
  function doTheMath(num) {
    let arr = n.toString().split('');
    return arr.reduce( ( a, c ) => parseInt(a) + parseInt(c) );
  }
  
  while (n >= 10) {
    n = doTheMath(n);
  }
  
  return n;
}
