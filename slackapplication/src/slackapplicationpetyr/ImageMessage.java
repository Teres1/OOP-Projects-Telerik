package slackapplicationpetyr;

public class ImageMessage extends Message implements Likable, Downloadable {
    public ImageMessage(String author, String timestamp, String imageName) {
        super(author, timestamp);
        this.imageName = imageName;
        this.likesCount = 0;
    }

    private String imageName;
    private int likesCount;

    @Override
    public void show() {
        System.out.printf("%s: %s image(%d likes)\n", super.toString(), imageName, likesCount);
    }

    @Override
    public void like(String username) {
        likesCount++;
    }

    @Override
    public int getLikesCount() {
        return 0;
    }

    @Override
    public void download(String targetPath) {
        System.out.printf("%s image was download to %s.\n", imageName, targetPath);
    }
}
