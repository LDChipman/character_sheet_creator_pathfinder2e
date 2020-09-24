package liam.chipman;

class elf extends race{

    public elf(player player){
        player.setRace("Elf");
        player.setTotal_level(1);
        player.setDex_score(player.getDex_score() + 2);
        player.setInt_score(player.getInt_score() + 2);
        player.setCon_score(player.getCon_score() - 2);
        player.setSize("Medium");
        player.setSpeed(30);
        player.setVision("You can see twice as far as humans in conditions of dim light");
        player.addTrait_or_feature(addRacialTrait("Elven Immunities", "You are immune to magical sleep and get +2 on saving throws vs. enchantments", "You are immune to magic sleep effects and get a +2 racial saving throw bonus against enchantment spells and effects."));
        player.addTrait_or_feature(addRacialTrait("Elven Magic", "+2 vs. spell resistance, +2 spellcraft to find out the magic properties of an item", "You receive a +2 racial bonus on caster level checks made to overcome spell resistance. In addition, you receive a +2 racial bonus on Spellcraft skill checks made to identify the properties of magic items."));
        player.addTrait_or_feature(addRacialTrait("Keen Senses", "+2 to Perception", "You receive a +2 racial bonus on Perception skill checks."));
        player.addProficiency("longbows (including composite longbows)");
        player.addProficiency("longswords");
        player.addProficiency("rapiers");
        player.addProficiency("shortbows (including composite shortbows)");
        player.addProficiency("you treat any weapon with the name \"elven\" in its name as a martial weapon.");
        player.addLanguage("Common");
        player.addLanguage("Elven");
        addLanguage(new String[]{"Celestial", "Draconic", "Gnoll", "Goblin", "Orc", "Sylvan"}, player);
    }

}
