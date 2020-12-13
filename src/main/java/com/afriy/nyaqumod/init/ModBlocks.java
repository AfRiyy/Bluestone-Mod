package com.afriy.nyaqumod.init;

import com.afriy.nyaqumod.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLUESTONE_ORE = new BluestoneOre("bluestone_ore", Material.ROCK);
    public static final Block BLUESTONE_BLOCK = new BluestoneBlock("bluestone_block",Material.IRON);
    public static final Block BLUESTONE_INFUSED_GLASS = new BluestoneInfusedGlass("bluestone_infused_glass",Material.GLASS,true);
}
