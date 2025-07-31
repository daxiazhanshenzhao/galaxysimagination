package org.galaxysimagination.datagen.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.galaxysimagination.effect.A1RegisteyEffect;
import org.galaxysimagination.item.A1RegisteyItem;

public class EnglishLanguageProvider extends LanguageProvider {
    public EnglishLanguageProvider(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {

        add(A1RegisteyItem.BLAZE_POWDER_STEW.get(), "Blaze Powder Stew");
        add(A1RegisteyItem.LEATHER_POTATO_STEW.get(), "Leather Potato Stew");
        add(A1RegisteyItem.AMETHYST_STEW.get(), "Amethyst Stew");
        add(A1RegisteyItem.GLOW_INK_STEW.get(), "Glow Ink Stew");
        // add(A1RegisteyItem.GHAST_TEAR_STEW.get(), "Ghast Tear Stew"); // 如已启用可取消注释
        add(A1RegisteyItem.GUNPOWDER_STEW.get(), "Gunpowder Stew");
        add(A1RegisteyItem.GOAT_HORN_STEW.get(), "Goat Horn Stew");
        add(A1RegisteyItem.NETHERITE_STEW.get(), "Netherite Stew");
        add(A1RegisteyItem.KELP_SEED_STEW.get(), "Kelp Seed Stew");
        add(A1RegisteyItem.ROTTEN_FLESH_STEW.get(), "Rotten Flesh Stew");
        add(A1RegisteyItem.SCULK_STEW.get(), "Sculk Stew");
        add(A1RegisteyItem.SLIME_BALL_STEW.get(), "Slime Ball Stew");
        add(A1RegisteyItem.WITHER_SKULL_STEW.get(), "Wither Skull Stew");

        //attribute
        add("attribute.name.galaxysimagination.blast_armor", "Blast Armor");
        //effect

        add(A1RegisteyEffect.KNOCK_BACK_EFFECT.get(), "Knock Back Effect");
        add(A1RegisteyEffect.EXPLOSION_RESISTANCE.get(), "Explosion Resistance");
        add(A1RegisteyEffect.WITHER_ATTACK.get(), "Wither Attack");
//        add(A1RegisteyEffect.FIRE_BALL);
        //creativeTab
        add("itemGroup.galaxysimagination.creative_tab", "Galaxy Simulations");
    }
}
