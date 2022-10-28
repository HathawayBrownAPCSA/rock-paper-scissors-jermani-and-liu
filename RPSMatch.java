
/**
 * Write a description of class RPSMatch here.
 *
 * @author (Jermani Jones and Liu von Engelbrechten)
 * @version (October 25, 2022)
 */
public class RPSMatch
{
    // private instance variables
    
    private int humanWins; 
    private int computerWins;
    private int ties; 
    private int humanPlay; 
    private int computerPlay;
    
    
    private final int ROCK = 0;
    private final int PAPER = 1;
    private final int SCISSORS = 2;
    
    // sets wins to 0 in the beginning 
    public RPSMatch()
    {
        humanWins = 0; 
        computerWins = 0; 
        ties = 0;
    }

        //declares the human play options 
    public void setHumanPlay(String hp)
    {
        if (hp.equals("rock"))
        {
            humanPlay = ROCK; 
        }
        else if (hp.equals("paper"))
        {
            humanPlay = PAPER;
        }
        else 
        {
            humanPlay = SCISSORS;
        }
    }
    
    /** retrieves computer play 
    * @return computer play as rock, paper, or scissors
    */ 
   
    public String getComputerPlay()
    {
        computerPlay = (int)(Math.random() * 3);
        if (computerPlay == 0) {
            return "rock";
        }
        else if (computerPlay == 1){
            return "paper";
        }
        else  {
            return "scissors";
        }
            
    }
    
    
    public String getResult()
    {
        //uses play from human and computer to determine winner (covers all specific instances), @return match outcome and adds the +1 to the outcome

        if (computerPlay == humanPlay){
            ties ++;
            return "It's a tie!";
        }
        else if ((computerPlay == 0 && humanPlay == 1) || (computerPlay == 1 && humanPlay == 2) || (computerPlay == 2 && humanPlay == 0)){
            humanWins++;
            return "Human wins!";
        }
        else if ((computerPlay == 0 && humanPlay == 2) || (computerPlay == 1 && humanPlay == 0) || (computerPlay == 2 && humanPlay == 1)){
            computerWins++;
            return "Computer wins!";
        }
        return "Something went wrong";
    }
        
    /**
     * get human wins
     * @return human wins
     */
    public int getHumanWins()
    {
        return humanWins;
    }
    
    /**
     * get computer wins
     * @return computer wins
     */
    public int getComputerWins()
    {
        return computerWins;
    }
    
    /**
     * get ties
     * @return ties
     */
    public int getTies()
    {
        return ties;
    }

    }

