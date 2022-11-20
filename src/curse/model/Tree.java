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
            value=date;
        }else if (value>date){
            if(nodeLeft!=null){
                nodeLeft.add(date);
            }else{
                nodeLeft=new Node(0);
                nodeLeft.add(date);
            }
        } else if (value<=date) {
            if(nodeRight!=null){
                nodeRight.add(date);
            }else{
                nodeRight=new Node(0);
                nodeRight.add(date);
            }
        }

    }

    public void contains(int date){

    }

    public Tree max(){
        Tree thisNode=this;
        Tree currentNode=this;

        while(currentNode!=null) {
                currentNode=nodeRight.getNodeRight();
            if(currentNode==null){
                return thisNode;
            }
            thisNode=currentNode;
        }
        return null;
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
