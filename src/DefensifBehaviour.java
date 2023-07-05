


public class DefensifBehaviour implements IBehaviour{

    @Override
    public int moveCommand() {

        System.out.println("comportement defensif : prendre la fuite ");
        return -1;
    }
}
