package com.example.administrator.arnavigatedemo.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/4/004.
 */

public class BeaconInfo implements Serializable {
    public String uuid;
    public int minor;
    public int major;
    public double locationX;
    public double locationY;
    public long floorId;
}
