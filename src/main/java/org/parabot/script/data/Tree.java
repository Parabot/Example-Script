package org.parabot.script.data;

/**
 * @author JKetelaar
 */
public enum Tree {

    OAK("Oak", 123, 5),
    WILLOW("Willow", 1234, 20),
    YEW("Yew", 12345, 40);

    private String name;
    private int id;
    private int level;

    Tree(String name, int id, int level) {
        this.name = name;
        this.id = id;
        this.level = level;
    }

    public String getTreeName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    /**
     * Finds the best tree based on your level
     *
     * @param yourLevel Your woodcutting level
     * @return The best tree for your level, null if no fitting tree found
     */
    public static Tree getFittingForLevel(int yourLevel){
        Tree bestFittingTree = null;
        for (Tree tree : Tree.values()){
            if (bestFittingTree == null && tree.level <= yourLevel){
                bestFittingTree = tree;
            }else if (bestFittingTree != null && tree.level <= yourLevel && bestFittingTree.level < tree.level){
                bestFittingTree = tree;
            }
        }

        return bestFittingTree;
    }
}
