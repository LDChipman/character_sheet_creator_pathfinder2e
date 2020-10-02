package liam.chipman;

class skill {
    private String name;
    private int ranks;
    private int misc_mod;
    private boolean is_class_skill;
    private boolean trained_only;
    private String ability_score_used;

    public String getAbility_score_used() {
        return ability_score_used;
    }

    public void setAbility_score_used(String ability_score_used) {
        this.ability_score_used = ability_score_used;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRanks() {
        return ranks;
    }

    public void setRanks(int ranks) {
        this.ranks = ranks;
    }

    public int getMisc_mod() {
        return misc_mod;
    }

    public void setMisc_mod(int misc_mod) {
        this.misc_mod = misc_mod;
    }

    public boolean isIs_class_skill() {
        return is_class_skill;
    }

    public void setIs_class_skill(boolean is_class_skill) {
        this.is_class_skill = is_class_skill;
    }

    public boolean isTrained_only() {
        return trained_only;
    }

    public void setTrained_only(boolean trained_only) {
        this.trained_only = trained_only;
    }

    int calcSkillBonus(player player){
        int ability_mod;
        switch (ability_score_used){
            case "str":
                ability_mod = player.calcAbilityScoreModifier(player.getStr_score());
                break;
            case "dex":
                ability_mod = player.calcAbilityScoreModifier(player.getDex_score());
                break;
            case "con":
                ability_mod = player.calcAbilityScoreModifier(player.getCon_score());
                break;
            case "int":
                ability_mod = player.calcAbilityScoreModifier(player.getInt_score());
                break;
            case "wis":
                ability_mod = player.calcAbilityScoreModifier(player.getWis_score());
                break;
            case "cha":
                ability_mod = player.calcAbilityScoreModifier(player.getCha_score());
                break;
            default:
                ability_mod = 0;
        }
        if (trained_only && ranks <= 0){
            Main.delayedPrint("You Can't Use This Skill.");
        }
        if ((ranks > 0) && is_class_skill){
            return ranks + ability_mod + misc_mod + 3;
        }
        else if (ranks > 0){
            return ranks + ability_mod + misc_mod;
        }
        else {
            return ability_mod + misc_mod;
        }
    }

    skill (String name, int ranks, int misc_mod, boolean is_class_skill, boolean trained_only, String ability_score_used) {
        this.name = name;
        this.ranks = ranks;
        this.misc_mod = misc_mod;
        this.is_class_skill = is_class_skill;
        this.trained_only = trained_only;
        this.ability_score_used = ability_score_used;
    }
}
