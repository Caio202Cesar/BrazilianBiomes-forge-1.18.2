package net.caiocesarmods.brazilianbiomesmod.world.feature;

import com.google.common.collect.ImmutableList;
import net.caiocesarmods.brazilianbiomesmod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.FeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeatures {

    ///Trees
    //Parana Pine
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PARANA_PINE_TREE =
            FeatureUtils.register("parana_pine_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.PARANA_PINE_LOG.get()),
                    new GiantTrunkPlacer(13, 2, 14),
                    BlockStateProvider.simple(ModBlocks.PARANA_PINE_LEAVES.get()),
                    new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                    new TwoLayersFeatureSize(1, 1, 2))
                    .decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> YOUNG_PARANA_PINE_TREE =
            FeatureUtils.register("young_parana_pine_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.PARANA_PINE_LOG.get()),
                    new StraightTrunkPlacer(6, 2, 14),
                    BlockStateProvider.simple(ModBlocks.PARANA_PINE_LEAVES.get()),
                    new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)),
                    new TwoLayersFeatureSize(1, 1, 2))
                    .decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());

    public static final Holder<PlacedFeature> PARANA_PINE_CHECKED = PlacementUtils.register("parana_pine_checked", PARANA_PINE_TREE,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.PARANA_PINE_SAPLING.get()));
    public static final Holder<PlacedFeature> YOUNG_PARANA_PINE_CHECKED = PlacementUtils.register("young_parana_pine_checked",
            YOUNG_PARANA_PINE_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.PARANA_PINE_SAPLING.get()));

    //Imbuia
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> IMBUIA_TREE =
            FeatureUtils.register("imbuia_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.IMBUIA_LOG.get()),
                    new StraightTrunkPlacer(4, 2, 0),
                    BlockStateProvider.simple(ModBlocks.IMBUIA_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> IMBUIA_FANCY_TREE =
            FeatureUtils.register("fancy_imbuia_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.IMBUIA_LOG.get()),
                    new FancyTrunkPlacer(3, 11, 0),
                    BlockStateProvider.simple(ModBlocks.IMBUIA_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

    public static final Holder<PlacedFeature> IMBUIA_CHECKED = PlacementUtils.register("imbuia_checked", IMBUIA_TREE,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.IMBUIA_SAPLING.get()));
    public static final Holder<PlacedFeature> FANCY_IMBUIA_CHECKED = PlacementUtils.register("fancy_imbuia_checked",
            IMBUIA_FANCY_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.IMBUIA_SAPLING.get()));

    //Brazillian Sassafras
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> BRAZILLIAN_SASSAFRAS_TREE =
            FeatureUtils.register("brazillian_sassafras_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.BRAZILLIAN_SASSAFRAS_LOG.get()),
                    new StraightTrunkPlacer(4, 6, 0),
                    BlockStateProvider.simple(ModBlocks.BRAZILLIAN_SASSAFRAS_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> BRAZILLIAN_SASSAFRAS_FANCY_TREE =
            FeatureUtils.register("fancy_brazillian_sassafras_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.BRAZILLIAN_SASSAFRAS_LOG.get()),
                    new FancyTrunkPlacer(3, 11, 0),
                    BlockStateProvider.simple(ModBlocks.BRAZILLIAN_SASSAFRAS_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

    public static final Holder<PlacedFeature> BRAZILLIAN_SASSAFRAS_CHECKED = PlacementUtils.register("brazillian_sassafras_checked",
            BRAZILLIAN_SASSAFRAS_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.BRAZILLIAN_SASSAFRAS_SAPLING.get()));
    public static final Holder<PlacedFeature> FANCY_BRAZILLIAN_SASSAFRAS_CHECKED = PlacementUtils.register("fancy_brazillian_sassafras_checked",
            BRAZILLIAN_SASSAFRAS_FANCY_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.BRAZILLIAN_SASSAFRAS_SAPLING.get()));

    //Yerba Mate
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> YERBA_MATE_TREE =
            FeatureUtils.register("yerba_mate_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.YERBA_MATE_LOG.get()),
                    new StraightTrunkPlacer(4, 2, 0),
                    BlockStateProvider.simple(ModBlocks.YERBA_MATE_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> YERBA_MATE_FANCY_TREE =
            FeatureUtils.register("fancy_yerba_mate_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.YERBA_MATE_LOG.get()),
                    new FancyTrunkPlacer(3, 11, 0),
                    BlockStateProvider.simple(ModBlocks.YERBA_MATE_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

    public static final Holder<PlacedFeature> YERBA_MATE_CHECKED = PlacementUtils.register("yerba_mate_checked", YERBA_MATE_TREE,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.YERBA_MATE_SAPLING.get()));
    public static final Holder<PlacedFeature> FANCY_YERBA_MATE_CHECKED = PlacementUtils.register("fancy_yerba_mate_checked",
            YERBA_MATE_FANCY_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.YERBA_MATE_SAPLING.get()));

    //Feijoa
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FEIJOA_SHRUB =
            FeatureUtils.register("feijoa_shrub", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.FEIJOA_LOG.get()),
                    new StraightTrunkPlacer(2, 1, 0),
                    BlockStateProvider.simple(ModBlocks.FEIJOA_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                    new TwoLayersFeatureSize(1, 0, 1)).build());

    public static final Holder<PlacedFeature> FEIJOA_CHECKED = PlacementUtils.register("feijoa_checked", FEIJOA_SHRUB,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.FEIJOA_SAPLING.get()));

    //Rio Grande Cherry
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> RIO_GRANDE_CHERRY_TREE =
            FeatureUtils.register("rio_grande_cherry_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.EUGENIA_LOG.get()),
                    new StraightTrunkPlacer(4, 6, 0),
                    BlockStateProvider.simple(ModBlocks.RIO_GRANDE_CHERRY_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> RIO_GRANDE_CHERRY_FANCY_TREE =
            FeatureUtils.register("fancy_rio_grande_cherry_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.EUGENIA_LOG.get()),
                    new FancyTrunkPlacer(3, 11, 0),
                    BlockStateProvider.simple(ModBlocks.RIO_GRANDE_CHERRY_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

    public static final Holder<PlacedFeature> RIO_GRANDE_CHERRY_CHECKED = PlacementUtils.register("rio_grande_cherry_checked",
            RIO_GRANDE_CHERRY_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.RIO_GRANDE_CHERRY_SAPLING.get()));
    public static final Holder<PlacedFeature> FANCY_RIO_GRANDE_CHERRY_CHECKED = PlacementUtils.register("fancy_rio_grande_cherry_checked",
            RIO_GRANDE_CHERRY_FANCY_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.RIO_GRANDE_CHERRY_SAPLING.get()));

    //Pitanga
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PITANGA_TREE =
            FeatureUtils.register("pitanga_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.EUGENIA_LOG.get()),
                    new StraightTrunkPlacer(4, 6, 0),
                    BlockStateProvider.simple(ModBlocks.PITANGA_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> BLACK_PITANGA_TREE =
            FeatureUtils.register("black_pitanga_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.EUGENIA_LOG.get()),
                    new StraightTrunkPlacer(4, 6, 0),
                    BlockStateProvider.simple(ModBlocks.BLACK_PITANGA_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).build());

    public static final Holder<PlacedFeature> PITANGA_CHECKED = PlacementUtils.register("pitanga_checked",
            PITANGA_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.PITANGA_SAPLING.get()));
    public static final Holder<PlacedFeature> BLACK_PITANGA_CHECKED = PlacementUtils.register("black_pitanga_checked",
            BLACK_PITANGA_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.PITANGA_SAPLING.get()));

    ///Biomes vegetation
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ARAUCARIA_FOREST_LAURACEAE = FeatureUtils.register(
            "araucaria_forest_lauraceae", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
                    new WeightedPlacedFeature(ModConfiguredFeatures.BRAZILLIAN_SASSAFRAS_CHECKED, 0.2F),
                    new WeightedPlacedFeature(ModConfiguredFeatures.FANCY_BRAZILLIAN_SASSAFRAS_CHECKED, 0.2F),
                    new WeightedPlacedFeature(ModConfiguredFeatures.IMBUIA_CHECKED, 0.5F)),
                    ModConfiguredFeatures.FANCY_IMBUIA_CHECKED));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ARAUCARIA_FOREST_MYRTACEAE = FeatureUtils.register(
            "araucaria_forest_myrtaceae", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration((List.of(
                    new WeightedPlacedFeature(ModConfiguredFeatures.PITANGA_CHECKED, 0.1F),
                    new WeightedPlacedFeature(ModConfiguredFeatures.BLACK_PITANGA_CHECKED, 0.02F),
                    new WeightedPlacedFeature(ModConfiguredFeatures.FEIJOA_CHECKED, 0.7F),
                    new WeightedPlacedFeature(ModConfiguredFeatures.RIO_GRANDE_CHERRY_CHECKED, 0.5F))),
                    ModConfiguredFeatures.FANCY_RIO_GRANDE_CHERRY_CHECKED));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> PARANA_PINE_TREES = FeatureUtils.register(
            "parana_pine_trees", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
                    new WeightedPlacedFeature(ModConfiguredFeatures.YOUNG_PARANA_PINE_CHECKED, 0.1F)),
                    ModConfiguredFeatures.PARANA_PINE_CHECKED));

}

