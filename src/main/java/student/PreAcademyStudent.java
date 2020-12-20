package student;

class PreAcademyStudent implements Comparable<PreAcademyStudent> {

    private final String name;
    private final String surname;
    private final int quizPoints;
    private final int taskPoints;
    private final int activityPoints;

    public PreAcademyStudent(String name, String surname, int quizPoints, int taskPoints, int activityPoints) {
        this.name = name;
        this.surname = surname;
        this.quizPoints = quizPoints;
        this.taskPoints = taskPoints;
        this.activityPoints = activityPoints;
    }

    int getQuizPoints() {
        return quizPoints;
    }

    int getTaskPoints() {
        return taskPoints;
    }

    int getLectureActivityPoints() {
        return activityPoints;
    }

    private int getTotalPoints() {
        return quizPoints + taskPoints + activityPoints;
    }

    @Override
    public int compareTo(PreAcademyStudent preAcademyStudent) {
        int that = getTotalPoints();
        int another = preAcademyStudent.getTotalPoints();
        return Integer.compare(that, another);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", name, surname, quizPoints, taskPoints, activityPoints, getTotalPoints());
    }
}
