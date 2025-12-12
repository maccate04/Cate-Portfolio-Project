/**
 * Example 2 of how DanceBuilder can be used.
 *
 * @author Cate M
 */
public class ExampleTwo {

    //This example could be an outline for a DanceBuilder2().

    private ExampleTwo(Object o) {
        this.o = new DanceBuilder();
    }

    public String builtType = "";
    public int builtBars = 0;
    public String builtMood = "";

    public ExampleTwo.generateType(String[] types);

    public ExampleTwo.numBars();

    public ExampleTwo.danceMood(String[] moods);

    /**
     * Secondary method that reads and combines the final state.
     */
    public String choreo() {
        if (this.builtType.isEmpty() || this.builtMood.isEmpty()) {
            return "ERROR: Dance is incomplete. Type: '" + this.builtType
                    + "', Bars: " + this.builtBars + ", Mood: '"
                    + this.builtMood + "'.";
        }
        return "The new choreography is a " + this.builtType + ", lasting "
                + this.builtBars + " bars (an even count), and expressing a "
                + this.builtMood + " mood.";
    }
}
