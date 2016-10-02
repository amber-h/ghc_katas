import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class PigLatinTest {

    @Test
    public void convertsASingleWordBeginningWithAVowelToPigLatin(){
        PigLatin pigLatin = new PigLatin();

        String actualResult = pigLatin.translate("eat");

        assertThat(actualResult, is("eatway"));
    }

}