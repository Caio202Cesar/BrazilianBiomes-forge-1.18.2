package net.caiocesarmods.brazilianbiomesmod.world.feature;

import com.google.common.collect.ImmutableList;
import net.caiocesarmods.brazilianbiomesmod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
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

import java.util.OptionalInt;

public class ModConfiguredFeatures {

    ///Trees
    //Parana Pine
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PARANA_PINE_TREE =
            FeatureUtils.register("parana_pine", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.PARANA_PINE_LOG.get()),
                    new GiantTrunkPlacer(13, 2, 14),
                    BlockStateProvider.simple(ModBlocks.PARANA_PINE_LEAVES.get()),
                    new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                    new TwoLayersFeatureSize(1, 1, 2))
                    .decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> YOUNG_PARANA_PINE_TREE =
            FeatureUtils.register("young_parana_pine", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
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
            FeatureUtils.register("imbuia", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.IMBUIA_LOG.get()),
                    new StraightTrunkPlacer(4, 2, 0),
                    BlockStateProvider.simple(ModBlocks.IMBUIA_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> IMBUIA_FANCY_TREE =
            FeatureUtils.register("fancy_imbuia", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.IMBUIA_LOG.get()),
                    new FancyTrunkPlacer(3, 11, 0),
                    BlockStateProvider.simple(ModBlocks.IMBUIA_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

}
