package org.galaxysimagination.datagen.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.galaxysimagination.effect.A1RegisteyEffect;
import org.galaxysimagination.item.A1RegisteyItem;

public class ChineseLanguageProvider extends LanguageProvider {
    public ChineseLanguageProvider(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        //item

        add(A1RegisteyItem.BLAZE_POWDER_STEW.get(), "炽焰灵汤");
        add(A1RegisteyItem.LEATHER_POTATO_STEW.get(), "坚韧之心浓汤");
        add(A1RegisteyItem.AMETHYST_STEW.get(), "星辉秘汤");
        add(A1RegisteyItem.GLOW_INK_STEW.get(), "幽光潜影汤");
//         add(A1RegisteyItem.GHAST_TEAR_STEW.get(), "灵泪幻汤"); // 如已启用可取消注释
        add(A1RegisteyItem.GUNPOWDER_STEW.get(), "爆鸣熔流浓汤");
        add(A1RegisteyItem.GOAT_HORN_STEW.get(), "逐风之角炖汤");
        add(A1RegisteyItem.NETHERITE_STEW.get(), "炼狱精金灵汤");
        add(A1RegisteyItem.KELP_SEED_STEW.get(), "海潮丰盈汤");
        add(A1RegisteyItem.ROTTEN_FLESH_STEW.get(), "腐影暗煮");
        add(A1RegisteyItem.SCULK_STEW.get(), "幽匿幻隐汤");
        add(A1RegisteyItem.SLIME_BALL_STEW.get(), "弹跃秘酿");
        add(A1RegisteyItem.WITHER_SKULL_STEW.get(), "凋魂诅咒浓汤");

        // 属性
        add("attribute.name.galaxysimagination.blast_armor", "爆炸抗性");

        // 效果
        add(A1RegisteyEffect.KNOCK_BACK_EFFECT.get(), "击退效果");
        add(A1RegisteyEffect.EXPLOSION_RESISTANCE.get(), "爆炸抗性");
        add(A1RegisteyEffect.WITHER_ATTACK.get(), "凋零攻击");
        // add(A1RegisteyEffect.FIRE_BALL);

        // 创造物品栏
        add("itemGroup.galaxysimagination.creative_tab", "森罗物语：奇思妙想");
    }
}
