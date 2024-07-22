package com.equus.toras_toystore.item;

import com.equus.toras_toystore.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TORASTOYSTORE_TAB = new CreativeModeTab("torastoystore") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.PLUSHFRONTIER.get());
        }
    };
}
