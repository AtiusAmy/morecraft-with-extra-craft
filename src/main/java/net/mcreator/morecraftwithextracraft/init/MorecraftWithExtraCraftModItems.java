
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecraftwithextracraft.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.morecraftwithextracraft.item.TokayGeckotailItem;
import net.mcreator.morecraftwithextracraft.item.TokayGeckoleatherItem;
import net.mcreator.morecraftwithextracraft.item.TokayGeckoWhipItem;
import net.mcreator.morecraftwithextracraft.item.RawsilverfishItem;
import net.mcreator.morecraftwithextracraft.item.RawTokayGeckoItem;
import net.mcreator.morecraftwithextracraft.item.CookedTokayGeckoMeatItem;
import net.mcreator.morecraftwithextracraft.MorecraftWithExtraCraftMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class MorecraftWithExtraCraftModItems {
	public static Item RAW_TOKAY_GECKO;
	public static Item RAWSILVERFISH;
	public static Item TOKAY_GECKOTAIL;
	public static Item TOKAY_GECKOLEATHER;
	public static Item COOKED_TOKAY_GECKO_MEAT;
	public static Item TOKAY_GECKO_WHIP;
	public static Item TOKAY_GECKO_SPAWN_EGG;

	public static void load() {
		RAW_TOKAY_GECKO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MorecraftWithExtraCraftMod.MODID, "raw_tokay_gecko"), new RawTokayGeckoItem());
		RAWSILVERFISH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MorecraftWithExtraCraftMod.MODID, "rawsilverfish"), new RawsilverfishItem());
		TOKAY_GECKOTAIL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MorecraftWithExtraCraftMod.MODID, "tokay_geckotail"), new TokayGeckotailItem());
		TOKAY_GECKOLEATHER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MorecraftWithExtraCraftMod.MODID, "tokay_geckoleather"), new TokayGeckoleatherItem());
		COOKED_TOKAY_GECKO_MEAT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MorecraftWithExtraCraftMod.MODID, "cooked_tokay_gecko_meat"), new CookedTokayGeckoMeatItem());
		TOKAY_GECKO_WHIP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MorecraftWithExtraCraftMod.MODID, "tokay_gecko_whip"), new TokayGeckoWhipItem());
		TOKAY_GECKO_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MorecraftWithExtraCraftMod.MODID, "tokay_gecko_spawn_egg"),
				new SpawnEggItem(MorecraftWithExtraCraftModEntities.TOKAY_GECKO, -1, -39424, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(TOKAY_GECKO_SPAWN_EGG));
	}
}
