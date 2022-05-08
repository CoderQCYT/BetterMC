
package info.coderqc.mc.bettermc.item;

import net.minecraft.network.chat.Component;

public class MilkItem extends BucketItem {

	public MilkItem() {
		super(BettermcModFluids.MILK,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}

}
