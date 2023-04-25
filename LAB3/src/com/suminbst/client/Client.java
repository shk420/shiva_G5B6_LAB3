package com.suminbst.client;

import com.suminbst.services.Pairwithsum.Node;
import com.suminbst.services.Pairwithsum;

public class Client {

    public static void main(String[] args) {
    	Node root = new Pairwithsum.Node(40);
    	root.left = new Pairwithsum.Node(20);
    	root.right = new Pairwithsum.Node(60);
    	root.left.left = new Pairwithsum.Node(10);
    	root.left.right = new Pairwithsum.Node(30);
    	root.right.left = new Pairwithsum.Node(50);
    	root.right.right = new Pairwithsum.Node(70);

        int sum = 130;
        Pairwithsum.findPair(root, sum);

    }
}
