package student;

class LectureActivity {

    private final String name;
    private final int points;

    public LectureActivity(String name, int points) {
        this.name = name;
        this.points = points;
    }

    int getPoints() {
        return points;
    }
}
