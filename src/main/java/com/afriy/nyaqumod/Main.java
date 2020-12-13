package com.afriy.nyaqumod;

import com.afriy.nyaqumod.Tabs.NyaquTab;
import com.afriy.nyaqumod.proxy.CommonProxy;
import com.afriy.nyaqumod.util.Reference;

import com.afriy.nyaqumod.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(useMetadata=true,modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs NyaquTab = new NyaquTab("NyaquTab");

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new ModWorldGen(),2);
    }

    @EventHandler
    public static void PreInit(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public static void PreInit(FMLPostInitializationEvent event)
    {

    }

}
