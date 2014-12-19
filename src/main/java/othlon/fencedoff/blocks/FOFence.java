package othlon.fencedoff.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import othlon.fencedoff.FencedOff;
import othlon.fencedoff.tileentities.FOFenceTileEntity;

/**
 * Created by Jen on 19/12/2014.
 */
public class FOFence extends BlockContainer{
    public FOFence(){
        super(Material.wood);
        this.setHarvestLevel("axe", 0);
        this.setCreativeTab(FencedOff.tabFencedOff);
        this.setBlockBoundsForItemRender();
        this.setBlockName("farmfence");
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i){return new FOFenceTileEntity();}

    @Override
    public int getRenderType(){return -1;}

    @Override
    public boolean isOpaqueCube(){ return false;}

    @Override
    public boolean renderAsNormalBlock(){ return false;}

}
