public class Employee {
        String name;
        int id;
        double salary;
        String location;
    
        public Employee(String name, int id, double salary,String location) {
            this.name = name;
            this.id = id;
            this.salary = salary;
            this.location = location;
        }
    
        public void displayinfo() {
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("location: " + location);
        }
    
        public static void main(String[] args) {
            Employee emp1 = new Employee("Ramya", 101, 5000.0, "hubli");
            emp1.displayinfo();
        }
    }
    

