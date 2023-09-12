package com.example.chatboat;

public class Message {

    public static String SENT_BY_ME="me";
    public static String SENT_BY_BOT="you";

    String massage;
    String sendBy;

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getSendBy() {
        return sendBy;
    }

    public void setSendBy(String sendBy) {
        this.sendBy = sendBy;
    }

    public Message(String massage , String sendBy) {
        this.massage = massage;
        this.sendBy = sendBy;
    }
}
