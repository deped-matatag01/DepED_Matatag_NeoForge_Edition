package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_BlockPlaceables;
import net.dpmg.deped_matatag_neoforged.block.DepED_OreSector;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreItems;
import net.dpmg.deped_matatag_neoforged.item.DepED_MineralItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class DepED_RecipeProvider extends RecipeProvider implements IConditionBuilder {
    public DepED_RecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //DepED Mineral Smeltables & Recipes
        List<ItemLike> DEPED_MINERAL_SMELTABLES = List.of(
                DepED_MineralItems.RAW_DEPED,
                DepED_OreSector.DEPED_ORE,
                DepED_OreSector.DEEPSLATE_DEPED_ORE);

        oreSmelting(recipeOutput, DEPED_MINERAL_SMELTABLES, RecipeCategory.MISC, DepED_MineralItems.DEPED_INGOT.get(), 2.5f, 200, "deped_ingot");
        oreBlasting(recipeOutput, DEPED_MINERAL_SMELTABLES, RecipeCategory.MISC, DepED_MineralItems.DEPED_INGOT.get(), 5f, 100, "deped_ingot");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DepED_MineralItems.DEPED_NUGGET.get(), 9)
                .requires(DepED_MineralItems.DEPED_INGOT)
                .unlockedBy("has_deped_ingot", has(DepED_MineralItems.DEPED_INGOT))
                .save(recipeOutput, "deped_matatag:deped_nugget_from_deped_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_MineralItems.DEPED_INGOT.get())
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .define('D', DepED_MineralItems.DEPED_NUGGET.get())
                .unlockedBy("has_deped_nugget", has(DepED_MineralItems.DEPED_NUGGET))
                .save(recipeOutput, "deped_matatag:deped_ingot_from_deped_nugget");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DepED_MineralItems.RAW_DEPED.get(), 9)
                .requires(DepED_OreSector.RAW_DEPED_BLOCK)
                .unlockedBy("has_raw_deped_block", has(DepED_OreSector.RAW_DEPED_BLOCK))
                .save(recipeOutput, "deped_matatag:raw_deped_from_raw_deped_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_OreSector.RAW_DEPED_BLOCK.get())
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .define('D', DepED_MineralItems.RAW_DEPED.get())
                .unlockedBy("has_raw_deped", has(DepED_MineralItems.RAW_DEPED))
                .save(recipeOutput, "deped_matatag:raw_deped_block_from_raw_deped");

        //DepED_BlockPlaceables - DepED Variant Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.DEPED_BLOCK.get(), 6)
                .pattern("WSW")
                .pattern("SCS")
                .pattern("WSW")
                .define('W', Ingredient.of(ItemTags.STONE_TOOL_MATERIALS))
                .define('C', DepED_CoreItems.DEPED_CORE)
                .define('S', DepED_MineralItems.DEPED_INGOT)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput);

        stairBuilder(DepED_BlockPlaceables.DEPED_STAIRS.get(), Ingredient.of(DepED_BlockPlaceables.DEPED_BLOCK))
                .unlockedBy("has_deped_block", has(DepED_BlockPlaceables.DEPED_BLOCK))
                .save(recipeOutput, "deped_matatag:deped_stairs_from_crafting");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.DEPED_SLAB.get(), 6)
                .pattern("SSS")
                .define('S', DepED_BlockPlaceables.DEPED_BLOCK)
                .unlockedBy("has_deped_block", has(DepED_BlockPlaceables.DEPED_BLOCK))
                .save(recipeOutput, "deped_matatag:deped_slab_from_crafting");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.DEPED_WALL.get(), 6)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', DepED_BlockPlaceables.DEPED_BLOCK)
                .unlockedBy("has_deped_block", has(DepED_BlockPlaceables.DEPED_BLOCK))
                .save(recipeOutput, "deped_matatag:deped_wall_from_crafting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DepED_BlockPlaceables.DEPED_BLOCK), RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.DEPED_STAIRS, 2)
                .unlockedBy("has_deped_block", has(DepED_BlockPlaceables.DEPED_BLOCK))
                .save(recipeOutput, "deped_matatag:deped_stairs_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DepED_BlockPlaceables.DEPED_BLOCK), RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.DEPED_SLAB, 2)
                .unlockedBy("has_deped_block", has(DepED_BlockPlaceables.DEPED_BLOCK))
                .save(recipeOutput, "deped_matatag:deped_slab_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DepED_BlockPlaceables.DEPED_BLOCK), RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.DEPED_WALL)
                .unlockedBy("has_deped_block", has(DepED_BlockPlaceables.DEPED_BLOCK))
                .save(recipeOutput, "deped_matatag:deped_wall_from_stonecutting");

        //GMATHS Mineral Smeltables & Recipes
        List<ItemLike> GMATHS_MINERAL_SMELTABLES = List.of(
                DepED_MineralItems.RAW_GMATHS,
                DepED_OreSector.GMATHS_ORE,
                DepED_OreSector.DEEPSLATE_GMATHS_ORE);

        oreSmelting(recipeOutput, GMATHS_MINERAL_SMELTABLES, RecipeCategory.MISC, DepED_MineralItems.GMATHS_INGOT.get(), 2.5f, 200, "gmaths_ingot");
        oreBlasting(recipeOutput, GMATHS_MINERAL_SMELTABLES, RecipeCategory.MISC, DepED_MineralItems.GMATHS_INGOT.get(), 5f, 100, "gmaths_ingot");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DepED_MineralItems.GMATHS_NUGGET.get(), 9)
                .requires(DepED_MineralItems.GMATHS_INGOT)
                .unlockedBy("has_gmaths_ingot", has(DepED_MineralItems.GMATHS_INGOT))
                .save(recipeOutput, "deped_matatag:gmaths_nugget_from_gmaths_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_MineralItems.GMATHS_INGOT.get())
                .pattern("GGG")
                .pattern("GGG")
                .pattern("GGG")
                .define('G', DepED_MineralItems.GMATHS_NUGGET.get())
                .unlockedBy("has_gmaths_nugget", has(DepED_MineralItems.GMATHS_NUGGET))
                .save(recipeOutput, "deped_matatag:gmaths_ingot_from_gmaths_nugget");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DepED_MineralItems.RAW_GMATHS.get(), 9)
                .requires(DepED_OreSector.RAW_GMATHS_BLOCK)
                .unlockedBy("has_raw_gmaths_block", has(DepED_OreSector.RAW_GMATHS_BLOCK))
                .save(recipeOutput, "deped_matatag:raw_gmaths_from_raw_gmaths_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_OreSector.RAW_GMATHS_BLOCK.get())
                .pattern("GGG")
                .pattern("GGG")
                .pattern("GGG")
                .define('G', DepED_MineralItems.RAW_GMATHS.get())
                .unlockedBy("has_raw_gmaths", has(DepED_MineralItems.RAW_GMATHS))
                .save(recipeOutput, "deped_matatag:raw_gmaths_block_from_raw_gmaths");

        //DepED_BlockPlaceables - GMATHS Variant Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.BLOCK_OF_GMATHS.get(), 6)
                .pattern("WSW")
                .pattern("SCS")
                .pattern("WSW")
                .define('W',Items.NETHERRACK)
                .define('C', DepED_CoreItems.GMATHS_CORE)
                .define('S', Ingredient.of(ItemTags.SLABS))
                .unlockedBy("has_gmaths_core", has(DepED_CoreItems.GMATHS_CORE))
                .save(recipeOutput);

        stairBuilder(DepED_BlockPlaceables.GMATHS_STAIRS.get(), Ingredient.of(DepED_BlockPlaceables.BLOCK_OF_GMATHS))
                .unlockedBy("has_gmaths_block", has(DepED_BlockPlaceables.BLOCK_OF_GMATHS))
                .save(recipeOutput, "deped_matatag:gmaths_stairs_from_crafting");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.GMATHS_SLAB.get(), 6)
                .pattern("SSS")
                .define('S', DepED_BlockPlaceables.BLOCK_OF_GMATHS)
                .unlockedBy("has_gmaths_block", has(DepED_BlockPlaceables.BLOCK_OF_GMATHS))
                .save(recipeOutput, "deped_matatag:gmaths_slab_from_crafting");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.GMATHS_WALL.get(), 6)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', DepED_BlockPlaceables.BLOCK_OF_GMATHS)
                .unlockedBy("has_gmaths_block", has(DepED_BlockPlaceables.BLOCK_OF_GMATHS))
                .save(recipeOutput, "deped_matatag:gmaths_wall_from_crafting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DepED_BlockPlaceables.BLOCK_OF_GMATHS), RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.GMATHS_STAIRS, 2)
                .unlockedBy("has_gmaths_block", has(DepED_BlockPlaceables.BLOCK_OF_GMATHS))
                .save(recipeOutput, "deped_matatag:gmaths_stairs_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DepED_BlockPlaceables.BLOCK_OF_GMATHS), RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.GMATHS_SLAB, 2)
                .unlockedBy("has_gmaths_block", has(DepED_BlockPlaceables.BLOCK_OF_GMATHS))
                .save(recipeOutput, "deped_matatag:gmaths_slab_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DepED_BlockPlaceables.BLOCK_OF_GMATHS), RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.GMATHS_WALL)
                .unlockedBy("has_gmaths_block", has(DepED_BlockPlaceables.BLOCK_OF_GMATHS))
                .save(recipeOutput, "deped_matatag:gmaths_wall_from_stonecutting");

        //GMANHS Mineral Smeltables & Recipes
        List<ItemLike> GMANHS_MINERAL_SMELTABLES = List.of(
                DepED_MineralItems.RAW_GMANHS,
                DepED_OreSector.GMANHS_ORE,
                DepED_OreSector.DEEPSLATE_GMANHS_ORE);

        oreSmelting(recipeOutput, GMANHS_MINERAL_SMELTABLES, RecipeCategory.MISC, DepED_MineralItems.GMANHS_INGOT.get(), 2.5f, 200, "gmanhs_ingot");
        oreBlasting(recipeOutput, GMANHS_MINERAL_SMELTABLES, RecipeCategory.MISC, DepED_MineralItems.GMANHS_INGOT.get(), 5f, 100, "gmanhs_ingot");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DepED_MineralItems.GMANHS_NUGGET.get(), 9)
                .requires(DepED_MineralItems.GMANHS_INGOT)
                .unlockedBy("has_gmanhs_ingot", has(DepED_MineralItems.GMANHS_INGOT))
                .save(recipeOutput, "deped_matatag:gmanhs_nugget_from_gmanhs_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_MineralItems.GMANHS_INGOT.get())
                .pattern("GGG")
                .pattern("GGG")
                .pattern("GGG")
                .define('G', DepED_MineralItems.GMANHS_NUGGET.get())
                .unlockedBy("has_gmanhs_nugget", has(DepED_MineralItems.GMANHS_NUGGET))
                .save(recipeOutput, "deped_matatag:gmanhs_ingot_from_gmanhs_nugget");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DepED_MineralItems.RAW_GMANHS.get(), 9)
                .requires(DepED_OreSector.RAW_GMANHS_BLOCK)
                .unlockedBy("has_raw_gmanhs_block", has(DepED_OreSector.RAW_GMANHS_BLOCK))
                .save(recipeOutput, "deped_matatag:raw_gmanhs_from_raw_gmanhs_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_OreSector.RAW_GMANHS_BLOCK.get())
                .pattern("GGG")
                .pattern("GGG")
                .pattern("GGG")
                .define('G', DepED_MineralItems.RAW_GMANHS.get())
                .unlockedBy("has_raw_gmanhs", has(DepED_MineralItems.RAW_GMANHS))
                .save(recipeOutput, "deped_matatag:raw_gmanhs_block_from_raw_gmanhs");

        //DepED_BlockPlaceables - GMANHS Variant Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.BLOCK_OF_GMANHS.get(), 6)
                .pattern("WSW")
                .pattern("SCS")
                .pattern("WSW")
                .define('W',Items.COBBLESTONE)
                .define('C', DepED_CoreItems.GMANHS_CORE)
                .define('S', Ingredient.of(ItemTags.SLABS))
                .unlockedBy("has_gmanhs_core", has(DepED_CoreItems.GMANHS_CORE))
                .save(recipeOutput);

        stairBuilder(DepED_BlockPlaceables.GMANHS_STAIRS.get(), Ingredient.of(DepED_BlockPlaceables.BLOCK_OF_GMANHS))
                .unlockedBy("has_gmanhs_block", has(DepED_BlockPlaceables.BLOCK_OF_GMANHS))
                .save(recipeOutput, "deped_matatag:gmanhs_stairs_from_crafting");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.GMANHS_SLAB.get(), 6)
                .pattern("SSS")
                .define('S', DepED_BlockPlaceables.BLOCK_OF_GMANHS)
                .unlockedBy("has_gmanhs_block", has(DepED_BlockPlaceables.BLOCK_OF_GMANHS))
                .save(recipeOutput, "deped_matatag:gmanhs_slab_from_crafting");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.GMANHS_WALL.get(), 6)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', DepED_BlockPlaceables.BLOCK_OF_GMANHS)
                .unlockedBy("has_gmanhs_block", has(DepED_BlockPlaceables.BLOCK_OF_GMANHS))
                .save(recipeOutput, "deped_matatag:gmanhs_wall_from_crafting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DepED_BlockPlaceables.BLOCK_OF_GMANHS), RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.GMANHS_STAIRS, 2)
                .unlockedBy("has_gmanhs_block", has(DepED_BlockPlaceables.BLOCK_OF_GMANHS))
                .save(recipeOutput, "deped_matatag:gmanhs_stairs_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DepED_BlockPlaceables.BLOCK_OF_GMANHS), RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.GMANHS_SLAB, 2)
                .unlockedBy("has_gmanhs_block", has(DepED_BlockPlaceables.BLOCK_OF_GMANHS))
                .save(recipeOutput, "deped_matatag:gmanhs_slab_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DepED_BlockPlaceables.BLOCK_OF_GMANHS), RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.GMANHS_WALL)
                .unlockedBy("has_gmanhs_block", has(DepED_BlockPlaceables.BLOCK_OF_GMANHS))
                .save(recipeOutput, "deped_matatag:gmanhs_wall_from_stonecutting");

        //DepED_BlockPlaceables - SJCHS Variant Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.SJCHS_BLOCK.get(), 6)
                .pattern("WSW")
                .pattern("SCS")
                .pattern("WSW")
                .define('W',Items.MOSSY_COBBLESTONE)
                .define('C', DepED_CoreItems.SJCHS_CORE)
                .define('S', Ingredient.of(ItemTags.SLABS))
                .unlockedBy("has_sjchs_core", has(DepED_CoreItems.SJCHS_CORE))
                .save(recipeOutput);

        stairBuilder(DepED_BlockPlaceables.SJCHS_STAIRS.get(), Ingredient.of(DepED_BlockPlaceables.SJCHS_BLOCK))
                .unlockedBy("has_sjchs_block", has(DepED_BlockPlaceables.SJCHS_BLOCK))
                .save(recipeOutput, "deped_matatag:sjchs_stairs_from_crafting");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.SJCHS_SLAB.get(), 6)
                .pattern("SSS")
                .define('S', DepED_BlockPlaceables.SJCHS_BLOCK)
                .unlockedBy("has_sjchs_block", has(DepED_BlockPlaceables.SJCHS_BLOCK))
                .save(recipeOutput, "deped_matatag:sjchs_slab_from_crafting");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.SJCHS_WALL.get(), 6)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', DepED_BlockPlaceables.SJCHS_BLOCK)
                .unlockedBy("has_sjchs_block", has(DepED_BlockPlaceables.SJCHS_BLOCK))
                .save(recipeOutput, "deped_matatag:sjchs_wall_from_crafting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DepED_BlockPlaceables.SJCHS_BLOCK), RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.SJCHS_STAIRS, 2)
                .unlockedBy("has_sjchs_block", has(DepED_BlockPlaceables.SJCHS_BLOCK))
                .save(recipeOutput, "deped_matatag:sjchs_stairs_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DepED_BlockPlaceables.SJCHS_BLOCK), RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.SJCHS_SLAB, 2)
                .unlockedBy("has_sjchs_block", has(DepED_BlockPlaceables.SJCHS_BLOCK))
                .save(recipeOutput, "deped_matatag:sjchs_slab_from_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DepED_BlockPlaceables.SJCHS_BLOCK), RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.SJCHS_WALL)
                .unlockedBy("has_sjchs_block", has(DepED_BlockPlaceables.SJCHS_BLOCK))
                .save(recipeOutput, "deped_matatag:sjchs_wall_from_stonecutting");

        //DepED_BlockPlaceables - Misc

        //DepED_CoreItems
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreItems.DEPED_CORE, 8)
                .pattern("DAD")
                .pattern("AGA")
                .pattern("DAD")
                .define('D', DepED_MineralItems.DEPED_INGOT)
                .define('A', Items.IRON_NUGGET)
                .define('G', Items.COPPER_BLOCK)
                .unlockedBy("has_deped_ingot", has(DepED_MineralItems.DEPED_INGOT))
                .save(recipeOutput, "deped_matatag:deped_core_recipe");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreItems.GMATHS_CORE, 4)
                .pattern("GBG")
                .pattern("BCB")
                .pattern("GBG")
                .define('G', DepED_MineralItems.GMATHS_INGOT)
                .define('B', Items.IRON_NUGGET)
                .define('C', DepED_CoreItems.DEPED_CORE)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput, "deped_matatag:gmaths_core_recipe");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreItems.GMANHS_CORE, 4)
                .pattern("GBG")
                .pattern("BCB")
                .pattern("GBG")
                .define('G', DepED_MineralItems.GMANHS_INGOT)
                .define('B', Items.LIME_DYE)
                .define('C', DepED_CoreItems.DEPED_CORE)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput, "deped_matatag:gmanhs_core_recipe");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreItems.KVA_SBO_CORE, 4)
                .pattern("LDL")
                .pattern("CEC")
                .pattern("LDL")
                .define('L', Items.LAPIS_BLOCK)
                .define('E', DepED_CoreItems.DEPED_CORE)
                .define('C', Items.IRON_INGOT)
                .define('D', Items.DIAMOND)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput, "deped_matatag:kva_sbo_core_recipe");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreItems.SJCHS_CORE, 4)
                .pattern("MCM")
                .pattern("OGO")
                .pattern("MCM")
                .define('M', Items.LEATHER)
                .define('O', Items.PAPER)
                .define('G', DepED_CoreItems.DEPED_CORE)
                .define('C', Items.BOOK)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput, "deped_matatag:sjchs_core_recipe");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreItems.SGII_ES_CORE, 8)
                .pattern(" A ")
                .pattern("AGA")
                .pattern(" A ")
                .define('A', Items.IRON_NUGGET)
                .define('G', DepED_CoreItems.DEPED_CORE)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput, "deped_matatag:sgii_es_core_recipe");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreItems.SETA_HEAD, 6)
                .pattern(" A ")
                .pattern("BGC")
                .pattern(" D ")
                .define('A', Items.ROTTEN_FLESH)
                .define('B', Items.FERMENTED_SPIDER_EYE)
                .define('C', Items.SLIME_BALL)
                .define('D', Items.MAGMA_CREAM)
                .define('G', DepED_CoreItems.DEPED_CORE)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput, "deped_matatag:seta_head_recipe");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreItems.UPHG_CCS_CORE, 2)
                .pattern("XLX")
                .pattern("RCR")
                .pattern("XLX")
                .define('C', DepED_CoreItems.KVA_SBO_CORE)
                .define('X', DepED_CoreItems.DEPED_CORE)
                .define('L', Items.REDSTONE_TORCH)
                .define('R', Items.REDSTONE)
                .unlockedBy("has_kva_sbo_core", has(DepED_CoreItems.KVA_SBO_CORE))
                .save(recipeOutput, "deped_matatag:uphg_ccs_core_recipe");

        //Consumables
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, DepEDMatatagNeoForgeEdition.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
