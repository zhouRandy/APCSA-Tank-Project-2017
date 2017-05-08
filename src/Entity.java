/**
 * Created by User on 5/8/17.
 */
public abstract class Entity {
    private boolean passable;
    private String name;
    private String[][] board;
    public Entity(boolean passable, String name){
        this.passable = passable;
        this.name = name;
    }
    public Entity(){
        passable = false;
        name = null;

    }
    public String getName(){return name;}
    public boolean getPassable(){return passable;}

}
