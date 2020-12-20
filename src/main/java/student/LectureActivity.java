package student;

class LectureActivity implements Data {

    private final String name;
    private final int points;

    public LectureActivity(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
