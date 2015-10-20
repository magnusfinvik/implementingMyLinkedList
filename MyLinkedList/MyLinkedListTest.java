
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {
    MyLinkedList list = new MyLinkedList();
    String wordWeAreLookingFor;
    String actualReturnedWord;
    String expectedWord;
    int expectedIndex;
    int actualIndex;

    @Before
    public void before() {
        list.add("hei");
        list.add("god morgen");
        list.add("morna");
        list.add("hallais");
        list.add("god aften");
    }

    @Test
    public void contains_addedOneStringAndChecksIfItHasTheSame_returnTrue() {
        wordWeAreLookingFor = "hei";
        assertTrue(list.contains(wordWeAreLookingFor));
    }

    @Test
    public void contains_addedOneStringAndChecksIfItHasADifferentString_returnFalse() {
        wordWeAreLookingFor = "tjohei";
        assertFalse(list.contains(wordWeAreLookingFor));
    }

    @Test
    public void contains_addsThreeStringsChecksIfItHasNumberTwo_returnTrue() {
        wordWeAreLookingFor = "god morgen";
        assertTrue(list.contains(wordWeAreLookingFor));
    }

    @Test
    public void get_getIndexOneWhichIsGodMorgen_returnsGodMorgen() {
        actualReturnedWord = list.get(1).toString();
        expectedWord = "god morgen";
        assertEquals(expectedWord, actualReturnedWord);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void get_getIndexHigherThanWhatItHas_throwsIndexOutOfBoundsExepction() {
        list.get(100);
    }

    @Test
    public void get_firstElementIndexOne_returnHei() {
        actualReturnedWord =list.get(0).toString();
        expectedWord = "hei";
        assertEquals(expectedWord, actualReturnedWord);
    }

    @Test
    public void indexOf_sendingInHei_returnsZero() {
        expectedIndex = 0;
        actualIndex = list.indexOf("hei");
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void indexOf_sendingInMorna_returnsTwo() {
        expectedIndex = 2;
        actualIndex = list.indexOf("morna");
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void lastIndexOf_sendingInGodMorgen_returnsOne(){
        expectedIndex = 1;
        actualIndex = list.lastIndexOf("god morgen");
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void lastIndexOf_addingAnExtraHei_returns3() {
        list.add("hei");
        expectedIndex = 5;
        actualIndex = list.lastIndexOf("hei");
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void set_changingIndexTwoToHello_usesGetMethodToCheck_returnsHello() {
        list.set(2, "hello");
        expectedWord = "hello";
        actualReturnedWord = list.get(2).toString();
        assertEquals(expectedWord, actualReturnedWord);
    }

    @Test
    public void set_changingTheFirstWordToFirst_usesGetMethodToCheck_returnsFirst() {
        list.set(0, "first");
        expectedWord = "first";
        actualReturnedWord = list.get(0).toString();
        assertEquals(expectedWord, actualReturnedWord);
    }

    @Test
    public void set_changingTheFirstWordToFirst_usesIndexOfMethodToCheck_returnsZero() {
        list.set(0, "first");
        expectedIndex = 0;
        actualIndex = list.indexOf("first");
        assertEquals(expectedIndex, actualIndex);
    }
}