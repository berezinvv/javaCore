package person;

public class Person {
    private String name;
    private int birthYear;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int age(int currentYear){
        return currentYear - birthYear;
    }

    public void input(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public String output() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void changeName(String name){
        this.name = name;
    }
}
