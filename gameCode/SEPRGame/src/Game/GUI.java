package Game;

import java.util.ArrayList;

public class GUI {
    Load loader = new Load();
    Save saver = new Save();
    Timestep timestep = new Timestep();
    PlantConfiguration plantConfiguration = new PlantConfiguration();
    OperatingSoftware OperatingSoftware = new OperatingSoftware();
    ArrayList<Save> savedGames = new ArrayList<Save>();
            
    public boolean commandReader(String command)
    {
        boolean ifCommand = false; 
        return ifCommand;
    }
    
    public String obtainName()
    {
        return "john doe";
    }
    public void tellToPlayer(String what)
    {
        
    }
   
    public void startTimer()
    {
        
    }
    public void startGameRoutine()
    {
        
    }
    public void pauseGameRoutine()
    {
        
    }
    public void loadGameRoutine(String fromFile)
    {
        
    }
    public void saveGameRoutine(String toFile)
    {
        
    }
    public void updatePlantInfo()
    {
        
    }
    public void resumeGameRoutine()
    {
        
    }
}

