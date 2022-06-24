
package info.coderqc.mc.bettermc.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class ObsidianSwordItem extends SwordItem {
	public ObsidianSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2380;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OBSIDIAN));
			}
		},

				3, -3f,

				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}

}
