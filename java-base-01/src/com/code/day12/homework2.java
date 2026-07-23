package com.code.day12;
//（1）定义一个名为`Season`的枚举，包含四个季节：春（Spring）、夏（Summer）、秋（Autumn）、冬（Winter）。为每个季节添加一个方法`getDescription()`，返回该季节的简短描述。
//
//（2）在测试类`TestSeason`中，遍历所有的季节枚举对象

public class homework2 {

    public enum Season {
        Spring("Spring"),
        Summer("Summer"),
        Autumn("Autumn"),
        Winter("Winter");
        private final String description;
        Season(String description) {
            this.description = description;
        }
        public String getDescription() {
            return description;
        }
    }

     public class TestSeason {
        public static void main(String[] args) {
            //遍历所有季节枚举对象
            Season[] seasons = Season.values();
            for (int i = 0; i < seasons.length; i++) {
                System.out.println(seasons[i].name() + ": " + seasons[i].getDescription
                        ());
            }
        }
    }


}
