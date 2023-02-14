import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> allOfNames = new ArrayList<>();
        System.out.print("Enter the names of all the students (separated by a space): ");
        while (true) {
            String name = in.next();
            if (name.equals("end")) {
                break;
            }
            allOfNames.add(name);
        }
        Collections.shuffle(allOfNames);
        System.out.print("Enter the number of groups: ");
        int group = in.nextInt();
        List<String[]> groups = new ArrayList<>();
        for(int i = 0; i < group; i++) {
            System.out.print("Enter the number of player in group " + (i + 1) + ": ");
           int numPerGroup = in.nextInt();
              String[] groupNames = new String[numPerGroup];
                for(int j = 0; j < numPerGroup; j++) {
                    groupNames[j] = allOfNames.get(0);
                    allOfNames.remove(0);
                    if (allOfNames.size() == 0) {
                        break;
                    }
                }
                groups.add(groupNames);
        }
        for(int i = 0; i < groups.size(); i++) {
            System.out.print("Group " + (i + 1) + ": ");
            for(int j = 0; j < groups.get(i).length; j++) {
                if (groups.get(i)[j] == null) {
                    break;
                }
                System.out.print(groups.get(i)[j] + " ");
            }
            System.out.println();
        }





    }
}