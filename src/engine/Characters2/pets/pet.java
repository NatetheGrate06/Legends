package engine.Characters2.pets;

import engine.Characters2.pets.pet_stats.pet_attack;

public class pet {

    private static pet pet;

    //TODO finish this class
    pet(boolean isBoostingPet, boolean isAttackingPet, boolean isScavengingPet, pet getPet) {
        this.isBoostingPet = isBoostingPet;
        this.isAttackingPet = isAttackingPet;
        this.isScavengingPet = isScavengingPet;

        if (isBoostingPet = true) {
            getPetBooster(isBoostingDefense, isBoostingAttack, isBoostingMagic, isBoostingAgility,
                          isBoostingStamina, isBoostingMaximate);
        }
    }

    protected static pet petBooster;
    public boolean isBoostingDefense;
    protected int petDefenseBoost;
    protected int petAttackBoost;
    protected boolean isBoostingAttack;
    public boolean isBoostingMagic;
    public int petMagicBoost;
    public boolean isBoostingAgility;
    public boolean isBoostingStamina;
    public boolean isBoostingMaximate;
    public int petStaminaBoost;
    public int petAgilityBoost;
    public int petMaximateBoost;

    public static boolean isBoostingPet;

    protected pet getPetBooster(boolean isBoostingDefense, boolean isBoostingAttack, boolean isBoostingMagic,
                                boolean isBoostingAgility, boolean isBoostingStamina, boolean isBoostingMaximate) {
        this.isBoostingDefense = isBoostingDefense; {
            if (isBoostingDefense = true) {
                getPetDefenseBoost(petDefenseBoost);
            }
        }
        this.isBoostingAttack = isBoostingAttack; {
            if (isBoostingAttack = true) {
                getPetAttackBoost(petAttackBoost);
            }
        }
        this.isBoostingMagic = isBoostingMagic; {
            if(isBoostingMagic = true) {
                getPetMagicBoost(petMagicBoost);
            }
        }
        this.isBoostingAgility = isBoostingAgility; {
            if (isBoostingAgility = true) {
                getPetAgilityBoost(petAgilityBoost);
            }
        }
        this.isBoostingStamina = isBoostingStamina; {
            if (isBoostingStamina = true) {
                getPetStaminaBoost(petStaminaBoost);
            }
        }
        this.isBoostingMaximate = isBoostingMaximate; {
            if (isBoostingMaximate = true) {
                getPetMaximateBoost(petMaximateBoost);
            }
        }

        return petBooster;
    }

    public int getPetDefenseBoost(int petDefenseBoost) {
        return petDefenseBoost;
    }

    public int getPetAttackBoost(int petAttackBoost) {
        return petAttackBoost;
    }

    public int getPetMagicBoost(int petMagicBoost) {
        return petMagicBoost;
    }

    public int getPetAgilityBoost(int petAgilityBoost) {
        return petAgilityBoost;
    }

    public int getPetStaminaBoost(int petStaminaBoost) {
        return petStaminaBoost;
    }

    public int getPetMaximateBoost(int petMaximateBoost) {
        return petMaximateBoost;
    }

    public static pet getPet(pet pet) {
        return pet;
    }

    public boolean isAttackingPet;
    public boolean isScavengingPet;

    protected pet_attack getPetAttack(int petDamage, pet_attack petAttack, pet_attack petEffects) {
        return petAttack;
    }
}
