package net.dpmg.deped_matatag_neoforged.datagen;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.block.DepED_BlockPlaceables;
import net.dpmg.deped_matatag_neoforged.block.DepED_ColoredPlanks;
import net.dpmg.deped_matatag_neoforged.item.*;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;

public class DepED_ItemModelProvider extends ItemModelProvider {
    public DepED_ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DepEDMatatagNeoForgeEdition.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //DepED SoundSystem
        basicItem(DepED_MusicDiscs.DISC_EAT_BULAGA.get());
        basicItem(DepED_MusicDiscs.DISC_WALTZ_OF_THE_FLOWERS.get());
        basicItem(DepED_MusicDiscs.DISC_DISCO_GHOSTMIX_2000.get());
        basicItem(DepED_MusicDiscs.DISC_WHATEVER_WE_IMAGINE.get());
        basicItem(DepED_MusicDiscs.DISC_UPHS_UNIVERSITY_HYMN.get());
        basicItem(DepED_MusicDiscs.DISC_MUSIC_ALWAYS.get());
        basicItem(DepED_MusicDiscs.DISC_MUSIC_SSAB.get());

        //DepED Core Items
        basicItem(DepED_CoreItems.DEPED_CORE.get());
        basicItem(DepED_CoreItems.GMATHS_CORE.get());
        basicItem(DepED_CoreItems.GMANHS_CORE.get());
        basicItem(DepED_CoreItems.KVA_SBO_CORE.get());
        basicItem(DepED_CoreItems.SJCHS_CORE.get());
        basicItem(DepED_CoreItems.SGII_ES_CORE.get());
        basicItem(DepED_CoreItems.SETA_HEAD.get());
        basicItem(DepED_CoreItems.UPHG_CCS_CORE.get());

        //DepED Core Upgrades - Upgrade Template
        basicItem(DepED_CoreUpgrades.CORE_UPGRADE_TIER_1.get());
        basicItem(DepED_CoreUpgrades.CORE_UPGRADE_TIER_2.get());
        basicItem(DepED_CoreUpgrades.CORE_UPGRADE_TIER_3.get());
        basicItem(DepED_CoreUpgrades.CORE_UPGRADE_TIER_4.get());
        basicItem(DepED_CoreUpgrades.CORE_UPGRADE_TIER_5.get());
        basicItem(DepED_CoreUpgrades.CORE_UPGRADE_TIER_6.get());

        //DepED Core Upgrades - GMANHS Core Upgrade
        basicItem(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_1.get());
        basicItem(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_2.get());
        basicItem(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_3.get());
        basicItem(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_4.get());
        basicItem(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_5.get());
        basicItem(DepED_CoreUpgrades.GMANHS_CORE_UPGRADE_TIER_6.get());

        //DepED Core Upgrades - KVA SBO Core Upgrade
        basicItem(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_1.get());
        basicItem(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_2.get());
        basicItem(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_3.get());
        basicItem(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_4.get());
        basicItem(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_5.get());
        basicItem(DepED_CoreUpgrades.KVA_SBO_CORE_UPGRADE_TIER_6.get());

        //DepED Core Upgrades - UPHG CCS Core Upgrade
        basicItem(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_1.get());
        basicItem(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_2.get());
        basicItem(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_3.get());
        basicItem(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_4.get());
        basicItem(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_5.get());
        basicItem(DepED_CoreUpgrades.UPHG_CCS_CORE_UPGRADE_TIER_6.get());

        //DepED Mineral Items
        basicItem(DepED_MineralItems.RAW_DEPED.get());
        basicItem(DepED_MineralItems.DEPED_INGOT.get());
        basicItem(DepED_MineralItems.DEPED_NUGGET.get());

        basicItem(DepED_MineralItems.RAW_GMATHS.get());
        basicItem(DepED_MineralItems.GMATHS_INGOT.get());
        basicItem(DepED_MineralItems.GMATHS_NUGGET.get());

        basicItem(DepED_MineralItems.RAW_GMANHS.get());
        basicItem(DepED_MineralItems.GMANHS_INGOT.get());
        basicItem(DepED_MineralItems.GMANHS_NUGGET.get());

        //Wall Presets
        DPMG_WallItem(DepED_BlockPlaceables.DEPED_WALL, DepED_BlockPlaceables.DEPED_BLOCK);
        DPMG_WallItem(DepED_BlockPlaceables.GMATHS_WALL, DepED_BlockPlaceables.BLOCK_OF_GMATHS);
        DPMG_WallItem(DepED_BlockPlaceables.GMANHS_WALL, DepED_BlockPlaceables.BLOCK_OF_GMANHS);
        DPMG_WallItem(DepED_BlockPlaceables.SJCHS_WALL, DepED_BlockPlaceables.SJCHS_BLOCK);

        //Colored Plank Wall Presets
        DPMG_WallItem(DepED_ColoredPlanks.WHITE_OAK_WALL, DepED_ColoredPlanks.WHITE_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.LIGHT_GRAY_OAK_WALL, DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.GRAY_OAK_WALL, DepED_ColoredPlanks.GRAY_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.BLACK_OAK_WALL, DepED_ColoredPlanks.BLACK_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.BROWN_OAK_WALL, DepED_ColoredPlanks.BROWN_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.RED_OAK_WALL, DepED_ColoredPlanks.RED_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.ORANGE_OAK_WALL, DepED_ColoredPlanks.ORANGE_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.YELLOW_OAK_WALL, DepED_ColoredPlanks.YELLOW_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.LIME_OAK_WALL, DepED_ColoredPlanks.LIME_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.GREEN_OAK_WALL, DepED_ColoredPlanks.GREEN_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.CYAN_OAK_WALL, DepED_ColoredPlanks.CYAN_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.LIGHT_BLUE_OAK_WALL, DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.BLUE_OAK_WALL, DepED_ColoredPlanks.BLUE_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.PURPLE_OAK_WALL, DepED_ColoredPlanks.PURPLE_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.MAGENTA_OAK_WALL, DepED_ColoredPlanks.MAGENTA_OAK_PLANKS);
        DPMG_WallItem(DepED_ColoredPlanks.PINK_OAK_WALL, DepED_ColoredPlanks.PINK_OAK_PLANKS);

        //Fence Presets
        DPMG_FenceItem(DepED_ColoredPlanks.WHITE_OAK_FENCE, DepED_ColoredPlanks.WHITE_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.LIGHT_GRAY_OAK_FENCE, DepED_ColoredPlanks.LIGHT_GRAY_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.GRAY_OAK_FENCE, DepED_ColoredPlanks.GRAY_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.BLACK_OAK_FENCE, DepED_ColoredPlanks.BLACK_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.BROWN_OAK_FENCE, DepED_ColoredPlanks.BROWN_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.RED_OAK_FENCE, DepED_ColoredPlanks.RED_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.ORANGE_OAK_FENCE, DepED_ColoredPlanks.ORANGE_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.YELLOW_OAK_FENCE, DepED_ColoredPlanks.YELLOW_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.LIME_OAK_FENCE, DepED_ColoredPlanks.LIME_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.GREEN_OAK_FENCE, DepED_ColoredPlanks.GREEN_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.CYAN_OAK_FENCE, DepED_ColoredPlanks.CYAN_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.LIGHT_BLUE_OAK_FENCE, DepED_ColoredPlanks.LIGHT_BLUE_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.BLUE_OAK_FENCE, DepED_ColoredPlanks.BLUE_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.PURPLE_OAK_FENCE, DepED_ColoredPlanks.PURPLE_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.MAGENTA_OAK_FENCE, DepED_ColoredPlanks.MAGENTA_OAK_PLANKS);
        DPMG_FenceItem(DepED_ColoredPlanks.PINK_OAK_FENCE, DepED_ColoredPlanks.PINK_OAK_PLANKS);

        //Tools and Armor Weaponries
        trimmedArmorItem(DepED_Weaponries.DEPED_HELMET);
        trimmedArmorItem(DepED_Weaponries.DEPED_CHESTPLATE);
        trimmedArmorItem(DepED_Weaponries.DEPED_LEGGINGS);
        trimmedArmorItem(DepED_Weaponries.DEPED_BOOTS);
    }

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = DepEDMatatagNeoForgeEdition.MOD_ID;

        if(itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                this.withExistingParent(itemDeferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }

    public void DPMG_FenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(DepEDMatatagNeoForgeEdition.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void DPMG_WallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(DepEDMatatagNeoForgeEdition.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
