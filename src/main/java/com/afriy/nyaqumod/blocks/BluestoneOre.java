package com.afriy.nyaqumod.blocks;

import com.afriy.nyaqumod.Tabs.NyaquTab;
import com.afriy.nyaqumod.init.ModItems;
import com.afriy.nyaqumod.util.IHasModel;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;


public class BluestoneOre extends BlockBase implements IHasModel {
    public BluestoneOre(String name, Material material) {
        super(name,material);
        setCreativeTab(NyaquTab.BUILDING_BLOCKS);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe",2);

    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.BLUESTONE;
    }

    @Override
    public int quantityDropped(Random random) {
        int max = 3;
        int min = 2;
        return random.nextInt(max)+min;
    }
}
