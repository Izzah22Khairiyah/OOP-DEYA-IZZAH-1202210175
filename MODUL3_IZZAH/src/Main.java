import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[]args) throws InterruptedException {
        boolean repeat = true;
        int menuprogram;
        Calculation Calculation = new Calculation();
        Thread cltr = new Thread(Calculation);
        Scanner Scanner= new Scanner(System.in);

    do{
        try{
            System.out.println("===Menu Program===");
            System.out.println("""
                                1.Square
                                2.Circle
                                3.Trapezoid""");
            System.out.println("\nSelect Menu : ");
            menuprogram = Scanner.nextInt();
            switch (menuprogram) {
                
            case 0 :
                System.out.println("program finished");
                break;
                
            case 1:
                System.out.println("Enter the length of the side of the square : ");
                double side = Scanner.nextDouble();
                Calculation.setSquare(side);
                cltr.start();
                cltr.join();
                System.out.println("The calculation result : " + Calculation.getSquare());
                break;

            case 2:
                System.out.println("Enter the radius of the circle : ");
                double radius = Scanner.nextDouble();
                Calculation.setCircle(radius);
                cltr.start();
                cltr.join();
                System.out.println("The calculation result is: " + Calculation.getCircle());
            
            case 3:
                System.out.println("Insert the side of the base of the trapezoid : ");
                double a = Scanner.nextDouble();
                System.out.println("enter the upper side of the trapezoid: ");
                double b = Scanner.nextDouble();
                System.out.println("enter height: ");
                double c = Scanner.nextDouble();

                Calculation.setTrapezoid(a,b,c);
                cltr.start();
                cltr.join();
                
                System.out.println("The calculation result: " + Calculation.getTrapezoid());
                break;
                
            default:
                System.out.println("option not Available");
                continue;
            }
            repeat = false;   
        
        } catch (InputMismatchException e) {
            System.out.println("Error: Input Must be number!!!");
            e.getStackTrace();
        } catch (IllegalArgumentException  e){
            System.out.println("Error: Input Must be number!!!");
            e.getStackTrace();
        }
        Scanner.nextLine();
    } while (repeat);
    Scanner.close();
  }
}


