abstract class Employee{
    private String name;
    private int empId;
    public Employee(String name, int empId){
        this.name = name;
        this.empId = empId;
    }
    public abstract void calculateSalary();
   public String getName(){ return name; }
   public int getEmpId(){ return empId; }
   public double getsalary(){ return salary; }
   protected void setSalary(double salary){ this.salary = salary; }
   public void displayDetails(){
    System.out.println("ID: " + "Name: " + name + "Salary: $"+ getSalary());

   }
}
class FullTimeEmployee extends Employee{
    private double monthlyRate;
    public FullTimeEmployee(String name, int empId, double monthlyRate){
        super(name,empId);
        this.monthlyRate = monyhlyRate;
        @override
         public void calculateSalary();{
            setSalary(monthlyRate);
        }
    }


class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(String name,int empId,double hourlyRate,int hoursWorked){
        super(name,empId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    void calculateSalary();{
        setSalary(hourlyRate * hoursWorked);

    }
}
public class Employee2{
    public static void main(String[] args){
        Employee emp1 = new FullTimeEmployee("Alice",101,5000.0);
        Employee emp2 = new PartTimeEmployee("bob",102,25.0,80);
        emp1.calculateSalary();
        emp1.displayDetails();
        emp2.calculateSalary();
        emp2.displayDetails();
    }
}
}