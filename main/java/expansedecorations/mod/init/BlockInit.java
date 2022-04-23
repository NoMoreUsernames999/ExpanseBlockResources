package expansedecorations.mod.init;

import java.util.ArrayList;
import java.util.List;

import expansedecorations.mod.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	//List of all blocks in mod
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	//Register new block. Blocks of the same material can be in an array of same registry 
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);  
}
