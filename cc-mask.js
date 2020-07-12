// return masked string
function maskify(cc) {
  let newCC = "";
  if (cc.length <= 4) {
    return cc; 
  }
  let truncCC = cc.slice(0, cc.length - 4);
  for (let i = 0; i < truncCC.length; i++) {
    newCC += "#";
  }
  return newCC + cc.slice(newCC.length, cc.length);
}
