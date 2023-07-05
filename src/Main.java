/**
 * Implémentation du design pattern strategy
 * @author  rb
 *
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /**
     * méthode principale ...
     * Le but est de  modifier le comportement du robot au moment de l'execution runtime sans change de robot
     * @param args sert à ajouter des parametres quand vous executer votre code java sur console
     */
    public static void main(String[] args) {

            System.out.println(" " );

            //crée des robots
            Robot r1 = new Robot("robot cop", new NormalBehaviour());
            Robot r2 = new Robot("Big robot");

            r2.setBehaviour(new NormalBehaviour());

            r1.move();
            r2.move();
            // set le comportement des robots
            r2.setBehaviour(new AggressifBehaviour());
            r1.setBehaviour(new DefensifBehaviour());

            // re executer la méthode move
             r2.move();
             r1.move();



    }
}