package net.caiocesarmods.brazilianbiomesmod.world.biomes;

import net.caiocesarmods.brazilianbiomesmod.BrazilianBiomesMod;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.SurfaceSystem;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AraucariaPlateauBiome {
    public static final DeferredRegister<Biome> BIOMES
            = DeferredRegister.create(ForgeRegistries.BIOMES, BrazilianBiomesMod.MOD_ID);

    public static final RegistryObject<Biome> ARAUCARIA_PLATEAU = BIOMES.register("araucaria_plateau",
            () -> makeAraucariaPlateauBiome(() -> Biome.BiomeBuilder, 0.4f, 0.2f));

    private static Biome makeAraucariaPlateauBiome(final )




    return (new Biome.ClimateSettings =

    public static void register(IEventBus eventBus) {
        BIOMES.register(eventBus);
    }

}
