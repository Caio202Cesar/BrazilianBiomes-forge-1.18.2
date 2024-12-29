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
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.PAMPAS_TAB);
    public static final RegistryObject<Block> ALGARROBILLO_LOG = registerBlock("algarrobillo_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.PAMPAS_TAB);
    public static final RegistryObject<Block> CAVEN_THORN_LOG = registerBlock("caven_thorn_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.PAMPAS_TAB);
    public static final RegistryObject<Block> COCKSPUR_CORAL_LOG = registerBlock("cockspur_coral_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.PAMPAS_TAB);
    public static final RegistryObject<Block> WOLF_APPLE_LOG = registerBlock("wolf_apple_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.CERRADO_TAB);
    public static final RegistryObject<Block> BLACK_SUCUPIRA_LOG = registerBlock("black_sucupira_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.CERRADO_TAB);
    public static final RegistryObject<Block> SILK_FLOSS_LOG = registerBlock("silk_floss_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.CERRADO_TAB);
    public static final RegistryObject<Block> CAMU_CAMU_LOG = registerBlock("camu_camu_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
    public static final RegistryObject<Block> BACURI_LOG = registerBlock("bacuri_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
    public static final RegistryObject<Block> SHARINGA_LOG = registerBlock("sharinga_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
    public static final RegistryObject<Block> BRAZILNUT_LOG = registerBlock("brazilnut_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
    public static final RegistryObject<Block> LOPHANTERA_LOG = registerBlock("lophantera_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
    public static final RegistryObject<Block> BALSA_LOG = registerBlock("balsa_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
    public static final RegistryObject<Block> KAPOK_LOG = registerBlock("kapok_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.AMAZON_RAINFOREST_TAB);
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
    public static final RegistryObject<Block> SAPUCAIA_LOG = registerBlock("sapucaia_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> BRAZILLIAN_ROSEWOOD_LOG = registerBlock("brazillian_rosewood_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> JEQUITIBA_LOG = registerBlock("jequitiba_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> PINK_PEROBA_LOG = registerBlock("pink_peroba_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> EUGENIA_LOG = registerBlock("eugenia_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> IPE_LOG = registerBlock("ipe_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> MANACA_DA_SERRA_LOG = registerBlock("manaca_da_serra_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> CECROPIA_LOG = registerBlock("cecropia_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> CAMBUCI_LOG = registerBlock("cambuci_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> BRAZILWOOD_LOG = registerBlock("brazilwood_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ATLANTIC_FOREST_TAB);
    public static final RegistryObject<Block> JUA_LOG = registerBlock("jua_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.CAATINGA_TAB);
    public static final RegistryObject<Block> BLACK_JUREMA_LOG = registerBlock("black_jurema_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.CAATINGA_TAB);
    public static final RegistryObject<Block> UMBU_LOG = registerBlock("umbu_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.CAATINGA_TAB);
    public static final RegistryObject<Block> CASHEW_LOG = registerBlock("cashew_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.RESTINGA_TAB);
    public static final RegistryObject<Block> MANGABA_LOG = registerBlock("mangaba_log",
            () -> new ModLogs(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.RESTINGA_TAB);



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
