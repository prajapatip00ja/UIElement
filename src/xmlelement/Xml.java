package xmlelement;

public class Xml {
    private String id;

    public Xml(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  id;
    }

    public String getId() {
        return id;
    }
}
