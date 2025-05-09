package net.dpmg.deped_matatag_neoforged.item;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DepED_MineralItems {
    public static final DeferredRegister.Items DPMG_MINERAL_ITEMS = DeferredRegister.createItems(DepEDMatatagNeoForgeEdition.MOD_ID);

    public static final DeferredItem<Item> RAW_DEPED = DPMG_MINERAL_ITEMS.register("raw_deped", () -> new Item(new Item.Properties()));

    public static void registerDPMG_MineralItems(IEventBus eventBus) {
        DPMG_MINERAL_ITEMS.register(eventBus);
    }
}
