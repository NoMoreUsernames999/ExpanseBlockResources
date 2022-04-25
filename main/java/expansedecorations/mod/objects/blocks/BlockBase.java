package expansedecorations.mod.objects.blocks;

import expansedecorations.mod.Main;
import expansedecorations.mod.init.BlockInit;
import expansedecorations.mod.init.ItemInit;
import expansedecorations.mod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/*Create a new class for block base that extends the Minecraft block and implements our custom model render class, 
 *which is then used to set registry name, render, item render, etc. 
 *The declarations for public BlockBase set the base or default values. They can be overwritten in that block's 
 *class.
 *All of the values of BlockBase are passed for a block from the initialization of the block in BlockInit. 
 */

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, float hardness, float resistance, int harvestlevel, float lightLevel, Material material) {
		//Sets the values to be passed in BlockInit and declares what kind of values each variable is.  
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance); 
		setHarvestLevel(null, harvestlevel); 
		setLightLevel(lightLevel); 
		setCreativeTab(CreativeTabs.MATERIALS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));  
	} 

@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory"); 
	}
	
}
