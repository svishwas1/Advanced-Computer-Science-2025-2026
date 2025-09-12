public class MonitorTester {
    public static void main(String[] args) {
        System.out.println("Yo Waddupp!?!");

        Monitor libraryMonitor = new Monitor();
        libraryMonitor.Break();
        libraryMonitor.change_display();
        libraryMonitor.turn_off();
        libraryMonitor.change_time();
        libraryMonitor.takeOffWall();
        System.out.println("\n*** ARE YOU ONTIME FOR CLASS ***");
        libraryMonitor.changeTime(20.50);
        System.out.print(libraryMonitor.getShapeofMonitor("Square"));

    }
}
