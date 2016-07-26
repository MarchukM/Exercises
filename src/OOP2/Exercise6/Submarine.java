package OOP2.Exercise6;

/**
 * Class represents a submarine.
 * @author Maxim
 * @version 1.0
 */
public class Submarine {
    private String name;
    private Engine engine;

    /**
     * @param name name of submarine
     */
    public Submarine(String name){
        this.name = name;
        engine = new Engine();
    }


    /**
     * nested class Engine
     */
    public class Engine{
        /**
         * Start engine
         */
        public void startEngine(){
            System.out.println("Submarine " +  "\"" + name + "\"" + " engine started!" );
        }
    }

    /**
     * Start engine from inner class
     */
    public void startEngine(){
        engine.startEngine();
    }


}
