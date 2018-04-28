package sda.exercse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Please input number of levels of tree: ");
//        Integer n = scanner.nextInt();
//
//        System.out.println("The tree will have " + n + " levels");
//
        Tree tree = new Tree();
//        tree.generateDefaultTree(n);
//
//        System.out.println("NLR");
//        tree.showTreeNLR(tree.root);
//        System.out.println();
//
//        System.out.println("LNR");
//        tree.showTreeLNR(tree.root);
//        System.out.println();
//
//        System.out.println("LRN");
//        tree.showTreeLRN(tree.root);
//        System.out.println();


        tree.readUnbalancedTree();

        System.out.println("NLR");
        tree.showTreeNLR(tree.root);
        System.out.println();

        System.out.println("LNR");
        tree.showTreeLNR(tree.root);
        System.out.println();

        System.out.println("LRN");
        tree.showTreeLRN(tree.root);
        System.out.println();
    }
}
