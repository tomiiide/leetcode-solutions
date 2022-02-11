/*
* 
*/
fun maxArea(height: IntArray): Int {
  var i = 0;
  var j = height.size - 1;
        
  var max = 0;
                
  while(i < j) {
    val min = Math.min(height[i], height[j]);
    val width = Math.abs(i - j);
            
    max = Math.max(min * width, max);
    
    if(height[i] < height[j]) i++
    else j--;
  }
  
  return max;
}
