package expansedecorations.mod.init;

import java.util.ArrayList;
import java.util.List;
import expansedecorations.mod.objects.items.ItemBase;
import net.minecraft.item.Item;

public class ItemInit {
	
	//List of all items in the mod 
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Register new item. Similar items can be in same registry  
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper"); 
}
