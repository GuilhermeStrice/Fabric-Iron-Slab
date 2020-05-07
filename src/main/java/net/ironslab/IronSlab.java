package net.ironslab;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class IronSlab implements ModInitializer
{
    public static final SlabBlock EXAMPLE_BLOCK = new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));

    @Override
    public void onInitialize()
    {
        Registry.register(Registry.BLOCK, new Identifier("ironslab", "iron_slab"), EXAMPLE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("ironslab", "iron_slab"), new BlockItem(EXAMPLE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}