package net.caiocesarmods.brazilianbiomesmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> ARAUCARIA_FOREST_LAURACEAE_PLACED = PlacementUtils.register("araucaria_lauraceae_placed",
            ModConfiguredFeatures.ARAUCARIA_FOREST_LAURACEAE, VegetationPlacements.treePlacement(PlacementUtils.countExtra(
                    10, 0.1F, 1)));
    public static final Holder<PlacedFeature> ARAUCARIA_FOREST_MYRTACEAE_PLACED = PlacementUtils.register("araucaria_myrtaceae_placed",
            ModConfiguredFeatures.ARAUCARIA_FOREST_MYRTACEAE, VegetationPlacements.treePlacement(PlacementUtils.countExtra(
                    3, 0.1F, 1)));
    public static final Holder<PlacedFeature> PARANA_PINES_PLACED = PlacementUtils.register("parana_pines_placed",
            ModConfiguredFeatures.PARANA_PINE_TREES, VegetationPlacements.treePlacement(PlacementUtils.countExtra(
                    10, 0.1F, 1)));
    public static final Holder<PlacedFeature> YERBA_MATE_TREES_PLACED = PlacementUtils.register("yerba_mate_trees_placed",
            ModConfiguredFeatures.YERBA_MATE_TREES, VegetationPlacements.treePlacement(PlacementUtils.countExtra(
                    6, 0.1F, 1)));
    public static final Holder<PlacedFeature> RESTINGA_VEGETATION_PLACED = PlacementUtils.register("restinga_vegetation_placed",
            ModConfiguredFeatures.RESTINGA_VEGETATION, VegetationPlacements.treePlacement(PlacementUtils.countExtra(
                    12, 0.1F, 1)));
}
