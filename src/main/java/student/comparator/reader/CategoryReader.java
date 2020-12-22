package student.comparator.reader;

import student.comparator.enums.Category;

public class CategoryReader implements ArgumentReader<Category, String> {

    @Override
    public Category read(String category) {
        return Category.valueOf(category.toUpperCase());
    }
}
