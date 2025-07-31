package org.galaxysimagination.item;

import com.github.ysbbbbbb.kaleidoscopecookery.item.BowlFoodOnlyItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.galaxysimagination.Galaxysimagination;

public class A1RegisteyItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Galaxysimagination.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final DeferredItem<Item> BLAZE_POWDER_STEW;
    public static final DeferredItem<Item> LEATHER_POTATO_STEW;
    public static final DeferredItem<Item> AMETHYST_STEW;
    public static final DeferredItem<Item> GLOW_INK_STEW;
    public static final DeferredItem<Item> GUNPOWDER_STEW;
    public static final DeferredItem<Item> GOAT_HORN_STEW;
    public static final DeferredItem<Item> NETHERITE_STEW;
    public static final DeferredItem<Item> KELP_SEED_STEW;
    public static final DeferredItem<Item> ROTTEN_FLESH_STEW;
    public static final DeferredItem<Item> SCULK_STEW;
    public static final DeferredItem<Item> SLIME_BALL_STEW;
    public static final DeferredItem<Item> WITHER_SKULL_STEW;

    static {
        BLAZE_POWDER_STEW = ITEMS.register("blaze_powder_stew",
                () -> new BowlFoodOnlyItem(EffectedFoodItem.BLAZE_POWDER_STEW)
        );
        LEATHER_POTATO_STEW = ITEMS.register("leather_potato_stew",
                () -> new BowlFoodOnlyItem(EffectedFoodItem.LEATHER_POTATO_STEW)
        );
        AMETHYST_STEW = ITEMS.register("amethyst_stew",
                () -> new BowlFoodOnlyItem(EffectedFoodItem.AMETHYST_STEW)
        );
        GLOW_INK_STEW = ITEMS.register("glow_ink_stew",
                () -> new BowlFoodOnlyItem(EffectedFoodItem.GLOW_INK_STEW)
        );
        GUNPOWDER_STEW = ITEMS.register("gunpowder_stew",
                () -> new BowlFoodOnlyItem(EffectedFoodItem.GUNPOWDER_STEW)
        );
        GOAT_HORN_STEW = ITEMS.register("goat_horn_stew",
                () -> new BowlFoodOnlyItem(EffectedFoodItem.GOAT_HORN_STEW)
        );
        NETHERITE_STEW = ITEMS.register("netherite_stew",
                () -> new BowlFoodOnlyItem(EffectedFoodItem.NETHERITE_STEW)
        );
        KELP_SEED_STEW = ITEMS.register("kelp_seed_stew",
                () -> new BowlFoodOnlyItem(EffectedFoodItem.KELP_SEED_STEW)
        );
        ROTTEN_FLESH_STEW = ITEMS.register("rotten_flesh_stew",
                () -> new BowlFoodOnlyItem(EffectedFoodItem.ROTTEN_FLESH_STEW)
        );
        SCULK_STEW = ITEMS.register("sculk_stew",
                () -> new BowlFoodOnlyItem(EffectedFoodItem.SCULK_STEW)
        );
        SLIME_BALL_STEW = ITEMS.register("slime_ball_stew",
                () -> new BowlFoodOnlyItem(EffectedFoodItem.SLIME_BALL_STEW)
        );
        WITHER_SKULL_STEW = ITEMS.register("wither_skull_stew",
                () -> new BowlFoodOnlyItem(EffectedFoodItem.WITHER_SKULL_STEW)
        );
    }
}