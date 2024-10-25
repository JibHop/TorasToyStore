package com.equus.toras_toystore.block;

import com.equus.toras_toystore.TorasToyStore;
import com.equus.toras_toystore.block.custom.*;
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

    public static final RegistryObject<Block> PLUSH_ASGARD = registerBlock("plush_asgard",
            () -> new PlushAsgard(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_ATLAS = registerBlock("plush_atlas",
            () -> new PlushAtlas(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_AVACADO = registerBlock("plush_avacado",
            () -> new PlushAvacado(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_BANDIT = registerBlock("plush_bandit",
            () -> new PlushBandit(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_BOO = registerBlock("plush_boo",
            () -> new PlushBoo(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_CALAMARI = registerBlock("plush_calamari",
            () -> new PlushCalamari(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_CALLIE = registerBlock("plush_callie",
            () -> new PlushCallie(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_CHIEF = registerBlock("plush_chief",
            () -> new PlushChief(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_DIORITE = registerBlock("plush_diorite",
            () -> new PlushDiorite(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_DRAGON = registerBlock("plush_dragon",
            () -> new PlushDragon(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_ECLIPSE = registerBlock("plush_eclipse",
            () -> new PlushEclipse(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_FLINT = registerBlock("plush_flint",
            () -> new PlushFlint(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_FRONTIER = registerBlock("plush_frontier",
            () -> new PlushFrontier(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_FUYU = registerBlock("plush_fuyu",
            () -> new PlushFuyu(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_GAMBIT = registerBlock("plush_gambit",
            () -> new PlushGambit(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_GRANITE = registerBlock("plush_granite",
            () -> new PlushGranite(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_GWYAR = registerBlock("plush_gwyar",
            () -> new PlushGwyar(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_HAWK = registerBlock("plush_hawk",
            () -> new PlushHawk(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_ICARUS = registerBlock("plush_icarus",
            () -> new PlushIcarus(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_JEAGER = registerBlock("plush_jeager",
            () -> new PlushJaeger(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_JOEY = registerBlock("plush_joey",
            () -> new PlushJoey(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_KETCH = registerBlock("plush_ketch",
            () -> new PlushKetch(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_KIZMET = registerBlock("plush_kizmet",
            () -> new PlushKizmet(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_LAKE = registerBlock("plush_lake",
            () -> new PlushLake(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_LUCKY = registerBlock("plush_lucky",
            () -> new PlushLucky(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_METEOR = registerBlock("plush_meteor",
            () -> new PlushMeteor(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_PHOENIX = registerBlock("plush_phoenix",
            () -> new PlushPhoenix(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_PICASSO = registerBlock("plush_picasso",
            () -> new PlushPicasso(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_POND = registerBlock("plush_pond",
            () -> new PlushPond(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_PRINCE = registerBlock("plush_prince",
            () -> new PlushPrince(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_PUPPET = registerBlock("plush_puppet",
            () -> new PlushPuppet(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_SOLSTICE = registerBlock("plush_solstice",
            () -> new PlushSolstice(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_SPIRIT = registerBlock("plush_spirit",
            () -> new PlushSpirit(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_TOBY = registerBlock("plush_toby",
            () -> new PlushToby(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_TOFU = registerBlock("plush_tofu",
            () -> new PlushTofu(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_TOPTHORN = registerBlock("plush_topthorn",
            () -> new PlushTopThorn(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_TORA = registerBlock("plush_tora",
            () -> new PlushTora(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_YODA = registerBlock("plush_yoda",
            () -> new PlushYoda(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_YUUKI = registerBlock("plush_yuuki",
            () -> new PlushYuuki(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_ZENOS = registerBlock("plush_zenos",
            () -> new PlushZenos(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_ZEPHYRUS = registerBlock("plush_zephyrus",
            () -> new PlushZephyrus(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);
    public static final RegistryObject<Block> PLUSH_ZERO = registerBlock("plush_zero",
            () -> new PlushZero(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.TORAS_TOYSTORE);



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
