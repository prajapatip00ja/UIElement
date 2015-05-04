package droidelement;

public class Droid {
    private String id;

    public Droid(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
