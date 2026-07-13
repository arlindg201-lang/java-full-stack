package com.code.day08;
//（1）设计一个`TemperatureSensor`类，包含：
//
//- 私有属性`temperature`（温度）。
//- 静态常量`LOW_THRESHOLD`：表示预设的最低临界温度阈值，初始化为0.0。
//- 静态常量`HIGH_THRESHOLD`：表示预设的最高临界温度阈值，初始化为100.0。
//- 提供无参和有参构造，便于创建对象。
//- 提供一个方法`updateTemperature(double temp)`来更新温度读数，并且有一个`getTemperature()`方法返回当前温度。
//- 提供最低和最高临界温度阈值的get方法。
//- 此外，实现一个`isCritical()`方法，如果温度超过预设阈值则返回`true`。
//
//（2）声明一个`TestTemperatureSensor`测试类，创建`TemperatureSensor`类对象，查看当前温度以及最低和最高温度阈值，尝试更新温度，重新查看当前温度，并判断是否超过临界温度。
public class TemperatureSensor {
    private double temperature;
    private static final double LOW_THRESHOLD = 0.0; // 预设的最低临界温度阈值
    private static final double HIGH_THRESHOLD = 100.0; // 预设的最高临界温度阈值

    public TemperatureSensor() {
    }

    public TemperatureSensor(double temperature) {
        this.temperature = temperature;
    }

    /**
     * 更新温度读数。
     * @param temp 新的温度读数
     */
    public void updateTemperature(double temp) {
        this.temperature = temp;
    }

    /**
     * 获取当前温度。
     * @return 当前温度
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * 判断当前温度是否超过临界温度阈值。
     * @return 如果超过阈值返回true，否则返回false
     */
    public boolean isCritical() {
        return temperature > HIGH_THRESHOLD || temperature < LOW_THRESHOLD;
    }

    public static double getLowThreshold() {
        return LOW_THRESHOLD;
    }

    public static double getHighThreshold() {
        return HIGH_THRESHOLD;
    }
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor(20.0);
        System.out.println("当前温度值：" + sensor.getTemperature());
        System.out.println("最低温度临界值：" + TemperatureSensor.getLowThreshold());
        System.out.println("最高温度临界值：" + TemperatureSensor.getHighThreshold());

        sensor.updateTemperature(95.0);
        System.out.println("当前温度值： " + sensor.getTemperature() + "℃");
        System.out.println("是否超过临界值: " + sensor.isCritical());

        sensor.updateTemperature(105.0);
        System.out.println("当前温度值： " + sensor.getTemperature() + "℃");
        System.out.println("是否超过临界值：" + sensor.isCritical());
    }

}
