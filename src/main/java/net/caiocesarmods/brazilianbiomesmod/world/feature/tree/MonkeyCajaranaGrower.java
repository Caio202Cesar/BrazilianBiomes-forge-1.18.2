package net.caiocesarmods.brazilianbiomesmod.world.feature.tree;

import net.caiocesarmods.brazilianbiomesmod.world.feature.ModConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class MonkeyCajaranaGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> m_203525_(Random random, boolean b) {
        if (random.nextInt(10) == 9) {
            return ModConfiguredFeatures.MONKEY_CAJARANA_TREE1;
        } else {
            return ModConfiguredFeatures.MONKEY_CAJARANA_TREE2;
        }
    }
}
