import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// Labb TDD

public class Labb1Test {

    Company company = new Company();

    @Test
     void testEmployeeFirstAndLastName(){
        Employee person1 = new Employee();
        person1.setFirstName("Karl");
        person1.setLastName("Karlsson");
        company.employeeList.add(person1);
        Assertions.assertEquals("Karl",person1.getFirstName());
        Assertions.assertEquals("Karlsson",person1.getLastName());
    }

    @Test
    void testAddAgeToAnEmployee() {
        Employee person2 = new Employee();
        person2.setAge(33);
        company.employeeList.add(person2);
        int expected = 33;
        int actual = person2.getAge();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAddSalaryToAnEmployee() {
        Employee person3 = new Employee();
        person3.setSalary(30000.0);
        company.employeeList.add(person3);
        double expected = 30000.0;
        double actual = person3.getSalary();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAddCompanyIdAndRemoveEmployee(){

        Employee person1 = new Employee();
        Employee person2 = new Employee();

        company.hire(company,person1); // GER ID 1
        company.hire(company,person2); // GER ID 2

        company.fire(company,person1); // ID 1 TAS BORT
        company.hire(company,person1); // ID 3 GES

        Assertions.assertEquals(2,person2.getCompanyId());
        Assertions.assertEquals(3,person1.getCompanyId());
    }
    @Test
    void testIncreaseAllSalaryToAllEmployees(){
        Employee person1 = new Employee();
        person1.setSalary(10000);
        Employee person2 = new Employee();
        person2.setSalary(1000);

        company.hire(company,person1);
        company.hire(company,person2);

        company.increaseAllSalary(company, 0.5);

        Assertions.assertEquals(15000,person1.getSalary());
        Assertions.assertEquals(1500,person2.getSalary());
    }

    @Test
    void testNotGreaterThanOneHundredPercent() {
        Employee person1 = new Employee();
        person1.setSalary(10000);
        Employee person2 = new Employee();
        person2.setSalary(1000);

        company.hire(company,person1);
        company.hire(company,person2);

        company.increaseAllSalary(company, 1.5);

        Assertions.assertEquals(20000,person1.getSalary());
        Assertions.assertEquals(2000,person2.getSalary());
    }
    @Test
    void testIncreaseSalaryNotLowerThanZero() {
        Employee person1 = new Employee();
        person1.setSalary(10000);
        Employee person2 = new Employee();
        person2.setSalary(1000);

        company.hire(company,person1);
        company.hire(company,person2);

        company.increaseAllSalary(company, -1.5);

        Assertions.assertEquals(10000,person1.getSalary());
        Assertions.assertEquals(1000,person2.getSalary());
    }
    @Test
    void testIncreaseSalaryToOneEmployee(){
        Employee person1 = new Employee();
        Employee person2 = new Employee();
        person1.setSalary(10000);
        person2.setSalary(1000);
        company.hire(company,person1);
        company.hire(company,person2);

        company.increaseSalaryToOneEmployee(person1,0.5);

        Assertions.assertEquals(15000,person1.getSalary());
        Assertions.assertEquals(1000,person2.getSalary());
    }
    @Test
    void testIncreaseSalaryToOneEmployeeNotMoreThanOneHundredPercent(){
        Employee person1 = new Employee();
        Employee person2 = new Employee();
        person1.setSalary(10000);
        person2.setSalary(1000);
        company.hire(company,person1);
        company.hire(company,person2);

        company.increaseSalaryToOneEmployee(person1,1.5);

        Assertions.assertEquals(20000,person1.getSalary());
        Assertions.assertEquals(1000,person2.getSalary());
    }
    @Test
    void testIncreaseSalaryToOneEmployeeNotLowerThanZero(){
        Employee person1 = new Employee();
        Employee person2 = new Employee();
        person1.setSalary(10000);
        person2.setSalary(1000);
        company.hire(company,person1);
        company.hire(company,person2);

        company.increaseSalaryToOneEmployee(person1,-1.5);

        Assertions.assertEquals(10000,person1.getSalary());
        Assertions.assertEquals(1000,person2.getSalary());
    }
}
