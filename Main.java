import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
   // Complete the code below
   
   // TODO: Create Airplane 1 and 2
   Airplane ap1 = new Airplane();
   Airplane ap2 = new Airplane("AAA02", 15.8, 128, 30000);
   
   // TODO: Create a Scanner
   Scanner sc = new Scanner(System.in);
   
   // TODO: Getting inputs for Airplane 3
   System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude): ");
   String cs = (sc.nextLine()).toUpperCase();
   double dist = sc.nextDouble();
   int dir = sc.nextInt();
   int alt = sc.nextInt();

   // TODO: Create Airplane 3 from inputs
   Airplane ap3 = new Airplane(cs, dist, dir, alt);
   
   // TODO: Print the initial positions
   System.out.println("\nInitial Positions: \n" + ap1.toString() + "\n" + ap2.toString() + "\n" + ap3.toString());
   
   // TODO: Print initial distances 
   System.out.println("\nInitial Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + ap1.distTo(ap2));
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + ap1.distTo(ap3));
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + ap2.distTo(ap3));
   
   // TODO: Print initial height differences
   System.out.println("\nInitial Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + (Math.abs(ap1.getAlt() - ap2.getAlt())));
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + (Math.abs(ap1.getAlt() - ap3.getAlt())));
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + (Math.abs(ap2.getAlt() - ap3.getAlt())));
   
   // TODO: Airplane 1 changes
   ap1.move(ap2.distTo(ap3), 65);
   for (int i = 0; i < 3; i++) {ap1.gainAlt();}
   
   
   // TODO: Airplane 2 changes
   ap2.move(8.0, 135);
   for (int i = 0; i < 2; i++) {ap2.loseAlt();}
   
   // TODO: Airplane 3 changes
   ap3.move(5.0, 55);
   for (int i = 0; i < 4; i++) {ap3.loseAlt();}
   
   // TODO: Print new positions of airplanes
   System.out.println("\nNew Positions: \n" + ap1.toString() + "\n" + ap2.toString() + "\n" + ap3.toString());
   
   // TODO: Print new distances between airplanes
   System.out.println("\nNew Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + ap1.distTo(ap2));
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + ap1.distTo(ap3));
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + ap2.distTo(ap3));
   
   // TODO: Print new heights between airplanes
   System.out.println("\nNew Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + (Math.abs(ap1.getAlt() - ap2.getAlt())));
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + (Math.abs(ap1.getAlt() - ap3.getAlt())));
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + (Math.abs(ap2.getAlt() - ap3.getAlt())));
  }
}
