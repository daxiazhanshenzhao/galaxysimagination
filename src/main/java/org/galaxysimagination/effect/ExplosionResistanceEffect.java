package org.galaxysimagination.effect;

import com.github.ysbbbbbb.kaleidoscopecookery.effect.BaseEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import org.galaxysimagination.attribute.A1RegistetAttribute;

public class ExplosionResistanceEffect extends BaseEffect {
    public ExplosionResistanceEffect() {
        super(0xFFC6C6);
        this.addAttributeModifier(
                A1RegistetAttribute.BLAST_ARMOR,
                ResourceLocation.fromNamespaceAndPath("galaxysimagination", "explosion_resistance"),
                50,
                AttributeModifier.Operation.ADD_VALUE
        );
    }




}
