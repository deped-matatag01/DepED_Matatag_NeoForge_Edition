package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_ColoredPlanks;
import net.dpmg.deped_matatag_neoforged.item.DepED_Weaponries;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
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

        //Tools and Armor Weaponries Tagging
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(DepED_Weaponries.DEPED_HELMET.get())
                .add(DepED_Weaponries.DEPED_CHESTPLATE.get())
                .add(DepED_Weaponries.DEPED_LEGGINGS.get())
                .add(DepED_Weaponries.DEPED_BOOTS.get());

        this.tag(ItemTags.HEAD_ARMOR)
                .add(DepED_Weaponries.DEPED_HELMET.get());

        this.tag(ItemTags.CHEST_ARMOR)
                .add(DepED_Weaponries.DEPED_CHESTPLATE.get());

        this.tag(ItemTags.LEG_ARMOR)
                .add(DepED_Weaponries.DEPED_LEGGINGS.get());

        this.tag(ItemTags.FOOT_ARMOR)
                .add(DepED_Weaponries.DEPED_BOOTS.get());

        tag(ItemTags.PLANKS)
                .add(DepED_ColoredPlanks.WHITE_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.GRAY_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.BLACK_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.BROWN_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.RED_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.ORANGE_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.YELLOW_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.LIME_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.GREEN_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.CYAN_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.BLUE_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.PURPLE_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS.asItem())
                .add(DepED_ColoredPlanks.PINK_OAK_PLANKS.asItem());

        tag(ItemTags.WOODEN_STAIRS)
                .add(DepED_ColoredPlanks.WHITE_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.LIGHT_GRAY_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.GRAY_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.BLACK_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.BROWN_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.RED_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.ORANGE_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.YELLOW_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.LIME_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.GREEN_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.CYAN_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.LIGHT_BLUE_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.BLUE_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.PURPLE_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.MAGENTA_OAK_STAIRS.asItem())
                .add(DepED_ColoredPlanks.PINK_OAK_STAIRS.asItem());

        tag(ItemTags.WOODEN_SLABS)
                .add(DepED_ColoredPlanks.WHITE_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.LIGHT_GRAY_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.GRAY_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.BLACK_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.BROWN_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.RED_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.ORANGE_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.YELLOW_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.LIME_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.GREEN_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.CYAN_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.LIGHT_BLUE_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.BLUE_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.PURPLE_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.MAGENTA_OAK_SLAB.asItem())
                .add(DepED_ColoredPlanks.PINK_OAK_SLAB.asItem());

        tag(ItemTags.WOODEN_FENCES)
                .add(DepED_ColoredPlanks.WHITE_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.GRAY_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.BLACK_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.BROWN_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.RED_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.ORANGE_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.YELLOW_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.LIME_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.GREEN_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.CYAN_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.LIGHT_BLUE_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.BLUE_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.PURPLE_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.MAGENTA_OAK_FENCE.asItem())
                .add(DepED_ColoredPlanks.PINK_OAK_FENCE.asItem());

        tag(ItemTags.FENCE_GATES)
                .add(DepED_ColoredPlanks.WHITE_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.GRAY_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.BLACK_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.BROWN_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.RED_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.ORANGE_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.YELLOW_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.LIME_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.GREEN_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.CYAN_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.LIGHT_BLUE_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.BLUE_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.PURPLE_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.MAGENTA_OAK_FENCE_GATE.asItem())
                .add(DepED_ColoredPlanks.PINK_OAK_FENCE_GATE.asItem());

        //JSON-Based Tagging
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
