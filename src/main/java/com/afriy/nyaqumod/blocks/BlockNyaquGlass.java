package com.afriy.nyaqumod.blocks;

import com.afriy.nyaqumod.Main;
import com.afriy.nyaqumod.init.ModBlocks;
import com.afriy.nyaqumod.init.ModItems;
import com.afriy.nyaqumod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockNyaquGlass extends BlockGlass implements IHasModel {
        public BlockNyaquGlass(String name, Material material, boolean ignoreSimilarity)
        {
            super(material,ignoreSimilarity);

            setUnlocalizedName(name);
            setRegistryName(name);
            setCreativeTab(Main.NyaquTab);

            ModBlocks.BLOCKS.add(this);
            ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        }

        @Override
        public void registerModels()
        {
            Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "normal");
        }
}
