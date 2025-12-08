package components.dancebuilder;

import components.standard.Standard;

/*
 *
 * DanceBuilderKernel interface
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

public interface DanceBuilderKernel extends Standard<DanceBuilder> {

    /*
     * Takes in a String array of dance types and randomly returns one.
     *
     * @return type of dance as String from list of dances
     *
     * @ensures one type is selected out of types
     *
     * @param types holds different styles of dance
     */
    String generateType(String[] types);

    /*
     * Randomly generates a number of bars for the dance that is even.
     *
     * @ensures number returned is even
     *
     * @return number of bars as int (this is an even number)
     */
    int numBars();

    /*
     * Takes in a String array of dance moods and randomly returns one.
     *
     * @return mood of dance as String from list of moods
     *
     * @param moods holds different moods
     *
     * @ensures one mood is selected out of moods
     */
    String danceMood(String[] moods);

}
