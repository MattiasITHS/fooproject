public class Employee {
    // Labb TDD
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private int companyId;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public double getSalary() {
        return this.salary;
    }
    public int getCompanyId() {
        return this.companyId;
    }
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}
