package Game;

import java.io.Serializable;

public class Reactor implements Failure, Serializable {
    boolean failed;
    double currentWaterLevel;
    double previousTemperature;
    double previousPressure;
    int rodsLevel; //percentage
    double pressureLimit;
    boolean endangeredByPressure;
    double criticalPressureLimit;
    int timestepsInDangerOfTemperature;
    double currentPressure;
    double currentTemperature;
    double previousWaterLevel;
    double criticalTemperaturLimit;
    double temperatureLimit;
    boolean endangeredByTemperature;
    int timestepsInDangerOfPressure;

    //#####################Set Methods START#####################
    public void setFailed(boolean failed) {
        this.failed = failed;
    }

    public void setCurrentWaterLevel(double currentWaterLevel) {
        this.currentWaterLevel = currentWaterLevel;
    }

    public void setPreviousTemperature(double previousTemperature) {
        this.previousTemperature = previousTemperature;
    }

    public void setPreviousPressure(double previousPressure) {
        this.previousPressure = previousPressure;
    }

    public void setRodsLevel(int rodsLevel) {
        this.rodsLevel = rodsLevel;
    }

    public void setPressureLimit(double pressureLimit) {
        this.pressureLimit = pressureLimit;
    }

    public void setEndangeredByPressure(boolean endangeredByPressure) {
        this.endangeredByPressure = endangeredByPressure;
    }

    public void setCriticalPressureLimit(double criticalPressureLimit) {
        this.criticalPressureLimit = criticalPressureLimit;
    }

    public void setTimestepsInDangerOfTemperature(int timestepsInDangerOfTemperature) {
        this.timestepsInDangerOfTemperature = timestepsInDangerOfTemperature;
    }

    public void setCurrentPressure(double currentPressure) {
        this.currentPressure = currentPressure;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void setPreviousWaterLevel(double previousWaterLevel) {
        this.previousWaterLevel = previousWaterLevel;
    }

    public void setCriticalTemperaturLimit(double criticalTemperaturLimit) {
        this.criticalTemperaturLimit = criticalTemperaturLimit;
    }

    public void setTemperatureLimit(double temperatureLimit) {
        this.temperatureLimit = temperatureLimit;
    }

    public void setEndangeredByTemperature(boolean endangeredByTemperature) {
        this.endangeredByTemperature = endangeredByTemperature;
    }

    public void setTimestepsInDangerOfPressure(int timestepsInDangerOfPressure) {
        this.timestepsInDangerOfPressure = timestepsInDangerOfPressure;
    }
    //#####################Set Methods END#####################

    //#####################Get Methods START#####################
    public boolean isFailed() {
        return failed;
    }

    public double getCurrentWaterLevel() {
        return currentWaterLevel;
    }

    public double getPreviousTemperature() {
        return previousTemperature;
    }

    public double getPreviousPressure() {
        return previousPressure;
    }

    public int getRodsLevel() {
        return rodsLevel;
    }

    public double getPressureLimit() {
        return pressureLimit;
    }

    public boolean isEndangeredByPressure() {
        return endangeredByPressure;
    }

    public double getCriticalPressureLimit() {
        return criticalPressureLimit;
    }

    public int getTimestepsInDangerOfTemperature() {
        return timestepsInDangerOfTemperature;
    }

    public double getCurrentPressure() {
        return currentPressure;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getPreviousWaterLevel() {
        return previousWaterLevel;
    }

    public double getCriticalTemperaturLimit() {
        return criticalTemperaturLimit;
    }

    public double getTemperatureLimit() {
        return temperatureLimit;
    }

    public boolean isEndangeredByTemperature() {
        return endangeredByTemperature;
    }

    public int getTimestepsInDangerOfPressure() {
        return timestepsInDangerOfPressure;
    }
    //#####################Get Methods START#####################
    
    private double currentTemperature(double p1Transfer, double p2Transfer)
    {
    	int Case = 0;
    	if (currentWaterLevel = 25)
    	{
    		Case = 0.5*rodLevel;
    	}
    	else if (currentWaterLevel < 25)
    	{
    		Case = (0.5*rodLevel)*(25-(VA+VB));
    	}
    	else if (currentWaterLevel = > 25)
    	{
    		Case = (0.5*rodLevel)*(1.5+(0.1*(VA+VB)-25)));
    	}
        currentTemperature = ((VA*TA)+(VB*TB))/((VA+VB)+Case);
    	return currentTemperature;
    }
    
    public double currentPressure(boolean SV1state, boolean SV2state, double condenserPressure)
    {
    	(nRT)/V;
        return currentPressure;
    }
    
    private double currentWaterLevel(double p1Transfer, double p2Transfer)
    {
    	currentWaterLevel = currentWaterLevel + (p1Transfer+p2Transfer);
        return currentWaterLevel;
    }
    
    private void updateCalculations(double p1Transfer, double p2Transfer, boolean SV1state, boolean SV2state, double condenserPressure)
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
    
}
