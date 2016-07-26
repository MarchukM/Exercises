package OOP2.Exercise5;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class Group<E>{

    private String nameOfGroup;
    private Journal<E> journal;
    private Subject subject;

    public Group(Subject s, String name){
        journal = new Journal<E>();
        subject = s;
        setNameOfGroup(name);
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public String getNameOfGroup() {
        return subject.toString() + " " + nameOfGroup + ":";
    }

    public void addStudent(Student s){
        journal.addStudent(s);
    }

    public boolean hasStudent(Student s){
        return journal.hasStudent(s);
    }

    public ArrayList<E> getStudentMarks(Student s){
        return journal.getStudentMarks(s);
    }

    public void printJournal(){
        System.out.println("----------------------------");
        System.out.println("Subject: " + subject.toString());
        System.out.println("Group:   " + nameOfGroup);
        System.out.println("----------------------------");
        journal.printJournal();
        System.out.println();
    }

    public void rate(int index, ArrayList<E>marks){
        journal.rate(index, marks);
    }

    public int getSize(){
        return journal.size();
    }

}
