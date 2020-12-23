package student.comparator;

import student.comparator.enums.Category;
import student.comparator.enums.Option;
import student.comparator.reader.CategoryReader;
import student.comparator.reader.OptionReader;
import student.comparator.util.DataLoader;
import student.comparator.util.DataWriter;
import student.comparator.util.Sorter;

import java.util.List;


public class Program {

    private final Sorter sorter = new Sorter();
    private final DataWriter writer = new DataWriter();
    private final DataLoader loader = new DataLoader();
    private final CategoryReader categoryReader = new CategoryReader();
    private final OptionReader optionReader = new OptionReader();

    /**
     * Read provided arguments in an array, load students from file
     * and sort loaded students list. Finally pass a sorted list to a writer.
     * When user provide only a file name, the program will sort total points ascending
     *
     * @param args the array of starting arguments
     */
    public void run(String... args) {

        String fileName = getArgument(0, args);
        Category category = categoryReader.read(getArgument(1, args));
        Option option = optionReader.read(getArgument(2, args));
        List<PreAcademyStudent> students = loader.load(fileName);
        sorter.sort(students, category, option);
        writer.write(students);
    }

    private String getArgument(int index, String... args) {
        return args.length <= index + 1 ? args[0] : "";
    }
}