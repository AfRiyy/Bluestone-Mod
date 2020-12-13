package com.afriy.nyaqumod.blocks;

import com.afriy.nyaqumod.Tabs.NyaquTab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BluestoneBlock extends BlockBase {

    public BluestoneBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(3.0F);
        setResistance(500.0F);
        setHarvestLevel("pickaxe",2);
        setLightLevel(5.0F);
        //setLightOpacity(1);
        //setBlockUnbreakable();

    }
}
