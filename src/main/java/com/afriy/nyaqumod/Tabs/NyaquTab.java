package com.afriy.nyaqumod.Tabs;

import com.afriy.nyaqumod.blocks.BlockBase;
import com.afriy.nyaqumod.init.ModBlocks;
import com.afriy.nyaqumod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class NyaquTab extends CreativeTabs {
    public NyaquTab(String name) {
        super("NyaqumodTab");
        this.setBackgroundImageName("items.png");

    }
    @Override
    public boolean hasSearchBar() {
        return true;
    }
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.BLUESTONE);
    }
}
