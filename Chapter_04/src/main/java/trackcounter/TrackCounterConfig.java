package trackcounter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    /**
     * Bean we are advising
     * @return
     */
    @Bean
    public CompactDisc sgtPeppers() {
        BlankDisc cd = new BlankDisc();

        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        cd.setArtist("The Beatles");

        List<String> tracks = new ArrayList<String>();

        //NOTE: index starts with zero
        tracks.add("track 1");
        tracks.add("track 2");
        tracks.add("track 3");
        tracks.add("track 4");
        tracks.add("track 5");

        cd.setTracks(tracks);

        return cd;
    }

    /**
     * Aspect Bean
     * @return
     */
    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }

}
