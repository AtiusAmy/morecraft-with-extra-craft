
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecraftwithextracraft.init;

import net.mcreator.morecraftwithextracraft.client.model.Modeltokay_gecko;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class MorecraftWithExtraCraftModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modeltokay_gecko.LAYER_LOCATION, Modeltokay_gecko::createBodyLayer);
	}
}
