import java.util.ArrayList;
import java.util.List;

class PreAcademyStudent implements Comparable<PreAcademyStudent> {

    private final String name;
    private final String surname;
    private final List<Quiz> quizzes = new ArrayList<>();
    private final List<Task> tasks = new ArrayList<>();
    private final List<LectureActivity> activities = new ArrayList<>();

    PreAcademyStudent(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    int getQuizzesPoints() {
        return quizzes.stream().mapToInt(Quiz::getPoints).sum();
    }

    int getTasksPoints() {
        return tasks.stream().mapToInt(Task::getPoints).sum();
    }

    int getLectureActivityPoints() {
        return activities.stream().mapToInt(LectureActivity::getPoints).sum();
    }

    void addQuiz(Quiz quiz) {
        quizzes.add(quiz);
    }

    void addTask(Task task) {
        tasks.add(task);
    }

    void addLectureActivity(LectureActivity lectureActivity) {
        activities.add(lectureActivity);
    }

    private int getTotalPoints() {
        return getQuizzesPoints() +
                getTasksPoints() +
                getLectureActivityPoints();
    }

    @Override
    public int compareTo(PreAcademyStudent preAcademyStudent) {
        int that = getTotalPoints();
        int another = preAcademyStudent.getTotalPoints();
        return Integer.compare(that, another);
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, surname);
    }
}
