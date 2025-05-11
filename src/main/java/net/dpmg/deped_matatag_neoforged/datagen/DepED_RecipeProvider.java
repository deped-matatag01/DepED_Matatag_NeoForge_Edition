package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_OreSector;
import net.dpmg.deped_matatag_neoforged.item.DepED_MineralItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
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
        //DepED Mineral Smeltables
        List<ItemLike> DEPED_MINERAL_SMELTABLES = List.of(
                DepED_MineralItems.RAW_DEPED,
                DepED_OreSector.DEPED_ORE,
                DepED_OreSector.DEEPSLATE_DEPED_ORE);

        oreSmelting(recipeOutput, DEPED_MINERAL_SMELTABLES, RecipeCategory.MISC, DepED_MineralItems.DEPED_INGOT.get(), 2.5f, 200, "deped_ingot");
        oreBlasting(recipeOutput, DEPED_MINERAL_SMELTABLES, RecipeCategory.MISC, DepED_MineralItems.DEPED_INGOT.get(), 5f, 100, "deped_ingot");

        //GMATHS Mineral Smeltables
        List<ItemLike> GMATHS_MINERAL_SMELTABLES = List.of(
                DepED_MineralItems.RAW_GMATHS,
                DepED_OreSector.GMATHS_ORE,
                DepED_OreSector.DEEPSLATE_GMATHS_ORE);

        oreSmelting(recipeOutput, GMATHS_MINERAL_SMELTABLES, RecipeCategory.MISC, DepED_MineralItems.GMATHS_INGOT.get(), 2.5f, 200, "gmaths_ingot");
        oreBlasting(recipeOutput, GMATHS_MINERAL_SMELTABLES, RecipeCategory.MISC, DepED_MineralItems.GMATHS_INGOT.get(), 5f, 100, "gmaths_ingot");

        //GMANHS Mineral Smeltables
        List<ItemLike> GMANHS_MINERAL_SMELTABLES = List.of(
                DepED_MineralItems.RAW_GMANHS,
                DepED_OreSector.GMANHS_ORE,
                DepED_OreSector.DEEPSLATE_GMANHS_ORE);

        oreSmelting(recipeOutput, GMANHS_MINERAL_SMELTABLES, RecipeCategory.MISC, DepED_MineralItems.GMANHS_INGOT.get(), 2.5f, 200, "gmanhs_ingot");
        oreBlasting(recipeOutput, GMANHS_MINERAL_SMELTABLES, RecipeCategory.MISC, DepED_MineralItems.GMANHS_INGOT.get(), 5f, 100, "gmanhs_ingot");
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
