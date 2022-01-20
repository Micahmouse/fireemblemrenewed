
package net.mcreator.fireemblemrenewed.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.fireemblemrenewed.init.FireEmblemRenewedModTabs;

public class ThunderelementItem extends Item {
	public ThunderelementItem() {
		super(new Item.Properties().tab(FireEmblemRenewedModTabs.TAB_TOMES).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("thunderelement");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
