package conditionalStatementsEnum.HomeWork;

public class Dog {
    private String name;
    private Enum<Breed> breed;
    private int age;
    static private Dog maxAgeDog;

    public Dog(String name, Enum<Breed> breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        if (maxAgeDog == null || age > maxAgeDog.getAge()){
            maxAgeDog = this;
        }
    }

    public String getName() {
        return name;
    }

    public Enum<Breed> getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    public static Dog getMaxAgeDog() {
        return maxAgeDog;
    }
}
