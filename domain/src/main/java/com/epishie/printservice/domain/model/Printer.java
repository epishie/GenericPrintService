package com.epishie.printservice.domain.model;

public class Printer {

    private final String mIpAddress;

    private String mName;

    public Printer(String ipAddress) {
        mIpAddress = ipAddress;
    }

    public String getIpAddress() {
        return mIpAddress;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
