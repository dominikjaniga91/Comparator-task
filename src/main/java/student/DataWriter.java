package student;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class DataWriter {

    static void write( List<PreAcademyStudent> students) {
        List<String> lines = students.stream()
                                    .map(PreAcademyStudent::toString)
                                    .collect(Collectors.toList());
        try {
            Files.write(Path.of("sorted.txt"),
                        lines,
                        StandardCharsets.UTF_16,
                        StandardOpenOption.TRUNCATE_EXISTING);

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
