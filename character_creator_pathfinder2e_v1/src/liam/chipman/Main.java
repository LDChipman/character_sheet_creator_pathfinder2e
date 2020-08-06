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
                abilityScoreClassicMethod();
                break;
            case 3:
                abilityScoreHeroicMethod();
                break;
            case 4:
                abilityScoreDicePoolMethod();
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
        try {
            int option = scan.nextInt();
            if (option > options && option <= 0){
                delayedPrint("That wasn't one of the given numbers please try again.");
                option = chooseOption(options);
            }
            return option;
        }
        catch (InputMismatchException e){
            delayedPrint("That wasn't one of the given numbers please try again.");
            int option = chooseOption(options);
            return option;
        }
    }

    public static int chooseOptionWith0(int options){
        Scanner scan = new Scanner(System.in);
        try {
            int option = scan.nextInt();
            if (option > options && option <= -1){
                delayedPrint("That wasn't one of the given numbers please try again.");
                option = chooseOption(options);
            }
            return option;
        }
        catch (InputMismatchException e){
            delayedPrint("That wasn't one of the given numbers please try again.");
            int option = chooseOption(options);
            return option;
        }
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

    public static void abilityScoreClassicMethod(){

        List scores = new ArrayList();
        scores.add(getScoreClassicMethod());
        scores.add(getScoreClassicMethod());
        scores.add(getScoreClassicMethod());
        scores.add(getScoreClassicMethod());
        scores.add(getScoreClassicMethod());
        scores.add(getScoreClassicMethod());

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

    public static int getScoreClassicMethod(){
        int num1 = roll6SidedDie();
        int num2 = roll6SidedDie();
        int num3 = roll6SidedDie();
        return num1 + num2 + num3;
    }

    public static void abilityScoreHeroicMethod(){

        List scores = new ArrayList();
        scores.add(getScoreHeroicMethod());
        scores.add(getScoreHeroicMethod());
        scores.add(getScoreHeroicMethod());
        scores.add(getScoreHeroicMethod());
        scores.add(getScoreHeroicMethod());
        scores.add(getScoreHeroicMethod());

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

    public static int getScoreHeroicMethod(){
        int num1 = roll6SidedDie();
        int num2 = roll6SidedDie();
        return num1 + num2 + 6;
    }

    public static void abilityScoreDicePoolMethod(){

        int str_dice = 0;
        int dex_dice = 0;
        int con_dice = 0;
        int int_dice = 0;
        int wis_dice = 0;
        int cha_dice = 0;
        int dice_pool = 6;
        delayedPrint("Please choose how many extra dice you'd like to put in strength");
        delayedPrint("Dice Remaining: " + dice_pool);
        delayedPrint("Please enter the amount you would like to use:");
        int option = chooseOptionWith0(dice_pool);
        switch (option){
            case 0:
                str_dice = 0;
                break;
            case 1:
                str_dice = 1;
                dice_pool -= 1;
                break;
            case 2:
                str_dice = 2;
                dice_pool -= 2;
                break;
            case 3:
                str_dice = 3;
                dice_pool -= 3;
                break;
            case 4:
                str_dice = 4;
                dice_pool -= 4;
                break;
            case 5:
                str_dice = 5;
                dice_pool -= 5;
                break;
            case 6:
                str_dice = 6;
                dice_pool -= 6;
                break;
        }
        if (dice_pool == 0){
            return;
        }

        delayedPrint("Please choose how many extra dice you'd like to put in dexterity");
        delayedPrint("Dice Remaining: " + dice_pool);
        delayedPrint("Please enter the amount you would like to use:");
        option = chooseOptionWith0(dice_pool);
        switch (option){
            case 0:
                dex_dice = 0;
                break;
            case 1:
                dex_dice = 1;
                dice_pool -= 1;
                break;
            case 2:
                dex_dice = 2;
                dice_pool -= 2;
                break;
            case 3:
                dex_dice = 3;
                dice_pool -= 3;
                break;
            case 4:
                dex_dice = 4;
                dice_pool -= 4;
                break;
            case 5:
                dex_dice = 5;
                dice_pool -= 5;
                break;
            case 6:
                dex_dice = 6;
                dice_pool -= 6;
                break;
        }
        if (dice_pool == 0){
            return;
        }

        delayedPrint("Please choose how many extra dice you'd like to put in constitution");
        delayedPrint("Dice Remaining: " + dice_pool);
        delayedPrint("Please enter the amount you would like to use:");
        option = chooseOptionWith0(dice_pool);
        switch (option){
            case 0:
                con_dice = 0;
                break;
            case 1:
                con_dice = 1;
                dice_pool -= 1;
                break;
            case 2:
                con_dice = 2;
                dice_pool -= 2;
                break;
            case 3:
                con_dice = 3;
                dice_pool -= 3;
                break;
            case 4:
                con_dice = 4;
                dice_pool -= 4;
                break;
            case 5:
                con_dice = 5;
                dice_pool -= 5;
                break;
            case 6:
                con_dice = 6;
                dice_pool -= 6;
                break;
        }
        if (dice_pool == 0){
            return;
        }

        delayedPrint("Please choose how many extra dice you'd like to put in intelligence");
        delayedPrint("Dice Remaining: " + dice_pool);
        delayedPrint("Please enter the amount you would like to use:");
        option = chooseOptionWith0(dice_pool);
        switch (option){
            case 0:
                int_dice = 0;
                break;
            case 1:
                int_dice = 1;
                dice_pool -= 1;
                break;
            case 2:
                int_dice = 2;
                dice_pool -= 2;
                break;
            case 3:
                int_dice = 3;
                dice_pool -= 3;
                break;
            case 4:
                int_dice = 4;
                dice_pool -= 4;
                break;
            case 5:
                int_dice = 5;
                dice_pool -= 5;
                break;
            case 6:
                int_dice = 6;
                dice_pool -= 6;
                break;
        }
        if (dice_pool == 0){
            return;
        }

        delayedPrint("Please choose how many extra dice you'd like to put in wisdom");
        delayedPrint("Dice Remaining: " + dice_pool);
        delayedPrint("Please enter the amount you would like to use:");
        option = chooseOptionWith0(dice_pool);
        switch (option){
            case 0:
                wis_dice = 0;
                break;
            case 1:
                wis_dice = 1;
                dice_pool -= 1;
                break;
            case 2:
                wis_dice = 2;
                dice_pool -= 2;
                break;
            case 3:
                wis_dice = 3;
                dice_pool -= 3;
                break;
            case 4:
                wis_dice = 4;
                dice_pool -= 4;
                break;
            case 5:
                wis_dice = 5;
                dice_pool -= 5;
                break;
            case 6:
                wis_dice = 6;
                dice_pool -= 6;
                break;
        }
        if (dice_pool == 0){
            return;
        }

        cha_dice = dice_pool;
        Main.str_score = getScoreDicePoolMethod(str_dice);
        Main.dex_score = getScoreDicePoolMethod( dex_dice);
        Main.con_score = getScoreDicePoolMethod(con_dice);
        Main.int_score = getScoreDicePoolMethod(int_dice);
        Main.wis_score = getScoreDicePoolMethod(wis_dice);
        Main.cha_score = getScoreDicePoolMethod(cha_dice);

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

    public static int getScoreDicePoolMethod(int amount_of_dice){
        int num1 = roll6SidedDie();
        int num2 = roll6SidedDie();
        int num3 = roll6SidedDie();
        int num4 = roll6SidedDie();
        int num5 = roll6SidedDie();
        int num6 = roll6SidedDie();
        int num7 = roll6SidedDie();
        int num8 = roll6SidedDie();
        int num9 = roll6SidedDie();
        int sum_of_3_highest = 0;
        int dice_needed = 3;
        if (amount_of_dice == 6) {
            if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5 && num1 >= num6 && num1 >= num7 && num1 >= num8 && num1 >= num9) {
                sum_of_3_highest += num1;
                dice_needed--;
            }
            if (num2 >= num3 && num2 >= num4 && num2 >= num5 && num2 >= num6 && num2 >= num7 && num2 >= num8 && num2 >= num9) {
                sum_of_3_highest += num2;
                dice_needed--;
            }
            if (num3 >= num4 && num3 >= num5 && num3 >= num6 && num3 >= num7 && num3 >= num8 && num3 >= num9) {
                sum_of_3_highest += num3;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num4 >= num5 && num4 >= num6 && num4 >= num7 && num4 >= num8 && num4 >= num9) {
                sum_of_3_highest += num4;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num5 >= num6 && num5 >= num7 && num5 >= num8 && num5 >= num9) {
                sum_of_3_highest += num5;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num6 >= num7 && num6 >= num8 && num6 >= num9) {
                sum_of_3_highest += num6;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num7 >= num8 && num7 >= num9) {
                sum_of_3_highest += num7;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num8 >= num9) {
                sum_of_3_highest += num8;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            return sum_of_3_highest + num9;
        }
        else if (amount_of_dice == 5) {
            if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5 && num1 >= num6 && num1 >= num7 && num1 >= num8) {
                sum_of_3_highest += num1;
                dice_needed--;
            }
            if (num2 >= num3 && num2 >= num4 && num2 >= num5 && num2 >= num6 && num2 >= num7 && num2 >= num8) {
                sum_of_3_highest += num2;
                dice_needed--;
            }
            if (num3 >= num4 && num3 >= num5 && num3 >= num6 && num3 >= num7 && num3 >= num8) {
                sum_of_3_highest += num3;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num4 >= num5 && num4 >= num6 && num4 >= num7 && num4 >= num8) {
                sum_of_3_highest += num4;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num5 >= num6 && num5 >= num7 && num5 >= num8) {
                sum_of_3_highest += num5;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num6 >= num7 && num6 >= num8) {
                sum_of_3_highest += num6;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num7 >= num8) {
                sum_of_3_highest += num7;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            return sum_of_3_highest + num8;
        }
        else if (amount_of_dice == 4) {
            if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5 && num1 >= num6 && num1 >= num7) {
                sum_of_3_highest += num1;
                dice_needed--;
            }
            if (num2 >= num3 && num2 >= num4 && num2 >= num5 && num2 >= num6 && num2 >= num7) {
                sum_of_3_highest += num2;
                dice_needed--;
            }
            if (num3 >= num4 && num3 >= num5 && num3 >= num6 && num3 >= num7) {
                sum_of_3_highest += num3;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num4 >= num5 && num4 >= num6 && num4 >= num7) {
                sum_of_3_highest += num4;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num5 >= num6 && num5 >= num7) {
                sum_of_3_highest += num5;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num6 >= num7) {
                sum_of_3_highest += num6;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            return sum_of_3_highest + num7;
        }
        else if (amount_of_dice == 3) {
            if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5 && num1 >= num6) {
                sum_of_3_highest += num1;
                dice_needed--;
            }
            if (num2 >= num3 && num2 >= num4 && num2 >= num5 && num2 >= num6) {
                sum_of_3_highest += num2;
                dice_needed--;
            }
            if (num3 >= num4 && num3 >= num5 && num3 >= num6) {
                sum_of_3_highest += num3;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num4 >= num5 && num4 >= num6) {
                sum_of_3_highest += num4;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num5 >= num6) {
                sum_of_3_highest += num5;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            return sum_of_3_highest + num6;
        }
        else if (amount_of_dice == 2) {
            if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {
                sum_of_3_highest += num1;
                dice_needed--;
            }
            if (num2 >= num3 && num2 >= num4 && num2 >= num5) {
                sum_of_3_highest += num2;
                dice_needed--;
            }
            if (num3 >= num4 && num3 >= num5) {
                sum_of_3_highest += num3;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            if (num4 >= num5) {
                sum_of_3_highest += num4;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            return sum_of_3_highest + num5;
        }
        else if (amount_of_dice == 1) {
            if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
                sum_of_3_highest += num1;
                dice_needed--;
            }
            if (num2 >= num3 && num2 >= num4) {
                sum_of_3_highest += num2;
                dice_needed--;
            }
            if (num3 >= num4) {
                sum_of_3_highest += num3;
                dice_needed--;
            }
            if (dice_needed <= 0) {
                return sum_of_3_highest;
            }
            return sum_of_3_highest + num4;
        }
        else {
            return num1 + num2 + num3;
        }
    }

}
