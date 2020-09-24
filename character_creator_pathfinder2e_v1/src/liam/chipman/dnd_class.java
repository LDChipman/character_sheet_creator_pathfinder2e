package liam.chipman;

class dnd_class {

    trait_or_feature addClassFeature(String name, String short_desc, String desc){
        trait_or_feature class_feature = new trait_or_feature(name, "class", short_desc, desc);
        return class_feature;
    }

    void addRanks(player player){
        int skill_ranks = 0;
        String[] all_skills = new String[]{" Acrobatics", " Appraise", " Bluff", " Climb", " Craft", " Diplomacy", " Disable Device", " Disguise", " Escape Artist", "Fly", "Handle Animal", "Heal", "Intimidate", "Knowledge (Arcane)", "Knowledge (Dungeoneering)", "Knowledge (Engineering)", "Knowledge (Geography)", "Knowledge (History)", "Knowledge (Local)", "Knowledge (Nature)", "Knowledge (Nobility)", "Knowledge (Planes)", "Knowledge (Religion)", "Linguistics", "Perception", "Perform", "Profession", "Ride", "Sense Motive", "Sleight of Hand", "Spellcraft", "Stealth", "Survival", "Swim", "Use Magic Device"};
        switch (player.getDnd_class()){
            case "Barbarian": case "Druid": case "Monk":
                skill_ranks = 4;
                break;
            case "Bard": case "Ranger":
                skill_ranks = 6;
                break;
            case "Cleric": case "Fighter": case "Paladin": case "Sorcerer": case "Wizard":
                skill_ranks = 2;
                break;
            case "Rogue":
                skill_ranks = 8;
                break;
        }
        skill_ranks = player.calcAbilityScoreModifier(player.getInt_score()) + skill_ranks;
        if (player.getRace() == "Human"){
            skill_ranks += 1;
        }
        while (skill_ranks > 0) {
            int skills_with_ranks = 0;
            for (String skill : all_skills) {
                if (skill.contains("(Already Has Max Ranks)")) {
                    skills_with_ranks++;
                }
            }
            if (skills_with_ranks == all_skills.length){
                Main.delayedPrint("You don't have anymore skills to choose from.");
                break;
            }
            Main.delayedPrint("You get to put a rank into a skill!");
            for (int i = 0; i < all_skills.length; i++) {
                Main.delayedPrint("" + (i+1) + ". " + all_skills[i]);
            }
            Main.delayedPrint("Please choose which option you'd like to use:");
            int option = Main.chooseOption(all_skills.length);
            if (all_skills[option-1].contains("(Already Has Max Ranks)")){
                Main.delayedPrint("You already have max ranks in that skill");
            }
            else {
                player.getSkills().get(option-1).setRanks(player.getSkills().get(option-1).getRanks() + 1);
                all_skills[option - 1] += " (Already Has Max Ranks)";
                skill_ranks--;
            }
        }
    }
}
