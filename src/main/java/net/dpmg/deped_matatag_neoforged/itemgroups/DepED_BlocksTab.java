package net.dpmg.deped_matatag_neoforged.itemgroups;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_BlockPlaceables;
import net.dpmg.deped_matatag_neoforged.block.DepED_OreSector;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DepED_BlocksTab {
    public static final DeferredRegister<CreativeModeTab> DPMG_BLOCKS_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DepEDMatatagNeoForgeEdition.MOD_ID);

    public static final Supplier<CreativeModeTab> DEPED_MATATAG_BLOCKS = DPMG_BLOCKS_TAB.register("deped_matatag_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DepED_BlockPlaceables.DEPED_BLOCK.get()))
                    .title(Component.translatable("creativemodetabs.deped_matatag.deped_matatag_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                    //DepED_Ore Sector - Ores
                    output.accept(DepED_OreSector.DEPED_ORE);
                    output.accept(DepED_OreSector.DEEPSLATE_DEPED_ORE);
                    output.accept(DepED_OreSector.GMATHS_ORE);
                    output.accept(DepED_OreSector.DEEPSLATE_GMATHS_ORE);
                    output.accept(DepED_OreSector.GMANHS_ORE);
                    output.accept(DepED_OreSector.DEEPSLATE_GMANHS_ORE);

                    //DepED_OreSector - Raw Blocks
                    output.accept(DepED_OreSector.RAW_DEPED_BLOCK);
                    output.accept(DepED_OreSector.RAW_GMATHS_BLOCK);
                    output.accept(DepED_OreSector.RAW_GMANHS_BLOCK);

                    //DepED_BlockPlaceables - DepED Variants
                    output.accept(DepED_BlockPlaceables.DEPED_BLOCK);
                    output.accept(DepED_BlockPlaceables.DEPED_STAIRS);
                    output.accept(DepED_BlockPlaceables.DEPED_SLAB);
                    output.accept(DepED_BlockPlaceables.DEPED_WALL);

                    //DepED_BlockPlaceables - GMATHS Variants
                    output.accept(DepED_BlockPlaceables.BLOCK_OF_GMATHS);
                    output.accept(DepED_BlockPlaceables.GMATHS_STAIRS);
                    output.accept(DepED_BlockPlaceables.GMATHS_SLAB);
                    output.accept(DepED_BlockPlaceables.GMATHS_WALL);

                    //DepED_BlockPlaceables - GMANHS Variants
                    output.accept(DepED_BlockPlaceables.BLOCK_OF_GMANHS);
                    output.accept(DepED_BlockPlaceables.GMANHS_STAIRS);
                    output.accept(DepED_BlockPlaceables.GMANHS_SLAB);
                    output.accept(DepED_BlockPlaceables.GMANHS_WALL);

                    //DepED_BlockPlaceables - SJCHS Variants
                    output.accept(DepED_BlockPlaceables.SJCHS_BLOCK);
                    output.accept(DepED_BlockPlaceables.SJCHS_STAIRS);
                    output.accept(DepED_BlockPlaceables.SJCHS_SLAB);
                    output.accept(DepED_BlockPlaceables.SJCHS_WALL);

                    //DepED_Block Placeables - Misc
                    output.accept(DepED_BlockPlaceables.SIR_ELIE_BLOCK);
                    output.accept(DepED_BlockPlaceables.SIR_ELIE_BLOCK_BODY);
                    output.accept(DepED_BlockPlaceables.THE_GMATHS_TORCH);
                    output.accept(DepED_BlockPlaceables.YES_O);

                    }).build());

    public static void registerDPMG_BlocksTabs(IEventBus eventBus) {
        DPMG_BLOCKS_TAB.register(eventBus);
    }
}
