package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_BlockPlaceables;
import net.dpmg.deped_matatag_neoforged.block.DepED_ColoredPlanks;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreItems;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreUpgrades;
import net.dpmg.deped_matatag_neoforged.item.DepED_MineralItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class DepED_ItemModelProvider extends ItemModelProvider {
    public DepED_ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DepEDMatatagNeoForgeEdition.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //DepED Core Items
        basicItem(DepED_CoreItems.DEPED_CORE.get());
        basicItem(DepED_CoreItems.GMATHS_CORE.get());
        basicItem(DepED_CoreItems.GMANHS_CORE.get());
        basicItem(DepED_CoreItems.KVA_SBO_CORE.get());
        basicItem(DepED_CoreItems.SJCHS_CORE.get());
        basicItem(DepED_CoreItems.SGII_ES_CORE.get());
        basicItem(DepED_CoreItems.SETA_HEAD.get());
        basicItem(DepED_CoreItems.UPHG_CCS_CORE.get());

        //DepED Core Upgrades - Upgrade Template
        basicItem(DepED_CoreUpgrades.CORE_UPGRADE_TIER_1.get());
        basicItem(DepED_CoreUpgrades.CORE_UPGRADE_TIER_2.get());
        basicItem(DepED_CoreUpgrades.CORE_UPGRADE_TIER_3.get());
        basicItem(DepED_CoreUpgrades.CORE_UPGRADE_TIER_4.get());
        basicItem(DepED_CoreUpgrades.CORE_UPGRADE_TIER_5.get());
        basicItem(DepED_CoreUpgrades.CORE_UPGRADE_TIER_6.get());

        //DepED Core Upgrades - GMANHS Core Upgrade
        basicItem(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_1.get());
        basicItem(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_2.get());
        basicItem(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_3.get());
        basicItem(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_4.get());
        basicItem(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_5.get());
        basicItem(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_6.get());

        //DepED Core Upgrades - KVA SBO Core Upgrade
        basicItem(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_1.get());
        basicItem(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_2.get());
        basicItem(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_3.get());
        basicItem(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_4.get());
        basicItem(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_5.get());
        basicItem(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_6.get());

        //DepED Core Upgrades - UPHG CCS Core Upgrade
        basicItem(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_1.get());
        basicItem(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_2.get());
        basicItem(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_3.get());
        basicItem(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_4.get());
        basicItem(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_5.get());
        basicItem(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_6.get());

        //DepED Mineral Items
        basicItem(DepED_MineralItems.RAW_DEPED.get());
        basicItem(DepED_MineralItems.DEPED_INGOT.get());
        basicItem(DepED_MineralItems.DEPED_NUGGET.get());

        basicItem(DepED_MineralItems.RAW_GMATHS.get());
        basicItem(DepED_MineralItems.GMATHS_INGOT.get());
        basicItem(DepED_MineralItems.GMATHS_NUGGET.get());

        basicItem(DepED_MineralItems.RAW_GMANHS.get());
        basicItem(DepED_MineralItems.GMANHS_INGOT.get());
        basicItem(DepED_MineralItems.GMANHS_NUGGET.get());

        //Wall Presets
        DPMG_WallItem(DepED_BlockPlaceables.DEPED_WALL, DepED_BlockPlaceables.DEPED_BLOCK);
        DPMG_WallItem(DepED_BlockPlaceables.GMATHS_WALL, DepED_BlockPlaceables.BLOCK_OF_GMATHS);
        DPMG_WallItem(DepED_BlockPlaceables.GMANHS_WALL, DepED_BlockPlaceables.BLOCK_OF_GMANHS);
        DPMG_WallItem(DepED_BlockPlaceables.SJCHS_WALL, DepED_BlockPlaceables.SJCHS_BLOCK);

        //Colored Plank Wall Presets
        DPMG_WallItem(DepED_ColoredPlanks.WHITE_OAK_WALL, DepED_ColoredPlanks.WHITE_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.LIGHT_GRAY_OAK_WALL, DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.GRAY_OAK_WALL, DepED_ColoredPlanks.GRAY_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.BLACK_OAK_WALL, DepED_ColoredPlanks.BLACK_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.BROWN_OAK_WALL, DepED_ColoredPlanks.BROWN_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.RED_OAK_WALL, DepED_ColoredPlanks.RED_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.ORANGE_OAK_WALL, DepED_ColoredPlanks.ORANGE_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.YELLOW_OAK_WALL, DepED_ColoredPlanks.YELLOW_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.LIME_OAK_WALL, DepED_ColoredPlanks.LIME_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.GREEN_OAK_WALL, DepED_ColoredPlanks.GREEN_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.CYAN_OAK_WALL, DepED_ColoredPlanks.CYAN_OAK_PLANKS);

        //Fence Presets
        DPMG_FenceItem(DepED_ColoredPlanks.WHITE_OAK_FENCE, DepED_ColoredPlanks.WHITE_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE, DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.GRAY_OAK_FENCE, DepED_ColoredPlanks.GRAY_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.BLACK_OAK_FENCE, DepED_ColoredPlanks.BLACK_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.BROWN_OAK_FENCE, DepED_ColoredPlanks.BROWN_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.RED_OAK_FENCE, DepED_ColoredPlanks.RED_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.ORANGE_OAK_FENCE, DepED_ColoredPlanks.ORANGE_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.YELLOW_OAK_FENCE, DepED_ColoredPlanks.YELLOW_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.LIME_OAK_FENCE, DepED_ColoredPlanks.LIME_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.GREEN_OAK_FENCE, DepED_ColoredPlanks.GREEN_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.CYAN_OAK_FENCE, DepED_ColoredPlanks.CYAN_OAK_PLANKS);

    }

    public void DPMG_FenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(DepEDMatatagNeoForgeEdition.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void DPMG_WallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(DepEDMatatagNeoForgeEdition.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
