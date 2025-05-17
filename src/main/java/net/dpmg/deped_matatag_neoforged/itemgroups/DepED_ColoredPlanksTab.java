package net.dpmg.deped_matatag_neoforged.itemgroups;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_ColoredPlanks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DepED_ColoredPlanksTab {
    public static final DeferredRegister<CreativeModeTab> DPMG_COLORED_PLANKS_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DepEDMatatagNeoForgeEdition.MOD_ID);

    public static final Supplier<CreativeModeTab> DEPED_MATATAG_COLORED_PLANKS = DPMG_COLORED_PLANKS_TAB.register("deped_matatag_colored_planks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DepED_ColoredPlanks.WHITE_OAK_PLANKS.get()))
                    .title(Component.translatable("creativemodetabs.deped_matatag.deped_matatag_colored_planks"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //White Oak Planks
                        output.accept(DepED_ColoredPlanks.WHITE_OAK_PLANKS);
                        output.accept(DepED_ColoredPlanks.WHITE_OAK_STAIRS);
                        output.accept(DepED_ColoredPlanks.WHITE_OAK_SLAB);
                        output.accept(DepED_ColoredPlanks.WHITE_OAK_WALL);
                        output.accept(DepED_ColoredPlanks.WHITE_OAK_FENCE);
                        output.accept(DepED_ColoredPlanks.WHITE_OAK_FENCE_GATE);

                        //Light Gray Oak Planks
                        output.accept(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS);
                        output.accept(DepED_ColoredPlanks.LIGHT_GRAY_OAK_STAIRS);
                        output.accept(DepED_ColoredPlanks.LIGHT_GRAY_OAK_SLAB);
                        output.accept(DepED_ColoredPlanks.LIGHT_GRAY_OAK_WALL);
                        output.accept(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE);
                        output.accept(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE_GATE);

                        //Gray Oak Planks

                        //Black Oak Planks

                        //Brown Oak Planks

                        //Red Oak Planks

                        //Orange Oak Planks

                        //Yellow Oak Planks

                        //Lime Oak Planks

                        //Green Oak Planks

                        //Cyan Oak Planks

                        //Light Blue Oak Planks

                        //Blue Oak Planks

                        //Purple Oak Planks

                        //Magenta Oak Planks

                        //Pink Oak Planks

                    }).build());

    public static void registerDPMG_ColoredPlankTabs(IEventBus eventBus) {
        DPMG_COLORED_PLANKS_TAB.register(eventBus);
    }
}
