import java.util.ArrayList;
// Labb TDD
public class Company {
     ArrayList<Employee> employeeList = new ArrayList<>();
     private int counter = 1;

     public void hire(Company company, Employee person) {
          company.employeeList.add(person);
          person.setCompanyId(company.counter);
          company.counter++;
     }

     public void fire(Company company, Employee person) {
          for (int i = 0; i < company.employeeList.size(); i++) {
               if (person.getCompanyId() == company.employeeList.get(i).getCompanyId()) {
                    company.employeeList.remove(i);
               }
          }
          person.setCompanyId(0);
     }

     public void increaseAllSalary(Company company, double increase) {
          if (increase > 1.0) {
               increase = 1.0;
          }
          else if (increase < 0.0){
               increase = 0.0;
          }
          for (int i = 0; i < company.employeeList.size(); i++) {
                    Employee person = company.employeeList.get(i);
                    person.setSalary(person.getSalary() + (person.getSalary()) * increase);
          }
     }

     public void increaseSalaryToOneEmployee(Employee person, double increase) {
          if (increase > 1.0) {
               increase = 1.0; // sets increase to 1.0 if you try to increase the salary more then 100%
          }
          else if (increase < 0.0){
               increase = 0.0; // sets increase to 0.0 if you try to lower the salary more then 0%
          }
          person.setSalary(person.getSalary() + (person.getSalary()) * increase);
     }
}

