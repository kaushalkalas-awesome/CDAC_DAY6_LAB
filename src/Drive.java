<<<<<<< HEAD
import java.util.Scanner;

class CalCost {
    private double cost_of_gasoline;
    private double miles_driven;
    private double parking_fees;
    private double toll_fees;
    private double average_miles;

    public CalCost(double cost_of_gasoline, double miles_driven, double parking_fees, double toll_fees,
                   double average_miles) {
    	
        this.cost_of_gasoline = cost_of_gasoline;
        this.miles_driven = miles_driven;
        this.parking_fees = parking_fees;
        this.toll_fees = toll_fees;
        this.average_miles = average_miles;
    }

    public double calculateDailyCost() {
        double gallons_used = miles_driven / average_miles;
        double fuel_cost = gallons_used * cost_of_gasoline;
        return fuel_cost + parking_fees + toll_fees;
    }
}

public class Drive {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double miles = sc.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = sc.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double avgMiles = sc.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parking = sc.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = sc.nextDouble();

        CalCost cost = new CalCost(costPerGallon, miles, parking, tolls, avgMiles);
        double totalCost = cost.calculateDailyCost();

        System.out.println("Your daily driving cost is: "+ totalCost);
    }
}
=======
import java.util.Scanner;

class CalCost {
    private double cost_of_gasoline;
    private double miles_driven;
    private double parking_fees;
    private double toll_fees;
    private double average_miles;

    public CalCost(double cost_of_gasoline, double miles_driven, double parking_fees, double toll_fees,
                   double average_miles) {
    	
        this.cost_of_gasoline = cost_of_gasoline;
        this.miles_driven = miles_driven;
        this.parking_fees = parking_fees;
        this.toll_fees = toll_fees;
        this.average_miles = average_miles;
    }

    public double calculateDailyCost() {
        double gallons_used = miles_driven / average_miles;
        double fuel_cost = gallons_used * cost_of_gasoline;
        return fuel_cost + parking_fees + toll_fees;
    }
}

public class Drive {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double miles = sc.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = sc.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double avgMiles = sc.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parking = sc.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = sc.nextDouble();

        CalCost cost = new CalCost(costPerGallon, miles, parking, tolls, avgMiles);
        double totalCost = cost.calculateDailyCost();

        System.out.println("Your daily driving cost is: "+ totalCost);
    }
}
>>>>>>> refs/remotes/origin/master
