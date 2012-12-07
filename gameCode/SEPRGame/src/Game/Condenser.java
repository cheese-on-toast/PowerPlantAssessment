package Game;

import java.io.Serializable;

public class Condenser implements Repair, Failure, Serializable {
    double currentWaterLevel;
    double currentTemperature;
    double currentPressure;
    double previousWaterLevel;
    double previousPressure;
    double previousTemperature;
    boolean failed;
    long lastFailed;
    double normalFailureRate;
    double randomFailureRate;
    boolean endangered;
    long timestepsInDanger;
    long timestepsSafe;
    int repairCost;

    //#####################Set Methods START#####################
    public void setCurrentWaterLevel(double currentWaterLevel) {
        this.currentWaterLevel = currentWaterLevel;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void setCurrentPressure(double currentPressure) {
        this.currentPressure = currentPressure;
    }

    public void setPreviousWaterLevel(double previousWaterLevel) {
        this.previousWaterLevel = previousWaterLevel;
    }

    public void setPreviousPressure(double previousPressure) {
        this.previousPressure = previousPressure;
    }

    public void setPreviousTemperature(double previousTemperature) {
        this.previousTemperature = previousTemperature;
    }

    public void setFailed(boolean failed) {
        this.failed = failed;
    }

    public void setLastFailed(long lastFailed) {
        this.lastFailed = lastFailed;
    }

    public void setNormalFailureRate(double normalFailureRate) {
        this.normalFailureRate = normalFailureRate;
    }

    public void setRandomFailureRate(double randomFailureRate) {
        this.randomFailureRate = randomFailureRate;
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }

    public void setTimestepsInDanger(long timestepsInDanger) {
        this.timestepsInDanger = timestepsInDanger;
    }

    public void setTimestepsSafe(long timestepsSafe) {
        this.timestepsSafe = timestepsSafe;
    }

    public void setRepairCost(int repairCost) {
        this.repairCost = repairCost;
    }
    //#####################Set Methods END#####################

    //#####################Get Methods START#####################
    public double getCurrentWaterLevel() {
        return currentWaterLevel;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getCurrentPressure() {
        return currentPressure;
    }

    public double getPreviousWaterLevel() {
        return previousWaterLevel;
    }

    public double getPreviousPressure() {
        return previousPressure;
    }

    public double getPreviousTemperature() {
        return previousTemperature;
    }

    public boolean isFailed() {
        return failed;
    }

    public long getLastFailed() {
        return lastFailed;
    }

    public double getNormalFailureRate() {
        return normalFailureRate;
    }

    public double getRandomFailureRate() {
        return randomFailureRate;
    }

    public boolean isEndangered() {
        return endangered;
    }

    public long getTimestepsInDanger() {
        return timestepsInDanger;
    }

    public long getTimestepsSafe() {
        return timestepsSafe;
    }

    public int getRepairCost() {
        return repairCost;
    }
    //#####################Get Methods END#####################

    private double condensationRate() //maybe rename this condensed volume rather than rate
    {
    	condensationRate = |(cuurentWaterLevel - ((n*R*currentWaterTemperature)/currentPressure))|;
        return 0; // some sort of volume not sure which one or whether there needs to be another variable
    }
    
    public double currentPressure(boolean SV1state, boolean SV2state, double reactorPressure)
    { 
    	currentPressure = (currentPressure + reactorPressure)/2;
        return currentPressure;
    }
    
    private void updateCalculations(boolean SV1state, boolean SV2state, double reactorPressure, double p1transfer, double p2transfer)
    {
    	this.currentPressure(SV1state, SV2state, reactorPressure);
        this.condensationRate;
        this.currentWaterTemperature;
        this.currentWaterLevel(p1transfer, p2transfer);
    }
    
    private double currentWaterTemperature()
    {
    	currentWaterTemperature = ((condensationRate*T)+(10*currentWaterLevel))/(condensationRate + currentWaterLevel);
        return currentTemperature;
    }
    
    private double currentWaterLevel(double p1transfer, double p2transfer)
    {  
    	currentWaterLevel = currentWaterLevel + condensationRate - (p1Transfer + p2Transfer);
        return currentWaterLevel;
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

