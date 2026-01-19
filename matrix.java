class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        if (points == null || points.length <= 1) return 0;
        int total = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int dx = Math.abs(points[i+1][0] - points[i][0]);
            int dy = Math.abs(points[i+1][1] - points[i][1]);
            total += Math.max(dx, dy);
        }
        return total;
    }
}
