package ch06;

/*
 * Count the number of employees.
 * Each time an object is created, the static variable count is incremented in the constructor.
 * Each time the object is destroyed, finalize() method is called to decrement the count.
 * Print the number of current employees with the static method getCount().
 */

public class Employee {
    private String name;
    private double salary;
    private static int count = 0;

    public Employee(String n, double s){
        name = n;
        salary = s;
        count++;
    }

    public void finalize(){
        count--;
    }

    public static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Cheolsu Kim", 35000);
        Employee e2 = new Employee("Sucheol Choi", 50000);
        Employee e3 = new Employee("Cheolho Kim", 20000);

        int n = Employee.count;
        System.out.println("Current Number of Employee: " + n);
    }
}
