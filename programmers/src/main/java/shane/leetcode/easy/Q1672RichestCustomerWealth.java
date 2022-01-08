package shane.leetcode.easy;

import com.tistory.shanepark.STool;
import org.junit.Assert;

public class Q1672RichestCustomerWealth {

    public static void main(String[] args) {
        Assert.assertEquals(6, maximumWealth(STool.convertToIntArray("[[1,2,3],[3,2,1]]")));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int num = 0;
            for (int i : account) {
                num += i;
            }
            max = Math.max(max, num);
        }
        return max;
    }
}