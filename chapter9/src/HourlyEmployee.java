//9.15
//Other types of Employees might include Salaried
//Employees who get paid a fixed weekly salary, PieceWorkers who get paid by the number of pieces
// they produce or HourlyEmployees who get paid an hourly wage with time-and-a-half—1.5 times the
// hourly wage—for hours worked over 40 hours.
// Create class HourlyEmployee that inherits from class Employee (Exercise9.14) and has
// instance variable hours (a double) that represents the hours worked, instance variable wage (a double)
// that represents the wages per hour, a constructor that takes as arguments a first name, a last
// name, a social security number, an hourly wage and the number of hours worked, set and get methods
// for manipulating the hours and wage, an earnings method to calculate an HourlyEmployee’s
// earnings based on the hours worked and a toString method that returns the HourlyEmployee’s
// String representation. Method setWage should ensure that wage is nonnegative, and setHours
// should ensure that the value of hours is between 0 and 168 (the total number of hours in a week).
// Use class HourlyEmployee in a test program that’s similar to the one in Fig. 9.5

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0) {
            throw new IllegalArgumentException("Wage must be non-negative.");
        }
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours worked must be between 0 and 168.");
        }

        this.wage = wage;
        this.hours = hours;
    }

    public void setWage(double wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Wage must be non-negative.");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours worked must be between 0 and 168.");
        }
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public double earnings() {
        if (hours > 40) {
            return 40 * wage + (hours - 40) * wage * 1.5;
        } else {
            return hours * wage;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f%n%s: %.2f", "hourly",
                super.toString(),
                "hours worked", getHours(),
                "hourly wage", getWage());
    }
}
