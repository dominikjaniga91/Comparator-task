package student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class DataLoader {

    private static final String FILE = "students.txt";
    private static final String WORD_SEPARATOR = ";";

    static List<PreAcademyStudent> load() {
        List<String> lines = readLinesFromFile();
        return getStudentsList(lines);
    }

    private static List<String> readLinesFromFile() {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Path.of(FILE));
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return lines;
    }

    private static List<PreAcademyStudent> getStudentsList(List<String> lines) {
        return lines.stream().map(DataLoader::createPreAcademyStudent)
                            .collect(Collectors.toList());
    }

    private static PreAcademyStudent createPreAcademyStudent(String line) {
        String[] data = line.split(WORD_SEPARATOR);

        String name = data[0];
        String surname = data[1];
        int quizPoints = Integer.parseInt(data[2]);
        int taskPoints = Integer.parseInt(data[3]);
        int activityPoints = Integer.parseInt(data[4]);
        return new PreAcademyStudent(name, surname, quizPoints, taskPoints, activityPoints);
    }
}
