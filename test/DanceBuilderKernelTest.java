import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * JUnit test fixture for {@code DanceBuilder}'s constructor and kernel methods.
 *
 * @author Cate MacLaughlin
 */
public abstract class DanceBuilderKernelTest {

    /**
     * Test case for no argument constructor DanceBuilder.
     */
    @Test
    public final void testEmptyConstructor() {
        DanceBuilder() d = new DanceBuilder1();
        Object o() = new Object();

        assertEquals(d, o);
    }

    /**
     * Test case for constructor DanceBuilder.
     */
    @Test
    public final void testConstructor() {
        DanceBuilder(String[] types, int num, String[] moods) d = new DanceBuilder1();
        Object(String[] t, int n, String[] m) o = new Object();

        assertEquals(d, o);
    }

    /**
     * Test case for generateType.
     */
    @Test
    public final void testGenerateTypeEmpty() {
        DanceBuilder([], 0, []) d = new DanceBuilder1();
        String s = "";

        String dType = d.generateType();
        assertEquals(s, dType);
    }

    /**
     * Test case for generateType.
     */
    @Test
    public final void testGenerateTypeOne() {
        DanceBuilder(["ballet"], 0, []) d = new DanceBuilder1();
        String s = "ballet";

        String dType = d.generateType();
        assertEquals(s, dType);
    }

    /**
     * Test case for generateType.
     */
    @Test
    public final void testGenerateTypeMultiple() {
        DanceBuilder(["ballet", "tap", "jazz"], 0, []) d = new DanceBuilder1();
        String s = ("ballet" || "tap" || "jazz");

        String dType = d.generateType();
        assertEquals(s, dType);
    }

    /**
     * Test case for intBars.
     */
    @Test
    public final void testNumBarsEmpty() {
        DanceBuilder([], 0, []) d = new DanceBuilder1();
        int n = 0;

        int dNum = d.numBars();
        assertEquals(n, dNum);
    }

    /**
     * Test case for intBars.
     */
    @Test
    public final void testNumBars() {
        DanceBuilder([], 0, []) d = new DanceBuilder1();

        int dNum = d.numBars();
        assertTrue(dNum % 2 == 0);
    }

    /**
     * Test case for danceMood.
     */
    @Test
    public final void testDanceMoodEmpty() {
        DanceBuilder([], 0, []) d = new DanceBuilder1();
        String s = "";

        String dMood = d.danceMood();
        assertEquals(s, dMood);
    }

    /**
     * Test case for danceMood.
     */
    @Test
    public final void testDanceMoodOne() {
        DanceBuilder([], 0, ["happy"]) d = new DanceBuilder1();
        String s = "happy";

        String dMood = d.danceMood();
        assertEquals(s, dMood);
    }

    /**
     * Test case for danceMood.
     */
    @Test
    public final void testDanceMoodMultiple() {
        DanceBuilder([], 0, ["happy", "sad", "dramatic"]) d = new DanceBuilder1();
        String s = ("happy" || "sad" || "dramatic");

        String dMood = d.generateType();
        assertEquals(s, dMood);
    }

}
