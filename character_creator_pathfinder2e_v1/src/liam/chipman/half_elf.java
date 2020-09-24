package liam.chipman;

class half_elf extends race{

    public half_elf(player player){
        player.setRace("Half Elf");
        player.setTotal_level(1);
        Main.delayedPrint("As a half-elf you get +2 to one ability score");
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
        player.setVision("You can see twice as far as humans in conditions of dim light");
        player.addTrait_or_feature(addRacialTrait("Adaptability", "Get Skill Focus 1st level", "You receive Skill Focus as a bonus feat  at 1st level."));
        player.addTrait_or_feature(addRacialTrait("Elf Blood", "You count as both elven and human", "You count as both elves and humans for any effect related to race."));
        player.addTrait_or_feature(addRacialTrait("Elven Immunities", "You are immune to magical sleep and get +2 on saving throws vs. enchantments", "You are immune to magic sleep effects and get a +2 racial saving throw bonus against enchantment spells and effects."));
        player.addTrait_or_feature(addRacialTrait("Keen Senses", "+2 to Perception", "You receive a +2 racial bonus on Perception skill checks."));
        player.addTrait_or_feature(addRacialTrait("Multitalented", "You choose two favored classes at first level", "You choose two favored classes at first level and gain +1 hit point or +1 skill point whenever you take a level in either one of those classes."));
        player.addLanguage("Common");
        player.addLanguage("Elven");
        addLanguage(new String[]{"Abyssal", "Aklo", "Aquan", "Auran", "Celestial", "Draconic", "Dwarven", "Giant", "Gnome", "Gnoll", "Goblin", "Halfling", "Ignan", "Infernal", "Orc", "Sylvan", "Terran", "Undercommon"}, player);
    }

}
