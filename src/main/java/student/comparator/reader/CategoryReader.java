package student.comparator.reader;

import com.google.common.base.Enums;
import student.comparator.enums.Category;

public class CategoryReader implements ArgumentReader<Category, String> {

    /**
     * Get an enum value base on provided String argument
     *
     * @return a category of students data, return TOTAL if there is no such data
     */
    @Override
    public Category read(String category) {
        return Enums.getIfPresent(Category.class, category.toUpperCase()).or(Category.TOTAL);
    }
}
