package cc.zoyn.tianlongitems;

import org.bukkit.plugin.java.JavaPlugin;

public class TianLongItems extends JavaPlugin {

    private static TianLongItems instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static TianLongItems getInstance() {
        return instance;
    }
}
