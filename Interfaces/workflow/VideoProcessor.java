import java.util.ArrayList;
import java.util.List;

public class VideoProcessor {
    private List<NotificationChannel> channels;

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
