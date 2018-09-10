package employee;

public
class Employee {

    private String name;
    private float rate;
    private float hours;

    private static float totalHours;

    public Employee(String name, float rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, float rate, float hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalHours += hours;
    }

    public String getName() {
        return name;
    }

    public float getRate() {
        return rate;
    }

    public float getHours() {
        return hours;
    }

    public static float getTotalHours() {
        return totalHours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public double salary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = '" + name + '\'' +
                ", rate = " + rate +
                ", hours = " + hours +
                ", salary = " + salary() +
                '}';
    }

    public void changeRate(float rate) {
        this.rate = rate;
    }

    public float bonuses() {
        return 0;
    }

}
