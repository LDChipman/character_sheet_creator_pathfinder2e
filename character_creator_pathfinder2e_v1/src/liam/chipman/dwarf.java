package liam.chipman;

class dwarf extends race{

    public dwarf(player player){
        player.con_score += 2;
        player.wis_score += 2;
        player.cha_score -= 2;
        player.size = "Medium";
        player.speed = 20;
        player.vision = "You can see in the dark up to 60 feet.";
        player.traits_and_features.add(addRacialTrait("Defensive Training", "+4 bonus to AC vs. giants", "You get a +4 dodge bonus to AC against monsters of the giant subtype."));
        player.traits_and_features.add(addRacialTrait("Greed", "+2 bonus to Appraise for cost of items with metals or gemstones", "You receive a +2 racial bonus to Appraise skill checks made to determine the price of nonmagical goods that contain metals or gemstones."));
        player.traits_and_features.add(addRacialTrait("Hatred", "+1 to hit vs. Orc and goblinoids", "You receive a +1 bonus on attack rolls against humanoid creatures of the orc  and goblinoid subtype due to special training against these hated foes."));
        player.traits_and_features.add(addRacialTrait("Hardy", "+2 on saving throws vs poisons, spells, and spell-like abilities", "You receive a +2 racial bonus on saving throws against poison, spells, and spell-like abilities."));
        player.traits_and_features.add(addRacialTrait("Stability", "+4 to CMD vs. bull rush and trip", "You receive a +4 racial bonus to their Combat Maneuver Defense when resisting a bull rush or trip attempt while standing on the ground."));
        player.traits_and_features.add(addRacialTrait("Stonecunning", "+2 bonus to perception to find hidden doors or traps in stone", "You receive a +2 bonus on perception checks to potentially notice unusual stonework, such as traps and hidden doors located in stone walls or floors. You receive a check to notice such features whenever you pass within 10 feet of them, whether or not you are actively looking."));
        player.proficiencies.add("battleaxes");
        player.proficiencies.add("heavy picks");
        player.proficiencies.add("warhammers");
        player.proficiencies.add("you treat any weapon with the name \"dwarven\" in its name as a martial weapon.");
        player.languages.add("Common");
        player.languages.add("Dwarven");
        addLanguage(new String[]{"Giant", "Gnome", "Goblin", "Orc", "Terran", "Undercommon"}, player);
    }

}
