package cc.zoyn.tianlongitems.item;

import org.bukkit.Material;

import java.util.List;

public abstract class AbstractTianLongItem {

    private Material material;
    private int data;
    private String displayName;
    private List<String> lore;

    public abstract void onUse();

}
