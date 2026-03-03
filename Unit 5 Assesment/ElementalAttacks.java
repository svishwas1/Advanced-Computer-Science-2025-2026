public interface ElementalAttacks {

    // to-do: Implement the attack method for ElementalAttacks
    // Every monster has 2 different attacks, each with different damage and type.
    // There is a 45% chance the monster should use AttackOne
    // There is a 45% chance the monster should use AttackTwo
    // There is a 10% chance the monster doubles down and uses BOTH attacks with doubleDown Attack
    //         - The double down attack is only available once per battle.
    //         - After using double down, the attack probability is 50% / 50% for Attacks 1/2
    public default void attack(Monster opponent) {
        // implement this method here
        int random = (int) (Math.random() + 1) * 100;
        if (random <= 45) {
            performsSingleElementalAttack(this.getAttackOne, opponent);
        } else if (random > 45 && random <= 90) {
            performsSingleElementalAttack(this.getAttackTwo(), opponent);
        } else {
            performDoubleDownAttack(opponent);
        }
    }

    // to-do: Implement the attack method for performSingleElementalAttack
    // The current moster attacks the opponent using the attackNumber provided
    public default void performSingleElementalAttack(int attackNumber, Monster opponent) {
        // implement this method here
        if (this.getElement().equals(opponent.getElement())) {
            int totalDamage = (10) * (attackNumber / opponent.getDefense()) * 1.5 * getElementalMultiplier(attackType, defenderType);
            opponent.setHealth(opponent.getHealth() - totalDamage);
            
        }
    }


    // to-do: Implement the useDoubleDown() method for the monster
    // This method is called when the monster uses their double down attack.
    // The double down attack is only available once per battle
    // If the monster has already used their double down attack, print a message saying so and
    // return. The
    // monster effectively loses their turn.
    public default void performDoubleDownAttack(Monster opponent) {
        // implement this here
        performSingleElementalAttack(attackNumber, opponent);
        performsSingleElementalAttack(attackNumer, opponent);

    }

    // to-do: didAttackCrit
    // returns a boolean if an attack critically struck based on the speed of the attacking monster
    public static boolean didAttackCrit(int speed) {
         // doesnt actually always return false.  please implement!
        int num = (int) Math.random() * 2;
        if (num < speed/250 ) {
            return true;
        } else {
            return false;
        }

    }


    /**
     * Returns true if attackType is super effective against defenderType.
     * Fire->Air, Air->Earth, Earth->Water, Water->Fire
     */
    static boolean isSuperEffectiveAgainst(ElementType attackType, ElementType defenderType) {
        if (attackType == null || defenderType == null) return false;
        return (attackType == ElementType.FIRE && defenderType == ElementType.AIR)
            || (attackType == ElementType.AIR && defenderType == ElementType.EARTH)
            || (attackType == ElementType.EARTH && defenderType == ElementType.WATER)
            || (attackType == ElementType.WATER && defenderType == ElementType.FIRE);
    }

    /**
     * Returns the effectiveness multiplier: 2.0 (super), 1.0 (normal), or 0.5 (low).
     */
    static double getElementalMultiplier(ElementType attackType, ElementType defenderType) {
        if (attackType == null || defenderType == null) return 1.0;
        if (isSuperEffectiveAgainst(attackType, defenderType)) return 2.0;
        if ((attackType == ElementType.FIRE && (defenderType == ElementType.WATER || defenderType == ElementType.FIRE))
            || (attackType == ElementType.WATER && (defenderType == ElementType.EARTH || defenderType == ElementType.WATER))
            || (attackType == ElementType.EARTH && (defenderType == ElementType.AIR || defenderType == ElementType.EARTH))
            || (attackType == ElementType.AIR && (defenderType == ElementType.FIRE || defenderType == ElementType.AIR)))
            return 0.5;
        return 1.0;
    }
}
