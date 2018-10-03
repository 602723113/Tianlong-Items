package cc.zoyn.tianlongitems;

import cc.zoyn.tianlongitems.item.AbstractTianLongItem;
import com.google.common.collect.Maps;
import lombok.NonNull;

import java.util.Map;

public final class TianLongItemManager {

    private Map<String, AbstractTianLongItem> itemMap = Maps.newHashMap();

    public void addItem(@NonNull String itemName, @NonNull AbstractTianLongItem item) {
        itemMap.put(itemName, item);
    }

    public AbstractTianLongItem getItem(String itemName) {
        return itemMap.getOrDefault(itemName, null);
    }

}
