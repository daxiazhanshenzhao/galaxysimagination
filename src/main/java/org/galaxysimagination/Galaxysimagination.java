package org.galaxysimagination;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.galaxysimagination.Util.CreativeTab;
import org.galaxysimagination.attribute.A1RegistetAttribute;
import org.galaxysimagination.effect.A1RegisteyEffect;
import org.galaxysimagination.item.A1RegisteyItem;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Galaxysimagination.MODID)
public class Galaxysimagination {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "galaxysimagination";
    // Directly reference a slf4j logger


    public Galaxysimagination(IEventBus eventBus){
        A1RegisteyEffect.register(eventBus);
        A1RegistetAttribute.register(eventBus);
        A1RegisteyItem.register(eventBus);
        CreativeTab.register(eventBus);
    }
}
