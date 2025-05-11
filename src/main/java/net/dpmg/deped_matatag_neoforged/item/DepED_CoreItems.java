package net.dpmg.deped_matatag_neoforged.item;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DepED_CoreItems {
    public static final DeferredRegister.Items DPMG_CORE_ITEMS = DeferredRegister.createItems(DepEDMatatagNeoForgeEdition.MOD_ID);

    public static final DeferredItem<Item> DEPED_CORE = DPMG_CORE_ITEMS.register("deped_core", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> GMATHS_CORE = DPMG_CORE_ITEMS.register("gmaths_core", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> GMANHS_CORE = DPMG_CORE_ITEMS.register("gmanhs_core", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> KVA_SBO_CORE = DPMG_CORE_ITEMS.register("kva_sbo_core", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> SJCHS_CORE = DPMG_CORE_ITEMS.register("sjchs_core", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SGII_ES_CORE = DPMG_CORE_ITEMS.register("sgii_es_core", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> SETA_HEAD = DPMG_CORE_ITEMS.register("seta_head", () -> new Item(new Item.Properties().rarity(Rarity.COMMON)));
    public static final DeferredItem<Item> UPHG_CCS_CORE = DPMG_CORE_ITEMS.register("uphg_ccs_core", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static void registerDPMG_Items(IEventBus eventBus) {
        DPMG_CORE_ITEMS.register(eventBus);
    }
}
