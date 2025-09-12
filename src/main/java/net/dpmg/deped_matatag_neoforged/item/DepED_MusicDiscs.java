package net.dpmg.deped_matatag_neoforged.item;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.dpmg.deped_matatag_neoforged.audio.DepED_SoundSystem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DepED_MusicDiscs {
    public static final DeferredRegister.Items DPMG_MUSIC_DISCS = DeferredRegister.createItems(DepEDMatatagNeoForgeEdition.MOD_ID);

    public static final DeferredItem<Item> DISC_EAT_BULAGA = DPMG_MUSIC_DISCS.register("disc_eat_bulaga", () -> new Item(new Item.Properties()
            .jukeboxPlayable(DepED_SoundSystem.EAT_BULAGA_THEME_OLD_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> DISC_WALTZ_OF_THE_FLOWERS = DPMG_MUSIC_DISCS.register("disc_waltz_of_the_flowers", () -> new Item(new Item.Properties()
            .jukeboxPlayable(DepED_SoundSystem.WALTZ_OF_THE_FLOWERS_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> DISC_DISCO_GHOSTMIX_2000 = DPMG_MUSIC_DISCS.register("disc_disco_ghostmix_2000", () -> new Item(new Item.Properties()
            .jukeboxPlayable(DepED_SoundSystem.DISCO_GHOSTMIX_2000_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> DISC_WHATEVER_WE_IMAGINE = DPMG_MUSIC_DISCS.register("disc_whatever_we_imagine", () -> new Item(new Item.Properties()
            .jukeboxPlayable(DepED_SoundSystem.WHATEVER_WE_IMAGINE_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> DISC_PALARONG_PAMBANSA = DPMG_MUSIC_DISCS.register("disc_palarong_pambansa", () -> new Item(new Item.Properties()
            .jukeboxPlayable(DepED_SoundSystem.MUSIC_PALARONG_PAMBANSA_KEY).stacksTo(1).rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> DISC_UPHS_UNIVERSITY_HYMN = DPMG_MUSIC_DISCS.register("disc_uphs_unversity_hymn", () -> new Item(new Item.Properties()
            .jukeboxPlayable(DepED_SoundSystem.UPHS_UNIVERSITY_HYMN_KEY).stacksTo(1)));

    public static final DeferredItem<Item> DISC_MUSIC_ALWAYS = DPMG_MUSIC_DISCS.register("disc_music_always", () -> new Item(new Item.Properties()
            .jukeboxPlayable(DepED_SoundSystem.MUSIC_ALWAYS_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> DISC_MUSIC_SSAB = DPMG_MUSIC_DISCS.register("disc_music_ssab", () -> new Item(new Item.Properties()
            .jukeboxPlayable(DepED_SoundSystem.MUSIC_SSAB_KEY).stacksTo(1).rarity(Rarity.EPIC)));

    public static void registerDPMG_MusicDiscs(IEventBus eventBus) {
        DPMG_MUSIC_DISCS.register(eventBus);
    }
}
