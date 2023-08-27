
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecraftwithextracraft.init;

import net.mcreator.morecraftwithextracraft.client.renderer.TokayGeckoRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class MorecraftWithExtraCraftModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(MorecraftWithExtraCraftModEntities.TOKAY_GECKO, TokayGeckoRenderer::new);
	}
}
