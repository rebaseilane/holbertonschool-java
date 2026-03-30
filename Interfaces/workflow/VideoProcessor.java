import java.util.ArrayList;

public class VideoProcessor {
    private ArrayList<NotificationChannel> channels;

    public VideoProcessor() {
        channels = new ArrayList<>();
    }

    public void registerChannel(NotificationChannel channel) {
        channels.add(channel);
    }

    public void process(Video video) {
        String text = video.getFile() + " - " + video.getFormat();
        Message message = new Message(text, MessageType.LOG);

        for (NotificationChannel channel : channels) {
            channel.notify(message);
        }
    }
}
