package net.caiocesarmods.brazilianbiomesmod.world.biomes;

import net.caiocesarmods.brazilianbiomesmod.world.feature.ModDefaultFeatures;
import net.minecraft.core.Holder
import net.caiocesarmods.brazilianbiomesmod.BrazilianBiomesMod;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBiomes {
    public static final DeferredRegister<Biome> BIOMES
            = DeferredRegister.create(ForgeRegistries.BIOMES, BrazilianBiomesMod.MOD_ID);

    public static void addDefaultOverworldGeneration(BiomeGenerationSettings.Builder generationSettings) {
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
    }

    //Araucaria Plateau
    public static Biome araucariaPlateau(Holder<PlacedFeature> placedFeatureHolder, Holder<ConfiguredWorldCarver<?>> carverHolder) {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder();
        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder();

        addDefaultOverworldGeneration(generationSettings);
        BiomeDefaultFeatures.addDefaultGrass(generationSettings);
        BiomeDefaultFeatures.addExtraEmeralds(generationSettings);
        BiomeDefaultFeatures.addJungleGrass(generationSettings);
        BiomeDefaultFeatures.addFerns(generationSettings);
        BiomeDefaultFeatures.addJungleVines(generationSettings);
        BiomeDefaultFeatures.addDefaultMushrooms(generationSettings);
        BiomeDefaultFeatures.addMossyStoneBlock(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addFossilDecoration(generationSettings);
        BiomeDefaultFeatures.addDefaultCrystalFormations(generationSettings);
        ModDefaultFeatures.addAraucariaForestLauraceae(generationSettings);
        ModDefaultFeatures.addAraucariaForestMyrtaceae(generationSettings);
        ModDefaultFeatures.addParanaPines(generationSettings);
        ModDefaultFeatures.addYerbaMateTrees(generationSettings);

        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.BAT, 1, 2, 2));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.OCELOT, 1, 2, 2));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PARROT, 5, 4, 7));

        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.8F).downfall(1.0F)
                .specialEffects((new BiomeSpecialEffects.Builder()).waterColor(993300).waterFogColor(993300).fogColor(14807295)
                        .skyColor(12966647).foliageColorOverride(8293460).grassColorOverride(8762696)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build()).build();
    }

    //Restinga

    public static void register(IEventBus eventBus) {
        BIOMES.register(eventBus);
    }

}
