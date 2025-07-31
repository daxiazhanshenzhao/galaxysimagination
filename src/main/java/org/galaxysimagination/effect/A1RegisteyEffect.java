package org.galaxysimagination.effect;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.galaxysimagination.Galaxysimagination;

public class A1RegisteyEffect {

    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, Galaxysimagination.MODID);

    public static void register(IEventBus eventBus){
        EFFECTS.register(eventBus);

    }

    public static final DeferredHolder<MobEffect,MobEffect> KNOCK_BACK_EFFECT;
    public static final DeferredHolder<MobEffect,MobEffect> WITHER_ATTACK;
    public static final DeferredHolder<MobEffect,MobEffect> EXPLOSION_RESISTANCE;
    static {
        KNOCK_BACK_EFFECT = EFFECTS.register("kock_back" , KnockBackEffect::new);
        WITHER_ATTACK = EFFECTS.register("wither_attack", WitherAttackEffect::new);
        EXPLOSION_RESISTANCE = EFFECTS.register("explosion_resistance", ExplosionResistanceEffect::new);

    }
}
