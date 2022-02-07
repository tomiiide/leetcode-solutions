/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    let max = 0;
    
    for(key in sentences){
        const sentence = sentences[key]
        const noOfWords = sentence.split(" ").length
        if( noOfWords > max) {
            max = noOfWords
        }
    }
    
    return max;
};
