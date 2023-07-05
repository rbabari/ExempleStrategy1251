/**
 * classe robot se deplace dan sla scene ..
 */
public class Robot {
    /**
     * C'Est le nom du robot
     */
    private String nom;
    /**
     * le comportement à donner ..
     */
    private IBehaviour behaviour;
    // constructeur avec paramètre
    public Robot(String nom) {
        this.nom = nom;
    }
    // constructeur surchargé overload
    public Robot(String nom, IBehaviour behaviour )
    {
        this.nom = nom;
        this.behaviour = behaviour;
    }
    // constructeuer par défault
    public Robot()
    {
        this.nom = "sans nom";
    }
    // constructeur de copie ?
    public Robot(Robot robot)
    {
        this.nom = robot.getNom();
        this.behaviour = robot.getBehaviour();
    }

    /**
     * getter ...
     * @return le nom du robot
     */
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return
     */
    public IBehaviour getBehaviour() {
        return behaviour;
    }

    /**
     * @param behaviour
     */
    public void setBehaviour(IBehaviour behaviour) {
        this.behaviour = behaviour;
    }


    public void move()
    {
        System.out.println("Le robot " + this.nom + " se déplace de la manièere :");
        this.behaviour.moveCommand();
    }

    @Override // redéfinie ...
    public String toString() {
        return "Robot{" +
                "nom='" + nom + '\'' +
                ", behaviour=" + behaviour.toString() +
                '}';
    }
}
