package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.block.DepED_BlockPlaceables;
import net.dpmg.deped_matatag_neoforged.block.DepED_ColoredPlanks;
import net.dpmg.deped_matatag_neoforged.block.DepED_OreSector;
import net.dpmg.deped_matatag_neoforged.item.DepED_MineralItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;
import java.util.stream.Stream;

public class DepED_BlockLootTableProvider extends BlockLootSubProvider {
    protected DepED_BlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        //White Oak Planks
        dropSelf(DepED_ColoredPlanks.WHITE_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.WHITE_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.WHITE_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.WHITE_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.WHITE_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.WHITE_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.WHITE_OAK_FENCE_GATE.get());

        //Light Gray Oak Planks
        dropSelf(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.LIGHT_GRAY_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.LIGHT_GRAY_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.LIGHT_GRAY_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.LIGHT_GRAY_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE_GATE.get());

        //Gray Oak Planks
        dropSelf(DepED_ColoredPlanks.GRAY_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.GRAY_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.GRAY_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.GRAY_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.GRAY_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.GRAY_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.GRAY_OAK_FENCE_GATE.get());

        //Black Oak Planks
        dropSelf(DepED_ColoredPlanks.BLACK_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.BLACK_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.BLACK_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.BLACK_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.BLACK_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.BLACK_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.BLACK_OAK_FENCE_GATE.get());

        //Brown Oak Planks
        dropSelf(DepED_ColoredPlanks.BROWN_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.BROWN_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.BROWN_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.BROWN_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.BROWN_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.BROWN_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.BROWN_OAK_FENCE_GATE.get());

        //Red Oak Planks
        dropSelf(DepED_ColoredPlanks.RED_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.RED_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.RED_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.RED_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.RED_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.RED_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.RED_OAK_FENCE_GATE.get());

        //Orange Oak Planks
        dropSelf(DepED_ColoredPlanks.ORANGE_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.ORANGE_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.ORANGE_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.ORANGE_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.ORANGE_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.ORANGE_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.ORANGE_OAK_FENCE_GATE.get());

        //Yellow Oak Planks
        dropSelf(DepED_ColoredPlanks.YELLOW_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.YELLOW_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.YELLOW_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.YELLOW_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.YELLOW_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.YELLOW_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.YELLOW_OAK_FENCE_GATE.get());

        //Lime Oak Planks
        dropSelf(DepED_ColoredPlanks.LIME_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.LIME_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.LIME_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.LIME_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.LIME_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.LIME_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.LIME_OAK_FENCE_GATE.get());

        //Green Oak Planks
        dropSelf(DepED_ColoredPlanks.GREEN_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.GREEN_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.GREEN_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.GREEN_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.GREEN_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.GREEN_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.GREEN_OAK_FENCE_GATE.get());

        //Cyan Oak Planks
        dropSelf(DepED_ColoredPlanks.CYAN_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.CYAN_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.CYAN_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.CYAN_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.CYAN_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.CYAN_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.CYAN_OAK_FENCE_GATE.get());

        //Light Blue Oak Planks
        dropSelf(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.LIGHT_BLUE_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.LIGHT_BLUE_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.LIGHT_BLUE_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.LIGHT_BLUE_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.LIGHT_BLUE_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.LIGHT_BLUE_OAK_FENCE_GATE.get());

        //Blue Oak Planks
        dropSelf(DepED_ColoredPlanks.BLUE_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.BLUE_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.BLUE_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.BLUE_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.BLUE_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.BLUE_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.BLUE_OAK_FENCE_GATE.get());

        //Purple Oak Planks
        dropSelf(DepED_ColoredPlanks.PURPLE_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.PURPLE_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.PURPLE_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.PURPLE_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.PURPLE_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.PURPLE_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.PURPLE_OAK_FENCE_GATE.get());

        //Magenta Oak Planks
        dropSelf(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.MAGENTA_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.MAGENTA_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.MAGENTA_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.MAGENTA_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.MAGENTA_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.MAGENTA_OAK_FENCE_GATE.get());

        //Pink Oak Planks
        dropSelf(DepED_ColoredPlanks.PINK_OAK_PLANKS.get());
        dropSelf(DepED_ColoredPlanks.PINK_OAK_STAIRS.get());
        add(DepED_ColoredPlanks.PINK_OAK_SLAB.get(), block -> createSlabItemTable(DepED_ColoredPlanks.PINK_OAK_SLAB.get()));
        dropSelf(DepED_ColoredPlanks.PINK_OAK_WALL.get());
        dropSelf(DepED_ColoredPlanks.PINK_OAK_FENCE.get());
        dropSelf(DepED_ColoredPlanks.PINK_OAK_FENCE_GATE.get());

        //DepED BlockPlaceables - DepED Variants
        dropSelf(DepED_BlockPlaceables.DEPED_BLOCK.get());
        dropSelf(DepED_BlockPlaceables.DEPED_STAIRS.get());
        add(DepED_BlockPlaceables.DEPED_SLAB.get(), block -> createSlabItemTable(DepED_BlockPlaceables.DEPED_SLAB.get()));
        dropSelf(DepED_BlockPlaceables.DEPED_WALL.get());

        //DepED BlockPlaceables - GMATHS Variants
        dropSelf(DepED_BlockPlaceables.BLOCK_OF_GMATHS.get());
        dropSelf(DepED_BlockPlaceables.GMATHS_STAIRS.get());
        add(DepED_BlockPlaceables.GMATHS_SLAB.get(), block -> createSlabItemTable(DepED_BlockPlaceables.GMATHS_SLAB.get()));
        dropSelf(DepED_BlockPlaceables.GMATHS_WALL.get());

        //DepED BlockPlaceables - GMANHS Variants
        dropSelf(DepED_BlockPlaceables.BLOCK_OF_GMANHS.get());
        dropSelf(DepED_BlockPlaceables.GMANHS_STAIRS.get());
        add(DepED_BlockPlaceables.GMANHS_SLAB.get(), block -> createSlabItemTable(DepED_BlockPlaceables.GMANHS_SLAB.get()));
        dropSelf(DepED_BlockPlaceables.GMANHS_WALL.get());

        //DepED BlockPlaceables - SJCHS Variants
        dropSelf(DepED_BlockPlaceables.SJCHS_BLOCK.get());
        dropSelf(DepED_BlockPlaceables.SJCHS_STAIRS.get());
        add(DepED_BlockPlaceables.SJCHS_SLAB.get(), block -> createSlabItemTable(DepED_BlockPlaceables.SJCHS_SLAB.get()));
        dropSelf(DepED_BlockPlaceables.SJCHS_WALL.get());

        //DepED BlockPlaceables - Misc
        dropSelf(DepED_BlockPlaceables.SIR_ELIE_BLOCK.get());
        dropSelf(DepED_BlockPlaceables.SIR_ELIE_BLOCK_BODY.get());
        dropSelf(DepED_BlockPlaceables.THE_GMATHS_TORCH.get());
        dropSelf(DepED_BlockPlaceables.YES_O.get());

        dropSelf(DepED_BlockPlaceables.SUGARCANE_BLOCK.get());
        dropSelf(DepED_BlockPlaceables.BAKED_SUGARCANE_BLOCK.get());

        //DepED OreSector - Raw Materials
        dropSelf(DepED_OreSector.RAW_DEPED_BLOCK.get());
        dropSelf(DepED_OreSector.RAW_GMATHS_BLOCK.get());
        dropSelf(DepED_OreSector.RAW_GMANHS_BLOCK.get());

        //DepED OreSector - Ores
        add(DepED_OreSector.DEPED_ORE.get(), block -> createMultipleOreDrops(DepED_OreSector.DEPED_ORE.get(), DepED_MineralItems.RAW_DEPED.get(), 1, 4));
        add(DepED_OreSector.DEEPSLATE_DEPED_ORE.get(), block -> createMultipleOreDrops(DepED_OreSector.DEEPSLATE_DEPED_ORE.get(), DepED_MineralItems.RAW_DEPED.get(), 1, 4));
        add(DepED_OreSector.GMATHS_ORE.get(), block -> createMultipleOreDrops(DepED_OreSector.GMATHS_ORE.get(), DepED_MineralItems.RAW_GMATHS.get(), 1, 4));
        add(DepED_OreSector.DEEPSLATE_GMATHS_ORE.get(), block -> createMultipleOreDrops(DepED_OreSector.DEEPSLATE_GMATHS_ORE.get(), DepED_MineralItems.RAW_GMATHS.get(), 1, 4));
        add(DepED_OreSector.GMANHS_ORE.get(), block -> createMultipleOreDrops(DepED_OreSector.GMANHS_ORE.get(), DepED_MineralItems.RAW_GMANHS.get(), 1, 4));
        add(DepED_OreSector.DEEPSLATE_GMANHS_ORE.get(), block -> createMultipleOreDrops(DepED_OreSector.DEEPSLATE_GMANHS_ORE.get(), DepED_MineralItems.RAW_GMANHS.get(), 1, 4));

    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Stream.of(

                //Grouped Package
                DepED_BlockPlaceables.DEPED_BLOCKS.getEntries().stream(),
                DepED_ColoredPlanks.DEPED_COLORED_PLANKS.getEntries().stream(),
                DepED_OreSector.DEPED_ORE_RAW_MATERIALS.getEntries().stream()

        ).flatMap(stream -> stream.map(Holder::value))::iterator;
    }
}
