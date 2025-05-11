package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreItems;
import net.dpmg.deped_matatag_neoforged.item.DepED_MineralItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

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
    }
}
