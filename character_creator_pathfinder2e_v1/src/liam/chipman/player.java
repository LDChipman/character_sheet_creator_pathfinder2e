package liam.chipman;

import java.util.ArrayList;
import java.util.List;

class player{

    private int total_level;
    private String deity;
    private List<String> domains;

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
    private List<String> alignment_restrictions;
    private List<Integer> hit_dice;
    private String[] favored_classes;
    private int base_attack_bonus;
    private int base_fortitude_save;
    private int base_reflex_save;
    private int base_will_save;

    //Spells
    private int level_1_spells_per_day;
    private int cantrips_knows;
    private int level_1_spells_known;
    private int level_1_domain_spells_per_day;

    public int getBase_attack_bonus() {
        return base_attack_bonus;
    }

    public void setBase_attack_bonus(int base_attack_bonus) {
        this.base_attack_bonus = base_attack_bonus;
    }

    public int getBase_fortitude_save() {
        return base_fortitude_save;
    }

    public void setBase_fortitude_save(int base_fortitude_save) {
        this.base_fortitude_save = base_fortitude_save;
    }

    public int getBase_reflex_save() {
        return base_reflex_save;
    }

    public void setBase_reflex_save(int base_reflex_save) {
        this.base_reflex_save = base_reflex_save;
    }

    public int getBase_will_save() {
        return base_will_save;
    }

    public void setBase_will_save(int base_will_save) {
        this.base_will_save = base_will_save;
    }

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

    public List<String> getAlignment_restrictions() {
        return alignment_restrictions;
    }

    public void setAlignment_restrictions(List<String> alignment_restrictions) {
        this.alignment_restrictions = alignment_restrictions;
    }

    public void addAlignment_restrictions(String alignment_restriction){
        this.alignment_restrictions.add(alignment_restriction);
    }

    public void setSkills(List<skill> skills) {
        this.skills = skills;
    }

    public List<Integer> getHit_dice() {
        return hit_dice;
    }

    public void setHit_dice(List<Integer> hit_dice) {
        this.hit_dice = hit_dice;
    }

    public void addHit_dice(int hit_die){
        this.hit_dice.add(hit_die);
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
        info.append("Class: ").append(this.dnd_class).append("\n");
        info.append("Base Attack Bonus: ").append(this.base_attack_bonus).append("\n");
        info.append("Base Fortitude Save: ").append(this.base_fortitude_save).append("\n");
        info.append("Base Reflex Save: ").append(this.base_reflex_save).append("\n");
        info.append("Base Will Save: ").append(this.base_will_save).append("\n");
        info.append("Deity: ").append(this.deity).append("\n");
        info.append("Level 1 Spells Per Day: ").append(this.level_1_spells_per_day).append("\n");
        info.append("Level 1 Domain Spells Per Day: ").append(this.level_1_domain_spells_per_day).append("\n");
        info.append("Cantrips/Orisons Known: ").append(this.cantrips_knows).append("\n");
        info.append("Level 1 Spells Known: ").append(this.level_1_spells_known).append("\n");
        info.append("Domains: ");
        for (String domain : this.domains) {
            info.append(domain);
            info.append(" ");
        }
        info.append("\n");
        info.append("Alignment Restriction(s): ");
        for (String alignment_restriction : this.alignment_restrictions) {
            info.append(alignment_restriction);
            info.append(" ");
        }
        info.append("\n");
        info.append("Hit Dice: d");
        for (Integer hit_die : this.hit_dice) {
            info.append(hit_die);
            info.append(" ");
        }
        info.append("\n");
        info.append("Favored Class: ");
        for (String favored_class : this.favored_classes) {
            info.append(favored_class);
            info.append(" ");
        }
        info.append("\n");
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
            info.append("Skill Ranks: ").append(skill.getRanks()).append("\n");
            info.append("Misc Mod: ").append(skill.getMisc_mod()).append("\n");
            info.append("Class Skill: ").append(skill.isIs_class_skill()).append("\n");
            info.append("Trained Only: ").append(skill.isTrained_only()).append("\n");
            info.append("Ability Score Used: ").append(skill.getAbility_score_used()).append("\n");
            info.append("\n");
        }
        return info.toString();
    }

    public String[] getFavored_classes() {
        return favored_classes;
    }

    public void setFavored_classes(String[] favored_classes) {
        this.favored_classes = favored_classes;
    }

    public void setFavored_class(int index, String favored_class){
        this.favored_classes[index] = favored_class;
    }

    public void resetSkills() {
        skills.clear();
        skills.add(new skill("Acrobatics",                0, 0, false, false, "dex"));
        skills.add(new skill("Appraise",                  0, 0, false, false, "int"));
        skills.add(new skill("Bluff",                     0, 0, false, false, "cha"));
        skills.add(new skill("Climb",                     0, 0, false, false, "str"));
        skills.add(new skill("Craft",                     0, 0, false, false, "int"));
        skills.add(new skill("Diplomacy",                 0, 0, false, false, "cha"));
        skills.add(new skill("Disable Device",            0, 0, false, true, "dex"));
        skills.add(new skill("Disguise",                  0, 0, false, false, "cha"));
        skills.add(new skill("Escape Artist",             0, 0, false, false, "dex"));
        skills.add(new skill("Fly",                       0, 0, false, false, "dex"));
        skills.add(new skill("Handle Animal",             0, 0, false, true, "cha"));
        skills.add(new skill("Heal",                      0, 0, false, false, "wis"));
        skills.add(new skill("Intimidate",                0, 0, false, false, "cha"));
        skills.add(new skill("Knowledge (Arcana)",        0, 0, false, true, "int"));
        skills.add(new skill("Knowledge (Dungeoneering)", 0, 0, false, true, "int"));
        skills.add(new skill("Knowledge (Engineering)",   0, 0, false, true, "int"));
        skills.add(new skill("Knowledge (Geography)",     0, 0, false, true, "int"));
        skills.add(new skill("Knowledge (History)",       0, 0, false, true, "int"));
        skills.add(new skill("Knowledge (Local)",         0, 0, false, true, "int"));
        skills.add(new skill("Knowledge (Nature)",        0, 0, false, true, "int"));
        skills.add(new skill("Knowledge (Nobility)",      0, 0, false, true, "int"));
        skills.add(new skill("Knowledge (Planes)",        0, 0, false, true, "int"));
        skills.add(new skill("Knowledge (Religion)",      0, 0, false, true, "int"));
        skills.add(new skill("Linguistics",               0, 0, false, true, "int"));
        skills.add(new skill("Perception",                0, 0, false, false, "wis"));
        skills.add(new skill("Perform",                   0, 0, false, false, "cha"));
        skills.add(new skill("Profession",                0, 0, false, false, "wis"));
        skills.add(new skill("Ride",                      0, 0, false, false, "dex"));
        skills.add(new skill("Sense Motive",              0, 0, false, false, "wis"));
        skills.add(new skill("Sleight of Hand",           0, 0, false, true, "dex"));
        skills.add(new skill("Spellcraft",                0, 0, false, true, "int"));
        skills.add(new skill("Stealth",                   0, 0, false, false, "dex"));
        skills.add(new skill("Survival",                  0, 0, false, false, "wis"));
        skills.add(new skill("Swim",                      0, 0, false, false, "str"));
        skills.add(new skill("Use Magic Device",          0, 0, false, true, "cha"));
    }

    public int getLevel_1_spells_per_day() {
        return level_1_spells_per_day;
    }

    public void setLevel_1_spells_per_day(int level_1_spells_per_day) {
        this.level_1_spells_per_day = level_1_spells_per_day;
    }

    public int getCantrips_knows() {
        return cantrips_knows;
    }

    public void setCantrips_knows(int cantrips_knows) {
        this.cantrips_knows = cantrips_knows;
    }

    public int getLevel_1_spells_known() {
        return level_1_spells_known;
    }

    public void setLevel_1_spells_known(int level_1_spells_known) {
        this.level_1_spells_known = level_1_spells_known;
    }

    public String getDeity() {
        return deity;
    }

    public void setDeity(String deity) {
        this.deity = deity;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void addDomain(String domain){
        this.domains.add(domain);
    }

    public int getLevel_1_domain_spells_per_day() {
        return level_1_domain_spells_per_day;
    }

    public void setLevel_1_domain_spells_per_day(int level_1_domain_spells_per_day) {
        this.level_1_domain_spells_per_day = level_1_domain_spells_per_day;
    }

    public player() {
        proficiencies = new ArrayList();
        languages = new ArrayList();
        traits_and_features = new ArrayList<trait_or_feature>();
        skills = new ArrayList<skill>();
        alignment_restrictions = new ArrayList<String>();
        hit_dice = new ArrayList<Integer>();
        favored_classes = new String[2];
        domains = new ArrayList<String>();
        resetSkills();
        this.setBase_fortitude_save(0);
        this.setBase_reflex_save(0);
        this.setBase_will_save(0);
        this.setLevel_1_spells_known(0);
        this.setCantrips_knows(0);
        this.setLevel_1_spells_per_day(0);
    }

}
