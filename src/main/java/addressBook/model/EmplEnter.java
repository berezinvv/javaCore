package addressBook.model;

public abstract class EmplEnter {

    private String name;
    private String address;
    private String phoneNumber;

    public EmplEnter() {
    }

    public EmplEnter(String name) {
        this.name = name;
    }

    public EmplEnter(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
