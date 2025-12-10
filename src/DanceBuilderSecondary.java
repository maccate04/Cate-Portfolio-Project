import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/*
 *
 * DanceBuilder class
 *
 * {@code DanceBuilder} using Random
 *
 * @convention <pre>
 * NOT SURE YET
 * </pre>
 *
 * @correspondance <pre>
 * NOT SURE YET
 * </pre>
 *
 * @author Cate MacLaughlin
 *
 */
public abstract class DanceBuilderSecondary extends DanceBuilder {

    /*
     * @param types is String[] with different types of dance
     *
     * @param moods is String[] with different dance moods
     *
     * @return the dance choreography using Kernel methods
     *
     * @ensures choreogrpahy uses each Kernel method to make a dance
     */
    private void choreography(String[] types, String[] moods) {
        //note: I changed this method so it could better use Kernel methods
        SimpleWriter choreo = new SimpleWriter1L();

        String type = generateType(types);
        int bars = numBars();
        String mood = danceMood(moods);

        choreo.println("The dance is of type: " + this.type + ". It is "
                + this.bars + " bars long. The mood is " + this.mood + ".");
    }

    /*
     * implementation of toString
     *
     * @returns String of int
     */
    @Override
    public String toString() {
        String s = "";

        String type = generateType(types);
        int bars = numBars();
        String mood = danceMood(moods);

        //concatenates i so it becomes a String
        s = "The dance is of type: " + this.type + ". It is " + this.bars
                + " bars long. The mood is " + this.mood + ".";

        return s;
    }

    /*
     * @param o to compare to this
     *
     * @returns true if o and this are equal
     */
    @Override
    public boolean equals(Object o) {
        boolean eq = false;

        if (o == null) {
            eq = false;
        }
        if (o == this) {
            eq = true;
        }
        return eq;
    }

}
