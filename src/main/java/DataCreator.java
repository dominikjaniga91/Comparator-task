import java.util.ArrayList;
import java.util.List;

public class DataCreator {

    static List<PreAcademyStudent> create() {

        List<PreAcademyStudent> students = new ArrayList<>();
        var dominik = new PreAcademyStudent("Dominik", "Janiga");
        var wiktoria = new PreAcademyStudent("Wiktoria", "Majchrzak");
        var maciek = new PreAcademyStudent("Maciej", "Krawczyk");
        var lukasz = new PreAcademyStudent("Łukasz", "Bulczak");

        students.add(dominik);
        students.add(wiktoria);
        students.add(maciek);
        students.add(lukasz);

        dominik.addQuiz(new Quiz("Enum", 30));
        dominik.addQuiz(new Quiz("Interfaces", 26));
        dominik.addQuiz(new Quiz("Abstraction", 26));
        dominik.addQuiz(new Quiz("Polymorphism", 18));
        dominik.addQuiz(new Quiz("Wrappers", 39));

        wiktoria.addQuiz(new Quiz("Enum", 29));
        wiktoria.addQuiz(new Quiz("Interfaces", 28));
        wiktoria.addQuiz(new Quiz("Abstraction", 28));
        wiktoria.addQuiz(new Quiz("Polymorphism", 17));
        wiktoria.addQuiz(new Quiz("Wrappers", 40));

        maciek.addQuiz(new Quiz("Enum", 30));
        maciek.addQuiz(new Quiz("Interfaces", 28));
        maciek.addQuiz(new Quiz("Abstraction", 28));
        maciek.addQuiz(new Quiz("Polymorphism", 20));
        maciek.addQuiz(new Quiz("Wrappers", 40));

        lukasz.addQuiz(new Quiz("Enum", 29));
        lukasz.addQuiz(new Quiz("Interfaces", 26));
        lukasz.addQuiz(new Quiz("Abstraction", 27));
        lukasz.addQuiz(new Quiz("Polymorphism", 19));
        lukasz.addQuiz(new Quiz("Wrappers", 40));


        dominik.addTask(new Task("Side quest 14", 10));
        dominik.addTask(new Task("Improve tic tac toe", 12));
        dominik.addTask(new Task("Refactor converter", 11));
        dominik.addTask(new Task("Develop guess the number - Imperatively", 14));
        dominik.addTask(new Task("Side quest 13", 10));

        wiktoria.addTask(new Task("Side quest 14", 11));
        wiktoria.addTask(new Task("Improve tic tac toe", 13));
        wiktoria.addTask(new Task("Refactor converter", 16));
        wiktoria.addTask(new Task("Develop guess the number - Imperatively", 14));
        wiktoria.addTask(new Task("Side quest 13", 11));

        maciek.addTask(new Task("Side quest 14", 12));
        maciek.addTask(new Task("Improve tic tac toe", 13));
        maciek.addTask(new Task("Refactor converter", 15));
        maciek.addTask(new Task("Develop guess the number - Imperatively", 15));
        maciek.addTask(new Task("Side quest 13", 11));

        lukasz.addTask(new Task("Side quest 14", 13));
        lukasz.addTask(new Task("Improve tic tac toe", 14));
        lukasz.addTask(new Task("Refactor converter", 15));
        lukasz.addTask(new Task("Develop guess the number - Imperatively", 19));
        lukasz.addTask(new Task("Side quest 13", 15));


        dominik.addLectureActivity(new LectureActivity("Wrappers", 10));
        dominik.addLectureActivity(new LectureActivity("TestNG", 10));
        dominik.addLectureActivity(new LectureActivity("Generics", 11));
        dominik.addLectureActivity(new LectureActivity("Git", 8));
        dominik.addLectureActivity(new LectureActivity("String theory", 9));

        wiktoria.addLectureActivity(new LectureActivity("Wrappers", 5));
        wiktoria.addLectureActivity(new LectureActivity("TestNG", 5));
        wiktoria.addLectureActivity(new LectureActivity("Generics", 5));
        wiktoria.addLectureActivity(new LectureActivity("Git", 5));
        wiktoria.addLectureActivity(new LectureActivity("String theory", 5));

        maciek.addLectureActivity(new LectureActivity("Wrappers", 12));
        maciek.addLectureActivity(new LectureActivity("TestNG", 8));
        maciek.addLectureActivity(new LectureActivity("Generics", 15));
        maciek.addLectureActivity(new LectureActivity("Git", 15));
        maciek.addLectureActivity(new LectureActivity("String theory", 11));

        lukasz.addLectureActivity(new LectureActivity("Wrappers", 20));
        lukasz.addLectureActivity(new LectureActivity("TestNG", 23));
        lukasz.addLectureActivity(new LectureActivity("Generics", 20));
        lukasz.addLectureActivity(new LectureActivity("Git", 23));
        lukasz.addLectureActivity(new LectureActivity("String theory", 21));

        return students;
    }
}
