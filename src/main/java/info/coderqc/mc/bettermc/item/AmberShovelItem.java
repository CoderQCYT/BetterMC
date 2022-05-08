
package info.coderqc.mc.bettermc.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import info.coderqc.mc.bettermc.init.BettermcModItems;

public class AmberShovelItem extends ShovelItem {
	public AmberShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 342;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BettermcModItems.AMBER.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
