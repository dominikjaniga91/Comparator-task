package student.comparator.strategy;

import student.comparator.PreAcademyStudent;

import java.util.Comparator;

public interface StudentComparator {

    Comparator<PreAcademyStudent> compare();
}
