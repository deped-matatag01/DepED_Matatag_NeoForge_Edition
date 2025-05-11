package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_BlockPlaceables;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreItems;
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

        //Fence Presets

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
