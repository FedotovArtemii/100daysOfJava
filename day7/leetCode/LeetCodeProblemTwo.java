package day7.leetCode;

import java.util.LinkedList;
import java.util.List;

public class LeetCodeProblemTwo {
    public static List<Integer> preorder(Node root) {
        List<Integer> traversal = new LinkedList<>();
        traversal(root, traversal);
        return traversal;
    }

    private static void traversal(Node root, List<Integer> traversal) {
        if (root == null)
            return;
        traversal.add(root.val);
        for (Node child: root.children) {
            traversal(child, traversal);

        }
    }
}
