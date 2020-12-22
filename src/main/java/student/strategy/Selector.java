package student.strategy;

public class Selector {

    public static StudentComparator select(Sorters sorter) {
        return switch (sorter) {
                case QUIZ -> new Quiz();
                case TASK -> new Task();
                case ACTIVITY -> new LectureActivity();
                case TOTAL -> new Total();
                default -> throw new IllegalArgumentException();
        };
    }
}
