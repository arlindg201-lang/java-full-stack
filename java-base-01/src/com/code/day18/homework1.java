package com.code.day18;

import java.util.Stack;

//## 第1题：俄罗斯套娃
//
//（1）定义俄罗斯套娃`MatryoshkaDoll`类，包含属性：角色名称name，尺寸size，按照基本Javabean定义该类。
//
//（2）一组由《熊出没》动画角色构成的俄罗斯套娃`MatryoshkaDoll`对象，依据从小到大的顺序压入栈
//
//（3）再按照从大到小的顺序弹出栈
public class homework1 {

    public class MatryoshkaDoll {//俄罗斯套娃
        private String name;
        private double size;

        public MatryoshkaDoll() {
        }

        public MatryoshkaDoll(String name, double size) {
            this.name = name;
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSize() {
            return size;
        }

        public void setSize(double size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "MatryoshkaDoll{" +
                    "name='" + name + '\'' +
                    ", size=" + size +
                    '}';
        }
    }

    public void main(String[] args) {
        Stack<MatryoshkaDoll> dolls = new Stack<>();
        dolls.push(new MatryoshkaDoll("涂涂",1));
        dolls.push(new MatryoshkaDoll("肥波",2));
        dolls.push(new MatryoshkaDoll("毛毛",3));
        dolls.push(new MatryoshkaDoll("吉吉",4));
        dolls.push(new MatryoshkaDoll("光头强",5));
        dolls.push(new MatryoshkaDoll("熊二",6));
        dolls.push(new MatryoshkaDoll("熊大",7));

        while(!dolls.isEmpty()){
            System.out.println(dolls.pop());
        }
    }


}
