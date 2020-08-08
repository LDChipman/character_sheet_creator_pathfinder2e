package liam.chipman;

class gnome extends race{

    public gnome(player player){
        player.con_score += 2;
        player.cha_score += 2;
        player.str_score -= 2;
        player.size = "Small";
        player.speed = 20;
        player.vision = "You can see twice as far as humans in conditions of dim light";
        player.traits_and_features.add(addRacialTrait("Defensive Training", "+4 bonus to AC vs. giants", "You get a +4 dodge bonus to AC against monsters of the giant subtype."));
        player.traits_and_features.add(addRacialTrait("Gnome Magic", "+1 to DC saving throws for illusion spells you cast", "You add +1 to the DC of any saving throws against illusion spells that you cast."));
        if (player.cha_score >= 11){
            player.traits_and_features.add(addRacialTrait("Gnome Magic Abilities", "dancing lights, ghost sound, prestidigitation, and speak with animals", "1/day—dancing lights, ghost sound, prestidigitation, and speak with animals. Caster level: " + player.level + ". DC: 10 + the spell level + " + player.calcAbilityScoreModifier(player.cha_score)));
        }
        player.traits_and_features.add(addRacialTrait("Hatred", "+1 to hit vs. reptilian and goblinoids", "You receive a +1 bonus on attack rolls against humanoid creatures of the reptilian and goblinoid subtype due to special training against these hated foes."));
        player.traits_and_features.add(addRacialTrait("Illusion Resistance", "+2 on saving throws vs. illusion", "You get a +2 racial saving throw bonus against illusion spells or effects."));
        player.traits_and_features.add(addRacialTrait("Keen Senses", "+2 to Perception", "You receive a +2 racial bonus on Perception skill checks."));
        player.traits_and_features.add(addRacialTrait("Obsessive", "+2 to Craft or Profession", "Gnomes receive a +2 racial bonus on a Craft or Profession skill of their choice."));
        player.proficiencies.add("you treat any weapon with the name \"gnome\" in its name as a martial weapon.");
        player.languages.add("Common");
        player.languages.add("Gnome");
        player.languages.add("Sylvan");
    }

}
