package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_BlockPlaceables;
import net.dpmg.deped_matatag_neoforged.block.DepED_ColoredPlanks;
import net.dpmg.deped_matatag_neoforged.block.DepED_OreSector;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class DepED_BlockStatesProvider extends BlockStateProvider {
    public DepED_BlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DepEDMatatagNeoForgeEdition.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //White Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.WHITE_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.WHITE_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.WHITE_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.WHITE_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.WHITE_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.WHITE_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.WHITE_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.WHITE_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.WHITE_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.WHITE_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.WHITE_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.WHITE_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.WHITE_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.WHITE_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.WHITE_OAK_FENCE_GATE);

        //Light Gray Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.LIGHT_GRAY_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.LIGHT_GRAY_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.LIGHT_GRAY_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.LIGHT_GRAY_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.LIGHT_GRAY_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE_GATE);

        //Gray Oak Planks

        //Black Oak Planks

        //Brown Oak Planks

        //Red Oak Planks

        //Orange Oak Planks

        //Yellow Oak Planks

        //Lime Oak Planks

        //Green Oak Planks

        //Cyan Oak Planks

        //Light Blue Oak Planks

        //Blue Oak Planks

        //Purple Oak Planks

        //Magenta Oak Planks

        //Pink Oak Planks

        //DepED_BlockPlaceables - DepED Block Variants
        DPMG_BlockWithItem(DepED_BlockPlaceables.DEPED_BLOCK);
        stairsBlock(DepED_BlockPlaceables.DEPED_STAIRS.get(), blockTexture(DepED_BlockPlaceables.DEPED_BLOCK.get()));
        slabBlock(DepED_BlockPlaceables.DEPED_SLAB.get(), blockTexture(DepED_BlockPlaceables.DEPED_BLOCK.get()), blockTexture(DepED_BlockPlaceables.DEPED_BLOCK.get()));
        wallBlock(DepED_BlockPlaceables.DEPED_WALL.get(), blockTexture(DepED_BlockPlaceables.DEPED_BLOCK.get()));

        DPMG_BlockItemHandler(DepED_BlockPlaceables.DEPED_STAIRS);
        DPMG_BlockItemHandler(DepED_BlockPlaceables.DEPED_SLAB);

        //DepED_BlockPlaceables - GMATHS Block Variants
        DPMG_BlockWithItem(DepED_BlockPlaceables.BLOCK_OF_GMATHS);
        stairsBlock(DepED_BlockPlaceables.GMATHS_STAIRS.get(), blockTexture(DepED_BlockPlaceables.BLOCK_OF_GMATHS.get()));
        slabBlock(DepED_BlockPlaceables.GMATHS_SLAB.get(), blockTexture(DepED_BlockPlaceables.BLOCK_OF_GMATHS.get()), blockTexture(DepED_BlockPlaceables.BLOCK_OF_GMATHS.get()));
        wallBlock(DepED_BlockPlaceables.GMATHS_WALL.get(), blockTexture(DepED_BlockPlaceables.BLOCK_OF_GMATHS.get()));

        DPMG_BlockItemHandler(DepED_BlockPlaceables.GMATHS_STAIRS);
        DPMG_BlockItemHandler(DepED_BlockPlaceables.GMATHS_SLAB);

        //DepED_BlockPlaceables - GMANHS Block Variants
        DPMG_BlockWithItem(DepED_BlockPlaceables.BLOCK_OF_GMANHS);
        stairsBlock(DepED_BlockPlaceables.GMANHS_STAIRS.get(), blockTexture(DepED_BlockPlaceables.BLOCK_OF_GMANHS.get()));
        slabBlock(DepED_BlockPlaceables.GMANHS_SLAB.get(), blockTexture(DepED_BlockPlaceables.BLOCK_OF_GMANHS.get()), blockTexture(DepED_BlockPlaceables.BLOCK_OF_GMANHS.get()));
        wallBlock(DepED_BlockPlaceables.GMANHS_WALL.get(), blockTexture(DepED_BlockPlaceables.BLOCK_OF_GMANHS.get()));

        DPMG_BlockItemHandler(DepED_BlockPlaceables.GMANHS_STAIRS);
        DPMG_BlockItemHandler(DepED_BlockPlaceables.GMANHS_SLAB);

        //DepED_BlockPlaceables - SJCHS Block Variants
        DPMG_BlockWithItem(DepED_BlockPlaceables.SJCHS_BLOCK);
        stairsBlock(DepED_BlockPlaceables.SJCHS_STAIRS.get(), blockTexture(DepED_BlockPlaceables.SJCHS_BLOCK.get()));
        slabBlock(DepED_BlockPlaceables.SJCHS_SLAB.get(), blockTexture(DepED_BlockPlaceables.SJCHS_BLOCK.get()), blockTexture(DepED_BlockPlaceables.SJCHS_BLOCK.get()));
        wallBlock(DepED_BlockPlaceables.SJCHS_WALL.get(), blockTexture(DepED_BlockPlaceables.SJCHS_BLOCK.get()));

        DPMG_BlockItemHandler(DepED_BlockPlaceables.SJCHS_STAIRS);
        DPMG_BlockItemHandler(DepED_BlockPlaceables.SJCHS_SLAB);

        //DepED_BlockPlaceables - Misc
        DPMG_BlockWithItem(DepED_BlockPlaceables.SIR_ELIE_BLOCK);
        DPMG_BlockWithItem(DepED_BlockPlaceables.SIR_ELIE_BLOCK_BODY);
        DPMG_BlockWithItem(DepED_BlockPlaceables.THE_GMATHS_TORCH);
        DPMG_BlockWithItem(DepED_BlockPlaceables.YES_O);

        //DepED_OreSector - Ores
        DPMG_BlockWithItem(DepED_OreSector.DEPED_ORE);
        DPMG_BlockWithItem(DepED_OreSector.DEEPSLATE_DEPED_ORE);
        DPMG_BlockWithItem(DepED_OreSector.GMATHS_ORE);
        DPMG_BlockWithItem(DepED_OreSector.DEEPSLATE_GMATHS_ORE);
        DPMG_BlockWithItem(DepED_OreSector.GMANHS_ORE);
        DPMG_BlockWithItem(DepED_OreSector.DEEPSLATE_GMANHS_ORE);

        //DepED_OreSector - Raw Blocks
        DPMG_BlockWithItem(DepED_OreSector.RAW_DEPED_BLOCK);
        DPMG_BlockWithItem(DepED_OreSector.RAW_GMATHS_BLOCK);
        DPMG_BlockWithItem(DepED_OreSector.RAW_GMANHS_BLOCK);

    }

    private void DPMG_BlockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void DPMG_BlockItemHandler(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("deped_matatag:block/" + deferredBlock.getId().getPath()));
    }

    private void DPMG_BlockItemAppendix(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("deped_matatag:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
