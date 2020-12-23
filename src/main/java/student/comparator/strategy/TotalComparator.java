package student.comparator.strategy;

import student.comparator.PreAcademyStudent;

import java.util.Comparator;

class TotalComparator implements StudentComparator {

    @Override
    public Comparator<PreAcademyStudent> get() {
        return Comparator.naturalOrder();
    }
}
