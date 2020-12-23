package student.comparator;

import student.comparator.enums.Category;
import student.comparator.enums.Option;
import student.comparator.reader.CategoryReader;
import student.comparator.reader.OptionReader;
import student.comparator.util.DataLoader;
import student.comparator.util.DataWriter;
import student.comparator.util.Sorter;

import java.util.List;
import java.util.Scanner;

public class Program {

    public void run(String... args) {

        String fileName = args[0];
        Category category = new CategoryReader().read(args[1]);
        Option option = new OptionReader().read(args[2]);
        List<PreAcademyStudent> students = DataLoader.load(fileName);
        Sorter.sort(students, category, option);
        DataWriter.write(students);

    }
}
