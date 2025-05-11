package net.dpmg.deped_matatag_neoforged.block;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DepED_BlockPlaceables {
    public static final DeferredRegister.Blocks DEPED_BLOCKS = DeferredRegister.createBlocks(DepEDMatatagNeoForgeEdition.MOD_ID);

    //DepED BlockPlaceables - DepED Variants
    public static final DeferredBlock<Block> DEPED_BLOCK = registerDepED_Blocks("deped_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1.75f, 4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<StairBlock> DEPED_STAIRS = registerDepED_Blocks("deped_stairs", () -> new StairBlock(DepED_BlockPlaceables.DEPED_BLOCK.get().defaultBlockState(),
            BlockBehaviour.Properties.of().strength(1.75f, 4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<SlabBlock> DEPED_SLAB = registerDepED_Blocks("deped_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
            .strength(1.75f, 4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<WallBlock> DEPED_WALL = registerDepED_Blocks("deped_wall", () -> new WallBlock(BlockBehaviour.Properties.of()
            .strength(1.75f, 4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //DepED BlockPlaceables - GMATHS Variants
    public static final DeferredBlock<Block> BLOCK_OF_GMATHS = registerDepED_Blocks("block_of_gmaths", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1.75f, 4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //DepED BlockPlaceables - GMANHS Variants
    public static final DeferredBlock<Block> BLOCK_OF_GMANHS = registerDepED_Blocks("block_of_gmanhs", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1.75f, 4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //DepED BlockPlaceables - GMANHS Variants
    public static final DeferredBlock<Block> SJCHS_BLOCK = registerDepED_Blocks("sjchs_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1.75f, 4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //Misc
    public static final DeferredBlock<Block> SIR_ELIE_BLOCK = registerDepED_Blocks("sir_elie_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1.75f, 4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SIR_ELIE_BLOCK_BODY = registerDepED_Blocks("sir_elie_block_body", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1.75f, 4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> THE_GMATHS_TORCH = registerDepED_Blocks("the_gmaths_torch", () -> new Block(BlockBehaviour.Properties.of()
            .strength(3f, 4f).lightLevel(state -> 15).requiresCorrectToolForDrops().sound(SoundType.LANTERN)));
    public static final DeferredBlock<Block> YES_O = registerDepED_Blocks("yes_o", () -> new Block(BlockBehaviour.Properties.of()
            .strength(0.8f, 1.5f).sound(SoundType.CHERRY_LEAVES)));

    private static <T extends Block> DeferredBlock<T> registerDepED_Blocks(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DEPED_BLOCKS.register(name, block);
        registerDepED_BlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerDepED_BlockItem(String name, DeferredBlock<T> block) {
        DepED_CoreItems.DPMG_CORE_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerDPMG_BlockPlaceables(IEventBus eventBus) {
        DEPED_BLOCKS.register(eventBus);
    }
}
