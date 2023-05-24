import java.util.Scanner;

public class CharacterStuffing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the data to be stuffed: ");
        String data = scanner.nextLine();

        System.out.print("Enter the flag sequence: ");
        String flagSequence = scanner.nextLine();

        String stuffedData = characterStuffing(data, flagSequence);
        System.out.println("Stuffed data: " + stuffedData);
    }

    private static String characterStuffing(String data, String flagSequence) {
        // Start stuffing by adding the flag sequence at the beginning and end
        StringBuilder stuffedData = new StringBuilder(flagSequence);

        for (int i = 0; i < data.length(); i++) {
            char currentChar = data.charAt(i);

            // Check for occurrences of the flag sequence in the data
            if (data.startsWith(flagSequence, i)) {
                stuffedData.append(flagSequence); // Escape the flag sequence
            }

            stuffedData.append(currentChar); // Add the current character to the stuffed data
        }

        stuffedData.append(flagSequence); // Add the flag sequence at the end

        return stuffedData.toString();
    }
}
