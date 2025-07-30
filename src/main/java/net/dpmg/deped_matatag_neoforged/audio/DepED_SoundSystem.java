package net.dpmg.deped_matatag_neoforged.audio;

import net.dpmg.deped_matatag_neoforged.DepEDMatatagNeoForgeEdition;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DepED_SoundSystem {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, DepEDMatatagNeoForgeEdition.MOD_ID);

    //SOUNDEVENTS
    public static final Supplier<SoundEvent> EAT_BULAGA_THEME_OLD = registerSoundEvent("eat_bulaga_theme_old");
    public static final Supplier<SoundEvent> WALTZ_OF_THE_FLOWERS = registerSoundEvent("waltz_of_the_flowers");
    public static final Supplier<SoundEvent> DISCO_GHOSTMIX_2000 = registerSoundEvent("disco_ghostmix_2000");
    public static final Supplier<SoundEvent> WHATEVER_WE_IMAGINE = registerSoundEvent("whatever_we_imagine");
    public static final Supplier<SoundEvent> UPHS_UNIVERSITY_HYMN = registerSoundEvent("uphs_university_hymn");
    public static final Supplier<SoundEvent> MUSIC_ALWAYS = registerSoundEvent("music_always");

    //RESOURCEKEYS
    public static final ResourceKey<JukeboxSong> EAT_BULAGA_THEME_OLD_KEY = createSong("eat_bulaga_theme_old");
    public static final ResourceKey<JukeboxSong> WALTZ_OF_THE_FLOWERS_KEY = createSong("waltz_of_the_flowers");
    public static final ResourceKey<JukeboxSong> DISCO_GHOSTMIX_2000_KEY = createSong("disco_ghostmix_2000");
    public static final ResourceKey<JukeboxSong> WHATEVER_WE_IMAGINE_KEY = createSong("whatever_we_imagine");
    public static final ResourceKey<JukeboxSong> UPHS_UNIVERSITY_HYMN_KEY = createSong("uphs_university_hymn");
    public static final ResourceKey<JukeboxSong> MUSIC_ALWAYS_KEY = createSong("music_always");


    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(DepEDMatatagNeoForgeEdition.MOD_ID, name));
    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(DepEDMatatagNeoForgeEdition.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register_DPMGSoundSystem(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
