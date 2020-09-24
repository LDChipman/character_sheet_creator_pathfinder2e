package liam.chipman;

import java.util.InputMismatchException;
import java.util.Scanner;

class custom_race extends race{

    void addToRace(player player){
        Main.delayedPrint("Create your custom race:");
        Main.delayedPrint("What would you like to add to your custom race");
        Main.delayedPrint("1. Ability Score Change");
        Main.delayedPrint("2. Size");
        Main.delayedPrint("3. Speed");
        Main.delayedPrint("4. Vision");
        Main.delayedPrint("5. Racial Trait");
        Main.delayedPrint("6. Weapon Familiarity");
        Main.delayedPrint("7. Language");
        Main.delayedPrint("8. Finished");
        Main.delayedPrint("Please choose which option you'd like to do:");
        int option = Main.chooseOption(8);
        switch (option) {
            case 1:
                Main.delayedPrint("Which ability score do you want to change");
                Main.delayedPrint("1. Strength");
                Main.delayedPrint("2. Dexterity");
                Main.delayedPrint("3. Constitution");
                Main.delayedPrint("4. Intelligence");
                Main.delayedPrint("5. Wisdom");
                Main.delayedPrint("6. Charisma");
                Main.delayedPrint("Please choose which option you'd like to do:");
                option = Main.chooseOption(6);
                switch (option) {
                    case 1:
                        Main.delayedPrint("Please enter how much you'd like your strength to change:");
                        try {
                            Scanner scan = new Scanner(System.in);
                            player.setStr_score(player.getStr_score() + scan.nextInt());
                        } catch (InputMismatchException e) {
                            Main.delayedPrint("That isn't a number");
                        }
                        break;
                    case 2:
                        Main.delayedPrint("Please enter how much you'd like your dexterity to change:");
                        try {
                            Scanner scan = new Scanner(System.in);
                            player.setDex_score(player.getDex_score() + scan.nextInt());
                        } catch (InputMismatchException e) {
                            Main.delayedPrint("That isn't a number");
                        }
                        break;
                    case 3:
                        Main.delayedPrint("Please enter how much you'd like your constitution to change:");
                        try {
                            Scanner scan = new Scanner(System.in);
                            player.setCon_score(player.getCon_score() + scan.nextInt());
                        } catch (InputMismatchException e) {
                            Main.delayedPrint("That isn't a number");
                        }
                        break;
                    case 4:
                        Main.delayedPrint("Please enter how much you'd like your intelligence to change:");
                        try {
                            Scanner scan = new Scanner(System.in);
                            player.setInt_score(player.getInt_score() + scan.nextInt());
                        } catch (InputMismatchException e) {
                            Main.delayedPrint("That isn't a number");
                        }
                        break;
                    case 5:
                        Main.delayedPrint("Please enter how much you'd like your wisdom to change:");
                        try {
                            Scanner scan = new Scanner(System.in);
                            player.setWis_score(player.getWis_score() + scan.nextInt());
                        } catch (InputMismatchException e) {
                            Main.delayedPrint("That isn't a number");
                        }
                        break;
                    case 6:
                        Main.delayedPrint("Please enter how much you'd like your charisma to change:");
                        try {
                            Scanner scan = new Scanner(System.in);
                            player.setCha_score(player.getCha_score() + scan.nextInt());
                        } catch (InputMismatchException e) {
                            Main.delayedPrint("That isn't a number");
                        }
                        break;
                }
                break;
            case 2:
                Main.delayedPrint("Please enter the size you want to be:");
                Scanner scan = new Scanner(System.in);
                player.setSize(scan.next());
                break;
            case 3:
                Main.delayedPrint("Please enter the base speed you want to have:");
                scan = new Scanner(System.in);
                player.setSpeed(scan.nextInt());
                break;
            case 4:
                Main.delayedPrint("Please enter the vision change you want to have:");
                scan = new Scanner(System.in);
                player.setVision(scan.next());
                break;
            case 5:
                Main.delayedPrint("Please enter the name of your racial trait:");
                scan = new Scanner(System.in);
                String name = scan.next();
                Main.delayedPrint("Please enter a short description of your racial trait:");
                scan = new Scanner(System.in);
                String short_desc = scan.next();
                Main.delayedPrint("Please enter a full description of your racial trait:");
                scan = new Scanner(System.in);
                String desc = scan.next();
                player.addTrait_or_feature(addRacialTrait(name, short_desc, desc));
                break;
            case 6:
                Main.delayedPrint("Please enter the name of the weapon your race is proficient with:");
                scan = new Scanner(System.in);
                player.addProficiency(scan.next());
                break;
            case 7:
                Main.delayedPrint("Please enter the language you would like to know");
                scan = new Scanner(System.in);
                player.addLanguage(scan.next());
                break;
            case 8:
                return;
        }
        addToRace(player);
    }

    public custom_race(player player){
        player.setTotal_level(1);
        player.setSize("Medium");
        player.setSpeed(30);
        player.setVision("You have no changes to vision");
        Main.delayedPrint("Please name your custom race:");
        Scanner scan = new Scanner(System.in);
        player.setRace(scan.next());
        addToRace(player);
    }

}
