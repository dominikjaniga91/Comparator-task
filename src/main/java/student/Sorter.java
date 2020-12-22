package student;

import student.strategy.*;

import java.util.List;

public class Sorter {

    static void sort(List<PreAcademyStudent> list, Category category, Option sortingOption) {

        StudentComparator comparator = Selector.select(category);
        if (sortingOption == Option.DESCENDING) {
            StudentComparator decorated = new DescendingDecorator(comparator);
            list.sort(decorated.compare());
        } else {
            list.sort(comparator.compare());
        }
    }
}
