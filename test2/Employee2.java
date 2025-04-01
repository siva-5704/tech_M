package test2;

class Employee2 {
    String name;
    double salary;
    int hireYear;
    boolean isPerm;

    Employee2(String name, double salary, int hireYear, boolean isPerm) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.isPerm = isPerm;
    }

    void calculateYearsOfService(int currentYear) {
        int years = currentYear - hireYear;
        System.out.println(name + " has " + years + " years of service.");
        if(years>4)
        {
        	System.out.println(name + " is a permanent employee");
        }
        else
        {
        	System.out.println(name + " is a temporary employee");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Employee2 permEmp = new Employee2("Shiva", 60000, 2015, true);
        Employee2 tempEmp = new Employee2("Giridhar", 40000, 2019, false);

        permEmp.calculateYearsOfService(2023);
        tempEmp.calculateYearsOfService(2023);
    }
}