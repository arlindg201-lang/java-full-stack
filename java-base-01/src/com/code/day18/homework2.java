package com.code.day18;

import java.util.LinkedList;

//## 第2题：插队游戏
//
//模拟如下场景：
//
//- 光头强来排队
//- 熊二插队到队头
//- 熊大排到队尾
//- 吉吉耍赖排到队头
//- 毛毛排到队尾
//- 肥波插队到队头
//
//查看现在队伍情况。
public class homework2 {



        public static void main(String[] args) {
            LinkedList<String> queue = new LinkedList<>();
            queue.addFirst("光头强");
            queue.addFirst("熊二");
            queue.addLast("熊大");
            queue.addFirst("吉吉");
            queue.addLast("毛毛");
            queue.addFirst("肥波");
            System.out.println(queue);
        }

    }
