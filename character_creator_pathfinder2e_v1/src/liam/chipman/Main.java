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
    public static int points = 0;

    public static void main(String[] args) {

        delayedPrint("Welcome to Pathfinder Character Creator!");
        delayedPrint("Let's get started!");
        setAbilityScores();
    }

    public static void setAbilityScores() {
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
        switch (option) {
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
                choosePointAmountPurchaseMethod();
                break;
            case 6:
                abilityScoreManualInput();
                break;
        }
    }

    public static int chooseOption(int options) {
        Scanner scan = new Scanner(System.in);
        try {
            int option = scan.nextInt();
            if (option > options || option <= 0) {
                delayedPrint("That wasn't one of the given numbers please try again.");
                option = chooseOption(options);
            }
            return option;
        } catch (InputMismatchException e) {
            delayedPrint("That wasn't one of the given numbers please try again.");
            int option = chooseOption(options);
            return option;
        }
    }

    public static int chooseOptionWith0(int options) {
        Scanner scan = new Scanner(System.in);
        try {
            int option = scan.nextInt();
            if (option > options || option < 0) {
                delayedPrint("That wasn't one of the given numbers please try again.");
                option = chooseOptionWith0(options);
            }
            return option;
        } catch (InputMismatchException e) {
            delayedPrint("That wasn't one of the given numbers please try again.");
            int option = chooseOption(options);
            return option;
        }
    }

    public static void delayedPrint(String text) {
        try {
            System.out.println(text);
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    public static void abilityScoreStandardMethod() {

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
        switch (option) {
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
        switch (option) {
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
        switch (option) {
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
        switch (option) {
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
        switch (option) {
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
        switch (option) {
            case 1:
                System.out.println("Pick Race");
                System.exit(-1);
                break;
            case 2:
                setAbilityScores();
                break;
        }
    }

    public static int roll6SidedDie() {
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
        } else if (num2 <= num1 && num2 <= num3 && num2 <= num4) {
            return num1 + num3 + num4;

        } else if (num3 <= num1 && num3 <= num2 && num3 <= num4) {
            return num1 + num2 + num4;
        } else {
            return num1 + num2 + num3;

        }
    }

    public static void abilityScoreClassicMethod() {

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
        switch (option) {
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
        switch (option) {
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
        switch (option) {
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
        switch (option) {
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
        switch (option) {
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
        switch (option) {
            case 1:
                System.out.println("Pick Race");
                System.exit(-1);
                break;
            case 2:
                setAbilityScores();
                break;
        }

    }

    public static int getScoreClassicMethod() {
        int num1 = roll6SidedDie();
        int num2 = roll6SidedDie();
        int num3 = roll6SidedDie();
        return num1 + num2 + num3;
    }

    public static void abilityScoreHeroicMethod() {

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
        switch (option) {
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
        switch (option) {
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
        switch (option) {
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
        switch (option) {
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
        switch (option) {
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
        switch (option) {
            case 1:
                System.out.println("Pick Race");
                System.exit(-1);
                break;
            case 2:
                setAbilityScores();
                break;
        }

    }

    public static int getScoreHeroicMethod() {
        int num1 = roll6SidedDie();
        int num2 = roll6SidedDie();
        return num1 + num2 + 6;
    }

    public static void abilityScoreDicePoolMethod() {

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
        switch (option) {
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

        delayedPrint("Please choose how many extra dice you'd like to put in dexterity");
        delayedPrint("Dice Remaining: " + dice_pool);
        delayedPrint("Please enter the amount you would like to use:");
        option = chooseOptionWith0(dice_pool);
        switch (option) {
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

        delayedPrint("Please choose how many extra dice you'd like to put in constitution");
        delayedPrint("Dice Remaining: " + dice_pool);
        delayedPrint("Please enter the amount you would like to use:");
        option = chooseOptionWith0(dice_pool);
        switch (option) {
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

        delayedPrint("Please choose how many extra dice you'd like to put in intelligence");
        delayedPrint("Dice Remaining: " + dice_pool);
        delayedPrint("Please enter the amount you would like to use:");
        option = chooseOptionWith0(dice_pool);
        switch (option) {
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

        delayedPrint("Please choose how many extra dice you'd like to put in wisdom");
        delayedPrint("Dice Remaining: " + dice_pool);
        delayedPrint("Please enter the amount you would like to use:");
        option = chooseOptionWith0(dice_pool);
        switch (option) {
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
        delayedPrint("Please choose how many extra dice you'd like to put in charisma");
        delayedPrint("Dice Remaining: " + dice_pool);
        delayedPrint("Please enter the amount you would like to use:");
        option = chooseOptionWith0(dice_pool);
        switch (option) {
            case 0:
                cha_dice = 0;
                break;
            case 1:
                cha_dice = 1;
                dice_pool -= 1;
                break;
            case 2:
                cha_dice = 2;
                dice_pool -= 2;
                break;
            case 3:
                cha_dice = 3;
                dice_pool -= 3;
                break;
            case 4:
                cha_dice = 4;
                dice_pool -= 4;
                break;
            case 5:
                cha_dice = 5;
                dice_pool -= 5;
                break;
            case 6:
                cha_dice = 6;
                dice_pool -= 6;
                break;
        }
        Main.str_score = getScoreDicePoolMethod(str_dice);
        Main.dex_score = getScoreDicePoolMethod(dex_dice);
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
        switch (option) {
            case 1:
                System.out.println("Pick Race");
                System.exit(-1);
                break;
            case 2:
                setAbilityScores();
                break;
        }

    }

    public static int getScoreDicePoolMethod(int amount_of_dice) {
        List rolls = new ArrayList();
        rolls.add(roll6SidedDie());
        rolls.add(roll6SidedDie());
        rolls.add(roll6SidedDie());

        while (amount_of_dice > 0) {
            rolls.add(roll6SidedDie());
            amount_of_dice--;
        }
        Collections.sort(rolls);
        Collections.reverse(rolls);
        return (int) rolls.get(0) + (int) rolls.get(1) + (int) rolls.get(2);
    }

    public static void abilityScorePurchaseMethod() {
        delayedPrint("Which ability score would you like to adjust");
        delayedPrint("You have " + Main.points + " points to spend");
        delayedPrint("1. Strength: " + Main.str_score);
        delayedPrint("2. Dexterity: " + Main.dex_score);
        delayedPrint("3. Constitution: " + Main.con_score);
        delayedPrint("4. Intelligence: " + Main.int_score);
        delayedPrint("5. Wisdom: " + Main.wis_score);
        delayedPrint("6. Charisma: " + Main.cha_score);
        delayedPrint("7. Finish");
        int option = chooseOption(7);
        switch (option) {
            case 1:
                changeStrengthPurchaseMethod();
                break;
            case 2:
                changeDexterityPurchaseMethod();
                break;
            case 3:
                changeConstitutionPurchaseMethod();
                break;
            case 4:
                changeIntelligencePurchaseMethod();
                break;
            case 5:
                changeWisdomPurchaseMethod();
                break;
            case 6:
                changeCharismaPurchaseMethod();
                break;
            case 7:
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
                switch (option) {
                    case 1:
                        System.out.println("Pick Race");
                        System.exit(-1);
                        break;
                    case 2:
                        setAbilityScores();
                        break;
                }
        }

    }

    public static void choosePointAmountPurchaseMethod() {
        Main.str_score = 10;
        Main.dex_score = 10;
        Main.con_score = 10;
        Main.int_score = 10;
        Main.wis_score = 10;
        Main.cha_score = 10;
        delayedPrint("Please choose how many points you would like to have");
        delayedPrint("1. Low fantasy 10 Points");
        delayedPrint("2. Standard fantasy 15 Points");
        delayedPrint("3. High fantasy 20 Points");
        delayedPrint("4. Epic fantasy 25 Points");
        delayedPrint("Please enter the amount you would like to use:");
        int option = chooseOption(4);
        switch (option) {
            case 1:
                Main.points = 10;
                abilityScorePurchaseMethod();
                break;
            case 2:
                Main.points = 15;
                abilityScorePurchaseMethod();
                break;
            case 3:
                Main.points = 20;
                abilityScorePurchaseMethod();
                break;
            case 4:
                Main.points = 25;
                abilityScorePurchaseMethod();
                break;
        }
    }

    public static void changeStrengthPurchaseMethod() {
        delayedPrint("Would you like to increase, decrease, or keep your strength score?");
        delayedPrint("Points remaining: " + Main.points);
        delayedPrint("Your strength is: " + Main.str_score);
        delayedPrint("1. Increase");
        delayedPrint("2. Decrease");
        delayedPrint("3. Keep");
        delayedPrint("Please enter which option you'd like to do");
        int option = chooseOption(3);
        switch (option) {
            case 1:
                switch (Main.str_score) {
                    case 7:
                    case 13:
                    case 14:
                        if (points - 2 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 2");
                            changeStrengthPurchaseMethod();
                            break;
                        }
                        Main.points -= 2;
                        Main.str_score++;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        if (points - 1 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 1");
                            changeStrengthPurchaseMethod();
                            break;
                        }
                        Main.points--;
                        Main.str_score++;
                        break;
                    case 15:
                    case 16:
                        if (points - 3 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 3");
                            changeStrengthPurchaseMethod();
                            break;
                        }
                        Main.points -= 3;
                        Main.str_score++;
                        break;
                    case 17:
                        if (points - 4 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 4");
                            changeStrengthPurchaseMethod();
                            break;
                        }
                        Main.points -= 4;
                        Main.str_score++;
                        break;
                    case 18:
                        delayedPrint("You can't raise an ability score above 18");
                        break;
                }
                changeStrengthPurchaseMethod();
                break;
            case 2:
                switch (Main.str_score) {
                    case 7:
                        delayedPrint("You can't lower an ability below 7");
                        break;
                    case 8:
                    case 14:
                    case 15:
                        Main.points += 2;
                        Main.str_score--;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        Main.points++;
                        Main.str_score--;
                        break;
                    case 16:
                    case 17:
                        Main.points += 3;
                        Main.str_score--;
                        break;
                    case 18:
                        Main.points += 4;
                        Main.str_score--;
                        break;
                }
                changeStrengthPurchaseMethod();
                break;
            case 3:
                abilityScorePurchaseMethod();
        }
    }

    public static void changeDexterityPurchaseMethod() {
        delayedPrint("Would you like to increase, decrease, or keep your dexterity score?");
        delayedPrint("Points remaining: " + Main.points);
        delayedPrint("Your dexterity is: " + Main.dex_score);
        delayedPrint("1. Increase");
        delayedPrint("2. Decrease");
        delayedPrint("3. Keep");
        delayedPrint("Please enter which option you'd like to do");
        int option = chooseOption(3);
        switch (option) {
            case 1:
                switch (Main.dex_score) {
                    case 7:
                    case 13:
                    case 14:
                        if (points - 2 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 2");
                            changeDexterityPurchaseMethod();
                            break;
                        }
                        Main.points -= 2;
                        Main.dex_score++;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        if (points - 1 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 1");
                            changeDexterityPurchaseMethod();
                            break;
                        }
                        Main.points--;
                        Main.dex_score++;
                        break;
                    case 15:
                    case 16:
                        if (points - 3 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 3");
                            changeDexterityPurchaseMethod();
                            break;
                        }
                        Main.points -= 3;
                        Main.dex_score++;
                        break;
                    case 17:
                        if (points - 4 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 4");
                            changeDexterityPurchaseMethod();
                            break;
                        }
                        Main.points -= 4;
                        Main.dex_score++;
                        break;
                    case 18:
                        delayedPrint("You can't raise an ability score above 18");
                        break;
                }
                changeDexterityPurchaseMethod();
                break;
            case 2:
                switch (Main.dex_score) {
                    case 7:
                        delayedPrint("You can't lower an ability below 7");
                        break;
                    case 8:
                    case 14:
                    case 15:
                        Main.points += 2;
                        Main.dex_score--;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        Main.points++;
                        Main.dex_score--;
                        break;
                    case 16:
                    case 17:
                        Main.points += 3;
                        Main.dex_score--;
                        break;
                    case 18:
                        Main.points += 4;
                        Main.dex_score--;
                        break;
                }
                changeDexterityPurchaseMethod();
                break;
            case 3:
                abilityScorePurchaseMethod();
        }
    }

    public static void changeConstitutionPurchaseMethod() {
        delayedPrint("Would you like to increase, decrease, or keep your constitution score?");
        delayedPrint("Points remaining: " + Main.points);
        delayedPrint("Your constitution is: " + Main.con_score);
        delayedPrint("1. Increase");
        delayedPrint("2. Decrease");
        delayedPrint("3. Keep");
        delayedPrint("Please enter which option you'd like to do");
        int option = chooseOption(3);
        switch (option) {
            case 1:
                switch (Main.con_score) {
                    case 7:
                    case 13:
                    case 14:
                        if (points - 2 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 2");
                            changeConstitutionPurchaseMethod();
                            break;
                        }
                        Main.points -= 2;
                        Main.con_score++;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        if (points - 1 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 1");
                            changeConstitutionPurchaseMethod();
                            break;
                        }
                        Main.points--;
                        Main.con_score++;
                        break;
                    case 15:
                    case 16:
                        if (points - 3 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 3");
                            changeConstitutionPurchaseMethod();
                            break;
                        }
                        Main.points -= 3;
                        Main.con_score++;
                        break;
                    case 17:
                        if (points - 4 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 4");
                            changeConstitutionPurchaseMethod();
                            break;
                        }
                        Main.points -= 4;
                        Main.con_score++;
                        break;
                    case 18:
                        delayedPrint("You can't raise an ability score above 18");
                        break;
                }
                changeConstitutionPurchaseMethod();
                break;
            case 2:
                switch (Main.con_score) {
                    case 7:
                        delayedPrint("You can't lower an ability below 7");
                        break;
                    case 8:
                    case 14:
                    case 15:
                        Main.points += 2;
                        Main.con_score--;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        Main.points++;
                        Main.con_score--;
                        break;
                    case 16:
                    case 17:
                        Main.points += 3;
                        Main.con_score--;
                        break;
                    case 18:
                        Main.points += 4;
                        Main.con_score--;
                        break;
                }
                changeConstitutionPurchaseMethod();
                break;
            case 3:
                abilityScorePurchaseMethod();
        }
    }

    public static void changeIntelligencePurchaseMethod() {
        delayedPrint("Would you like to increase, decrease, or keep your intelligence score?");
        delayedPrint("Points remaining: " + Main.points);
        delayedPrint("Your intelligence is: " + Main.int_score);
        delayedPrint("1. Increase");
        delayedPrint("2. Decrease");
        delayedPrint("3. Keep");
        delayedPrint("Please enter which option you'd like to do");
        int option = chooseOption(3);
        switch (option) {
            case 1:
                switch (Main.int_score) {
                    case 7:
                    case 13:
                    case 14:
                        if (points - 2 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 2");
                            changeIntelligencePurchaseMethod();
                            break;
                        }
                        Main.points -= 2;
                        Main.int_score++;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        if (points - 1 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 1");
                            changeIntelligencePurchaseMethod();
                            break;
                        }
                        Main.points--;
                        Main.int_score++;
                        break;
                    case 15:
                    case 16:
                        if (points - 3 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 3");
                            changeIntelligencePurchaseMethod();
                            break;
                        }
                        Main.points -= 3;
                        Main.int_score++;
                        break;
                    case 17:
                        if (points - 4 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 4");
                            changeIntelligencePurchaseMethod();
                            break;
                        }
                        Main.points -= 4;
                        Main.int_score++;
                        break;
                    case 18:
                        delayedPrint("You can't raise an ability score above 18");
                        break;
                }
                changeIntelligencePurchaseMethod();
                break;
            case 2:
                switch (Main.int_score) {
                    case 7:
                        delayedPrint("You can't lower an ability below 7");
                        break;
                    case 8:
                    case 14:
                    case 15:
                        Main.points += 2;
                        Main.int_score--;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        Main.points++;
                        Main.int_score--;
                        break;
                    case 16:
                    case 17:
                        Main.points += 3;
                        Main.int_score--;
                        break;
                    case 18:
                        Main.points += 4;
                        Main.int_score--;
                        break;
                }
                changeIntelligencePurchaseMethod();
                break;
            case 3:
                abilityScorePurchaseMethod();
        }
    }

    public static void changeWisdomPurchaseMethod() {
        delayedPrint("Would you like to increase, decrease, or keep your wisdom score?");
        delayedPrint("Points remaining: " + Main.points);
        delayedPrint("Your wisdom is: " + Main.wis_score);
        delayedPrint("1. Increase");
        delayedPrint("2. Decrease");
        delayedPrint("3. Keep");
        delayedPrint("Please enter which option you'd like to do");
        int option = chooseOption(3);
        switch (option) {
            case 1:
                switch (Main.wis_score) {
                    case 7:
                    case 13:
                    case 14:
                        if (points - 2 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 2");
                            changeWisdomPurchaseMethod();
                            break;
                        }
                        Main.points -= 2;
                        Main.wis_score++;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        if (points - 1 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 1");
                            changeWisdomPurchaseMethod();
                            break;
                        }
                        Main.points--;
                        Main.wis_score++;
                        break;
                    case 15:
                    case 16:
                        if (points - 3 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 3");
                            changeWisdomPurchaseMethod();
                            break;
                        }
                        Main.points -= 3;
                        Main.wis_score++;
                        break;
                    case 17:
                        if (points - 4 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 4");
                            changeWisdomPurchaseMethod();
                            break;
                        }
                        Main.points -= 4;
                        Main.wis_score++;
                        break;
                    case 18:
                        delayedPrint("You can't raise an ability score above 18");
                        break;
                }
                changeWisdomPurchaseMethod();
                break;
            case 2:
                switch (Main.wis_score) {
                    case 7:
                        delayedPrint("You can't lower an ability below 7");
                        break;
                    case 8:
                    case 14:
                    case 15:
                        Main.points += 2;
                        Main.wis_score--;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        Main.points++;
                        Main.wis_score--;
                        break;
                    case 16:
                    case 17:
                        Main.points += 3;
                        Main.wis_score--;
                        break;
                    case 18:
                        Main.points += 4;
                        Main.wis_score--;
                        break;
                }
                changeWisdomPurchaseMethod();
                break;
            case 3:
                abilityScorePurchaseMethod();
        }
    }

    public static void changeCharismaPurchaseMethod() {
        delayedPrint("Would you like to increase, decrease, or keep your charisma score?");
        delayedPrint("Points remaining: " + Main.points);
        delayedPrint("Your charisma is: " + Main.cha_score);
        delayedPrint("1. Increase");
        delayedPrint("2. Decrease");
        delayedPrint("3. Keep");
        delayedPrint("Please enter which option you'd like to do");
        int option = chooseOption(3);
        switch (option) {
            case 1:
                switch (Main.cha_score) {
                    case 7:
                    case 13:
                    case 14:
                        if (points - 2 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 2");
                            changeCharismaPurchaseMethod();
                            break;
                        }
                        Main.points -= 2;
                        Main.cha_score++;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        if (points - 1 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 1");
                            changeCharismaPurchaseMethod();
                            break;
                        }
                        Main.points--;
                        Main.cha_score++;
                        break;
                    case 15:
                    case 16:
                        if (points - 3 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 3");
                            changeCharismaPurchaseMethod();
                            break;
                        }
                        Main.points -= 3;
                        Main.cha_score++;
                        break;
                    case 17:
                        if (points - 4 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 4");
                            changeCharismaPurchaseMethod();
                            break;
                        }
                        Main.points -= 4;
                        Main.cha_score++;
                        break;
                    case 18:
                        delayedPrint("You can't raise an ability score above 18");
                        break;
                }
                changeCharismaPurchaseMethod();
                break;
            case 2:
                switch (Main.cha_score) {
                    case 7:
                        delayedPrint("You can't lower an ability below 7");
                        break;
                    case 8:
                    case 14:
                    case 15:
                        Main.points += 2;
                        Main.cha_score--;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        Main.points++;
                        Main.cha_score--;
                        break;
                    case 16:
                    case 17:
                        Main.points += 3;
                        Main.cha_score--;
                        break;
                    case 18:
                        Main.points += 4;
                        Main.cha_score--;
                        break;
                }
                changeCharismaPurchaseMethod();
                break;
            case 3:
                abilityScorePurchaseMethod();
        }
    }

    public static void abilityScoreManualInput() {
        setStrengthManualInput();
        setDexterityManualInput();
        setConstitutionManualInput();
        setIntelligenceManualInput();
        setWisdomManualInput();
        setCharismaManualInput();
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
        int option = chooseOption(2);
        switch (option) {
            case 1:
                System.out.println("Pick Race");
                System.exit(-1);
                break;
            case 2:
                setAbilityScores();
                break;
        }
    }

    public static void setStrengthManualInput() {
        delayedPrint("Please enter what you would like your strength to be:");
        try {
            Scanner scan = new Scanner(System.in);
            Main.str_score = scan.nextInt();
        } catch (InputMismatchException e) {
            delayedPrint("Please enter a number");
            setStrengthManualInput();
        }
    }

    public static void setDexterityManualInput() {
        delayedPrint("Please enter what you would like your dexterity to be:");
        try {
            Scanner scan = new Scanner(System.in);
            Main.dex_score = scan.nextInt();
        } catch (InputMismatchException e) {
            delayedPrint("Please enter a number");
            setDexterityManualInput();
        }
    }

    public static void setConstitutionManualInput() {
        delayedPrint("Please enter what you would like your constitution to be:");
        try {
            Scanner scan = new Scanner(System.in);
            Main.con_score = scan.nextInt();
        } catch (InputMismatchException e) {
            delayedPrint("Please enter a number");
            setConstitutionManualInput();
        }
    }

    public static void setIntelligenceManualInput() {
        delayedPrint("Please enter what you would like your intelligence to be:");
        try {
            Scanner scan = new Scanner(System.in);
            Main.int_score = scan.nextInt();
        } catch (InputMismatchException e) {
            delayedPrint("Please enter a number");
            setIntelligenceManualInput();
        }
    }

    public static void setWisdomManualInput() {
        delayedPrint("Please enter what you would like your wisdom to be:");
        try {
            Scanner scan = new Scanner(System.in);
            Main.wis_score = scan.nextInt();
        } catch (InputMismatchException e) {
            delayedPrint("Please enter a number");
            setWisdomManualInput();
        }
    }

    public static void setCharismaManualInput() {
        delayedPrint("Please enter what you would like your charisma to be:");
        try {
            Scanner scan = new Scanner(System.in);
            Main.cha_score = scan.nextInt();
        } catch (InputMismatchException e) {
            delayedPrint("Please enter a number");
            setCharismaManualInput();
        }
    }

}
