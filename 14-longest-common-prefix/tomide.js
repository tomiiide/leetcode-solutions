/**
 * https://leetcode.com/problems/longest-common-prefix
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    // sort the array by str length
    // assume the longest word is a prefix p
    // create a while loop
        // on each iteration, check each word starts with prefix, p
        // if yes, return p
        // if no
        // remove the last letter from p
        // repeat until p.len = 0

    strs.sort((a, b) => a.length - b.length)
    
    let prefix = strs[strs.length - 1]
    
    const checkPrefix = (strs) => {
        return strs.every((str) => str.startsWith(prefix))
    }
    
    while(prefix.length > 0) {
        if(checkPrefix(strs)) {
            return prefix
        }
        prefix = prefix.slice(0,-1)
    }
    
    return prefix;
};
