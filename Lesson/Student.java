package Lesson;


public class Student extends Human {
    private String className;
    private int subgroup;
    private String sector;
    private double averageGrade;

    public Student(String name, String surname, int age, String className, int subgroup, String sector, double averageGrade) {
        super(name, surname, age);
        this.className = className;
        this.subgroup = subgroup;
        this.sector = sector;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", subgroup=" + subgroup +
                ", sector='" + sector + '\'' +
                ", averageGrade=" + averageGrade +
                "} " + super.toString();
    }
}