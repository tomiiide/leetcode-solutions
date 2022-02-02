
// Create two loops.
// One for each word present in the array , i picked first
// Second for the array of strings itself
// Check if the length of each word in the array is less than i , return empty string
// Check the letters against themselves if not equal, prefix is defo not there
// Else keep adding up the letters found that are equal


public class Solution {
    public string LongestCommonPrefix(string[] strs) {
    string answer = "";    
    for(int i = 0; i < strs[0].Length; i++){
        for(int j = 1; j < strs.Length; j++) {
            if(strs[j].Length < i+1)  return answer; 
            if(strs[j][i] != strs[0][i])  return answer;             
        }
        answer+=strs[0][i];       
       }
    return answer; 
    }
}

