package lesson18;

import lesson18.weapon.RangeWeapon;
import lesson18.weapon.Weapon;

public class Archer<T extends RangeWeapon> extends Hero<T>{

    public Archer(String name, int damage) {
        super(name, damage);
    }
}

