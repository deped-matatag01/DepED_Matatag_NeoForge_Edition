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
    public static final DeferredBlock<Block> ORANGE_OAK_PLANKS = registerDepED_ColoredPlanks("orange_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> ORANGE_OAK_STAIRS = registerDepED_ColoredPlanks("orange_oak_stairs", () -> flammableStairs(ORANGE_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> ORANGE_OAK_SLAB = registerDepED_ColoredPlanks("orange_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> ORANGE_OAK_WALL = registerDepED_ColoredPlanks("orange_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> ORANGE_OAK_FENCE = registerDepED_ColoredPlanks("orange_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> ORANGE_OAK_FENCE_GATE = registerDepED_ColoredPlanks("orange_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Yellow Oak Planks
    public static final DeferredBlock<Block> YELLOW_OAK_PLANKS = registerDepED_ColoredPlanks("yellow_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> YELLOW_OAK_STAIRS = registerDepED_ColoredPlanks("yellow_oak_stairs", () -> flammableStairs(YELLOW_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> YELLOW_OAK_SLAB = registerDepED_ColoredPlanks("yellow_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> YELLOW_OAK_WALL = registerDepED_ColoredPlanks("yellow_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> YELLOW_OAK_FENCE = registerDepED_ColoredPlanks("yellow_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> YELLOW_OAK_FENCE_GATE = registerDepED_ColoredPlanks("yellow_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Lime Oak Planks
    public static final DeferredBlock<Block> LIME_OAK_PLANKS = registerDepED_ColoredPlanks("lime_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> LIME_OAK_STAIRS = registerDepED_ColoredPlanks("lime_oak_stairs", () -> flammableStairs(LIME_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> LIME_OAK_SLAB = registerDepED_ColoredPlanks("lime_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> LIME_OAK_WALL = registerDepED_ColoredPlanks("lime_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> LIME_OAK_FENCE = registerDepED_ColoredPlanks("lime_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> LIME_OAK_FENCE_GATE = registerDepED_ColoredPlanks("lime_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Green Oak Planks
    public static final DeferredBlock<Block> GREEN_OAK_PLANKS = registerDepED_ColoredPlanks("green_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> GREEN_OAK_STAIRS = registerDepED_ColoredPlanks("green_oak_stairs", () -> flammableStairs(GREEN_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> GREEN_OAK_SLAB = registerDepED_ColoredPlanks("green_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> GREEN_OAK_WALL = registerDepED_ColoredPlanks("green_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> GREEN_OAK_FENCE = registerDepED_ColoredPlanks("green_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> GREEN_OAK_FENCE_GATE = registerDepED_ColoredPlanks("green_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Cyan Oak Planks
    public static final DeferredBlock<Block> CYAN_OAK_PLANKS = registerDepED_ColoredPlanks("cyan_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> CYAN_OAK_STAIRS = registerDepED_ColoredPlanks("cyan_oak_stairs", () -> flammableStairs(CYAN_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> CYAN_OAK_SLAB = registerDepED_ColoredPlanks("cyan_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> CYAN_OAK_WALL = registerDepED_ColoredPlanks("cyan_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> CYAN_OAK_FENCE = registerDepED_ColoredPlanks("cyan_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> CYAN_OAK_FENCE_GATE = registerDepED_ColoredPlanks("cyan_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Light Blue Oak Planks
    public static final DeferredBlock<Block> LIGHT_BLUE_OAK_PLANKS = registerDepED_ColoredPlanks("light_blue_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_OAK_STAIRS = registerDepED_ColoredPlanks("light_blue_oak_stairs", () -> flammableStairs(LIGHT_BLUE_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_OAK_SLAB = registerDepED_ColoredPlanks("light_blue_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_OAK_WALL = registerDepED_ColoredPlanks("light_blue_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> LIGHT_BLUE_OAK_FENCE = registerDepED_ColoredPlanks("light_blue_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> LIGHT_BLUE_OAK_FENCE_GATE = registerDepED_ColoredPlanks("light_blue_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Blue Oak Planks
    public static final DeferredBlock<Block> BLUE_OAK_PLANKS = registerDepED_ColoredPlanks("blue_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> BLUE_OAK_STAIRS = registerDepED_ColoredPlanks("blue_oak_stairs", () -> flammableStairs(BLUE_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> BLUE_OAK_SLAB = registerDepED_ColoredPlanks("blue_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> BLUE_OAK_WALL = registerDepED_ColoredPlanks("blue_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> BLUE_OAK_FENCE = registerDepED_ColoredPlanks("blue_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> BLUE_OAK_FENCE_GATE = registerDepED_ColoredPlanks("blue_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Purple Oak Planks
    public static final DeferredBlock<Block> PURPLE_OAK_PLANKS = registerDepED_ColoredPlanks("purple_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> PURPLE_OAK_STAIRS = registerDepED_ColoredPlanks("purple_oak_stairs", () -> flammableStairs(PURPLE_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> PURPLE_OAK_SLAB = registerDepED_ColoredPlanks("purple_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> PURPLE_OAK_WALL = registerDepED_ColoredPlanks("purple_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> PURPLE_OAK_FENCE = registerDepED_ColoredPlanks("purple_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> PURPLE_OAK_FENCE_GATE = registerDepED_ColoredPlanks("purple_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Magenta Oak Planks
    public static final DeferredBlock<Block> MAGENTA_OAK_PLANKS = registerDepED_ColoredPlanks("magenta_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> MAGENTA_OAK_STAIRS = registerDepED_ColoredPlanks("magenta_oak_stairs", () -> flammableStairs(MAGENTA_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> MAGENTA_OAK_SLAB = registerDepED_ColoredPlanks("magenta_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> MAGENTA_OAK_WALL = registerDepED_ColoredPlanks("magenta_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> MAGENTA_OAK_FENCE = registerDepED_ColoredPlanks("magenta_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> MAGENTA_OAK_FENCE_GATE = registerDepED_ColoredPlanks("magenta_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

    //Pink Oak Planks
    public static final DeferredBlock<Block> PINK_OAK_PLANKS = registerDepED_ColoredPlanks("pink_oak_planks", () -> flammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> PINK_OAK_STAIRS = registerDepED_ColoredPlanks("pink_oak_stairs", () -> flammableStairs(PINK_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> PINK_OAK_SLAB = registerDepED_ColoredPlanks("pink_oak_slab", () -> flammableSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> PINK_OAK_WALL = registerDepED_ColoredPlanks("pink_oak_wall", () -> flammableWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> PINK_OAK_FENCE = registerDepED_ColoredPlanks("pink_oak_fence", () -> flammableFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> PINK_OAK_FENCE_GATE = registerDepED_ColoredPlanks("pink_oak_fence_gate", () -> flammableFenceGate(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)
            .strength(2f, 3f).sound(SoundType.WOOD)));

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

    public static void registerDPMG_ColoredPlanks(IEventBus eventBus) {
        DEPED_COLORED_PLANKS.register(eventBus);
    }
}
