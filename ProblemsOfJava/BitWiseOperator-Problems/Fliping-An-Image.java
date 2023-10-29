https://leetcode.com/problems/flipping-an-image/


class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image )
        {
            for(int j=0;j<(image[0].length+1)/2;j++)
            {
                int temp = row[j]^1;
                row[j]= row[image[0].length-j-1]^1;
                row[image[0].length-j-1] = temp;
            }
        }
        return image;
    }
}

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
