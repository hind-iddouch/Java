package challenge1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainMusic {
    public static void main(String[] args) {

        MusicLibrary musicLibrary= new MusicLibrary();
        MP3Player mp3Player= new MP3Player("song.mp3");
        CDPlayer cdPlayer= new CDPlayer("Album A");


        musicLibrary.addTrack(mp3Player);
        musicLibrary.addTrack(cdPlayer);

        musicLibrary.playTracks();
        musicLibrary.pauseTracks();
        musicLibrary.stopTracks();






    }
}
