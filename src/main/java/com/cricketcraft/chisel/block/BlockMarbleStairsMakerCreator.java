package com.cricketcraft.chisel.block;

import net.minecraft.block.Block;

import com.cricketcraft.chisel.carving.CarvableHelper;

public interface BlockMarbleStairsMakerCreator {

	public BlockCarvableStairs create(Block block, int meta, CarvableHelper helper);
}
