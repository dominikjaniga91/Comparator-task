package student.comparator.strategy;

import student.comparator.PreAcademyStudent;

import java.util.Comparator;

class Quiz implements StudentComparator {

    @Override
    public Comparator<PreAcademyStudent> get() {
       return Comparator.comparing(PreAcademyStudent::quizPoints);
    }
}
