package work6;

public class Main {
    public static void main(String[] args) {
        GameGroup castle = new GameGroup("[Level 1]");
        GameGroup tower = new GameGroup("Sleep Princess tower");
        GameUnit hero = new GameUnit("new 'King'");
        GameUnit boss = new GameUnit("Dragon (should take care about princess)");
        GameUnit princess = new GameUnit("Sleepy (Really) Princess");

        tower.add(hero);
        tower.add(boss);
        tower.add(princess);
        castle.add(tower);

        System.out.println("[ORIGINAL] ---");
        castle.display("");

        GameGroup shallow = (GameGroup) castle.clone();
        GameGroup deep = (GameGroup) castle.deepClone();

        System.out.println("\n>> new 'King' kill Dragon...");
        hero.setName("new (now really??) King");
        boss.setName("(Already) killed Dragon");
        princess.setName("Unsleepy (but not kissed!) princess");
        System.out.println("\n[Copy result] ---");
        shallow.display("");
        System.out.println("\n[Deep copy result] ---");
        deep.display("");
    }
}