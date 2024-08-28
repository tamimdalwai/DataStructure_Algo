package _06_isVowel;

//int a e i o u ---> Vowel

import java.util.Scanner;


public class _06_isVowel{

  public static void main(String[] args) {
    char ch;
    System.out.print("Enter any character ");
    Scanner r = new Scanner(System.in);
    ch=r.next().charAt(0);

    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
      System.out.println("Vowel");
    } else {
      System.out.println("Not a Vowel");
    }
  }

}