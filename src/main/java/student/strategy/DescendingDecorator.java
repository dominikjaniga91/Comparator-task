package student.strategy;

import student.PreAcademyStudent;

import java.util.Comparator;

public class DescendingDecorator implements StudentComparator {

    private final StudentComparator comparator;

    public DescendingDecorator(StudentComparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public Comparator<PreAcademyStudent> compare() {
        return comparator.compare().reversed();
    }
}
