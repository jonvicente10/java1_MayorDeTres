import java.util.Scanner;
 
class MayorDeTres
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Introduce tres numeros ");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
 
      if ( x > y && x > z )
         System.out.println("El primer numero es el mayor.");
      else if ( y > x && y > z )
         System.out.println("El segundo numero es el mayor.");
      else if ( z > x && z > y )
         System.out.println("El tercer numero es el mayor.");
      else   
         System.out.println("Todos los numeros introducidos han de ser distintos");
   }
}
