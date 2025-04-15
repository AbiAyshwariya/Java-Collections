package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // HashSet - Unordered, unique
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2); // duplicate
        System.out.println(set);

        Set<Integer> set2 = new HashSet<>(set);
        set2.remove(2);

        System.out.println("Set1: " + set);
        System.out.println("Set2: " + set2);

        set2.retainAll(set); // intersection
        set.addAll(set2);    // union

        System.out.println("After operations:");
        System.out.println("Set1: " + set);
        System.out.println("Set2: " + set2);

        set.add(0);
        System.out.println("Iterating set2:");
        for (int x : set2) {
            System.out.println(x);
        }

        // LinkedHashSet - maintains insertion order
        System.out.println("LinkedHashSet Example:");
        Set<StudentMarks> set3 = new LinkedHashSet<>(PriorityQueueExample.marks);
        set3.add(new StudentMarks(30, 40));
        set3.add(new StudentMarks(70, 909));
        System.out.println(set3);
        System.out.println(set3.contains(new StudentMarks(30, 40)));
        System.out.println(set3.contains(new StudentMarks(00, 20)));
    }
}
