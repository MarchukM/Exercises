package OOP2.Exercise5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


public class Journal<E>{

    private LinkedList<Student> students = new LinkedList<Student>();
    private HashMap<Student, ArrayList<E>> journal = new HashMap<Student, ArrayList<E>>();


    public void rate(int index, ArrayList<E> marks){
        journal.put(students.get(index), marks);
    }

    public void rate(Student s, ArrayList<E> marks){
        journal.put(s, marks);
    }

    public void addStudent(Student s){
        ArrayList<E> temp = new ArrayList<E>();
        students.add(s);
        journal.put(s, temp);
    }

    public boolean hasStudent(Student s){
        if(students.contains(s)){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<E> getStudentMarks(Student s){
        return journal.get(s);
    }


    public int size(){
       return students.size();
    }

    public void printJournal(){
        System.out.print("Students:");
        System.out.printf("%14s", " ");
        System.out.print("Marks:");
        System.out.println();

        for(int i = 0; i < students.size(); i++){
            System.out.print(i+1 + ". ");
            System.out.printf("%-20s", students.get(i).getFullName());
            printMarks(students.get(i));
            System.out.println();
        }
    }

    public void printMarks(Student s){
        ArrayList<E> temp = journal.get(s);

        for(E i : temp){
            System.out.print(i + "   ");
        }
    }
}
