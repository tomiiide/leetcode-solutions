function mySqrt(x: number): number {
    if(x === 0) {
        return 0;
    }
    let root = 0;
    
    while(root <= x){
        if(root * root === x) {
            return root
        }
        if(root * root > x) {
            return root - 1
        }
        root++;
    }
    
};
