package cc.zoyn.tianlongitems.item;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public abstract class AbstractTianLongItem {

    private Material material;
    private int data;
    private String displayName;
    private List<String> lore;

    public abstract void onUse(Player player);

    public abstract Material getMaterial();

    public abstract int getData();

    public abstract String getDisplayName();

    public abstract List<String> getLore();

    public ItemStack getItemStack() {
        ItemStack itemStack = new ItemStack(getMaterial(), 1, (short) getData());
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(getDisplayName());
        itemMeta.setLore(getLore());
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
}
