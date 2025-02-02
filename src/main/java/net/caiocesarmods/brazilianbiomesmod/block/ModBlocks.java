package net.caiocesarmods.brazilianbiomesmod.block;

import net.caiocesarmods.brazilianbiomesmod.BrazilianBiomesMod;
import net.caiocesarmods.brazilianbiomesmod.item.ModCreativeModeTab;
import net.caiocesarmods.brazilianbiomesmod.item.ModItems;
import net.caiocesarmods.brazilianbiomesmod.world.feature.tree.BrazillianSassafrasGrower;
import net.caiocesarmods.brazilianbiomesmod.world.feature.tree.ImbuiaGrower;
import net.caiocesarmods.brazilianbiomesmod.world.feature.tree.ParanaPineGrower;
import net.caiocesarmods.brazilianbiomesmod.world.feature.tree.YerbaMateGrower;
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

    //Leaves
    public static final RegistryObject<Block> BRAZILLIAN_SASSAFRAS_LEAVES = registerBlock("brazillian_sassafras_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> PARANA_PINE_LEAVES = registerBlock("parana_pine_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> IMBUIA_LEAVES = registerBlock("imbuia_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> YERBA_MATE_LEAVES = registerBlock("yerba_mate_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> FEIJOA_LEAVES = registerBlock("feijoa_leaves",
            () -> new ModLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);

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
