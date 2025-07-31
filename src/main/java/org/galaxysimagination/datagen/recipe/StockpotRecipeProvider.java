package org.galaxysimagination.datagen.recipe;

import com.github.ysbbbbbb.kaleidoscopecookery.datagen.builder.StockpotRecipeBuilder;
import com.github.ysbbbbbb.kaleidoscopecookery.datagen.recipe.ModRecipeProvider;
import com.github.ysbbbbbb.kaleidoscopecookery.init.ModSoupBases;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import org.galaxysimagination.item.A1RegisteyItem;

import java.util.concurrent.CompletableFuture;

public class StockpotRecipeProvider extends ModRecipeProvider {

    public StockpotRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    public void buildRecipes(RecipeOutput consumer) {
        // blaze_powder_stew 炽焰灵汤：烈焰粉+烈焰棒+火药+岩浆
        StockpotRecipeBuilder.builder()
                .addInput(Items.BLAZE_POWDER, Items.BLAZE_ROD, Items.GUNPOWDER)
                .setSoupBase(ModSoupBases.LAVA)
                .setResult(A1RegisteyItem.BLAZE_POWDER_STEW.get())
                .save(consumer, "blaze_powder_stew");

        // leather_potato_stew 坚韧之心浓汤：皮革+土豆+牛肉+胡萝卜+水
        StockpotRecipeBuilder.builder()
                .addInput(Items.LEATHER, Items.POTATO, Items.BEEF, Items.CARROT)
                .setSoupBase(ModSoupBases.WATER)
                .setResult(A1RegisteyItem.LEATHER_POTATO_STEW.get())
                .save(consumer, "leather_potato_stew");

        // amethyst_stew 星辉秘汤：紫水晶+紫水晶簇+荧光墨囊+水
        StockpotRecipeBuilder.builder()
                .addInput(Items.AMETHYST_SHARD, Items.AMETHYST_CLUSTER, Items.GLOW_INK_SAC)
                .setSoupBase(ModSoupBases.WATER)
                .setResult(A1RegisteyItem.AMETHYST_STEW.get())
                .save(consumer, "amethyst_stew");

        // glow_ink_stew 幽光潜影汤：荧光墨囊+墨囊+海晶碎片+水
        StockpotRecipeBuilder.builder()
                .addInput(Items.GLOW_INK_SAC, Items.INK_SAC, Items.PRISMARINE_SHARD)
                .setSoupBase(ModSoupBases.WATER)
                .setResult(A1RegisteyItem.GLOW_INK_STEW.get())
                .save(consumer, "glow_ink_stew");

        // gunpowder_stew 爆鸣熔流浓汤：火药+TNT+烈焰粉+岩浆
        StockpotRecipeBuilder.builder()
                .addInput(Items.GUNPOWDER, Items.TNT, Items.BLAZE_POWDER)
                .setSoupBase(ModSoupBases.LAVA)
                .setResult(A1RegisteyItem.GUNPOWDER_STEW.get())
                .save(consumer, "gunpowder_stew");

        // goat_horn_stew 逐风之角炖汤：山羊角+火焰弹+烈焰棒+末影珍珠+岩浆
        StockpotRecipeBuilder.builder()
                .addInput(Items.GOAT_HORN, Items.FIRE_CHARGE, Items.BLAZE_ROD, Items.ENDER_PEARL)
                .setSoupBase(ModSoupBases.LAVA)
                .setResult(A1RegisteyItem.GOAT_HORN_STEW.get())
                .save(consumer, "goat_horn_stew");

        // netherite_stew 炼狱精金灵汤：下界合金+古代残骸+金锭+岩浆
        StockpotRecipeBuilder.builder()
                .addInput(Items.NETHERITE_INGOT, Items.ANCIENT_DEBRIS, Items.GOLD_INGOT)
                .setSoupBase(ModSoupBases.LAVA)
                .setResult(A1RegisteyItem.NETHERITE_STEW.get())
                .save(consumer, "netherite_stew");

        // kelp_seed_stew 海潮丰盈汤：海带+小麦种子+海草+鱼+水
        StockpotRecipeBuilder.builder()
                .addInput(Items.KELP, Items.WHEAT_SEEDS, Items.SEAGRASS, Items.COD)
                .setSoupBase(ModSoupBases.WATER)
                .setResult(A1RegisteyItem.KELP_SEED_STEW.get())
                .save(consumer, "kelp_seed_stew");

        // rotten_flesh_stew 腐影暗煮：腐肉+蜘蛛眼+毒马铃薯+骨头+水
        StockpotRecipeBuilder.builder()
                .addInput(Items.ROTTEN_FLESH, Items.SPIDER_EYE, Items.POISONOUS_POTATO, Items.BONE)
                .setSoupBase(ModSoupBases.WATER)
                .setResult(A1RegisteyItem.ROTTEN_FLESH_STEW.get())
                .save(consumer, "rotten_flesh_stew");

        // sculk_stew 幽匿幻隐汤：幽匿块+幽匿感测器+回响碎片+水
        StockpotRecipeBuilder.builder()
                .addInput(Items.SCULK, Items.SCULK_SENSOR, Items.ECHO_SHARD)
                .setSoupBase(ModSoupBases.WATER)
                .setResult(A1RegisteyItem.SCULK_STEW.get())
                .save(consumer, "sculk_stew");

        // slime_ball_stew 弹跃秘酿：粘液球+蜂蜜块+兔子脚+水
        StockpotRecipeBuilder.builder()
                .addInput(Items.SLIME_BALL, Items.HONEY_BLOCK, Items.RABBIT_FOOT)
                .setSoupBase(ModSoupBases.WATER)
                .setResult(A1RegisteyItem.SLIME_BALL_STEW.get())
                .save(consumer, "slime_ball_stew");

        // wither_skull_stew 凋魂诅咒浓汤：凋零骷髅头+凋零玫瑰+灵魂沙+岩浆
        StockpotRecipeBuilder.builder()
                .addInput(Items.WITHER_SKELETON_SKULL, Items.WITHER_ROSE, Items.SOUL_SAND)
                .setSoupBase(ModSoupBases.LAVA)
                .setResult(A1RegisteyItem.WITHER_SKULL_STEW.get())
                .save(consumer, "wither_skull_stew");
    }
}