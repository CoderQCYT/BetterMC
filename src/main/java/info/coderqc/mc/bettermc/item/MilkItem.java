
package info.coderqc.mc.bettermc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import info.coderqc.mc.bettermc.init.BettermcModFluids;

public class MilkItem extends BucketItem {
	public MilkItem() {
		super(BettermcModFluids.MILK,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
