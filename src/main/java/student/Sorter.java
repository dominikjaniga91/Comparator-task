package student;

import student.strategy.DescendingDecorator;
import student.strategy.Selector;
import student.strategy.SortingOption;
import student.strategy.StudentComparator;

import java.util.List;

public class Sorter {

    void sort(List<PreAcademyStudent> list, SortingOption subject, SortingOption sortDirection) {

        StudentComparator comparator = Selector.select(subject);
        if (sortDirection == SortingOption.DESCENDING) {
            StudentComparator decorated = new DescendingDecorator(comparator);
            list.sort(decorated.compare());
        } else {
            list.sort(comparator.compare());
        }
    }
}
