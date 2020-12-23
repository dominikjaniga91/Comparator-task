package student.comparator.reader;

import com.google.common.base.Enums;
import student.comparator.enums.Option;

public class OptionReader implements ArgumentReader<Option, String> {

    /**
     * Get an enum value base on provided String argument
     *
     * @return a sorting option, return ASCENDING if there is no such option
     */
    @Override
    public Option read(String option) {
        return Enums.getIfPresent(Option.class, option.toUpperCase()).or(Option.ASCENDING);
    }
}
