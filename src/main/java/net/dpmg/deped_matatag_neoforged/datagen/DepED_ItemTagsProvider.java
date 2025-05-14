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
    public static final TagKey<Item> DEPED_CORE_UPGRADE_TEMPLATES_TAG = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_core_upgrade_templates"));
    public static final TagKey<Item> GMANHS_CORE_UPGRADES = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrades"));
    public static final TagKey<Item> KVA_SBO_CORE_UPGRADES = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrades"));
    public static final TagKey<Item> UPHG_CCS_CORE_UPGRADES = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrades"));

    public static final TagKey<Item> DEPED_RAW_MINERALS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_raw_minerals"));
    public static final TagKey<Item> DEPED_INGOTS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_ingots"));
    public static final TagKey<Item> DEPED_NUGGETS= TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_nuggets"));

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(DEPED_CORES_TAG)
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_core"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmaths_core"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "sjchs_core"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "sgii_es_core"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "seta_heas"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("minecraft", "heavy_core"));

        tag(DEPED_CORE_UPGRADE_TEMPLATES_TAG)
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "core_upgrade_tier_1"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "core_upgrade_tier_2"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "core_upgrade_tier_3"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "core_upgrade_tier_4"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "core_upgrade_tier_5"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "core_upgrade_tier_6"));

        tag(GMANHS_CORE_UPGRADES)
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrade_tier_1"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrade_tier_2"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrade_tier_3"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrade_tier_4"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrade_tier_5"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrade_tier_6"));

        tag(KVA_SBO_CORE_UPGRADES)
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrade_tier_1"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrade_tier_2"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrade_tier_3"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrade_tier_4"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrade_tier_5"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrade_tier_6"));

        tag(UPHG_CCS_CORE_UPGRADES)
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrade_tier_1"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrade_tier_2"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrade_tier_3"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrade_tier_4"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrade_tier_5"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrade_tier_6"));


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
