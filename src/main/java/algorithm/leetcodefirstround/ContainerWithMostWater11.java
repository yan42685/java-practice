package algorithm.leetcodefirstround;

/**
 * @author: alexyan
 * @date: 5/29/2019 13:31
 * @description:
 */
public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int result = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            result = Math.max(result, Math.min(height[start], height[end]) * (end-start));
            if (height[start] < height[end]) start++;
            else end--;
        }
        return result;
    }
}
