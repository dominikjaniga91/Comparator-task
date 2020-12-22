package student.strategy;

import student.PreAcademyStudent;

import java.util.Comparator;

public record DescendingDecorator(StudentComparator comparator) implements StudentComparator {

    @Override
    public Comparator<PreAcademyStudent> compare() {
        return comparator.compare().reversed();
    }
}
