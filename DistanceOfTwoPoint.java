
/*
 * program : Write method distance to calculate the distance between two
             points (x1, y1) and (x2, y2). All numbers and return values should be of type double. Incorporate
             this method into an application that enables the user to enter the coordinates of the points
 */
import java.util.Scanner;
public class DistanceOfTwoPoint {
	public static double distance(double x1, double x2, double y1, double y2) {
		double D = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return D;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1, x2, y1, y2;
		Scanner input = new Scanner(System.in);
		System.out.print("x1 = ");
		x1 = input.nextDouble();
		System.out.print("x2 = ");
		x2 = input.nextDouble();
		System.out.print("y1 = ");
		y1 = input.nextDouble();
		System.out.print("y2 = ");
		y2 = input.nextDouble();
		System.out.printf("distance between point (x1, y1) and (x2, y2) is %f", distance(x1, x2, y1, y2));
		

	}

}
