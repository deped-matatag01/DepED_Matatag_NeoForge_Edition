package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_BlockPlaceables;
import net.dpmg.deped_matatag_neoforged.block.DepED_OreSector;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DepED_BlockTagsProvider extends BlockTagsProvider {
    public DepED_BlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DepEDMatatagNeoForgeEdition.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(DepED_BlockPlaceables.DEPED_BLOCK.get())
                .add(DepED_BlockPlaceables.THE_GMATHS_TORCH.get())
                .add(DepED_OreSector.DEPED_ORE.get())
                .add(DepED_OreSector.DEEPSLATE_DEPED_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(DepED_OreSector.DEPED_ORE.get())
                .add(DepED_OreSector.DEEPSLATE_DEPED_ORE.get());
    }
}
