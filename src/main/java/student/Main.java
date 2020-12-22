package student;

import student.strategy.SortingOption;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sorter sorter = new Sorter();
        List<PreAcademyStudent> students = DataLoader.load();
        sorter.sort(students, SortingOption.QUIZ, SortingOption.DESCENDING);
        DataWriter.write(students);


    }

}
