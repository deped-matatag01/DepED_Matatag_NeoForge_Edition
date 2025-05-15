package net.dpmg.deped_matatag_neoforged.block;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreUpgrades;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DepED_ColoredPlanks {
    public static final DeferredRegister.Blocks DEPED_COLORED_PLANKS = DeferredRegister.createBlocks(DepEDMatatagNeoForgeEdition.MOD_ID);

    //White Oak Planks

    //Light Gray Oak Planks

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

    private static <T extends Block> DeferredBlock<T> registerDepED_ColoredPlanks(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DEPED_COLORED_PLANKS.register(name, block);
        registerDepED_ColoredPlankItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerDepED_ColoredPlankItem(String name, DeferredBlock<T> block) {
        DepED_CoreUpgrades.DPMG_CORE_UPGRADES.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerDPMG_BlockPlaceables(IEventBus eventBus) {
        DEPED_COLORED_PLANKS.register(eventBus);
    }
}
