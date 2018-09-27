package addressBook.model;

import java.util.HashSet;
import java.util.Set;

public class AddressBook {

    private Set<EmplEnter> emplEnters;

    public AddressBook() {
        emplEnters = new HashSet<EmplEnter>();
    }

    public Set<EmplEnter> getAddressBook() {
        return emplEnters;
    }

    public void addAddressBook(EmplEnter emplEnter){
        emplEnters.add(emplEnter);
    }

    public void removeAddressBook(EmplEnter emplEnter){
        emplEnters.remove(emplEnter);
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "emplEnters=" + emplEnters +
                '}';
    }
}
