public class Boss extends GameEntity{

    Weapon weapon;
    Weapon bossWeapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
