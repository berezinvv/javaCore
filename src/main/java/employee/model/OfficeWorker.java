package employee.model;

import employee.enums.Position;

public class OfficeWorker extends Employee {

    private Position pos;

    public OfficeWorker(String name, float rate) {
        super(name, rate);
    }

    public OfficeWorker(String name, float rate, float hours, int age) {
        super(name, rate, hours, age);
    }

    public OfficeWorker(Employee employee) {
        super(employee);
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }


    @Override
    public String toString() {
        return "OfficeWorker{" +
                "name='" + super.getName() + '\'' +
                ", rate=" + super.getRate() +
                ", hours=" + super.getHours() +
                ", age=" + super.getAge() +
                ", salary=" + super.salary() +
                ", pos=" + pos +
                '}';
    }
}
