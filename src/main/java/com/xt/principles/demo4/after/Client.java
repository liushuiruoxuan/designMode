package com.xt.principles.demo4.after;

public class Client {
    public static void main(String[] args) {
        HeiMaSafetyfoor door = new HeiMaSafetyfoor();
        door.antiTheft();
        door.fireproof();
        door.waterproof();

        ItcastSafetyDoor door1 = new ItcastSafetyDoor();
        door1.antiTheft();
        door1.fireproof();
    }
}
