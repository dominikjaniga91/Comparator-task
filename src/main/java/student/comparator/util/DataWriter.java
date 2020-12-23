package student.comparator.util;

import student.comparator.PreAcademyStudent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE_NEW;

public class DataWriter {

    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH:mm:ss");
    private static final String FILE_NAME = "sorted_students_" + LocalDateTime.now().format(format) + ".csv";
    private static final Path PATH = Paths.get(FILE_NAME);
    private static final String HEADER = "Name\tSurname\tQuizzes\tTasks\tActivities\tTotal\n";

    public void write(List<PreAcademyStudent> students) {
        List<String> lines = getStringList(students);
        writeHeader();
        try {
            Files.write(PATH, lines, UTF_8, APPEND);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private List<String> getStringList(List<PreAcademyStudent> students) {
        return students.stream()
                .map(PreAcademyStudent::toString)
                .collect(Collectors.toList());
    }

    private void writeHeader() {
        try(var writer = Files.newBufferedWriter(PATH, UTF_8, CREATE_NEW)) {
            writer.write(HEADER);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
