
package info.coderqc.mc.bettermc.client.renderer;

public class BirdRenderer extends MobRenderer<BirdEntity, Modelbird<BirdEntity>> {

	public BirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbird(context.bakeLayer(Modelbird.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(BirdEntity entity) {
		return new ResourceLocation("bettermc:textures/bird_texture.png");
	}

}
