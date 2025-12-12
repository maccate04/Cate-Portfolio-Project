import org.junit.Test;

/**
 * JUnit test fixture for {@code DanceBuilder}'s Standard and Secondary methods.
 *
 * @author Cate MacLaughlin
 */
public abstract class DanceBuilderAbsClassTest {

    /**
     * Test case for clear.
     */
    @Test
    public final void testClear() {
        DanceBuilder(["salsa"], 0, ["firey"]) d1 = new DanceBuilder1();
        DanceBuilder([], 0, []) d2 = new DanceBuilder1();

        d1.clear();
        AssertEquals(d1, d2);
    }

    /**
     * Test case for clear.
     */
    @Test
    public final void testClear2() {
        DanceBuilder([], 0, []) d1 = new DanceBuilder1();
        DanceBuilder([], 0, []) d2 = new DanceBuilder1();

        d1.clear();
        AssertEquals(d1, d2);
    }

    /**
     * Test case for clear.
     */
    @Test
    public final void testClear3() {
        DanceBuilder(["salsa", "tap", "jazz"], 0, ["firey", "sad"]) d1 = new DanceBuilder1();
        DanceBuilder([], 0, []) d2 = new DanceBuilder1();

        d1.clear();
        AssertEquals(d1, d2);
    }

    /**
     * Test case for newInstance.
     */
    @Test
    public final void testNewIns() {
        DanceBuilder(["salsa"], 0, ["firey"]) d1 = new DanceBuilder1();

        DanceBuilder() d2 = d1.newInstance();
        AssertEquals(d1, d2);
    }

    /**
     * Test case for newInstance.
     */
    @Test
    public final void testNewIns2() {
        DanceBuilder([], 0, []) d1 = new DanceBuilder1();

        DanceBuilder() d2 = d1.newInstance();
        AssertEquals(d1, d2);
    }

    /**
     * Test case for transferFrom.
     */
    @Test
    public final void testTransFrom() {
        DanceBuilder(["salsa"], 0, ["firey"]) d1 = new DanceBuilder1();
        DanceBuilder([], 0, []) d2 = new DanceBuilder1();

        d2.transferFrom(d1);
        AssertEquals(d1, d2);
    }

    /**
     * Test case for transferFrom.
     */
    @Test
    public final void testTransFrom2() {
        DanceBuilder(["salsa", "tap"], 0, ["firey", "sad"]) d1 = new DanceBuilder1();
        DanceBuilder([], 0, []) d2 = new DanceBuilder1();

        d2.transferFrom(d1);
        AssertEquals(d1, d2);
    }

    /**
     * Test case for choreography.
     */
    @Test
    public final void testChoreo() {
        DanceBuilder([], 0, []) d = new DanceBuilder1();
        String type = d.generateType();
        int bars = d.numBars();
        String mood = d.danceMood();
        String dCh = d.choreography();

        String s = "The dance is of type: " + "" + ". It is " + 0
                + " bars long. The mood is " + "" + ".";

        AssertEquals(s, dCh);
    }

    /**
     * Test case for choreography.
     */
    @Test
    public final void testChoreo2() {
        DanceBuilder(["ballet"], 0, ["happy"]) d = new DanceBuilder1();
        String type = d.generateType();
        int bars = d.numBars();
        String mood = d.danceMood();
        String dCh = d.choreography();

        String s = "The dance is of type: " + "ballet" + ". It is " + 0
                + " bars long. The mood is " + "happy" + ".";

        AssertEquals(s, dCh);
    }

    /**
     * Test case for choreography.
     */
    @Test
    public final void testChoreo3() {
        DanceBuilder(["salsa"], 0, ["firey"]) d = new DanceBuilder1();
        String type = d.generateType();
        int bars = d.numBars();
        String mood = d.danceMood();
        String dCh = d.choreography();

        String s = "The dance is of type: " + "salsa" + ". It is " + 0
                + " bars long. The mood is " + "firey" + ".";

        AssertEquals(s, dCh);
    }

    /**
     * Test case for equals.
     */
    @Test
    public final void testEquals() {
        DanceBuilder([], 0, []) d1 = new DanceBuilder1();
        DanceBuilder([], 0, []) d2 = new DanceBuilder1();

        d1.equals(d2);
    }

    /**
     * Test case for equals.
     */
    @Test
    public final void testEquals2() {
        Object o1 = new Object();
        Object o2 = new Object();

        o1.equals(o2);
    }

    /**
     * Test case for toString.
     */
    @Test
    public final void testToString() {
        DanceBuilder([], 0, []) d = new DanceBuilder1();
        String type = d.generateType();
        int bars = d.numBars();
        String mood = d.danceMood();
        String dStr = d.toString();

        String s = "The dance is of type: " + "" + ". It is " + 0
                + " bars long. The mood is " + "" + ".";

        AssertEquals(s, dStr);
    }

    /**
     * Test case for toString.
     */
    @Test
    public final void testToString2() {
        DanceBuilder(["ballet"], 0, ["happy"]) d = new DanceBuilder1();
        String type = d.generateType();
        int bars = d.numBars();
        String mood = d.danceMood();
        String dStr = d.toString();

        String s = "The dance is of type: " + "ballet" + ". It is " + 0
                + " bars long. The mood is " + "happy" + ".";

        AssertEquals(s, dStr);
    }

    /**
     * Test case for toString.
     */
    @Test
    public final void testToString3() {
        DanceBuilder(["salsa"], 0, ["firey"]) d = new DanceBuilder1();
        String type = d.generateType();
        int bars = d.numBars();
        String mood = d.danceMood();
        String dStr = d.toString();

        String s = "The dance is of type: " + "salsa" + ". It is " + 0
                + " bars long. The mood is " + "firey" + ".";

        AssertEquals(s, dStr);
    }

}
