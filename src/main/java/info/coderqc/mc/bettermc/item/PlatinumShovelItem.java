
package info.coderqc.mc.bettermc.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PlatinumShovelItem extends ShovelItem {
	public PlatinumShovelItem() {
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
				return Ingredient.of(new ItemStack(BettermcModItems.DELETED_MOD_ELEMENT.get()));
			}
		},

				1, -3f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}

}
