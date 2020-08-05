package liam.chipman;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static int str_score = 0;
    public static int dex_score = 0;
    public static int con_score = 0;
    public static int int_score = 0;
    public static int wis_score = 0;
    public static int cha_score = 0;

    public static void main(String[] args) {
        delayedPrint("Welcome to Pathfinder Character Creator!");
        delayedPrint("Let's get started!");
        getAbilityScores();
    }
    public static void getAbilityScores(){
        delayedPrint("Ability Scores:");
        delayedPrint("Please choose a method of generating your ability scores:");
        delayedPrint("1. Standard Method");
        delayedPrint("2. Classic Method");
        delayedPrint("3. Heroic Method");
        delayedPrint("4. Dice Pool Method");
        delayedPrint("5. Purchase Method");
        delayedPrint("6. Manual Input");
        delayedPrint("Please enter which option you would like to use:");
        int option = chooseOption(6);
        switch (option){
            case 1:
                abilityScoreStandardMethod();
                break;
            case 2:
                delayedPrint("You chose Classic Method");
                break;
            case 3:
                delayedPrint("You chose Heroic Method");
                break;
            case 4:
                delayedPrint("You chose Dice Pool Method");
                break;
            case 5:
                delayedPrint("You chose Purchase Method");
                break;
            case 6:
                delayedPrint("You chose Manual Input");
                break;
        }
    }

    public static int chooseOption(int options){
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        if (option > options){
            delayedPrint("That wasn't one of the given numbers please try again.");
            option = chooseOption(options);
        }
        return option;
    }

    public static void delayedPrint(String text){
        try {
            System.out.println(text);
            TimeUnit.MILLISECONDS.sleep(500);
        }
        catch (InterruptedException e){
            System.err.format("IOException: %s%n", e);
        }
    }

    public static void abilityScoreStandardMethod(){

        List scores = new ArrayList();
        scores.add(getScoreStandardMethod());
        scores.add(getScoreStandardMethod());
        scores.add(getScoreStandardMethod());
        scores.add(getScoreStandardMethod());
        scores.add(getScoreStandardMethod());
        scores.add(getScoreStandardMethod());

        delayedPrint("You got the scores: " + scores.get(0) + ", " + scores.get(1) + ", " + scores.get(2) + ", " + scores.get(3) + ", " + scores.get(4) + ", " + scores.get(5) + ".");
        delayedPrint("Which one would you like to put in strength?");
        delayedPrint("1. " + scores.get(0));
        delayedPrint("2. " + scores.get(1));
        delayedPrint("3. " + scores.get(2));
        delayedPrint("4. " + scores.get(3));
        delayedPrint("5. " + scores.get(4));
        delayedPrint("6. " + scores.get(5));
        delayedPrint("Please enter which option you would like to use:");
        int option = chooseOption(6);
        switch (option){
            case 1:
                Main.str_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                Main.str_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                Main.str_score = (int) scores.get(2);
                scores.remove(2);
                break;
            case 4:
                Main.str_score = (int) scores.get(3);
                scores.remove(3);
                break;
            case 5:
                Main.str_score = (int) scores.get(4);
                scores.remove(4);
                break;
            case 6:
                Main.str_score = (int) scores.get(5);
                scores.remove(5);
                break;
        }

        delayedPrint("Which one would you like to put in dexterity?");
        delayedPrint("1. " + scores.get(0));
        delayedPrint("2. " + scores.get(1));
        delayedPrint("3. " + scores.get(2));
        delayedPrint("4. " + scores.get(3));
        delayedPrint("5. " + scores.get(4));
        delayedPrint("Please enter which option you would like to use:");
        option = chooseOption(5);
        switch (option){
            case 1:
                Main.dex_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                Main.dex_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                Main.dex_score = (int) scores.get(2);
                scores.remove(2);
                break;
            case 4:
                Main.dex_score = (int) scores.get(3);
                scores.remove(3);
                break;
            case 5:
                Main.dex_score = (int) scores.get(4);
                scores.remove(4);
                break;
        }

        delayedPrint("Which one would you like to put in constitution?");
        delayedPrint("1. " + scores.get(0));
        delayedPrint("2. " + scores.get(1));
        delayedPrint("3. " + scores.get(2));
        delayedPrint("4. " + scores.get(3));
        delayedPrint("Please enter which option you would like to use:");
        option = chooseOption(4);
        switch (option){
            case 1:
                Main.con_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                Main.con_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                Main.con_score = (int) scores.get(2);
                scores.remove(2);
                break;
            case 4:
                Main.con_score = (int) scores.get(3);
                scores.remove(3);
                break;
        }

        delayedPrint("Which one would you like to put in Intelligence?");
        delayedPrint("1. " + scores.get(0));
        delayedPrint("2. " + scores.get(1));
        delayedPrint("3. " + scores.get(2));
        delayedPrint("Please enter which option you would like to use:");
        option = chooseOption(3);
        switch (option){
            case 1:
                Main.int_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                Main.int_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                Main.int_score = (int) scores.get(2);
                scores.remove(2);
                break;
        }

        delayedPrint("Which one would you like to put in Wisdom?");
        delayedPrint("1. " + scores.get(0));
        delayedPrint("2. " + scores.get(1));
        delayedPrint("Please enter which option you would like to use:");
        option = chooseOption(2);
        switch (option){
            case 1:
                Main.wis_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                Main.wis_score = (int) scores.get(1);
                scores.remove(1);
                break;
        }
        Main.cha_score = (int) scores.get(0);
        scores.remove(0);
        delayedPrint("Your ability scores:");
        delayedPrint("Strength: " + Main.str_score);
        delayedPrint("Dexterity: " + Main.dex_score);
        delayedPrint("Constitution: " + Main.con_score);
        delayedPrint("Intelligence: " + Main.int_score);
        delayedPrint("Wisdom: " + Main.wis_score);
        delayedPrint("Charisma: " + Main.cha_score);
        delayedPrint("Do you like your ability scores or would you like to re-roll your ability scores?");
        delayedPrint("1. Keep ability scores and move on to the next step");
        delayedPrint("2. Re-roll your ability scores");
        delayedPrint("Please enter which option you would like to use:");
        option = chooseOption(2);
        switch (option){
            case 1:
                System.out.println("Pick Race");
                break;
            case 2:
                getAbilityScores();
                break;
        }
    }

    public static int roll6SidedDie(){
        Random rand = new Random();
        int die_roll = rand.nextInt(6);
        return die_roll + 1;
    }

    public static int getScoreStandardMethod() {
        int num1 = roll6SidedDie();
        int num2 = roll6SidedDie();
        int num3 = roll6SidedDie();
        int num4 = roll6SidedDie();
        if (num1 <= num2 && num1 <= num3 && num1 <= num4) {
            return num2 + num3 + num4;
        }
        else if (num2 <= num1 && num2 <= num3 && num2 <= num4) {
            return num1 + num3 + num4;

        }
        else if (num3 <= num1 && num3 <= num2 && num3 <= num4){
            return num1 + num2 + num4;
        }
        else {
            return num1 + num2 + num3;

        }
    }
}
