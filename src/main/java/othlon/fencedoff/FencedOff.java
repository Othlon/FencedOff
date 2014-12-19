package othlon.fencedoff;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import othlon.fencedoff.blocks.FOBlocks;
import othlon.fencedoff.proxies.CommonProxy;

/**
 * Created by Jen on 19/12/2014.
 */
@Mod(modid = "fencedoff", name = "FencedOff", version = "1.0")
public class FencedOff {

    @Mod.Instance
    public static FencedOff instance;

    @SidedProxy(clientSide = "othlon.fencedoff.proxies.ClientProxy", serverSide="othlon.fencedoff.proxies.CommonProxy")
    public static CommonProxy proxy;


    public static CreativeTabs tabFencedOff;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        tabFencedOff = new FOTab(CreativeTabs.getNextID(), "FencedOffTab");

        FOBlocks.makeTheBlockThings();
        proxy.registerRenderers();
    }
}
