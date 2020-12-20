package student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class DataLoader {

    static List<PreAcademyStudent> load() {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Path.of("students.txt"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return lines.stream().map(DataLoader::createPreAcademyStudent)
                            .collect(Collectors.toList());
    }

    private static PreAcademyStudent createPreAcademyStudent(String line) {
        String[] data = line.split(";");

        String name = data[0];
        String surname = data[1];
        int quizPoints = Integer.parseInt(data[2]);
        int taskPoints = Integer.parseInt(data[3]);
        int activityPoints = Integer.parseInt(data[4]);
        return new PreAcademyStudent(name, surname, quizPoints, taskPoints, activityPoints);
    }
}
