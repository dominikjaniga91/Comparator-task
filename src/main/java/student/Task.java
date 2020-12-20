package student;

class Task {

    private final String name;
    private final int points;

    Task(String name, int points) {
        this.name = name;
        this.points = points;
    }

    int getPoints() {
        return points;
    }
}
