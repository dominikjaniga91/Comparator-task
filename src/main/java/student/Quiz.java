package student;

class Quiz implements Data {

    private final String name;
    private final int points;

    Quiz(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
