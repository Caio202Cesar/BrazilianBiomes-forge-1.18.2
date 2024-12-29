package net.caiocesarmods.brazilianbiomesmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AMAZON_RAINFOREST_TAB = new CreativeModeTab("amazon_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CUPUACU.get());
        }
    };

    public static final CreativeModeTab PAMPAS_TAB = new CreativeModeTab("pampas_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CUPUACU.get());
        }
    };

    public static final CreativeModeTab ATLANTIC_FOREST_TAB = new CreativeModeTab("atlantic_forest_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CAMBUCI.get());
        }
    };

    public static final CreativeModeTab CERRADO_TAB = new CreativeModeTab("cerrado_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WOLF_APPLE.get());
        }
    };

    public static final CreativeModeTab CAATINGA_TAB = new CreativeModeTab("caatinga_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.JUA_BERRIES.get());
        }
    };

    public static final CreativeModeTab RESTINGA_TAB = new CreativeModeTab("restinga_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PITANGA.get());
        }
    };
}
