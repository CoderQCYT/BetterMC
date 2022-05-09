
package info.coderqc.mc.bettermc.enchantment;

public class PowerCurseEnchantment extends Enchantment {

	public PowerCurseEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public boolean isCurse() {
		return true;
	}

}
