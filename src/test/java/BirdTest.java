import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by michaelwolfe on 1/30/17.
 */
public class BirdTest {

    Bird bird;

    @Before
    public void setUp(){
        bird = new Bird();
    }
    @Test
    public void speakTest(){
        String expected = "Chirp";
        String actual = bird.speak();
        Assert.assertEquals(expected, actual);
    }

}
