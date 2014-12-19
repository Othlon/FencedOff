package othlon.fencedoff.renderers;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import othlon.fencedoff.blocks.FOBlocks;
import othlon.fencedoff.blocks.FOFence;
import othlon.fencedoff.models.FOFenceModel;
import othlon.fencedoff.tileentities.FOFenceTileEntity;

/**
 * Created by Jen on 19/12/2014.
 */
public class FOFenceRenderer extends TileEntitySpecialRenderer{

    FOFenceModel model    = new FOFenceModel();
    ResourceLocation  tex = new ResourceLocation("fencedoff", "textures/models/FencePost.png");

    public FOFenceRenderer(){

    }

    @Override
    public void renderTileEntityAt(TileEntity tile, double d0, double d1, double d2, float f){
        renderModelAt((FOFenceTileEntity)tile, d0, d1, d2,f);
    }

    public void renderModelAt( FOFenceTileEntity tile, double dx, double dy, double dz,float f){
        GL11.glPushMatrix();
        {
            FMLClientHandler.instance().getClient().renderEngine.bindTexture(tex);
            GL11.glTranslatef((float)dx + 0.5F,(float)dy + 0.5F,(float)dz + 0.5F);
            GL11.glScalef(1.0f, 1.0f, 1.0f);
            GL11.glRotatef(180F, 90F, 0F, 90F);

            this.model.renderAll();
        }
        GL11.glPopMatrix();
    }
}
