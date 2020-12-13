package com.afriy.nyaqumod.items;

import com.afriy.nyaqumod.Main;
import com.afriy.nyaqumod.Tabs.NyaquTab;
import com.afriy.nyaqumod.init.ModItems;
import com.afriy.nyaqumod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        //setCreativeTab(CreativeTabs.MATERIALS);
        setCreativeTab(Main.NyaquTab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
