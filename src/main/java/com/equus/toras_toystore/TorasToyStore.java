package com.equus.toras_toystore;

import com.equus.toras_toystore.block.ModBlocks;
import com.equus.toras_toystore.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TorasToyStore.MOD_ID)
public class TorasToyStore
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "toras_ts";

    public TorasToyStore() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FRONTIER_BLOCK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_ASGARD.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_ATLAS.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_AVACADO.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_BANDIT.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_BOO.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_CALAMARI.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_CALLIE.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_CHIEF.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_DIORITE.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_DRAGON.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_ECLIPSE.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_FLINT.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_FRONTIER.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_FUYU.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_GAMBIT.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_GRANITE.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_GWYAR.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_HAWK.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_ICARUS.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_JEAGER.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_JOEY.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_KETCH.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_KIZMET.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_LAKE.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_LUCKY.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_METEOR.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_PHOENIX.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_PICASSO.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_POND.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_PRINCE.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_PUPPET.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_SOLSTICE.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_SPIRIT.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_TOBY.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_TOFU.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_TOPTHORN.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_TORA.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_YODA.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_YUUKI.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_ZEPHYRUS.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSH_ZERO.get(), RenderType.solid());
    }



    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
