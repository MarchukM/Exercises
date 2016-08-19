package iostreams.exercise4;

import java.io.Serializable;

public class Actor implements Serializable{
    private String firstName;
    private String lastName;

    public Actor(){
        setFirstName("");
        setLastName("");
    }

    public Actor(String name){
        setName(name);
    }

    public Actor(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
    }

    public void setName(String name){
        String[] x = name.split(" ");
        this.setFirstName(x[0]);
        if(x.length > 1)
            setLastName(x[1]);
        else
            setLastName("");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
