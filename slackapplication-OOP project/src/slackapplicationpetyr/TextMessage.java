package slackapplicationpetyr;

public class TextMessage extends Message implements Likable {
    private String text;
    private int likesCount;

    public TextMessage(String author, String timestamp, String text) {
        super(author, timestamp);
        this.text = text;
        likesCount = 0;
    }

    @Override
    public void show() {
        System.out.printf("%s: %s\n", super.toString(), text);
    }

    @Override
    public void like(String username) {
        likesCount++;
        System.out.printf("%s, liked %s(%d likes)\n", username, text, likesCount);
    }

    @Override
    public int getLikesCount() {
        return likesCount;
    }
}
