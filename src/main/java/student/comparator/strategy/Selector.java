package student.comparator.strategy;

import student.comparator.enums.Category;

public class Selector {

    public static StudentComparator select(Category sorter) {
        return switch (sorter) {
                case QUIZ -> new Quiz();
                case TASK -> new Task();
                case ACTIVITY -> new LectureActivity();
                case TOTAL -> new Total();
        };
    }
}
