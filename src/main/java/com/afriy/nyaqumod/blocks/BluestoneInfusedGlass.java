package com.afriy.nyaqumod.blocks;
import com.afriy.nyaqumod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BluestoneInfusedGlass extends BlockNyaquGlass {
public BluestoneInfusedGlass(String name,Material materialIn, boolean ignoreSimilarity) {
        super(name,materialIn, ignoreSimilarity);
        this.setCreativeTab(Main.NyaquTab);
        setSoundType(SoundType.GLASS);
        setHardness(1.0F);
        setResistance(150.0F);
    }

    @Override
    public int quantityDropped(Random random)
    {
        return 1;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public net.minecraft.util.BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
    @Override
    public boolean isFullCube(IBlockState state)
    {
        return true;
    }
    @Override
    protected boolean canSilkHarvest()
    {
        return true;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }


    @Override
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        return super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    }

}
