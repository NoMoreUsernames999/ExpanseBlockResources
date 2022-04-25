package expansedecorations.mod.objects.blocks;


public class BlockCopper extends BlockBase { 
	
	public BlockCopper(String name, float hardness, float resistance, int harvestlevel, float lightLevel) {
		
		//Pulls the set values from BlockInit and passes additional values.
		super(name, hardness, resistance, harvestlevel, lightLevel, null); 
		setHarvestLevel("pickaxe", harvestlevel);
	}
	
}

