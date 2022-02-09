/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let max = 0;
    
    for (let i = 0; i < height.length; i++) {
        for(let j = i + 1; j < height.length; j++) {
            let l = Math.min(height[j], height[i])
            let b = j - i
            let area = l * b
            if (area > max) {
                max = area
            }
        }
    }    
    // return max;
    return MaxArea2(height)
};

var MaxArea2 = function(height) {
    let max = 0;
    let i = 0;
    let j = height.length - 1
    
    while ( i < j) {
        let area = (j - i) * Math.min(height[i], height[j]);
        
        if (area > max) {
            max = area;
        }  
        
        if ( height[i] < height[j]) i++
        else  j--
    }
    
    return max;
}
