package Practice;

abstract public class SalaryPolicy {
    float baseSalary;

    public SalaryPolicy(float baseSalary) {
        this.baseSalary = baseSalary;
    }
    public float getSalary(){
        return baseSalary;
    }

    abstract float getBaseSalary();
}
