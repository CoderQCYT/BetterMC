
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import info.coderqc.mc.bettermc.client.renderer.BirdRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BettermcModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BettermcModEntities.POWER_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BettermcModEntities.BIRD.get(), BirdRenderer::new);
	}
}
