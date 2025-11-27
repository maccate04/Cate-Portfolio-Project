/*
 *
 * DanceBuilder1 class
 *
 * {@code DanceBuilder1} using Random
 *
 * @convention <pre>
 * All dances created with DanceBuilder will have all three kernel methods
 * called on DanceBuilder object in order (generateType, numBars, danceMood), or else
 * they will be incomplete dances.
 * The dance types must be real dance types such as ballet,
 * and the moods must be real moods such as happy.
 * </pre>
 *
 * @correspondance <pre>
 * Any dances built without all three kernel methods must
 *  have "" or 0 as fillers until methods are called.
 * </pre>
 *
 * @author Cate MacLaughlin
 *
 */

import java.util.Random;

public class DanceBuilder1 extends DanceBuilderSecondary {

    /**
     * private member.
     */
    private String rep;

    /**
     * Creates a String for DanceBuilder object.
     */
    private void createNewRep() {

        this.rep = "";

    }

    /**
     * No-argument constructor.
     */
    public DanceBuilder1() {

        this.createNewRep();

    }

    /**
     * Constructor with arguments.
     *
     * @param type
     *            of dance.
     *
     * @param bars
     *            of dance.
     *
     * @param mood
     *            of dance.
     *
     */
    public DanceBuilder1(String type, int bars, String mood) {
        this.createNewRep();

        if (type.equals("") && bars == 0 && mood.equals("")) {
            this.rep = "type: " + type + ", bars: " + bars + ", mood: " + mood;
        }

    }

    //Standard methods.

    /**
     * Clears DanceBuilder1 object.
     */
    public final void clear() {
        this.createNewRep();
    }

    /**
     * Makes newInstance of DanceBuilder1.
     */
    public final DanceBuilder newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    /**
     * Transfers DanceBuilder1.
     */
    public final void transferFrom(DanceBuilder source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof DanceBuilder1 : ""
                + "Violation of: source is of dynamic type DanceBuilderExample";

        DanceBuilder1 localSource = (DanceBuilder1) source;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }

    //Kernel methods.

    /*
     * @return type of dance as String from list of dances
     *
     * @param types holds different styles of dance
     */
    public String generateType(String[] types) {
        String type = "";

        //if types has length 0, return ""
        if (types.length == 0) {
            type = "";
        }

        //make a random variable and use nextInt to randomly choose a space
        Random rand = new Random();
        int randInd = rand.nextInt(types.length);
        type = types[randInd];

        this.rep += type;
        return type;
    }

    /*
     * @ensures number returned is even
     *
     * @return number of bars as int (this is an even number)
     */
    public final int numBars() {
        int randInd = 1;

        while (randInd % 2 != 0) {
            Random rand = new Random();
            randInd = rand.nextInt();
        }

        //returns the random int that must be even
        Integer(randInd).toString();
        this.rep += randInd;
        return randInd;
    }

    /*
     * @return mood of dance as String from list of moods
     *
     * @param moods is String[] of different dance moods.
     */
    String danceMood(String[] moods) {
        String mood = "";

        //if types has length 0, return ""
        if (moods.length == 0) {
            mood = "";
        }

        //make a random variable and use nextInt to randomly choose a space
        Random rand = new Random();
        int randInd = rand.nextInt(moods.length);
        mood = moods[randInd];

        this.rep += mood;
        return mood;
    }

}
