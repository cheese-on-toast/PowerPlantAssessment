package Game;

import java.io.Serializable;

public class OperatingSoftware implements Repair, Failure, Serializable {
    int rebootTakes;
    int tillReboot; // this may involve reboot takes
    int repairCost;
    boolean failed;
    boolean failureMode;
    double randomfailureRate;
    long lastFailed;
    long timestepsSafe;
    
    private void swapCommands()
    {
        
    }
    private boolean parseCommand(String command)
    {
        boolean accepted = false;
        return accepted;           
    }
    
    private void reboot(long currentTimestep)
    {
        
    }
    
    public boolean updateNormalFailures(Long currentTimestep)
    {
        return true;
    }
    
    public boolean updateRandomFailures(Long currentTimestep)
    {
        return true;
    }
    
    public int repair()
    {
        return 1;
    }
}
