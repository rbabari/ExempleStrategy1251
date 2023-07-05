/**
 * classe comportemenr afgressif ....
 */
public class AggressifBehaviour implements IBehaviour {
    /**
     * @return un int de -5 à +5 pou explique le degres d'agressivité du robot
     */
    @Override
    public int moveCommand() {

        System.out.println("Le robot poursuit la position du joueur robot.setDestination() et robot.tirerProjectile() ");
        return 1;
    }
}
