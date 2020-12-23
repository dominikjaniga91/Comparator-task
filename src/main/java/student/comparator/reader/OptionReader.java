package student.comparator.reader;

import com.google.common.base.Enums;
import student.comparator.enums.Option;

public class OptionReader implements ArgumentReader<Option, String> {

    @Override
    public Option read(String option) {
        return Enums.getIfPresent(Option.class, option.toUpperCase()).or(Option.ASCENDING);
    }
}
