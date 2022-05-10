package day6.leetCode;
/*
You are given two integers, x and y, which represent your current location on a Cartesian grid: (x, y).
    You are also given an array points where each points[i] = [ai, bi] represents that a point exists at (ai, bi).
       A point is valid if it shares the same x-coordinate or the same y-coordinate as your location.
Return the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location.
    If there are multiple, return the valid point with the smallest index. If there are no valid points, return -1.
The Manhattan distance between two points (x1, y1) and (x2, y2) is abs(x1 - x2) + abs(y1 - y2).
 */
public class LeetCodeProblemTwo {
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int result = -1;
        int distance = Integer.MAX_VALUE;
        int comparedDistance;
        for (int i = 0; i < points.length; i++) {
            int xi = points[i][0];
            int yi = points[i][1];
            if (!(xi == x || yi == y))
                continue;
            comparedDistance = Math.abs(x - xi) + Math.abs(y - yi);
            if (comparedDistance < distance) {
                distance = comparedDistance;
                result = i;
            }
        }
        return result;
    }
}
