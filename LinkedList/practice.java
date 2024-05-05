import java.util.HashSet;

public class practice {
    public static int countUniqueDecimal(String binary) {
        HashSet<Integer> uniqueDecimals = new HashSet<>();

        // Iterate through all possible subsequences
        for (int i = 0; i < binary.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < binary.length(); j++) {
                sb.append(binary.charAt(j));
                // Convert binary subsequence to decimal
                int decimal = Integer.parseInt(sb.toString(), 2);
                uniqueDecimals.add(decimal);
            }
        }

        return uniqueDecimals.size();
    }

    public static void main(String[] args) {
        String binary = "110";
        int uniqueCount = countUniqueDecimal(binary);
        System.out.println("Number of unique decimal representations: " + uniqueCount);
    }
}
