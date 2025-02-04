package net.caiocesarmods.brazilianbiomesmod.world.feature;

import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;

public class ModDefaultFeatures extends BiomeDefaultFeatures {
    public static void addAraucariaForestLauraceae(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.ARAUCARIA_FOREST_LAURACEAE_PLACED);
    }
    public static void addAraucariaForestMyrtaceae(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.ARAUCARIA_FOREST_MYRTACEAE_PLACED);
    }
    public static void addParanaPines(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.PARANA_PINES_PLACED);
    }
    public static void addYerbaMateTrees(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.YERBA_MATE_TREES_PLACED);
    }
    public static void addRestingaVegetation(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.RESTINGA_VEGETATION_PLACED);
    }
}
