/**
 * Entry point for ICS3U assignments with console output.
 *
 * @author Your Name
 */
public class Main extends ConsoleProgram {
    @Override
    public void run() {
        // Get user input for limit, speeds
        int speedLimit = readInt("Enter speed limit: ");
        int speedObserved = readInt("Enter observed speed: ");
        
        // Determine stunt driving threshold
        int stuntThreshold = speedLimit >= 80 ? 50 : 40;

        if (speedObserved <= speedLimit) {
            System.out.println("Within limit. Drive safely.");
        } else {
            if ((speedObserved - speedLimit) >= stuntThreshold) {
                System.out.println("Stunt driving. License suspension and vehicle impound.");
            } else {
                System.out.println("Speeding ticket. Fine and demerit points.");
            }
        }
    }
}
