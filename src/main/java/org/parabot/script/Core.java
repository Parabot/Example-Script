package org.parabot.script;

import org.parabot.api.Configuration;
import org.parabot.api.notifications.NotificationManager;
import org.parabot.core.ui.Logger;
import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.environment.scripts.framework.Strategy;
import org.parabot.script.data.Settings;
import org.parabot.script.strategies.Chop;
import org.parabot.script.strategies.LevelSelector;

import java.util.ArrayList;

/**
 * @author JKetelaar
 */

@ScriptManifest(author = "Parabot",
        category = Category.WOODCUTTING,
        description = "A great example script for Parabot",
        name = "Example Script",
        servers = {"Server 1", "Server 2"},
        version = 1.0)
public class Core extends Script implements ICore {

    private final ArrayList<Strategy> strategies;
    private Settings settings;

    public Core() {
        this.settings = new Settings();
        this.strategies = new ArrayList<>();
    }

    @Override
    public boolean onExecute() {
        Logger.addMessage("Starting example script", true);

        strategies.add(new Chop(this));
        strategies.add(new LevelSelector(this));

        provide(strategies);

        return true;
    }

    @Override
    public void onFinish() {
        Logger.addMessage("Finished example script", false);
    }

    @Override
    public Settings getSettings() {
        return this.settings;
    }

    @Override
    public void sendNotification(String message) {
        NotificationManager.getContext().sendNotification(Configuration.BOT_TITLE, "Example script", message);
    }
}
