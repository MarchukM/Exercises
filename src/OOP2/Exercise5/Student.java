package OOP2.Exercise5;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }


}
