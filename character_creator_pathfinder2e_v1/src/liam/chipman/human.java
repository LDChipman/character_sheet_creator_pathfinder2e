package liam.chipman;

class human extends race{

    public human(player player){
        player.race = "Human";
        player.total_level = 1;
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
                player.str_score += 2;
                break;
            case 2:
                player.dex_score += 2;
                break;
            case 3:
                player.con_score += 2;
                break;
            case 4:
                player.int_score += 2;
                break;
            case 5:
                player.wis_score += 2;
                break;
            case 6:
                player.cha_score += 2;
                break;
        }
        player.size = "Medium";
        player.speed = 30;
        player.vision = "you have no changes to vision";
        player.traits_and_features.add(addRacialTrait("Bonus Feat", "1 extra feat 1st level", "You select one extra feat at 1st level."));
        player.traits_and_features.add(addRacialTrait("Skilled", "Gain 1 extra skill rank each level", "You gain an additional skill rank at first level and one additional rank whenever they gain a level."));
        player.languages.add("Common");
        addLanguage(new String[]{"Abyssal", "Aklo", "Aquan", "Auran", "Celestial", "Draconic", "Dwarven", "Elven", "Giant", "Gnome", "Gnoll", "Goblin", "Halfling", "Ignan", "Infernal", "Orc", "Sylvan", "Terran", "Undercommon"}, player);
    }

}
