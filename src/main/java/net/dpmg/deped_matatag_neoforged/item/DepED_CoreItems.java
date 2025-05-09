package net.dpmg.deped_matatag_neoforged.item;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DepED_CoreItems {
    public static final DeferredRegister.Items DPMG_CORE_ITEMS = DeferredRegister.createItems(DepEDMatatagNeoForgeEdition.MOD_ID);

    public static final DeferredItem<Item> DEPED_CORE = DPMG_CORE_ITEMS.register("deped_core", () -> new Item(new Item.Properties().rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> GMATHS_CORE = DPMG_CORE_ITEMS.register("gmaths_core", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> GMANHS_CORE = DPMG_CORE_ITEMS.register("gmanhs_core", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static void registerDPMG_Items(IEventBus eventBus) {
        DPMG_CORE_ITEMS.register(eventBus);
    }
}
