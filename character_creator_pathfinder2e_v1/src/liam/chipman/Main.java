package liam.chipman;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static int points = 0;

    public static player character;
    
    public static void main(String[] args) {

        delayedPrint("Welcome to Pathfinder Character Creator!");
        delayedPrint("Let's get started!");
        character = new player();
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
            return chooseOption(options);
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
            TimeUnit.MILLISECONDS.sleep(125);
            System.out.println(text);
            TimeUnit.MILLISECONDS.sleep(125);
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
                character.str_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.str_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                character.str_score = (int) scores.get(2);
                scores.remove(2);
                break;
            case 4:
                character.str_score = (int) scores.get(3);
                scores.remove(3);
                break;
            case 5:
                character.str_score = (int) scores.get(4);
                scores.remove(4);
                break;
            case 6:
                character.str_score = (int) scores.get(5);
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
                character.dex_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.dex_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                character.dex_score = (int) scores.get(2);
                scores.remove(2);
                break;
            case 4:
                character.dex_score = (int) scores.get(3);
                scores.remove(3);
                break;
            case 5:
                character.dex_score = (int) scores.get(4);
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
                character.con_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.con_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                character.con_score = (int) scores.get(2);
                scores.remove(2);
                break;
            case 4:
                character.con_score = (int) scores.get(3);
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
                character.int_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.int_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                character.int_score = (int) scores.get(2);
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
                character.wis_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.wis_score = (int) scores.get(1);
                scores.remove(1);
                break;
        }
        character.cha_score = (int) scores.get(0);
        scores.remove(0);
        delayedPrint("Your ability scores:");
        delayedPrint("Strength: " + character.str_score);
        delayedPrint("Dexterity: " + character.dex_score);
        delayedPrint("Constitution: " + character.con_score);
        delayedPrint("Intelligence: " + character.int_score);
        delayedPrint("Wisdom: " + character.wis_score);
        delayedPrint("Charisma: " + character.cha_score);
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
                character.str_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.str_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                character.str_score = (int) scores.get(2);
                scores.remove(2);
                break;
            case 4:
                character.str_score = (int) scores.get(3);
                scores.remove(3);
                break;
            case 5:
                character.str_score = (int) scores.get(4);
                scores.remove(4);
                break;
            case 6:
                character.str_score = (int) scores.get(5);
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
                character.dex_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.dex_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                character.dex_score = (int) scores.get(2);
                scores.remove(2);
                break;
            case 4:
                character.dex_score = (int) scores.get(3);
                scores.remove(3);
                break;
            case 5:
                character.dex_score = (int) scores.get(4);
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
                character.con_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.con_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                character.con_score = (int) scores.get(2);
                scores.remove(2);
                break;
            case 4:
                character.con_score = (int) scores.get(3);
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
                character.int_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.int_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                character.int_score = (int) scores.get(2);
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
                character.wis_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.wis_score = (int) scores.get(1);
                scores.remove(1);
                break;
        }
        character.cha_score = (int) scores.get(0);
        scores.remove(0);
        delayedPrint("Your ability scores:");
        delayedPrint("Strength: " + character.str_score);
        delayedPrint("Dexterity: " + character.dex_score);
        delayedPrint("Constitution: " + character.con_score);
        delayedPrint("Intelligence: " + character.int_score);
        delayedPrint("Wisdom: " + character.wis_score);
        delayedPrint("Charisma: " + character.cha_score);
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
                character.str_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.str_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                character.str_score = (int) scores.get(2);
                scores.remove(2);
                break;
            case 4:
                character.str_score = (int) scores.get(3);
                scores.remove(3);
                break;
            case 5:
                character.str_score = (int) scores.get(4);
                scores.remove(4);
                break;
            case 6:
                character.str_score = (int) scores.get(5);
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
                character.dex_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.dex_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                character.dex_score = (int) scores.get(2);
                scores.remove(2);
                break;
            case 4:
                character.dex_score = (int) scores.get(3);
                scores.remove(3);
                break;
            case 5:
                character.dex_score = (int) scores.get(4);
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
                character.con_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.con_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                character.con_score = (int) scores.get(2);
                scores.remove(2);
                break;
            case 4:
                character.con_score = (int) scores.get(3);
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
                character.int_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.int_score = (int) scores.get(1);
                scores.remove(1);
                break;
            case 3:
                character.int_score = (int) scores.get(2);
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
                character.wis_score = (int) scores.get(0);
                scores.remove(0);
                break;
            case 2:
                character.wis_score = (int) scores.get(1);
                scores.remove(1);
                break;
        }
        character.cha_score = (int) scores.get(0);
        scores.remove(0);
        delayedPrint("Your ability scores:");
        delayedPrint("Strength: " + character.str_score);
        delayedPrint("Dexterity: " + character.dex_score);
        delayedPrint("Constitution: " + character.con_score);
        delayedPrint("Intelligence: " + character.int_score);
        delayedPrint("Wisdom: " + character.wis_score);
        delayedPrint("Charisma: " + character.cha_score);
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
                break;
            case 2:
                cha_dice = 2;
                break;
            case 3:
                cha_dice = 3;
                break;
            case 4:
                cha_dice = 4;
                break;
            case 5:
                cha_dice = 5;
                break;
            case 6:
                cha_dice = 6;
                break;
        }
        character.str_score = getScoreDicePoolMethod(str_dice);
        character.dex_score = getScoreDicePoolMethod(dex_dice);
        character.con_score = getScoreDicePoolMethod(con_dice);
        character.int_score = getScoreDicePoolMethod(int_dice);
        character.wis_score = getScoreDicePoolMethod(wis_dice);
        character.cha_score = getScoreDicePoolMethod(cha_dice);

        delayedPrint("Your ability scores:");
        delayedPrint("Strength: " + character.str_score);
        delayedPrint("Dexterity: " + character.dex_score);
        delayedPrint("Constitution: " + character.con_score);
        delayedPrint("Intelligence: " + character.int_score);
        delayedPrint("Wisdom: " + character.wis_score);
        delayedPrint("Charisma: " + character.cha_score);
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
        delayedPrint("You have " + points + " points to spend");
        delayedPrint("1. Strength: " + character.str_score);
        delayedPrint("2. Dexterity: " + character.dex_score);
        delayedPrint("3. Constitution: " + character.con_score);
        delayedPrint("4. Intelligence: " + character.int_score);
        delayedPrint("5. Wisdom: " + character.wis_score);
        delayedPrint("6. Charisma: " + character.cha_score);
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
                delayedPrint("Strength: " + character.str_score);
                delayedPrint("Dexterity: " + character.dex_score);
                delayedPrint("Constitution: " + character.con_score);
                delayedPrint("Intelligence: " + character.int_score);
                delayedPrint("Wisdom: " + character.wis_score);
                delayedPrint("Charisma: " + character.cha_score);
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
        character.str_score = 10;
        character.dex_score = 10;
        character.con_score = 10;
        character.int_score = 10;
        character.wis_score = 10;
        character.cha_score = 10;
        delayedPrint("Please choose how many points you would like to have");
        delayedPrint("1. Low fantasy 10 Points");
        delayedPrint("2. Standard fantasy 15 Points");
        delayedPrint("3. High fantasy 20 Points");
        delayedPrint("4. Epic fantasy 25 Points");
        delayedPrint("Please enter the amount you would like to use:");
        int option = chooseOption(4);
        switch (option) {
            case 1:
                points = 10;
                abilityScorePurchaseMethod();
                break;
            case 2:
                points = 15;
                abilityScorePurchaseMethod();
                break;
            case 3:
                points = 20;
                abilityScorePurchaseMethod();
                break;
            case 4:
                points = 25;
                abilityScorePurchaseMethod();
                break;
        }
    }

    public static void changeStrengthPurchaseMethod() {
        delayedPrint("Would you like to increase, decrease, or keep your strength score?");
        delayedPrint("Points remaining: " + points);
        delayedPrint("Your strength is: " + character.str_score);
        delayedPrint("1. Increase");
        delayedPrint("2. Decrease");
        delayedPrint("3. Keep");
        delayedPrint("Please enter which option you'd like to do");
        int option = chooseOption(3);
        switch (option) {
            case 1:
                switch (character.str_score) {
                    case 7:
                    case 13:
                    case 14:
                        if (points - 2 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 2");
                            changeStrengthPurchaseMethod();
                            break;
                        }
                        points -= 2;
                        character.str_score++;
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
                        points--;
                        character.str_score++;
                        break;
                    case 15:
                    case 16:
                        if (points - 3 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 3");
                            changeStrengthPurchaseMethod();
                            break;
                        }
                        points -= 3;
                        character.str_score++;
                        break;
                    case 17:
                        if (points - 4 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 4");
                            changeStrengthPurchaseMethod();
                            break;
                        }
                        points -= 4;
                        character.str_score++;
                        break;
                    case 18:
                        delayedPrint("You can't raise an ability score above 18");
                        break;
                }
                changeStrengthPurchaseMethod();
                break;
            case 2:
                switch (character.str_score) {
                    case 7:
                        delayedPrint("You can't lower an ability below 7");
                        break;
                    case 8:
                    case 14:
                    case 15:
                        points += 2;
                        character.str_score--;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        points++;
                        character.str_score--;
                        break;
                    case 16:
                    case 17:
                        points += 3;
                        character.str_score--;
                        break;
                    case 18:
                        points += 4;
                        character.str_score--;
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
        delayedPrint("Points remaining: " + points);
        delayedPrint("Your dexterity is: " + character.dex_score);
        delayedPrint("1. Increase");
        delayedPrint("2. Decrease");
        delayedPrint("3. Keep");
        delayedPrint("Please enter which option you'd like to do");
        int option = chooseOption(3);
        switch (option) {
            case 1:
                switch (character.dex_score) {
                    case 7:
                    case 13:
                    case 14:
                        if (points - 2 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 2");
                            changeDexterityPurchaseMethod();
                            break;
                        }
                        points -= 2;
                        character.dex_score++;
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
                        points--;
                        character.dex_score++;
                        break;
                    case 15:
                    case 16:
                        if (points - 3 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 3");
                            changeDexterityPurchaseMethod();
                            break;
                        }
                        points -= 3;
                        character.dex_score++;
                        break;
                    case 17:
                        if (points - 4 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 4");
                            changeDexterityPurchaseMethod();
                            break;
                        }
                        points -= 4;
                        character.dex_score++;
                        break;
                    case 18:
                        delayedPrint("You can't raise an ability score above 18");
                        break;
                }
                changeDexterityPurchaseMethod();
                break;
            case 2:
                switch (character.dex_score) {
                    case 7:
                        delayedPrint("You can't lower an ability below 7");
                        break;
                    case 8:
                    case 14:
                    case 15:
                        points += 2;
                        character.dex_score--;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        points++;
                        character.dex_score--;
                        break;
                    case 16:
                    case 17:
                        points += 3;
                        character.dex_score--;
                        break;
                    case 18:
                        points += 4;
                        character.dex_score--;
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
        delayedPrint("Points remaining: " + points);
        delayedPrint("Your constitution is: " + character.con_score);
        delayedPrint("1. Increase");
        delayedPrint("2. Decrease");
        delayedPrint("3. Keep");
        delayedPrint("Please enter which option you'd like to do");
        int option = chooseOption(3);
        switch (option) {
            case 1:
                switch (character.con_score) {
                    case 7:
                    case 13:
                    case 14:
                        if (points - 2 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 2");
                            changeConstitutionPurchaseMethod();
                            break;
                        }
                        points -= 2;
                        character.con_score++;
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
                        points--;
                        character.con_score++;
                        break;
                    case 15:
                    case 16:
                        if (points - 3 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 3");
                            changeConstitutionPurchaseMethod();
                            break;
                        }
                        points -= 3;
                        character.con_score++;
                        break;
                    case 17:
                        if (points - 4 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 4");
                            changeConstitutionPurchaseMethod();
                            break;
                        }
                        points -= 4;
                        character.con_score++;
                        break;
                    case 18:
                        delayedPrint("You can't raise an ability score above 18");
                        break;
                }
                changeConstitutionPurchaseMethod();
                break;
            case 2:
                switch (character.con_score) {
                    case 7:
                        delayedPrint("You can't lower an ability below 7");
                        break;
                    case 8:
                    case 14:
                    case 15:
                        points += 2;
                        character.con_score--;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        points++;
                        character.con_score--;
                        break;
                    case 16:
                    case 17:
                        points += 3;
                        character.con_score--;
                        break;
                    case 18:
                        points += 4;
                        character.con_score--;
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
        delayedPrint("Points remaining: " + points);
        delayedPrint("Your intelligence is: " + character.int_score);
        delayedPrint("1. Increase");
        delayedPrint("2. Decrease");
        delayedPrint("3. Keep");
        delayedPrint("Please enter which option you'd like to do");
        int option = chooseOption(3);
        switch (option) {
            case 1:
                switch (character.int_score) {
                    case 7:
                    case 13:
                    case 14:
                        if (points - 2 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 2");
                            changeIntelligencePurchaseMethod();
                            break;
                        }
                        points -= 2;
                        character.int_score++;
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
                        points--;
                        character.int_score++;
                        break;
                    case 15:
                    case 16:
                        if (points - 3 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 3");
                            changeIntelligencePurchaseMethod();
                            break;
                        }
                        points -= 3;
                        character.int_score++;
                        break;
                    case 17:
                        if (points - 4 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 4");
                            changeIntelligencePurchaseMethod();
                            break;
                        }
                        points -= 4;
                        character.int_score++;
                        break;
                    case 18:
                        delayedPrint("You can't raise an ability score above 18");
                        break;
                }
                changeIntelligencePurchaseMethod();
                break;
            case 2:
                switch (character.int_score) {
                    case 7:
                        delayedPrint("You can't lower an ability below 7");
                        break;
                    case 8:
                    case 14:
                    case 15:
                        points += 2;
                        character.int_score--;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        points++;
                        character.int_score--;
                        break;
                    case 16:
                    case 17:
                        points += 3;
                        character.int_score--;
                        break;
                    case 18:
                        points += 4;
                        character.int_score--;
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
        delayedPrint("Points remaining: " + points);
        delayedPrint("Your wisdom is: " + character.wis_score);
        delayedPrint("1. Increase");
        delayedPrint("2. Decrease");
        delayedPrint("3. Keep");
        delayedPrint("Please enter which option you'd like to do");
        int option = chooseOption(3);
        switch (option) {
            case 1:
                switch (character.wis_score) {
                    case 7:
                    case 13:
                    case 14:
                        if (points - 2 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 2");
                            changeWisdomPurchaseMethod();
                            break;
                        }
                        points -= 2;
                        character.wis_score++;
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
                        points--;
                        character.wis_score++;
                        break;
                    case 15:
                    case 16:
                        if (points - 3 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 3");
                            changeWisdomPurchaseMethod();
                            break;
                        }
                        points -= 3;
                        character.wis_score++;
                        break;
                    case 17:
                        if (points - 4 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 4");
                            changeWisdomPurchaseMethod();
                            break;
                        }
                        points -= 4;
                        character.wis_score++;
                        break;
                    case 18:
                        delayedPrint("You can't raise an ability score above 18");
                        break;
                }
                changeWisdomPurchaseMethod();
                break;
            case 2:
                switch (character.wis_score) {
                    case 7:
                        delayedPrint("You can't lower an ability below 7");
                        break;
                    case 8:
                    case 14:
                    case 15:
                        points += 2;
                        character.wis_score--;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        points++;
                        character.wis_score--;
                        break;
                    case 16:
                    case 17:
                        points += 3;
                        character.wis_score--;
                        break;
                    case 18:
                        points += 4;
                        character.wis_score--;
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
        delayedPrint("Points remaining: " + points);
        delayedPrint("Your charisma is: " + character.cha_score);
        delayedPrint("1. Increase");
        delayedPrint("2. Decrease");
        delayedPrint("3. Keep");
        delayedPrint("Please enter which option you'd like to do");
        int option = chooseOption(3);
        switch (option) {
            case 1:
                switch (character.cha_score) {
                    case 7:
                    case 13:
                    case 14:
                        if (points - 2 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 2");
                            changeCharismaPurchaseMethod();
                            break;
                        }
                        points -= 2;
                        character.cha_score++;
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
                        points--;
                        character.cha_score++;
                        break;
                    case 15:
                    case 16:
                        if (points - 3 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 3");
                            changeCharismaPurchaseMethod();
                            break;
                        }
                        points -= 3;
                        character.cha_score++;
                        break;
                    case 17:
                        if (points - 4 < 0) {
                            delayedPrint("You don't have enough points to do that");
                            delayedPrint("Amount needed: 4");
                            changeCharismaPurchaseMethod();
                            break;
                        }
                        points -= 4;
                        character.cha_score++;
                        break;
                    case 18:
                        delayedPrint("You can't raise an ability score above 18");
                        break;
                }
                changeCharismaPurchaseMethod();
                break;
            case 2:
                switch (character.cha_score) {
                    case 7:
                        delayedPrint("You can't lower an ability below 7");
                        break;
                    case 8:
                    case 14:
                    case 15:
                        points += 2;
                        character.cha_score--;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        points++;
                        character.cha_score--;
                        break;
                    case 16:
                    case 17:
                        points += 3;
                        character.cha_score--;
                        break;
                    case 18:
                        points += 4;
                        character.cha_score--;
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
        delayedPrint("Strength: " + character.str_score);
        delayedPrint("Dexterity: " + character.dex_score);
        delayedPrint("Constitution: " + character.con_score);
        delayedPrint("Intelligence: " + character.int_score);
        delayedPrint("Wisdom: " + character.wis_score);
        delayedPrint("Charisma: " + character.cha_score);
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
            character.str_score = scan.nextInt();
        } catch (InputMismatchException e) {
            delayedPrint("Please enter a number");
            setStrengthManualInput();
        }
    }

    public static void setDexterityManualInput() {
        delayedPrint("Please enter what you would like your dexterity to be:");
        try {
            Scanner scan = new Scanner(System.in);
            character.dex_score = scan.nextInt();
        } catch (InputMismatchException e) {
            delayedPrint("Please enter a number");
            setDexterityManualInput();
        }
    }

    public static void setConstitutionManualInput() {
        delayedPrint("Please enter what you would like your constitution to be:");
        try {
            Scanner scan = new Scanner(System.in);
            character.con_score = scan.nextInt();
        } catch (InputMismatchException e) {
            delayedPrint("Please enter a number");
            setConstitutionManualInput();
        }
    }

    public static void setIntelligenceManualInput() {
        delayedPrint("Please enter what you would like your intelligence to be:");
        try {
            Scanner scan = new Scanner(System.in);
            character.int_score = scan.nextInt();
        } catch (InputMismatchException e) {
            delayedPrint("Please enter a number");
            setIntelligenceManualInput();
        }
    }

    public static void setWisdomManualInput() {
        delayedPrint("Please enter what you would like your wisdom to be:");
        try {
            Scanner scan = new Scanner(System.in);
            character.wis_score = scan.nextInt();
        } catch (InputMismatchException e) {
            delayedPrint("Please enter a number");
            setWisdomManualInput();
        }
    }

    public static void setCharismaManualInput() {
        delayedPrint("Please enter what you would like your charisma to be:");
        try {
            Scanner scan = new Scanner(System.in);
            character.cha_score = scan.nextInt();
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
                setRaceCustom();
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
                delayedPrint("Dwarves are proficient with battleaxes, heavy picks, and warhammers, and treat any weapon with the name \"dwarven\" in its name as a martial weapon.");
                break;
            case 14:
                delayedPrint("Dwarves begin play speaking Common and Dwarven.");
                delayedPrint("Dwarves with a high intelligence scores can choose from the following: Giant, Gnome, Goblin, Orc, Terran, and Undercommon.");
                break;
            case 15:
                new dwarf(character);
                chooseClass();
            case 16:
                chooseRace();
        }
        raceDwarf();
    }

    public static void raceElf(){
        delayedPrint("Elf:");
        delayedPrint("What would you like to know about Elves?");
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
        delayedPrint("15. Choose Elf as your race");
        delayedPrint("16. Return to Race Screen");
        int option = chooseOption(17);
        switch (option){
            case 1:
                delayedPrint("The long-lived elves are children of the natural world, similar in many superficial ways to fey creatures, yet different as well.");
                delayedPrint("Elves value their privacy and traditions, and while they are often slow to make friends, at both the personal and national levels, once an outsider is accepted as a comrade, such alliances can last for generations.");
                delayedPrint("Elves have a curious attachment to their surroundings, perhaps a result of their incredibly long lifespans or some deeper, more mystical reason.");
                delayedPrint("Elves who dwell in a region for long find themselves physically adapting to match their surroundings, most noticeably taking on coloration reflecting the local environment.");
                delayedPrint("Those elves that spend lives among the short-lived races, on the other hand, often develop a skewed perception of mortality and become morose, the result of watching wave after wave of companions age and die before their eyes.");
                break;
            case 2:
                delayedPrint("While generally taller than humans, elves possess a fragile grace, accentuated by long features and sharply pointed ears.");
                delayedPrint("Their eyes are wide and almond-shaped, featuring large and vibrant-colored pupils that make up the entire visible portion of the eye.");
                delayedPrint("These pupils give them an alien look and allow them to see sharply even in very little light.");
                delayedPrint("Elves gradually adapt to their environment and their companions, and they often take on physical traits reflecting their surroundings.");
                delayedPrint("An elf who has dwelled in primeval forests for centuries, for example, might exhibit verdant hair and gnarled fingers, while one who’s lived in a desert might have golden pupils and skin.");
                delayedPrint("Elven fashion, like the elves themselves, tends to reflect their surroundings.");
                delayedPrint("Elves living in the forests and other wilderness locales wear clothing that plays off the terrain and flora of their homes, while those who live in cities tend to wear the latest fashions.");
                delayedPrint("Elves reach physical adulthood around the age of 20, though they aren’t considered to be fully emotionally mature by other elves until closer to the passing of their first century, once they’ve experienced more, held several occupations, and outlived a generation of shorter-lived people.");
                delayedPrint("A typical elf can live to around 600 years old.");
                break;
            case 3:
                delayedPrint("Elven culture is deep, rich, and on the decline.");
                delayedPrint("Their society peaked millennia ago, long before they fled the world to escape a great calamity.");
                delayedPrint("They’ve since returned, but rebuilding is no easy task.");
                delayedPrint("Their inborn patience and intellectual curiosity make elves excellent sages, philosophers, and wizards, and their societies are built upon their inherent sense of wonder and knowledge.");
                delayedPrint("Elven architecture displays their deep appreciation of beauty, and elven cities are wondrous works of art.");
                delayedPrint("Elves hold deeply seated ideals of individualism, allowing each elf to explore multiple occupations before alighting on a particular pursuit or passion that suits her best.");
                delayedPrint("Elves bear notorious grudges against rivals, which the elves call ilduliel, but these antagonistic relationships can sometimes blossom into friendships over time.");
                break;
            case 4:
                delayedPrint("Elves are prone to dismissing other races, writing them off as rash and impulsive, yet they are excellent judges of character.");
                delayedPrint("An elf might not want a dwarf neighbor, but would be the first to acknowledge that dwarf's skill at smithing.");
                delayedPrint("They regard gnomes as strange (and sometimes dangerous) curiosities, and halflings with a measure of pity, for these small folk seem to the elves to be adrift, without a traditional home.");
                delayedPrint("Elves are fascinated with humans, as evidenced by the number of half-elves in the world, even if they usually disown such offspring.");
                delayedPrint("They regard half-orcs with distrust and suspicion.");
                break;
            case 5:
                delayedPrint("Elves are often emotional and capricious, yet they hold high ideals close to their hearts.");
                delayedPrint("As such, many are chaotic good.");
                delayedPrint("They prefer deities who share their love of all things mystic and artistic.");
                delayedPrint("Desna and Shelyn are particular favorites, the former for her sense of wonder and the latter for her appreciation of artistry.");
                delayedPrint("Calistria is the most notorious of elven deities, as she represents many of the elven ideals taken to the extreme.");
                break;
            case 6:
                delayedPrint("Many elves embark on adventures out of a desire to explore the world, leaving their secluded forest realms to reclaim forgotten elven magic or search out lost kingdoms established millennia abo by their forefathers.");
                delayedPrint("For those raised among humans, the ephemeral and unfettered life of an adventurer holds natural appeal.");
                delayedPrint("Elves generally eschew melee because of their frailty, preferring instead to pursue classes such as wizards and rangers.");
                break;
            case 7:
                delayedPrint("An elf keeps their personal name secret among their family, while giving a nickname when meeting other people.");
                delayedPrint("This nickname can change over time, due to events in the elf’s life or even on a whim.");
                delayedPrint("A single elf might be known by many names by associates of different ages and regions.");
                delayedPrint("Elven names consist of multiple syllables and are meant to flow lyrically—at least in the Elven tongue.");
                delayedPrint("They so commonly end in “-el” or “-ara” that other cultures sometimes avoid names ending in these syllables to avoid sounding too elven.");
                delayedPrint("Male Name Examples: Caladrel, Heldalel, Lanliss, Meirdrarel, Seldlon, Talathel, Variel, Zordlon.");
                delayedPrint("Female Name Examples: Amrunelara, Dardlara, Faunra, Jathal, Merisiel, Oparal, Soumral, Tessara, Yalandlara.");
                break;
            case 8:
                delayedPrint("+2 Dexterity, +2 Intelligence, -2 Constitution: Elves are nimble, both body and mind, but their form is frail.");
                break;
            case 9:
                delayedPrint("Medium: Elves are Medium creatures and have no bonuses or penalties due to their size.");
                break;
            case 10:
                delayedPrint("Normal Speed: Elves have a base speed of 30 feet");
                break;
            case 11:
                delayedPrint("Low-Light Vision: Elves can see twice as far as humans in conditions of dim-light.");
                break;
            case 12:
                delayedPrint("Elven Immunities: Elves are immune to magic sleep effects and get a +2 racial saving throw bonus against enchantment spells and effects.");
                delayedPrint("Elven Magic: Elves receive a +2 racial bonus on caster level checks made to overcome spell resistance.");
                delayedPrint("In addition, elves receive a +2 racial bonus on Spellcraft skill checks made to identify the properties of magic items.");
                delayedPrint("Keen Senses: Elves receive a +2 racial bonus on Perception skill checks.");
                break;
            case 13:
                delayedPrint("Elves are proficient with longbows (including composite longbows), longswords, rapiers, and shortbows (including composite shortbows), and treat any weapon with the name \"elven\" in its name as a martial weapon.");
                break;
            case 14:
                delayedPrint("Elves begin play speaking Common and Elven.");
                delayedPrint("Elves with a high intelligence scores can choose from the following: Celestial, Draconic, Gnoll, Goblin, Orc, and Sylvan.");
                break;
            case 15:
                new elf(character);
                chooseClass();
            case 16:
                chooseRace();
        }
        raceElf();
    }

    public static void raceGnome(){
        delayedPrint("Gnome:");
        delayedPrint("What would you like to know about Gnomes?");
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
        delayedPrint("15. Choose Gnome as your race");
        delayedPrint("16. Return to Race Screen");
        int option = chooseOption(17);
        switch (option){
            case 1:
                delayedPrint("Gnomes trace their lineage back to the mysterious realm of the fey, a place where colors are brighter, the wildlands wilder, and emotions more primal.");
                delayedPrint("Unknown forces drove the ancient gnomes from that realm long ago, forcing them to seek refuge in this world; despite this, the gnomes have never completely abandoned their fey roots or adapted to mortal culture.");
                delayedPrint("As a result, gnomes are widely regarded by the other races as alien and strange.");
                break;
            case 2:
                delayedPrint("Gnomes are one of the smallest of the common races, generally standing just over 3 feet in height.");
                delayedPrint("Their hair tends toward vibrant colors such as the fiery orange of autumn leaves, the verdant green of forests at  springtime, or the deep reds and purples of wildflowers in  bloom.");
                delayedPrint("Similarly, their flesh tones range from earthy browns to floral pinks, frequently with little regard for heredity.");
                delayedPrint("Gnomes possess highly mutable facial characteristics, and  many have overly large mouths and eyes, an effect which can  be both disturbing and stunning, depending on the individual.");
                break;
            case 3:
                delayedPrint("Unlike most races, gnomes do not generally organize themselves within classic societal structures.");
                delayedPrint("Whimsical creatures at heart, they typically travel alone or  with temporary companions, ever seeking new and more  exciting experiences.");
                delayedPrint("They rarely form enduring relationships among themselves or with members of other races, instead pursuing crafts, professions, or collections with  a passion that borders on zealotry.");
                delayedPrint("Male gnomes have a strange fondness for unusual hats and headgear, while females often proudly wear elaborate and eccentric hairstyles.");
                break;
            case 4:
                delayedPrint("Gnomes have difficulty interacting with the other races, on both emotional and physical levels.");
                delayedPrint("Gnome humor is hard to translate and often comes across as malicious or senseless to other races, while gnomes in turn tend to think of the taller races as dull and lumbering giants.");
                delayedPrint("They get along well with halflings and humans, but are overly fond of playing jokes on dwarves and half-orcs, whom most gnomes feel need to lighten up.");
                delayedPrint("They respect elves, but often grow frustrated with the comparatively slow pace at which members of the long-lived race make decisions.");
                delayedPrint("To the gnomes, action is always better than inaction, and many gnomes carry several highly involved projects with them at all times to keep themselves entertained during rest periods.");
                break;
            case 5:
                delayedPrint("Although gnomes are impulsive tricksters, with sometimes inscrutable motives and equally confusing methods, their hearts are generally in the right place.");
                delayedPrint("They are prone to powerful fits of emotion, and find themselves most at peace within the natural world.");
                delayedPrint("Gnomes are usually neutral good.");
                delayedPrint("Gnomes most commonly worship deities that value individuality and nature, such as Cayden Cailean, Desna, Gozreh, and Shelyn.");
                break;
            case 6:
                delayedPrint("Gnomes' propensity for wanderlust makes them natural adventurers.");
                delayedPrint("They often become wanderers to experience new aspects of life, for nothing is as novel as the uncounted dangers facing adventurers.");
                delayedPrint("Gnomes make up for their weakness with a proclivity for sorcery or bardic music.");
                break;
            case 7:
                delayedPrint("Gnome names can get quite complex and polysyllabic.");
                delayedPrint("They have little interest in familial names, and most children receive their names purely on a parent’s whim.");
                delayedPrint("Gnomes rarely concern themselves with how easy their names are to pronounce, and they often go by shorter nicknames.");
                delayedPrint("Some even collect and chronicle these nicknames. Among gnomes, the shorter the name, the more feminine it’s considered to be.");
                delayedPrint("Male Name Examples: Abroshtor, Bastargre, Halungalom, Krolmnite, Poshment, Zarzuket, Zatqualmie.");
                delayedPrint("Female Name Examples: Besh, Fijit, Lini, Nejo, Majet, Pai, Queck, Trig.");
                break;
            case 8:
                delayedPrint("+2 Constitution, +2 Charisma, –2 Strength: Gnomes are physically weak but surprisingly hardy, and their attitude makes them naturally agreeable");
                break;
            case 9:
                delayedPrint("Small: Gnomes are Small creatures and gain a +1 size bonus to their AC, a +1 size bonus on attack rolls, a –1 penalty to their Combat Maneuver Bonus and Combat Maneuver Defense, and a +4 size bonus on Stealth checks.");
                break;
            case 10:
                delayedPrint("Slow Speed: Gnomes have a base speed of 20 feet");
                break;
            case 11:
                delayedPrint("Low-Light Vision: Gnomes can see twice as far as humans in conditions of dim light.");
                break;
            case 12:
                delayedPrint("Defensive Training: Gnomes get a +4 dodge bonus to AC against monsters of the giant type.");
                delayedPrint("Gnome Magic: Gnomes add +1 to the DC of any saving throws against illusion spells that they cast.");
                delayedPrint("Gnomes with a Charisma of 11 or higher also gain the following spell-like abilities: 1/day—dancing lights, ghost sound, prestidigitation, and speak with animals.");
                delayedPrint("The caster level for these effects is equal to the gnome's level.");
                delayedPrint("The DC for these spells is equal to 10 + the spell's level + the gnome's Charisma modifier.");
                delayedPrint("Hatred: Gnomes receive a +1 bonus on attack rolls against humanoid creatures of the reptilian and goblinoid subtypes due to special training against these hated foes.");
                delayedPrint("Illusion Resistance: Gnomes get a +2 racial saving throw bonus against illusion spells or effects.");
                delayedPrint("Keen Senses: Gnomes receive a +2 racial bonus on Perception skill checks.");
                delayedPrint("Obsessive: Gnomes receive a +2 racial bonus on a Craft or Profession skill of their choice.");
                break;
            case 13:
                delayedPrint("Gnomes treat any weapon with the word \"gnome\" in its name as a martial weapon.");
                break;
            case 14:
                delayedPrint("Gnomes begin play speaking Common, Gnome, and Sylvan.");
                delayedPrint("Gnomes with high Intelligence scores can choose from the following: Draconic, Dwarven, Elven, Giant, Goblin, and Orc.");
                break;
            case 15:
                new gnome(character);
                chooseClass();
            case 16:
                chooseRace();
        }
        raceGnome();
    }

    public static void raceHalfElf(){
        delayedPrint("Half-Elf:");
        delayedPrint("What would you like to know about Half-Elfs?");
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
        delayedPrint("15. Choose Half-Elf as your race");
        delayedPrint("16. Return to Race Screen");
        int option = chooseOption(17);
        switch (option){
            case 1:
                delayedPrint("Elves have long drawn the covetous gazes of other races.");
                delayedPrint("Their generous life spans, magical affinity, and inherent grace each contribute to the admiration or bitter envy of their neighbors.");
                delayedPrint("Of all their traits, however, none so entrance their human associates as their beauty. Since the two races first came into contact with each other, the humans have held up elves as models of physical perfection, seeing in the fair folk idealized versions of themselves.");
                delayedPrint("For their part, many elves find humans attractive despite their comparatively barbaric ways, drawn to the passion and impetuosity with which members of the younger race play out their brief lives.");
                delayedPrint("Sometimes this mutual infatuation leads to romantic relationships.");
                delayedPrint("Though usually short-lived, even by human standards, these trysts commonly lead to the birth of halfelves, a race descended of two cultures yet inheritor of neither.");
                delayedPrint("Half-elves can breed with one another, but even these “pureblood” half-elves tend to be viewed as bastards by humans and elves alike.");
                break;
            case 2:
                delayedPrint("Half-elves stand taller than humans but shorter than elves.");
                delayedPrint("They inherit the lean build and comely features of their elven lineage, but their skin color is dictated by their human side.");
                delayedPrint("While half-elves retain the pointed ears of elves, theirs are more rounded and less pronounced.");
                delayedPrint("A half-elf's human-like eyes tend to range a spectrum of exotic colors running from amber or violet to emerald green and deep blue.");
                break;
            case 3:
                delayedPrint("The lack of a unified homeland and culture forces half-elves to remain versatile, able to conform to nearly any environment.");
                delayedPrint("While often attractive to both races for the same reasons as their parents, half-elves rarely fit in with either humans or elves, as both races see too much evidence of the other in them.");
                delayedPrint("This lack of acceptance weighs heavily on many half-elves, yet others are bolstered by their unique status, seeing in their lack of a formalized culture the ultimate freedom.");
                delayedPrint("As a result, half-elves are incredibly adaptable, capable of adjusting their mindsets and talents to whatever societies they find themselves in.");
                break;
            case 4:
                delayedPrint("A half-elf understands loneliness, and knows that character is often less a product of race than of life experience.");
                delayedPrint("As such, half-elves are often open to friendships and alliances with other races, and less likely to rely on first impressions when forming opinions of new acquaintances.");
                break;
            case 5:
                delayedPrint("Half-elves' isolation strongly influences their characters and philosophies.");
                delayedPrint("Cruelty does not come naturally to them, nor does blending in and bending to societal convention—as a result, most half-elves are chaotic good.");
                delayedPrint("Half-elves' lack of a unified culture makes them less likely to turn to religion, but those who do generally follow the common faiths of their homeland.");
                break;
            case 6:
                delayedPrint("Half-elves tend to be itinerants, wandering the lands in search of a place they might finally call home.");
                delayedPrint("The desire to prove oneself to the community and establish a personal identity—or even a legacy—drives many half-elf adventurers to lives of bravery.");
                break;
            case 7:
                delayedPrint("Male Name Examples: Calathes, Encinal, Kyras, Narciso, Quiray, Satinder, Seltyiel, Zirul.");
                delayedPrint("Female Name Examples: Cathran, Elsbeth, Iandoli, Kieyanna, Lialda, Maddela, Reda, Tamarie.");
                break;
            case 8:
                delayedPrint("+2 to One Ability Score: Half-elf characters get a +2 bonus to one ability score of their choice at creation to represent their varied nature.");
                break;
            case 9:
                delayedPrint("Medium: Half-elves are Medium creatures and have no bonuses or penalties due to their size");
                break;
            case 10:
                delayedPrint("Normal Speed: Half-elves have a base speed of 30 feet");
                break;
            case 11:
                delayedPrint("Low-Light Vision: Half-elves can see twice as far as humans in conditions of dim light");
                break;
            case 12:
                delayedPrint("Adaptability: Half-elves receive Skill Focus as a bonus feat at 1st level.");
                delayedPrint("Elf Blood: Half-elves count as both elves and humans for any effect related to race.");
                delayedPrint("Elven Immunities: Half-elves are immune to magic sleep effects and get a +2 racial saving throw bonus against enchantment spells and effects.");
                delayedPrint("Keen Senses: Gnomes receive a +2 racial bonus on Perception skill checks.");
                delayedPrint("Multitalented: Half-elves choose two favored classes at first level and gain +1 hit point or +1 skill point whenever they take a level in either one of those classes.");

                break;
            case 13:
                delayedPrint("Half-Elves don't get any proficiencies.");
                break;
            case 14:
                delayedPrint("Half-elves begin play speaking Common and Elven.");
                delayedPrint("Half-elves with high Intelligence scores can choose any languages they want (except secret languages, such as Druidic).");
                break;
            case 15:
                new half_elf(character);
                chooseClass();
            case 16:
                chooseRace();
        }
        raceHalfElf();
    }

    public static void raceHalfOrc(){
        delayedPrint("Half-Orc:");
        delayedPrint("What would you like to know about Half-Orcs?");
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
        delayedPrint("15. Choose Half-Orc as your race");
        delayedPrint("16. Return to Race Screen");
        int option = chooseOption(17);
        switch (option){
            case 1:
                delayedPrint("Half-orcs are monstrosities, their tragic births the result of perversion and violence—or at least, that's how other races see them.");
                delayedPrint("It's true that half-orcs are rarely the result of loving unions, and as such are usually forced to grow up hard and fast, constantly fighting for protection or to make names for themselves.");
                delayedPrint("Feared, distrusted, and spat upon, half-orcs still consistently manage to surprise their detractors with great deeds and unexpected wisdom—though sometimes it's easier just to crack a few skulls.");
                break;
            case 2:
                delayedPrint("Both genders of half-orc stand between 6 and 7 feet tall, with powerful builds and greenish or grayish skin.");
                delayedPrint("Their canines often grow long enough to protrude from their mouths, and these “tusks,” combined with heavy brows and slightly pointed ears, give them their notoriously bestial appearance.");
                delayedPrint("While half-orcs may be impressive, few ever describe them as beautiful.");
                break;
            case 3:
                delayedPrint("Unlike half-elves, where at least part of society's discrimination is born out of jealousy or attraction, half-orcs get the worst of both worlds: physically weaker than their orc kin, they also tend to be feared or attacked outright by the legions of humans who don't bother making the distinction between full orcs and halfbloods.");
                delayedPrint("Still, while not exactly accepted, half-orcs in civilized societies tend to be valued for their martial prowess, and orc leaders have actually been known to spawn them intentionally, as the halfbreeds regularly make up for their lack of physical strength with increased cunning and aggression, making them natural chieftains and strategic advisors.");
                break;
            case 4:
                delayedPrint("A lifetime of persecution leaves the average halforc wary and quick to anger, yet those who break through his savage exterior might find a well-hidden core of empathy.");
                delayedPrint("Elves and dwarves tend to be the least accepting of half-orcs, seeing in them too great a resemblance to their racial enemies, but other races aren't much more understanding.");
                delayedPrint("Human societies with few orc problems tend to be the most accommodating, and there half-orcs make natural mercenaries and enforcers.");
                break;
            case 5:
                delayedPrint("Forced to live either among brutish orcs or as lonely outcasts in civilized lands, most half-orcs are bitter, violent, and reclusive.");
                delayedPrint("Evil comes easily to them, but they are not evil by nature—rather, most half-orcs are chaotic neutral, having been taught by long experience that there's no point doing anything but that which directly benefits themselves.");
                delayedPrint("When they bother to worship the gods, they tend to favor deities who promote warfare or individual strength, such as Gorum, Cayden Cailean, Lamashtu, and Rovagug.");
                break;
            case 6:
                delayedPrint("Staunchly independent, many half-orcs take to lives of adventure out of necessity, seeking to escape their painful pasts or improve their lot through force of arms.");
                delayedPrint("Others, more optimistic or desperate for acceptance, take up the mantle of crusaders in order to prove their worth to the world.");
                break;
            case 7:
                delayedPrint("Male Name Examples: Ausk, Davor, Hakak, Kizziar, Makoa, Nesteruk, Tsadok.");
                delayedPrint("Female Name Examples: Canan, Drogheda, Goruza, Mazon, Shirish, Tevaga, Zeljka.");
                break;
            case 8:
                delayedPrint("+2 to One Ability Score: Half-orc characters get a +2 bonus to one ability score of their choice at creation to represent their varied nature.");
                break;
            case 9:
                delayedPrint("Medium: Half-orcs are Medium creatures and have no bonuses or penalties due to their size");
                break;
            case 10:
                delayedPrint("Normal Speed: Half-orcs have a base speed of 30 feet");
                break;
            case 11:
                delayedPrint("Darkvision: Half-orcs can see in the dark up to 60 feet.");
                break;
            case 12:
                delayedPrint("Intimidating: Half-orcs receive a +2 racial bonus on Intimidate skill checks due to their fearsome nature.");
                delayedPrint("Orc Blood: Half-orcs count as both humans and orcs for any effect related to race.");
                delayedPrint("Orc Ferocity: Once per day, when a half-orc is brought below 0 hit points but not killed, he can fight on for one more round as if disabled.");
                delayedPrint("At the end of his next turn, unless brought to above 0 hit points, he immediately falls unconscious and begins dying.");
                break;
            case 13:
                delayedPrint("Half-orcs are proficient with greataxes and falchions and treat any weapon with the word \"orc\" in its name as a martial weapon");
                break;
            case 14:
                delayedPrint("Half-orcs begin play speaking Common and Orc.");
                delayedPrint("Half-orcs with high Intelligence scores can choose from the following: Abyssal, Draconic, Giant, Gnoll, and Goblin.");
                break;
            case 15:
                new half_orc(character);
                chooseClass();
            case 16:
                chooseRace();
        }
        raceHalfOrc();
    }

    public static void raceHalfling(){
        delayedPrint("Halfling:");
        delayedPrint("What would you like to know about Halflings?");
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
        delayedPrint("15. Choose Halfling as your race");
        delayedPrint("16. Return to Race Screen");
        int option = chooseOption(17);
        switch (option){
            case 1:
                delayedPrint("Optimistic and cheerful by nature, blessed with uncanny luck and driven by a powerful wanderlust, halflings make up for their short stature with an abundance of bravado and curiosity.");
                delayedPrint("At once excitable and easy-going, halflings like to keep an even temper and a steady eye on opportunity, and are not as prone as some of the more volatile races to violent or emotional outbursts.");
                delayedPrint("Even in the jaws of catastrophe, a halfling almost never loses his sense of humor.");
                delayedPrint("Halflings are inveterate opportunists.");
                delayedPrint("Unable to physically defend themselves from the rigors of the world, they know when to bend with the wind and when to hide away.");
                delayedPrint("Yet a halfling's curiosity often overwhelms his good sense, leading to poor decisions and narrow escapes.");
                delayedPrint("Though their curiosity drives them to travel and seek new places and experiences, halflings possess a strong sense of house and home, often spending above their means to enhance the comforts of home life.");
                break;
            case 2:
                delayedPrint("Halflings rise to a humble height of 3 feet.");
                delayedPrint("They prefer to walk barefoot, leading to the bottoms of their feet being roughly calloused.");
                delayedPrint("Tufts of thick, curly hair warm the tops of their broad, tanned feet.");
                delayedPrint("Their skin tends toward a rich almond color and their hair toward light shades of brown.");
                delayedPrint("A halfling's ears are pointed, but proportionately not much larger than those of a human.");
                break;
            case 3:
                delayedPrint("Halflings claim no cultural homeland and control no settlements larger than rural assemblies of free towns.");
                delayedPrint("Far more often, they dwell at the knees of their human cousins in human cities, eking out livings as they can from the scraps of larger societies.");
                delayedPrint("Many halflings lead perfectly fulfilling lives in the shadow of their larger neighbors, while some prefer more nomadic lives on the road, traveling the world and experiencing all it has to offer.");
                break;
            case 4:
                delayedPrint("A typical halfling prides himself on his ability to go unnoticed by other races—it is this trait that allows so many halflings to excel at thievery and trickery.");
                delayedPrint("Most halflings, knowing full well the stereotyped view other races take of them as a result, go out of their way to be forthcoming and friendly to the bigger races when they're not trying to go unnoticed.");
                delayedPrint("They get along fairly well with gnomes, although most halflings regard these eccentric creatures with a hefty dose of caution.");
                delayedPrint("Halflings coexist well with humans as a general rule, but since some of the more aggressive human societies value halflings as slaves, halflings try not to grow too complacent when dealing with them.");
                delayedPrint("Halflings respect elves and dwarves, but these races generally live in remote regions far from the comforts of civilization that halflings enjoy, thus limiting opportunities for interaction.");
                delayedPrint("Only half-orcs are generally shunned by halflings, for their great size and violent natures are a bit too intimidating for most halflings to cope with.");
                break;
            case 5:
                delayedPrint("Halflings are loyal to their friends and families, but since they dwell in a world dominated by races twice as large as themselves, they've come to grips with the fact that sometimes they'll need to scrap and scrounge for survival.");
                delayedPrint("Most halflings are neutral as a result.");
                delayedPrint("Halflings favor gods that encourage small, tight-knit communities, be they for good (like Erastil) or evil (like Norgorber).");
                break;
            case 6:
                delayedPrint("Their inherent luck coupled with their insatiable wanderlust makes halflings ideal for lives of adventure.");
                delayedPrint("Other such vagabonds tend to put up with the curious race in hopes that some of their mystical luck will rub off.");
                break;
            case 7:
                delayedPrint("Halfling names are usually two to three syllables, with a gentle sound that avoids hard consonants.");
                delayedPrint("Preferring their names to sound humble, halflings see overly long or complex names as a sign of arrogance.");
                delayedPrint("This goes only for their own people, however—halflings have names that suit them, and they understand that elves and humans might have longer names to suit their own aesthetics.");
                delayedPrint("Humans in particular have a tendency to refer to halflings by nicknames, with “Lucky” being common to the point of absurdity.");
                delayedPrint("Male Name Examples: Antal, Boram, Evan, Jamir, Kaleb, Lem, Miro, Sumak.");
                delayedPrint("Female Name Examples: Anafa, Bellis, Etune, Filiu, Lissa, Marra, Rillka, Sistra, Yamyra.");
                break;
            case 8:
                delayedPrint("+2 Dexterity, +2 Charisma, –2 Strength: Halflings are nimble and strong-willed, but their small stature makes them weaker than other races.");
                break;
            case 9:
                delayedPrint("Small: Halflings are Small creatures and gain a +1 size bonus to their AC, a +1 size bonus on attack rolls, a –1 penalty to their Combat Maneuver Bonus and Combat Maneuver Defense, and a +4 size bonus on Stealth checks.");
                break;
            case 10:
                delayedPrint("Slow Speed: Halflings have a base speed of 20 feet.");
                break;
            case 11:
                delayedPrint("Halflings have no changes to vision");
                break;
            case 12:
                delayedPrint("Fearless: Halflings receive a +2 racial bonus on all saving throws against fear. This bonus stacks with the bonus granted by halfling luck.");
                delayedPrint("Halfling Luck: Halflings receive a +1 racial bonus on all saving throws.");
                delayedPrint("Keen Senses: Halflings receive a +2 racial bonus on Perception skill checks.");
                delayedPrint("Sure-Footed: Halflings receive a +2 racial bonus on Acrobatics and Climb skill checks.");
                break;
            case 13:
                delayedPrint("Halflings are proficient with slings and treat any weapon with the word \"halfling\" in its name as a martial weapon.\n");
                break;
            case 14:
                delayedPrint("Halflings begin play speaking Common and Halfling.");
                delayedPrint("Halflings with high Intelligence scores can choose from the following: Dwarven, Elven, Gnome, and Goblin");
                break;
            case 15:
                new halfling(character);
                chooseClass();
            case 16:
                chooseRace();
        }
        raceHalfling();
    }

    public static void raceHuman(){
        delayedPrint("Human:");
        delayedPrint("What would you like to know about Humans?");
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
        delayedPrint("15. Choose Human as your race");
        delayedPrint("16. Return to Race Screen");
        int option = chooseOption(17);
        switch (option){
            case 1:
                delayedPrint("Humans possess exceptional drive and a great capacity to endure and expand, and as such are currently the dominant race in the world.");
                delayedPrint("Their empires and nations are vast, sprawling things, and the citizens of these societies carve names for themselves with the strength of their sword arms and the power of their spells.");
                delayedPrint("Humanity is best characterized by its tumultuousness and diversity, and human cultures run the gamut from savage but honorable tribes to decadent, devil-worshiping noble families in the most cosmopolitan cities.");
                delayedPrint("Human curiosity and ambition often triumph over their predilection for a sedentary lifestyle, and many leave their homes to explore the innumerable forgotten corners of the world or lead mighty armies to conquer their neighbors, simply because they can.");
                break;
            case 2:
                delayedPrint("The physical characteristics of humans are as varied as the world's climes.");
                delayedPrint("From the darkskinned tribesmen of the southern continents to the pale and barbaric raiders of the northern lands, humans possess a wide variety of skin colors, body types, and facial features.");
                delayedPrint("Generally speaking, humans' skin color assumes a darker hue the closer to the equator they live.");
                break;
            case 3:
                delayedPrint("Human society comprises a multitude of governments, attitudes, and lifestyles.");
                delayedPrint("Though the oldest human cultures trace their histories thousands of years into the past, when compared to the societies of common races like elves and dwarves, human society seems to be in a state of constant flux as empires fragment and new kingdoms subsume the old.");
                delayedPrint("In general, humans are known for their flexibility, ingenuity, and ambition.");
                break;
            case 4:
                delayedPrint("Humans are fecund, and their drive and numbers often spur them into contact with other races during bouts of territorial expansion and colonization.");
                delayedPrint("In many cases, this leads to violence and war, yet humans are also swift to forgive and forge alliances with races who do not try to match or exceed them in violence.");
                delayedPrint("Proud, sometimes to the point of arrogance, humans might look upon dwarves as miserly drunkards, elves as flighty fops, halflings as craven thieves, gnomes as twisted maniacs, and half-elves and halforcs as embarrassments—but the race's diversity among its own members also makes humans quite adept at accepting others for what they are.");
                break;
            case 5:
                delayedPrint("Humanity is perhaps the most heterogeneous of all the common races, with a capacity for great evil and boundless good.");
                delayedPrint("Some assemble into vast barbaric hordes, while others build sprawling cities that cover miles.");
                delayedPrint("Taken as a whole, most humans are neutral, yet they generally tend to congregate in nations and civilizations with specific alignments.");
                delayedPrint("Humans also have the widest range in gods and religion, lacking other races' ties to tradition and eager to turn to anyone offering them glory or protection.");
                break;
            case 6:
                delayedPrint("Ambition alone drives countless humans, and for many, adventuring serves as a means to an end, whether it be wealth, acclaim, social status, or arcane knowledge.");
                delayedPrint("A few pursue adventuring careers simply for the thrill of danger.");
                delayedPrint("Humans hail from myriad regions and backgrounds, and as such can fill any role within an adventuring party.");
                break;
            case 7:
                delayedPrint("Unlike other races, who generally cleave to specific traditions and shared histories, humanity's diversity has resulted in a near-infinite set of names.");
                delayedPrint("The humans of a northern barbarian tribe have much different names than those hailing from a subtropical nation of sailors and tradesmen.");
                delayedPrint("Throughout most of the world humans speak Common, yet their names are as varied as their beliefs and appearances.");
                break;
            case 8:
                delayedPrint("+2 to One Ability Score: Human characters get a +2 bonus to one ability score of their choice at creation to represent their varied nature.");
                break;
            case 9:
                delayedPrint("Medium: Humans are Medium creatures and have no bonuses or penalties due to their size.");
                break;
            case 10:
                delayedPrint("Normal Speed: Humans have a base speed of 30 feet.");
                break;
            case 11:
                delayedPrint("Humans have no changes to vision");
                break;
            case 12:
                delayedPrint("Bonus Feat: Humans select one extra feat at 1st level.");
                delayedPrint("Skilled: Humans gain an additional skill rank at first level and one additional rank whenever they gain a level.");
                break;
            case 13:
                delayedPrint("Humans don't get any proficiencies.");
                break;
            case 14:
                delayedPrint("Humans begin play speaking Common");
                delayedPrint("Humans with high Intelligence scores can choose any languages they want (except secret languages, such as Druidic).");
                break;
            case 15:
                new human(character);
                chooseClass();
            case 16:
                chooseRace();
        }
        raceHuman();
    }

    public static void setRaceCustom(){
        new custom_race(character);
        chooseClass();
    }

    public static void chooseClass(){
        character.printEverything();
        System.out.println("PICK A FUCKING CLASS YOU WHORE");
        System.exit(-1);
    }
}
