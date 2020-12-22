package student.strategy;

import student.PreAcademyStudent;

import java.util.Comparator;

public interface StudentComparator {

    Comparator<PreAcademyStudent> compare();
}
