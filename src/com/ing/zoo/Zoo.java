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

//      Initialize HashMap that will contain all animals.
        Map<String, Animal> animalCollection = new HashMap<>();

//      Create animal objects and put each of them in the animalCollection HashMap.
        Lion henk = new Lion("henk");
        animalCollection.put(henk.name, henk);

        Hippo elsa = new Hippo("elsa");
        animalCollection.put(elsa.name, elsa);

        Pig dora = new Pig("dora");
        animalCollection.put(dora.name, dora);

        Tiger wally = new Tiger("wally");
        animalCollection.put(wally.name, wally);

        Zebra marty = new Zebra("marty");
        animalCollection.put(marty.name, marty);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");


        String input = scanner.nextLine();

//      Use method that corresponds with the given command. Remove given command from input string.
        if(input.contains(commands[0])){
            handleHello(animalCollection,input.replace(commands[0], ""));
        }else if(input.contains(commands[1])){
            handleHello(animalCollection,input.replace(commands[1], ""));

        }else if(input.contains(commands[2])){
            handleHello(animalCollection,input.replace(commands[2], ""));

        }else if(input.contains(commands[3])){
            handleHello(animalCollection,input.replace(commands[3], ""));

        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }

    public static void handleHello(Map<String, Animal>animalCollection, String text){
//      Trim leftover string to remove whitespaces and to get animal name.
        String trimmedInput = text.trim();

//      If leftover input is empty, let all animals say hello.
        if (trimmedInput.length() == 0) {
            animalCollection.values().forEach(Animal::sayHello);
        }
        if (animalCollection.containsKey(trimmedInput)) {
            Animal animal = animalCollection.get(trimmedInput);
            animal.sayHello();
        }
    }

    public static void handleLeaves(){

    }

    public static void handleMeat(){

    }

    public static void handleTrick(){

    }
}
