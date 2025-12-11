/**
 * Example 1 of how DanceBuilder component can be used.
 *
 * @author Cate M
 */
public class ExampleOne {

    public ExampleOne() {
        this.newInstance(d);
        this.transferFrom(d);
    }

    /**
     * Creates a dance with kernel methods.
     *
     * @ensures a dance is made with a type, number of bars, and a mood.
     */
    public void dance() {
        this.generateType();
        this.numBars();
        this.danceMood();
    }

    /**
     * Puts together elements of the dance in a String.
     *
     * @return a String with type, number, and mood.
     */
    public String choreo() {
        this.choreography();
    }

    public static void main(String[] args) {
        private DanceBuilder (["salsa", "irish", "ballroom"], 0, ["energetic", "happy", "dark"]) d = new DanceBuilder();

        d.dance();
        d.choreo();

    }
}
