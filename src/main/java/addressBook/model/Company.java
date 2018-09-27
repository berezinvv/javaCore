package addressBook.model;

import java.util.HashSet;
import java.util.Set;

public class Company extends EmplEnter {

    private Set<WorkPlace> workPlaceSet;

    public Company(String name) {
        super(name);
        workPlaceSet = new HashSet<WorkPlace>();
    }

    public Company(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
        workPlaceSet = new HashSet<WorkPlace>();
    }

    public Set<WorkPlace> getWorkPlaceSet() {
        return workPlaceSet;
    }

    public void addWorkPlaceSet(WorkPlace workPlace, boolean mark) {
        workPlaceSet.add(workPlace);
        if (mark){
            Employee employee = (Employee) workPlace.getEmplEnter();
            employee.addWorkPlaceSet(new WorkPlace(this, workPlace.getPosition()), false);
        }
    }

    public void removeWorkPlace(WorkPlace workPlace, boolean mark) {
        workPlaceSet.remove(workPlace);
        if (mark) {
            Employee employee = (Employee) workPlace.getEmplEnter();
            employee.removeWorkPlace(this, workPlace.getPosition(), false);
        }
    }

    public void removeWorkPlace(Employee employee, Position position, boolean mark) {
        workPlaceSet.remove(new WorkPlace(employee, position));
        if (mark) {
            employee.removeWorkPlace(this, position, false);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "Name='" + super.getName() + '\'' +
                ", Address='" + super.getAddress() + '\'' +
                ", PhoneNumber='" + super.getPhoneNumber() + '\'' +
                ", workerSet=" + workPlaceSet +
                '}' + "\n";
    }
}
