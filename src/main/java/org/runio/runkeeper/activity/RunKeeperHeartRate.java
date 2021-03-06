package org.runio.runkeeper.activity;

import com.google.gson.annotations.SerializedName;

public class RunKeeperHeartRate {

    @SerializedName("timestamp")
    private double secondsSinceStartOfActivity;

    @SerializedName("heart_rate")
    private int heartRateInBpm;

    RunKeeperHeartRate(double secondsSinceStartOfActivity, int heartRateInBpm) {
        this.secondsSinceStartOfActivity = secondsSinceStartOfActivity;
        this.heartRateInBpm = heartRateInBpm;
    }

    public double getSecondsSinceStartOfActivity() {
        return secondsSinceStartOfActivity;
    }

    public int getHeartRateInBpm() {
        return heartRateInBpm;
    }
}
