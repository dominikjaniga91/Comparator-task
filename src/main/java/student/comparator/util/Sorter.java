package student.comparator.util;

import student.comparator.PreAcademyStudent;
import student.comparator.enums.Category;
import student.comparator.enums.Option;
import student.comparator.strategy.*;
import student.comparator.strategy.decorator.DescendingDecorator;

import java.util.List;

public class Sorter {

    public void sort(List<PreAcademyStudent> list, Category category, Option sortingOption) {

        StudentComparator comparator = ComparatorSelector.select(category);
        if (sortingOption == Option.DESCENDING) {
            StudentComparator decorated = new DescendingDecorator(comparator);
            list.sort(decorated.get());
        } else {
            list.sort(comparator.get());
        }
    }
}
