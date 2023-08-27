
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecraftwithextracraft.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.morecraftwithextracraft.entity.TokayGeckoEntity;
import net.mcreator.morecraftwithextracraft.MorecraftWithExtraCraftMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class MorecraftWithExtraCraftModEntities {
	public static EntityType<TokayGeckoEntity> TOKAY_GECKO;

	public static void load() {
		TOKAY_GECKO = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(MorecraftWithExtraCraftMod.MODID, "tokay_gecko"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, TokayGeckoEntity::new).dimensions(new EntityDimensions(0.6f, 0.5f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		TokayGeckoEntity.init();
		FabricDefaultAttributeRegistry.register(TOKAY_GECKO, TokayGeckoEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
