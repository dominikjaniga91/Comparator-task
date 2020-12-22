package student.reader;

import student.strategy.Category;

public class CategoryReader implements ArgumentReader<Category, String> {

    @Override
    public Category read(String category) {
        return Category.valueOf(category.toUpperCase());
    }
}
