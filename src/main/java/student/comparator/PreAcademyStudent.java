package student.comparator;

public record PreAcademyStudent(String name,
                         String surname,
                         int quizPoints,
                         int taskPoints,
                         int activityPoints) implements Comparable<PreAcademyStudent> {

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
        return String.format("%s\t%s\t%d\t%d\t%d\t%d", name, surname, quizPoints, taskPoints, activityPoints, getTotalPoints());
    }
}
