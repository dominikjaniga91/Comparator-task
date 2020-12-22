package student.comparator.strategy;

import student.comparator.PreAcademyStudent;

import java.util.Comparator;

class Quiz implements StudentComparator {

    @Override
    public Comparator<PreAcademyStudent> compare() {
       return Comparator.comparing(PreAcademyStudent::quizPoints);
    }
}
