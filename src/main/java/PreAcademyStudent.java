import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class PreAcademyStudent {

    private final String name;
    private final String surname;
    private final List<Quiz> quizzes = new ArrayList<>();
    private final List<Task> tasks = new ArrayList<>();
    private final List<LectureActivity> activities = new ArrayList<>();

    PreAcademyStudent(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}
