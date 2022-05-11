
package info.coderqc.mc.bettermc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import info.coderqc.mc.bettermc.entity.BirdEntity;
import info.coderqc.mc.bettermc.client.model.Modelbird;

public class BirdRenderer extends MobRenderer<BirdEntity, Modelbird<BirdEntity>> {
	public BirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbird(context.bakeLayer(Modelbird.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BirdEntity entity) {
		return new ResourceLocation("bettermc:textures/bird_texture.png");
	}
}
