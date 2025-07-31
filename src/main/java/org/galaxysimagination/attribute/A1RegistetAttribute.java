package org.galaxysimagination.attribute;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.galaxysimagination.Galaxysimagination;

@EventBusSubscriber(modid = Galaxysimagination.MODID)
public class A1RegistetAttribute {

    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, Galaxysimagination.MODID);


    public static void register(IEventBus eventBus){
        ATTRIBUTES.register(eventBus);
    }

    @SubscribeEvent
    public static void onEntityAttributeModification(net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent event) {
        event.getTypes().forEach(type -> ATTRIBUTES.getEntries().forEach(attr -> event.add(type, attr)));
    }

    public static final DeferredHolder<Attribute,Attribute> BLAST_ARMOR ;



    static {
        BLAST_ARMOR = ATTRIBUTES.register("blast_armor",BlastArmor::new);
    }

}
