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
     * @return type of dance as String from list of dances
     *
     * @param types holds different styles of dance
     */
    String generateType(String[] types);

    /*
     * @ensures number returned is even
     *
     * @return number of bars as int (this is an even number)
     */
    int numBars();

    /*
     * @return mood of dance as String from list of moods
     */
    String danceMood(String[] moods);

}
