package net.dpmg.deped_matatag_neoforged.block;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreUpgrades;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DepED_ColoredPlanks {
    public static final DeferredRegister.Blocks DEPED_COLORED_PLANKS = DeferredRegister.createBlocks(DepEDMatatagNeoForgeEdition.MOD_ID);

    //White Oak Planks
    public static final DeferredBlock<Block> WHITE_OAK_PLANKS = registerDepED_ColoredPlanks("white_oak_planks", () -> new Block(BlockBehaviour.Properties.of()
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> WHITE_OAK_STAIRS = registerDepED_ColoredPlanks("white_oak_stairs", () -> new StairBlock(DepED_ColoredPlanks.WHITE_OAK_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of().strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> WHITE_OAK_SLAB = registerDepED_ColoredPlanks("white_oak_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> WHITE_OAK_WALL = registerDepED_ColoredPlanks("white_oak_wall", () -> new WallBlock(BlockBehaviour.Properties.of()
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> WHITE_OAK_FENCE = registerDepED_ColoredPlanks("white_oak_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> WHITE_OAK_FENCE_GATE = registerDepED_ColoredPlanks("white_oak_fence_gate", () -> new FenceGateBlock(WoodType.OAK,
            BlockBehaviour.Properties.of().strength(2f, 3f).sound(SoundType.WOOD)));

    //Light Gray Oak Planks
    public static final DeferredBlock<Block> LIGHT_GRAY_OAK_PLANKS = registerDepED_ColoredPlanks("light_gray_oak_planks", () -> new Block(BlockBehaviour.Properties.of()
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_OAK_STAIRS = registerDepED_ColoredPlanks("light_gray_oak_stairs", () -> new StairBlock(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of().strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_OAK_SLAB = registerDepED_ColoredPlanks("light_gray_oak_slab", () -> new SlabBlock(BlockBehaviour.Properties.of()
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_OAK_WALL = registerDepED_ColoredPlanks("light_gray_oak_wall", () -> new WallBlock(BlockBehaviour.Properties.of()
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> LIGHT_GRAY_OAK_FENCE = registerDepED_ColoredPlanks("light_gray_oak_fence", () -> new FenceBlock(BlockBehaviour.Properties.of()
            .strength(2f, 3f).sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> LIGHT_GRAY_OAK_FENCE_GATE = registerDepED_ColoredPlanks("light_gray_oak_fence_gate", () -> new FenceGateBlock(WoodType.OAK,
            BlockBehaviour.Properties.of().strength(2f, 3f).sound(SoundType.WOOD)));

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
