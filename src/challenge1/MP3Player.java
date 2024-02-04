package challenge1;

public class MP3Player extends AudioPlayer {
    private String MP3file;

    public MP3Player(String MP3file) {
        this.MP3file = MP3file;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file: "+MP3file);
    }

    @Override
    public void pause() {

        System.out.println("Paus MP3 file: "+MP3file);
    }

    @Override
    public void stop() {
        System.out.println("Stop MP3 file: "+MP3file);
    }

}
