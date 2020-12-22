package student.comparator.util;

import student.comparator.PreAcademyStudent;
import student.comparator.enums.Category;
import student.comparator.enums.Option;
import student.comparator.strategy.*;
import java.util.List;

public class Sorter {

    public static void sort(List<PreAcademyStudent> list, Category category, Option sortingOption) {

        StudentComparator comparator = Selector.select(category);
        if (sortingOption == Option.DESCENDING) {
            StudentComparator decorated = new DescendingDecorator(comparator);
            list.sort(decorated.get());
        } else {
            list.sort(comparator.get());
        }
    }
}
