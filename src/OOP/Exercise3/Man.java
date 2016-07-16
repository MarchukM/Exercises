package OOP.Exercise3;

/**
 * Создать класс Man (человек), с полями: имя, возраст, пол и вес.
 * Определить методы задания имени, возраста и веса.
 * Создать производный класс Student, имеющий поле года обучения.
 * Определить методы задания и увеличения года обучения.
 */

public class Man {

    protected String firstName;
    protected String lastName;
    protected boolean gender;
    protected int age;
    protected double weight;

    public Man(){
        setFirstName("Василий");
        setLastName("Пупкин");
        setGender(true);
        setAge(2016);
        setWeight(1000);

    }

    public Man(String first, String last, boolean gender, int age, double weight){
        setFirstName(first);
        setLastName(last);
        setGender(gender);
        setAge(age);
        setWeight(weight);
    }

    public void setFirstName(String name){
        firstName = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setGender(boolean g){
        gender = g;
    }

    public void setAge(int age){
        this.age = (age >= 0 ? age : 0);
    }

    public void setWeight(double weight){
        this.weight = (weight > 0 ? weight : 1);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGender(){
        if(gender == true){
            return new String("Male");
        }else{
            return new String("Female");
        }
    }

    public int getAge(){
        return age;
    }

    public  double getWeight(){
        return weight;
    }

    public void printInformation(){
        System.out.println("First name:        " + getFirstName());
        System.out.println("Last name:         " + getLastName());
        System.out.println("Gender:            " + getGender());
        System.out.println("Age:               " + getAge());
        System.out.println("Weight:            " + getWeight() + "kg.");
    }

}
