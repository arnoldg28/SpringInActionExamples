package trackcounter;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;

    private List tracks;

    //trackNumber should point to the index. subtracting 1.
    public void playTrack(int trackNumber) {
         System.out.println("Playing: " + title + " Artist: " + artist
         + "Track: " + trackNumber +": " + tracks.get(--trackNumber));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List getTracks() {
        return tracks;
    }

    public void setTracks(List tracks) {
        this.tracks = tracks;
    }
}
