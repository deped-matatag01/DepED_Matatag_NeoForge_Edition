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
        tag(BlockTags.WALLS)
                .add(DepED_BlockPlaceables.DEPED_WALL.get())
                .add(DepED_BlockPlaceables.GMATHS_WALL.get())
                .add(DepED_BlockPlaceables.GMANHS_WALL.get())
                .add(DepED_BlockPlaceables.SJCHS_WALL.get());

        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(DepED_BlockPlaceables.YES_O.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                //DepED_BlockPlaceables - DepED Variants
                .add(DepED_BlockPlaceables.DEPED_BLOCK.get())
                .add(DepED_BlockPlaceables.DEPED_STAIRS.get())
                .add(DepED_BlockPlaceables.DEPED_SLAB.get())
                .add(DepED_BlockPlaceables.DEPED_WALL.get())

                //DepED_BlockPlaceables - GMATHS Variants
                .add(DepED_BlockPlaceables.BLOCK_OF_GMATHS.get())
                .add(DepED_BlockPlaceables.GMATHS_STAIRS.get())
                .add(DepED_BlockPlaceables.GMATHS_SLAB.get())
                .add(DepED_BlockPlaceables.GMATHS_WALL.get())

                //DepED_BlockPlaceables - GMANHS Variants
                .add(DepED_BlockPlaceables.BLOCK_OF_GMANHS.get())
                .add(DepED_BlockPlaceables.GMANHS_STAIRS.get())
                .add(DepED_BlockPlaceables.GMANHS_SLAB.get())
                .add(DepED_BlockPlaceables.GMANHS_WALL.get())

                //DepED_BlockPlaceables - SJCHS Variants
                .add(DepED_BlockPlaceables.SJCHS_BLOCK.get())
                .add(DepED_BlockPlaceables.SJCHS_STAIRS.get())
                .add(DepED_BlockPlaceables.SJCHS_SLAB.get())
                .add(DepED_BlockPlaceables.SJCHS_WALL.get())

                //DepED_BlockPlaceables - DepED Variants
                .add(DepED_BlockPlaceables.THE_GMATHS_TORCH.get())

                //DepED_BlockPlaceables - Misc
                .add(DepED_BlockPlaceables.SIR_ELIE_BLOCK.get())
                .add(DepED_BlockPlaceables.SIR_ELIE_BLOCK_BODY.get())

                //DepED_OreSector - Ores
                .add(DepED_OreSector.DEPED_ORE.get())
                .add(DepED_OreSector.DEEPSLATE_DEPED_ORE.get())
                .add(DepED_OreSector.GMATHS_ORE.get())
                .add(DepED_OreSector.DEEPSLATE_GMATHS_ORE.get())
                .add(DepED_OreSector.GMANHS_ORE.get())
                .add(DepED_OreSector.DEEPSLATE_GMANHS_ORE.get())

                //DepED_OreSector - Raw Minerals
                .add(DepED_OreSector.RAW_DEPED_BLOCK.get())
                .add(DepED_OreSector.RAW_GMATHS_BLOCK.get())
                .add(DepED_OreSector.RAW_GMANHS_BLOCK.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                //DepED_BlockPlaceables - DepED Variants
                .add(DepED_BlockPlaceables.DEPED_BLOCK.get())
                .add(DepED_BlockPlaceables.DEPED_STAIRS.get())
                .add(DepED_BlockPlaceables.DEPED_SLAB.get())
                .add(DepED_BlockPlaceables.DEPED_WALL.get())

                //DepED_BlockPlaceables - GMATHS Variants
                .add(DepED_BlockPlaceables.BLOCK_OF_GMATHS.get())
                .add(DepED_BlockPlaceables.GMATHS_STAIRS.get())
                .add(DepED_BlockPlaceables.GMATHS_SLAB.get())
                .add(DepED_BlockPlaceables.GMATHS_WALL.get())

                //DepED_BlockPlaceables - GMANHS Variants
                .add(DepED_BlockPlaceables.BLOCK_OF_GMANHS.get())
                .add(DepED_BlockPlaceables.GMANHS_STAIRS.get())
                .add(DepED_BlockPlaceables.GMANHS_SLAB.get())
                .add(DepED_BlockPlaceables.GMANHS_WALL.get())

                //DepED_BlockPlaceables - SJCHS Variants
                .add(DepED_BlockPlaceables.SJCHS_BLOCK.get())
                .add(DepED_BlockPlaceables.SJCHS_STAIRS.get())
                .add(DepED_BlockPlaceables.SJCHS_SLAB.get())
                .add(DepED_BlockPlaceables.SJCHS_WALL.get())

                //DepED_BlockPlaceables - Misc
                .add(DepED_BlockPlaceables.SIR_ELIE_BLOCK.get())
                .add(DepED_BlockPlaceables.SIR_ELIE_BLOCK_BODY.get())
                .add(DepED_BlockPlaceables.THE_GMATHS_TORCH.get())

                .add(DepED_OreSector.DEPED_ORE.get())
                .add(DepED_OreSector.DEEPSLATE_DEPED_ORE.get())
                .add(DepED_OreSector.RAW_DEPED_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(DepED_OreSector.GMATHS_ORE.get())
                .add(DepED_OreSector.DEEPSLATE_GMATHS_ORE.get())
                .add(DepED_OreSector.RAW_GMATHS_BLOCK.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(DepED_OreSector.GMANHS_ORE.get())
                .add(DepED_OreSector.DEEPSLATE_GMANHS_ORE.get())
                .add(DepED_OreSector.RAW_GMANHS_BLOCK.get());
    }
}
