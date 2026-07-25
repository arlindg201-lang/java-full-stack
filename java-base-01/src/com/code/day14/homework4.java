package com.code.day14;

import org.junit.Test;

import java.io.*;

//（1）声明一个Message类，包含：发送者、接收者、消息内容、发送时间等属性，属性私有化，提供有参构造，get/set，重写toString
//
//（2）创建一个Message对象，并写到message.dat文件中，并再次读取显示
public class homework4 {

    public class Message implements Serializable {
        private static final long serialVersionUID = 1L;
        private String sender;
        private String receiver;
        private String content;
        private String sendTime;
        public Message(String sender, String receiver, String content, long sendTime) {
            this.sender = sender;
            this.receiver = receiver;
            this.content = content;
            this.sendTime = String.valueOf(sendTime);
        }
        // getters and setters
        public String getSender() {
            return sender;
        }
        public void setSender(String sender) {
            this.sender = sender;
        }
        public String getReceiver() {
            return receiver;
        }
        public void setReceiver(String receiver) {
            this.receiver = receiver;
        }
        public String getContent() {
            return content;
        }
        public void setContent(String content) {
            this.content = content;
        }
        public String getSendTime() {
            return sendTime;
        }
        public void setSendTime(String sendTime) {
            this.sendTime = sendTime;
        }
        @Override
        public String toString() {
            return "Message [sender=" + sender + ", receiver="
                    + receiver + ", content=" + content + ", sendTime="
                    + sendTime + "]";
        }

        @Test
        public void test01() throws FileNotFoundException, IOException{
            Message msg = new Message("柴老师", "佟老师", "加工资", System.currentTimeMillis());
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("message.dat"));
            oos.writeObject(msg);
            oos.close();
        }
        @Test
        public void test02() throws FileNotFoundException, IOException, ClassNotFoundException{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("message.dat"));
            Object msg = ois.readObject();
            System.out.println(msg);
            ois.close();
        }



        }
    }

