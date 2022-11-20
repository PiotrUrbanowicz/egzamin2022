package curse.model;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private int value;
    private Node nodeLeft;
    private Node nodeRight;

    public Tree(int value) {
        this.value = value;
       // this.nodeLeft = new Node(0);
        //this.nodeRight = new Node(0);
    }

    public void add(int date){
        if(value==0){
            this.value=date;
        }else if (value>date){
            if(nodeLeft!=null){
                nodeLeft.add(date);
            }else{
                nodeLeft=new Node(0);
                nodeLeft.add(date);
            }
        } else if (value<=date) {
            if(nodeLeft!=null){
                nodeRight.add(date);
            }
        }
    }

    public void contains(int date){

    }

    public int max(int date){
        boolean flag=true;
        Node thisNode=getNodeRight();
        Node currentNode=getNodeRight();

        while(flag) {

            if(currentNode!=null){
                currentNode=nodeRight.getNodeRight();
            }else {
                flag=false;
            }
            thisNode=currentNode;
        }
        return thisNode.getValue();
    }










    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeLeft(Node nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public Node getNodeRight() {
        return nodeRight;
    }

    public void setNodeRight(Node nodeRight) {
        this.nodeRight = nodeRight;
    }






}
