public class MonitorTester {
    public static void main(String[] args) {
        System.out.println("Yo Waddupp!?!");

        Monitor libraryMonitor = new Monitor();
        libraryMonitor.Break();
        libraryMonitor.change_display();
        libraryMonitor.turn_off();
        libraryMonitor.change_time();
        libraryMonitor.takeOffWall();
    }
}
