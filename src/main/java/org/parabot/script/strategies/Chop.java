package org.parabot.script.strategies;

import org.parabot.environment.scripts.framework.Strategy;
import org.parabot.script.ICore;

/**
 * @author JKetelaar
 */
public class Chop implements Strategy {

    private ICore core;

    public Chop(ICore core) {
        this.core = core;
    }

    @Override
    public boolean activate() {
        return false;
    }

    @Override
    public void execute() {

    }
}
