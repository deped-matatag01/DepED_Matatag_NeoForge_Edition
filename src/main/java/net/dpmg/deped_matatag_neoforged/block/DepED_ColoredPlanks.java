package net.dpmg.deped_matatag_neoforged.block;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreUpgrades;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class DepED_ColoredPlanks {
    public static final DeferredRegister.Blocks DEPED_COLORED_PLANKS = DeferredRegister.createBlocks(DepEDMatatagNeoForgeEdition.MOD_ID);

    //White Oak Planks
    public static final DeferredBlock<Block> WHITE_OAK_PLANKS = registerDepED_ColoredPlanks("white_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> WHITE_OAK_STAIRS = registerDepED_ColoredPlanks("white_oak_stairs", () -> flammableStairs(WHITE_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> WHITE_OAK_SLAB = registerDepED_ColoredPlanks("white_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> WHITE_OAK_WALL = registerDepED_ColoredPlanks("white_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> WHITE_OAK_FENCE = registerDepED_ColoredPlanks("white_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> WHITE_OAK_FENCE_GATE = registerDepED_ColoredPlanks("white_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Light Gray Oak Planks
    public static final DeferredBlock<Block> LIGHT_GRAY_OAK_PLANKS = registerDepED_ColoredPlanks("light_gray_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_OAK_STAIRS = registerDepED_ColoredPlanks("light_gray_oak_stairs", () -> flammableStairs(LIGHT_GRAY_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_OAK_SLAB = registerDepED_ColoredPlanks("light_gray_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_OAK_WALL = registerDepED_ColoredPlanks("light_gray_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_OAK_FENCE = registerDepED_ColoredPlanks("light_gray_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_OAK_FENCE_GATE = registerDepED_ColoredPlanks("light_gray_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Gray Oak Planks
    public static final DeferredBlock<Block> GRAY_OAK_PLANKS = registerDepED_ColoredPlanks("gray_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> GRAY_OAK_STAIRS = registerDepED_ColoredPlanks("gray_oak_stairs", () -> flammableStairs(GRAY_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> GRAY_OAK_SLAB = registerDepED_ColoredPlanks("gray_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> GRAY_OAK_WALL = registerDepED_ColoredPlanks("gray_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> GRAY_OAK_FENCE = registerDepED_ColoredPlanks("gray_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> GRAY_OAK_FENCE_GATE = registerDepED_ColoredPlanks("gray_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Black Oak Planks
    public static final DeferredBlock<Block> BLACK_OAK_PLANKS = registerDepED_ColoredPlanks("black_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> BLACK_OAK_STAIRS = registerDepED_ColoredPlanks("black_oak_stairs", () -> flammableStairs(BLACK_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> BLACK_OAK_SLAB = registerDepED_ColoredPlanks("black_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> BLACK_OAK_WALL = registerDepED_ColoredPlanks("black_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> BLACK_OAK_FENCE = registerDepED_ColoredPlanks("black_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> BLACK_OAK_FENCE_GATE = registerDepED_ColoredPlanks("black_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Brown Oak Planks
    public static final DeferredBlock<Block> BROWN_OAK_PLANKS = registerDepED_ColoredPlanks("brown_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> BROWN_OAK_STAIRS = registerDepED_ColoredPlanks("brown_oak_stairs", () -> flammableStairs(BROWN_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> BROWN_OAK_SLAB = registerDepED_ColoredPlanks("brown_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> BROWN_OAK_WALL = registerDepED_ColoredPlanks("brown_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> BROWN_OAK_FENCE = registerDepED_ColoredPlanks("brown_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> BROWN_OAK_FENCE_GATE = registerDepED_ColoredPlanks("brown_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Red Oak Planks
    public static final DeferredBlock<Block> RED_OAK_PLANKS = registerDepED_ColoredPlanks("red_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> RED_OAK_STAIRS = registerDepED_ColoredPlanks("red_oak_stairs", () -> flammableStairs(RED_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> RED_OAK_SLAB = registerDepED_ColoredPlanks("red_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> RED_OAK_WALL = registerDepED_ColoredPlanks("red_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> RED_OAK_FENCE = registerDepED_ColoredPlanks("red_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> RED_OAK_FENCE_GATE = registerDepED_ColoredPlanks("red_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

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


    private static final int FLAMMABILITY = 20;
    private static final int FIRE_SPREAD = 5;

    private static BlockBehaviour.Properties woodProps(Block base) {
        return BlockBehaviour.Properties.ofFullCopy(base).strength(2f, 3f).sound(SoundType.WOOD);
    }

    private static Block flammableBlock(BlockBehaviour.Properties props) {
        return new Block(props) {
            @Override public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return true; }
            @Override public int getFlammability(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return FLAMMABILITY; }
            @Override public int getFireSpreadSpeed(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return FIRE_SPREAD; }
        };
    }

    private static StairBlock flammableStairs(BlockState baseState, BlockBehaviour.Properties props) {
        return new StairBlock(baseState, props) {
            @Override public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return true; }
            @Override public int getFlammability(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return FLAMMABILITY; }
            @Override public int getFireSpreadSpeed(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return FIRE_SPREAD; }
        };
    }

    private static SlabBlock flammableSlab(BlockBehaviour.Properties props) {
        return new SlabBlock(props) {
            @Override public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return true; }
            @Override public int getFlammability(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return FLAMMABILITY; }
            @Override public int getFireSpreadSpeed(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return FIRE_SPREAD; }
        };
    }

    private static WallBlock flammableWall(BlockBehaviour.Properties props) {
        return new WallBlock(props) {
            @Override public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return true; }
            @Override public int getFlammability(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return FLAMMABILITY; }
            @Override public int getFireSpreadSpeed(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return FIRE_SPREAD; }
        };
    }

    private static FenceBlock flammableFence(BlockBehaviour.Properties props) {
        return new FenceBlock(props) {
            @Override public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return true; }
            @Override public int getFlammability(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return FLAMMABILITY; }
            @Override public int getFireSpreadSpeed(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return FIRE_SPREAD; }
        };
    }

    private static FenceGateBlock flammableFenceGate(WoodType woodType, BlockBehaviour.Properties props) {
        return new FenceGateBlock(woodType, props) {
            @Override public boolean isFlammable(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return true; }
            @Override public int getFlammability(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return FLAMMABILITY; }
            @Override public int getFireSpreadSpeed(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction dir) { return FIRE_SPREAD; }
        };
    }

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
