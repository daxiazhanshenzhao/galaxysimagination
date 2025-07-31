
package org.galaxysimagination.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import org.galaxysimagination.effect.A1RegisteyEffect;

public class EffectedFoodItem {
    public static final FoodProperties BLAZE_POWDER_STEW;
    public static final FoodProperties LEATHER_POTATO_STEW;
    public static final FoodProperties AMETHYST_STEW;
    public static final FoodProperties GLOW_INK_STEW;
    // public static final FoodProperties GHAST_TEAR_STEW;
    public static final FoodProperties GUNPOWDER_STEW;
    public static final FoodProperties GOAT_HORN_STEW;
    public static final FoodProperties NETHERITE_STEW;
    public static final FoodProperties KELP_SEED_STEW;
    public static final FoodProperties ROTTEN_FLESH_STEW;
    public static final FoodProperties SCULK_STEW;
    public static final FoodProperties SLIME_BALL_STEW;
    public static final FoodProperties WITHER_SKULL_STEW;

    static {
        BLAZE_POWDER_STEW = new FoodProperties.Builder()
                .nutrition(2)
                .saturationModifier(0.5F)
                .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 180), 1.0F)
                .alwaysEdible()
                .build();

        LEATHER_POTATO_STEW = new FoodProperties.Builder()
                .nutrition(5)
                .saturationModifier(0.8F)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 180, 0), 1.0F)
                .alwaysEdible()
                .build();

        AMETHYST_STEW = new FoodProperties.Builder()
                .nutrition(2)
                .saturationModifier(0.5F)
                .alwaysEdible()
                .build();

        GLOW_INK_STEW = new FoodProperties.Builder()
                .nutrition(4)
                .saturationModifier(0.8F)
                .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 20 * 180), 1.0F)
                .alwaysEdible()
                .build();

        // GHAST_TEAR_STEW = new FoodProperties.Builder()
        //         .nutrition(6).saturationModifier(0.8F)
        //         .effect(() -> new MobEffectInstance(A1RegisteyEffect.FIREBALL_EFFECT.get(), 20 * 180), 1.0F)
        //         .alwaysEdible().build();

        GUNPOWDER_STEW = new FoodProperties.Builder()
                .nutrition(2)
                .saturationModifier(0.5F)
                .effect(() -> new MobEffectInstance(A1RegisteyEffect.EXPLOSION_RESISTANCE, 20 * 180), 1.0F)
                .alwaysEdible()
                .build();

        GOAT_HORN_STEW = new FoodProperties.Builder()
                .nutrition(2)
                .saturationModifier(0.5F)
                .effect(() -> new MobEffectInstance(A1RegisteyEffect.KNOCK_BACK_EFFECT, 20 * 180), 1.0F)
                .alwaysEdible()
                .build();

        NETHERITE_STEW = new FoodProperties.Builder()
                .nutrition(2)
                .saturationModifier(0.5F)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 180, 1), 1.0F)
                .alwaysEdible()
                .build();

        KELP_SEED_STEW = new FoodProperties.Builder()
                .nutrition(6)
                .saturationModifier(0.8F)
                .alwaysEdible()
                .build();

        ROTTEN_FLESH_STEW = new FoodProperties.Builder()
                .nutrition(6)
                .saturationModifier(0.5F)
                .alwaysEdible()
                .build();

        SCULK_STEW = new FoodProperties.Builder()
                .nutrition(2)
                .saturationModifier(0.5F)
                .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 20 * 180), 1.0F)
                .alwaysEdible()
                .build();

        SLIME_BALL_STEW = new FoodProperties.Builder()
                .nutrition(4)
                .saturationModifier(0.8F)
                .effect(() -> new MobEffectInstance(MobEffects.JUMP, 20 * 180), 1.0F)
                .alwaysEdible()
                .build();

        WITHER_SKULL_STEW = new FoodProperties.Builder()
                .nutrition(2)
                .saturationModifier(0.5F)
                .effect(() -> new MobEffectInstance(A1RegisteyEffect.WITHER_ATTACK, 20 * 180), 1.0F)
                .alwaysEdible()
                .build();
    }
}