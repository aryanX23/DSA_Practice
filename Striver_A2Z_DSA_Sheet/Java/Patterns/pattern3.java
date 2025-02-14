package Striver_A2Z_DSA_Sheet.Java.Patterns;

import java.io.*;

public class pattern3 {
  public static void main(String[] args)throws IOException {
    BufferedReader io = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter Limit n : ");
    int n = Integer.parseInt(io.readLine());

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(j+1);
      }
      System.out.println();
    }
  }
}