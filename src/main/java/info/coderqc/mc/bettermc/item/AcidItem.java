
package info.coderqc.mc.bettermc.item;

import net.minecraft.network.chat.Component;

public class AcidItem extends BucketItem {

	public AcidItem() {
		super(BettermcModFluids.ACID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}

}
