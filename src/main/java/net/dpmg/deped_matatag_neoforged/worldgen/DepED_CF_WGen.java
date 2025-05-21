package net.dpmg.deped_matatag_neoforged.worldgen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_OreSector;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class DepED_CF_WGen {

    public static final ResourceKey<ConfiguredFeature<?, ?>> DEPED_ORE_OVERWOLD_KEY = registerKey("deped_ore_overworld_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GMATHS_ORE_OVERWOLD_KEY = registerKey("gmaths_ore_overworld_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GMANHS_ORE_OVERWOLD_KEY = registerKey("gmanhs_ore_overworld_key");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> DepED_OverworldOres = List.of(
                OreConfiguration.target(stoneReplaceables, DepED_OreSector.DEPED_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, DepED_OreSector.DEEPSLATE_DEPED_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> GMATHS_OverworldOres = List.of(
                OreConfiguration.target(stoneReplaceables, DepED_OreSector.GMATHS_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, DepED_OreSector.DEEPSLATE_GMATHS_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> GMANHS_OverworldOres = List.of(
                OreConfiguration.target(stoneReplaceables, DepED_OreSector.GMANHS_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, DepED_OreSector.DEEPSLATE_GMANHS_ORE.get().defaultBlockState())
        );

        register(context, DEPED_ORE_OVERWOLD_KEY, Feature.ORE, new OreConfiguration(DepED_OverworldOres, 7));
        register(context, GMATHS_ORE_OVERWOLD_KEY, Feature.ORE, new OreConfiguration(GMATHS_OverworldOres, 5));
        register(context, GMANHS_ORE_OVERWOLD_KEY, Feature.ORE, new OreConfiguration(GMANHS_OverworldOres, 3));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(DepEDMatatagNeoForgeEdition.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

