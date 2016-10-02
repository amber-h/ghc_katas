import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PigLatinTest {

    @Test
    public void convertsASingleWordBeginningWithAVowelToPigLatin(){
        String actualResult = PigLatin.translate("eat");

        assertThat(actualResult, is("eatway"));
    }

    @Test
    public void convertsASingleWordBeginningWithAConsonantToPigLatin(){
        String actualResult = PigLatin.translate("cake");

        assertThat(actualResult, is("akecay"));
    }


    @Test
    public void convertsASingleWordBeginningWithTwoConsonantsToPigLatin(){
        String actualResult = PigLatin.translate("chocolate");

        assertThat(actualResult, is("ocolatechay"));
    }

    @Test
    public void convertsASingleWordBeginningWithThreeConsonantsToPigLatin(){
        String actualResult = PigLatin.translate("strange");

        assertThat(actualResult, is("angestray"));
    }

    @Test
    public void convertsTwoWordsInSentenceToPigLatin(){
        String actualResult = PigLatin.translate("delicious cheese");

        assertThat(actualResult, is("eliciousday eesechay"));
    }

    @Test
    public void convertsWordsBeginningInQuToPigLatin(){
        String actualResult = PigLatin.translate("queen");

        assertThat(actualResult, is("eenquay"));
    }

    @Test
    public void convertsMultipleWordsToPigLating(){
        String actualResult = PigLatin.translate("I am enjoying the conference");

        assertThat(actualResult, is("Iway amway enjoyingway ethay onferencecay"));
    }

}