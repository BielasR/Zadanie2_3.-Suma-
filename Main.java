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

    int p1 = (int)Math.pow(a,b);
    int p2 = (int)Math.pow(b,a);
    
    int suma = p1 + p2;
    System.out.println("Suma a^b i b^a równa się " + suma);
  }
}