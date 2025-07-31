package org.galaxysimagination.datagen;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.galaxysimagination.Galaxysimagination;
import org.galaxysimagination.datagen.lang.ChineseLanguageProvider;
import org.galaxysimagination.datagen.lang.EnglishLanguageProvider;
import org.galaxysimagination.datagen.model.ModItemModelProvider;
import org.galaxysimagination.datagen.recipe.StockpotRecipeProvider;

@EventBusSubscriber(modid = Galaxysimagination.MODID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        var generator = event.getGenerator();
        var registries = event.getLookupProvider();
        var vanillaPack = generator.getVanillaPack(true);
        var helper = event.getExistingFileHelper();
        var pack = generator.getPackOutput();
        //itemRecipe
        generator.addProvider(event.includeServer(),new StockpotRecipeProvider(pack,registries));
        //item
        generator.addProvider(event.includeClient(),new ModItemModelProvider(pack,Galaxysimagination.MODID,helper));
        //lang
        generator.addProvider(event.includeClient(),new ChineseLanguageProvider(pack,Galaxysimagination.MODID,"zh_cn"));
        generator.addProvider(event.includeClient(),new EnglishLanguageProvider(pack,Galaxysimagination.MODID,"en_us"));

    }
}