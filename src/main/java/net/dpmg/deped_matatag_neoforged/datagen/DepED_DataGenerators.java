package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = DepEDMatatagNeoForgeEdition.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DepED_DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        //LOOT TABLE PROVIDER
        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(), List.of(
                new LootTableProvider.SubProviderEntry(DepED_BlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));

        //BLOCKSTATES AND ITEM MODEL PROVIDER
        generator.addProvider(event.includeClient(), new DepED_BlockStatesProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new DepED_ItemModelProvider(packOutput, existingFileHelper));

        //BLOCKTAGS PROVIDER
        BlockTagsProvider blockTagsProvider = new DepED_BlockTagsProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);

        //ITEMTAGS PROVIDER
        generator.addProvider(event.includeServer(), new DepED_ItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        //RECIPE PROVIDER
        generator.addProvider(event.includeServer(), new DepED_RecipeProvider(packOutput, lookupProvider));

        //DATAPACK PROVIDER
        generator.addProvider(event.includeServer(), new DepED_DatapackProvider(packOutput, lookupProvider));
    }
}
