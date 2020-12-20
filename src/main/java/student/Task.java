package student;

class Task implements Data {

    private final String name;
    private final int points;

    Task(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
