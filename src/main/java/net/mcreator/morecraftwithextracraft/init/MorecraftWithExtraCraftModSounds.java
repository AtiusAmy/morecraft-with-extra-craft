
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecraftwithextracraft.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class MorecraftWithExtraCraftModSounds {
	public static SoundEvent TOKAYGECKOHURT = SoundEvent.createVariableRangeEvent(new ResourceLocation("morecraft_with_extra_craft", "tokaygeckohurt"));
	public static SoundEvent TOKAYGECKODEATH = SoundEvent.createVariableRangeEvent(new ResourceLocation("morecraft_with_extra_craft", "tokaygeckodeath"));
	public static SoundEvent TOKAYGECKOIDLE = SoundEvent.createVariableRangeEvent(new ResourceLocation("morecraft_with_extra_craft", "tokaygeckoidle"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("morecraft_with_extra_craft", "tokaygeckohurt"), TOKAYGECKOHURT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("morecraft_with_extra_craft", "tokaygeckodeath"), TOKAYGECKODEATH);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("morecraft_with_extra_craft", "tokaygeckoidle"), TOKAYGECKOIDLE);
	}
}
