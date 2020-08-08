package liam.chipman;

class elf extends race{

    public elf(player player){
        player.race = "Elf";
        player.level = 1;
        player.dex_score += 2;
        player.int_score += 2;
        player.con_score -= 2;
        player.size = "Medium";
        player.speed = 30;
        player.vision = "You can see twice as far as humans in conditions of dim light";
        player.traits_and_features.add(addRacialTrait("Elven Immunities", "You are immune to magical sleep and get +2 on saving throws vs. enchantments", "You are immune to magic sleep effects and get a +2 racial saving throw bonus against enchantment spells and effects."));
        player.traits_and_features.add(addRacialTrait("Elven Magic", "+2 vs. spell resistance, +2 spellcraft to find out the magic properties of an item", "You receive a +2 racial bonus on caster level checks made to overcome spell resistance. In addition, you receive a +2 racial bonus on Spellcraft skill checks made to identify the properties of magic items."));
        player.traits_and_features.add(addRacialTrait("Keen Senses", "+2 to Perception", "You receive a +2 racial bonus on Perception skill checks."));
        player.proficiencies.add("longbows (including composite longbows)");
        player.proficiencies.add("longswords");
        player.proficiencies.add("rapiers");
        player.proficiencies.add("shortbows (including composite shortbows)");
        player.proficiencies.add("you treat any weapon with the name \"elven\" in its name as a martial weapon.");
        player.languages.add("Common");
        player.languages.add("Elven");
        addLanguage(new String[]{"Celestial", "Draconic", "Gnoll", "Goblin", "Orc", "Sylvan"}, player);
    }

}
