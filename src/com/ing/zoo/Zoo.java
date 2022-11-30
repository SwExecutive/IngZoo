package com.ing.zoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Map<String, Animal> animalCollection = new HashMap<>();

        Lion henk = new Lion();
        henk.name = "henk";
        animalCollection.put(henk.name, henk);

        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        animalCollection.put(elsa.name, elsa);

        Pig dora = new Pig();
        dora.name = "dora";
        animalCollection.put(dora.name, dora);

        Tiger wally = new Tiger();
        wally.name = "wally";
        animalCollection.put(wally.name, wally);

        Zebra marty = new Zebra();
        marty.name = "marty";
        animalCollection.put(marty.name, marty);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");


        String input = scanner.nextLine();
        if(input.equals(commands[0] + " henk"))
        {
            henk.sayHello();
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }

    public static void handleHello(){

    }

    public static void handleLeaves(){

    }

    public static void handleMeat(){

    }

    public static void handleTrick(){

    }
}
