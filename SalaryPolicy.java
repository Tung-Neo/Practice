package Practice;

abstract public class SalaryPolicy {
    private float salary;
//    private float baseSalary;

    public SalaryPolicy(float salary){
        this.salary = salary;
    }

    abstract public float baseSalary();

    public float getSalary() {
        return salary;
    }
}
