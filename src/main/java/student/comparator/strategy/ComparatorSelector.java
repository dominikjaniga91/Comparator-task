package student.comparator.strategy;

import student.comparator.enums.Category;

public class ComparatorSelector {

    public static StudentComparator select(Category sorter) {
        return switch (sorter) {
                case QUIZ -> new QuizComparator();
                case TASK -> new TaskComparator();
                case ACTIVITY -> new LectureActivityComparator();
                case TOTAL -> new TotalComparator();
        };
    }
}
