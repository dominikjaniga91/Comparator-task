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

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chose category: QUIZ, TASK, ACTIVITY, TOTAL");
        String categoryInput = scanner.nextLine();

        System.out.println("chose category: ASCENDING, DESCENDING");
        String optionInput = scanner.nextLine();

        Category category = new CategoryReader().read(categoryInput);
        Option option = new OptionReader().read(optionInput);
        List<PreAcademyStudent> students = DataLoader.load();
        Sorter.sort(students, category, option);
        DataWriter.write(students);

    }
}
