package com.barnes.huccmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RonBlock extends BlockBase 
{

	public RonBlock(String name, Material material) 
	{
		
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(0.5F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 1);
		
	}

}
