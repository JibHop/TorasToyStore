package com.equus.toras_toystore.block;

import com.equus.toras_toystore.TorasToyStore;
import com.equus.toras_toystore.block.custom.PlushGwyar;
import com.equus.toras_toystore.block.custom.PlushTora;
import com.equus.toras_toystore.block.custom.PlushZero;
import com.equus.toras_toystore.item.ModCreativeModeTab;
import com.equus.toras_toystore.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TorasToyStore.MOD_ID);

    public static final RegistryObject<Block> FRONTIER_BLOCK = registerBlock("frontier_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);

    public static final RegistryObject<Block> PLUSH_TORA = registerBlock("plush_tora",
            () -> new PlushTora(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_ZERO = registerBlock("plush_zero",
            () -> new PlushZero(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_GWYAR = registerBlock("plush_gwyar",
            () -> new PlushGwyar(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
