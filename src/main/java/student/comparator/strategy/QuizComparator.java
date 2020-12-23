package student.comparator.strategy;

import student.comparator.PreAcademyStudent;

import java.util.Comparator;

class QuizComparator implements StudentComparator {

    @Override
    public Comparator<PreAcademyStudent> get() {
       return Comparator.comparingInt(PreAcademyStudent::quizPoints);
    }
}
