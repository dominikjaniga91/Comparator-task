package student;

import student.reader.CategoryReader;
import student.reader.OptionReader;
import student.strategy.Category;
import student.strategy.Option;

import java.util.List;
import java.util.Scanner;

public class Program {

    void run() {
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
