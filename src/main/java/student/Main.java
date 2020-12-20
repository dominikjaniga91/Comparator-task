package student;

import java.util.List;
import static java.util.Comparator.*;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        List<PreAcademyStudent> students = DataLoader.load();


        out.println("unsorted list");
        print(students);

        out.println("list sorted ascending by quizzes points ");
        students.sort(comparingInt(PreAcademyStudent::getQuizPoints));
        print(students);


        out.println("list sorted descending by quizzes points ");
        students.sort(comparingInt(PreAcademyStudent::getQuizPoints).reversed());
        print(students);


        out.println("list sorted ascending by tasks points ");
        students.sort(comparingInt(PreAcademyStudent::getTaskPoints));
        print(students);


        out.println("list sorted descending by tasks points ");
        students.sort(comparingInt(PreAcademyStudent::getTaskPoints).reversed());
        print(students);

        out.println("list sorted ascending by lectures activities points ");
        students.sort(comparingInt(PreAcademyStudent::getLectureActivityPoints));
        print(students);


        out.println("list sorted descending by lectures activities points ");
        students.sort(comparingInt(PreAcademyStudent::getLectureActivityPoints).reversed());
        print(students);


        out.println("list sorted ascending by total points ");
        students.sort(naturalOrder());
        print(students);


        out.println("list sorted descending by total points ");
        students.sort(reverseOrder());
        print(students);
    }



    private static void print(List<PreAcademyStudent> list) {
        out.println("Name Surname Quizzes Tasks Activities Total");
        list.forEach(out::println);
        out.println();
    }

}
