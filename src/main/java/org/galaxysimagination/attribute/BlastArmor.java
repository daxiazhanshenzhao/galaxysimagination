package org.galaxysimagination.attribute;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.PercentageAttribute;
import net.neoforged.neoforge.common.damagesource.DamageContainer;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import org.checkerframework.checker.units.qual.C;
import org.galaxysimagination.Galaxysimagination;

import javax.swing.text.html.parser.Entity;

@EventBusSubscriber(modid = Galaxysimagination.MODID)
public class BlastArmor extends PercentageAttribute {
    public BlastArmor() {
        super("attribute.name.galaxysimagination.blast_armor",
                0.0,
                0.0,
                100.0);
    }




    @SubscribeEvent
    public static void blastDamageChange(LivingIncomingDamageEvent event) {
        LivingEntity entity = event.getEntity();
        DamageSource source = event.getSource();

        // 只处理爆炸伤害
        if (source.is(DamageTypes.EXPLOSION) || source.is(DamageTypes.PLAYER_EXPLOSION)) {
            // 检查是否有爆炸抗性修饰符
            boolean hasModifier = entity.getAttributes().hasModifier(
                    A1RegistetAttribute.BLAST_ARMOR,
                    ResourceLocation.fromNamespaceAndPath("galaxysimagination", "explosion_resistance")
            );

            if (hasModifier) {
                double armor = entity.getAttributeValue(A1RegistetAttribute.BLAST_ARMOR);
                double reduction = Math.min(Math.max(armor, 0.0), 90.0) / 100.0;
                float originalAmount = event.getOriginalAmount();
                float newAmount = (float) (originalAmount * (1.0 - reduction));
                event.setAmount(Math.max(0, newAmount));

//                entity.sendSystemMessage(Component.literal(
//                        "爆炸伤害减免: 原始=" + originalAmount +
//                                "，减伤=" + (int)(reduction * 100) + "%" +
//                                "，最终=" + newAmount
//                ));
            }
        }
    }

}
