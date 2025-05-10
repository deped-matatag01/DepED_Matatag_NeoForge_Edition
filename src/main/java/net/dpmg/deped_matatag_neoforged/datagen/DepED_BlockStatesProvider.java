package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_BlockPlaceables;
import net.dpmg.deped_matatag_neoforged.block.DepED_OreSector;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class DepED_BlockStatesProvider extends BlockStateProvider {
    public DepED_BlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DepEDMatatagNeoForgeEdition.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //DepED_BlockPlaceables - DepED Block Variants
        DPMG_BlockWithItem(DepED_BlockPlaceables.DEPED_BLOCK);

        //DepED_BlockPlaceables - Misc
        DPMG_BlockWithItem(DepED_BlockPlaceables.THE_GMATHS_TORCH);

        //DepED_OreSector - Ores
        DPMG_BlockWithItem(DepED_OreSector.DEPED_ORE);
        DPMG_BlockWithItem(DepED_OreSector.DEEPSLATE_DEPED_ORE);

        //DepED_OreSector - Raw Materials

    }

    private void DPMG_BlockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
