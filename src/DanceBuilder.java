import java.lang.Math;
import java.util.Random;
import components.sequence.Sequence;
import components.sequence.Sequence1L;

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

public class DanceBuilder {

/*
 * Kernel methods ----------------------------------------------------------------
 */

/*
 * @return type of dance as String from list of dances
 *
 * @param types holds different styles of dance
 */
 private static String generateType(String[] types){
    assert types != null;

    //if types has length 0, return null
    if (types.length == 0){
        return null;
    }

    //make a random variable and use nextInt to randomly choose a space
    Random rand = new Random();
    int randInd = rand.nextInt(types.length);

    return types[randInd];
 }


/*
 * @ensures number returned is even
 *
 * @return number of bars as int (this is an even number)
 */
 private final int numBars(){

    Random rand = new Random();
    int randInd = rand.nextInt();

    //returns the random int that must be even
    return randInd & ~1;
 }


 /*
 * @return mood of dance as String from list of moods
 */
 private static String danceMood(String[] moods){
    assert moods != null;

    //if types has length 0, return null
    if (moods.length == 0){
        return null;
    }

    //make a random variable and use nextInt to randomly choose a space
    Random rand = new Random();
    int randInd = rand.nextInt(moods.length);

    return moods[randInd];
 }


/*
 * Secondary methods ----------------------------------------------------------------
 */

 /*
 * @return Sequence of dance choreography
 */
 private static Sequence<Integer> choreography(){
    Sequence<Integer> randomSequence = new Sequence1L<>();

        Random random = new Random();

        final int total = 10;
        final int danceMove = 5;

        //iterate 10 times to add 10 numbers
        for (int i = 0; i < total; i++) {
            //generate a random integer between 1 and 5 (inclusive)
            int randomNumber = random.nextInt(danceMove) + 1;

            //add the random number to the end of the sequence
            randomSequence.add(randomSequence.length(), randomNumber);
        }

        return randomSequence;
 }

/*
 * main method
 */
public static void main(String[] args){

    String[] types = {"salsa", "ballet", "irish", "tap", "jazz"};
    //I'll probably need to add a constructor
    generateType(types);
    this.numBars();
    String[] moods = {"happy", "sad", "intense", "relaxed"};
    danceMood(moods);

    //some dance constructor
    choreography();

}

}
