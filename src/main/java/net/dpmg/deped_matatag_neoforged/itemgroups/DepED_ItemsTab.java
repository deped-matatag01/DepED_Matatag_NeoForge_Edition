package net.dpmg.deped_matatag_neoforged.itemgroups;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DepED_ItemsTab {
    public static final DeferredRegister<CreativeModeTab> DPMG_ITEMS_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DepEDMatatagNeoForgeEdition.MOD_ID);

    public static final Supplier<CreativeModeTab> DEPED_MATATAG_ITEMS = DPMG_ITEMS_TAB.register("deped_matatag_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DepED_CoreItems.DEPED_CORE.get()))
                    .title(Component.translatable("creativemodetabs.deped_matatag.deped_matatag_items"))
                    .displayItems((itemDisplayParameters, output) -> {

                    output.accept(DepED_Weaponries.DEPED_HELMET);
                    output.accept(DepED_Weaponries.DEPED_CHESTPLATE);
                    output.accept(DepED_Weaponries.DEPED_LEGGINGS);
                    output.accept(DepED_Weaponries.DEPED_BOOTS);

                    //DepED SoundSystem
                    output.accept(DepED_MusicDiscs.DISC_EAT_BULAGA);
                    output.accept(DepED_MusicDiscs.DISC_WALTZ_OF_THE_FLOWERS);
                    output.accept(DepED_MusicDiscs.DISC_DISCO_GHOSTMIX_2000);
                    output.accept(DepED_MusicDiscs.DISC_WHATEVER_WE_IMAGINE);
                    output.accept(DepED_MusicDiscs.DISC_UPHS_UNIVERSITY_HYMN);
                    output.accept(DepED_MusicDiscs.DISC_MUSIC_ALWAYS);

                    //DepED Mineral Items
                    output.accept(DepED_MineralItems.RAW_DEPED);
                    output.accept(DepED_MineralItems.DEPED_INGOT);
                    output.accept(DepED_MineralItems.DEPED_NUGGET);

                    output.accept(DepED_MineralItems.RAW_GMATHS);
                    output.accept(DepED_MineralItems.GMATHS_INGOT);
                    output.accept(DepED_MineralItems.GMATHS_NUGGET);

                    output.accept(DepED_MineralItems.RAW_GMANHS);
                    output.accept(DepED_MineralItems.GMANHS_INGOT);
                    output.accept(DepED_MineralItems.GMANHS_NUGGET);

                    //DepED Core Items
                    output.accept(DepED_CoreItems.DEPED_CORE);
                    output.accept(DepED_CoreItems.GMATHS_CORE);
                    output.accept(DepED_CoreItems.GMANHS_CORE);
                    output.accept(DepED_CoreItems.KVA_SBO_CORE);
                    output.accept(DepED_CoreItems.SJCHS_CORE);
                    output.accept(DepED_CoreItems.SGII_ES_CORE);
                    output.accept(DepED_CoreItems.SETA_HEAD);
                    output.accept(DepED_CoreItems.UPHG_CCS_CORE);

                    //DepED Core Upgrades - Upgrade Template
                    output.accept(DepED_CoreUpgrades.CORE_UPGRADE_TIER_1);
                    output.accept(DepED_CoreUpgrades.CORE_UPGRADE_TIER_2);
                    output.accept(DepED_CoreUpgrades.CORE_UPGRADE_TIER_3);
                    output.accept(DepED_CoreUpgrades.CORE_UPGRADE_TIER_4);
                    output.accept(DepED_CoreUpgrades.CORE_UPGRADE_TIER_5);
                    output.accept(DepED_CoreUpgrades.CORE_UPGRADE_TIER_6);

                    //DepED Core Upgrades - GMANHS Core Upgrade
                    output.accept(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_1);
                    output.accept(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_2);
                    output.accept(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_3);
                    output.accept(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_4);
                    output.accept(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_5);
                    output.accept(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_6);

                    //DepED Core Upgrades - KVA SBO Core Upgrade
                    output.accept(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_1);
                    output.accept(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_2);
                    output.accept(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_3);
                    output.accept(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_4);
                    output.accept(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_5);
                    output.accept(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_6);

                    //DepED Core Upgrades - UPHG CCS Core Upgrade
                    output.accept(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_1);
                    output.accept(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_2);
                    output.accept(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_3);
                    output.accept(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_4);
                    output.accept(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_5);
                    output.accept(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_6);

                    }).build());

    public static void registerDPMG_ItemsTabs(IEventBus eventBus) {
      DPMG_ITEMS_TAB.register(eventBus);
    }
}
