public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.bossWeapon.setWeaponType(WeaponType.IRON_FIST);
        boss.setHealth(250);
        boss.setDamage(100);
        boss.bossWeapon.setWeaponName("Fist Of Hope");
        System.out.println("Weapon type: " + boss.bossWeapon.getWeaponType() +
                "\nWeapon name: " + boss.bossWeapon.getWeaponName() +
                "\nHealth: " + boss.getHealth() + "\nDamage:  " + boss.getDamage());
    }
}
