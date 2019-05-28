package com.hargun.hardware;

public class Mobile extends Computer{
    private String operatingSystem;
    private boolean canMakeCall;
    private String providername; //rogers,bell,telus

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isCanMakeCall() {
        return canMakeCall;
    }

    public void setCanMakeCall(boolean canMakeCall) {
        this.canMakeCall = canMakeCall;
    }

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername;
    }
}
