package slackapplicationpetyr;

public class Main {
    public static void main(String[] args) {
        Application slack = new Application();
        slack.createChannel("Default");
        slack.getCurrentChannel().postText("SA", "11.35", "Hello");
        slack.getCurrentChannel().postIcon("SA", "11.36", Emoticon.SMILE);
        //slack.getCurrentChannel().listHistory();
        slack.getCurrentChannel().likeMessage("11.35", "SA");
        //slack.getCurrentChannel().listHistory();
        slack.getCurrentChannel().postImage("Gosho", "11.20", "Mountain");
        slack.getCurrentChannel().likeMessage("11.20", "Pesho");
        slack.getCurrentChannel().downloadMessage("11.20", "c:\\images");
        //slack.getCurrentChannel().listHistory();
    }
}
