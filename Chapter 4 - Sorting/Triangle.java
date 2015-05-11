import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        
        if (A.length == 0 || A.length == 1|| A.length ==2)
        return 0;
        
        //int count = 0;
    
        for (int i = 2; i< A.length;i++)
        {
            if (A[i-2] + A[i-1] > A[i])
            return 1;
        }
        
        return 0;
    }
}