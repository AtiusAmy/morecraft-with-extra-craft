package net.mcreator.morecraftwithextracraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.morecraftwithextracraft.entity.TokayGeckoEntity;
import net.mcreator.morecraftwithextracraft.client.model.Modeltokay_gecko;

public class TokayGeckoRenderer extends MobRenderer<TokayGeckoEntity, Modeltokay_gecko<TokayGeckoEntity>> {
	public TokayGeckoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltokay_gecko(context.bakeLayer(Modeltokay_gecko.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TokayGeckoEntity entity) {
		return new ResourceLocation("morecraft_with_extra_craft:textures/entities/texture2.png");
	}
}
