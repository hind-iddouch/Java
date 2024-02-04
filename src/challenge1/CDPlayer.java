package challenge1;

public class CDPlayer extends AudioPlayer {
    private String cd;

    public CDPlayer(String cd) {
        this.cd = cd;
    }

    @Override
    public void play() {

        System.out.println("Playing CD: " + cd);
    }

    @Override
    public void pause() {

        System.out.println("Paus CD: " + cd);
    }

    @Override
    public void stop() {

        System.out.println("STOP CD: " + cd);
    }
}
