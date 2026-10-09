package Day5Oct09;

class Employee{
    double Salary=30000;
}

class Manager extends Employee{
    double Salary=60000;

    void displaySalary(){

        System.out.println("Manager salary: "+Salary);
        System.out.println("Employee salary: "+super.Salary);
    }
}