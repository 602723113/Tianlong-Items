package cc.zoyn.tianlongitems.item;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.List;

@TianLongItem(name = "定位符", description = "用于玩家的定位")
public class Locator extends AbstractTianLongItem {

    @Override
    public void onUse(Player player) {

    }

    @Override
    public Material getMaterial() {
        return Material.PAPER;
    }

    @Override
    public int getData() {
        return 0;
    }

    @Override
    public String getDisplayName() {
        return "§f§l[ §6定位符 §f§l]";
    }

    @Override
    public List<String> getLore() {
        return null;
    }
}
