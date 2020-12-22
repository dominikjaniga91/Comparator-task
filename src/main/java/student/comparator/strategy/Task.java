package student.comparator.strategy;

import student.comparator.PreAcademyStudent;

import java.util.Comparator;

class Task implements StudentComparator {

    @Override
    public Comparator<PreAcademyStudent> get() {
       return Comparator.comparing(PreAcademyStudent::taskPoints);
    }
}
