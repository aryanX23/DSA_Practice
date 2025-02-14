package Striver_A2Z_DSA_Sheet.Java.Patterns;

import java.io.*;

public class pattern5 {
  public static void main(String[] args)throws IOException {
    BufferedReader io = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter Limit n : ");
    int n = Integer.parseInt(io.readLine());

    for (int i = n; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}