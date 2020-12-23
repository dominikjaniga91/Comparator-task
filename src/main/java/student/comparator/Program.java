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
     *
     * @param args the array of starting arguments
     */
    public void run(String... args) {

        String fileName = args[0];
        Category category = categoryReader.read(args[1]);
        Option option = optionReader.read(args[2]);
        List<PreAcademyStudent> students = loader.load(fileName);
        sorter.sort(students, category, option);
        writer.write(students);

    }
}
