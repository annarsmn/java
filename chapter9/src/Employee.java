//9.14
// In this chapter, you studied an inheritance hierarchy in which class
// BasePlusCommissionEmployee inherited from class CommissionEmployee. However, not all types of
// employees are CommissionEmployees. In this exercise, you’ll create a more general Employee superclass
// that factors out the attributes and behaviors in class CommissionEmployee that are common to all Em
//ployees. The common attributes and behaviors for all Employees are firstName, lastName, socialSe
//curityNumber, getFirstName, getLastName, getSocialSecurityNumber and a portion of method
// toString. Create a new superclass Employee that contains these instance variables and methods and a
// constructor. Next, rewrite class CommissionEmployee from Section9.4.5 as a subclass of Employee.
// Class CommissionEmployee should contain only the instance variables and methods that are not de
//clared in superclass Employee. Class CommissionEmployee’s constructor should invoke class Employee’s
// constructor and CommissionEmployee’s toString method should invoke Employee’s toString method.
// Once you’ve completed these modifications, run the CommissionEmployeeTest and BasePlusCommis
//sionEmployeeTest apps using these new classes to ensure that the apps still display the same results for
// a CommissionEmployee object and BasePlusCommissionEmployee object, respectively.

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s",
                "employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber());
    }
}
