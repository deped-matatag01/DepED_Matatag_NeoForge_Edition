package net.dpmg.deped_matatag_neoforged.item;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.custom.items.DepED_ArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DepED_Weaponries {
    public static final DeferredRegister.Items DPMG_WEAPONRIES = DeferredRegister.createItems(DepEDMatatagNeoForgeEdition.MOD_ID);

    public static final DeferredItem<ArmorItem> DEPED_HELMET = DPMG_WEAPONRIES.register("deped_helmet", () -> new ArmorItem(DepED_ArmorMaterials.DEPED_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));
    public static final DeferredItem<ArmorItem> DEPED_CHESTPLATE = DPMG_WEAPONRIES.register("deped_chestplate", () -> new ArmorItem(DepED_ArmorMaterials.DEPED_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));
    public static final DeferredItem<ArmorItem> DEPED_LEGGINGS = DPMG_WEAPONRIES.register("deped_leggings", () -> new ArmorItem(DepED_ArmorMaterials.DEPED_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));
    public static final DeferredItem<ArmorItem> DEPED_BOOTS = DPMG_WEAPONRIES.register("deped_boots", () -> new ArmorItem(DepED_ArmorMaterials.DEPED_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));

    public static void registerDPMG_Weaponries(IEventBus eventBus) {
        DPMG_WEAPONRIES.register(eventBus);
    }
}
