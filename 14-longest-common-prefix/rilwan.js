/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
  // check if array is empty
    // if empty return empty string
 // create a for loop with the length of the first string in the array
    // create another for loop for the length of the array
      // check if the second loop index character of the first string is not equal to the rest of the rest of the loop
    if (strs.length === 0) return "";
    
    for (let j = 0; j < strs[0].length; j++) {
        for (let i = 0; i < strs.length; i++) {
            if (strs[0][j] !== strs[i][j]) return strs[0].substring(0,j);
        }
    }
    
    return strs[0];
};
