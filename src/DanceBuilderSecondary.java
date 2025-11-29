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

public abstract class DanceBuilderSecondary {

    /*
     * @param types is String[] with different types of dance
     *
     * @param moods is String[] with different dance moods
     *
     * @return the dance choreography using Kernel methods
     */
    private static void choreography(String[] types, String[] moods) {
        //note: I changed this method so it could better use Kernel methods
        SimpleWriter choreo = new SimpleWriter1L();

        String type = generateType(types);
        int bars = numBars();
        String mood = danceMood(moods);

        choreo.println("The dance is of type: " + type + ". It is " + bars
                + " bars long. The mood is " + mood + ".");
    }

    /*
     * implementation of toString
     *
     * @param i int i is the int to be converted to a String
     *
     * @returns String of int i
     */
    public static String toString(int i) {
        String s = "";

        //concatenates i so it becomes a String
        s = "" + i;

        return s;
    }

    /*
     * @param s1 and s2 Strings to compare
     *
     * @returns if s1 and s2 are equal
     */
    public static boolean equals(String s1, String s2) {
        boolean eq = false;

        if (s1.substring(0).contains(s2.substring(0))) {
            eq = true;
        }
        return eq;
    }

}
