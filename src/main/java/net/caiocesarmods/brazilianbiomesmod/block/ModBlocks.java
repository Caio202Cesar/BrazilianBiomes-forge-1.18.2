package net.caiocesarmods.brazilianbiomesmod.block;

import net.caiocesarmods.brazilianbiomesmod.BrazilianBiomesMod;
import net.caiocesarmods.brazilianbiomesmod.item.ModCreativeModeTab;
import net.caiocesarmods.brazilianbiomesmod.item.ModItems;
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
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, BrazilianBiomesMod.MOD_ID);

    //Logs
    public static final RegistryObject<Block> SCHINUS_LOG = registerBlock("schinus_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.PAMPAS_TAB);
    public static final RegistryObject<Block> ALGARROBILLO_LOG = registerBlock("algarrobillo_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.PAMPAS_TAB);
    public static final RegistryObject<Block> CAVEN_THORN_LOG = registerBlock("caven_thorn_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.PAMPAS_TAB);
    public static final RegistryObject<Block> COCKSPUR_CORAL_LOG = registerBlock("cockspur_coral_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.PAMPAS_TAB);
    public static final RegistryObject<Block> WOLF_APPLE_LOG = registerBlock("wolf_apple_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.CERRADO_TAB);
    public static final RegistryObject<Block> BLACK_SUCUPIRA_LOG = registerBlock("black_sucupira_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.CERRADO_TAB);
    public static final RegistryObject<Block> SILK_FLOSS_LOG = registerBlock("silk_floss_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.CERRADO_TAB);
    public static final RegistryObject<Block> CAMU_CAMU_LOG = registerBlock("camu_camu_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
    public static final RegistryObject<Block> BACURI_LOG = registerBlock("bacuri_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
    public static final RegistryObject<Block> SHARINGA_LOG = registerBlock("sharinga_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
    public static final RegistryObject<Block> BRAZILNUT_LOG = registerBlock("brazilnut_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
    public static final RegistryObject<Block> LOPHANTERA_LOG = registerBlock("lophantera_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
    public static final RegistryObject<Block> BALSA_LOG = registerBlock("balsa_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
    public static final RegistryObject<Block> KAPOK_LOG = registerBlock("kapok_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).noOcclusion()), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);

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
