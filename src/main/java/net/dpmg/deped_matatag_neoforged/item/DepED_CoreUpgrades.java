package net.dpmg.deped_matatag_neoforged.item;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DepED_CoreUpgrades {
    public static final DeferredRegister.Items DPMG_CORE_UPGRADES = DeferredRegister.createItems(DepEDMatatagNeoForgeEdition.MOD_ID);

    //CORE UPGRADE TEMPLATES LEVEL 1-6
    public static final DeferredItem<Item> CORE_UPGRADE_TIER_1 = DPMG_CORE_UPGRADES.register("core_upgrade_tier_1", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORE_UPGRADE_TIER_2 = DPMG_CORE_UPGRADES.register("core_upgrade_tier_2", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORE_UPGRADE_TIER_3 = DPMG_CORE_UPGRADES.register("core_upgrade_tier_3", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORE_UPGRADE_TIER_4 = DPMG_CORE_UPGRADES.register("core_upgrade_tier_4", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORE_UPGRADE_TIER_5 = DPMG_CORE_UPGRADES.register("core_upgrade_tier_5", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORE_UPGRADE_TIER_6 = DPMG_CORE_UPGRADES.register("core_upgrade_tier_6", () -> new Item(new Item.Properties()));

    //GMANHS CORE UPGRADES LEVEL 1-6
    public static final DeferredItem<Item> GMANHS_CORE_UPGRADE_TIER_1 = DPMG_CORE_UPGRADES.register("gmanhs_core_upgrade_tier_1", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GMANHS_CORE_UPGRADE_TIER_2 = DPMG_CORE_UPGRADES.register("gmanhs_core_upgrade_tier_2", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GMANHS_CORE_UPGRADE_TIER_3 = DPMG_CORE_UPGRADES.register("gmanhs_core_upgrade_tier_3", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GMANHS_CORE_UPGRADE_TIER_4 = DPMG_CORE_UPGRADES.register("gmanhs_core_upgrade_tier_4", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GMANHS_CORE_UPGRADE_TIER_5 = DPMG_CORE_UPGRADES.register("gmanhs_core_upgrade_tier_5", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GMANHS_CORE_UPGRADE_TIER_6 = DPMG_CORE_UPGRADES.register("gmanhs_core_upgrade_tier_6", () -> new Item(new Item.Properties()));

    //KVA SBO CORE UPGRADES LEVEL 1-6
    public static final DeferredItem<Item> KVA_SBO_CORE_UPGRADE_TIER_1 = DPMG_CORE_UPGRADES.register("kva_sbo_core_upgrade_tier_1", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KVA_SBO_CORE_UPGRADE_TIER_2 = DPMG_CORE_UPGRADES.register("kva_sbo_core_upgrade_tier_2", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KVA_SBO_CORE_UPGRADE_TIER_3 = DPMG_CORE_UPGRADES.register("kva_sbo_core_upgrade_tier_3", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KVA_SBO_CORE_UPGRADE_TIER_4 = DPMG_CORE_UPGRADES.register("kva_sbo_core_upgrade_tier_4", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KVA_SBO_CORE_UPGRADE_TIER_5 = DPMG_CORE_UPGRADES.register("kva_sbo_core_upgrade_tier_5", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KVA_SBO_CORE_UPGRADE_TIER_6 = DPMG_CORE_UPGRADES.register("kva_sbo_core_upgrade_tier_6", () -> new Item(new Item.Properties()));

    //UPHG CCS CORE UPGRADES LEVEL 1-6
    public static final DeferredItem<Item> UPHG_CCS_CORE_UPGRADE_TIER_1 = DPMG_CORE_UPGRADES.register("uphg_ccs_core_upgrade_tier_1", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UPHG_CCS_CORE_UPGRADE_TIER_2 = DPMG_CORE_UPGRADES.register("uphg_ccs_core_upgrade_tier_2", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UPHG_CCS_CORE_UPGRADE_TIER_3 = DPMG_CORE_UPGRADES.register("uphg_ccs_core_upgrade_tier_3", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UPHG_CCS_CORE_UPGRADE_TIER_4 = DPMG_CORE_UPGRADES.register("uphg_ccs_core_upgrade_tier_4", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UPHG_CCS_CORE_UPGRADE_TIER_5 = DPMG_CORE_UPGRADES.register("uphg_ccs_core_upgrade_tier_5", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UPHG_CCS_CORE_UPGRADE_TIER_6 = DPMG_CORE_UPGRADES.register("uphg_ccs_core_upgrade_tier_6", () -> new Item(new Item.Properties()));

    public static void registerDPMG_CoreUpgrades(IEventBus eventBus) {
        DPMG_CORE_UPGRADES.register(eventBus);
    }
}
