package othlon.fencedoff.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Jen on 19/12/2014.
 */
public class FOBlocks {

    public static FOFence fence = new FOFence();

    public static void makeTheBlockThings(){
        GameRegistry.registerBlock(fence, "farmfence");
        OreDictionary.registerOre("woodFence", fence);

    }
}
