package Striver_A2Z_DSA_Sheet.Java.Patterns;

import java.io.*;

public class pattern1 {
  public static void main(String[] args)throws IOException {
    BufferedReader io = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter Limit n : ");
    int n = Integer.parseInt(io.readLine());

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}