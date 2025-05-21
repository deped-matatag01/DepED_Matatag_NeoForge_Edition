package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.worldgen.DepED_BiomeModifier;
import net.dpmg.deped_matatag_neoforged.worldgen.DepED_CF_WGen;
import net.dpmg.deped_matatag_neoforged.worldgen.DepED_PF_WGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class DepED_DatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER  = new RegistrySetBuilder()

            .add(Registries.CONFIGURED_FEATURE, DepED_CF_WGen::bootstrap)
            .add(Registries.PLACED_FEATURE, DepED_PF_WGen::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, DepED_BiomeModifier::bootstrap);

    public DepED_DatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(DepEDMatatagNeoForgeEdition.MOD_ID));
    }
}
