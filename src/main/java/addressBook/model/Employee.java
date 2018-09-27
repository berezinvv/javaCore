package addressBook.model;

import java.util.HashSet;
import java.util.Set;

public class Employee extends EmplEnter {

    private Set<WorkPlace> workPlaceSet;

    public Employee(String name) {
        super(name);
        workPlaceSet = new HashSet<WorkPlace>();
    }

    public Employee(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
        workPlaceSet = new HashSet<WorkPlace>();
    }

    public Set<WorkPlace> getWorkPlaceSet() {
        return workPlaceSet;
    }

    public void addWorkPlaceSet(WorkPlace workPlace, boolean mark) {
        workPlaceSet.add(workPlace);

        if (mark){
            Company company = (Company) workPlace.getEmplEnter();
            company.addWorkPlaceSet(new WorkPlace(this, workPlace.getPosition()), false);
        }
    }

    public void removeWorkPlace(WorkPlace workPlace, boolean mark) {
        workPlaceSet.remove(workPlace);
        if (mark) {
            Company company = (Company) workPlace.getEmplEnter();
            company.removeWorkPlace(this, workPlace.getPosition(), false);
        }
    }

    public void removeWorkPlace(Company company, Position position, boolean mark) {
        workPlaceSet.remove(new WorkPlace(company, position));
        if (mark) {
            company.removeWorkPlace(this, position, false);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + super.getName() + '\'' +
                ", Address='" + super.getAddress() + '\'' +
                ", PhoneNumber='" + super.getPhoneNumber() + '\'' +
                ", workerSet=" + workPlaceSet +
                '}' + "\n";
    }
}

