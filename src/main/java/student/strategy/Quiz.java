package student.strategy;

import student.PreAcademyStudent;

import java.util.Comparator;

public class Quiz implements StudentComparator {

    @Override
    public Comparator<PreAcademyStudent> compare() {
       return Comparator.comparing(PreAcademyStudent::quizPoints);
    }
}
