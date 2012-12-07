package Game;

import java.io.Serializable;

public class Pump implements Repair, Failure, Serializable {
    boolean on;
    boolean failed;
    double reversePressure;
    double reversePressureLimit;
    double reversePressureCriticialLimit;
    boolean endangered;
    double waterTransferRate;
    int timestepsInDanger;
    int pumpID;
    int repairCost;
    long timestepsSafe;
    double randomFailureRate;

    //Methods for turning the valve on and off
    private void turnOn(){
      on = true;
    }
    private void turnOff(){
      on = false;
    }

    //#####################Set Methods START#####################
    public void setOn(boolean on) {
        this.on = on;
    }

    public void setFailed(boolean failed) {
        this.failed = failed;
    }

    public void setReversePressure(double reversePressure) {
        this.reversePressure = reversePressure;
    }

    public void setReversePressureLimit(double reversePressureLimit) {
        this.reversePressureLimit = reversePressureLimit;
    }

    public void setReversePressureCriticialLimit(double reversePressureCriticialLimit) {
        this.reversePressureCriticialLimit = reversePressureCriticialLimit;
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }

    public void setWaterTransferRate(double waterTransferRate) {
        this.waterTransferRate = waterTransferRate;
    }

    public void setTimestepsInDanger(int timestepsInDanger) {
        this.timestepsInDanger = timestepsInDanger;
    }

    public void setPumpID(int pumpID) {
        this.pumpID = pumpID;
    }

    public void setRepairCost(int repairCost) {
        this.repairCost = repairCost;
    }

    public void setTimestepsSafe(long timestepsSafe) {
        this.timestepsSafe = timestepsSafe;
    }

    public void setRandomFailureRate(double randomFailureRate) {
        this.randomFailureRate = randomFailureRate;
    }
    //#####################Set Methods END#####################

    //#####################Get Methods START#####################
    public boolean isOn() {
        return on;
    }

    public boolean isFailed() {
        return failed;
    }

    public double getReversePressure() {
        return reversePressure;
    }

    public double getReversePressureLimit() {
        return reversePressureLimit;
    }

    public double getReversePressureCriticialLimit() {
        return reversePressureCriticialLimit;
    }

    public boolean isEndangered() {
        return endangered;
    }

    public double getWaterTransferRate() {
        return waterTransferRate;
    }

    public int getTimestepsInDanger() {
        return timestepsInDanger;
    }

    public int getPumpID() {
        return pumpID;
    }

    public int getRepairCost() {
        return repairCost;
    }

    public long getTimestepsSafe() {
        return timestepsSafe;
    }

    public double getRandomFailureRate() {
        return randomFailureRate;
    }
    //#####################Get Methods END#####################



    private void updateCalculations(double reactorPressure, boolean valveState)
    {
        
    }
    private void reversePressureCalculation(double reactorPressure, boolean valveState)
    {
        
    }
    
    public boolean updateNormalFailures(long currentTimestep)
    {
        return true;
    }
    
    public boolean updateRandomFailures(long currentTimestep)
    {
        return true;
    }
    
    public int repair()
    {
        return 1;
    }
}

