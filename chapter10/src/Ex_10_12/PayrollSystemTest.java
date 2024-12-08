package Ex_10_12;

import java.util.Calendar;

public class PayrollSystemTest {
    public static void main(String[] args) {
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;

        Date birthDate1 = new Date(5, 15, 1990);
        Date birthDate2 = new Date(12, 12, 1980);
        Date birthDate3 = new Date(11, 1, 1989);
        Date birthDate4 = new Date(6, 13, 1991);

        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", birthDate1, 800.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", birthDate2, 16.75, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee("Sue", "Jones", "333-33-3333", birthDate3, 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", birthDate4, 5000, .04, 300);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n");
        for (Employee currentEmployee : employees) {
            System.out.println("\n" + currentEmployee);
            System.out.printf("earned $%,.2f%n", currentEmployee.earnings());

            if (currentEmployee.getBirthDate().getMonth() == currentMonth) {
                System.out.printf("(Birthday Bonus: $100.00)%n");
                System.out.printf("Total: $%,.2f%n", currentEmployee.earnings() + 100.00);
            }
        }

        System.out.println();
        for (int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getSimpleName());
    }
}
