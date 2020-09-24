package liam.chipman;

class skill {
    private String name;
    private int ability_mod;
    private int ranks;
    private int misc_mod;
    private boolean is_class_skill;
    private boolean trained_only;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAbility_mod() {
        return ability_mod;
    }

    public void setAbility_mod(int ability_mod) {
        this.ability_mod = ability_mod;
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

    int calcSkillBonus(){
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

    skill (String name, int ability_mod, int ranks, int misc_mod, boolean is_class_skill, boolean trained_only) {
        this.name = name;
        this.ability_mod = ability_mod;
        this.ranks = ranks;
        this.misc_mod = misc_mod;
        this.is_class_skill = is_class_skill;
        this.trained_only = trained_only;
    }
}
