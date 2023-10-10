import java.util.*;

public class ValidTreeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        ArrayList<Integer> nodeList = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                nodeList.add(Integer.parseInt("" + inputString.charAt(i)));
            }
        }

        ArrayList<Integer> parentList = new ArrayList<>();
        for (int i = 1; i < nodeList.size(); i += 2) {
            parentList.add(nodeList.get(i));
        }

        boolean isValidTree = true;

        for (int i = 0; i < parentList.size() - 1; i++) {
            int childCount = 1;

            for (int j = i + 1; j < parentList.size(); j++) {
                if (parentList.get(i).equals(parentList.get(j))) {
                    childCount++;
                }
            }

            if (childCount > 2) {
                isValidTree = false;
                break;
            }
        }

        System.out.println(isValidTree);
    }
}
