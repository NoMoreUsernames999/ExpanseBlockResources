package expansedecorations.mod.util.handlers;

import expansedecorations.mod.init.BlockInit;
import expansedecorations.mod.init.ItemInit;
import expansedecorations.mod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

//Will look for all event bus subscribers when loading. Does not need to be referenced in main 
@EventBusSubscriber 
public class RegistryHandler {
	
@SubscribeEvent 
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
	
		//Register all items inside of item array
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0])); 
	} 

@SubscribeEvent 
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {

	//Register all blocks inside of block array
	event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0])); 
	} 
	
@SubscribeEvent 
//Register all models until finished 
	public static void onModelRegister(ModelRegistryEvent event) {
		
		for (Item item : ItemInit.ITEMS) {
			
			if (item instanceof IHasModel) {
				
				((IHasModel)item).registerModels();  
			}
		}
		
		for (Block block : BlockInit.BLOCKS) {
			
			if (block instanceof IHasModel) {
				
				((IHasModel)block).registerModels();  
			}
		}
	}

	public static void InitRegistries() {
		
		SoundsHandler.registerSounds(); 
	}
}
