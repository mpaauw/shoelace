package models;

public class Thing {

    private final int id;
    private final String content;

    public Thing(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
