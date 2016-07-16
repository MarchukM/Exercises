package OOP.Exercise3;

/**
 * Создать класс Man (человек), с полями: имя, возраст, пол и вес.
 * Определить методы задания имени, возраста и веса.
 * Создать производный класс Student, имеющий поле года обучения.
 * Определить методы задания и увеличения года обучения.
 */

public class Student extends Man {

    private int yearOfEducation;

    Student(){
        super("Студентка", "Cтудентовна", false, 21, 45);
        setYearOfEducation(0);
    }

    Student(String first, String last, boolean gender, int age, double weight, int year){
        super(first, last, gender, age, weight);
        setYearOfEducation(year);
    }

    public void setYearOfEducation(int year){
        yearOfEducation = (year > 0 ? year : 0);
    }

    public int getYearOfEducation(){
        return yearOfEducation;
    }

    public void toTheNextCourse(){
        ++yearOfEducation;
    }

    public void printInformation(){
        super.printInformation();
        System.out.println("Year of education: " + getYearOfEducation());
    }
}
