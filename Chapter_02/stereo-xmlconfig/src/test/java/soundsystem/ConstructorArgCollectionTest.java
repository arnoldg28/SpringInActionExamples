package soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ConstructorArgCollectionTest {

  @Rule
  public final StandardOutputStreamLog log = new StandardOutputStreamLog();

  @Autowired
  private MediaPlayer player;

  @Test
  public void play() {
    player.play();
    assertEquals(
        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles" + System.lineSeparator() +
        "-Track: Sgt. Pepper's Lonely Hearts Club Band" + System.lineSeparator() +
        "-Track: With a Little Help from My Friends" + System.lineSeparator() +
        "-Track: Lucy in the Sky with Diamonds" + System.lineSeparator() +
        "-Track: Getting Better" + System.lineSeparator() +
        "-Track: Fixing a Hole" + System.lineSeparator() +
        "-Track: She's Leaving Home" + System.lineSeparator() +
        "-Track: Being for the Benefit of Mr. Kite!" + System.lineSeparator() +
        "-Track: Within You Without You" + System.lineSeparator() +
        "-Track: When I'm Sixty-Four" + System.lineSeparator() +
        "-Track: Lovely Rita" + System.lineSeparator() +
        "-Track: Good Morning Good Morning" + System.lineSeparator() +
        "-Track: Sgt. Pepper's Lonely Hearts Club Band (Reprise)" + System.lineSeparator() +
        "-Track: A Day in the Life" + System.lineSeparator(),
        log.getLog());
  }

}
