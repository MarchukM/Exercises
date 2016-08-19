package iostreams.exercise4;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.io.Serializable;
import java.util.ArrayList;

public class Film implements Serializable {
    private String title;
    private ArrayList<Actor> actors;

    public Film(String title) {
        setTitle(title);
        actors = new ArrayList<>();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void addActor(String actorName) {
        Actor a = new Actor();
        a.setName(actorName);

        actors.add(a);
    }

    public ArrayList<Actor> getActorsList() {
        return actors;
    }

    public void printDetails() {
        System.out.println("---------------------------------------");
        System.out.printf("%-12s", "Title:");
        System.out.println(title);
        System.out.println("---------------------------------------");
        System.out.print("Starring:   ");
        for (int i = 0; i < actors.size(); i++) {
            if (i == 0)
                System.out.println(actors.get(i).getFirstName() +
                        " " + actors.get(i).getLastName());
            else {
                System.out.printf("%-12s", " ");
                System.out.println(actors.get(i).getFirstName() +
                        " " + actors.get(i).getLastName());
            }
        }
    }
}
