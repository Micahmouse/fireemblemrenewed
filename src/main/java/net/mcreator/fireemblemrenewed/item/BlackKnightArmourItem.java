
package net.mcreator.fireemblemrenewed.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fireemblemrenewed.init.FireEmblemRenewedModTabs;
import net.mcreator.fireemblemrenewed.init.FireEmblemRenewedModItems;

public abstract class BlackKnightArmourItem extends ArmorItem {
	public BlackKnightArmourItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 37;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 5, 10, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FireEmblemRenewedModItems.DOUBLESTEEL));
			}

			@Override
			public String getName() {
				return "black_knight_armour";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends BlackKnightArmourItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(FireEmblemRenewedModTabs.TAB_LEGENDARY_WEAPONS));
			setRegistryName("black_knight_armour_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fire_emblem_renewed:textures/models/armor/black_knight_armour_layer_1.png";
		}
	}

	public static class Chestplate extends BlackKnightArmourItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(FireEmblemRenewedModTabs.TAB_LEGENDARY_WEAPONS));
			setRegistryName("black_knight_armour_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fire_emblem_renewed:textures/models/armor/black_knight_armour_layer_1.png";
		}
	}

	public static class Leggings extends BlackKnightArmourItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(FireEmblemRenewedModTabs.TAB_LEGENDARY_WEAPONS));
			setRegistryName("black_knight_armour_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fire_emblem_renewed:textures/models/armor/black_knight_armour_layer_2.png";
		}
	}

	public static class Boots extends BlackKnightArmourItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(FireEmblemRenewedModTabs.TAB_LEGENDARY_WEAPONS));
			setRegistryName("black_knight_armour_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fire_emblem_renewed:textures/models/armor/black_knight_armour_layer_1.png";
		}
	}
}
