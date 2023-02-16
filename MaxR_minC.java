import java.util.*;

public class MaxR_minC {
// Function to find all the matrix elements
// which are maximum in its row and minimum
// in its column
public static Vector<Integer> minmaxNumbers(int[][] matrix, Vector<Integer> res) {

        // Initialize unordered set
        Set<Integer> set = new HashSet<Integer>();

        // Traverse the matrix
        for(int i = 0; i < matrix.length; i++)
        {
            int maxr = Integer.MIN_VALUE;
            for(int j = 0; j < matrix[i].length; j++)
            {

                // Update the maximum
                // element of current row
                maxr = Math.max(maxr, matrix[i][j]);
            }

            // Insert the maximum
            // element of the row
            set.add(maxr);
        }

        for(int j = 0; j < matrix[0].length; j++)
        {
            int minc = Integer.MAX_VALUE;
            for(int i = 0; i < matrix.length; i++)
            {

                // Update the maximum
                // element of current column
                minc = Math.min(minc, matrix[i][j]);
            }

            // Checking if it is already present
            // in the unordered_set or not
            if (set.contains(minc))
            {
                res.add(minc);
            }
        }
        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        int[][] mat = { { 5, 16, 20 },
                { 9, 11, 18 },
                { 15, 16, 17 } };

        Vector<Integer> ans = new Vector<Integer>();

        // Function call
        ans = minmaxNumbers(mat, ans);

        // If no such matrix
        // element is found
        if (ans.size() == 0)
            System.out.println("-1");

        for(int i = 0; i < ans.size(); i++)
            System.out.println(ans.get(i));
    }
}



//Time Complexity: O(M * N)
//Auxiliary Space: O(M + N)
