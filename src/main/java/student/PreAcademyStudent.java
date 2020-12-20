package student;

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
        return getPoints(quizzes);
    }

    int getTasksPoints() {
        return getPoints(tasks);
    }

    int getLectureActivityPoints() {
        return getPoints(activities);
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

    <E extends Data> int getPoints(List<E> subjects) {
        return subjects.stream().mapToInt(Data::getPoints).sum();
    }

    private int getTotalPoints() {
        return getPoints(quizzes) +
                getPoints(tasks) +
                getPoints(activities);
    }

    @Override
    public int compareTo(PreAcademyStudent preAcademyStudent) {
        int that = getTotalPoints();
        int another = preAcademyStudent.getTotalPoints();
        return Integer.compare(that, another);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", name, surname, getQuizzesPoints(), getTasksPoints(), getLectureActivityPoints(), getTotalPoints());
    }
}
