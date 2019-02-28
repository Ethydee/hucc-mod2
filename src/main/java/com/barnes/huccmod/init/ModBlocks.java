package com.barnes.huccmod.init;

import java.util.ArrayList;
import java.util.List;

import com.barnes.huccmod.blocks.BlockBase;
import com.barnes.huccmod.blocks.RonBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RON_BLOCK = new RonBlock("ron_block", Material.IRON);
	public static final Block HUCC_BLOCK = new BlockBase("hucc_block", Material.IRON);
}
