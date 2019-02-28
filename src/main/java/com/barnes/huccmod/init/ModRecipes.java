package com.barnes.huccmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init() 
	{
		GameRegistry.addSmelting(ModItems.HUCC_INGOT, new ItemStack(ModItems.RON, 2), 69.0F);
		GameRegistry.addSmelting(ModItems.RON, new ItemStack(Items.DIAMOND, 2), 69.0F);
	}
}
