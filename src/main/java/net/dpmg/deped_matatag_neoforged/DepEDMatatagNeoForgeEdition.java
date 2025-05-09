package net.dpmg.deped_matatag_neoforged;

import net.dpmg.deped_matatag_neoforged.block.DepED_BlockPlaceables;
import net.dpmg.deped_matatag_neoforged.block.DepED_OreSector;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreItems;
import net.dpmg.deped_matatag_neoforged.item.DepED_MineralItems;
import net.dpmg.deped_matatag_neoforged.itemgroups.DepED_BlocksTab;
import net.dpmg.deped_matatag_neoforged.itemgroups.DepED_ItemsTab;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(DepEDMatatagNeoForgeEdition.MOD_ID)
public class DepEDMatatagNeoForgeEdition {

    public static final String MOD_ID = "deped_matatag";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DepEDMatatagNeoForgeEdition(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        //DepED_CreativeModeTabs
        DepED_ItemsTab.registerDPMG_ItemsTabs(modEventBus);
        DepED_BlocksTab.registerDPMG_BlocksTabs(modEventBus);

        //DepED_Blocks
        DepED_BlockPlaceables.registerDPMG_BlockPlaceables(modEventBus);
        DepED_OreSector.registerDPMG_OreSector(modEventBus);

        //DepED_Items
        DepED_CoreItems.registerDPMG_Items(modEventBus);
        DepED_MineralItems.registerDPMG_MineralItems(modEventBus);

        //DepED_CustomTags

        modEventBus.addListener(this::addCreative);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
