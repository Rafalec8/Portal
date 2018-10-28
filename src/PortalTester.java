public class PortalTester {
    public static void main(String[] args) {
        Portal wit = new Portal();
        int[] polozenia = {2,3,4};
        wit.setPolaPolozenia(polozenia);
        String wybranePole = "2";
        String wynik = wit.sprawdz(wybranePole);
    }
}
