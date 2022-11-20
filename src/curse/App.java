package curse;

import curse.model.Node;
import curse.model.Tree;

public class App {
    public static void main(String[] args) {


        int[] tab=new int[]{1,9,8,3};


        Tree tree=new Tree(0);
        for (int i = 0; i < tab.length; i++) {
            tree.add(tab[i]);
        }


    }
}
