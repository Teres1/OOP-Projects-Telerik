package slackapplicationpetyr;

public class IconMessage extends Message {
    private Emoticon iconType;

    public IconMessage(String author, String timestamp, Emoticon iconType) {
        super(author, timestamp);
        this.iconType = iconType;
    }

    @Override
    public void show() {
        System.out.printf("%s: %s emot icon\n", super.toString(), iconType);
    }
}
