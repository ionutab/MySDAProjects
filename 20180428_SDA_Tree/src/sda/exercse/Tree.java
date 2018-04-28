package sda.exercse;

import java.util.Scanner;

public class Tree {

    Node root;

    public void readUnbalancedTree(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please read tree:");
        String sRoot = scanner.next();
        System.out.println(sRoot);
        if(!"-".equals(sRoot)){
            root = new Node();
            root.value = Integer.valueOf(sRoot);
            readUnbalancedTree(root);
        }
    }

    private void readUnbalancedTree(Node node){
        System.out.println("node value " + node.value);
        Scanner scanner = new Scanner(System.in);

        String sL = scanner.next();
        if(!"-".equals(sL)){
            node.left = new Node();
            node.left.setValue(Integer.valueOf(sL));
            readUnbalancedTree(node.left);
        }

        String sR = scanner.next();
        if(!"-".equals(sR)){
            node.right = new Node();
            node.right.setValue(Integer.valueOf(sR));
            readUnbalancedTree(node.right);
        }

    }

    public void generateDefaultTree(int nrOfLevels) {
        root = generateTree(0, nrOfLevels);
    }

    private Node generateTree(int currentLevel, int nrOfLevels) {

        if (currentLevel < nrOfLevels) {
            Node node = new Node();

            node.left = generateTree(currentLevel+1, nrOfLevels);
            node.right = generateTree(currentLevel+1, nrOfLevels);

            //temp
            node.setValue(currentLevel);
            return node;
        }

        return null;
    }

    public void showTreeNLR(Node node){
        System.out.print(node.value + " ");
        if(null != node.getLeft()){
            showTreeNLR(node.getLeft());
        }
        if(null != node.getRight()){
            showTreeNLR(node.getRight());
        }
    }

    public void showTreeLNR(Node node){
        if(null != node.getLeft()){
            showTreeLNR(node.getLeft());
        }
        System.out.print(node.value + " ");
        if(null != node.getRight()){
            showTreeLNR(node.getRight());
        }
    }

    public void showTreeLRN(Node node){
        if(null != node.getLeft()){
            showTreeLRN(node.getLeft());
        }
        if(null != node.getRight()){
            showTreeLRN(node.getRight());
        }
        System.out.print(node.value + " ");
    }

}
