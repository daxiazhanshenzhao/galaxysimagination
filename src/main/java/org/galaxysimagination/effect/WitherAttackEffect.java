package org.galaxysimagination.effect;

import com.github.ysbbbbbb.kaleidoscopecookery.effect.BaseEffect;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import org.galaxysimagination.Galaxysimagination;


@EventBusSubscriber(modid = Galaxysimagination.MODID)
public class WitherAttackEffect extends BaseEffect {
    public WitherAttackEffect() {
        super(0xFFC6C6);
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
        return true;
    }

    @SubscribeEvent
    public static void onMobHurt(LivingDamageEvent.Pre event) {

        Entity entity = event.getEntity();
        DamageSource source = event.getSource();

        if (entity != null && source != null) {

            if (entity instanceof LivingEntity livingEntity){
                if (source.getEntity()!=null && source.getEntity() instanceof LivingEntity attacker){
                    if (attacker.hasEffect(A1RegisteyEffect.WITHER_ATTACK))
                        livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER,20*5));
                }
            }
        }
    }
}