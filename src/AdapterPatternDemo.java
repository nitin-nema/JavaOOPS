// Target Interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee Class
class AdvancedMediaPlayer {
    void playMP4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }

    void playVLC(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}

// Adapter Class
class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new AdvancedMediaPlayer();
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new AdvancedMediaPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMP4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVLC(fileName);
        }
    }
}

// Client Class
public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter("mp4");
        player.play("mp4", "test.mp4");

        player = new MediaAdapter("vlc");
        player.play("vlc", "test.vlc");
    }
}
