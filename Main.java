import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int[] a = {5,4,3,2,1};

    for(int i=0 ; i < a.length ; i++)
      System.out.println("a["+i+"] =" + a[i]);

  }
}