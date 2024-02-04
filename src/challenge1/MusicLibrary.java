package challenge1;

import java.util.ArrayList;

public class MusicLibrary {

    private ArrayList<AudioPlayer> tracks;

    public MusicLibrary() {
        this.tracks = new ArrayList<>();
    }
    public void addTrack(AudioPlayer track){
        tracks.add(track);
    }

    // Method to play all tracks in the library
    public void playTracks() {
        System.out.println("Playing all tracks in the library:");
        for (AudioPlayer track : tracks) {
            track.play();
        }
    }
    public void pauseTracks() {
        System.out.println("Pausing all tracks in the library:");
        for (AudioPlayer track : tracks) {
            track.pause();
        }
    }
    public void stopTracks() {
        System.out.println("Stopping all tracks in the library:");
        for (AudioPlayer track : tracks) {
            track.stop();
        }
    }










}
