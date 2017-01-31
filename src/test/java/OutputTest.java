import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by michaelwolfe on 1/30/17.
 */
public class OutputTest {

    Output output;

    @Before
    public void setUp(){
        output = new Output();
    }

    @Test
    public void promtForNumberOfPetsTest(){
        String expected = "How many pets do you have?";
        String actual = output.promptForNumberOfPets();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void promptForNameOfPetTest(){
        String expected = "What is the name of your pet?";
        String actual = output.promptForNameOfPet();
        Assert.assertEquals(expected, actual);
    }


}
