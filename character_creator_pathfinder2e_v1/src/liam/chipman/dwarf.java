package liam.chipman;

class dwarf extends race{

    public dwarf(player player){
        player.setRace("Dwarf");
        player.setTotal_level(1);
        player.setCon_score(player.getCon_score() + 2);
        player.setWis_score(player.getWis_score() + 2);
        player.setCha_score(player.getCha_score() - 2);
        player.setSize("Medium");
        player.setSpeed(20);
        player.setVision("You can see in the dark up to 60 feet.");
        player.addTrait_or_feature(addRacialTrait("Defensive Training", "+4 bonus to AC vs. giants", "You get a +4 dodge bonus to AC against monsters of the giant subtype."));
        player.addTrait_or_feature(addRacialTrait("Greed", "+2 bonus to Appraise for cost of items with metals or gemstones", "You receive a +2 racial bonus to Appraise skill checks made to determine the price of nonmagical goods that contain metals or gemstones."));
        player.addTrait_or_feature(addRacialTrait("Hatred", "+1 to hit vs. Orc and goblinoids", "You receive a +1 bonus on attack rolls against humanoid creatures of the orc  and goblinoid subtype due to special training against these hated foes."));
        player.addTrait_or_feature(addRacialTrait("Hardy", "+2 on saving throws vs poisons, spells, and spell-like abilities", "You receive a +2 racial bonus on saving throws against poison, spells, and spell-like abilities."));
        player.addTrait_or_feature(addRacialTrait("Stability", "+4 to CMD vs. bull rush and trip", "You receive a +4 racial bonus to their Combat Maneuver Defense when resisting a bull rush or trip attempt while standing on the ground."));
        player.addTrait_or_feature(addRacialTrait("Stonecunning", "+2 bonus to perception to find hidden doors or traps in stone", "You receive a +2 bonus on perception checks to potentially notice unusual stonework, such as traps and hidden doors located in stone walls or floors. You receive a check to notice such features whenever you pass within 10 feet of them, whether or not you are actively looking."));
        player.addProficiency("battleaxes");
        player.addProficiency("heavy picks");
        player.addProficiency("warhammers");
        player.addProficiency("you treat any weapon with the name \"dwarven\" in its name as a martial weapon.");
        player.addLanguage("Common");
        player.addLanguage("Dwarven");
        addLanguage(new String[]{"Giant", "Gnome", "Goblin", "Orc", "Terran", "Undercommon"}, player);
    }

}
