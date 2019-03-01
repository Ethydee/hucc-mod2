package com.barnes.huccmod.init;

import java.util.ArrayList;
import java.util.List;

import com.barnes.huccmod.Items.ItemBase;
import com.barnes.huccmod.Items.Armor.ArmorBase;
import com.barnes.huccmod.Items.tools.ToolAxe;
import com.barnes.huccmod.Items.tools.ToolHoe;
import com.barnes.huccmod.Items.tools.ToolPickaxe;
import com.barnes.huccmod.Items.tools.ToolSpade;
import com.barnes.huccmod.Items.tools.ToolSword;
import com.barnes.huccmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Materials
	public static final ToolMaterial MATERIAL_HUCC = EnumHelper.addToolMaterial("material_hucc", 3, 2061, 12.0F, 3.0F, 22);
	public static final ArmorMaterial ARMOR_MATERIAL_HUCC = EnumHelper.addArmorMaterial("armor_material_hucc", Reference.MODID + ":hucc", 15, 
			new int[] {15, 15, 15, 15}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Items
	public static final Item RON = new ItemBase("ron");
	public static final Item HUCC_INGOT = new ItemBase("hucc_ingot");
	
	//Tools
	public static final ItemSword HUCC_SWORD = new ToolSword("hucc_sword", MATERIAL_HUCC);
	public static final ItemSpade HUCC_SHOVEL = new ToolSpade("hucc_shovel", MATERIAL_HUCC);
	public static final ItemPickaxe HUCC_PICKAXE = new ToolPickaxe("hucc_pickaxe", MATERIAL_HUCC);
	public static final ItemAxe HUCC_AXE = new ToolAxe("hucc_axe", MATERIAL_HUCC);
	public static final ItemHoe HUCC_HOE = new ToolHoe("hucc_hoe", MATERIAL_HUCC);
	
	//armor
	public static final Item HUCC_HELMET = new ArmorBase("hucc_helmet", ARMOR_MATERIAL_HUCC, 1, EntityEquipmentSlot.HEAD);
	public static final Item HUCC_CHESTPLATE = new ArmorBase("hucc_chestplate", ARMOR_MATERIAL_HUCC, 1, EntityEquipmentSlot.CHEST);
	public static final Item HUCC_LEGGINGS = new ArmorBase("hucc_leggings", ARMOR_MATERIAL_HUCC, 2, EntityEquipmentSlot.LEGS);
	public static final Item HUCC_BOOTS = new ArmorBase("hucc_boots", ARMOR_MATERIAL_HUCC, 1, EntityEquipmentSlot.FEET);
}
