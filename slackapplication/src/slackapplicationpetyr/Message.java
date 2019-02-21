package slackapplicationpetyr;

public abstract class Message {
    private String author;

    public String getTimestamp() {
        return timestamp;
    }

    private String timestamp;

    public Message(String author, String timestamp) {
        this.author = author;
        this.timestamp = timestamp;
    }

    public abstract void show();

    public String toString() {
        return String.format("[%s](%s)", timestamp, author);
    }
}
