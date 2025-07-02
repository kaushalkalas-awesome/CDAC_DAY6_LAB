package tester;
import java.util.Scanner;
import com.app.geometry.*;

public class TestPointArray1 {
	
	public static Scanner sc = new Scanner(System.in);
	
//	public static void setData(int n) {
//		double x,y=0.0;
//		for(int i=0; i<n; i++) {
//			
//			System.out.print("Enter x: ");
//			x = sc.nextDouble();
//			
//			System.out.print("Enter y: ");
//			y = sc.nextDouble();
//			points[i] = new Point2D(x,y);
//		}
//	}
//	
//	public boolean displayDetails() {
//		System.out.println("------Display all co-ordinates------");
//		for(Point2D p : points) {
//			if(p == null) {
//				System.out.println("Empty");
//				return false;
//			}
//			p.getDetails();
//			System.out.println("------------");
//			return true;
//		}
//		return true;
//	}
//	
//	public void displayCoordinates(int index, int n) {
//		System.out.println("------Display co-ordinates------");
//		for(Point2D p : points) {
//			if(p == null) {
//				System.out.println("Empty");
//			}
//		}
//		for(int i=0; i<n; i++) {
//			if(i == index) {
//				System.out.println("Co - ordinates of "+index+"is: "+points[i].getDetails());
//			} else {
//				System.out.println(" Invalid index , pls retry!!!!");
//			}
//		}
//	}
//	
//	public boolean calSpecificDist(int d1, int d2, int n) {
//		if((d1>n || d1<0) && (d2>n || d2<0)) {
//			System.out.println("Invalid index");
//			return false;
//		} else {
//			System.out.println("Distace is: "+points[d1].calculateDistance(points[d2]));
//			return true;
//		}
//	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter no. of points: ");
		int count = sc.nextInt();
		Point2D[] points = new Point2D[count];
		
		double x,y=0.0;
		for(int i=0; i<count; i++) {
			
			System.out.print("Enter x: ");
			x = sc.nextDouble();
			
			System.out.print("Enter y: ");
			y = sc.nextDouble();
			points[i] = new Point2D(x,y);
		}
		
		while(true) {
			System.out.println("1. Display Details of Points");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. 2 indices for the points , validate the indices");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: 
				System.out.print("Enter Index: ");
				int index = sc.nextInt();
				System.out.println("------Display co-ordinates------");
				for(Point2D p : points) {
					if(p == null) {
						System.out.println("Empty");
						break;
					}
				}
				for(int i=0; i<count; i++) {
					if(i == index) {
						System.out.println("Co - ordinates of "+index+"is: "+points[index].getDetails());
					} else {
						System.out.println(" Invalid index , pls retry!!!!");
					}
				}
				break;
					
				
			case 2:
				System.out.println("------Display all co-ordinates------");
				for(Point2D p : points) {
					if(p == null) {
						System.out.println("Empty");
						break;
					}
					p.getDetails();
					System.out.println("------------");
				}
				break;
				
			case 3:
				System.out.println("------Display all co-ordinates------");
				for(Point2D p : points) {
					if(p == null) {
						System.out.println("Empty");
						break;
					}
					p.getDetails();
					System.out.println("------------");
				}
				System.out.println("Enter d1: ");
				int d1 = sc.nextInt();
				
				System.out.println("Enter d2: ");
				int d2 = sc.nextInt();
				
				if((d1>count || d1<0) && (d2>count || d2<0)) {
					System.out.println("Invalid index");
					break;
				} else {
					System.out.println("Distace is: "+points[d1].calculateDistance(points[d2]));
					break;
				}
				
			case 4: System.exit(4);
			
			default:
				System.out.println("Invalid");
			}
		}

	}

}