package RPS_4thPeriod;

import java.util.Random;
/**
 * Write a description of class RPSPlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RPSPlayer implements Player
{
    

    
    public RPSPlayer()
    {
        //Determine on your own
    }
    
     /**
     * If cpu = true, randomly generate
     * If cpu = false, ask user for input
     */
    public String pick(boolean cpu) {
        if (cpu==true){
            Random rand = new Random();
            int play = rand.nextInt(3);
            
        }
        else{
            
        }
    }
    
    
    public void setName(String n) {
        
    }

    
}
