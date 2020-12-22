package student.reader;

import student.strategy.Option;

public class OptionReader implements ArgumentReader<Option, String> {

    @Override
    public Option read(String option) {
        return Option.valueOf(option.toUpperCase());
    }
}
