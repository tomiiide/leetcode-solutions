   
/* Using two pointer technique to slightly speed things up
 * However time complexity should still be O((N/2) . S) <-> O(N . S)
 * Where S is length of words in a sentence. (split)
 *
 * start from the beginning and end of the array
 * thus: a[i] and a[j]
 * increment i and decrement j on each pass until i and j meet at the middle
 *
 * calculate the length of a[i] and a[j]
 * set the maximum value between the current max and length of a[i] and length of a[j]
 * one after the other.
*/



public int mostWordsFound(String[] sentences) {
  int max = 0;
  int i = 0;
  int j = sentences.length - 1;
  //O(N/2)
  while(i <= j) {
    if(i != j) {
      //O(S)
      max = Math.max(max, sentences[i].split(" ").length);
    }
    //O(S)
    max = Math.max(max, sentences[j].split(" ").length);
    i++;
    j--;
  } 
  return max;
}
