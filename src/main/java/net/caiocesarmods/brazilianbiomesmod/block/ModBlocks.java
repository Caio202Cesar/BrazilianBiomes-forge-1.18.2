package net.caiocesarmods.brazilianbiomesmod.block;

import net.caiocesarmods.brazilianbiomesmod.BrazilianBiomesMod;
import net.caiocesarmods.brazilianbiomesmod.item.ModCreativeModeTab;
import net.caiocesarmods.brazilianbiomesmod.item.ModItems;
import net.caiocesarmods.brazilianbiomesmod.world.feature.tree.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, BrazilianBiomesMod.MOD_ID);

    //Logs
    public static final RegistryObject<Block> BRAZILLIAN_SASSAFRAS_LOG = registerBlock("brazillian_sassafras_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> PARANA_PINE_LOG = registerBlock("parana_pine_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> IMBUIA_LOG = registerBlock("imbuia_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> YERBA_MATE_LOG = registerBlock("yerba_mate_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> FEIJOA_LOG = registerBlock("feijoa_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> EUGENIA_LOG = registerBlock("eugenia_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> CASHEW_LOG = registerBlock("cashew_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.RESTINGA_TAB);
    public static final RegistryObject<Block> MONKEY_CAJARANA_LOG = registerBlock("monkey_cajarana_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.RESTINGA_TAB);
    public static final RegistryObject<Block> MANGABA_LOG = registerBlock("mangaba_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.RESTINGA_TAB);
    public static final RegistryObject<Block> CECROPIA_LOG = registerBlock("cecropia_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);

    //Leaves
    public static final RegistryObject<Block> BRAZILLIAN_SASSAFRAS_LEAVES = registerBlock("brazillian_sassafras_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> PARANA_PINE_LEAVES = registerBlock("parana_pine_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> IMBUIA_LEAVES = registerBlock("imbuia_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> YERBA_MATE_LEAVES = registerBlock("yerba_mate_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> FEIJOA_LEAVES = registerBlock("feijoa_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> RIO_GRANDE_CHERRY_LEAVES = registerBlock("rio_grande_cherry_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> PITANGA_LEAVES = registerBlock("pitanga_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> BLACK_PITANGA_LEAVES = registerBlock("black_pitanga_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> CASHEW_LEAVES = registerBlock("cashew_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.RESTINGA_TAB);
    public static final RegistryObject<Block> MONKEY_CAJARANA_LEAVES = registerBlock("monkey_cajarana_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.RESTINGA_TAB);
    public static final RegistryObject<Block> MANGABA_LEAVES = registerBlock("mangaba_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.RESTINGA_TAB);
    public static final RegistryObject<Block> CECROPIA_LEAVES = registerBlock("cecropia_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.RESTINGA_TAB);

    //Sapling
    public static final RegistryObject<Block> BRAZILLIAN_SASSAFRAS_SAPLING = registerBlock("brazillian_sassafras_sapling",
            () -> new SaplingBlock(new BrazillianSassafrasGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> PARANA_PINE_SAPLING = registerBlock("parana_pine_sapling",
            () -> new SaplingBlock(new ParanaPineGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> IMBUIA_SAPLING = registerBlock("imbuia_sapling",
            () -> new SaplingBlock(new ImbuiaGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> YERBA_MATE_SAPLING = registerBlock("yerba_mate_sapling",
            () -> new SaplingBlock(new YerbaMateGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> FEIJOA_SAPLING = registerBlock("feijoa_sapling",
            () -> new SaplingBlock(new FeijoaGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> RIO_GRANDE_CHERRY_SAPLING = registerBlock("rio_grande_cherry_sapling",
            () -> new SaplingBlock(new RioGrandeCherryGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> PITANGA_SAPLING = registerBlock("pitanga_sapling",
            () -> new SaplingBlock(new PitangaGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> CASHEW_SAPLING = registerBlock("cashew_sapling",
            () -> new SaplingBlock(new CashewGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.RESTINGA_TAB);
    public static final RegistryObject<Block> MONKEY_CAJARANA_SAPLING = registerBlock("monkey_cajarana_sapling",
            () -> new SaplingBlock(new MonkeyCajaranaGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.RESTINGA_TAB);
    public static final RegistryObject<Block> MANGABA_SAPLING = registerBlock("mangaba_sapling",
            () -> new SaplingBlock(new MangabaGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.RESTINGA_TAB);
    public static final RegistryObject<Block> CECROPIA_SAPLING = registerBlock("cecropia_sapling",
            () -> new SaplingBlock(new CecropiaGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);

    //Plants


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
