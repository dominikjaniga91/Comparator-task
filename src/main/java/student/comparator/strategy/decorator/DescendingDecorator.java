package student.comparator.strategy.decorator;

import student.comparator.PreAcademyStudent;
import student.comparator.strategy.StudentComparator;

import java.util.Comparator;

public record DescendingDecorator(StudentComparator comparator) implements StudentComparator {

    /**
     * Add additional behaviour to object of StudentComparator
     *
     * @return reversed version of specific comparator
     */
    @Override
    public Comparator<PreAcademyStudent> get() {
        return comparator.get().reversed();
    }
}
