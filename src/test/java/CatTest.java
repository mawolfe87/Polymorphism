import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by michaelwolfe on 1/30/17.
 */
public class CatTest {

    Cat cat;

    @Before
    public void setUp(){
        cat = new Cat();
    }

    @Test
    public void speakTest(){
        String expected = "Chirp!";
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);
    }

}
