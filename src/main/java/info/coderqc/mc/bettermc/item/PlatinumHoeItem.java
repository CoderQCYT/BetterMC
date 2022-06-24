
package info.coderqc.mc.bettermc.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PlatinumHoeItem extends HoeItem {
	public PlatinumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 660;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BettermcModItems.PLATINUM_INGOT.get()));
			}
		},

				0, -3f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}

}
