package othlon.fencedoff.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by Jen on 19/12/2014.
 */
public class FOFenceModel extends ModelBase
{
    ModelRenderer PostA;

    public FOFenceModel()
    {
        this( 0.0f );
    }

    public FOFenceModel( float par1 )
    {
        PostA = new ModelRenderer( this, 12, 12 );
        PostA.setTextureSize( 64, 32 );
        PostA.addBox( -2F, -8F, -2F, 4, 16, 4);
        PostA.setRotationPoint( 8F, 16F, -8F );
    }

    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        PostA.rotateAngleX = 0F;
        PostA.rotateAngleY = 0F;
        PostA.rotateAngleZ = 0F;
        PostA.renderWithRotation(par7);

    }

    public void renderAll(){
        PostA.rotateAngleX = 0F;
        PostA.rotateAngleY = 0F;
        PostA.rotateAngleZ = 0F;
        PostA.renderWithRotation(0.0625f );
    }

}
