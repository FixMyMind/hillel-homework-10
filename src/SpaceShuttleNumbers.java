public class SpaceShuttleNumbers {
    public static void main(String[] args) {
        int totalNumberOfShuttles = 100;
        for (int shuttleNumber = 1; totalNumberOfShuttles > 0; shuttleNumber++) {
            if (shuttleNumber / 10 != 4 && shuttleNumber % 10 != 4 && ((shuttleNumber % 100) / 10) != 4 &&
                    shuttleNumber / 10 != 9 && shuttleNumber % 10 != 9 && ((shuttleNumber % 100) / 10) != 9) {
                System.out.println("Номер шатла: " + shuttleNumber);
                totalNumberOfShuttles--;
            }
        }
    }
}
