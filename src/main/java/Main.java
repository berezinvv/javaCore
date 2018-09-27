public class Main {
    public static void main(String[] args) {








    }

}

class Order{
    private Cusromer cusromer;
    private int days;

    public Order(Cusromer cusromer) {
        this.cusromer = cusromer;
    }

    public Cusromer getCusromer() {
        return cusromer;
    }

    public void setCusromer(Cusromer cusromer) {
        this.cusromer = cusromer;
    }
    //..........
}

class Cusromer{
    private String adress;
    private String phoneNomber;

    public Cusromer(String adress, String phoneNomber) {
        this.adress = adress;
        this.phoneNomber = phoneNomber;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNomber() {
        return phoneNomber;
    }

    @Override
    public String toString() {
        return "Cusromer{" +
                "adress='" + adress + '\'' +
                ", phoneNomber='" + phoneNomber + '\'' +
                '}';
    }
}


