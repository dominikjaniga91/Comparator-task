package student.comparator.strategy;

import student.comparator.enums.Category;

public class ComparatorSelector {

    /**
     * Chose comparator base on the provided category
     *
     * @param sorter the category of data
     * @return a comparator object for specific data
     */
    public static StudentComparator select(Category sorter) {
        return switch (sorter) {
                case QUIZ -> new QuizComparator();
                case TASK -> new TaskComparator();
                case ACTIVITY -> new LectureActivityComparator();
                case TOTAL -> new TotalComparator();
        };
    }
}
