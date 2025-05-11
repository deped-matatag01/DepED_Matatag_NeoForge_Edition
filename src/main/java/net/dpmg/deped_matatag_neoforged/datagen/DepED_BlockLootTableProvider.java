package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.block.DepED_BlockPlaceables;
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

        //DepED BlockPlaceables - DepED Variants
        dropSelf(DepED_BlockPlaceables.DEPED_BLOCK.get());
        dropSelf(DepED_BlockPlaceables.DEPED_STAIRS.get());
        add(DepED_BlockPlaceables.DEPED_SLAB.get(), block -> createSlabItemTable(DepED_BlockPlaceables.DEPED_SLAB.get()));
        dropSelf(DepED_BlockPlaceables.DEPED_WALL.get());

        //DepED BlockPlaceables - GMATHS Variants
        dropSelf(DepED_BlockPlaceables.BLOCK_OF_GMATHS.get());

        //DepED BlockPlaceables - GMANHS Variants
        dropSelf(DepED_BlockPlaceables.BLOCK_OF_GMANHS.get());

        //DepED BlockPlaceables - SJCHS Variants
        dropSelf(DepED_BlockPlaceables.SJCHS_BLOCK.get());

        //DepED BlockPlaceables - Misc
        dropSelf(DepED_BlockPlaceables.SIR_ELIE_BLOCK.get());
        dropSelf(DepED_BlockPlaceables.SIR_ELIE_BLOCK_BODY.get());
        dropSelf(DepED_BlockPlaceables.THE_GMATHS_TORCH.get());
        dropSelf(DepED_BlockPlaceables.YES_O.get());

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
                DepED_OreSector.DEPED_ORE_RAW_MATERIALS.getEntries().stream()

        ).flatMap(stream -> stream.map(Holder::value))::iterator;
    }
}
