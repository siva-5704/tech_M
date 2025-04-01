package test2;

class Employee {
    String name;
    String jobTitle;
    int salary;
    int hra;
    int da;

    Employee(String name, String jobTitle, int salary, int hra , int da) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hra = hra;
        this.da=da;
    }

    void calculateSalary() {
        System.out.println(name + "'s current salary is: $" + (salary+hra+da));
    }

    void updateSalary(int newSalary) {
        salary = newSalary;
        System.out.println(name + "'s salary has been updated to: $" + (salary+hra+da));
    }



    public static void main(String[] args) {
        Employee emp = new Employee("Shiva", "Software Engineer", 75000 , 15000, 18000);
        emp.calculateSalary();
        emp.updateSalary(85000);
    }
}