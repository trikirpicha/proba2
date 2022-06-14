package lesson18;

import lesson18.weapon.Bow;
import lesson18.weapon.Sword;
import lesson18.weapon.Wand;
import lesson18.weapon.Weapon;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<Bow>("Леголас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<Sword>("Боромир", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(archer);
    }
    public static void printWeaponDamage(Hero<? extends Weapon> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }
}
