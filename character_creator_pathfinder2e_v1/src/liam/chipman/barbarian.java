package liam.chipman;

class barbarian extends dnd_class{

    public barbarian(player player){
        player.setDnd_class("Barbarian");
        player.addAlignment_restrictions("Any nonlawful");
        player.addHit_dice(12);
        for (int i = 0; i < player.getSkills().size(); i++){
            if (player.getSkills().get(i).getName().equals("Acrobatics") || player.getSkills().get(i).getName().equals("Climb") || player.getSkills().get(i).getName().contains("Craft") || player.getSkills().get(i).getName().equals("Handle Animal") || player.getSkills().get(i).getName().equals("Intimidate") || player.getSkills().get(i).getName().equals("Knowledge (Nature)") || player.getSkills().get(i).getName().equals("Perception") || player.getSkills().get(i).getName().equals("Ride") || player.getSkills().get(i).getName().equals("Survival") || player.getSkills().get(i).getName().equals("Swim")){
                player.getSkills().get(i).setIs_class_skill(true);
            }
        }
        player.addProficiency("all simple and martial weapons");
        player.addProficiency("light armor");
        player.addProficiency("medium armor");
        player.addProficiency("shields (except tower shields)");
        player.setSpeed(player.getSpeed() + 10);
        player.addTrait_or_feature(addClassFeature("Fast Movement", "+10 movement speed", "A barbarian’s land speed is faster than the norm for her race by +10 feet. This benefit applies only when he is wearing no armor, light armor, or medium armor, and not carrying a heavy load. Apply this bonus before modifying the barbarian’s speed because of any load carried or armor worn. This bonus stacks with any other bonuses to the barbarian’s land speed."));
        player.addTrait_or_feature(addClassFeature("Rage", "You can rage causing you to gain +4 to Strength and Constitution, as well as a +2 bonus on will saves but get -2 to your armor class.", "A barbarian can call upon inner reserves of strength and ferocity, granting her additional combat prowess. Starting at 1st level, a barbarian can rage for a number of rounds per day equal to 4 + her Constitution modifier. At each level after 1st, she can rage for 2 additional rounds. Temporary increases to Constitution, such as those gained from rage and spells like bear’s endurance, do not increase the total number of rounds that a barbarian can rage per day. A barbarian can enter rage as a free action. The total number of rounds of rage per day is renewed after resting for 8 hours, although these hours do not need to be consecutive. While in rage, a barbarian gains a +4 morale bonus to her Strength and Constitution, as well as a +2 morale bonus on Will saves. In addition, she takes a –2 penalty to Armor Class. The increase to Constitution grants the barbarian 2 hit points per Hit Dice, but these disappear when the rage ends and are not lost first like temporary hit points. While in rage, a barbarian cannot use any Charisma-, Dexterity-, or Intelligence-based skills (except Acrobatics, Fly, Intimidate, and Ride) or any ability that requires patience or concentration. A barbarian can end her rage as a free action and is fatigued after rage for a number of rounds equal to 2 times the number of rounds spent in the rage. A barbarian cannot enter a new rage while fatigued or exhausted but can otherwise enter rage multiple times during a single encounter or combat. If a barbarian falls unconscious, her rage immediately ends, placing her in peril of death."));
        player.setFavored_class(0, "Barbarian");
        player.setBase_attack_bonus(1);
        player.setBase_fortitude_save(player.getBase_fortitude_save() + 2);
        addRanks(player);
    }

}
