
public class Tank extends Entity
{
    private boolean isDestroyed = false;
    private boolean passable = false;
    private boolean isPlayerChar;
    private int positionX;
    private int positionY;

    public Tank(boolean isDestroyed, boolean isPlayerChar, int positionx, int positiony)
    {
        super(false, "A");
        this.isDestroyed = isDestroyed;
        this.isPlayerChar = isPlayerChar;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    /**
     * fires the weapon
     * @return void
     */

    public void fire()
    {
        //calls fire
    }

    /**
     * moves the tank left or right
     * @param String direction
     */
    public void move(String direction)
    {
        if(direction.equals("L") || direction.equals("l"))
        {
            positionX--;
        }
        else 
        {
            positionX++;
        }
    }
}

