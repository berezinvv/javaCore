package addressBook.model;

public class WorkPlace {

    private EmplEnter emplEnter;
    private Position position;

    public WorkPlace(EmplEnter emplEnter, Position position) {
        this.emplEnter = emplEnter;
        this.position = position;
    }

    public EmplEnter getEmplEnter() {
        return emplEnter;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkPlace)) return false;

        WorkPlace workPlace = (WorkPlace) o;

        if (getEmplEnter() != null ? !getEmplEnter().equals(workPlace.getEmplEnter()) : workPlace.getEmplEnter() != null)
            return false;
        return getPosition() == workPlace.getPosition();
    }

    @Override
    public int hashCode() {
        int result = getEmplEnter() != null ? getEmplEnter().hashCode() : 0;
        result = 31 * result + (getPosition() != null ? getPosition().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WorkPlace{" +
                "emplEnter=" + emplEnter.getName()+
                ", position=" + position +
                '}';
    }
}
