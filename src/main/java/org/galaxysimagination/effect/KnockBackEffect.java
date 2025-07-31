package org.galaxysimagination.effect;

import com.github.ysbbbbbb.kaleidoscopecookery.effect.BaseEffect;
import io.netty.util.AttributeMap;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class KnockBackEffect extends BaseEffect {
    public KnockBackEffect() {
        super(0xFFC6C6);
        this.addAttributeModifier(
                Attributes.ATTACK_KNOCKBACK,
                ResourceLocation.fromNamespaceAndPath("galaxysimagination", "effect.knock_back"),
                100,
                AttributeModifier.Operation.ADD_VALUE
        );
    }
}
