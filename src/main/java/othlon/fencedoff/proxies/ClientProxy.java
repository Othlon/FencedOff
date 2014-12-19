package othlon.fencedoff.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import othlon.fencedoff.renderers.FOFenceRenderer;
import othlon.fencedoff.tileentities.FOFenceTileEntity;

/**
 * Created by Jen on 19/12/2014.
 */
public class ClientProxy extends CommonProxy{

    public void registerRenderers(){

        ClientRegistry.bindTileEntitySpecialRenderer(FOFenceTileEntity.class, new FOFenceRenderer());
    }
}
