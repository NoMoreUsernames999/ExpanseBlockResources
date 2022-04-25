package expansedecorations.mod.init;

import java.util.ArrayList;
import java.util.List;

import expansedecorations.mod.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	//List of all blocks in mod.
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	//Register new block, to be called in block base and that block's separate class. 
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", 20.0f, 50.0f, 2, 1.0f, Material.IRON); 
	public static final Block BLOCK_DEPOSIT = new BlockBase("block_deposit", 0, 0, 0, 0, Material.ROCK); 
}