package othlon.fencedoff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Jen on 19/12/2014.
 */
public class FOTab extends CreativeTabs {

    public FOTab(int pos, String tabID){
        super(pos, tabID);
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(Items.wooden_door);
    }

    @Override
    public Item getTabIconItem() {
        return null;
    }

}
