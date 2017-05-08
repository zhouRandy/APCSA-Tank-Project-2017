/**
 * Created by User on 5/4/17.
 */
public class Runner {
    public static void main(String[] args) {
        boolean begin = true;
        System.out.println("Begin?(y/n)");
        String start = UserInput.getValidInput("y", "n");
        if(start.equals("n")){
            begin = false;
        }
        while(!begin){
            System.out.println("Begin?(y/n)");
            start = UserInput.getValidInput("y", "n");
            if(start.equals("y")){
                begin = true;
            }
        }

        Game g = new Game();
        g.start();
        g.draw();
        System.out.println("");
    }

}
