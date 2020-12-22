package student.comparator.strategy;

import student.comparator.PreAcademyStudent;

import java.util.Comparator;

class LectureActivity implements StudentComparator {

    @Override
    public Comparator<PreAcademyStudent> compare() {
       return Comparator.comparing(PreAcademyStudent::activityPoints);
    }
}
