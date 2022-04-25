package expansedecorations.mod.util.handlers;

import expansedecorations.mod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/*Must use important static to declare variables to be used by registerSounds. Each sound file to register must be imported.
 * The only part that needs to be changed is the variable at the end, which corresponds to the variable from the 
 * SoundsEvents class. 
 */
import static expansedecorations.mod.api.sounds.SoundsEvents.VOICE_PDA_TEST1;
import static expansedecorations.mod.api.sounds.SoundsEvents.VOICE_PDA_TEST2;


public class SoundsHandler {
	
	/* Register the sound resource location to the corresponding sound variable. 
	 * This is the ogg file's path in src/main/resources. Can have multiple folder groups for different sounds
	 * in the assets.<MODID>.sounds folder. These are placed in the assets/<MODID>/sounds/voices/pda folder. 
	 * You could make a sound effects folder for files to go in sounds/effects for example. 
	 * The last part of the below variable is the file name. So an explosion sound effect with the file name explosion.ogg 
	 * in the effects folder would be declared as "effects.explosion". 
	*/
	public static void registerSounds() {
		
		VOICE_PDA_TEST1 = registerSound("voice.pda.test1"); 
		VOICE_PDA_TEST2 = registerSound("voice.pda.test2"); 
	}
	
	//Register the sounds to forge. Remains unchanged. 
	private static SoundEvent registerSound(String name) {
		
		ResourceLocation location = new ResourceLocation(Reference.MODID, name); 
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event); 
		return event;
	}

}
