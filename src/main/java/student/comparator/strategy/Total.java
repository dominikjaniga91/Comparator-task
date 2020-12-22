package student.comparator.strategy;

import student.comparator.PreAcademyStudent;

import java.util.Comparator;

class Total implements StudentComparator {

    @Override
    public Comparator<PreAcademyStudent> compare() {
        return Comparator.naturalOrder();
    }
}
