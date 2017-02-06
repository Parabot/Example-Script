package org.parabot.script.strategies;

import org.parabot.core.ui.Logger;
import org.parabot.environment.scripts.framework.Strategy;
import org.parabot.script.ICore;
import org.parabot.script.data.Tree;
import org.rev317.min.api.methods.Skill;

/**
 * @author JKetelaar
 */
public class LevelSelector implements Strategy {

    private int knownLevel = 0;
    private ICore core;

    public LevelSelector(ICore core) {
        this.core = core;
    }

    @Override
    public boolean activate() {
        return this.knownLevel != Skill.WOODCUTTING.getLevel();
    }

    @Override
    public void execute() {
        Logger.addMessage("New level achieved, checking if there's a better tree match", false);
        this.knownLevel = Skill.WOODCUTTING.getLevel();
        this.core.getSettings().setCurrentTree(Tree.getFittingForLevel(this.knownLevel));
    }
}
