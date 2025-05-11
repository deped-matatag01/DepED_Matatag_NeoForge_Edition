package net.dpmg.deped_matatag_neoforged.block;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.item.DepED_MineralItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DepED_OreSector {
    public static final DeferredRegister.Blocks DEPED_ORE_RAW_MATERIALS = DeferredRegister.createBlocks(DepEDMatatagNeoForgeEdition.MOD_ID);

    //DepED Ores
    public static final DeferredBlock<Block> DEPED_ORE = register_DepED_OreMinerals("deped_ore", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1.5f, 4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_DEPED_ORE = register_DepED_OreMinerals("deepslate_deped_ore", () -> new Block(BlockBehaviour.Properties.of()
            .strength(3f, 5f).lightLevel(state -> 5).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> GMATHS_ORE = register_DepED_OreMinerals("gmaths_ore", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1.5f, 4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_GMATHS_ORE = register_DepED_OreMinerals("deepslate_gmaths_ore", () -> new Block(BlockBehaviour.Properties.of()
            .strength(3f, 5f).lightLevel(state -> 5).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> GMANHS_ORE = register_DepED_OreMinerals("gmanhs_ore", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1.5f, 4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_GMANHS_ORE = register_DepED_OreMinerals("deepslate_gmanhs_ore", () -> new Block(BlockBehaviour.Properties.of()
            .strength(3f, 5f).lightLevel(state -> 5).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    //DepED Raw Block Materials
    public static final DeferredBlock<Block> RAW_DEPED_BLOCK = register_DepED_OreMinerals("raw_deped_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(2.25f, 5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> RAW_GMATHS_BLOCK = register_DepED_OreMinerals("raw_gmaths_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(2.25f, 5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> RAW_GMANHS_BLOCK = register_DepED_OreMinerals("raw_gmanhs_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(2.25f, 5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    private static <T extends Block> DeferredBlock<T> register_DepED_OreMinerals(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DEPED_ORE_RAW_MATERIALS.register(name, block);
        registerDepED_OreSector(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerDepED_OreSector(String name, DeferredBlock<T> block) {
        DepED_MineralItems.DPMG_MINERAL_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerDPMG_OreSector(IEventBus eventBus) {
        DEPED_ORE_RAW_MATERIALS.register(eventBus);
    }
}
