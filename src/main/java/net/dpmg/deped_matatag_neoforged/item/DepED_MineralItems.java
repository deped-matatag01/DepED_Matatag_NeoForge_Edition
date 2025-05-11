package net.dpmg.deped_matatag_neoforged.item;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DepED_MineralItems {
    public static final DeferredRegister.Items DPMG_MINERAL_ITEMS = DeferredRegister.createItems(DepEDMatatagNeoForgeEdition.MOD_ID);

    //DepED Properties
    public static final DeferredItem<Item> RAW_DEPED = DPMG_MINERAL_ITEMS.register("raw_deped", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEPED_INGOT = DPMG_MINERAL_ITEMS.register("deped_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEPED_NUGGET = DPMG_MINERAL_ITEMS.register("deped_nugget", () -> new Item(new Item.Properties()));

    //GMATHS Properties
    public static final DeferredItem<Item> RAW_GMATHS = DPMG_MINERAL_ITEMS.register("raw_gmaths", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GMATHS_INGOT = DPMG_MINERAL_ITEMS.register("gmaths_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GMATHS_NUGGET = DPMG_MINERAL_ITEMS.register("gmaths_nugget", () -> new Item(new Item.Properties()));

    //GMANHS Properties
    public static final DeferredItem<Item> RAW_GMANHS = DPMG_MINERAL_ITEMS.register("raw_gmanhs", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GMANHS_INGOT = DPMG_MINERAL_ITEMS.register("gmanhs_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GMANHS_NUGGET = DPMG_MINERAL_ITEMS.register("gmanhs_nugget", () -> new Item(new Item.Properties()));

    public static void registerDPMG_MineralItems(IEventBus eventBus) {
        DPMG_MINERAL_ITEMS.register(eventBus);
    }
}
