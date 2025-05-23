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
        DPMG_BlockWithItem(DepED_ColoredPlanks.GRAY_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.GRAY_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.GRAY_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.GRAY_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.GRAY_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.GRAY_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.GRAY_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.GRAY_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.GRAY_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.GRAY_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.GRAY_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.GRAY_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.GRAY_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.GRAY_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.GRAY_OAK_FENCE_GATE);

        //Black Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.BLACK_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.BLACK_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.BLACK_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.BLACK_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.BLACK_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.BLACK_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.BLACK_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.BLACK_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.BLACK_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.BLACK_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.BLACK_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.BLACK_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.BLACK_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.BLACK_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.BLACK_OAK_FENCE_GATE);

        //Brown Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.BROWN_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.BROWN_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.BROWN_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.BROWN_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.BROWN_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.BROWN_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.BROWN_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.BROWN_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.BROWN_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.BROWN_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.BROWN_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.BROWN_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.BROWN_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.BROWN_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.BROWN_OAK_FENCE_GATE);

        //Red Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.RED_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.RED_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.RED_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.RED_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.RED_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.RED_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.RED_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.RED_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.RED_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.RED_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.RED_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.RED_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.RED_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.RED_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.RED_OAK_FENCE_GATE);

        //Orange Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.ORANGE_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.ORANGE_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.ORANGE_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.ORANGE_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.ORANGE_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.ORANGE_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.ORANGE_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.ORANGE_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.ORANGE_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.ORANGE_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.ORANGE_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.ORANGE_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.ORANGE_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.ORANGE_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.ORANGE_OAK_FENCE_GATE);

        //Yellow Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.YELLOW_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.YELLOW_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.YELLOW_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.YELLOW_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.YELLOW_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.YELLOW_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.YELLOW_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.YELLOW_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.YELLOW_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.YELLOW_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.YELLOW_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.YELLOW_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.YELLOW_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.YELLOW_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.YELLOW_OAK_FENCE_GATE);

        //Lime Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.LIME_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.LIME_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.LIME_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.LIME_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.LIME_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.LIME_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.LIME_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.LIME_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.LIME_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.LIME_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.LIME_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.LIME_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.LIME_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.LIME_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.LIME_OAK_FENCE_GATE);

        //Green Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.GREEN_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.GREEN_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.GREEN_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.GREEN_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.GREEN_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.GREEN_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.GREEN_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.GREEN_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.GREEN_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.GREEN_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.GREEN_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.GREEN_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.GREEN_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.GREEN_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.GREEN_OAK_FENCE_GATE);

        //Cyan Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.CYAN_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.CYAN_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.CYAN_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.CYAN_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.CYAN_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.CYAN_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.CYAN_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.CYAN_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.CYAN_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.CYAN_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.CYAN_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.CYAN_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.CYAN_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.CYAN_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.CYAN_OAK_FENCE_GATE);

        //Light Blue Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.LIGHT_BLUE_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.LIGHT_BLUE_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.LIGHT_BLUE_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.LIGHT_BLUE_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.LIGHT_BLUE_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.LIGHT_BLUE_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.LIGHT_BLUE_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.LIGHT_BLUE_OAK_FENCE_GATE);

        //Blue Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.BLUE_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.BLUE_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.BLUE_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.BLUE_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.BLUE_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.BLUE_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.BLUE_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.BLUE_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.BLUE_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.BLUE_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.BLUE_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.BLUE_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.BLUE_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.BLUE_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.BLUE_OAK_FENCE_GATE);

        //Purple Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.PURPLE_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.PURPLE_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.PURPLE_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.PURPLE_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.PURPLE_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.PURPLE_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.PURPLE_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.PURPLE_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.PURPLE_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.PURPLE_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.PURPLE_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.PURPLE_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.PURPLE_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.PURPLE_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.PURPLE_OAK_FENCE_GATE);

        //Magenta Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.MAGENTA_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.MAGENTA_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.MAGENTA_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.MAGENTA_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.MAGENTA_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.MAGENTA_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.MAGENTA_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.MAGENTA_OAK_FENCE_GATE);

        //Pink Oak Planks
        DPMG_BlockWithItem(DepED_ColoredPlanks.PINK_OAK_PLANKS);
        stairsBlock(DepED_ColoredPlanks.PINK_OAK_STAIRS.get(), blockTexture(DepED_ColoredPlanks.PINK_OAK_PLANKS.get()));
        slabBlock(DepED_ColoredPlanks.PINK_OAK_SLAB.get(), blockTexture(DepED_ColoredPlanks.PINK_OAK_PLANKS.get()), blockTexture(DepED_ColoredPlanks.PINK_OAK_PLANKS.get()));
        wallBlock(DepED_ColoredPlanks.PINK_OAK_WALL.get(), blockTexture(DepED_ColoredPlanks.PINK_OAK_PLANKS.get()));
        fenceBlock(DepED_ColoredPlanks.PINK_OAK_FENCE.get(), blockTexture(DepED_ColoredPlanks.PINK_OAK_PLANKS.get()));
        fenceGateBlock(DepED_ColoredPlanks.PINK_OAK_FENCE_GATE.get(), blockTexture(DepED_ColoredPlanks.PINK_OAK_PLANKS.get()));

        DPMG_BlockItemHandler(DepED_ColoredPlanks.PINK_OAK_STAIRS);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.PINK_OAK_SLAB);
        DPMG_BlockItemHandler(DepED_ColoredPlanks.PINK_OAK_FENCE_GATE);

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

        DPMG_BlockWithItem(DepED_BlockPlaceables.SUGARCANE_BLOCK);
        DPMG_BlockWithItem(DepED_BlockPlaceables.BAKED_SUGARCANE_BLOCK);

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
