package student.comparator.util;

import student.comparator.PreAcademyStudent;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.nio.file.StandardOpenOption.CREATE_NEW;

public class DataWriter {

    private static final String HEADER = "Name\tSurname\tQuizzes\tTasks\tActivities\tTotal\n";

    /**
     * Write provided list of students to file.
     *
     * @param students list of PreAcademyStudent objects
     */
    public void write(List<PreAcademyStudent> students) {
        String fileName = createFileName();
        Path path = Paths.get(fileName);

        try(var writer = Files.newBufferedWriter(path, CREATE_NEW)) {
            writer.write(HEADER);
            writeStudentsList(students, writer);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private void writeStudentsList(List<PreAcademyStudent> students, BufferedWriter writer) {
        students.stream().map(PreAcademyStudent::toString)
                .forEach(student -> writeStudent(writer, student));
    }

    private void writeStudent(BufferedWriter writer, String student) {
        try {
            writer.write(student);
            writer.newLine();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private String createFileName() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH:mm:ss");
        String dateTime = LocalDateTime.now().format(format);
        return "sorted_students_" + dateTime + ".csv";
    }
}
