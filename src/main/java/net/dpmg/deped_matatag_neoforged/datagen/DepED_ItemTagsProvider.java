package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DepED_ItemTagsProvider extends ItemTagsProvider {
    public DepED_ItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, DepEDMatatagNeoForgeEdition.MOD_ID, existingFileHelper);
    }

    //JSON-Based Tagging
    public static final TagKey<Item> DEPED_CORES_TAG = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_cores"));
    public static final TagKey<Item> DEPED_RAW_MINERALS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_cores"));
    public static final TagKey<Item> DEPED_INGOTS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_ingots"));
    public static final TagKey<Item> DEPED_NUGGETS= TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_nuggets"));

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(DEPED_CORES_TAG)
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_core"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmaths_core"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("minecraft", "heavy_core"));

        tag(DEPED_RAW_MINERALS)
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "raw_deped"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "raw_gmaths"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "raw_gmanhs"));

        tag(DEPED_INGOTS)
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_ingot"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmaths_ingot"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_ingot"));

        tag(DEPED_NUGGETS)
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_nugget"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmaths_nugget"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_nugget"));
    }
}
