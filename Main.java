import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a number to count down or up from: ");
    
    int number = s.nextInt();
    
    for ( int count = number; count >= 0; count--)
    System.out.println(" " + count);
    

    for ( int count = number; count <= 0; count++)
    System.out.println(" " + count);
    
    System.out.println("Blast off!");
  }
}