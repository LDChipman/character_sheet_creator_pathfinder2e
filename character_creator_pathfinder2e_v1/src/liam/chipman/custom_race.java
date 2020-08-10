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
                            player.str_score += scan.nextInt();
                        } catch (InputMismatchException e) {
                            Main.delayedPrint("That isn't a number");
                        }
                        break;
                    case 2:
                        Main.delayedPrint("Please enter how much you'd like your dexterity to change:");
                        try {
                            Scanner scan = new Scanner(System.in);
                            player.dex_score += scan.nextInt();
                        } catch (InputMismatchException e) {
                            Main.delayedPrint("That isn't a number");
                        }
                        break;
                    case 3:
                        Main.delayedPrint("Please enter how much you'd like your constitution to change:");
                        try {
                            Scanner scan = new Scanner(System.in);
                            player.con_score += scan.nextInt();
                        } catch (InputMismatchException e) {
                            Main.delayedPrint("That isn't a number");
                        }
                        break;
                    case 4:
                        Main.delayedPrint("Please enter how much you'd like your intelligence to change:");
                        try {
                            Scanner scan = new Scanner(System.in);
                            player.int_score += scan.nextInt();
                        } catch (InputMismatchException e) {
                            Main.delayedPrint("That isn't a number");
                        }
                        break;
                    case 5:
                        Main.delayedPrint("Please enter how much you'd like your wisdom to change:");
                        try {
                            Scanner scan = new Scanner(System.in);
                            player.wis_score += scan.nextInt();
                        } catch (InputMismatchException e) {
                            Main.delayedPrint("That isn't a number");
                        }
                        break;
                    case 6:
                        Main.delayedPrint("Please enter how much you'd like your charisma to change:");
                        try {
                            Scanner scan = new Scanner(System.in);
                            player.cha_score += scan.nextInt();
                        } catch (InputMismatchException e) {
                            Main.delayedPrint("That isn't a number");
                        }
                        break;
                }
                break;
            case 2:
                Main.delayedPrint("Please enter the size you want to be:");
                Scanner scan = new Scanner(System.in);
                player.size += scan.next();
                break;
            case 3:
                Main.delayedPrint("Please enter the base speed you want to have:");
                scan = new Scanner(System.in);
                player.speed += scan.nextInt();
                break;
            case 4:
                Main.delayedPrint("Please enter the vision change you want to have:");
                scan = new Scanner(System.in);
                player.size += scan.next();
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
                player.traits_and_features.add(addRacialTrait(name, short_desc, desc));
                break;
            case 6:
                Main.delayedPrint("Please enter the name of the weapon your race is proficient with:");
                scan = new Scanner(System.in);
                player.proficiencies.add(scan.next());
                break;
            case 7:
                Main.delayedPrint("Please enter the language you would like to know");
                scan = new Scanner(System.in);
                player.languages.add(scan.next());
                break;
            case 8:
                return;
        }
        addToRace(player);
    }

    public custom_race(player player){
        player.total_level = 1;
        player.size = "Medium";
        player.speed = 30;
        player.vision = "You have no changes to vision";
        Main.delayedPrint("Please name your custom race:");
        Scanner scan = new Scanner(System.in);
        player.race = scan.next();
        addToRace(player);
    }

}
