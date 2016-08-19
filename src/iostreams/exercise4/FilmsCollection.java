package iostreams.exercise4;

import java.io.Serializable;
import java.util.HashSet;

public class FilmsCollection implements Serializable{
    private HashSet<Film> films;

    public FilmsCollection(){
        films = new HashSet<>();
    }

    public void addFilm(Film f){
        films.add(f);
    }

    public boolean removeFilm(Film f){
        if(!films.contains(f))
            return false;

        films.remove(f);
        return true;
    }

    public void print(){
        for(Film f : films){
            f.printDetails();
            System.out.println();
        }
    }
}
