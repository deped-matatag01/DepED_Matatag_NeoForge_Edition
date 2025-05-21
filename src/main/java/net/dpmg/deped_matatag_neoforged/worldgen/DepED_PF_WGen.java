package net.dpmg.deped_matatag_neoforged.worldgen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class DepED_PF_WGen {

    public static final ResourceKey<PlacedFeature> DEPED_ORE_OVERWORLD_PLACED_KEY = registerKey("deped_ore_overworld_placed");
    public static final ResourceKey<PlacedFeature> GMATHS_ORE_OVERWORLD_PLACED_KEY = registerKey("gmaths_ore_overworld_placed");
    public static final ResourceKey<PlacedFeature> GMANHS_ORE_OVERWORLD_PLACED_KEY = registerKey("gmanhs_ore_overworld_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, DEPED_ORE_OVERWORLD_PLACED_KEY, configuredFeatures.getOrThrow(DepED_CF_WGen.DEPED_ORE_OVERWOLD_KEY),
                ModOrePlacement.commonOrePlacement(20, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(70))));

        register(context, GMATHS_ORE_OVERWORLD_PLACED_KEY, configuredFeatures.getOrThrow(DepED_CF_WGen.GMATHS_ORE_OVERWOLD_KEY),
                ModOrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.absolute(-27), VerticalAnchor.absolute(24))));

        register(context, GMANHS_ORE_OVERWORLD_PLACED_KEY, configuredFeatures.getOrThrow(DepED_CF_WGen.GMANHS_ORE_OVERWOLD_KEY),
                ModOrePlacement.commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(12))));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(DepEDMatatagNeoForgeEdition.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
