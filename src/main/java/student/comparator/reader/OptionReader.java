package student.comparator.reader;

import student.comparator.enums.Option;

public class OptionReader implements ArgumentReader<Option, String> {

    @Override
    public Option read(String option) {
        return Option.valueOf(option.toUpperCase());
    }
}
