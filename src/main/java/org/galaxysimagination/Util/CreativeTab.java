package org.galaxysimagination.Util;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.galaxysimagination.Galaxysimagination;
import org.galaxysimagination.item.A1RegisteyItem;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Galaxysimagination.MODID);

    public static void register(IEventBus eventBus){
        TABS.register(eventBus);
    }

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_TAB = TABS.register("creative_tab", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.galaxysimagination.creative_tab"))
                    .icon(() -> new ItemStack(A1RegisteyItem.AMETHYST_STEW.get()))
                    .displayItems((enabledFeatures, entries) -> {
                        entries.accept(A1RegisteyItem.BLAZE_POWDER_STEW.get());
                        entries.accept(A1RegisteyItem.LEATHER_POTATO_STEW.get());
                        entries.accept(A1RegisteyItem.AMETHYST_STEW.get());
                        entries.accept(A1RegisteyItem.GLOW_INK_STEW.get());

                        entries.accept(A1RegisteyItem.GUNPOWDER_STEW.get());
                        entries.accept(A1RegisteyItem.GOAT_HORN_STEW.get());
                        entries.accept(A1RegisteyItem.NETHERITE_STEW.get());
                        entries.accept(A1RegisteyItem.KELP_SEED_STEW.get());
                        entries.accept(A1RegisteyItem.ROTTEN_FLESH_STEW.get());
                        entries.accept(A1RegisteyItem.SCULK_STEW.get());
                        entries.accept(A1RegisteyItem.SLIME_BALL_STEW.get());
                        entries.accept(A1RegisteyItem.WITHER_SKULL_STEW.get());
                    })
                    .build()
    );
}