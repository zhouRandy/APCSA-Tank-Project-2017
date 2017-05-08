import java.util.Arrays;

/**
 * Created by User on 5/4/17.
 */
public class Game {
    private Entity[][] board;
    public Game(){
        this.board = new Entity[][]{
                {new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air()},
                {new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air()},
                {new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air()},
                {new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air()},
                {new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air()},
                {new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air()},
                {new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air()},
                {new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air()},
                {new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air()},
                {new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air(), new Air(),new Air(), new Air()},
                {new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground()},
                {new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground(), new Ground()}};
        /*for(int i = 0; i < board.length; i++){
            Arrays.fill(board[i], new Ground());
        }
        for(int i = 0; i < board.length-3; i++){
            Arrays.fill(board[i], new Air());
        }
        Arrays.fill(board[0], new Air());
        Arrays.fill(board[1], new Air());
        Arrays.fill(board[2], new Air());
        Arrays.fill(board[3], new Air());
        Arrays.fill(board[4], new Air());
        Arrays.fill(board[5], new Air());
        Arrays.fill(board[6], new Air());
        Arrays.fill(board[7], new Air());
        Arrays.fill(board[8], new Air());
        Arrays.fill(board[9], new Ground());
        Arrays.fill(board[10], new Ground());
        Arrays.fill(board[11], new Ground());*/



    }

    public void start(){
        System.out.println("\n");System.out.println("\n");System.out.println("\n");
        System.out.println("\n");System.out.println("\n");System.out.println("\n");
        System.out.println("\n");System.out.println("\n");System.out.println("\n");
        System.out.println("\n");System.out.println("\n");System.out.println("\n");
    }

    public void draw() {
        for(int i = 0; i<board.length; i++)
        {
            for(int j = 0; j<board[0].length; j++)
            {
                System.out.print(board[i][j].getName());
            }
            System.out.println();
        }
    }

    public void fire(int angle){
        //to be implemented
    }
}
