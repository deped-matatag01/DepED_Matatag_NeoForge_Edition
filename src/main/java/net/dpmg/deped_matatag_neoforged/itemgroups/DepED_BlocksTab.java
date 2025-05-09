package net.dpmg.deped_matatag_neoforged.itemgroups;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DepED_BlocksTab {
    public static final DeferredRegister<CreativeModeTab> DPMG_BLOCKS_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DepEDMatatagNeoForgeEdition.MOD_ID);

    public static final Supplier<CreativeModeTab> DEPED_MATATAG_ITEMS = DPMG_BLOCKS_TAB.register("deped_matatag_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DepED_CoreItems.DEPED_CORE.get()))
                    .title(Component.translatable("creativemodetabs.deped_matatag.deped_matatag_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                    output.accept(DepED_CoreItems.DEPED_CORE);

                    }).build());

    public static void registerDPMG_BlocksTab(IEventBus eventBus) {
        DPMG_BLOCKS_TAB.register(eventBus);
    }
}
