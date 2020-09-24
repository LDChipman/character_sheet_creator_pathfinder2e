package liam.chipman;

class human extends race{

    public human(player player){
        player.setRace("Human");
        player.setTotal_level(1);
        Main.delayedPrint("As a human you get +2 to one ability score");
        Main.delayedPrint("1. Strength");
        Main.delayedPrint("2. Dexterity");
        Main.delayedPrint("3. Constitution");
        Main.delayedPrint("4. Intelligence");
        Main.delayedPrint("5. Wisdom");
        Main.delayedPrint("6. Charisma");
        Main.delayedPrint("Please enter which option you would like to use:");
        int option = Main.chooseOption(6);
        switch (option) {
            case 1:
                player.setStr_score(player.getStr_score() + 2);
                break;
            case 2:
                player.setDex_score(player.getDex_score() + 2);
                break;
            case 3:
                player.setCon_score(player.getCon_score() + 2);
                break;
            case 4:
                player.setInt_score(player.getInt_score() + 2);
                break;
            case 5:
                player.setWis_score(player.getWis_score() + 2);
                break;
            case 6:
                player.setCha_score(player.getCha_score() + 2);
                break;
        }
        player.setSize("Medium");
        player.setSpeed(30);
        player.setVision("you have no changes to vision");
        player.addTrait_or_feature(addRacialTrait("Bonus Feat", "1 extra feat 1st level", "You select one extra feat at 1st level."));
        player.addTrait_or_feature(addRacialTrait("Skilled", "Gain 1 extra skill rank each level", "You gain an additional skill rank at first level and one additional rank whenever they gain a level."));
        player.addLanguage("Common");
        addLanguage(new String[]{"Abyssal", "Aklo", "Aquan", "Auran", "Celestial", "Draconic", "Dwarven", "Elven", "Giant", "Gnome", "Gnoll", "Goblin", "Halfling", "Ignan", "Infernal", "Orc", "Sylvan", "Terran", "Undercommon"}, player);
    }

}
