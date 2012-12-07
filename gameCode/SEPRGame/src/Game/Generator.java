package Game;

public class Generator {
    double totalPower;
    double currentPowerOutput;


    //#####################Set Methods START#####################
    public void setTotalPower(double totalPower) {
        this.totalPower = totalPower;
    }

    public void setCurrentPowerOutput(double currentPowerOutput) {
        this.currentPowerOutput = currentPowerOutput;
    }
    //#####################Set Methods END#####################

    //#####################Get Methods START#####################
    public double getTotalPower() {
        return totalPower;
    }

    public double getCurrentPowerOutput() {
        return currentPowerOutput;
    }
    //#####################Get Methods END#####################

    public double getTotalOutput()
    {
        return currentPowerOutput;
    }
    
    private void decreaseTotalOutput(int percentage)
    {
        
    }
    
    private void increasetotalOutput(int percentage)
    {
        
    }
    
    private double calculateCurrentPowerOutput(double speed)
    {
        return currentPowerOutput;
    }
    
    private void updateCalculations(double speed)
    {
        
    }
}
