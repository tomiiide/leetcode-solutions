function kClosest(points: number[][], k: number): number[][] {
    const calculateDistanceToOrigin = (point: number[]) => {
        return Math.sqrt(((point[0] - 0) ** 2) + ((point[1] - 0) ** 2))
    }
    
    const sorted = points.sort((pointA, pointB) => {
        return calculateDistanceToOrigin(pointA) - calculateDistanceToOrigin(pointB)
    })
    
    return sorted.slice(0,k)
};
