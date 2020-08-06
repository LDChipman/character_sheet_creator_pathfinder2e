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
                chooseRace();
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
                chooseRace();
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
                chooseRace();
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
                chooseRace();
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
                        chooseRace();
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
                chooseRace();
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

    public static void chooseRace(){
        delayedPrint("Races:");
        delayedPrint("Please choose a race:");
        delayedPrint("1. Dwarf");
        delayedPrint("2. Elf");
        delayedPrint("3. Gnome");
        delayedPrint("4. Half-Elf");
        delayedPrint("5. Half-Orc");
        delayedPrint("6. Halfling");
        delayedPrint("7. Human");
        delayedPrint("8. Custom Race");
        delayedPrint("Please enter which option you would like to use:");
        int option = chooseOption(8);
        switch (option) {
            case 1:
                raceDwarf();
                break;
            case 2:
                raceElf();
                break;
            case 3:
                raceGnome();
                break;
            case 4:
                raceHalfElf();
                break;
            case 5:
                raceHalfOrc();
                break;
            case 6:
                raceHalfling();
                break;
            case 7:
                raceHuman();
                break;
            case 8:
                raceCustom();
                break;
        }
    }

    public static void raceDwarf(){
        delayedPrint("Dwarf:");
        delayedPrint("What would you like to know about Dwarves?");
        delayedPrint("1.  Basic Description");
        delayedPrint("2.  Physical Description");
        delayedPrint("3.  Society");
        delayedPrint("4.  Relations");
        delayedPrint("5.  Alignment and Religion");
        delayedPrint("6.  Adventurers");
        delayedPrint("7.  Names");
        delayedPrint("8.  Ability Score Changes");
        delayedPrint("9.  Size");
        delayedPrint("10. Speed");
        delayedPrint("11. Vision");
        delayedPrint("12. Racial Features");
        delayedPrint("13. Proficiencies");
        delayedPrint("14. Languages");
        delayedPrint("15. Choose Dwarf as your race");
        delayedPrint("16. Return to Race Screen");
        int option = chooseOption(17);
        switch (option){
            case 1:
                delayedPrint("Dwarves are a stoic but stern race, ensconced in cities carved from the hearts of mountains and fiercely determined to repel the depredations of savage races like orcs and goblins.");
                delayedPrint("More than any other race, the dwarves have acquired a reputation as dour and humorless craftsmen of the earth.");
                delayedPrint("It could be said that dwarven history shapes the dark disposition of many dwarves, for they reside in high mountains and dangerous realms below the earth, constantly at war with giants, goblins, and other such horrors.");
                break;
            case 2:
                delayedPrint("Dwarves are short and stocky, standing about a foot shorter than most humans.");
                delayedPrint(" They have wide, compact bodies and burly frames.");
                delayedPrint("Dwarves of all genders pride themselves on the length of their hair, which they often braid into intricate patterns, some of which represent specific clans.");
                delayedPrint("A long beard is a sign of masculinity and honor among the dwarves, and thus a clean-shaven male dwarf is considered weak, untrustworthy, or worse.");
                delayedPrint("Dwarves typically reach physical adulthood around the age of 25, though their traditionalist culture places more value on completing coming of age ceremonies unique to each clan than reaching a certain age.");
                delayedPrint("A typical dwarf can live to around 350 years old.");
                break;
            case 3:
                delayedPrint("The ancient surface empire the dwarves once ruled fell long ago, overwhelmed by orc and goblinoid enemies.");
                delayedPrint("Today’s dwarves today retain many of the qualities that propelled their people to greatness in ancient times: fierceness, gumption, and stubbornness in endeavors ranging from battle and craftsmanship to forging ties with family and friends.");
                delayedPrint("While the distance between their mountain Sky Citadels can create vast cultural divides between various dwarf clans, most dwarven societies share a number of similarities.");
                delayedPrint("Nearly all dwarven peoples share a passion for stonework, metalwork, and gem-cutting. Most are highly skilled at architecture and mining, and many share a hatred of giants, orcs, and goblinoids.");
                delayedPrint("Few dwarves are seen without their clan dagger strapped to their belt.");
                delayedPrint("This dagger is forged just before a dwarf’s birth and bears the gemstone of their clan.");
                delayedPrint("A parent uses this dagger to cut the infant’s umbilical cord, making it the first weapon to taste their blood.");
                break;
            case 4:
                delayedPrint("Dwarves and orcs have long dwelt in proximity, theirs a history of violence as old as both their races.");
                delayedPrint("Dwarves generally distrust and shun half-orcs.");
                delayedPrint("They find halflings, elves, and gnomes to be too frail, flighty, or \"pretty\" to be worthy of proper respect.");
                delayedPrint("It is with humans that dwarves share the strongest link, for humans' industrious nature and hearty appetites come closest to matching those of the dwarven ideal.");
                break;
            case 5:
                delayedPrint("Dwarves tend to value honor and closely follow the traditions of their clans and kingdoms.");
                delayedPrint("They have a strong sense of friendship and justice, though they are often very particular about who they consider a friend.");
                delayedPrint("They work hard and play harder— especially when strong ale is involved.");
                delayedPrint("The typical dwarf is lawful good or lawful neutral and prefers to worship deities of those alignments.");
                delayedPrint("Torag, god of dwarvenkind, is the dwarves’ primary deity, though worship of Torag’s family members is also common.");
                break;
            case 6:
                delayedPrint("Although dwarven adventurers are rare compared to humans, they can be found in most regions of the world.");
                delayedPrint("Dwarves often leave the confines of their redoubts to seek glory for their clans, to find wealth with which to enrich the fortress-homes of their birth, or to reclaim fallen dwarven citadels from racial enemies.");
                delayedPrint("Dwarven warfare is often characterized by tunnel fighting and melee combat, and as such most dwarves tend toward classes such as fighters and barbarians.");
                break;
            case 7:
                delayedPrint("Dwarves honor their children with names taken from ancestors or dwarven  heroes, and it’s quite rare to invent a new name or to borrow a name from another culture for a child.");
                delayedPrint("When introducing themselves, dwarves tend to  list their family and clan, plus any number of other familial connections and honorifics.");
                delayedPrint("Dwarven names usually contain hard consonants and are rarely more or fewer than two syllables.");
                delayedPrint("Male Name Examples: Dolgrin, Grunyar, Harsk, Kasmuk, Morgrym, Rogar.");
                delayedPrint("Female Name Examples: Agna, Bodill, Ingra, Kotri, Rusilka, Yangrit.");
                break;
            case 8:
                delayedPrint("+2 Constitution, +2 Wisdom, -2 Charisma: Dwarves are both tough and wise, but also a bit gruff.");
                break;
            case 9:
                delayedPrint("Medium: Dwarves are Medium creatures and have no bonuses or penalties due to their size.");
                break;
            case 10:
                delayedPrint("Slow and Steady: Dwarves have a base speed of 20 feet, but their speed is never modified by armor or encumbrance.");
                break;
            case 11:
                delayedPrint("Darkvision: Dwarves can see in the dark up to 60 feet.");
                break;
            case 12:
                delayedPrint("Defensive Training: Dwarves get a +4 dodge bonus to AC against monsters of the giant subtype.");
                delayedPrint("Greed: Dwarves receive a +2 racial bonus to Appraise skill checks made to determine the price of nonmagical goods that contain metals or gemstones.");
                delayedPrint("Hatred: Dwarves receive a +1 bonus on attack rolls against humanoid creatures of the orc  and goblinoid subtype due to special training against these hated foes.");
                delayedPrint("Hardy: Dwarves receive a +2 racial bonus on saving throws against poison, spells, and spell-like abilities.");
                delayedPrint("Stability: Dwarves receive a +4 racial bonus to their Combat Maneuver Defense when resisting a bull rush or trip attempt while standing on the ground.");
                delayedPrint("Stonecunning: Dwarves receive a +2 bonus on perception checks to potentially notice unusual stonework, such as traps and hidden doors located in stone walls or floors.");
                delayedPrint("They receive a check to notice such features whenever they pass within 10 feet of them, whether or not they are actively looking.");
                break;
            case 13:
                delayedPrint("Dwarves are Proficient with battleaxes, heavy picks, and warhammers, and treat any weapon with the name \"dwarven\" in its name as a martial weapon.");
                break;
            case 14:
                delayedPrint("Dwarves begin play speaking Common and Dwarven.");
                delayedPrint("Dwarves with a high intelligence scores can choose from the following: Giant, Gnome, Goblin, Orc, Terran, and Undercommon.");
                break;
            case 15:
                System.out.println("You chose dwarf!");
                System.exit(-1);
            case 16:
                chooseRace();
        }
        raceDwarf();
    }

    public static void raceElf(){

    }

    public static void raceGnome(){

    }

    public static void raceHalfElf(){

    }

    public static void raceHalfOrc(){

    }

    public static void raceHalfling(){

    }

    public static void raceHuman(){

    }

    public static void raceCustom(){

    }
}
