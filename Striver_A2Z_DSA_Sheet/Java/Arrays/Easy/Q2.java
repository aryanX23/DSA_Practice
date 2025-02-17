//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
// Attempt 1
// Two Pass Search
class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        
        for(int i: arr){
            if(i > largest){
                secondLargest = largest;
                largest = i;
            }
        }
        
        for(int i: arr){
            if(i > secondLargest && i != largest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}

// Atempt 2

//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
// One pass Search
class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;
        
        for(int i: arr){
            if(i > largest){
                secondLargest = largest;
                largest = i;
            } else if(i < largest && i > secondLargest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}