
/**
 * Write a description of class RPSMatch2 here.
 *
 * @author (Jermani Jones and Liu von Engelbrechten)
 * @version (October 25, 2022)
 */
public class RPSMatch2
{
    // instance variables - replace the example below with your own
    
    private int humanWins; 
    private int computerWins;
    private int ties; 
    private int humanPlay; 
    private int computerPlay;
    
    
    private final int ROCK = 0;
    private final int PAPER = 1;
    private final int SCISSORS = 2;
    
    public RPSMatch2()
    {
        humanWins = 0; 
        computerWins = 0; 
        ties = 0;
    }

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
    
     
            
    public String getComputerPlay()
    {
        if (humanPlay == 1)
        {computerPlay = (int)(Math.random()*1+1.5);}
        if (humanPlay == 2)
        {
            computerPlay = (int)(Math.random()*2);
        }
        if (humanPlay == 0)
        {
            computerPlay = (int)(Math.random()*2);
        }
        if (computerPlay == 0)
        { 
        return ("Rock");
        }
    
        else if (computerPlay == 1)
    
        {
        return ("Paper");
        }
        else 
        {
        return ("Scissors");
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
    
    public int getHumanWins()
    {
        return humanWins;
    }
    
    public int getComputerWins()
    {
        return computerWins;
    }
    
    public int getTies()
    {
        return ties;
    }

    }

