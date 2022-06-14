package lesson18;

import lesson18.weapon.MeleeWeapon;
import lesson18.weapon.Weapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {
    public Warrior(String name, int damage) {
        super(name, damage);
    }
}
