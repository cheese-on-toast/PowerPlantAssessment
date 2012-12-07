package Game;

import java.io.Serializable;

public class Turbine implements Repair, Failure, Serializable {
    boolean failed;
    public int speedRPM;
    long lastFailed;
    double randomFailureRate;
    int speedLimitRPM;
    int speedCriticalLimit;
    boolean endangered;
    int timestepsInDanger;
    long timestepsSafe;
    int repairCost; //as a percentage

    //#####################Set Methods START#####################

    public void setFailed(boolean failed) {
        this.failed = failed;
    }

    public void setSpeedRPM(int speedRPM) {
        this.speedRPM = speedRPM;
    }

    public void setLastFailed(long lastFailed) {
        this.lastFailed = lastFailed;
    }

    public void setRandomFailureRate(double randomFailureRate) {
        this.randomFailureRate = randomFailureRate;
    }

    public void setSpeedLimitRPM(int speedLimitRPM) {
        this.speedLimitRPM = speedLimitRPM;
    }

    public void setSpeedCriticalLimit(int speedCriticalLimit) {
        this.speedCriticalLimit = speedCriticalLimit;
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }

    public void setTimestepsInDanger(int timestepsInDanger) {
        this.timestepsInDanger = timestepsInDanger;
    }

    public void setTimestepsSafe(long timestepsSafe) {
        this.timestepsSafe = timestepsSafe;
    }

    public void setRepairCost(int repairCost) {
        this.repairCost = repairCost;
    }
    //#####################Set methods END#####################


    //#####################Get methods START#####################
    public boolean isFailed() {
        return failed;
    }

    public int getSpeedRPM() {
        return speedRPM;
    }

    public long getLastFailed() {
        return lastFailed;
    }

    public double getRandomFailureRate() {
        return randomFailureRate;
    }

    public int getSpeedLimitRPM() {
        return speedLimitRPM;
    }

    public int getSpeedCriticalLimit() {
        return speedCriticalLimit;
    }

    public boolean isEndangered() {
        return endangered;
    }

    public int getTimestepsInDanger() {
        return timestepsInDanger;
    }

    public long getTimestepsSafe() {
        return timestepsSafe;
    }

    public int getRepairCost() {
        return repairCost;
    }

    //#####################Get methods END#####################

    private void updateCalculations(double oldPressure, double newPressure, boolean SV1state, boolean SV2state) {

    }

    public double speed(double oldPressure, double newPressure, boolean SV1state, boolean SV2state) {
        if (newPressure > oldPressure)//in requirements it says reactor pressure > condenser pressure and i assumed newpressure = reactor pressure and oldpressure = condenser pressure
        {
        	speedRPM = 15*(newPressure - oldPressure);
        }
        else if ((newPressure > oldPressure) && SV1state = true && SV2state = true)
        {
        	speedRPM = (15*(newPressure - oldPressure))/2;
        }
        	return speedRPM;
    }

    public boolean updateNormalFailures(Long currentTimestep) {
        return true;
    }

    public boolean updateRandomFailures(Long currentTimestep) {
        return true;
    }

    public int repair() {
        return 1;
    }
}
