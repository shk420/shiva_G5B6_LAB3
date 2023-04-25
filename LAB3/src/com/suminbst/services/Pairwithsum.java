package com.suminbst.services;

import java.util.Stack;

public class Pairwithsum {
    public static class Node {
        int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean findPair(Node root, int sum) {
        if (root == null) {
            System.out.println("Nodes not found");
            return false;
        }

        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        Node curr1 = root, curr2 = root;
        boolean done1 = false, done2 = false;
        int val1 = 0, val2 = 0;

        while (true) {
            while (!done1) {
                if (curr1 != null) {
                    s1.push(curr1);
                    curr1 = curr1.left;
                } else {
                    if (s1.isEmpty())
                        done1 = true;
                    else {
                        curr1 = s1.pop();
                        val1 = curr1.val;
                        curr1 = curr1.right;
                        done1 = true;
                    }
                }
            }

            while (!done2) {
                if (curr2 != null) {
                    s2.push(curr2);
                    curr2 = curr2.right;
                } else {
                    if (s2.isEmpty())
                        done2 = true;
                    else {
                        curr2 = s2.pop();
                        val2 = curr2.val;
                        curr2 = curr2.left;
                        done2 = true;
                    }
                }
            }

            if ((val1 + val2) == sum) {
                System.out.println("Pair is: " +"(" + val1 + "," + val2 + ")");
                return true;
            } else if ((val1 + val2) < sum) {
                done1 = false;
            } else if ((val1 + val2) > sum) {
                done2 = false;
            }

            if (done1 && done2) {
                break;
            }
        }

        System.out.println("Nodes not found");
        return false;
    }
}
