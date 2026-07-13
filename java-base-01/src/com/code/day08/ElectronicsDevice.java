package com.code.day08;

public class ElectronicsDevice {
    private String brand;
    private String model;
    private boolean powerStatus;//电源是否开启状态
    private int batteryLevel;

    public ElectronicsDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = false;
        this.batteryLevel = 100; // 设备初始化时电池电量为100%
    }

    public void turnOn() {
        if (!powerStatus) {
            powerStatus = true;
            System.out.println(brand + " " + model + " 已经打开");
        } else {
            System.out.println(brand + " " + model + " 已经处于开启状态");
        }
    }

    public void turnOff() {
        if (powerStatus) {
            powerStatus = false;
            System.out.println(brand + " " + model + " 已经关闭");
        } else {
            System.out.println(brand + " " + model + " 已经处于关闭状态");
        }
    }

    public void charge(int percentage) {
        if (percentage >= 0 && percentage <= 100) {
            batteryLevel = Math.min(batteryLevel + percentage, 100);
            System.out.println("正在给 " + brand + " " + model + " 充电，当前电量：" + batteryLevel + "%");
        } else {
            System.out.println("充电百分比必须在0到100之间");
        }
    }

    public void discharge(int percentage) {
        if (percentage >= 0 && percentage <= 100) {
            batteryLevel = Math.max(batteryLevel - percentage, 0);
            System.out.println("正在给 " + brand + " " + model + " 放电，当前电量：" + batteryLevel + "%");
        } else {
            System.out.println("放电百分比必须在0到100之间");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isPowerStatus() {
        return powerStatus;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public String getDetail(){
        return "品牌：" + brand +"，型号：" + model + "，电量：" + batteryLevel +"，电源是否开启状态：" + (powerStatus?"开启":"关闭");
    }

    public static void main(String[] args) {
        ElectronicsDevice device1 = new ElectronicsDevice("Apple", "iPhone 14 Pro Max");
        device1.turnOn();
        device1.discharge(30);
        device1.charge(20);
        device1.turnOff();

        ElectronicsDevice device2 = new ElectronicsDevice("Samsung", "Galaxy S23 Ultra");
        device2.turnOn();
        device2.discharge(50);
        device2.charge(40);
        device2.turnOff();
    }


}
