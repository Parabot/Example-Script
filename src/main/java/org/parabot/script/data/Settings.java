package org.parabot.script.data;

/**
 * @author JKetelaar
 */
public class Settings {

    private String serverUsername;
    private String serverPassword;

    private Tree currentTree;

    public String getServerPassword() {
        return serverPassword;
    }

    public void setServerPassword(String serverPassword) {
        this.serverPassword = serverPassword;
    }

    public String getServerUsername() {
        return serverUsername;
    }

    public void setServerUsername(String serverUsername) {
        this.serverUsername = serverUsername;
    }

    public Tree getCurrentTree() {
        return currentTree;
    }

    public void setCurrentTree(Tree currentTree) {
        this.currentTree = currentTree;
    }
}
