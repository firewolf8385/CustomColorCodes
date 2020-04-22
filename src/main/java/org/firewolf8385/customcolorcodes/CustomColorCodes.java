package org.firewolf8385.customcolorcodes;

import org.bukkit.plugin.java.JavaPlugin;

public class CustomColorCodes extends JavaPlugin
{
    Settings settings = Settings.getInstance();

    @Override
    public void onEnable()
    {
        settings.setup(this);
    }

}