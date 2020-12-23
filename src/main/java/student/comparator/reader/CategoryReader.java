package student.comparator.reader;

import com.google.common.base.Enums;
import student.comparator.enums.Category;

public class CategoryReader implements ArgumentReader<Category, String> {

    @Override
    public Category read(String category) {
        return Enums.getIfPresent(Category.class, category.toUpperCase()).or(Category.TOTAL);
    }
}
