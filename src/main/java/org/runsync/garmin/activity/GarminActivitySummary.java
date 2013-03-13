package org.runsync.garmin.activity;

import org.joda.time.LocalDateTime;

public class GarminActivitySummary {

    private long activityId;
    private String activityName;
    private String activityDescription;
    private String locationName;
    private boolean isTitled;
    private boolean isElevationCorrected;
    private boolean isBarometricCapable;
    private boolean isSwimAlgorithmCapable;
    private boolean isActivityEdited;
    private boolean favorite;
    private boolean ispr;
    private long userId;
    private String username;
    private String displayname;
    private LocalDateTime uploadDate;
    private GarminUploadSource uploadApplication;
    private GarminUploadSource device;
    private String deviceId;
    private String deviceImageUrl;
    private boolean isDeviceReleased;
    private String externalId;
    private GarminField privacy;
    private long numTrackpoints;
    private GarminActivityType activityType;
    private GarminField eventType;
    private GarminTimeZone activityTimeZone;
    private String localizedSpeedLabel;
    private String localizedPaceLabel;
    private GarminMeasurementSummaries activitySummary;
    private boolean garminSwimAlgorithm;
    private LocalDateTime updatedDate;
    private String updatedDateFormatted;
    private String[] userRoles;

    public long getActivityId() {
        return activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public String getLocationName() {
        return locationName;
    }

    public boolean getTitled() {
        return isTitled;
    }

    public boolean getElevationCorrected() {
        return isElevationCorrected;
    }

    public boolean getBarometricCapable() {
        return isBarometricCapable;
    }

    public boolean getSwimAlgorithmCapable() {
        return isSwimAlgorithmCapable;
    }

    public boolean getActivityEdited() {
        return isActivityEdited;
    }

    public boolean getFavorite() {
        return favorite;
    }

    public boolean getIspr() {
        return ispr;
    }

    public long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getDisplayname() {
        return displayname;
    }

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public GarminUploadSource getUploadApplication() {
        return uploadApplication;
    }

    public GarminUploadSource getDevice() {
        return device;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getDeviceImageUrl() {
        return deviceImageUrl;
    }

    public boolean getDeviceReleased() {
        return isDeviceReleased;
    }

    public String getExternalId() {
        return externalId;
    }

    public GarminField getPrivacy() {
        return privacy;
    }

    public long getNumTrackpoints() {
        return numTrackpoints;
    }

    public GarminActivityType getActivityType() {
        return activityType;
    }

    public GarminField getEventType() {
        return eventType;
    }

    public GarminTimeZone getActivityTimeZone() {
        return activityTimeZone;
    }

    public String getLocalizedSpeedLabel() {
        return localizedSpeedLabel;
    }

    public String getLocalizedPaceLabel() {
        return localizedPaceLabel;
    }

    public GarminMeasurementSummaries getActivitySummary() {
        return activitySummary;
    }

    public boolean getGarminSwimAlgorithm() {
        return garminSwimAlgorithm;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public String getUpdatedDateFormatted() {
        return updatedDateFormatted;
    }

    public String[] getUserRoles() {
        return userRoles;
    }
}