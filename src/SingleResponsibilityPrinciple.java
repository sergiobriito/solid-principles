

public class SingleResponsibilityPrinciple {

    // OK
    class Employee {
        private String name;
        private int employeeId;
    };

    class PayCalculator {
        public double calculatePay(Employee employee) {
            return 100;
        };
    };

    class EmployeeRepository {
        public void saveEmployee(Employee employee) {
            System.out.println("Saved in db");
        };
    };

    // NOT OK
    class Employee_2 {
        private String name;
        private int employeeId;

        public void save() {
            System.out.println("Saved in db");
        }

        public double calculatePay() {
            return 100;
        }
    }
}

