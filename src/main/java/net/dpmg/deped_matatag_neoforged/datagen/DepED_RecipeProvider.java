package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_BlockPlaceables;
import net.dpmg.deped_matatag_neoforged.block.DepED_ColoredPlanks;
import net.dpmg.deped_matatag_neoforged.block.DepED_OreSector;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreItems;
import net.dpmg.deped_matatag_neoforged.item.DepED_CoreUpgrades;
import net.dpmg.deped_matatag_neoforged.item.DepED_MineralItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
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
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "deped_block_recipe"));

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
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "block_of_gmaths_recipe"));

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
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "block_of_gmanhs_recipe"));

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
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "sjchs_block_recipe"));

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
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.SIR_ELIE_BLOCK.get(), 6)
                .pattern("WSW")
                .pattern("SCS")
                .pattern("WSW")
                .define('W',Items.AMETHYST_BLOCK)
                .define('C', DepED_CoreItems.SETA_HEAD)
                .define('S', Items.STICK)
                .unlockedBy("has_seta_head", has(DepED_CoreItems.SETA_HEAD))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "sir_elie_block_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_BlockPlaceables.SIR_ELIE_BLOCK_BODY.get(), 6)
                .pattern("WWW")
                .pattern("WCW")
                .pattern("WWW")
                .define('W', Items.PORKCHOP)
                .define('C', DepED_BlockPlaceables.SIR_ELIE_BLOCK)
                .unlockedBy("has_seta_head", has(DepED_CoreItems.SETA_HEAD))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "sir_elie_block_body_recipe"));

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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ENCHANTED_GOLDEN_APPLE, 2)
                .pattern("NGN")
                .pattern("GCG")
                .pattern("NGN")
                .define('G', Items.GOLD_INGOT)
                .define('N', DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_4)
                .define('C', DepED_CoreItems.KVA_SBO_CORE)
                .unlockedBy("has_kva_sbo_core", has(DepED_CoreItems.KVA_SBO_CORE))
                .save(recipeOutput, "deped_matatag:enchanted_golden_apple_recipe");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.TOTEM_OF_UNDYING)
                .pattern("TBT")
                .pattern("GCG")
                .pattern("TRT")
                .define('G', DepED_CoreItems.GMANHS_CORE)
                .define('T', Items.GOLD_INGOT)
                .define('B', Items.BLAZE_POWDER)
                .define('R', Items.WIND_CHARGE)
                .define('C', DepED_CoreItems.KVA_SBO_CORE)
                .unlockedBy("has_kva_sbo_core", has(DepED_CoreItems.KVA_SBO_CORE))
                .save(recipeOutput, "deped_matatag:totem_of_undying_recipe");

        //Core Upgrades - Upgrade Templates
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.CORE_UPGRADE_TIER_1, 4)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', Ingredient.of(ItemTags.STONE_TOOL_MATERIALS))
                .define('S', DepED_MineralItems.DEPED_INGOT)
                .define('C', DepED_CoreItems.DEPED_CORE)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "core_upgrade_tier_1_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.CORE_UPGRADE_TIER_2, 4)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', Items.COPPER_INGOT)
                .define('S', DepED_MineralItems.DEPED_INGOT)
                .define('C', DepED_CoreUpgrades.CORE_UPGRADE_TIER_1)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "core_upgrade_tier_2_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.CORE_UPGRADE_TIER_3, 4)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', Items.IRON_INGOT)
                .define('S', DepED_MineralItems.GMATHS_INGOT)
                .define('C', DepED_CoreUpgrades.CORE_UPGRADE_TIER_2)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "core_upgrade_tier_3_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.CORE_UPGRADE_TIER_4, 4)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', Items.GOLD_INGOT)
                .define('S', DepED_MineralItems.GMATHS_INGOT)
                .define('C',DepED_CoreUpgrades.CORE_UPGRADE_TIER_3)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "core_upgrade_tier_4_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.CORE_UPGRADE_TIER_5, 4)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', Items.DIAMOND)
                .define('S', DepED_MineralItems.GMANHS_INGOT)
                .define('C', DepED_CoreUpgrades.CORE_UPGRADE_TIER_4)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "core_upgrade_tier_5_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.CORE_UPGRADE_TIER_6, 4)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', Items.NETHERITE_INGOT)
                .define('S', DepED_MineralItems.GMANHS_INGOT)
                .define('C', DepED_CoreUpgrades.CORE_UPGRADE_TIER_5)
                .unlockedBy("has_deped_core", has(DepED_CoreItems.DEPED_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "core_upgrade_tier_6_recipe"));

        //Core Upgrades - GMANHS Core Upgrades
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_1, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_1)
                .define('S', Ingredient.of(ItemTags.STONE_TOOL_MATERIALS))
                .define('C', DepED_CoreItems.GMANHS_CORE)
                .unlockedBy("has_gmanhs_core", has(DepED_CoreItems.GMANHS_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrade_tier_1_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_2, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_2)
                .define('S', Items.COPPER_INGOT)
                .define('C', DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_1)
                .unlockedBy("has_gmanhs_core", has(DepED_CoreItems.GMANHS_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrade_tier_2_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_3, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_3)
                .define('S', Items.IRON_INGOT)
                .define('C', DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_2)
                .unlockedBy("has_gmanhs_core", has(DepED_CoreItems.GMANHS_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrade_tier_3_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_4, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_4)
                .define('S', Items.GOLD_INGOT)
                .define('C', DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_3)
                .unlockedBy("has_gmanhs_core", has(DepED_CoreItems.GMANHS_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrade_tier_4_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_5, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_5)
                .define('S', Items.DIAMOND)
                .define('C', DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_4)
                .unlockedBy("has_gmanhs_core", has(DepED_CoreItems.GMANHS_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrade_tier_5_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_6, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_6)
                .define('S', Items.NETHERITE_INGOT)
                .define('C', DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_5)
                .unlockedBy("has_gmanhs_core", has(DepED_CoreItems.GMANHS_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gmanhs_core_upgrade_tier_6_recipe"));

        //Core Upgrades - KVA SBO Core Upgrades
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_1, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_1)
                .define('S', Ingredient.of(ItemTags.STONE_TOOL_MATERIALS))
                .define('C', DepED_CoreItems.KVA_SBO_CORE)
                .unlockedBy("has_kva_sbo_core", has(DepED_CoreItems.KVA_SBO_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrade_tier_1_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_2, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_2)
                .define('S', Items.COPPER_INGOT)
                .define('C', DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_1)
                .unlockedBy("has_kva_sbo_core", has(DepED_CoreItems.KVA_SBO_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrade_tier_2_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_3, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_3)
                .define('S', Items.IRON_INGOT)
                .define('C', DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_2)
                .unlockedBy("has_kva_sbo_core", has(DepED_CoreItems.KVA_SBO_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrade_tier_3_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_4, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_4)
                .define('S', Items.GOLD_INGOT)
                .define('C', DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_3)
                .unlockedBy("has_kva_sbo_core", has(DepED_CoreItems.KVA_SBO_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrade_tier_4_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_5, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_5)
                .define('S', Items.DIAMOND)
                .define('C', DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_4)
                .unlockedBy("has_kva_sbo_core", has(DepED_CoreItems.KVA_SBO_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrade_tier_5_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_6, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_6)
                .define('S', Items.NETHERITE_INGOT)
                .define('C', DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_5)
                .unlockedBy("has_kva_sbo_core", has(DepED_CoreItems.KVA_SBO_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "kva_sbo_core_upgrade_tier_6_recipe"));

        //Core Upgrades - KVA SBO Core Upgrades
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_1, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_1)
                .define('S', Ingredient.of(ItemTags.STONE_TOOL_MATERIALS))
                .define('C', DepED_CoreItems.UPHG_CCS_CORE)
                .unlockedBy("has_uphg_ccs_core", has(DepED_CoreItems.UPHG_CCS_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrade_tier_1_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_2, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_2)
                .define('S', Items.COPPER_INGOT)
                .define('C', DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_1)
                .unlockedBy("has_uphg_ccs_core", has(DepED_CoreItems.UPHG_CCS_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrade_tier_2_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_3, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_3)
                .define('S', Items.IRON_INGOT)
                .define('C', DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_2)
                .unlockedBy("has_uphg_ccs_core", has(DepED_CoreItems.UPHG_CCS_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrade_tier_3_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_4, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_4)
                .define('S', Items.GOLD_INGOT)
                .define('C', DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_3)
                .unlockedBy("has_uphg_ccs_core", has(DepED_CoreItems.UPHG_CCS_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrade_tier_4_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_5, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_5)
                .define('S', Items.DIAMOND)
                .define('C', DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_4)
                .unlockedBy("has_uphg_ccs_core", has(DepED_CoreItems.UPHG_CCS_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrade_tier_5_recipe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_6, 2)
                .pattern("MSM")
                .pattern("SCS")
                .pattern("MSM")
                .define('M', DepED_CoreUpgrades.CORE_UPGRADE_TIER_6)
                .define('S', Items.NETHERITE_INGOT)
                .define('C', DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_5)
                .unlockedBy("has_uphg_ccs_core", has(DepED_CoreItems.UPHG_CCS_CORE))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "uphg_ccs_core_upgrade_tier_6_recipe"));

        //Colored Planks Recipe - White
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.WHITE_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.WHITE_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "white_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.WHITE_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.WHITE_OAK_PLANKS.get()))
                .unlockedBy("has_white_oak_planks", has(DepED_ColoredPlanks.WHITE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "white_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.WHITE_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.WHITE_OAK_PLANKS)
                .unlockedBy("has_white_oak_planks", has(DepED_ColoredPlanks.WHITE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "white_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.WHITE_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.WHITE_OAK_PLANKS)
                .unlockedBy("has_white_oak_planks", has(DepED_ColoredPlanks.WHITE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "white_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.WHITE_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.WHITE_OAK_PLANKS.get()))
                .unlockedBy("has_white_oak_planks", has(DepED_ColoredPlanks.WHITE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "white_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.WHITE_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.WHITE_OAK_PLANKS.get()))
                .unlockedBy("has_white_oak_planks", has(DepED_ColoredPlanks.WHITE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "white_oak_fence_gate"));

        //Colored Planks Recipe - Light Gray
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.LIGHT_GRAY_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "light_gray_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.LIGHT_GRAY_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.get()))
                .unlockedBy("has_light_gray_oak_planks", has(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "light_gray_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.LIGHT_GRAY_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS)
                .unlockedBy("has_light_gray_oak_planks", has(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "light_gray_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.LIGHT_GRAY_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS)
                .unlockedBy("has_light_gray_oak_planks", has(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "light_gray_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.get()))
                .unlockedBy("has_light_gray_oak_planks", has(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "light_gray_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS.get()))
                .unlockedBy("has_light_gray_oak_planks", has(DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "light_gray_oak_fence_gate"));

        //Colored Planks Recipe - Gray
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.GRAY_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.GRAY_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gray_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.GRAY_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.GRAY_OAK_PLANKS.get()))
                .unlockedBy("has_gray_oak_planks", has(DepED_ColoredPlanks.GRAY_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gray_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.GRAY_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.GRAY_OAK_PLANKS)
                .unlockedBy("has_gray_oak_planks", has(DepED_ColoredPlanks.GRAY_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gray_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.GRAY_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.GRAY_OAK_PLANKS)
                .unlockedBy("has_gray_oak_planks", has(DepED_ColoredPlanks.GRAY_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gray_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.GRAY_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.GRAY_OAK_PLANKS.get()))
                .unlockedBy("has_gray_oak_planks", has(DepED_ColoredPlanks.GRAY_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gray_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.GRAY_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.GRAY_OAK_PLANKS.get()))
                .unlockedBy("has_gray_oak_planks", has(DepED_ColoredPlanks.GRAY_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "gray_oak_fence_gate"));

        //Colored Planks Recipe - Black
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.BLACK_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.BLACK_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "black_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.BLACK_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.BLACK_OAK_PLANKS.get()))
                .unlockedBy("has_black_oak_planks", has(DepED_ColoredPlanks.BLACK_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "black_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.BLACK_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.BLACK_OAK_PLANKS)
                .unlockedBy("has_black_oak_planks", has(DepED_ColoredPlanks.BLACK_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "black_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.BLACK_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.BLACK_OAK_PLANKS)
                .unlockedBy("has_black_oak_planks", has(DepED_ColoredPlanks.BLACK_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "black_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.BLACK_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.BLACK_OAK_PLANKS.get()))
                .unlockedBy("has_black_oak_planks", has(DepED_ColoredPlanks.BLACK_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "black_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.BLACK_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.BLACK_OAK_PLANKS.get()))
                .unlockedBy("has_black_oak_planks", has(DepED_ColoredPlanks.BLACK_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "black_oak_fence_gate"));

        //Colored Planks Recipe - Brown
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.BROWN_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.BROWN_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "brown_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.BROWN_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.BROWN_OAK_PLANKS.get()))
                .unlockedBy("has_brown_oak_planks", has(DepED_ColoredPlanks.BROWN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "brown_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.BROWN_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.BROWN_OAK_PLANKS)
                .unlockedBy("has_brown_oak_planks", has(DepED_ColoredPlanks.BROWN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "brown_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.BROWN_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.BROWN_OAK_PLANKS)
                .unlockedBy("has_brown_oak_planks", has(DepED_ColoredPlanks.BROWN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "brown_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.BROWN_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.BROWN_OAK_PLANKS.get()))
                .unlockedBy("has_brown_oak_planks", has(DepED_ColoredPlanks.BROWN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "brown_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.BROWN_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.BROWN_OAK_PLANKS.get()))
                .unlockedBy("has_brown_oak_planks", has(DepED_ColoredPlanks.BROWN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "brown_oak_fence_gate"));

        //Colored Planks Recipe - Red
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.RED_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.RED_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "red_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.RED_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.RED_OAK_PLANKS.get()))
                .unlockedBy("has_red_oak_planks", has(DepED_ColoredPlanks.RED_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "red_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.RED_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.RED_OAK_PLANKS)
                .unlockedBy("has_red_oak_planks", has(DepED_ColoredPlanks.RED_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "red_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.RED_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.RED_OAK_PLANKS)
                .unlockedBy("has_red_oak_planks", has(DepED_ColoredPlanks.RED_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "red_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.RED_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.RED_OAK_PLANKS.get()))
                .unlockedBy("has_red_oak_planks", has(DepED_ColoredPlanks.RED_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "red_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.RED_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.RED_OAK_PLANKS.get()))
                .unlockedBy("has_red_oak_planks", has(DepED_ColoredPlanks.RED_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "red_oak_fence_gate"));

        //Colored Planks Recipe - Orange
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.ORANGE_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.ORANGE_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "orange_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.ORANGE_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.ORANGE_OAK_PLANKS.get()))
                .unlockedBy("has_orange_oak_planks", has(DepED_ColoredPlanks.ORANGE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "orange_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.ORANGE_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.ORANGE_OAK_PLANKS)
                .unlockedBy("has_orange_oak_planks", has(DepED_ColoredPlanks.ORANGE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "orange_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.ORANGE_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.ORANGE_OAK_PLANKS)
                .unlockedBy("has_orange_oak_planks", has(DepED_ColoredPlanks.ORANGE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "orange_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.ORANGE_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.ORANGE_OAK_PLANKS.get()))
                .unlockedBy("has_orange_oak_planks", has(DepED_ColoredPlanks.ORANGE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "orange_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.ORANGE_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.ORANGE_OAK_PLANKS.get()))
                .unlockedBy("has_orange_oak_planks", has(DepED_ColoredPlanks.ORANGE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "orange_oak_fence_gate"));

        //Colored Planks Recipe - Yellow
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.YELLOW_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.YELLOW_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "yellow_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.YELLOW_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.YELLOW_OAK_PLANKS.get()))
                .unlockedBy("has_yellow_oak_planks", has(DepED_ColoredPlanks.YELLOW_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "yellow_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.YELLOW_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.YELLOW_OAK_PLANKS)
                .unlockedBy("has_yellow_oak_planks", has(DepED_ColoredPlanks.YELLOW_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "yellow_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.YELLOW_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.YELLOW_OAK_PLANKS)
                .unlockedBy("has_yellow_oak_planks", has(DepED_ColoredPlanks.YELLOW_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "yellow_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.YELLOW_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.YELLOW_OAK_PLANKS.get()))
                .unlockedBy("has_yellow_oak_planks", has(DepED_ColoredPlanks.YELLOW_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "yellow_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.YELLOW_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.YELLOW_OAK_PLANKS.get()))
                .unlockedBy("has_yellow_oak_planks", has(DepED_ColoredPlanks.YELLOW_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "yellow_oak_fence_gate"));

        //Colored Planks Recipe - Lime
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.LIME_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.LIME_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "lime_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.LIME_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.LIME_OAK_PLANKS.get()))
                .unlockedBy("has_lime_oak_planks", has(DepED_ColoredPlanks.LIME_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "lime_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.LIME_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.LIME_OAK_PLANKS)
                .unlockedBy("has_lime_oak_planks", has(DepED_ColoredPlanks.LIME_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "lime_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.LIME_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.LIME_OAK_PLANKS)
                .unlockedBy("has_lime_oak_planks", has(DepED_ColoredPlanks.LIME_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "lime_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.LIME_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.LIME_OAK_PLANKS.get()))
                .unlockedBy("has_lime_oak_planks", has(DepED_ColoredPlanks.LIME_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "lime_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.LIME_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.LIME_OAK_PLANKS.get()))
                .unlockedBy("has_lime_oak_planks", has(DepED_ColoredPlanks.LIME_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "lime_oak_fence_gate"));

        //Colored Planks Recipe - Green
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.GREEN_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.GREEN_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "green_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.GREEN_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.GREEN_OAK_PLANKS.get()))
                .unlockedBy("has_green_oak_planks", has(DepED_ColoredPlanks.GREEN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "green_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.GREEN_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.GREEN_OAK_PLANKS)
                .unlockedBy("has_green_oak_planks", has(DepED_ColoredPlanks.GREEN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "green_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.GREEN_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.GREEN_OAK_PLANKS)
                .unlockedBy("has_green_oak_planks", has(DepED_ColoredPlanks.GREEN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "green_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.GREEN_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.GREEN_OAK_PLANKS.get()))
                .unlockedBy("has_green_oak_planks", has(DepED_ColoredPlanks.GREEN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "green_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.GREEN_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.GREEN_OAK_PLANKS.get()))
                .unlockedBy("has_green_oak_planks", has(DepED_ColoredPlanks.GREEN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "green_oak_fence_gate"));

        //Colored Planks Recipe - Cyan
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.CYAN_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.CYAN_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "cyan_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.CYAN_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.CYAN_OAK_PLANKS.get()))
                .unlockedBy("has_cyan_oak_planks", has(DepED_ColoredPlanks.CYAN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "cyan_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.CYAN_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.CYAN_OAK_PLANKS)
                .unlockedBy("has_cyan_oak_planks", has(DepED_ColoredPlanks.CYAN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "cyan_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.CYAN_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.CYAN_OAK_PLANKS)
                .unlockedBy("has_cyan_oak_planks", has(DepED_ColoredPlanks.CYAN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "cyan_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.CYAN_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.CYAN_OAK_PLANKS.get()))
                .unlockedBy("has_cyan_oak_planks", has(DepED_ColoredPlanks.CYAN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "cyan_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.CYAN_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.CYAN_OAK_PLANKS.get()))
                .unlockedBy("has_cyan_oak_planks", has(DepED_ColoredPlanks.CYAN_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "cyan_oak_fence_gate"));

        //Colored Planks Recipe - Light Blue
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "light_blue_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.LIGHT_BLUE_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS.get()))
                .unlockedBy("has_light_blue_oak_planks", has(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "light_blue_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.LIGHT_BLUE_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS)
                .unlockedBy("has_light_blue_oak_planks", has(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "light_blue_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.LIGHT_BLUE_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS)
                .unlockedBy("has_light_blue_oak_planks", has(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "light_blue_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.LIGHT_BLUE_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS.get()))
                .unlockedBy("has_light_blue_oak_planks", has(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "light_blue_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.LIGHT_BLUE_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS.get()))
                .unlockedBy("has_light_blue_oak_planks", has(DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "light_blue_oak_fence_gate"));

        //Colored Planks Recipe - Blue
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.BLUE_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.BLUE_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "blue_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.BLUE_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.BLUE_OAK_PLANKS.get()))
                .unlockedBy("has_blue_oak_planks", has(DepED_ColoredPlanks.BLUE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "blue_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.BLUE_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.BLUE_OAK_PLANKS)
                .unlockedBy("has_blue_oak_planks", has(DepED_ColoredPlanks.BLUE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "blue_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.BLUE_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.BLUE_OAK_PLANKS)
                .unlockedBy("has_blue_oak_planks", has(DepED_ColoredPlanks.BLUE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "blue_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.BLUE_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.BLUE_OAK_PLANKS.get()))
                .unlockedBy("has_blue_oak_planks", has(DepED_ColoredPlanks.BLUE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "blue_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.BLUE_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.BLUE_OAK_PLANKS.get()))
                .unlockedBy("has_blue_oak_planks", has(DepED_ColoredPlanks.BLUE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "blue_oak_fence_gate"));

        //Colored Planks Recipe - Purple
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.PURPLE_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.PURPLE_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "purple_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.PURPLE_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.PURPLE_OAK_PLANKS.get()))
                .unlockedBy("has_purple_oak_planks", has(DepED_ColoredPlanks.PURPLE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "purple_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.PURPLE_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.PURPLE_OAK_PLANKS)
                .unlockedBy("has_purple_oak_planks", has(DepED_ColoredPlanks.PURPLE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "purple_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.PURPLE_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.PURPLE_OAK_PLANKS)
                .unlockedBy("has_purple_oak_planks", has(DepED_ColoredPlanks.PURPLE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "purple_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.PURPLE_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.PURPLE_OAK_PLANKS.get()))
                .unlockedBy("has_purple_oak_planks", has(DepED_ColoredPlanks.PURPLE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "purple_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.PURPLE_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.PURPLE_OAK_PLANKS.get()))
                .unlockedBy("has_purple_oak_planks", has(DepED_ColoredPlanks.PURPLE_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "purple_oak_fence_gate"));

        //Colored Planks Recipe - Magenta
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.MAGENTA_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.MAGENTA_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "magenta_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.MAGENTA_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS.get()))
                .unlockedBy("has_magenta_oak_planks", has(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "magenta_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.MAGENTA_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.MAGENTA_OAK_PLANKS)
                .unlockedBy("has_magenta_oak_planks", has(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "magenta_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.MAGENTA_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.MAGENTA_OAK_PLANKS)
                .unlockedBy("has_magenta_oak_planks", has(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "magenta_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.MAGENTA_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS.get()))
                .unlockedBy("has_magenta_oak_planks", has(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "magenta_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.MAGENTA_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS.get()))
                .unlockedBy("has_magenta_oak_planks", has(DepED_ColoredPlanks.MAGENTA_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "magenta_oak_fence_gate"));

        //Colored Planks Recipe - Pink
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.PINK_OAK_PLANKS.get(), 8)
                .pattern("PPP")
                .pattern("PCP")
                .pattern("PPP")
                .define('P', Ingredient.of(ItemTags.PLANKS))
                .define('C', Items.PINK_DYE)
                .unlockedBy("has_wooden_planks", has(ItemTags.PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "pink_oak_planks"));

        stairBuilder(DepED_ColoredPlanks.PINK_OAK_STAIRS.get(), Ingredient.of(DepED_ColoredPlanks.PINK_OAK_PLANKS.get()))
                .unlockedBy("has_pink_oak_planks", has(DepED_ColoredPlanks.PINK_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "pink_oak_stairs"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.PINK_OAK_SLAB.get(), 6)
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.PINK_OAK_PLANKS)
                .unlockedBy("has_pink_oak_planks", has(DepED_ColoredPlanks.PINK_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "pink_oak_slab"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DepED_ColoredPlanks.PINK_OAK_WALL.get(), 6)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', DepED_ColoredPlanks.PINK_OAK_PLANKS)
                .unlockedBy("has_pink_oak_planks", has(DepED_ColoredPlanks.PINK_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "pink_oak_wall"));

        fenceBuilder(DepED_ColoredPlanks.PINK_OAK_FENCE.get(), Ingredient.of(DepED_ColoredPlanks.PINK_OAK_PLANKS.get()))
                .unlockedBy("has_pink_oak_planks", has(DepED_ColoredPlanks.PINK_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "pink_oak_fence"));

        fenceGateBuilder(DepED_ColoredPlanks.PINK_OAK_FENCE_GATE.get(), Ingredient.of(DepED_ColoredPlanks.PINK_OAK_PLANKS.get()))
                .unlockedBy("has_pink_oak_planks", has(DepED_ColoredPlanks.PINK_OAK_PLANKS))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("deped_matatag", "pink_oak_fence_gate"));
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
