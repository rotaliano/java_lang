public class PlayGround {
    public static void main(String[] args) {
        //System.exit(0);
        String ver = System.getProperty("rpg.version");
        System.out.println(ver);
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "MB");
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + "MB");
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "MB");

    }
}
