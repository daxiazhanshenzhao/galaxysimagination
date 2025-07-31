package org.galaxysimagination.datagen.model;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.galaxysimagination.item.A1RegisteyItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(A1RegisteyItem.BLAZE_POWDER_STEW.get());
        basicItem(A1RegisteyItem.LEATHER_POTATO_STEW.get());
        basicItem(A1RegisteyItem.AMETHYST_STEW.get());
        basicItem(A1RegisteyItem.GLOW_INK_STEW.get());
        // basicItem(A1RegisteyItem.GHAST_TEAR_STEW.get()); // 如启用可取消注释
        basicItem(A1RegisteyItem.GUNPOWDER_STEW.get());
        basicItem(A1RegisteyItem.GOAT_HORN_STEW.get());
        basicItem(A1RegisteyItem.NETHERITE_STEW.get());
        basicItem(A1RegisteyItem.KELP_SEED_STEW.get());
        basicItem(A1RegisteyItem.ROTTEN_FLESH_STEW.get());
        basicItem(A1RegisteyItem.SCULK_STEW.get());
        basicItem(A1RegisteyItem.SLIME_BALL_STEW.get());
        basicItem(A1RegisteyItem.WITHER_SKULL_STEW.get());
    }
}
