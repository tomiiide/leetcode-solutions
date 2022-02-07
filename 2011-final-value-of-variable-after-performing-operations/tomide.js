/**
 * @param {string[]} operations
 * @return {number}
 */
var finalValueAfterOperations = function(operations) {
    let x = 0;
    for(const key in operations) {
        const operation = operations[key];
        switch(operation){
            case "++X":
            case "X++":
                x++
                break
            case "--X":
            case "X--":
                x--
                break
            default:
                break;
        }
    }
    return x;
};
