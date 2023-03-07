import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    
    System.out.println("Podaj a");
    int a = sc1.nextInt();
    
    System.out.println("Podaj b");
    int b = sc2.nextInt();
    
    int suma = a + b;
    System.out.println("Suma a i b równa się " + suma);
  }
}