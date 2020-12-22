package student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_16;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

class DataWriter {

    private static final Path PATH = Path.of("sorted.txt");
    private static final String HEADER = "Name\tSurname\tQuizzes\tTasks\tActivities\tTotal\n";

    static void write(List<PreAcademyStudent> students) {
        List<String> lines = getStringList(students);
        writeHeader();
        try {
            Files.write(PATH, lines, UTF_16, APPEND);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private static List<String> getStringList(List<PreAcademyStudent> students) {
        return students.stream()
                .map(PreAcademyStudent::toString)
                .collect(Collectors.toList());
    }

    static void writeHeader() {
        try(var writer = Files.newBufferedWriter(PATH, UTF_16, TRUNCATE_EXISTING)) {
            writer.write(HEADER);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
