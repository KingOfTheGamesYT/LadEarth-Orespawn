package danger.orespawn;

import java.util.Random;

import net.minecraft.block.BlockIce;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PrinceIce  extends BlockIce {

public PrinceIce() {
	super();
	this.setBlockTextureName("ice");
	this.setCreativeTab(CreativeTabs.tabBlock);
	this.setBlockName("prince_ice");
}




/**
 * Ticks the block if it's been scheduled
 */
@Override
public void updateTick(World p_149674_1_, int x, int y, int z, Random p_149674_5_)
{    
	super.updateTick(p_149674_1_,x,y,z,p_149674_5_);
	 if (p_149674_1_.isRemote) {
         return;
     }
	 p_149674_1_.setBlock(x, y, z, Blocks.air, 0, 2);
     
}

/**
 * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
 * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
 */
@Override
protected ItemStack createStackedBlock(int p_149644_1_)
{
    int j = 0;
    Item item = Item.getItemFromBlock(Blocks.ice);

    if (item != null && item.getHasSubtypes())
    {
        j = p_149644_1_;
    }

    return new ItemStack(item, 1, j);
}



}
