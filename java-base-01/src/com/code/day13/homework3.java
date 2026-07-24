package com.code.day13;
//（1）声明设备状态枚举类Status
//
//- 声明final修饰的String类型的属性description和int类型的属性value，value值初始化为ordinal()值
//- 声明有参构造Status(String description)
//- 重写toString方法，返回description值
//- 提供静态方法public static Status getByValue(int value)：根据value值获取Status状态对象
//- 创建3个常量对象：
public class homework3 {
    public enum Status {

        // ========== 3个常量对象 ==========
        // 根据 ordianl() 自动赋值 value：READY=0, RUNNING=1, STOPPED=2
        READY("就绪"),
        RUNNING("运行中"),
        STOPPED("已停止");

        // ========== 属性 ==========
        private final String description;   // 状态描述
        private final int value;            // 状态值，初始化为 ordinal()

        // ========== 构造器 ==========
        Status(String description) {
            this.description = description;
            this.value = this.ordinal();    // ordinal() 返回枚举常量的索引（0, 1, 2...）
        }

        // ========== getter 方法 ==========
        public String getDescription() {
            return description;
        }

        public int getValue() {
            return value;
        }

        // ========== 重写 toString ==========
        @Override
        public String toString() {
            return description;
        }

        // ========== 静态方法：根据 value 获取枚举对象 ==========
        public static Status getByValue(int value) {
            // 遍历所有枚举常量
            for (Status status : Status.values()) {
                if (status.value == value) {
                    return status;
                }
            }
            // 如果找不到，返回 null 或抛出异常（根据业务需求决定）
            return null;
        }
    }
    public class Equipment {
        private int id;
        private String factory;
        private double price;
        private String name;
        private Status status;

        public Equipment() {}

        public Equipment(int id, String factory, double price, String name, Status status) {
            this.id = id;
            this.factory = factory;
            this.price = price;
            this.name = name;
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFactory() {
            return factory;
        }

        public void setFactory(String factory) {
            this.factory = factory;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Equipment{" +
                    "id=" + id +
                    ", factory='" + factory + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", status=" + status +
                    '}';
        }
    }

    public class Data {
        public static final String[][] EQUIPMENTS = {
                {"1", "联想", "6000", "拯救者","0"},
                {"2", "宏碁 ","5000", "AT7-N52","0"},
                {"3", "小米", "2000", "5V5Pro","1"},
                {"4", "戴尔", "4000", "3800-R33","1"},
                {"5", "苹果", "12000", "MBP15","1"},
                {"6", "华硕", "8000", "K30BD-21寸","2"},
                {"7", "联想", "7000", "YOGA","0"},
                {"8", "惠普", "5800", "X500","2"},
                {"9", "苹果", "4500","2021Pro","0"},
                {"10", "惠普", "5800", "FZ5","1"}
        };
    }

    public class TestEquipment {
        public void main(String[] args) {
            Equipment[] arr = new Equipment[Data.EQUIPMENTS.length];

            for (int i = 0; i < arr.length; i++) {
                int id = Integer.parseInt(Data.EQUIPMENTS[i][0]);
                String factory = Data.EQUIPMENTS[i][1];
                double price = Double.parseDouble(Data.EQUIPMENTS[i][2]);
                String name = Data.EQUIPMENTS[i][3];
                int value = Integer.parseInt(Data.EQUIPMENTS[i][4]);
                Status status = Status.getByValue(value);
                arr[i] = new Equipment(id,factory,price,name,status);
                System.out.println(arr[i]);
            }
        }
    }

}

