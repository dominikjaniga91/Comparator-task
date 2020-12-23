package student;

import student.comparator.Program;

/**
 * Entry point of the application. Takes 3 arguments in specific order and pass it to
 * run method of the Program class.
 *  1. name of the file with extension
 *  2. subject to sort
 *  3. sorting direction
 * e.g students.csv QUIZ DESCENDING. Size of the letters does not matter.
 *
 * @author Dominik Janiga
 * @version 1.0
 * @see Program
 */
public class Main {

    public static void main(String[] args) {

        new Program().run(args);
    }
}
