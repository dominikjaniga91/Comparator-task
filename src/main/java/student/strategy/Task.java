package student.strategy;

import student.PreAcademyStudent;

import java.util.Comparator;

public class Task implements StudentComparator {

    @Override
    public Comparator<PreAcademyStudent> compare() {
       return Comparator.comparing(PreAcademyStudent::taskPoints);
    }
}
