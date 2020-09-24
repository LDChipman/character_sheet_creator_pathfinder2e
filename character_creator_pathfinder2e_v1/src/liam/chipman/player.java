package liam.chipman;

import java.util.ArrayList;
import java.util.List;

class player{

    private int total_level;

    //ability scores
    private int str_score;
    private int dex_score;
    private int con_score;
    private int int_score;
    private int wis_score;
    private int cha_score;

    //Racial
    private String race;

    private String size;

    private int speed;

    private String vision;

    private List proficiencies;

    private List languages;

    private List<trait_or_feature> traits_and_features;

    //Class
    private String dnd_class;

    //Skills
    private List<skill> skills;

    int calcAbilityScoreModifier(int ability_score){
        if (ability_score % 2 == 1) {
            ability_score--;
        }
        return (ability_score - 10) / 2;
    }

    public int getTotal_level() {
        return total_level;
    }

    public void setTotal_level(int total_level) {
        this.total_level = total_level;
    }

    public int getStr_score() {
        return str_score;
    }

    public void setStr_score(int str_score) {
        this.str_score = str_score;
    }

    public int getDex_score() {
        return dex_score;
    }

    public void setDex_score(int dex_score) {
        this.dex_score = dex_score;
    }

    public int getCon_score() {
        return con_score;
    }

    public void setCon_score(int con_score) {
        this.con_score = con_score;
    }

    public int getInt_score() {
        return int_score;
    }

    public void setInt_score(int int_score) {
        this.int_score = int_score;
    }

    public int getWis_score() {
        return wis_score;
    }

    public void setWis_score(int wis_score) {
        this.wis_score = wis_score;
    }

    public int getCha_score() {
        return cha_score;
    }

    public void setCha_score(int cha_score) {
        this.cha_score = cha_score;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public List getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(List proficiencies) {
        this.proficiencies = proficiencies;
    }

    public void addProficiency(String proficiency){
        this.proficiencies.add(proficiency);
    }

    public List getLanguages() {
        return languages;
    }

    public void setLanguages(List languages) {
        this.languages = languages;
    }

    public void addLanguage(String language){
        this.languages.add(language);
    }

    public List<trait_or_feature> getTraits_and_features() {
        return traits_and_features;
    }

    public void setTraits_and_features(List<trait_or_feature> traits_and_features) {
        this.traits_and_features = traits_and_features;
    }

    public void addTrait_or_feature(trait_or_feature trait_or_feature){
        this.traits_and_features.add(trait_or_feature);
    }

    public String getDnd_class() {
        return dnd_class;
    }

    public void setDnd_class(String dnd_class) {
        this.dnd_class = dnd_class;
    }

    public List<skill> getSkills() {
        return skills;
    }

    public void setSkills(List<skill> skills) {
        this.skills = skills;
    }

    public String toString(){

        StringBuilder info = new StringBuilder();
        info.append("Total Level: ").append(this.total_level).append("\n");
        info.append("Strength: ").append(this.str_score).append("\n");
        info.append("Dexterity: ").append(this.dex_score).append("\n");
        info.append("Constitution: ").append(this.con_score).append("\n");
        info.append("Intelligence: ").append(this.int_score).append("\n");
        info.append("Wisdom: ").append(this.wis_score).append("\n");
        info.append("Charisma: ").append(this.cha_score).append("\n");
        info.append("Race: ").append(this.race).append("\n");
        info.append("Size: ").append(this.size).append("\n");
        info.append("Speed: ").append(this.speed).append("\n");
        info.append("Vision: ").append(this.vision).append("\n");
        info.append("Proficiencies: ").append(this.proficiencies).append("\n");
        info.append("Languages: ").append(this.languages).append("\n");
        info.append("Traits and Features:" + "\n");
        for (trait_or_feature traits_and_feature : this.traits_and_features) {
            info.append("\n");
            info.append("Name: ").append(traits_and_feature.getName()).append("\n");
            info.append("Type: ").append(traits_and_feature.getType()).append("\n");
            info.append("Short Description: ").append(traits_and_feature.getShort_desc()).append("\n");
            info.append("Description: ").append(traits_and_feature.getDesc()).append("\n");
            info.append("\n");
        }
        info.append("Skills: " + "\n");
        for (skill skill : this.skills) {
            info.append("\n");
            info.append("Name: ").append(skill.getName()).append("\n");
            info.append("Ability Modifier: ").append(skill.getAbility_mod()).append("\n");
            info.append("Skill Ranks: ").append(skill.getRanks()).append("\n");
            info.append("Misc Mod: ").append(skill.getMisc_mod()).append("\n");
            info.append("Class Skill: ").append(skill.isIs_class_skill()).append("\n");
            info.append("Trained Only: ").append(skill.isTrained_only()).append("\n");
            info.append("\n");
        }
        return info.toString();
    }

    public void resetSkills() {
        skills.add(new skill("Acrobatics",                calcAbilityScoreModifier(dex_score), 0, 0, false, false));
        skills.add(new skill("Appraise",                  calcAbilityScoreModifier(int_score), 0, 0, false, false));
        skills.add(new skill("Bluff",                     calcAbilityScoreModifier(cha_score), 0, 0, false, false));
        skills.add(new skill("Climb",                     calcAbilityScoreModifier(str_score), 0, 0, false, false));
        skills.add(new skill("Craft",                     calcAbilityScoreModifier(int_score), 0, 0, false, false));
        skills.add(new skill("Diplomacy",                 calcAbilityScoreModifier(cha_score), 0, 0, false, false));
        skills.add(new skill("Disable Device",            calcAbilityScoreModifier(dex_score), 0, 0, false, true));
        skills.add(new skill("Disguise",                  calcAbilityScoreModifier(cha_score), 0, 0, false, false));
        skills.add(new skill("Escape Artist",             calcAbilityScoreModifier(dex_score), 0, 0, false, false));
        skills.add(new skill("Fly",                       calcAbilityScoreModifier(dex_score), 0, 0, false, false));
        skills.add(new skill("Handle Animal",             calcAbilityScoreModifier(cha_score), 0, 0, false, true));
        skills.add(new skill("Heal",                      calcAbilityScoreModifier(wis_score), 0, 0, false, false));
        skills.add(new skill("Intimidate",                calcAbilityScoreModifier(cha_score), 0, 0, false, false));
        skills.add(new skill("Knowledge (Arcana)",        calcAbilityScoreModifier(int_score), 0, 0, false, true));
        skills.add(new skill("Knowledge (Dungeoneering)", calcAbilityScoreModifier(int_score), 0, 0, false, true));
        skills.add(new skill("Knowledge (Engineering)",   calcAbilityScoreModifier(int_score), 0, 0, false, true));
        skills.add(new skill("Knowledge (Geography)",     calcAbilityScoreModifier(int_score), 0, 0, false, true));
        skills.add(new skill("Knowledge (History)",       calcAbilityScoreModifier(int_score), 0, 0, false, true));
        skills.add(new skill("Knowledge (Local)",         calcAbilityScoreModifier(int_score), 0, 0, false, true));
        skills.add(new skill("Knowledge (Nature)",        calcAbilityScoreModifier(int_score), 0, 0, false, true));
        skills.add(new skill("Knowledge (Nobility)",      calcAbilityScoreModifier(int_score), 0, 0, false, true));
        skills.add(new skill("Knowledge (Planes)",        calcAbilityScoreModifier(int_score), 0, 0, false, true));
        skills.add(new skill("Knowledge (Religion)",      calcAbilityScoreModifier(int_score), 0, 0, false, true));
        skills.add(new skill("Linguistics",               calcAbilityScoreModifier(int_score), 0, 0, false, true));
        skills.add(new skill("Perception",                calcAbilityScoreModifier(wis_score), 0, 0, false, false));
        skills.add(new skill("Perform",                   calcAbilityScoreModifier(cha_score), 0, 0, false, false));
        skills.add(new skill("Profession",                calcAbilityScoreModifier(wis_score), 0, 0, false, false));
        skills.add(new skill("Ride",                      calcAbilityScoreModifier(dex_score), 0, 0, false, false));
        skills.add(new skill("Sense Motive",              calcAbilityScoreModifier(wis_score), 0, 0, false, false));
        skills.add(new skill("Sleight of Hand",           calcAbilityScoreModifier(dex_score), 0, 0, false, true));
        skills.add(new skill("Spellcraft",                calcAbilityScoreModifier(int_score), 0, 0, false, true));
        skills.add(new skill("Stealth",                   calcAbilityScoreModifier(dex_score), 0, 0, false, false));
        skills.add(new skill("Survival",                  calcAbilityScoreModifier(wis_score), 0, 0, false, false));
        skills.add(new skill("Swim",                      calcAbilityScoreModifier(str_score), 0, 0, false, false));
        skills.add(new skill("Use Magic Device",          calcAbilityScoreModifier(cha_score), 0, 0, false, true));
    }

    public player() {
        proficiencies = new ArrayList();
        languages = new ArrayList();
        traits_and_features = new ArrayList<trait_or_feature>();
        skills = new ArrayList<skill>();
    }

}
