
package net.mcreator.morecraftwithextracraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.food.FoodProperties;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class CookedTokayGeckoMeatItem extends Item {
	public CookedTokayGeckoMeatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(7.2f)

				.build()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}