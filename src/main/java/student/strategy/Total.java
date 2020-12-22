package student.strategy;

import student.PreAcademyStudent;

import java.util.Comparator;

public class Total implements StudentComparator {

    @Override
    public Comparator<PreAcademyStudent> compare() {
        return Comparator.naturalOrder();
    }
}
