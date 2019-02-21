package slackapplicationpetyr;

import java.util.ArrayList;

public class Application {
    ArrayList<Channel> channels;

    public Channel getCurrentChannel() {
        return currentChannel;
    }

    private Channel currentChannel;

    public Application() {
        channels = new ArrayList<>();
    }

    public void createChannel(String name) {
        Channel channel = new Channel(name);
        channels.add(channel);
        currentChannel = channel;

    }

    public void changeCurrentChannel(String name) {
        for (Channel channel : channels) {
            if (channel.getName().equals(name)) {
                currentChannel = channel;
                break;
            }
        }
    }
}
