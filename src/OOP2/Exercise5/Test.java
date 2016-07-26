package OOP2.Exercise5;

import java.util.*;

/**
 * Задание 5.
 * Параметризация, перечисления Разработайте приложение, позволяющее формировать
 * группы студентов по разным дисциплинам. Состав групп может быть разным.
 * Каждая дисциплина в отдельности определяет, целыми или вещественными будут оценки по нет.
 * Необходимо найти группы, в которые входит студент X, и сравнить его оценки.
 * Для огранизации перечня дисциплин мо
 * жно использовать перечисление
 */

public class Test {

    //Наполнить журнал рандомными оценками для Integer
    public void fillIntJournal(Group<Integer> g){
        for(int i = 0; i < g.getSize(); i++){
            ArrayList<Integer> temp = new ArrayList<>();
            int x = 0;
            for(int j = 0; j < 5; j++){
                x = new Random().nextInt(5) + 1;
                temp.add(x);
            }
            g.rate(i, temp);

        }
    }


    //наполнить журнал рандомными оценками для Double
    public void fillDoubleJournal(Group<Double> g) {
        for(int i = 0; i < g.getSize(); i++){
            ArrayList<Double> temp = new ArrayList<Double>();
            double x = 0;
            for(int j = 0; j < 5; j++){
                x = 1 + (Math.random()*10)%4.1;
                x = Math.round(x * 10);
                x /= 10;
                temp.add(x);
            }
            g.rate(i, temp);
        }
    }


    //Показать успеваемость студента во всех группах в которых он состоит
    public void showProgress(HashSet<Group> g, Student s){
        System.out.println(s.getFullName() + ":");
        System.out.println("----------------------------");

        for(Group gr : g){
            if(!gr.hasStudent(s)){
                continue;
            }
            System.out.printf("%-17s", gr.getNameOfGroup());
            ArrayList m = gr.getStudentMarks(s);
            for(Object x : m){
                if(x.getClass().equals(Integer.class)) {
                    Number y = (Number) x;
                    System.out.printf("%3d", y);
                    System.out.print(" ");
                }else{
                    Number y = (Number) x;
                    System.out.print(y + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student("Вася", "Пупкин");
        Student s2 = new Student("Алена", "Кузьмина");
        Student s3 = new Student("Владимир", "Путин");
        Student s4 = new Student("Брюс", "Ли");
        Student s5 = new Student("Джеки", "Чан");

        Group<Integer> g1 = new Group<>(Subject.PROGRAMMING, "P1");
        Group<Double> g2 = new Group<>(Subject.BIOLOGY, "B1");
        Group<Integer> g3 = new Group<>(Subject.MATH, "M1");
        Group<Double> g4 = new Group<>(Subject.HISTORY, "H1");

        g1.addStudent(s1);
        g1.addStudent(s2);
        g1.addStudent(s5);

        g2.addStudent(s2);
        g2.addStudent(s4);
        g2.addStudent(s3);
        g2.addStudent(s5);

        g3.addStudent(s1);
        g3.addStudent(s5);

        g4.addStudent(s3);
        g4.addStudent(s1);
        g4.addStudent(s5);

        Test t = new Test();
        t.fillIntJournal(g1);
        t.fillDoubleJournal(g2);
        t.fillIntJournal(g3);
        t.fillDoubleJournal(g4);

        HashSet<Group> groups = new HashSet<>();
        groups.add(g1);
        groups.add(g2);
        groups.add(g3);
        groups.add(g4);

        g1.printJournal();
        g2.printJournal();
        g3.printJournal();
        g4.printJournal();

        t.showProgress(groups, s1);
        t.showProgress(groups, s2);
        t.showProgress(groups, s3);
        t.showProgress(groups, s4);
    }
}
