package model;

public abstract class Weapon {
    int Damage;
    int ShootRate;

    public Weapon(int damage, int shootRate) {
        Damage = damage;
        ShootRate = shootRate;
    }

    public abstract void shoot();

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getShootRate() {
        return ShootRate;
    }

    public void setShootRate(int shootRate) {
        ShootRate = shootRate;
    }
}
