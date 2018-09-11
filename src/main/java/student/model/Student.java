package student.model;

public class Student {

    private String name;
    private double rating;
    static private double avgRating;
    static private double allRating;
    static private int countStudent;

    public Student() {
        countStudent++;
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        allRating += rating;
        countStudent++;
        avgRating = allRating / countStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public boolean betterStudent(Student student) {

        if (rating > student.getRating()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public void changeRating(double rating) {
        this.rating = rating;
        allRating -= this.rating;
        allRating += rating;
        avgRating = allRating / countStudent;
    }

    public static double getAvgRating() {
        return avgRating;
    }

    public static double getAllRating() {
        return allRating;
    }
}
