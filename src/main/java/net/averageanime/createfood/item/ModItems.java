package net.averageanime.createfood.item;

import com.nhoryzon.mc.farmersdelight.block.PieBlock;
import net.averageanime.createfood.CreateFood;
import net.averageanime.createfood.block.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static net.averageanime.createfood.CreateFood.CONFIG;
import static net.averageanime.createfood.block.ModBlocks.*;

public class ModItems {
    public static final Item ICON = registerItem("icon", new ConsumableItem(new FabricItemSettings()));
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CreateFood.LOGGER.info("Registering Items for " + CreateFood.MOD_ID);
    }
    public static void registerItem(){

// Apple Cheesecake & Slice

        if (CONFIG.isAppleCheesecakeEnabled) {
            final Item APPLE_CHEESECAKE_SLICE = registerItem("apple_cheesecake_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f)
                    .statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F)
                    .build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CHEESECAKE_SLICE));
            APPLE_CHEESECAKE = registerBlock("apple_cheesecake", new PieBlock(APPLE_CHEESECAKE_SLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CHEESECAKE));
        }

// Apple Cream Chocolate

        if (CONFIG.isAppleCreamChocolateEnabled) {
            final Item APPLE_CREAM_CHOCOLATE = registerItem("apple_cream_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_CHOCOLATE));
        }

// Apple Cream Dark Chocolate

        if (CONFIG.isAppleCreamDarkChocolateEnabled) {
            final Item APPLE_CREAM_DARK_CHOCOLATE = registerItem("apple_cream_dark_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_DARK_CHOCOLATE));
        }
// Apple Cream Glazed Chocolate Donut

        if (CONFIG.isAppleCreamGlazedChocolateDonutEnabled) {
            final Item APPLE_CREAM_GLAZED_CHOCOLATE_DONUT = registerItem("apple_cream_glazed_chocolate_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_GLAZED_CHOCOLATE_DONUT));
        }

// Apple Cream Glazed Donut

        if (CONFIG.isAppleCreamGlazedDonutEnabled) {
            final Item APPLE_CREAM_GLAZED_DONUT = registerItem("apple_cream_glazed_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_GLAZED_DONUT));
        }

// Apple Cream White Chocolate

        if (CONFIG.isAppleCreamWhiteChocolateEnabled) {
            final Item APPLE_CREAM_WHITE_CHOCOLATE = registerItem("apple_cream_white_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_WHITE_CHOCOLATE));
        }

// Apple Cream Filled Chocolate Pastry Bar

        if (CONFIG.isAppleCreamChocolatePastryBarEnabled) {
            final Item APPLE_CREAM_CHOCOLATE_PASTRY_BAR = registerItem("apple_cream_chocolate_pastry_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_CHOCOLATE_PASTRY_BAR));
        }

// Apple Cream Filled Pastry Bar

        if (CONFIG.isAppleCreamPastryBarEnabled) {
            final Item APPLE_CREAM_PASTRY_BAR = registerItem("apple_cream_pastry_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_PASTRY_BAR));
        }

// Apple Cream Frosting Bottle

        if (CONFIG.isAppleCreamFrostingBottleEnabled) {
            final Item APPLE_CREAM_FROSTING_BOTTLE = registerItem("apple_cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_FROSTING_BOTTLE));
        }

// Apple Cream Frosted Chocolate Sweet Roll

        if (CONFIG.isAppleCreamFrostedChocolateSweetRollEnabled) {
            final Item APPLE_CREAM_FROSTED_CHOCOLATE_SWEET_ROLL = registerItem("apple_cream_frosted_chocolate_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_FROSTED_CHOCOLATE_SWEET_ROLL));
        }

// Apple Cream Frosted Cupcake

        if (CONFIG.isAppleCreamFrostedCupcakeEnabled) {
            final Item APPLE_CREAM_FROSTED_CUPCAKE = registerItem("apple_cream_frosted_cupcake", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_FROSTED_CUPCAKE));
        }

// Apple Cream Frosted Mini Waffle

        if (CONFIG.isAppleCreamFrostedMiniWaffleEnabled) {
            final Item APPLE_CREAM_FROSTED_MINI_WAFFLE = registerItem("apple_cream_frosted_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.6f).snack().statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_FROSTED_MINI_WAFFLE));
        }

// Apple Cream Frosted Sweet Roll

        if (CONFIG.isAppleCreamFrostedSweetRollEnabled) {
            final Item APPLE_CREAM_FROSTED_SWEET_ROLL = registerItem("apple_cream_frosted_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_FROSTED_SWEET_ROLL));
        }

// Apple Ice Cream Bowl

        if (CONFIG.isAppleIceCreamBowlEnabled) {
            final Item APPLE_ICE_CREAM_BOWL = registerItem("apple_ice_cream_bowl", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.1f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_ICE_CREAM_BOWL));
        }

// Apple Ice Cream Cone

        if (CONFIG.isAppleIceCreamConeEnabled) {
            final Item APPLE_ICE_CREAM_CONE = registerItem("apple_ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).snack().statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_ICE_CREAM_CONE));
        }

// Apple Ice Cream Stick

        if (CONFIG.isAppleIceCreamStickEnabled) {
            final Item APPLE_ICE_CREAM_STICK = registerItem("apple_ice_cream_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_ICE_CREAM_STICK));
        }

// Apple Jam

        if (CONFIG.isAppleJamBottleEnabled) {
            final Item APPLE_JAM_BOTTLE = registerItem("apple_jam_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_JAM_BOTTLE));
        }

// Apple Jam Sandwich

        if (CONFIG.isAppleJamSandwichEnabled) {
            final Item APPLE_JAM_SANDWICH = registerItem("apple_jam_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0), 1.0F).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_JAM_SANDWICH));
        }

// Apple Juice

        if (CONFIG.isAppleJuiceBottleEnabled) {
            final Item APPLE_JUICE_BOTTLE = registerItem("apple_juice_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_JUICE_BOTTLE));
        }

// Apple Milkshake

        if (CONFIG.isAppleMilkshakeBottleEnabled) {
            final Item APPLE_MILKSHAKE_BOTTLE = registerItem("apple_milkshake_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_MILKSHAKE_BOTTLE));
        }

// Apple Popsicle

        if (CONFIG.isApplePopsicleEnabled) {
            final Item APPLE_POPSICLE = registerItem("apple_popsicle", new StickFood(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_POPSICLE));
        }

// Apple Slice

        if (CONFIG.isAppleSliceEnabled) {
            final Item APPLE_SLICE = registerItem("apple_slice", new ConsumableItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_SLICE));
        }

// Bacon Calzone

        if (CONFIG.isBaconCalzoneEnabled) {
            final Item BACON_CALZONE = registerItem("bacon_calzone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BACON_CALZONE));
        }

// Bacon Pizza & Slice

        if (CONFIG.isBaconPizzaEnabled) {
            final Item BACON_PIZZA_SLICE = registerItem("bacon_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BACON_PIZZA_SLICE));
            BACON_PIZZA = registerBlock("bacon_pizza", new PizzaBlock(BACON_PIZZA_SLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BACON_PIZZA));
        }

// Bacon Sandwich

        if (CONFIG.isBaconSandwichEnabled) {
            final Item BACON_SANDWICH = registerItem("bacon_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BACON_SANDWICH));
        }

// Bacon Sandwich (Lettuce)

        if (CONFIG.isBaconSandwichLettuceEnabled) {
            final Item BACON_SANDWICH_LETTUCE = registerItem("bacon_sandwich_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BACON_SANDWICH_LETTUCE));
        }

// Bar of Dark Chocolate

        if (CONFIG.isDarkChocolateBarEnabled) {
            final Item BAR_OF_DARK_CHOCOLATE = registerItem("bar_of_dark_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.2f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BAR_OF_DARK_CHOCOLATE));
        }

// Bar of White Chocolate

        if (CONFIG.isWhiteChocolateBarEnabled) {
            final Item BAR_OF_WHITE_CHOCOLATE = registerItem("bar_of_white_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BAR_OF_WHITE_CHOCOLATE));
        }

// Beef Bun

        if (CONFIG.isBeefBunEnabled) {
            final Item BEEF_BUN = registerItem("beef_bun", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEF_BUN));
        }

// Beef Bun (Bacon)

        if (CONFIG.isBeefBunBaconEnabled) {
            final Item BEEF_BUN_BACON = registerItem("beef_bun_bacon", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEF_BUN_BACON));
        }

// Beef Bun (Bacon, Lettuce)

        if (CONFIG.isBeefBunBaconLettuceEnabled) {
            final Item BEEF_BUN_BACON_LETTUCE = registerItem("beef_bun_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEF_BUN_BACON_LETTUCE));
        }

// Beef Bun (Bacon, Lettuce, Tomato)

        if (CONFIG.isBeefBunBaconLettuceTomatoEnabled) {
            final Item BEEFBUNBACONLETTUCETOMATO = registerItem("beef_bun_bacon_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNBACONLETTUCETOMATO));
        }

// Beef Bun (Lettuce)

        if (CONFIG.isBeefBunLettuceEnabled) {
            final Item BEEFBUNLETTUCE = registerItem("beef_bun_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNLETTUCE));
        }

// Beef Bun (Lettuce, Tomato)

        if (CONFIG.isBeefBunLettuceTomatoEnabled) {
            final Item BEEFBUNLETTUCETOMATO = registerItem("beef_bun_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNLETTUCETOMATO));
        }

// Beef Bun (Onion)

        if (CONFIG.isBeefBunOnionEnabled) {
            final Item BEEFBUNONION = registerItem("beef_bun_onion", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNONION));
        }

// Beef Bun (Onion, Bacon)

        if (CONFIG.isBeefBunOnionBaconEnabled) {
            final Item BEEFBUNONIONBACON = registerItem("beef_bun_onion_bacon", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNONIONBACON));
        }

// Beef Bun (Onion, Bacon, Lettuce)

        if (CONFIG.isBeefBunOnionBaconLettuceEnabled) {
            final Item BEEFBUNONIONBACONLETTUCE = registerItem("beef_bun_onion_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNONIONBACONLETTUCE));
        }

// Beef Bun (Onion, Lettuce)

        if (CONFIG.isBeefBunOnionLettuceEnabled) {
            final Item BEEFBUNONIONLETTUCE = registerItem("beef_bun_onion_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNONIONLETTUCE));
        }

// Beef Bun (Onion, Lettuce, Tomato)

        if (CONFIG.isBeefBunOnionLettuceTomatoEnabled) {
            final Item BEEFBUNONIONLETTUCETOMATO = registerItem("beef_bun_onion_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(1.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNONIONLETTUCETOMATO));
        }

// Beef Bun (Peanut Butter)

        if (CONFIG.isBeefBunPeanutButterEnabled) {
            final Item BEEFBUNPEANUTBUTTER = registerItem("beef_bun_peanut_butter", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNPEANUTBUTTER));
        }

// Beef Bun (Peanut Butter, Bacon)

        if (CONFIG.isBeefBunPeanutButterBaconEnabled) {
            final Item BEEFBUNPEANUTBUTTERBACON = registerItem("beef_bun_peanut_butter_bacon", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BEEFBUNPEANUTBUTTERBACON));
        }
// Berry Cream Cake Slice (Chorus Fruit)

        if (CONFIG.isBerryCreamCakeChorusFruitEnabled) {
            final Item BERRY_CREAM_CAKE_SLICE_CHORUS_FRUIT = registerItem("berry_cream_cake_slice_chorus_fruit", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_CAKE_SLICE_CHORUS_FRUIT));
            BERRY_CREAM_CAKE_CHORUS_FRUIT = registerBlock("berry_cream_cake_chorus_fruit", new BerryCreamCakeChorusFruitBlock(BERRY_CREAM_CAKE_SLICE_CHORUS_FRUIT));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_CAKE_CHORUS_FRUIT));
        }

// Berry Cream Cake Slice (Glow Berry)

        if (CONFIG.isBerryCreamCakeGlowBerryEnabled) {
            final Item BERRY_CREAM_CAKE_SLICE_GLOW_BERRY = registerItem("berry_cream_cake_slice_glow_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_CAKE_SLICE_GLOW_BERRY));
            BERRY_CREAM_CAKE_GLOW_BERRY = registerBlock("berry_cream_cake_glow_berry", new BerryCreamCakeGlowBerryBlock(BERRY_CREAM_CAKE_SLICE_GLOW_BERRY));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_CAKE_GLOW_BERRY));
        }

// Berry Cream Cake Slice (Sweet Berry)

        if (CONFIG.isBerryCreamCakeSweetBerryEnabled) {
            final Item BERRY_CREAM_CAKE_SLICE_SWEET_BERRY = registerItem("berry_cream_cake_slice_sweet_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_CAKE_SLICE_SWEET_BERRY));
            BERRY_CREAM_CAKE_SWEET_BERRY = registerBlock("berry_cream_cake_sweet_berry", new BerryCreamCakeSweetBerryBlock(BERRY_CREAM_CAKE_SLICE_SWEET_BERRY));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_CAKE_SWEET_BERRY));
        }

// Berry Cream Chocolate

        if (CONFIG.isBerryCreamChocolateEnabled) {
            final Item BERRYCREAMCHOCOLATE = registerItem("berry_cream_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMCHOCOLATE));
        }

// Berry Cream Dark Chocolate

        if (CONFIG.isBerryCreamDarkChocolateEnabled) {
            final Item BERRYCREAMDARKCHOCOLATE = registerItem("berry_cream_dark_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMDARKCHOCOLATE));
        }

// Berry Cream White Chocolate

        if (CONFIG.isBerryCreamWhiteChocolateEnabled) {
            final Item BERRYCREAMWHITECHOCOLATE = registerItem("berry_cream_white_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMWHITECHOCOLATE));
        }

// Berry Cream Filled Chocolate Pastry Bar

        if (CONFIG.isBerryCreamChocolatePastryBarEnabled) {
            final Item BERRYCREAMCHOCOLATEPASTRYBAR = registerItem("berry_cream_chocolate_pastry_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMCHOCOLATEPASTRYBAR));
        }

// Berry Cream Filled Pastry Bar

        if (CONFIG.isBerryCreamPastryBarEnabled) {
            final Item BERRYCREAMPASTRYBAR = registerItem("berry_cream_pastry_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMPASTRYBAR));
        }
// Berry Cream Frosting Bottle

        if (CONFIG.isBerryCreamFrostingBottleEnabled) {
            final Item BERRYCREAMFROSTINGBOTTLE = registerItem("berry_cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMFROSTINGBOTTLE));
        }

// Berry Cream Frosted Chocolate Sweet Roll

        if (CONFIG.isBerryCreamFrostedChocolateSweetRollEnabled) {
            final Item BERRYCREAMFROSTEDCHOCOLATESWEETROLL = registerItem("berry_cream_frosted_chocolate_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMFROSTEDCHOCOLATESWEETROLL));
        }

// Berry Cream Frosted Chocolate Sweet Roll (Sweet Berry)

        if (CONFIG.isBerryCreamFrostedChocolateSweetRollSweetBerryEnabled) {
            final Item BERRYCREAMFROSTEDCHOCOLATESWEETROLLSWEETBERRY = registerItem("berry_cream_frosted_chocolate_sweet_roll_sweet_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMFROSTEDCHOCOLATESWEETROLLSWEETBERRY));
        }

// Berry Cream Frosted Cupcake

        if (CONFIG.isBerryCreamFrostedCupcakeEnabled) {
            final Item BERRY_CREAM_FROSTED_CUPCAKE = registerItem("berry_cream_frosted_cupcake", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_FROSTED_CUPCAKE));
        }

// Berry Cream Frosted Mini Waffle

        if (CONFIG.isBerryCreamFrostedMiniWaffleEnabled) {
            final Item BERRY_CREAM_FROSTED_MINI_WAFFLE = registerItem("berry_cream_frosted_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.9f).snack().statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_FROSTED_MINI_WAFFLE));
        }

// Berry Cream Frosted Mini Waffle (Sweet Berry)

        if (CONFIG.isBerryCreamFrostedMiniWaffleSweetBerryEnabled) {
            final Item BERRY_CREAM_FROSTED_MINI_WAFFLE_SWEET_BERRY = registerItem("berry_cream_frosted_mini_waffle_sweet_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.9f).snack().statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_FROSTED_MINI_WAFFLE_SWEET_BERRY));
        }

// Berry Cream Frosted Sweet Roll

        if (CONFIG.isBerryCreamFrostedSweetRollEnabled) {
            final Item BERRYCREAMFROSTEDSWEETROLL = registerItem("berry_cream_frosted_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMFROSTEDSWEETROLL));
        }

// Berry Cream Frosted Sweet Roll (Sweet Berry)

        if (CONFIG.isBerryCreamFrostedSweetRollSweetBerryEnabled) {
            final Item BERRYCREAMFROSTEDSWEETROLLSWEETBERRY = registerItem("berry_cream_frosted_sweet_roll_sweet_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMFROSTEDSWEETROLLSWEETBERRY));
        }

// Berry Cream Glazed Chocolate Donut

        if (CONFIG.isBerryCreamGlazedChocolateDonutEnabled) {
            final Item BERRYCREAMGLAZEDCHOCOLATEDONUT = registerItem("berry_cream_glazed_chocolate_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMGLAZEDCHOCOLATEDONUT));
        }

// Berry Cream Glazed Donut

        if (CONFIG.isBerryCreamGlazedDonutEnabled) {
            final Item BERRYCREAMGLAZEDDONUT = registerItem("berry_cream_glazed_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYCREAMGLAZEDDONUT));
        }

// Berry Ice Cream Bowl

        if (CONFIG.isBerryIceCreamBowlEnabled) {
            final Item BERRYICECREAMBOWL = registerItem("berry_ice_cream_bowl", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYICECREAMBOWL));
        }

// Berry Ice Cream Cone

        if (CONFIG.isBerryIceCreamConeEnabled) {
            final Item BERRY_ICE_CREAM_CONE = registerItem("berry_ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.9f).snack().statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_ICE_CREAM_CONE));
        }

// Berry Ice Cream Stick

        if (CONFIG.isBerryIceCreamStickEnabled) {
            final Item BERRY_ICE_CREAM_STICK = registerItem("berry_ice_cream_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.9f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_ICE_CREAM_STICK));
        }

// Berry Jam

        if (CONFIG.isBerryJamBottleEnabled) {
            final Item BERRYJAMBOTTLE = registerItem("berry_jam_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYJAMBOTTLE));
        }

// Berry Jam Sandwich

        if (CONFIG.isBerryJamSandwichEnabled) {
            final Item BERRYJAMSANDWICH = registerItem("berry_jam_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYJAMSANDWICH));
        }

// Berry Juice

        if (CONFIG.isBerryJuiceBottleEnabled) {
            final Item BERRYJUICEBOTTLE = registerItem("berry_juice_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYJUICEBOTTLE));
        }

// Berry Milkshake

        if (CONFIG.isBerryMilkshakeBottleEnabled) {
            final Item BERRYMILKSHAKEBOTTLE = registerItem("berry_milkshake_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYMILKSHAKEBOTTLE));
        }

// Berry Pie & Slice

        if (CONFIG.isBerryPieEnabled) {
            final Item BERRY_PIE_SLICE = registerItem("berry_pie_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f)
                    .statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F)
                    .build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_PIE_SLICE));
            BERRY_PIE = registerBlock("berry_pie", new PieBlock(BERRY_PIE_SLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_PIE));
        }

// Berry Popsicle

        if (CONFIG.isBerryPopsicleEnabled) {
            final Item BERRYPOPSICLE = registerItem("berry_popsicle", new StickFood(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRYPOPSICLE));
        }

// Biscuit

        if (CONFIG.isBiscuitEnabled) {
            final Item BISCUIT = registerItem("biscuit", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BISCUIT));
        }

// Blackstrap Molasses Bottle

        if (CONFIG.isBlackstrapMolassesBottleEnabled) {
            final Item BLACKSTRAPMOLASSESBOTTLE = registerItem("blackstrap_molasses_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(3.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BLACKSTRAPMOLASSESBOTTLE));
        }

// Bread (Fried Egg)

        if (CONFIG.isBreadFriedEggEnabled) {
            final Item BREADFRIEDEGG = registerItem("bread_fried_egg", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADFRIEDEGG));
        }

// Bread (Lettuce)

        if (CONFIG.isBreadLettuceEnabled) {
            final Item BREADLETTUCE = registerItem("bread_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADLETTUCE));
        }

// Bread (Lettuce, Carrot)

        if (CONFIG.isBreadLettuceCarrotEnabled) {
            final Item BREADLETTUCECARROT = registerItem("bread_lettuce_carrot", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADLETTUCECARROT));
        }

// Bread Slice

        if (CONFIG.isBreadSliceEnabled) {
            final Item BREADSLICE = registerItem("bread_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICE));
        }

// Bread Slice (Apple Jam)

        if (CONFIG.isBreadSliceAppleJamEnabled) {
            final Item BREADSLICEAPPLEJAM = registerItem("bread_slice_apple_jam", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEAPPLEJAM));
        }

// Bread Slice (Bacon)

        if (CONFIG.isBreadSliceBaconEnabled) {
            final Item BREADSLICEBACON = registerItem("bread_slice_bacon", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEBACON));
        }

// Bread Slice (Bacon, Lettuce)

        if (CONFIG.isBreadSliceBaconLettuceEnabled) {
            final Item BREADSLICEBACONLETTUCE = registerItem("bread_slice_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEBACONLETTUCE));
        }

// Bread Slice (Bacon, Lettuce, Tomato)

        if (CONFIG.isBreadSliceBaconLettuceTomatoEnabled) {
            final Item BREADSLICEBACONLETTUCETOMATO = registerItem("bread_slice_bacon_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEBACONLETTUCETOMATO));
        }

// Bread Slice (Berry Jam)

        if (CONFIG.isBreadSliceBerryJamEnabled) {
            final Item BREADSLICEBERRYJAM = registerItem("bread_slice_berry_jam", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEBERRYJAM));
        }

// Bread Slice (Beetroot)

        if (CONFIG.isBreadSliceBeetrootEnabled) {
            final Item BREADSLICEBEETROOT = registerItem("bread_slice_beetroot", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEBEETROOT));
        }

// Bread Slice (Beetroot, Lettuce)

        if (CONFIG.isBreadSliceBeetrootLettuceEnabled) {
            final Item BREADSLICEBEETROOTLETTUCE = registerItem("bread_slice_beetroot_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEBEETROOTLETTUCE));
        }

// Bread Slice (Cheese)

        if (CONFIG.isBreadSliceCheeseEnabled) {
            final Item BREADSLICECHEESE = registerItem("bread_slice_cheese", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICECHEESE));
        }

// Bread Slice (Chorus Fruit Jam)

        if (CONFIG.isBreadSliceChorusFruitJamEnabled) {
            final Item BREADSLICECHORUSFRUITJAM = registerItem("bread_slice_chorus_fruit_jam", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICECHORUSFRUITJAM));
        }

// Bread Slice (Glow Berry Jam)

        if (CONFIG.isBreadSliceGlowBerryJamEnabled) {
            final Item BREADSLICEGLOWBERRYJAM = registerItem("bread_slice_glow_berry_jam", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEGLOWBERRYJAM));
        }

// Bread Slice (Honey)

        if (CONFIG.isBreadSliceHoneyEnabled) {
            final Item BREADSLICEHONEY = registerItem("bread_slice_honey", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEHONEY));
        }

// Bread Slice (Lettuce)

        if (CONFIG.isBreadSliceLettuceEnabled) {
            final Item BREADSLICELETTUCE = registerItem("bread_slice_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICELETTUCE));
        }

// Bread Slice (Lettuce, Tomato)

        if (CONFIG.isBreadSliceLettuceTomatoEnabled) {
            final Item BREADSLICELETTUCETOMATO = registerItem("bread_slice_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICELETTUCETOMATO));
        }

// Bread Slice (Melon Jam)

        if (CONFIG.isBreadSliceMelonJamEnabled) {
            final Item BREADSLICEMELONJAM = registerItem("bread_slice_melon_jam", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEMELONJAM));
        }

// Bread Slice (Mutton)

        if (CONFIG.isBreadSliceMuttonEnabled) {
            final Item BREADSLICEMUTTON = registerItem("bread_slice_mutton", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEMUTTON));
        }

// Bread Slice (Mutton, Beetroot)

        if (CONFIG.isBreadSliceMuttonBeetrootEnabled) {
            final Item BREADSLICEMUTTONBEETROOT = registerItem("bread_slice_mutton_beetroot", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEMUTTONBEETROOT));
        }

// Bread Slice (Peanut Butter)

        if (CONFIG.isBreadSlicePeanutButterEnabled) {
            final Item BREADSLICEPEANUTBUTTER = registerItem("bread_slice_peanut_butter", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREADSLICEPEANUTBUTTER));
        }

// Breakfast Bar

        if (CONFIG.isBreakfastBarEnabled) {
            final Item BREAKFASTBAR = registerItem("breakfast_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(4.1f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREAKFASTBAR));
        }

// Breakfast Plate

        if (CONFIG.isBreakfastPlateEnabled) {
            final Item BREAKFASTPLATE = registerItem("breakfast_plate", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(1.6f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 6000, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREAKFASTPLATE));
        }

// Breakfast Sausages

        if (CONFIG.isBreakfastSausagesEnabled) {
            final Item BREAKFASTSAUSAGES = registerItem("breakfast_sausages", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BREAKFASTSAUSAGES));
        }

// Brown Sugar

        if (CONFIG.isBrownSugarEnabled) {
            final Item BROWNSUGAR = registerItem("brown_sugar", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BROWNSUGAR));
        }

// Bun

        if (CONFIG.isBunEnabled) {
            final Item BUN = registerItem("bun", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUN));
        }

// Butter

        if (CONFIG.isButterEnabled) {
            final Item BUTTER = registerItem("butter", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTER));
        }

// Butterscotch

        if (CONFIG.isButterscotchEnabled) {
            final Item BUTTERSCOTCH = registerItem("butterscotch", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1.0f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERSCOTCH));
        }

// Butterscotch Chips

        if (CONFIG.isButterscotchChipsEnabled) {
            final Item BUTTERSCOTCHCHIPS = registerItem("butterscotch_chips", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERSCOTCHCHIPS));
        }

// Butterscotch Chips Chocolate Cookie

        if (CONFIG.isButterscotchChipsChocolateCookieEnabled) {
            final Item BUTTERSCOTCHCHIPSCHOCOLATECOOKIE = registerItem("butterscotch_chips_chocolate_cookie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERSCOTCHCHIPSCHOCOLATECOOKIE));
        }

// Butterscotch Chips Cookie

        if (CONFIG.isButterscotchChipsCookieEnabled) {
            final Item BUTTERSCOTCHCHIPSCOOKIE = registerItem("butterscotch_chips_cookie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1.2f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERSCOTCHCHIPSCOOKIE));
        }

// Butterscotch Chip Ice Cream Cone

        if (CONFIG.isButterscotchChipIceCreamConeEnabled) {
            final Item BUTTERSCOTCH_CHIP_ICE_CREAM_CONE = registerItem("butterscotch_chip_ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).snack().statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERSCOTCH_CHIP_ICE_CREAM_CONE));
        }

// Butterscotch Chip Milkshake

        if (CONFIG.isButterscotchChipMilkshakeBottleEnabled) {
            final Item BUTTERSCOTCHCHIPMILKSHAKEBOTTLE = registerItem("butterscotch_chip_milkshake_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERSCOTCHCHIPMILKSHAKEBOTTLE));
        }

// Butterscotch Chip Muffin

        if (CONFIG.isButterscotchChipMuffinEnabled) {
            final Item BUTTERSCOTCH_CHIP_MUFFIN = registerItem("butterscotch_chip_muffin", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERSCOTCH_CHIP_MUFFIN));
        }

// Butterscotch Chip Waffle & Mini Waffle

        if (CONFIG.isButterscotchChipWaffleBlockEnabled) {
            final Item BUTTERSCOTCH_CHIP_MINI_WAFFLE = registerItem("butterscotch_chip_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.7f).snack().statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERSCOTCH_CHIP_MINI_WAFFLE));
            BUTTERSCOTCH_CHIP_WAFFLE = registerBlock("butterscotch_chip_waffle", new WaffleBlock(BUTTERSCOTCH_CHIP_MINI_WAFFLE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERSCOTCH_CHIP_WAFFLE));
        }

// Butter Dough

        if (CONFIG.isButterDoughEnabled) {
            final Item BUTTERDOUGH = registerItem("butter_dough", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERDOUGH));
        }

// Butter Dough (Small)

        if (CONFIG.isButterDoughSmallEnabled) {
            final Item BUTTER_DOUGH_SMALL = registerItem("butter_dough_small", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTER_DOUGH_SMALL));
        }

// Butterscotch Fudge

        if (CONFIG.isButterscotchFudgeEnabled) {
            final Item BUTTERSCOTCHFUDGE = registerItem("butterscotch_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERSCOTCHFUDGE));
        }

// Buttered Toast

        if (CONFIG.isButteredToastEnabled) {
            final Item BUTTEREDTOAST = registerItem("buttered_toast", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTEREDTOAST));
        }

// Cacao Butter

        if (CONFIG.isCacaoButterEnabled) {
            final Item CACAOBUTTER = registerItem("cacao_butter", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CACAOBUTTER));
        }

// Cacao Nibs

        if (CONFIG.isCacaoNibsEnabled) {
            final Item CACAONIBS = registerItem("cacao_nibs", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CACAONIBS));
        }
// Cake Slice (Chorus Fruit)

        if (CONFIG.isCakeChorusFruitEnabled) {
            final Item CAKE_SLICE_CHORUS_FRUIT = registerItem("cake_slice_chorus_fruit", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CAKE_SLICE_CHORUS_FRUIT));
            CAKE_CHORUS_FRUIT = registerBlock("cake_chorus_fruit", new CakeChorusFruitBlock(CAKE_SLICE_CHORUS_FRUIT));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CAKE_CHORUS_FRUIT));
        }

// Cake Slice (Glow Berry)

        if (CONFIG.isCakeGlowBerryEnabled) {
            final Item CAKE_SLICE_GLOW_BERRY = registerItem("cake_slice_glow_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CAKE_SLICE_GLOW_BERRY));
            CAKE_GLOW_BERRY = registerBlock("cake_glow_berry", new CakeGlowBerryBlock(CAKE_SLICE_GLOW_BERRY));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CAKE_GLOW_BERRY));
        }

// Caramel

        if (CONFIG.isCaramelEnabled) {
            final Item CARAMEL = registerItem("caramel", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.8f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMEL));
        }

// Caramel Apple Slice

        if (CONFIG.isCaramelAppleSliceEnabled) {
            final Item CARAMELAPPLESLICE = registerItem("caramel_apple_slice", new ConsumableItem(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELAPPLESLICE));
        }

// Caramel Chips

        if (CONFIG.isCaramelChipsEnabled) {
            final Item CARAMELCHIPS = registerItem("caramel_chips", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELCHIPS));
        }

// Caramel Chips Chocolate Cookie

        if (CONFIG.isCaramelChipsChocolateCookieEnabled) {
            final Item CARAMELCHIPSCHOCOLATECOOKIE = registerItem("caramel_chips_chocolate_cookie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.1f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELCHIPSCHOCOLATECOOKIE));
        }

// Caramel Chips Cookie

        if (CONFIG.isCaramelChipsCookieEnabled) {
            final Item CARAMELCHIPSCOOKIE = registerItem("caramel_chips_cookie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELCHIPSCOOKIE));
        }

// Caramel Chip Ice Cream Cone

        if (CONFIG.isCaramelChipIceCreamConeEnabled) {
            final Item CARAMEL_CHIP_ICE_CREAM_CONE = registerItem("caramel_chip_ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).snack().statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMEL_CHIP_ICE_CREAM_CONE));
        }

// Caramel Chip Milkshake

        if (CONFIG.isCaramelChipMilkshakeBottleEnabled) {
            final Item CARAMELCHIPMILKSHAKEBOTTLE = registerItem("caramel_chip_milkshake_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELCHIPMILKSHAKEBOTTLE));
        }

// Caramel Chip Muffin

        if (CONFIG.isCaramelChipMuffinEnabled) {
            final Item CARAMEL_CHIP_MUFFIN = registerItem("caramel_chip_muffin", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMEL_CHIP_MUFFIN));
        }

// Caramel Chip Waffle & Mini Waffle

        if (CONFIG.isCaramelChipWaffleBlockEnabled) {
            final Item CARAMEL_CHIP_MINI_WAFFLE = registerItem("caramel_chip_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.7f).snack().statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMEL_CHIP_MINI_WAFFLE));
            CARAMEL_CHIP_WAFFLE = registerBlock("caramel_chip_waffle", new WaffleBlock(CARAMEL_CHIP_MINI_WAFFLE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMEL_CHIP_WAFFLE));
        }

// Caramel Filled Chocolate

        if (CONFIG.isCaramelChocolateEnabled) {
            final Item CARAMELCHOCOLATE = registerItem("caramel_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELCHOCOLATE));
        }

// Caramel Filled Dark Chocolate

        if (CONFIG.isCaramelDarkChocolateEnabled) {
            final Item CARAMELDARKCHOCOLATE = registerItem("caramel_dark_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELDARKCHOCOLATE));
        }

// Caramel Filled White Chocolate

        if (CONFIG.isCaramelWhiteChocolateEnabled) {
            final Item CARAMELWHITECHOCOLATE = registerItem("caramel_white_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELWHITECHOCOLATE));
        }

// Caramel Filled Chocolate Pastry Bar

        if (CONFIG.isCaramelChocolatePastryBarEnabled) {
            final Item CARAMELCHOCOLATEPASTRYBAR = registerItem("caramel_chocolate_pastry_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELCHOCOLATEPASTRYBAR));
        }

// Caramel Filled Pastry Bar

        if (CONFIG.isCaramelPastryBarEnabled) {
            final Item CARAMELPASTRYBAR = registerItem("caramel_pastry_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELPASTRYBAR));
        }

// Caramel Fudge

        if (CONFIG.isCaramelFudgeEnabled) {
            final Item CARAMELFUDGE = registerItem("caramel_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELFUDGE));
        }

// Caramel Glazed Apple

        if (CONFIG.isCaramelGlazedAppleEnabled) {
            final Item CARAMELGLAZEDAPPLE = registerItem("caramel_glazed_apple", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELGLAZEDAPPLE));
        }

// Caramel Glazed Berries

        if (CONFIG.isCaramelGlazedBerriesEnabled) {
            final Item CARAMELGLAZEDBERRIES = registerItem("caramel_glazed_berries", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELGLAZEDBERRIES));
        }

// Caramel Glazed Chocolate Sweet Roll

        if (CONFIG.isCaramelGlazedChocolateSweetRollEnabled) {
            final Item CARAMELGLAZEDCHOCOLATESWEETROLL = registerItem("caramel_glazed_chocolate_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELGLAZEDCHOCOLATESWEETROLL));
        }

// Caramel Glazed Sweet Roll

        if (CONFIG.isCaramelGlazedSweetRollEnabled) {
            final Item CARAMELGLAZEDSWEETROLL = registerItem("caramel_glazed_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELGLAZEDSWEETROLL));
        }

// Caramel Popcorn

        if (CONFIG.isCaramelPopcornEnabled) {
            final Item CARAMELPOPCORN = registerItem("caramel_popcorn", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELPOPCORN));
        }

// Caramel Toast

        if (CONFIG.isCaramelToastEnabled) {
            final Item CARAMELTOAST = registerItem("caramel_toast", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMELTOAST));
        }

// Cheese

        if (CONFIG.isCheeseEnabled) {
            final Item CHEESEBLOCK = registerItem("cheese_block", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBLOCK));
            final Item CHEESESLICE = registerItem("cheese_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESESLICE));
        }

// Cheesecake

        if (CONFIG.isCheesecakeEnabled) {
            final Item CHEESECAKE_SLICE = registerItem("cheesecake_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESECAKE_SLICE));
            CHEESECAKE = registerBlock("cheesecake", new PieBlock(CHEESECAKE_SLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESECAKE));
        }

// Cheese and Beef Bun

        if (CONFIG.isCheeseAndBeefBunEnabled) {
            final Item CHEESEANDBEEFBUN = registerItem("cheese_and_beef_bun", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUN));
        }

// Cheese and Beef Bun (Bacon)

        if (CONFIG.isCheeseAndBeefBunBaconEnabled) {
            final Item CHEESEANDBEEFBUNBACON = registerItem("cheese_and_beef_bun_bacon", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNBACON));
        }

// Cheese and Beef Bun (Bacon, Lettuce)

        if (CONFIG.isCheeseAndBeefBunBaconLettuceEnabled) {
            final Item CHEESEANDBEEFBUNBACONLETTUCE = registerItem("cheese_and_beef_bun_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNBACONLETTUCE));
        }

// Cheese and Beef Bun (Bacon, Lettuce, Tomato)

        if (CONFIG.isCheeseAndBeefBunBaconLettuceTomatoEnabled) {
            final Item CHEESEANDBEEFBUNBACONLETTUCETOMATO = registerItem("cheese_and_beef_bun_bacon_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNBACONLETTUCETOMATO));
        }

// Cheese and Beef Bun (Onion)

        if (CONFIG.isCheeseAndBeefBunOnionEnabled) {
            final Item CHEESEANDBEEFBUNONION = registerItem("cheese_and_beef_bun_onion", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNONION));
        }

// Cheese and Beef Bun (Onion, Bacon)

        if (CONFIG.isCheeseAndBeefBunOnionBaconEnabled) {
            final Item CHEESEANDBEEFBUNONIONBACON = registerItem("cheese_and_beef_bun_onion_bacon", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNONIONBACON));
        }

// Cheese and Beef Bun (Onion, Bacon, Lettuce)

        if (CONFIG.isCheeseAndBeefBunOnionBaconLettuceEnabled) {
            final Item CHEESEANDBEEFBUNONIONBACONLETTUCE = registerItem("cheese_and_beef_bun_onion_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(1.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNONIONBACONLETTUCE));
        }

// Cheese and Beef Bun (Onion, Lettuce)

        if (CONFIG.isCheeseAndBeefBunOnionLettuceEnabled) {
            final Item CHEESEANDBEEFBUNONIONLETTUCE = registerItem("cheese_and_beef_bun_onion_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(1.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNONIONLETTUCE));
        }

// Cheese and Beef Bun (Onion, Lettuce, Tomato)

        if (CONFIG.isCheeseAndBeefBunOnionLettuceTomatoEnabled) {
            final Item CHEESEANDBEEFBUNONIONLETTUCETOMATO = registerItem("cheese_and_beef_bun_onion_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(1.1f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNONIONLETTUCETOMATO));
        }

// Cheese and Beef Bun (Lettuce)

        if (CONFIG.isCheeseAndBeefBunLettuceEnabled) {
            final Item CHEESEANDBEEFBUNLETTUCE = registerItem("cheese_and_beef_bun_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNLETTUCE));
        }

// Cheese and Beef Bun (Lettuce, Tomato)

        if (CONFIG.isCheeseAndBeefBunLettuceTomatoEnabled) {
            final Item CHEESEANDBEEFBUNLETTUCETOMATO = registerItem("cheese_and_beef_bun_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDBEEFBUNLETTUCETOMATO));
        }

// Cheese and Chicken Bun

        if (CONFIG.isCheeseAndChickenBunEnabled) {
            final Item CHEESEANDCHICKENBUN = registerItem("cheese_and_chicken_bun", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDCHICKENBUN));
        }

// Cheese and Chicken Bun (Lettuce)

        if (CONFIG.isCheeseAndChickenBunLettuceEnabled) {
            final Item CHEESEANDCHICKENBUNLETTUCE = registerItem("cheese_and_chicken_bun_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDCHICKENBUNLETTUCE));
        }

// Cheese and Chicken Bun (Lettuce, Tomato)

        if (CONFIG.isCheeseAndChickenBunLettuceTomatoEnabled) {
            final Item CHEESEANDCHICKENBUNLETTUCETOMATO = registerItem("cheese_and_chicken_bun_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDCHICKENBUNLETTUCETOMATO));
        }

// Cheese And Chicken Bun (Bacon, Lettuce)

        if (CONFIG.isCheeseAndChickenBunBaconLettuceEnabled) {
            final Item CHEESEANDCHICKENBUNBACONLETTUCE = registerItem("cheese_and_chicken_bun_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(13).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDCHICKENBUNBACONLETTUCE));
        }

// Cheese and Eggplant Bun

        if (CONFIG.isCheeseAndEggplantBunEnabled) {
            final Item CHEESEANDEGGPLANTBUN = registerItem("cheese_and_eggplant_bun", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDEGGPLANTBUN));
        }

// Cheese and Eggplant Bun (Lettuce)

        if (CONFIG.isCheeseAndEggplantBunLettuceEnabled) {
            final Item CHEESEANDEGGPLANTBUNLETTUCE = registerItem("cheese_and_eggplant_bun_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDEGGPLANTBUNLETTUCE));
        }

// Cheese and Eggplant Bun (Lettuce, Tomato)

        if (CONFIG.isCheeseAndEggplantBunLettuceTomatoEnabled) {
            final Item CHEESEANDEGGPLANTBUNLETTUCETOMATO = registerItem("cheese_and_eggplant_bun_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(1.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDEGGPLANTBUNLETTUCETOMATO));
        }

// Cheese and Sausage Biscuit

        if (CONFIG.isCheeseAndSausageBiscuitEnabled) {
            final Item CHEESEANDSAUSAGEBISCUIT = registerItem("cheese_and_sausage_biscuit", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(16).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDSAUSAGEBISCUIT));
        }

// Cheese and Sausage Biscuit Sandwich

        if (CONFIG.isCheeseAndSausageBiscuitSandwichEnabled) {
            final Item CHEESEANDSAUSAGEBISCUITSANDWICH = registerItem("cheese_and_sausage_biscuit_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(21).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEANDSAUSAGEBISCUITSANDWICH));
        }

// Cheese Biscuit

        if (CONFIG.isCheeseBiscuitEnabled) {
            final Item CHEESEBISCUIT = registerItem("cheese_biscuit", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBISCUIT));
        }

// Cheese Biscuit Sandwich

        if (CONFIG.isCheeseBiscuitSandwichEnabled) {
            final Item CHEESEBISCUITSANDWICH = registerItem("cheese_biscuit_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBISCUITSANDWICH));
        }

// Cheese Sandwich

        if (CONFIG.isCheeseSandwichEnabled) {
            final Item CHEESESANDWICH = registerItem("cheese_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESESANDWICH));
        }

// Cheeseburger

        if (CONFIG.isCheeseburgerEnabled) {
            final Item CHEESEBURGER = registerItem("cheeseburger", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGER));
        }

// Cheeseburger (Bacon)

        if (CONFIG.isCheeseburgerBaconEnabled) {
            final Item CHEESEBURGERBACON = registerItem("cheeseburger_bacon", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERBACON));
        }

// Cheeseburger (Bacon, Lettuce)

        if (CONFIG.isCheeseburgerBaconLettuceEnabled) {
            final Item CHEESEBURGERBACONLETTUCE = registerItem("cheeseburger_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERBACONLETTUCE));
        }

// Cheeseburger (Bacon, Lettuce, Tomato)

        if (CONFIG.isCheeseburgerBaconLettuceTomatoEnabled) {
            final Item CHEESEBURGERBACONLETTUCETOMATO = registerItem("cheeseburger_bacon_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(13).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERBACONLETTUCETOMATO));
        }

// Cheeseburger (Lettuce)

        if (CONFIG.isCheeseburgerLettuceEnabled) {
            final Item CHEESEBURGERLETTUCE = registerItem("cheeseburger_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERLETTUCE));
        }

// Cheeseburger (Lettuce, Tomato)

        if (CONFIG.isCheeseburgerLettuceTomatoEnabled) {
            final Item CHEESEBURGERLETTUCETOMATO = registerItem("cheeseburger_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERLETTUCETOMATO));
        }
// Cheeseburger (Onion)

        if (CONFIG.isCheeseburgerOnionEnabled) {
            final Item CHEESEBURGERONION = registerItem("cheeseburger_onion", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERONION));
        }

// Cheeseburger (Onion, Bacon)

        if (CONFIG.isCheeseburgerOnionBaconEnabled) {
            final Item CHEESEBURGERONIONBACON = registerItem("cheeseburger_onion_bacon", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(13).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERONIONBACON));
        }

// Cheeseburger (Onion, Bacon, Lettuce)

        if (CONFIG.isCheeseburgerOnionBaconLettuceEnabled) {
            final Item CHEESEBURGERONIONBACONLETTUCE = registerItem("cheeseburger_onion_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(13).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERONIONBACONLETTUCE));
        }

// Cheeseburger (Onion, Lettuce)

        if (CONFIG.isCheeseburgerOnionLettuceEnabled) {
            final Item CHEESEBURGERONIONLETTUCE = registerItem("cheeseburger_onion_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERONIONLETTUCE));
        }

// Cheeseburger (Onion, Lettuce, Tomato)

        if (CONFIG.isCheeseburgerOnionLettuceTomatoEnabled) {
            final Item CHEESEBURGERONIONLETTUCETOMATO = registerItem("cheeseburger_onion_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEBURGERONIONLETTUCETOMATO));
        }

// Cheese Calzone

        if (CONFIG.isCheeseCalzoneEnabled) {
            final Item CHEESE_CALZONE = registerItem("cheese_calzone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESE_CALZONE));
        }

// Cheese Pizza & Slice

        if (CONFIG.isCheesePizzaEnabled) {
            final Item CHEESEPIZZASLICE = registerItem("cheese_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESEPIZZASLICE));
            CHEESE_PIZZA = registerBlock("cheese_pizza", new PizzaBlock(CHEESEPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESE_PIZZA));
        }

// Chicken Bun

        if (CONFIG.isChickenBunEnabled) {
            final Item CHICKENBUN = registerItem("chicken_bun", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBUN));
        }

// Chicken Bun (Bacon, Lettuce)

        if (CONFIG.isChickenBunBaconLettuceEnabled) {
            final Item CHICKENBUNBACONLETTUCE = registerItem("chicken_bun_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBUNBACONLETTUCE));
        }

// Chicken Bun (Lettuce)

        if (CONFIG.isChickenBunLettuceEnabled) {
            final Item CHICKENBUNLETTUCE = registerItem("chicken_bun_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBUNLETTUCE));
        }

// Chicken Bun (Lettuce, Tomato)

        if (CONFIG.isChickenBunLettuceTomatoEnabled) {
            final Item CHICKENBUNLETTUCETOMATO = registerItem("chicken_bun_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBUNLETTUCETOMATO));
        }

// Chicken Burger

        if (CONFIG.isChickenBurgerEnabled) {
            final Item CHICKENBURGER = registerItem("chicken_burger", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBURGER));
        }

// Chicken Burger (Bacon, Lettuce)

        if (CONFIG.isChickenBurgerBaconLettuceEnabled) {
            final Item CHICKENBURGERBACONLETTUCE = registerItem("chicken_burger_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(14).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBURGERBACONLETTUCE));
        }

// Chicken Burger (Lettuce)

        if (CONFIG.isChickenBurgerLettuceEnabled) {
            final Item CHICKENBURGERLETTUCE = registerItem("chicken_burger_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBURGERLETTUCE));
        }

// Chicken Burger (Lettuce, Tomato)

        if (CONFIG.isChickenBurgerLettuceTomatoEnabled) {
            final Item CHICKENBURGERLETTUCETOMATO = registerItem("chicken_burger_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENBURGERLETTUCETOMATO));
        }

// Chicken Cheeseburger

        if (CONFIG.isChickenCheeseburgerEnabled) {
            final Item CHICKENCHEESEBURGER = registerItem("chicken_cheeseburger", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENCHEESEBURGER));
        }

// Chicken Cheeseburger (Bacon, Lettuce)

        if (CONFIG.isChickenCheeseburgerBaconLettuceEnabled) {
            final Item CHICKENCHEESEBURGERBACONLETTUCE = registerItem("chicken_cheeseburger_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(15).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENCHEESEBURGERBACONLETTUCE));
        }

// Chicken Cheeseburger (Lettuce)

        if (CONFIG.isChickenCheeseburgerLettuceEnabled) {
            final Item CHICKENCHEESEBURGERLETTUCE = registerItem("chicken_cheeseburger_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENCHEESEBURGERLETTUCE));
        }

// Chicken Cheeseburger (Lettuce, Tomato)

        if (CONFIG.isChickenCheeseburgerLettuceTomatoEnabled) {
            final Item CHICKENCHEESEBURGERLETTUCETOMATO = registerItem("chicken_cheeseburger_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENCHEESEBURGERLETTUCETOMATO));
        }

// Chicken Nuggets

        if (CONFIG.isChickenNuggetsEnabled) {
            final Item CHICKENNUGGETS = registerItem("chicken_nuggets", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENNUGGETS));
        }

// Chicken Patty

        if (CONFIG.isChickenPattyEnabled) {
            final Item CHICKENPATTY = registerItem("chicken_patty", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHICKENPATTY));
        }

// Chocolate Bottle

        if (CONFIG.isChocolateBottleEnabled) {
            final Item CHOCOLATEBOTTLE = registerItem("chocolate_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build()).maxCount(64)));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEBOTTLE));
        }

// Chocolate Chips

        if (CONFIG.isChocolateChipsEnabled) {
            final Item CHOCOLATECHIPS = registerItem("chocolate_chips", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATECHIPS));
        }

// Chocolate Chip Ice Cream Cone

        if (CONFIG.isChocolateChipIceCreamConeEnabled) {
            final Item CHOCOLATE_CHIP_ICE_CREAM_CONE = registerItem("chocolate_chip_ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).snack().statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CHIP_ICE_CREAM_CONE));
        }

// Chocolate Chip Milkshake

        if (CONFIG.isChocolateChipMilkshakeBottleEnabled) {
            final Item CHOCOLATECHIPMILKSHAKEBOTTLE = registerItem("chocolate_chip_milkshake_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATECHIPMILKSHAKEBOTTLE));
        }

// Chocolate Chip Muffin

        if (CONFIG.isChocolateChipMuffinEnabled) {
            final Item CHOCOLATE_CHIP_MUFFIN = registerItem("chocolate_chip_muffin", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CHIP_MUFFIN));
        }

// Chocolate Chip Waffle & Mini Waffle

        if (CONFIG.isChocolateChipWaffleBlockEnabled) {
            final Item CHOCOLATE_CHIP_MINI_WAFFLE = registerItem("chocolate_chip_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.7f).snack().statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CHIP_MINI_WAFFLE));
            CHOCOLATE_CHIP_WAFFLE = registerBlock("chocolate_chip_waffle", new WaffleBlock(CHOCOLATE_CHIP_MINI_WAFFLE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CHIP_WAFFLE));
        }

// Chocolate Cookie

        if (CONFIG.isChocolateCookieEnabled) {
            final Item CHOCOLATECOOKIE = registerItem("chocolate_cookie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATECOOKIE));
        }

// Chocolate Covered Marshmallow Stick

        if (CONFIG.isChocolateCoveredMarshmallowStickEnabled) {
            final Item CHOCOLATECOVEREDMARSHMALLOWSTICK = registerItem("chocolate_covered_marshmallow_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATECOVEREDMARSHMALLOWSTICK));
        }

// Chocolate Cream Cake Slice (Butterscotch Chips)

        if (CONFIG.isChocolateCreamCakeButterscotchEnabled) {
            final Item CHOCOLATE_CREAM_CAKE_SLICE_BUTTERSCOTCH = registerItem("chocolate_cream_cake_slice_butterscotch", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_CAKE_SLICE_BUTTERSCOTCH));
            CHOCOLATE_CREAM_CAKE_BUTTERSCOTCH = registerBlock("chocolate_cream_cake_butterscotch", new ChocolateCreamCakeButterscotchBlock(CHOCOLATE_CREAM_CAKE_SLICE_BUTTERSCOTCH));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_CAKE_BUTTERSCOTCH));
        }

// Chocolate Cream Cake Slice (Caramel Chips)

        if (CONFIG.isChocolateCreamCakeCaramelEnabled) {
            final Item CHOCOLATE_CREAM_CAKE_SLICE_CARAMEL = registerItem("chocolate_cream_cake_slice_caramel", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_CAKE_SLICE_CARAMEL));
            CHOCOLATE_CREAM_CAKE_CARAMEL = registerBlock("chocolate_cream_cake_caramel", new ChocolateCreamCakeCaramelBlock(CHOCOLATE_CREAM_CAKE_SLICE_CARAMEL));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_CAKE_CARAMEL));
        }

// Chocolate Cream Cake Slice (Chocolate Chips)

        if (CONFIG.isChocolateCreamCakeChocolateEnabled) {
            final Item CHOCOLATE_CREAM_CAKE_SLICE_CHOCOLATE = registerItem("chocolate_cream_cake_slice_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_CAKE_SLICE_CHOCOLATE));
            CHOCOLATE_CREAM_CAKE_CHOCOLATE = registerBlock("chocolate_cream_cake_chocolate", new ChocolateCreamCakeChocolateBlock(CHOCOLATE_CREAM_CAKE_SLICE_CHOCOLATE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_CAKE_CHOCOLATE));
        }

// Chocolate Cream Cake Slice (Dark Chocolate Chips)

        if (CONFIG.isChocolateCreamCakeDarkChocolateEnabled) {
            final Item CHOCOLATE_CREAM_CAKE_SLICE_DARK_CHOCOLATE = registerItem("chocolate_cream_cake_slice_dark_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_CAKE_SLICE_DARK_CHOCOLATE));
            CHOCOLATE_CREAM_CAKE_DARK_CHOCOLATE = registerBlock("chocolate_cream_cake_dark_chocolate", new ChocolateCreamCakeDarkChocolateBlock(CHOCOLATE_CREAM_CAKE_SLICE_DARK_CHOCOLATE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_CAKE_DARK_CHOCOLATE));
        }

// Chocolate Cream Cake Slice (Toffee Chips)

        if (CONFIG.isChocolateCreamCakeToffeeEnabled) {
            final Item CHOCOLATE_CREAM_CAKE_SLICE_TOFFEE = registerItem("chocolate_cream_cake_slice_toffee", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_CAKE_SLICE_TOFFEE));
            CHOCOLATE_CREAM_CAKE_TOFFEE = registerBlock("chocolate_cream_cake_toffee", new ChocolateCreamCakeToffeeBlock(CHOCOLATE_CREAM_CAKE_SLICE_TOFFEE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_CAKE_TOFFEE));
        }

// Chocolate Cream Cake Slice (White Chocolate Chips)

        if (CONFIG.isChocolateCreamCakeWhiteChocolateEnabled) {
            final Item CHOCOLATE_CREAM_CAKE_SLICE_WHITE_CHOCOLATE = registerItem("chocolate_cream_cake_slice_white_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_CAKE_SLICE_WHITE_CHOCOLATE));
            CHOCOLATE_CREAM_CAKE_WHITE_CHOCOLATE = registerBlock("chocolate_cream_cake_white_chocolate", new ChocolateCreamCakeWhiteChocolateBlock(CHOCOLATE_CREAM_CAKE_SLICE_WHITE_CHOCOLATE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_CAKE_WHITE_CHOCOLATE));
        }

// Chocolate Cream Frosting Jar

        if (CONFIG.isChocolateCreamFrostingBottleEnabled) {
            final Item CHOCOLATECREAMFROSTINGBOTTLE = registerItem("chocolate_cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build()).maxCount(64)));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATECREAMFROSTINGBOTTLE));
        }

// Chocolate Cream Frosted Cupcake

        if (CONFIG.isChocolateCreamFrostedCupcakeEnabled) {
            final Item CHOCOLATE_CREAM_FROSTED_CUPCAKE = registerItem("chocolate_cream_frosted_cupcake", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_FROSTED_CUPCAKE));
        }

// Chocolate Cream Frosted Mini Waffle

        if (CONFIG.isChocolateCreamFrostedMiniWaffleEnabled) {
            final Item CHOCOLATE_CREAM_FROSTED_MINI_WAFFLE = registerItem("chocolate_cream_frosted_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.7f).snack().statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_FROSTED_MINI_WAFFLE));
        }

// Chocolate Donut Base

        if (CONFIG.isChocolateDonutBaseEnabled) {
            final Item CHOCOLATEDONUTBASE = registerItem("chocolate_donut_base", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEDONUTBASE));
        }

// Chocolate Donut Hole

        if (CONFIG.isChocolateDonutHoleEnabled) {
            final Item CHOCOLATEDONUTHOLE = registerItem("chocolate_donut_hole", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.8f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEDONUTHOLE));
        }

// Chocolate Donut Hole (Sugar)

        if (CONFIG.isChocolateDonutHoleSugarEnabled) {
            final Item CHOCOLATEDONUTHOLESUGAR = registerItem("chocolate_donut_hole_sugar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEDONUTHOLESUGAR));
        }

// Chocolate Donut (Sugar)

        if (CONFIG.isChocolateDonutSugarEnabled) {
            final Item CHOCOLATEDONUTSUGAR = registerItem("chocolate_donut_sugar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEDONUTSUGAR));
        }

// Chocolate Pie (Graham Cracker)

        if (CONFIG.isChocolatePieGrahamCrackerEnabled) {
            final Item CHOCOLATE_PIE_GRAHAM_CRACKER_SLICE = registerItem("chocolate_pie_graham_cracker_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0), 1.0F).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_PIE_GRAHAM_CRACKER_SLICE));
            CHOCOLATE_PIE_GRAHAM_CRACKER = registerBlock("chocolate_pie_graham_cracker", new PieBlock(CHOCOLATE_PIE_GRAHAM_CRACKER_SLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_PIE_GRAHAM_CRACKER));
        }

// Chocolate Filled Chocolate Pastry

        if (CONFIG.isChocolateChocolatePastryEnabled) {
            final Item CHOCOLATECHOCOLATEPASTRY = registerItem("chocolate_chocolate_pastry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATECHOCOLATEPASTRY));
        }

// Chocolate Filled Pastry

        if (CONFIG.isChocolatePastryEnabled) {
            final Item CHOCOLATEPASTRY = registerItem("chocolate_pastry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEPASTRY));
        }

// Chocolate Frosted Chocolate Sweet Roll

        if (CONFIG.isChocolateFrostedChocolateSweetRollEnabled) {
            final Item CHOCOLATEFROSTEDCHOCOLATESWEETROLL = registerItem("chocolate_frosted_chocolate_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEFROSTEDCHOCOLATESWEETROLL));
        }
// Chocolate Frosted Sweet Roll

        if (CONFIG.isChocolateFrostedSweetRollEnabled) {
            final Item CHOCOLATEFROSTEDSWEETROLL = registerItem("chocolate_frosted_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEFROSTEDSWEETROLL));
        }

// Chocolate Fudge

        if (CONFIG.isChocolateFudgeEnabled) {
            final Item CHOCOLATEFUDGE = registerItem("chocolate_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEFUDGE));
        }

// Chocolate Glazed Apple

        if (CONFIG.isChocolateGlazedAppleEnabled) {
            final Item CHOCOLATEGLAZEDAPPLE = registerItem("chocolate_glazed_apple", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEGLAZEDAPPLE));
        }

// Chocolate Glazed Chocolate Donut

        if (CONFIG.isChocolateGlazedChocolateDonutEnabled) {
            final Item CHOCOLATEGLAZEDCHOCOLATEDONUT = registerItem("chocolate_glazed_chocolate_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEGLAZEDCHOCOLATEDONUT));
        }

// Chocolate Glazed Donut

        if (CONFIG.isChocolateGlazedDonutEnabled) {
            final Item CHOCOLATEGLAZEDDONUT = registerItem("chocolate_glazed_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEGLAZEDDONUT));
        }

// Chocolate Graham Cracker

        if (CONFIG.isChocolateGrahamCrackerEnabled) {
            final Item CHOCOLATE_GRAHAM_CRACKER = registerItem("chocolate_graham_cracker", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_GRAHAM_CRACKER));
        }

// Chocolate Graham Cracker Crumbs

        if (CONFIG.isChocolateGrahamCrackerCrumbsEnabled) {
            final Item CHOCOLATE_GRAHAM_CRACKER_CRUMBS = registerItem("chocolate_graham_cracker_crumbs", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_GRAHAM_CRACKER_CRUMBS));
        }

// Chocolate Graham Cracker (Ice Cream)

        if (CONFIG.isChocolateGrahamCrackerIceCreamEnabled) {
            final Item CHOCOLATE_GRAHAM_CRACKER_ICE_CREAM = registerItem("chocolate_graham_cracker_ice_cream", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_GRAHAM_CRACKER_ICE_CREAM));
        }

// Chocolate Graham Cracker (Neapolitan, Scoop #1)

        if (CONFIG.isChocolateGrahamCrackerNeapolitanScoop1Enabled) {
            final Item CHOCOLATE_GRAHAM_CRACKER_NEAPOLITAN_SCOOP_1 = registerItem("chocolate_graham_cracker_neapolitan_scoop_1", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_GRAHAM_CRACKER_NEAPOLITAN_SCOOP_1));
        }

// Chocolate Graham Cracker (Neapolitan, Scoop #2)

        if (CONFIG.isChocolateGrahamCrackerNeapolitanScoop2Enabled) {
            final Item CHOCOLATE_GRAHAM_CRACKER_NEAPOLITAN_SCOOP_2 = registerItem("chocolate_graham_cracker_neapolitan_scoop_2", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_GRAHAM_CRACKER_NEAPOLITAN_SCOOP_2));
        }

// Chocolate Graham Cracker (Neapolitan, Scoop #3)

        if (CONFIG.isChocolateGrahamCrackerNeapolitanScoop3Enabled) {
            final Item CHOCOLATE_GRAHAM_CRACKER_NEAPOLITAN_SCOOP_3 = registerItem("chocolate_graham_cracker_neapolitan_scoop_3", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_GRAHAM_CRACKER_NEAPOLITAN_SCOOP_3));
        }

// Chocolate Graham Cracker Pie Crust

        if (CONFIG.isChocolateGrahamCrackerPieCrustEnabled) {
            final Item CHOCOLATE_GRAHAM_CRACKER_PIE_CRUST = registerItem("chocolate_graham_cracker_pie_crust", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_GRAHAM_CRACKER_PIE_CRUST));
        }

// Chocolate Ice Cream Bowl

        if (CONFIG.isChocolateIceCreamBowlEnabled) {
            final Item CHOCOLATEICECREAMBOWL = registerItem("chocolate_ice_cream_bowl", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.2f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEICECREAMBOWL));
        }

// Chocolate Ice Cream Cone

        if (CONFIG.isChocolateIceCreamConeEnabled) {
            final Item CHOCOLATE_ICE_CREAM_CONE = registerItem("chocolate_ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).snack().statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_ICE_CREAM_CONE));
        }

// Chocolate Ice Cream Stick

        if (CONFIG.isChocolateIceCreamStickEnabled) {
            final Item CHOCOLATE_ICE_CREAM_STICK = registerItem("chocolate_ice_cream_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1.2f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_ICE_CREAM_STICK));
        }

// Chocolate Milk Bottle

        if (CONFIG.isChocolateMilkBottleEnabled) {
            final Item CHOCOLATEMILKBOTTLE = registerItem("chocolate_milk_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEMILKBOTTLE));
        }

// Chocolate Milkshake

        if (CONFIG.isChocolateMilkshakeBottleEnabled) {
            final Item CHOCOLATEMILKSHAKEBOTTLE = registerItem("chocolate_milkshake_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.2f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEMILKSHAKEBOTTLE));
        }

// Chocolate Pastry Bar Base

        if (CONFIG.isChocolatePastryBarBaseEnabled) {
            final Item CHOCOLATEPASTRYBARBASE = registerItem("chocolate_pastry_bar_base", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEPASTRYBARBASE));
        }

// Chocolate Pastry Base

        if (CONFIG.isChocolatePastryBaseEnabled) {
            final Item CHOCOLATEPASTRYBASE = registerItem("chocolate_pastry_base", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATEPASTRYBASE));
        }

// Chocolate Sugar Dough

        if (CONFIG.isChocolateSugarDoughEnabled) {
            final Item CHOCOLATESUGARDOUGH = registerItem("chocolate_sugar_dough", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATESUGARDOUGH));
        }

// Chocolate Sweet Roll

        if (CONFIG.isChocolateSweetRollEnabled) {
            final Item CHOCOLATESWEETROLL = registerItem("chocolate_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATESWEETROLL));
        }

// Chocolate Sweet Roll Base

        if (CONFIG.isChocolateSweetRollBaseEnabled) {
            final Item CHOCOLATESWEETROLLBASE = registerItem("chocolate_sweet_roll_base", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATESWEETROLLBASE));
        }

// Chocolate Toast

        if (CONFIG.isChocolateToastEnabled) {
            final Item CHOCOLATETOAST = registerItem("chocolate_toast", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATETOAST));
        }

// Chorus Fruit Cheesecake & Slice

        if (CONFIG.isChorusFruitCheesecakeEnabled) {
            final Item CHORUS_FRUIT_CHEESECAKE_SLICE = registerItem("chorus_fruit_cheesecake_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f)
                    .statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F)
                    .build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CHEESECAKE_SLICE));
            CHORUS_FRUIT_CHEESECAKE = registerBlock("chorus_fruit_cheesecake", new PieBlock(CHORUS_FRUIT_CHEESECAKE_SLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CHEESECAKE));
        }

// Chorus Fruit Cream Cake Slice (Chorus Fruit)

        if (CONFIG.isChorusFruitCreamCakeChorusFruitEnabled) {
            final Item CHORUS_FRUIT_CREAM_CAKE_SLICE_CHORUS_FRUIT = registerItem("chorus_fruit_cream_cake_slice_chorus_fruit", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_CAKE_SLICE_CHORUS_FRUIT));
            CHORUS_FRUIT_CREAM_CAKE_CHORUS_FRUIT = registerBlock("chorus_fruit_cream_cake_chorus_fruit", new ChorusFruitCreamCakeChorusFruitBlock(CHORUS_FRUIT_CREAM_CAKE_SLICE_CHORUS_FRUIT));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_CAKE_CHORUS_FRUIT));
        }

// Chorus Fruit Cream Cake Slice (Glow Berry)

        if (CONFIG.isChorusFruitCreamCakeGlowBerryEnabled) {
            final Item CHORUS_FRUIT_CREAM_CAKE_SLICE_GLOW_BERRY = registerItem("chorus_fruit_cream_cake_slice_glow_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_CAKE_SLICE_GLOW_BERRY));
            CHORUS_FRUIT_CREAM_CAKE_GLOW_BERRY = registerBlock("chorus_fruit_cream_cake_glow_berry", new ChorusFruitCreamCakeGlowBerryBlock(CHORUS_FRUIT_CREAM_CAKE_SLICE_GLOW_BERRY));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_CAKE_GLOW_BERRY));
        }

// Chorus Fruit Cream Cake Slice (Sweet Berry)

        if (CONFIG.isChorusFruitCreamCakeSweetBerryEnabled) {
            final Item CHORUS_FRUIT_CREAM_CAKE_SLICE_SWEET_BERRY = registerItem("chorus_fruit_cream_cake_slice_sweet_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_CAKE_SLICE_SWEET_BERRY));
            CHORUS_FRUIT_CREAM_CAKE_SWEET_BERRY = registerBlock("chorus_fruit_cream_cake_sweet_berry", new ChorusFruitCreamCakeSweetBerryBlock(CHORUS_FRUIT_CREAM_CAKE_SLICE_SWEET_BERRY));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_CAKE_SWEET_BERRY));
        }

// Chorus Fruit Cream Chocolate

        if (CONFIG.isChorusFruitCreamChocolateEnabled) {
            final Item CHORUSFRUITCREAMCHOCOLATE = registerItem("chorus_fruit_cream_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 6000, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMCHOCOLATE));
        }

// Chorus Fruit Cream Dark Chocolate

        if (CONFIG.isChorusFruitCreamDarkChocolateEnabled) {
            final Item CHORUSFRUITCREAMDARKCHOCOLATE = registerItem("chorus_fruit_cream_dark_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 6000, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMDARKCHOCOLATE));
        }

// Chorus Fruit Cream Glazed Chocolate Donut

        if (CONFIG.isChorusFruitCreamGlazedChocolateDonutEnabled) {
            final Item CHORUSFRUITCREAMGLAZEDCHOCOLATEDONUT = registerItem("chorus_fruit_cream_glazed_chocolate_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMGLAZEDCHOCOLATEDONUT));
        }

// Chorus Fruit Cream Glazed Donut

        if (CONFIG.isChorusFruitCreamGlazedDonutEnabled) {
            final Item CHORUSFRUITCREAMGLAZEDDONUT = registerItem("chorus_fruit_cream_glazed_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMGLAZEDDONUT));
        }

// Chorus Fruit Cream White Chocolate

        if (CONFIG.isChorusFruitCreamWhiteChocolateEnabled) {
            final Item CHORUSFRUITCREAMWHITECHOCOLATE = registerItem("chorus_fruit_cream_white_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 6000, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMWHITECHOCOLATE));
        }

// Chorus Fruit Cream Filled Chocolate Pastry Bar

        if (CONFIG.isChorusFruitCreamChocolatePastryBarEnabled) {
            final Item CHORUSFRUITCREAMCHOCOLATEPASTRYBAR = registerItem("chorus_fruit_cream_chocolate_pastry_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMCHOCOLATEPASTRYBAR));
        }

// Chorus Fruit Cream Filled Pastry Bar

        if (CONFIG.isChorusFruitCreamPastryBarEnabled) {
            final Item CHORUSFRUITCREAMPASTRYBAR = registerItem("chorus_fruit_cream_pastry_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMPASTRYBAR));
        }

// Chorus Fruit Cream Frosting Bottle

        if (CONFIG.isChorusFruitCreamFrostingBottleEnabled) {
            final Item CHORUSFRUITCREAMFROSTINGBOTTLE = registerItem("chorus_fruit_cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMFROSTINGBOTTLE));
        }

// Chorus Fruit Cream Frosted Chocolate Sweet Roll

        if (CONFIG.isChorusFruitCreamFrostedChocolateSweetRollEnabled) {
            final Item CHORUSFRUITCREAMFROSTEDCHOCOLATESWEETROLL = registerItem("chorus_fruit_cream_frosted_chocolate_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMFROSTEDCHOCOLATESWEETROLL));
        }

// Chorus Fruit Cream Frosted Chocolate Sweet Roll (Chorus Fruit)

        if (CONFIG.isChorusFruitCreamFrostedChocolateSweetRollChorusFruitEnabled) {
            final Item CHORUSFRUITCREAMFROSTEDCHOCOLATESWEETROLLCHORUSFRUIT = registerItem("chorus_fruit_cream_frosted_chocolate_sweet_roll_chorus_fruit", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMFROSTEDCHOCOLATESWEETROLLCHORUSFRUIT));
        }

// Chorus Fruit Cream Frosted Cupcake

        if (CONFIG.isChorusFruitCreamFrostedCupcakeEnabled) {
            final Item CHORUS_FRUIT_CREAM_FROSTED_CUPCAKE = registerItem("chorus_fruit_cream_frosted_cupcake", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.1f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_FROSTED_CUPCAKE));
        }

// Chorus Fruit Cream Frosted Mini Waffle

        if (CONFIG.isChorusFruitCreamFrostedMiniWaffleEnabled) {
            final Item CHORUS_FRUIT_CREAM_FROSTED_MINI_WAFFLE = registerItem("chorus_fruit_cream_frosted_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.9f).snack().statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_FROSTED_MINI_WAFFLE));
        }

// Chorus Fruit Cream Frosted Mini Waffle (Chorus Fruit)

        if (CONFIG.isChorusFruitCreamFrostedMiniWaffleChorusFruitEnabled) {
            final Item CHORUS_FRUIT_CREAM_FROSTED_MINI_WAFFLE_CHORUS_FRUIT = registerItem("chorus_fruit_cream_frosted_mini_waffle_chorus_fruit", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.9f).snack().statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_FROSTED_MINI_WAFFLE_CHORUS_FRUIT));
        }

// Chorus Fruit Cream Frosted Sweet Roll

        if (CONFIG.isChorusFruitCreamFrostedSweetRollEnabled) {
            final Item CHORUSFRUITCREAMFROSTEDSWEETROLL = registerItem("chorus_fruit_cream_frosted_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMFROSTEDSWEETROLL));
        }

// Chorus Fruit Cream Frosted Sweet Roll (Chorus Fruit)

        if (CONFIG.isChorusFruitCreamFrostedSweetRollChorusFruitEnabled) {
            final Item CHORUSFRUITCREAMFROSTEDSWEETROLLCHORUSFRUIT = registerItem("chorus_fruit_cream_frosted_sweet_roll_chorus_fruit", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITCREAMFROSTEDSWEETROLLCHORUSFRUIT));
        }

// Chorus Fruit Ice Cream Bowl

        if (CONFIG.isChorusFruitIceCreamBowlEnabled) {
            final Item CHORUSFRUITICECREAMBOWL = registerItem("chorus_fruit_ice_cream_bowl", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITICECREAMBOWL));
        }

// Chorus Fruit Ice Cream Cone

        if (CONFIG.isChorusFruitIceCreamConeEnabled) {
            final Item CHORUS_FRUIT_ICE_CREAM_CONE = registerItem("chorus_fruit_ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.9f).snack().statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_ICE_CREAM_CONE));
        }

// Chorus Fruit Ice Cream Stick

        if (CONFIG.isChorusFruitIceCreamStickEnabled) {
            final Item CHORUS_FRUIT_ICE_CREAM_STICK = registerItem("chorus_fruit_ice_cream_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.9f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_ICE_CREAM_STICK));
        }

// Chorus Fruit Jam

        if (CONFIG.isChorusFruitJamBottleEnabled) {
            final Item CHORUSFRUITJAMBOTTLE = registerItem("chorus_fruit_jam_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.1f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITJAMBOTTLE));
        }

// Chorus Fruit Jam Sandwich

        if (CONFIG.isChorusFruitJamSandwichEnabled) {
            final Item CHORUSFRUITJAMSANDWICH = registerItem("chorus_fruit_jam_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITJAMSANDWICH));
        }

// Chorus Fruit Juice

        if (CONFIG.isChorusFruitJuiceBottleEnabled) {
            final Item CHORUSFRUITJUICEBOTTLE = registerItem("chorus_fruit_juice_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITJUICEBOTTLE));
        }

// Chorus Fruit Milkshake

        if (CONFIG.isChorusFruitMilkshakeBottleEnabled) {
            final Item CHORUSFRUITMILKSHAKEBOTTLE = registerItem("chorus_fruit_milkshake_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(1.1f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITMILKSHAKEBOTTLE));
        }

// Chorus Fruit Slice

        if (CONFIG.isChorusFruitSliceEnabled) {
            final Item CHORUSFRUITSLICE = registerItem("chorus_fruit_slice", new ConsumableItem(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.9f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITSLICE));
        }

// Chorus Fruit Pie & Slice

        if (CONFIG.isChorusFruitPieEnabled) {
            final Item CHORUS_FRUIT_PIE_SLICE = registerItem("chorus_fruit_pie_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_PIE_SLICE));
            CHORUS_FRUIT_PIE = registerBlock("chorus_fruit_pie", new PieBlock(CHORUS_FRUIT_PIE_SLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_PIE));
        }

// Chorus Fruit Popsicle

        if (CONFIG.isChorusFruitPopsicleEnabled) {
            final Item CHORUSFRUITPOPSICLE = registerItem("chorus_fruit_popsicle", new ConsumableItem(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUSFRUITPOPSICLE));
        }

// Cinnamon Sweet Roll Base

        if (CONFIG.isCinnamonSweetRollBaseEnabled) {
            final Item CINNAMONSWEETROLLBASE = registerItem("cinnamon_sweet_roll_base", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CINNAMONSWEETROLLBASE));
        }

// Cloth Filter

        if (CONFIG.isClothFilterEnabled) {
            final Item CLOTHFILTER = registerItem("cloth_filter", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CLOTHFILTER));
        }

// Cloth Filter (Cacao Mass)

        if (CONFIG.isClothFilterCacaoMassEnabled) {
            final Item CLOTHFILTERCACAOMASS = registerItem("cloth_filter_cacao_mass", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CLOTHFILTERCACAOMASS));
        }

// Cocoa Powder

        if (CONFIG.isCocoaPowderEnabled) {
            final Item COCOAPOWDER = registerItem("cocoa_powder", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(COCOAPOWDER));
        }

// Coffee Toffee

        if (CONFIG.isCoffeeToffeeEnabled) {
            final Item COFFEETOFFEE = registerItem("coffee_toffee", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(2.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(COFFEETOFFEE));
        }

// Coffee Toffee Fudge

        if (CONFIG.isCoffeeToffeeFudgeEnabled) {
            final Item COFFEETOFFEEFUDGE = registerItem("coffee_toffee_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(COFFEETOFFEEFUDGE));
        }

// Condensed Milk Bottle

        if (CONFIG.isCondensedMilkBottleEnabled) {
            final Item CONDENSEDMILKBOTTLE = registerItem("condensed_milk_bottle", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CONDENSEDMILKBOTTLE));
        }

// Cookies & Cream Pie

        if (CONFIG.isCookieCreamPieEnabled) {
            final Item COOKIE_CREAM_PIE_SLICE = registerItem("cookie_cream_pie_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(COOKIE_CREAM_PIE_SLICE));
            COOKIE_CREAM_PIE = registerBlock("cookie_cream_pie", new PieBlock(COOKIE_CREAM_PIE_SLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(COOKIE_CREAM_PIE));
        }

// Cookie Crumbs

        if (CONFIG.isCookieCrumbsEnabled) {
            final Item COOKIE_CRUMBS = registerItem("cookie_crumbs", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(COOKIE_CRUMBS));
        }

// Corn Flour

        if (CONFIG.isCornFlourEnabled) {
            final Item CORNFLOUR = registerItem("corn_flour", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CORNFLOUR));
        }

// Cotton Candy

        if (CONFIG.isCottonCandyStickEnabled) {
            final Item COTTON_CANDY_STICK = registerItem("cotton_candy_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(5.0f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(COTTON_CANDY_STICK));
        }

// Cream Cheese

        if (CONFIG.isCreamCheeseEnabled) {
            final Item CREAM_CHEESE = registerItem("cream_cheese", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAM_CHEESE));
        }

// Cream Filled Chocolate

        if (CONFIG.isCreamChocolateEnabled) {
            final Item CREAMCHOCOLATE = registerItem("cream_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMCHOCOLATE));
        }

// Cream Filled Chocolate Pastry

        if (CONFIG.isCreamChocolatePastryEnabled) {
            final Item CREAMCHOCOLATEPASTRY = registerItem("cream_chocolate_pastry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMCHOCOLATEPASTRY));
        }

// Cream Filled Dark Chocolate

        if (CONFIG.isCreamDarkChocolateEnabled) {
            final Item CREAMDARKCHOCOLATE = registerItem("cream_dark_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMDARKCHOCOLATE));
        }

// Cream Filled Pastry

        if (CONFIG.isCreamPastryEnabled) {
            final Item CREAMPASTRY = registerItem("cream_pastry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMPASTRY));
        }

// Cream Pie (Chocolate Graham Cracker)

        if (CONFIG.isCreamPieChocolateGrahamCrackerEnabled) {
            final Item CREAM_PIE_CHOCOLATE_GRAHAM_CRACKER_SLICE = registerItem("cream_pie_chocolate_graham_cracker_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0), 1.0F).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAM_PIE_CHOCOLATE_GRAHAM_CRACKER_SLICE));
            CREAM_PIE_CHOCOLATE_GRAHAM_CRACKER = registerBlock("cream_pie_chocolate_graham_cracker", new PieBlock(CREAM_PIE_CHOCOLATE_GRAHAM_CRACKER_SLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAM_PIE_CHOCOLATE_GRAHAM_CRACKER));
        }

// Cream Pie (Graham Cracker)

        if (CONFIG.isCreamPieGrahamCrackerEnabled) {
            final Item CREAM_PIE_GRAHAM_CRACKER_SLICE = registerItem("cream_pie_graham_cracker_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0), 1.0F).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAM_PIE_GRAHAM_CRACKER_SLICE));
            CREAM_PIE_GRAHAM_CRACKER = registerBlock("cream_pie_graham_cracker", new PieBlock(CREAM_PIE_GRAHAM_CRACKER_SLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAM_PIE_GRAHAM_CRACKER));
        }

// Cream Filled White Chocolate

        if (CONFIG.isCreamWhiteChocolateEnabled) {
            final Item CREAMWHITECHOCOLATE = registerItem("cream_white_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMWHITECHOCOLATE));
        }

// Cream Frosting Jar

        if (CONFIG.isCreamFrostingBottleEnabled) {
            final Item CREAMFROSTINGBOTTLE = registerItem("cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build()).maxCount(64)));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMFROSTINGBOTTLE));
        }

// Cream Glazed Chocolate Donut

        if (CONFIG.isCreamGlazedChocolateDonutEnabled) {
            final Item CREAMGLAZEDCHOCOLATEDONUT = registerItem("cream_glazed_chocolate_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMGLAZEDCHOCOLATEDONUT));
        }

// Cream Glazed Donut

        if (CONFIG.isCreamGlazedDonutEnabled) {
            final Item CREAMGLAZEDDONUT = registerItem("cream_glazed_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAMGLAZEDDONUT));
        }

// Cupcake Base

        if (CONFIG.isCupcakeBaseEnabled) {
            final Item CUPCAKE_BASE = registerItem("cupcake_base", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CUPCAKE_BASE));
        }

// Dark Chips Chocolate Cookie

        if (CONFIG.isDarkChipsChocolateCookieEnabled) {
            final Item DARKCHIPSCHOCOLATECOOKIE = registerItem("dark_chips_chocolate_cookie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHIPSCHOCOLATECOOKIE));
        }

// Dark Chips Cookie

        if (CONFIG.isDarkChipsCookieEnabled) {
            final Item DARKCHIPSCOOKIE = registerItem("dark_chips_cookie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHIPSCOOKIE));
        }

// Dark Chocolate Bottle

        if (CONFIG.isDarkChocolateBottleEnabled) {
            final Item DARKCHOCOLATEBOTTLE = registerItem("dark_chocolate_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build()).maxCount(64)));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATEBOTTLE));
        }

// Dark Chocolate Chips

        if (CONFIG.isDarkChocolateChipsEnabled) {
            final Item DARKCHOCOLATECHIPS = registerItem("dark_chocolate_chips", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATECHIPS));
        }

// Dark Chocolate Chip Ice Cream Cone

        if (CONFIG.isDarkChocolateChipIceCreamConeEnabled) {
            final Item DARK_CHOCOLATE_CHIP_ICE_CREAM_CONE = registerItem("dark_chocolate_chip_ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).snack().statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARK_CHOCOLATE_CHIP_ICE_CREAM_CONE));
        }

// Dark Chocolate Chip Muffin

        if (CONFIG.isDarkChocolateChipMuffinEnabled) {
            final Item DARK_CHOCOLATE_CHIP_MUFFIN = registerItem("dark_chocolate_chip_muffin", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARK_CHOCOLATE_CHIP_MUFFIN));
        }

// Dark Chocolate Chip Waffle & Mini Waffle

        if (CONFIG.isDarkChocolateChipWaffleBlockEnabled) {
            final Item DARK_CHOCOLATE_CHIP_MINI_WAFFLE = registerItem("dark_chocolate_chip_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.7f).snack().statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARK_CHOCOLATE_CHIP_MINI_WAFFLE));
            DARK_CHOCOLATE_CHIP_WAFFLE = registerBlock("dark_chocolate_chip_waffle", new WaffleBlock(DARK_CHOCOLATE_CHIP_MINI_WAFFLE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARK_CHOCOLATE_CHIP_WAFFLE));
        }

// Dark Chocolate Covered Marshmallow Stick

        if (CONFIG.isDarkChocolateCoveredMarshmallowStickEnabled) {
            final Item DARKCHOCOLATECOVEREDMARSHMALLOWSTICK = registerItem("dark_chocolate_covered_marshmallow_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATECOVEREDMARSHMALLOWSTICK));
        }

// Dark Chocolate Filled Chocolate Pastry

        if (CONFIG.isDarkChocolateChocolatePastryEnabled) {
            final Item DARKCHOCOLATECHOCOLATEPASTRY = registerItem("dark_chocolate_chocolate_pastry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATECHOCOLATEPASTRY));
        }

// Dark Chocolate Filled Pastry

        if (CONFIG.isDarkChocolatePastryEnabled) {
            final Item DARKCHOCOLATEPASTRY = registerItem("dark_chocolate_pastry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATEPASTRY));
        }

// Dark Chocolate Fudge

        if (CONFIG.isDarkChocolateFudgeEnabled) {
            final Item DARKCHOCOLATEFUDGE = registerItem("dark_chocolate_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATEFUDGE));
        }

// Dark Chocolate Glazed Apple

        if (CONFIG.isDarkChocolateGlazedAppleEnabled) {
            final Item DARKCHOCOLATEGLAZEDAPPLE = registerItem("dark_chocolate_glazed_apple", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATEGLAZEDAPPLE));
        }

// Dark Chocolate Glazed Berries

        if (CONFIG.isDarkChocolateGlazedBerriesEnabled) {
            final Item DARKCHOCOLATEGLAZEDBERRIES = registerItem("dark_chocolate_glazed_berries", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATEGLAZEDBERRIES));
        }

// Dark Chocolate Toast

        if (CONFIG.isDarkChocolateToastEnabled) {
            final Item DARKCHOCOLATETOAST = registerItem("dark_chocolate_toast", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARKCHOCOLATETOAST));
        }

// Diced Onion

        if (CONFIG.isDicedOnionEnabled) {
            final Item DICEDONION = registerItem("diced_onion", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DICEDONION));
        }

// Donut Base

        if (CONFIG.isDonutBaseEnabled) {
            final Item DONUTBASE = registerItem("donut_base", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1.1f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DONUTBASE));
        }

// Donut Hole

        if (CONFIG.isDonutHoleEnabled) {
            final Item DONUTHOLE = registerItem("donut_hole", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DONUTHOLE));
        }

// Donut Hole (Sugar)

        if (CONFIG.isDonutHoleSugarEnabled) {
            final Item DONUTHOLESUGAR = registerItem("donut_hole_sugar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DONUTHOLESUGAR));
        }

// Donut (Sugar)

        if (CONFIG.isDonutSugarEnabled) {
            final Item DONUTSUGAR = registerItem("donut_sugar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DONUTSUGAR));
        }

// Dragon Bun

        if (CONFIG.isDragonBunEnabled) {
            final Item DRAGONBUN = registerItem("dragon_bun", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DRAGONBUN));
        }

// Dragon Bun (Crimson Fungus)

        if (CONFIG.isDragonBunCrimsonFungusEnabled) {
            final Item DRAGONBUNCRIMSONFUNGUS = registerItem("dragon_bun_crimson_fungus", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DRAGONBUNCRIMSONFUNGUS));
        }

// Dragon Bun (Warped Fungus)

        if (CONFIG.isDragonBunWarpedFungusEnabled) {
            final Item DRAGONBUNWARPEDFUNGUS = registerItem("dragon_bun_warped_fungus", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DRAGONBUNWARPEDFUNGUS));
        }

// Dragon Burger

        if (CONFIG.isDragonBurgerEnabled) {
            final Item DRAGONBURGER = registerItem("dragon_burger", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DRAGONBURGER));
        }

// Dragon Burger (Crimson Fungus)

        if (CONFIG.isDragonBurgerCrimsonFungusEnabled) {
            final Item DRAGONBURGERCRIMSONFUNGUS = registerItem("dragon_burger_crimson_fungus", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 6000, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DRAGONBURGERCRIMSONFUNGUS));
        }

// Dragon Burger (Warped Fungus)

        if (CONFIG.isDragonBurgerWarpedFungusEnabled) {
            final Item DRAGONBURGERWARPEDFUNGUS = registerItem("dragon_burger_warped_fungus", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 6000, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DRAGONBURGERWARPEDFUNGUS));
        }

// Dragon Patty

        if (CONFIG.isDragonPattyEnabled) {
            final Item DRAGONPATTY = registerItem("dragon_patty", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DRAGONPATTY));
        }

// Dried Coffee Beans

        if (CONFIG.isDriedCoffeeBeansEnabled) {
            final Item DRIEDCOFFEEBEANS = registerItem("dried_coffee_beans", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DRIEDCOFFEEBEANS));
        }

// Dumpling Wrappers

        if (CONFIG.isDumplingWrappersEnabled) {
            final Item DUMPLING_WRAPPERS = registerItem("dumpling_wrappers", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DUMPLING_WRAPPERS));
        }

// Egg Powder

        if (CONFIG.isEggPowderEnabled) {
            final Item EGGPOWDER = registerItem("egg_powder", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(EGGPOWDER));
        }

// Eggplant Bun

        if (CONFIG.isEggplantBunEnabled) {
            final Item EGGPLANTBUN = registerItem("eggplant_bun", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(EGGPLANTBUN));
        }

// Eggplant Bun (Lettuce)

        if (CONFIG.isEggplantBunLettuceEnabled) {
            final Item EGGPLANTBUNLETTUCE = registerItem("eggplant_bun_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(1.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(EGGPLANTBUNLETTUCE));
        }

// Eggplant Bun (Lettuce, Tomato)

        if (CONFIG.isEggplantBunLettuceTomatoEnabled) {
            final Item EGGPLANTBUNLETTUCETOMATO = registerItem("eggplant_bun_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(1.1f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(EGGPLANTBUNLETTUCETOMATO));
        }

// Eggplant Burger

        if (CONFIG.isEggplantBurgerEnabled) {
            final Item EGGPLANTBURGER = registerItem("eggplant_burger", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(EGGPLANTBURGER));
        }

// Eggplant Burger (Lettuce)

        if (CONFIG.isEggplantBurgerLettuceEnabled) {
            final Item EGGPLANTBURGERLETTUCE = registerItem("eggplant_burger_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(EGGPLANTBURGERLETTUCE));
        }

// Eggplant Cheeseburger

        if (CONFIG.isEggplantCheeseburgerEnabled) {
            final Item EGGPLANTCHEESEBURGER = registerItem("eggplant_cheeseburger", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(EGGPLANTCHEESEBURGER));
        }

// Eggplant Cheeseburger (Lettuce)

        if (CONFIG.isEggplantCheeseburgerLettuceEnabled) {
            final Item EGGPLANTCHEESEBURGERLETTUCE = registerItem("eggplant_cheeseburger_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(EGGPLANTCHEESEBURGERLETTUCE));
        }

// Eggplant Cheeseburger (Lettuce, Tomato)

        if (CONFIG.isEggplantCheeseburgerLettuceTomatoEnabled) {
            final Item EGGPLANTCHEESEBURGERLETTUCETOMATO = registerItem("eggplant_cheeseburger_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(EGGPLANTCHEESEBURGERLETTUCETOMATO));
        }

// Endermite Meatball

        if (CONFIG.isEndermiteMeatballEnabled) {
            final Item ENDERMITEMEATBALL = registerItem("endermite_meatball", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ENDERMITEMEATBALL));
        }

// Endermite Meatball Sandwich

        if (CONFIG.isEndermiteMeatballSandwichEnabled) {
            final Item ENDERMITEMEATBALLSANDWICH = registerItem("endermite_meatball_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ENDERMITEMEATBALLSANDWICH));
        }

// Endermite Meatball Stick

        if (CONFIG.isEndermiteMeatballStickEnabled) {
            final Item ENDERMITEMEATBALLSTICK1 = registerItem("endermite_meatball_stick_1", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ENDERMITEMEATBALLSTICK1));
        }
        if (CONFIG.isEndermiteMeatballStickEnabled) {
            final Item ENDERMITEMEATBALLSTICK2 = registerItem("endermite_meatball_stick_2", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ENDERMITEMEATBALLSTICK2));
        }
        if (CONFIG.isEndermiteMeatballStickEnabled) {
            final Item ENDERMITEMEATBALLSTICK3 = registerItem("endermite_meatball_stick_3", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ENDERMITEMEATBALLSTICK3));
        }

// Espresso Powder

        if (CONFIG.isEspressoPowderEnabled) {
            final Item ESPRESSOPOWDER = registerItem("espresso_powder", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ESPRESSOPOWDER));
        }

// Fish Calzone

        if (CONFIG.isFishCalzoneEnabled) {
            final Item FISH_CALZONE = registerItem("fish_calzone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FISH_CALZONE));
        }

// Fish Pizza & Slice

        if (CONFIG.isFishPizzaEnabled) {
            final Item FISHPIZZASLICE = registerItem("fish_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FISHPIZZASLICE));
            FISH_PIZZA = registerBlock("fish_pizza", new PizzaBlock(FISHPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FISH_PIZZA));
        }

// Fish & Bacon Pizza & Slice

        if (CONFIG.isFishBaconPizzaEnabled) {
            final Item FISHBACONPIZZASLICE = registerItem("fish_bacon_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FISHBACONPIZZASLICE));
            FISH_BACON_PIZZA = registerBlock("fish_bacon_pizza", new PizzaBlock(FISHBACONPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FISH_BACON_PIZZA));
        }

// Fish & Onion Pizza & Slice

        if (CONFIG.isFishOnionPizzaEnabled) {
            final Item FISHONIONPIZZASLICE = registerItem("fish_onion_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FISHONIONPIZZASLICE));
            FISH_ONION_PIZZA = registerBlock("fish_onion_pizza", new PizzaBlock(FISHONIONPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FISH_ONION_PIZZA));
        }

// Fried Egg Plate

        if (CONFIG.isFriedEggPlateEnabled) {
            final Item FRIEDEGGPLATE = registerItem("fried_egg_plate", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FRIEDEGGPLATE));
        }

// Fried Egg & Hash Brown Sandwich

        if (CONFIG.isFriedEggAndHashBrownSandwichEnabled) {
            final Item FRIEDEGGHASHBROWNSANDWICH = registerItem("fried_egg_hash_brown_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FRIEDEGGHASHBROWNSANDWICH));
        }

// Fruit Smoothie

        if (CONFIG.isFruitSmoothieBottleEnabled) {
            final Item FRUITSMOOTHIEBOTTLE = registerItem("fruit_smoothie_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FRUITSMOOTHIEBOTTLE));
        }

// Frosted Cupcake

        if (CONFIG.isFrostedCupcakeEnabled) {
            final Item FROSTED_CUPCAKE = registerItem("frosted_cupcake", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.1f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FROSTED_CUPCAKE));
        }

// Frosted Mini Waffle

        if (CONFIG.isFrostedMiniWaffleEnabled) {
            final Item FROSTED_MINI_WAFFLE = registerItem("frosted_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.8f).snack().statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FROSTED_MINI_WAFFLE));
        }

// Gelatin

        if (CONFIG.isGelatinEnabled) {
            final Item GELATIN = registerItem("gelatin", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GELATIN));
        }

// Gelatin Dessert Slice

        if (CONFIG.isGelatinDessertSliceEnabled) {
            final Item GELATINDESSERTSLICE = registerItem("gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GELATINDESSERTSLICE));
        }
        if (CONFIG.isBlackGelatinDessertSliceEnabled) {
            final Item BLACKGELATINDESSERTSLICE = registerItem("black_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BLACKGELATINDESSERTSLICE));
        }
        if (CONFIG.isBlueGelatinDessertSliceEnabled) {
            final Item BLUEGELATINDESSERTSLICE = registerItem("blue_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BLUEGELATINDESSERTSLICE));
        }
        if (CONFIG.isBrownGelatinDessertSliceEnabled) {
            final Item BROWNGELATINDESSERTSLICE = registerItem("brown_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BROWNGELATINDESSERTSLICE));
        }
        if (CONFIG.isCyanGelatinDessertSliceEnabled) {
            final Item CYANGELATINDESSERTSLICE = registerItem("cyan_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CYANGELATINDESSERTSLICE));
        }
        if (CONFIG.isGrayGelatinDessertSliceEnabled) {
            final Item GRAYGELATINDESSERTSLICE = registerItem("gray_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAYGELATINDESSERTSLICE));
        }
        if (CONFIG.isGreenGelatinDessertSliceEnabled) {
            final Item GREENGELATINDESSERTSLICE = registerItem("green_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GREENGELATINDESSERTSLICE));
        }
        if (CONFIG.isLightBlueGelatinDessertSliceEnabled) {
            final Item LIGHTBLUEGELATINDESSERTSLICE = registerItem("light_blue_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIGHTBLUEGELATINDESSERTSLICE));
        }
        if (CONFIG.isLightGrayGelatinDessertSliceEnabled) {
            final Item LIGHTGRAYGELATINDESSERTSLICE = registerItem("light_gray_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIGHTGRAYGELATINDESSERTSLICE));
        }
        if (CONFIG.isLimeGelatinDessertSliceEnabled) {
            final Item LIMEGELATINDESSERTSLICE = registerItem("lime_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIMEGELATINDESSERTSLICE));
        }
        if (CONFIG.isMagentaGelatinDessertSliceEnabled) {
            final Item MAGENTAGELATINDESSERTSLICE = registerItem("magenta_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MAGENTAGELATINDESSERTSLICE));
        }
        if (CONFIG.isOrangeGelatinDessertSliceEnabled) {
            final Item ORANGEGELATINDESSERTSLICE = registerItem("orange_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ORANGEGELATINDESSERTSLICE));
        }
        if (CONFIG.isPinkGelatinDessertSliceEnabled) {
            final Item PINKGELATINDESSERTSLICE = registerItem("pink_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PINKGELATINDESSERTSLICE));
        }
        if (CONFIG.isPurpleGelatinDessertSliceEnabled) {
            final Item PURPLEGELATINDESSERTSLICE = registerItem("purple_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PURPLEGELATINDESSERTSLICE));
        }
        if (CONFIG.isRedGelatinDessertSliceEnabled) {
            final Item REDGELATINDESSERTSLICE = registerItem("red_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(REDGELATINDESSERTSLICE));
        }
        if (CONFIG.isYellowGelatinDessertSliceEnabled) {
            final Item YELLOWGELATINDESSERTSLICE = registerItem("yellow_gelatin_dessert_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(YELLOWGELATINDESSERTSLICE));
        }

// Glow Berry Cheesecake & Slice

        if (CONFIG.isGlowBerryCheesecakeEnabled) {
            final Item GLOW_BERRY_CHEESECAKE_SLICE = registerItem("glow_berry_cheesecake_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CHEESECAKE_SLICE));
            GLOW_BERRY_CHEESECAKE = registerBlock("glow_berry_cheesecake", new PieBlock(GLOW_BERRY_CHEESECAKE_SLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CHEESECAKE));
        }

// Glow Berry Cream Cake Slice (Chorus Fruit)

        if (CONFIG.isGlowBerryCreamCakeChorusFruitEnabled) {
            final Item GLOW_BERRY_CREAM_CAKE_SLICE_CHORUS_FRUIT = registerItem("glow_berry_cream_cake_slice_chorus_fruit", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_CAKE_SLICE_CHORUS_FRUIT));
            GLOW_BERRY_CREAM_CAKE_CHORUS_FRUIT = registerBlock("glow_berry_cream_cake_chorus_fruit", new GlowBerryCreamCakeChorusFruitBlock(GLOW_BERRY_CREAM_CAKE_SLICE_CHORUS_FRUIT));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_CAKE_CHORUS_FRUIT));
        }

// Glow Berry Cream Cake Slice (Glow Berry)

        if (CONFIG.isGlowBerryCreamCakeGlowBerryEnabled) {
            final Item GLOW_BERRY_CREAM_CAKE_SLICE_GLOW_BERRY = registerItem("glow_berry_cream_cake_slice_glow_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_CAKE_SLICE_GLOW_BERRY));
            GLOW_BERRY_CREAM_CAKE_GLOW_BERRY = registerBlock("glow_berry_cream_cake_glow_berry", new GlowBerryCreamCakeGlowBerryBlock(GLOW_BERRY_CREAM_CAKE_SLICE_GLOW_BERRY));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_CAKE_GLOW_BERRY));
        }

// Glow Berry Cream Cake Slice (Sweet Berry)

        if (CONFIG.isGlowBerryCreamCakeSweetBerryEnabled) {
            final Item GLOW_BERRY_CREAM_CAKE_SLICE_SWEET_BERRY = registerItem("glow_berry_cream_cake_slice_sweet_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_CAKE_SLICE_SWEET_BERRY));
            GLOW_BERRY_CREAM_CAKE_SWEET_BERRY = registerBlock("glow_berry_cream_cake_sweet_berry", new GlowBerryCreamCakeSweetBerryBlock(GLOW_BERRY_CREAM_CAKE_SLICE_SWEET_BERRY));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_CAKE_SWEET_BERRY));
        }

// Glow Berry Cream Chocolate

        if (CONFIG.isGlowBerryCreamChocolateEnabled) {
            final Item GLOWBERRYCREAMCHOCOLATE = registerItem("glow_berry_cream_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMCHOCOLATE));
        }

// Glow Berry Cream Dark Chocolate

        if (CONFIG.isGlowBerryCreamDarkChocolateEnabled) {
            final Item GLOWBERRYCREAMDARKCHOCOLATE = registerItem("glow_berry_cream_dark_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMDARKCHOCOLATE));
        }

// Glow Berry Cream White Chocolate

        if (CONFIG.isGlowBerryCreamWhiteChocolateEnabled) {
            final Item GLOWBERRYCREAMWHITECHOCOLATE = registerItem("glow_berry_cream_white_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMWHITECHOCOLATE));
        }

// Glow Berry Cream Filled Chocolate Pastry Bar

        if (CONFIG.isGlowBerryCreamChocolatePastryBarEnabled) {
            final Item GLOWBERRYCREAMCHOCOLATEPASTRYBAR = registerItem("glow_berry_cream_chocolate_pastry_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMCHOCOLATEPASTRYBAR));
        }

// Glow Berry Cream Filled Pastry Bar

        if (CONFIG.isGlowBerryCreamPastryBarEnabled) {
            final Item GLOWBERRYCREAMPASTRYBAR = registerItem("glow_berry_cream_pastry_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMPASTRYBAR));
        }

// Glow Berry Cream Frosting Bottle

        if (CONFIG.isGlowBerryCreamFrostingBottleEnabled) {
            final Item GLOWBERRYCREAMFROSTINGBOTTLE = registerItem("glow_berry_cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMFROSTINGBOTTLE));
        }

// Glow Berry Cream Frosted Chocolate Sweet Roll

        if (CONFIG.isGlowBerryCreamFrostedChocolateSweetRollEnabled) {
            final Item GLOWBERRYCREAMFROSTEDCHOCOLATESWEETROLL = registerItem("glow_berry_cream_frosted_chocolate_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMFROSTEDCHOCOLATESWEETROLL));
        }

// Glow Berry Cream Frosted Chocolate Sweet Roll (Glow Berry)

        if (CONFIG.isGlowBerryCreamFrostedChocolateSweetRollGlowBerryEnabled) {
            final Item GLOWBERRYCREAMFROSTEDCHOCOLATESWEETROLLGLOWBERRY = registerItem("glow_berry_cream_frosted_chocolate_sweet_roll_glow_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMFROSTEDCHOCOLATESWEETROLLGLOWBERRY));
        }

// Glow Berry Cream Frosted Cupcake

        if (CONFIG.isGlowBerryCreamFrostedCupcakeEnabled) {
            final Item GLOW_BERRY_CREAM_FROSTED_CUPCAKE = registerItem("glow_berry_cream_frosted_cupcake", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_FROSTED_CUPCAKE));
        }

// Glow Berry Cream Frosted Mini Waffle

        if (CONFIG.isGlowBerryCreamFrostedMiniWaffleEnabled) {
            final Item GLOW_BERRY_CREAM_FROSTED_MINI_WAFFLE = registerItem("glow_berry_cream_frosted_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.9f).snack().statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_FROSTED_MINI_WAFFLE));
        }

// Glow Berry Cream Frosted Mini Waffle (Glow Berry)

        if (CONFIG.isGlowBerryCreamFrostedMiniWaffleGlowBerryEnabled) {
            final Item GLOW_BERRY_CREAM_FROSTED_MINI_WAFFLE_GLOW_BERRY = registerItem("glow_berry_cream_frosted_mini_waffle_glow_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.9f).snack().statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_FROSTED_MINI_WAFFLE_GLOW_BERRY));
        }

// Glow Berry Cream Frosted Sweet Roll

        if (CONFIG.isGlowBerryCreamFrostedSweetRollEnabled) {
            final Item GLOWBERRYCREAMFROSTEDSWEETROLL = registerItem("glow_berry_cream_frosted_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMFROSTEDSWEETROLL));
        }

// Glow Berry Cream Frosted Sweet Roll (Glow Berry)

        if (CONFIG.isGlowBerryCreamFrostedSweetRollGlowBerryEnabled) {
            final Item GLOWBERRYCREAMFROSTEDSWEETROLLGLOWBERRY = registerItem("glow_berry_cream_frosted_sweet_roll_glow_berry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMFROSTEDSWEETROLLGLOWBERRY));
        }

// Glow Berry Cream Glazed Chocolate Donut

        if (CONFIG.isGlowBerryCreamGlazedChocolateDonutEnabled) {
            final Item GLOWBERRYCREAMGLAZEDCHOCOLATEDONUT = registerItem("glow_berry_cream_glazed_chocolate_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMGLAZEDCHOCOLATEDONUT));
        }

// Glow Berry Cream Glazed Donut

        if (CONFIG.isGlowBerryCreamGlazedDonutEnabled) {
            final Item GLOWBERRYCREAMGLAZEDDONUT = registerItem("glow_berry_cream_glazed_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYCREAMGLAZEDDONUT));
        }

// Glow Berry Ice Cream Bowl

        if (CONFIG.isGlowBerryIceCreamBowlEnabled) {
            final Item GLOWBERRYICECREAMBOWL = registerItem("glow_berry_ice_cream_bowl", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYICECREAMBOWL));
        }

// Glow Berry Ice Cream Cone

        if (CONFIG.isGlowBerryIceCreamConeEnabled) {
            final Item GLOW_BERRY_ICE_CREAM_CONE = registerItem("glow_berry_ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.9f).snack().statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_ICE_CREAM_CONE));
        }

// Glow Berry Ice Cream Stick

        if (CONFIG.isGlowBerryIceCreamStickEnabled) {
            final Item GLOW_BERRY_ICE_CREAM_STICK = registerItem("glow_berry_ice_cream_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.9f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_ICE_CREAM_STICK));
        }

// Glow Berry Jam

        if (CONFIG.isGlowBerryJamBottleEnabled) {
            final Item GLOWBERRYJAMBOTTLE = registerItem("glow_berry_jam_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYJAMBOTTLE));
        }

// Glow Berry Jam Sandwich

        if (CONFIG.isGlowBerryJamSandwichEnabled) {
            final Item GLOWBERRYJAMSANDWICH = registerItem("glow_berry_jam_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYJAMSANDWICH));
        }

// Glow Berry Juice

        if (CONFIG.isGlowBerryJuiceBottleEnabled) {
            final Item GLOWBERRYJUICEBOTTLE = registerItem("glow_berry_juice_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYJUICEBOTTLE));
        }

// Glow Berry Milkshake

        if (CONFIG.isGlowBerryMilkshakeBottleEnabled) {
            final Item GLOWBERRYMILKSHAKEBOTTLE = registerItem("glow_berry_milkshake_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYMILKSHAKEBOTTLE));
        }

// Glow Berry Pie & Slice

        if (CONFIG.isGlowBerryPieEnabled) {
            final Item GLOW_BERRY_PIE_SLICE = registerItem("glow_berry_pie_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_PIE_SLICE));
            GLOW_BERRY_PIE = registerBlock("glow_berry_pie", new PieBlock(GLOW_BERRY_PIE_SLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_PIE));
        }

// Glow Berry Popsicle

        if (CONFIG.isGlowBerryPopsicleEnabled) {
            final Item GLOWBERRYPOPSICLE = registerItem("glow_berry_popsicle", new StickFood(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOWBERRYPOPSICLE));
        }

// Graham Cracker

        if (CONFIG.isGrahamCrackerEnabled) {
            final Item GRAHAMCRACKER = registerItem("graham_cracker", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAHAMCRACKER));
        }

// Graham Cracker (Chocolate)

        if (CONFIG.isGrahamCrackerChocolateEnabled) {
            final Item GRAHAM_CRACKER_CHOCOLATE = registerItem("graham_cracker_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAHAM_CRACKER_CHOCOLATE));
        }

// Graham Cracker (Chocolate,Marshmallow)

        if (CONFIG.isGrahamCrackerChocolateMarshmallowEnabled) {
            final Item GRAHAM_CRACKER_CHOCOLATE_MARSHMALLOW = registerItem("graham_cracker_chocolate_marshmallow", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAHAM_CRACKER_CHOCOLATE_MARSHMALLOW));
        }

// Graham Cracker Crumbs

        if (CONFIG.isGrahamCrackerCrumbsEnabled) {
            final Item GRAHAMCRACKERCRUMBS = registerItem("graham_cracker_crumbs", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAHAMCRACKERCRUMBS));
        }

// Graham Cracker (Marshmallow)

        if (CONFIG.isGrahamCrackerMarshmallowEnabled) {
            final Item GRAHAM_CRACKER_MARSHMALLOW = registerItem("graham_cracker_marshmallow", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAHAM_CRACKER_MARSHMALLOW));
        }

// Graham Cracker Pie Crust

        if (CONFIG.isGrahamCrackerPieCrustEnabled) {
            final Item GRAHAMCRACKERPIECRUST = registerItem("graham_cracker_pie_crust", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAHAMCRACKERPIECRUST));
        }

// Grilled Cheese Sandwich

        if (CONFIG.isGrilledCheeseSandwichEnabled) {
            final Item GRILLEDCHEESESANDWICH = registerItem("grilled_cheese_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRILLEDCHEESESANDWICH));
        }

// Ground Beef

        if (CONFIG.isGroundBeefEnabled) {
            final Item GROUNDBEEF = registerItem("ground_beef", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GROUNDBEEF));
        }

// Ground Endermite

        if (CONFIG.isGroundEndermiteEnabled) {
            final Item GROUNDENDERMITE = registerItem("ground_endermite", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GROUNDENDERMITE));
        }

// Hamburger

        if (CONFIG.isHamburgerEnabled) {
            final Item HAMBURGER = registerItem("hamburger", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGER));
        }

// Hamburger (Bacon)

        if (CONFIG.isHamburgerBaconEnabled) {
            final Item HAMBURGERBACON = registerItem("hamburger_bacon", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERBACON));
        }

// Hamburger (Bacon, Lettuce)

        if (CONFIG.isHamburgerBaconLettuceEnabled) {
            final Item HAMBURGERBACONLETTUCE = registerItem("hamburger_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERBACONLETTUCE));
        }

// Hamburger (Bacon, Lettuce, Tomato)

        if (CONFIG.isHamburgerBaconLettuceTomatoEnabled) {
            final Item HAMBURGERBACONLETTUCETOMATO = registerItem("hamburger_bacon_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERBACONLETTUCETOMATO));
        }

// Hamburger (Lettuce)

        if (CONFIG.isHamburgerLettuceEnabled) {
            final Item HAMBURGERLETTUCE = registerItem("hamburger_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERLETTUCE));
        }

// Hamburger (Lettuce, Tomato)

        if (CONFIG.isHamburgerLettuceTomatoEnabled) {
            final Item HAMBURGERLETTUCETOMATO = registerItem("hamburger_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERLETTUCETOMATO));
        }

// Hamburger (Onion)

        if (CONFIG.isHamburgerOnionEnabled) {
            final Item HAMBURGERONION = registerItem("hamburger_onion", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERONION));
        }

// Hamburger (Onion, Bacon)

        if (CONFIG.isHamburgerOnionBaconEnabled) {
            final Item HAMBURGERONIONBACON = registerItem("hamburger_onion_bacon", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERONIONBACON));
        }

// Hamburger (Onion, Bacon, Lettuce)

        if (CONFIG.isHamburgerOnionBaconLettuceEnabled) {
            final Item HAMBURGERONIONBACONLETTUCE = registerItem("hamburger_onion_bacon_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERONIONBACONLETTUCE));
        }

// Hamburger (Onion, Lettuce)

        if (CONFIG.isHamburgerOnionLettuceEnabled) {
            final Item HAMBURGERONIONLETTUCE = registerItem("hamburger_onion_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERONIONLETTUCE));
        }

// Hamburger (Peanut Butter)

        if (CONFIG.isHamburgerPeanutButterEnabled) {
            final Item HAMBURGERPEANUTBUTTER = registerItem("hamburger_peanut_butter", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERPEANUTBUTTER));
        }

// Hamburger (Peanut Butter, Bacon)

        if (CONFIG.isHamburgerPeanutButterBaconEnabled) {
            final Item HAMBURGERPEANUTBUTTERBACON = registerItem("hamburger_peanut_butter_bacon", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HAMBURGERPEANUTBUTTERBACON));
        }

// Hash Browns

        if (CONFIG.isHashBrownsEnabled) {
            final Item HASHBROWNS = registerItem("hash_browns", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HASHBROWNS));
        }

// Hash Browns Plate

        if (CONFIG.isHashBrownPlateEnabled) {
            final Item HASHBROWNPLATE = registerItem("hash_brown_plate", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HASHBROWNPLATE));
        }

// Hash Brown & Fried Egg Plate

        if (CONFIG.isHashBrownAndFriedEggPlateEnabled) {
            final Item HASHBROWNFRIEDEGGPLATE = registerItem("hash_brown_fried_egg_plate", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HASHBROWNFRIEDEGGPLATE));
        }

// Hash Brown & Toast Plate

        if (CONFIG.isHashBrownAndToastPlateEnabled) {
            final Item HASHBROWNTOASTPLATE = registerItem("hash_brown_toast_plate", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HASHBROWNTOASTPLATE));
        }

// Hollow Chocolate

        if (CONFIG.isHollowChocolateEnabled) {
            final Item HOLLOWCHOCOLATE = registerItem("hollow_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOLLOWCHOCOLATE));
        }

// Hollow Dark Chocolate

        if (CONFIG.isHollowDarkChocolateEnabled) {
            final Item HOLLOWDARKCHOCOLATE = registerItem("hollow_dark_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.2f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOLLOWDARKCHOCOLATE));
        }

// Hollow White Chocolate

        if (CONFIG.isHollowWhiteChocolateEnabled) {
            final Item HOLLOWWHITECHOCOLATE = registerItem("hollow_white_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOLLOWWHITECHOCOLATE));
        }

// Honeyed Berries

        if (CONFIG.isHoneyedBerriesEnabled) {
            final Item HONEYEDBERRIES = registerItem("honeyed_berries", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDBERRIES));
        }

// Honeyed Biscuit

        if (CONFIG.isHoneyedBiscuitEnabled) {
            final Item HONEYEDBISCUIT = registerItem("honeyed_biscuit", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDBISCUIT));
        }

// Honeyed Chocolate Sweet Roll

        if (CONFIG.isHoneyedChocolateSweetRollEnabled) {
            final Item HONEYEDCHOCOLATESWEETROLL = registerItem("honeyed_chocolate_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDCHOCOLATESWEETROLL));
        }

// Honeyed Chocolate Donut

        if (CONFIG.isHoneyedChocolateDonutEnabled) {
            final Item HONEYEDCHOCOLATEDONUT = registerItem("honeyed_chocolate_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDCHOCOLATEDONUT));
        }

// Honeyed Cupcake

        if (CONFIG.isHoneyedCupcakeEnabled) {
            final Item HONEYED_CUPCAKE = registerItem("honeyed_cupcake", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYED_CUPCAKE));
        }

// Honeyed Mini Waffle

        if (CONFIG.isHoneyedMiniWaffleEnabled) {
            final Item HONEYED_MINI_WAFFLE = registerItem("honeyed_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.8f).snack().statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYED_MINI_WAFFLE));
        }

// Honeyed Donut

        if (CONFIG.isHoneyedDonutEnabled) {
            final Item HONEYEDDONUT = registerItem("honeyed_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDDONUT));
        }

// Honeyed Muffin

        if (CONFIG.isHoneyedMuffinEnabled) {
            final Item HONEYED_MUFFIN = registerItem("honeyed_muffin", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYED_MUFFIN));
        }

// Honeyed Sweet Roll

        if (CONFIG.isHoneyedSweetRollEnabled) {
            final Item HONEYEDSWEETROLL = registerItem("honeyed_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDSWEETROLL));
        }

// Honey Toast

        if (CONFIG.isHoneyedToastEnabled) {
            final Item HONEYEDTOAST = registerItem("honeyed_toast", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HONEYEDTOAST));
        }

// Hot Cheese & Sausage Biscuit Sandwich

        if (CONFIG.isHotCheeseAndSausageBiscuitSandwichEnabled) {
            final Item HOTCHEESEANDSAUSAGEBISCUITSANDWICH = registerItem("hot_cheese_and_sausage_biscuit_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(21).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOTCHEESEANDSAUSAGEBISCUITSANDWICH));
        }

// Hot Cheese Biscuit Sandwich

        if (CONFIG.isHotCheeseBiscuitSandwichEnabled) {
            final Item HOTCHEESEBISCUITSANDWICH = registerItem("hot_cheese_biscuit_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOTCHEESEBISCUITSANDWICH));
        }

// Hot Chocolate Bottle

        if (CONFIG.isHotChocolateBottleEnabled) {
            final Item HOTCHOCOLATEBOTTLE = registerItem("hot_chocolate_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOTCHOCOLATEBOTTLE));
        }

// Hot Dark Chocolate Bottle

        if (CONFIG.isHotDarkChocolateBottleEnabled) {
            final Item HOTDARKCHOCOLATEBOTTLE = registerItem("hot_dark_chocolate_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOTDARKCHOCOLATEBOTTLE));
        }

// Hot Sausage Biscuit Sandwich

        if (CONFIG.isHotSausageBiscuitSandwichEnabled) {
            final Item HOTSAUSAGEBISCUITSANDWICH = registerItem("hot_sausage_biscuit_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(19).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOTSAUSAGEBISCUITSANDWICH));
        }

// Hot White Chocolate Bottle

        if (CONFIG.isHotWhiteChocolateBottleEnabled) {
            final Item HOTWHITECHOCOLATEBOTTLE = registerItem("hot_white_chocolate_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(1.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOTWHITECHOCOLATEBOTTLE));
        }

// Ice Cream Bowl

        if (CONFIG.isIceCreamBowlEnabled) {
            final Item ICECREAMBOWL = registerItem("ice_cream_bowl", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ICECREAMBOWL));
        }

// Ice Cream Cone

        if (CONFIG.isIceCreamConeEnabled) {
            final Item ICE_CREAM_CONE = registerItem("ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).snack().statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ICE_CREAM_CONE));
        }

// Ice Cream Sandwich

        if (CONFIG.isIceCreamSandwichEnabled) {
            final Item ICE_CREAM_SANDWICH = registerItem("ice_cream_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ICE_CREAM_SANDWICH));
        }

// Ice Cream Sandwich (Neapolitan)

        if (CONFIG.isIceCreamSandwichNeapolitanEnabled) {
            final Item ICE_CREAM_SANDWICH_NEAPOLITAN = registerItem("ice_cream_sandwich_neapolitan", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ICE_CREAM_SANDWICH_NEAPOLITAN));
        }

// Ice Cream Stick

        if (CONFIG.isIceCreamStickEnabled) {
            final Item ICE_CREAM_STICK = registerItem("ice_cream_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.8f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ICE_CREAM_STICK));
        }

// Magma Cream Marshmallow

        if (CONFIG.isMagmaCreamMarshmallowEnabled) {
            final Item MAGMACREAMMARSHMALLOW = registerItem("magma_cream_marshmallow", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MAGMACREAMMARSHMALLOW));
        }

// Magma Cream Marshmallow Stick

        if (CONFIG.isMagmaCreamMarshmallowStickEnabled) {
            final Item MAGMACREAMMARSHMALLOWSTICK = registerItem("magma_cream_marshmallow_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MAGMACREAMMARSHMALLOWSTICK));
        }

// Marshmallow

        if (CONFIG.isMarshmallowEnabled) {
            final Item MARSHMALLOW = registerItem("marshmallow", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOW));
        }

// Marshmallow Filled Chocolate

        if (CONFIG.isMarshmallowChocolateEnabled) {
            final Item MARSHMALLOWCHOCOLATE = registerItem("marshmallow_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWCHOCOLATE));
        }

// Marshmallow Filled Dark Chocolate

        if (CONFIG.isMarshmallowDarkChocolateEnabled) {
            final Item MARSHMALLOWDARKCHOCOLATE = registerItem("marshmallow_dark_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWDARKCHOCOLATE));
        }

// Marshmallow Filled White Chocolate

        if (CONFIG.isMarshmallowWhiteChocolateEnabled) {
            final Item MARSHMALLOWWHITECHOCOLATE = registerItem("marshmallow_white_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWWHITECHOCOLATE));
        }

// Marshmallow Stick

        if (CONFIG.isMarshmallowStickEnabled) {
            final Item MARSHMALLOWSTICK = registerItem("marshmallow_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWSTICK));
        }

// Marshmallow Butterscotch Fudge

        if (CONFIG.isMarshmallowButterscotchFudgeEnabled) {
            final Item MARSHMALLOWBUTTERSCOTCHFUDGE = registerItem("marshmallow_butterscotch_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWBUTTERSCOTCHFUDGE));
        }

// Marshmallow Caramel Fudge

        if (CONFIG.isMarshmallowCaramelFudgeEnabled) {
            final Item MARSHMALLOWCARAMELFUDGE = registerItem("marshmallow_caramel_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 6000, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWCARAMELFUDGE));
        }

// Marshmallow Chocolate Fudge

        if (CONFIG.isMarshmallowChocolateFudgeEnabled) {
            final Item MARSHMALLOWCHOCOLATEFUDGE = registerItem("marshmallow_chocolate_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWCHOCOLATEFUDGE));
        }

// Marshmallow Coffee Toffee Fudge

        if (CONFIG.isMarshmallowCoffeeToffeeFudgeEnabled) {
            final Item MARSHMALLOWCOFFEETOFFEEFUDGE = registerItem("marshmallow_coffee_toffee_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWCOFFEETOFFEEFUDGE));
        }

// Marshmallow Dark Chocolate Fudge

        if (CONFIG.isMarshmallowDarkChocolateFudgeEnabled) {
            final Item MARSHMALLOWDARKCHOCOLATEFUDGE = registerItem("marshmallow_dark_chocolate_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWDARKCHOCOLATEFUDGE));
        }

// Marshmallow Toffee Fudge

        if (CONFIG.isMarshmallowToffeeFudgeEnabled) {
            final Item MARSHMALLOWTOFFEEFUDGE = registerItem("marshmallow_toffee_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 6000, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWTOFFEEFUDGE));
        }

// Marshmallow White Chocolate Fudge

        if (CONFIG.isMarshmallowWhiteChocolateFudgeEnabled) {
            final Item MARSHMALLOWWHITECHOCOLATEFUDGE = registerItem("marshmallow_white_chocolate_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MARSHMALLOWWHITECHOCOLATEFUDGE));
        }

// Meatball

        if (CONFIG.isMeatballEnabled) {
            final Item MEATBALL = registerItem("meatball", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MEATBALL));
        }

// Meatball Sandwich

        if (CONFIG.isMeatballSandwichEnabled) {
            final Item MEATBALLSANDWICH = registerItem("meatball_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MEATBALLSANDWICH));
        }

// Meatball Stick

        if (CONFIG.isMeatballStickEnabled) {
            final Item MEATBALLSTICK1 = registerItem("meatball_stick_1", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MEATBALLSTICK1));
        }
        if (CONFIG.isMeatballStickEnabled) {
            final Item MEATBALLSTICK2 = registerItem("meatball_stick_2", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MEATBALLSTICK2));
        }
        if (CONFIG.isMeatballStickEnabled) {
            final Item MEATBALLSTICK3 = registerItem("meatball_stick_3", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MEATBALLSTICK3));
        }

// Melon Cream Chocolate

        if (CONFIG.isMelonCreamChocolateEnabled) {
            final Item MELONCREAMCHOCOLATE = registerItem("melon_cream_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONCREAMCHOCOLATE));
        }
// Melon Cream Dark Chocolate

        if (CONFIG.isMelonCreamDarkChocolateEnabled) {
            final Item MELONCREAMDARKCHOCOLATE = registerItem("melon_cream_dark_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONCREAMDARKCHOCOLATE));
        }

// Melon Cream Glazed Chocolate Donut

        if (CONFIG.isMelonCreamGlazedChocolateDonutEnabled) {
            final Item MELONCREAMGLAZEDCHOCOLATEDONUT = registerItem("melon_cream_glazed_chocolate_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONCREAMGLAZEDCHOCOLATEDONUT));
        }

// Melon Cream Glazed Donut

        if (CONFIG.isMelonCreamGlazedDonutEnabled) {
            final Item MELONCREAMGLAZEDDONUT = registerItem("melon_cream_glazed_donut", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONCREAMGLAZEDDONUT));
        }

// Melon Cream White Chocolate

        if (CONFIG.isMelonCreamWhiteChocolateEnabled) {
            final Item MELONCREAMWHITECHOCOLATE = registerItem("melon_cream_white_chocolate", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).snack().build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONCREAMWHITECHOCOLATE));
        }

// Melon Cream Filled Chocolate Pastry Bar

        if (CONFIG.isMelonCreamChocolatePastryBarEnabled) {
            final Item MELONCREAMCHOCOLATEPASTRYBAR = registerItem("melon_cream_chocolate_pastry_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.1f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONCREAMCHOCOLATEPASTRYBAR));
        }

// Melon Cream Filled Pastry Bar

        if (CONFIG.isMelonCreamPastryBarEnabled) {
            final Item MELONCREAMPASTRYBAR = registerItem("melon_cream_pastry_bar", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.1f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONCREAMPASTRYBAR));
        }

// Melon Cream Frosting Bottle

        if (CONFIG.isMelonCreamFrostingBottleEnabled) {
            final Item MELONCREAMFROSTINGBOTTLE = registerItem("melon_cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONCREAMFROSTINGBOTTLE));
        }

// Melon Cream Frosted Chocolate Sweet Roll

        if (CONFIG.isMelonCreamFrostedChocolateSweetRollEnabled) {
            final Item MELONCREAMFROSTEDCHOCOLATESWEETROLL = registerItem("melon_cream_frosted_chocolate_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONCREAMFROSTEDCHOCOLATESWEETROLL));
        }

// Melon Cream Frosted Cupcake

        if (CONFIG.isMelonCreamFrostedCupcakeEnabled) {
            final Item MELON_CREAM_FROSTED_CUPCAKE = registerItem("melon_cream_frosted_cupcake", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELON_CREAM_FROSTED_CUPCAKE));
        }

// Melon Cream Frosted Mini Waffle

        if (CONFIG.isMelonCreamFrostedMiniWaffleEnabled) {
            final Item MELON_CREAM_FROSTED_MINI_WAFFLE = registerItem("melon_cream_frosted_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.6f).snack().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELON_CREAM_FROSTED_MINI_WAFFLE));
        }

// Melon Cream Frosted Sweet Roll

        if (CONFIG.isMelonCreamFrostedSweetRollEnabled) {
            final Item MELONCREAMFROSTEDSWEETROLL = registerItem("melon_cream_frosted_sweet_roll", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONCREAMFROSTEDSWEETROLL));
        }

// Melon Ice Cream Bowl

        if (CONFIG.isMelonIceCreamBowlEnabled) {
            final Item MELONICECREAMBOWL = registerItem("melon_ice_cream_bowl", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.2f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONICECREAMBOWL));
        }

// Melon Ice Cream Cone

        if (CONFIG.isMelonIceCreamConeEnabled) {
            final Item MELON_ICE_CREAM_CONE = registerItem("melon_ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.1f).snack().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELON_ICE_CREAM_CONE));
        }

// Melon Ice Cream Stick

        if (CONFIG.isMelonIceCreamStickEnabled) {
            final Item MELON_ICE_CREAM_STICK = registerItem("melon_ice_cream_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1.1f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELON_ICE_CREAM_STICK));
        }

// Melon Jam

        if (CONFIG.isMelonJamBottleEnabled) {
            final Item MELONJAMBOTTLE = registerItem("melon_jam_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONJAMBOTTLE));
        }

// Melon Jam Sandwich

        if (CONFIG.isMelonJamSandwichEnabled) {
            final Item MELONJAMSANDWICH = registerItem("melon_jam_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONJAMSANDWICH));
        }

// Melon Milkshake

        if (CONFIG.isMelonMilkshakeBottleEnabled) {
            final Item MELONMILKSHAKEBOTTLE = registerItem("melon_milkshake_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(1.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELONMILKSHAKEBOTTLE));
        }

// Milkshake

        if (CONFIG.isMilkshakeBottleEnabled) {
            final Item MILKSHAKEBOTTLE = registerItem("milkshake_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MILKSHAKEBOTTLE));
        }

// Milk Powder

        if (CONFIG.isMilkPowderEnabled) {
            final Item MILKPOWDER = registerItem("milk_powder", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MILKPOWDER));
        }

// Minced Dragon

        if (CONFIG.isMincedDragonEnabled) {
            final Item MINCEDDRAGON = registerItem("minced_dragon", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MINCEDDRAGON));
        }

// Mini Chocolate Graham Cracker Pie Crust

        if (CONFIG.isMiniChocolateGrahamCrackerPieCrustEnabled) {
            final Item MINI_CHOCOLATE_GRAHAM_CRACKER_PIE_CRUST = registerItem("mini_chocolate_graham_cracker_pie_crust", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MINI_CHOCOLATE_GRAHAM_CRACKER_PIE_CRUST));
        }
// Mini Chocolate Pie (Graham Cracker)

        if (CONFIG.isMiniChocolatePieGrahamCrackerEnabled) {
            final Item MINI_CHOCOLATE_PIE_GRAHAM_CRACKER = registerItem("mini_chocolate_pie_graham_cracker", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MINI_CHOCOLATE_PIE_GRAHAM_CRACKER));
        }

// Mini Cookies & Cream Pie

        if (CONFIG.isMiniCookieCreamPieEnabled) {
            final Item MINI_COOKIE_CREAM_PIE = registerItem("mini_cookie_cream_pie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MINI_COOKIE_CREAM_PIE));
        }

// Mini Cream Pie (Chocolate Graham Cracker)

        if (CONFIG.isMiniCreamPieChocolateGrahamCrackerEnabled) {
            final Item MINI_CREAM_PIE_CHOCOLATE_GRAHAM_CRACKER = registerItem("mini_cream_pie_chocolate_graham_cracker", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MINI_CREAM_PIE_CHOCOLATE_GRAHAM_CRACKER));
        }

// Mini Cream Pie (Graham Cracker)

        if (CONFIG.isMiniCreamPieGrahamCrackerEnabled) {
            final Item MINI_CREAM_PIE_GRAHAM_CRACKER = registerItem("mini_cream_pie_graham_cracker", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MINI_CREAM_PIE_GRAHAM_CRACKER));
        }

// Mini Graham Cracker Pie Crust

        if (CONFIG.isMiniGrahamCrackerPieCrustEnabled) {
            final Item MINIGRAHAMCRACKERPIECRUST = registerItem("mini_graham_cracker_pie_crust", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MINIGRAHAMCRACKERPIECRUST));
        }

// Mini S'mores Pie

        if (CONFIG.isMiniSmoresPieEnabled) {
            final Item MINISMORESPIE = registerItem("mini_smores_pie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MINISMORESPIE));
        }

// Molasses

        if (CONFIG.isMolassesBottleEnabled) {
            final Item MOLASSESBOTTLE = registerItem("molasses_bottle", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MOLASSESBOTTLE));
        }

// Muffin Base

        if (CONFIG.isMuffinBaseEnabled) {
            final Item MUFFIN_BASE = registerItem("muffin_base", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MUFFIN_BASE));
        }

// Mushroom Calzone

        if (CONFIG.isMushroomCalzoneEnabled) {
            final Item MUSHROOM_CALZONE = registerItem("mushroom_calzone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MUSHROOM_CALZONE));
        }

// Mushroom Pizza & Slice

        if (CONFIG.isMushroomPizzaEnabled) {
            final Item MUSHROOMPIZZASLICE = registerItem("mushroom_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MUSHROOMPIZZASLICE));
            MUSHROOM_PIZZA = registerBlock("mushroom_pizza", new PizzaBlock(MUSHROOMPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MUSHROOM_PIZZA));
        }

// Mushroom & Bacon Pizza & Slice

        if (CONFIG.isMushroomBaconPizzaEnabled) {
            final Item MUSHROOMBACONPIZZASLICE = registerItem("mushroom_bacon_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MUSHROOMBACONPIZZASLICE));
            MUSHROOM_BACON_PIZZA = registerBlock("mushroom_bacon_pizza", new PizzaBlock(MUSHROOMBACONPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MUSHROOM_BACON_PIZZA));
        }

// Mushroom & Fish Pizza & Slice

        if (CONFIG.isMushroomFishPizzaEnabled) {
            final Item MUSHROOMFISHPIZZASLICE = registerItem("mushroom_fish_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MUSHROOMFISHPIZZASLICE));
            MUSHROOM_FISH_PIZZA = registerBlock("mushroom_fish_pizza", new PizzaBlock(MUSHROOMFISHPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MUSHROOM_FISH_PIZZA));
        }

// Mushroom & Onion Pizza & Slice

        if (CONFIG.isMushroomOnionPizzaEnabled) {
            final Item MUSHROOMONIONPIZZASLICE = registerItem("mushroom_onion_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MUSHROOMONIONPIZZASLICE));
            MUSHROOM_ONION_PIZZA = registerBlock("mushroom_onion_pizza", new PizzaBlock(MUSHROOMONIONPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MUSHROOM_ONION_PIZZA));
        }

// Mutton Sandwich

        if (CONFIG.isMuttonSandwichEnabled) {
            final Item MUTTONSANDWICH = registerItem("mutton_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MUTTONSANDWICH));
        }

// Mutton Sandwich (Beetroot)

        if (CONFIG.isMuttonSandwichBeetrootEnabled) {
            final Item MUTTONSANDWICHBEETROOT = registerItem("mutton_sandwich_beetroot", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MUTTONSANDWICHBEETROOT));
        }

// Nacho Bowl

        if (CONFIG.isNachoBowlEnabled) {
            final Item NACHOBOWL = registerItem("nacho_bowl", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(NACHOBOWL));
        }

// Onion Calzone

        if (CONFIG.isOnionCalzoneEnabled) {
            final Item ONION_CALZONE = registerItem("onion_calzone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ONION_CALZONE));
        }

// Onion Pizza & Slice

        if (CONFIG.isOnionPizzaEnabled) {
            final Item ONIONPIZZASLICE = registerItem("onion_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ONIONPIZZASLICE));
            ONION_PIZZA = registerBlock("onion_pizza", new PizzaBlock(ONIONPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ONION_PIZZA));
        }

// Onion & Bacon Pizza & Slice

        if (CONFIG.isOnionBaconPizzaEnabled) {
            final Item ONIONBACONPIZZASLICE = registerItem("onion_bacon_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ONIONBACONPIZZASLICE));
            ONION_BACON_PIZZA = registerBlock("onion_bacon_pizza", new PizzaBlock(ONIONBACONPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ONION_BACON_PIZZA));
        }

// Paprika

        if (CONFIG.isPaprikaEnabled) {
            final Item PAPRIKA = registerItem("paprika", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PAPRIKA));
        }

// Pasta

        if (CONFIG.isPastaEnabled) {
            final Item PASTA = registerItem("pasta", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTA));
        }

// Pasta Plate

        if (CONFIG.isPastaPlateEnabled) {
            final Item PASTAPLATE = registerItem("pasta_plate", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATE));
        }

// Pasta Plate (Butter)

        if (CONFIG.isPastaPlateButterEnabled) {
            final Item PASTAPLATEBUTTER = registerItem("pasta_plate_butter", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATEBUTTER));
        }

// Pasta Plate (Eggplant)

        if (CONFIG.isPastaPlateEggplantEnabled) {
            final Item PASTAPLATEEGGPLANT = registerItem("pasta_plate_eggplant", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATEEGGPLANT));
        }

// Pasta Plate (Endermite Meatballs)

        if (CONFIG.isPastaPlateEndermiteMeatballsEnabled) {
            final Item PASTAPLATEENDERMITEMEATBALLS = registerItem("pasta_plate_endermite_meatballs", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATEENDERMITEMEATBALLS));
        }

// Pasta Plate (Endermite Meatballs & Tomato Sauce)

        if (CONFIG.isPastaPlateEndermiteMeatballsTomatoSauceEnabled) {
            final Item PASTAPLATEENDERMITEMEATBALLSTOMATOSAUCE = registerItem("pasta_plate_endermite_meatballs_tomato_sauce", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATEENDERMITEMEATBALLSTOMATOSAUCE));
        }

// Pasta Plate (Fish)

        if (CONFIG.isPastaPlateFishEnabled) {
            final Item PASTAPLATEFISH = registerItem("pasta_plate_fish", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATEFISH));
        }

// Pasta Plate (Meatballs)

        if (CONFIG.isPastaPlateMeatballsEnabled) {
            final Item PASTAPLATEMEATBALLS = registerItem("pasta_plate_meatballs", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATEMEATBALLS));
        }

// Pasta Plate (Mutton Chop)

        if (CONFIG.isPastaPlateMuttonChopEnabled) {
            final Item PASTAPLATEMUTTONCHOP = registerItem("pasta_plate_mutton_chop", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATEMUTTONCHOP));
        }

// Pasta Plate (Slime)

        if (CONFIG.isPastaPlateSlimeEnabled) {
            final Item PASTAPLATESLIME = registerItem("pasta_plate_slime", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATESLIME));
        }

// Pasta Plate (Slimeballs)

        if (CONFIG.isPastaPlateSlimeballsEnabled) {
            final Item PASTAPLATESLIMEBALLS = registerItem("pasta_plate_slimeballs", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATESLIMEBALLS));
        }

// Pasta Plate (Strider Meatballs)

        if (CONFIG.isPastaPlateStriderMeatballsEnabled) {
            final Item PASTAPLATESTRIDERMEATBALLS = registerItem("pasta_plate_strider_meatballs", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATESTRIDERMEATBALLS));
        }

// Pasta Plate (Strider Meatballs & Tomato Sauce)

        if (CONFIG.isPastaPlateStriderMeatballsTomatoSauceEnabled) {
            final Item PASTAPLATESTRIDERMEATBALLSTOMATOSAUCE = registerItem("pasta_plate_strider_meatballs_tomato_sauce", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(12).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATESTRIDERMEATBALLSTOMATOSAUCE));
        }

// Pasta Plate (Tomato Sauce)

        if (CONFIG.isPastaPlateTomatoSauceEnabled) {
            final Item PASTAPLATETOMATOSAUCE = registerItem("pasta_plate_tomato_sauce", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATETOMATOSAUCE));
        }

// Pasta Plate (Squid Ink)

        if (CONFIG.isPastaPlateSquidInkEnabled) {
            final Item PASTAPLATESQUIDINK = registerItem("pasta_plate_squid_ink", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTAPLATESQUIDINK));
        }

// Pastry Bar Base

        if (CONFIG.isPastryBarBaseEnabled) {
            final Item PASTRYBARBASE = registerItem("pastry_bar_base", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTRYBARBASE));
        }

// Pastry Base

        if (CONFIG.isPastryBaseEnabled) {
            final Item PASTRYBASE = registerItem("pastry_base", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PASTRYBASE));
        }

// Peanut Butter & Apple Jam Sandwich

        if (CONFIG.isPeanutButterAppleJamSandwichEnabled) {
            final Item PEANUTBUTTERAPPLEJAMSANDWICH = registerItem("peanut_butter_apple_jam_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PEANUTBUTTERAPPLEJAMSANDWICH));
        }

// Peanut Butter & Chorus Fruit Jam Sandwich

        if (CONFIG.isPeanutButterChorusFruitJamSandwichEnabled) {
            final Item PEANUTBUTTERCHORUSFRUITJAMSANDWICH = registerItem("peanut_butter_chorus_fruit_jam_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(11).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PEANUTBUTTERCHORUSFRUITJAMSANDWICH));
        }

// Peanut Butter & Melon Jam Sandwich

        if (CONFIG.isPeanutButterMelonJamSandwichEnabled) {
            final Item PEANUTBUTTERMELONJAMSANDWICH = registerItem("peanut_butter_melon_jam_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PEANUTBUTTERMELONJAMSANDWICH));
        }

// Potato Chips

        if (CONFIG.isPotatoChipsEnabled) {
            final Item POTATOCHIPS = registerItem("potato_chips", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(POTATOCHIPS));
        }

// Potato Chip Bowl

        if (CONFIG.isPotatoChipBowlEnabled) {
            final Item POTATOCHIPBOWL = registerItem("potato_chip_bowl", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(POTATOCHIPBOWL));
        }

// Powdered Sugar

        if (CONFIG.isPowderedSugarEnabled) {
            final Item POWDEREDSUGAR = registerItem("powdered_sugar", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(POWDEREDSUGAR));
        }

// Pressed Cocoa

        if (CONFIG.isPressedCocoaEnabled) {
            final Item PRESSEDCOCOA = registerItem("pressed_cocoa", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PRESSEDCOCOA));
        }

// Pumpernickel Dough

        if (CONFIG.isPumpernickelDoughEnabled) {
            final Item PUMPERNICKELDOUGH = registerItem("pumpernickel_dough", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PUMPERNICKELDOUGH));
        }

// Pumpernickel Bread

        if (CONFIG.isPumpernickelBreadEnabled) {
            final Item PUMPERNICKELBREAD = registerItem("pumpernickel_bread", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.1f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PUMPERNICKELBREAD));
        }

// Pumpernickel Bread Slice

        if (CONFIG.isPumpernickelBreadSliceEnabled) {
            final Item PUMPERNICKELBREADSLICE = registerItem("pumpernickel_bread_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PUMPERNICKELBREADSLICE));
        }

// Pumpernickel Toast Slice

        if (CONFIG.isPumpernickelToastSliceEnabled) {
            final Item PUMPERNICKELTOASTSLICE = registerItem("pumpernickel_toast_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(1.3f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PUMPERNICKELTOASTSLICE));
        }

// Raw Bacon Calzone

        if (CONFIG.isRawBaconCalzoneEnabled) {
            final Item RAW_BACON_CALZONE = registerItem("raw_bacon_calzone", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_BACON_CALZONE));
        }

// Raw Butterscotch Chips Chocolate Cookie

        if (CONFIG.isRawButterscotchChipsChocolateCookieEnabled) {
            final Item RAWBUTTERSCOTCHCHIPSCHOCOLATECOOKIE = registerItem("raw_butterscotch_chips_chocolate_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWBUTTERSCOTCHCHIPSCHOCOLATECOOKIE));
        }

// Raw Butterscotch Chips Cookie

        if (CONFIG.isRawButterscotchChipsCookieEnabled) {
            final Item RAWBUTTERSCOTCHCHIPSCOOKIE = registerItem("raw_butterscotch_chips_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWBUTTERSCOTCHCHIPSCOOKIE));
        }

// Raw Butterscotch Chip Muffin

        if (CONFIG.isRawButterscotchChipMuffinEnabled) {
            final Item RAW_BUTTERSCOTCH_CHIP_MUFFIN = registerItem("raw_butterscotch_chip_muffin", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_BUTTERSCOTCH_CHIP_MUFFIN));
        }

// Raw Cake Base

        if (CONFIG.isRawCakeBaseEnabled) {
            final Item RAWCAKEBASE = registerItem("raw_cake_base", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCAKEBASE));
        }

// Raw Calzone

        if (CONFIG.isRawCalzoneEnabled) {
            final Item RAW_CALZONE = registerItem("raw_calzone", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CALZONE));
        }

// Raw Caramel Chips Chocolate Cookie

        if (CONFIG.isRawCaramelChipsChocolateCookieEnabled) {
            final Item RAWCARAMELCHIPSCHOCOLATECOOKIE = registerItem("raw_caramel_chips_chocolate_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCARAMELCHIPSCHOCOLATECOOKIE));
        }

// Raw Caramel Chips Cookie

        if (CONFIG.isRawCaramelChipsCookieEnabled) {
            final Item RAWCARAMELCHIPSCOOKIE = registerItem("raw_caramel_chips_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCARAMELCHIPSCOOKIE));
        }

// Raw Caramel Chip Muffin

        if (CONFIG.isRawCaramelChipMuffinEnabled) {
            final Item RAW_CARAMEL_CHIP_MUFFIN = registerItem("raw_caramel_chip_muffin", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CARAMEL_CHIP_MUFFIN));
        }

// Raw Chocolate Cookie

        if (CONFIG.isRawChocolateCookieEnabled) {
            final Item RAWCHOCOLATECOOKIE = registerItem("raw_chocolate_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCHOCOLATECOOKIE));
        }

// Raw Chocolate Chip Muffin

        if (CONFIG.isRawChocolateChipMuffinEnabled) {
            final Item RAW_CHOCOLATE_CHIP_MUFFIN = registerItem("raw_chocolate_chip_muffin", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CHOCOLATE_CHIP_MUFFIN));
        }

// Raw Chocolate Pastry Bar Base

        if (CONFIG.isRawChocolatePastryBarBaseEnabled) {
            final Item RAWCHOCOLATEPASTRYBARBASE = registerItem("raw_chocolate_pastry_bar_base", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCHOCOLATEPASTRYBARBASE));
        }

// Raw Chocolate Pastry Base

        if (CONFIG.isRawChocolatePastryBaseEnabled) {
            final Item RAWCHOCOLATEPASTRYBASE = registerItem("raw_chocolate_pastry_base", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCHOCOLATEPASTRYBASE));
        }

// Raw Chocolate Sweet Roll Base

        if (CONFIG.isRawChocolateSweetRollBaseEnabled) {
            final Item RAW_CHOCOLATE_SWEET_ROLL_BASE = registerItem("raw_chocolate_sweet_roll_base", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CHOCOLATE_SWEET_ROLL_BASE));
        }

// Raw Chorus Cookie

        if (CONFIG.isRawChorusCookieEnabled) {
            final Item RAWCHORUSCOOKIE = registerItem("raw_chorus_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCHORUSCOOKIE));
        }

// Raw Cheese Calzone

        if (CONFIG.isRawCheeseCalzoneEnabled) {
            final Item RAW_CHEESE_CALZONE = registerItem("raw_cheese_calzone", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CHEESE_CALZONE));
        }

// Raw Cinnamon Sweet Roll Base

        if (CONFIG.isRawCinnamonSweetRollBaseEnabled) {
            final Item RAWCINNAMONSWEETROLLBASE = registerItem("raw_cinnamon_sweet_roll_base", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCINNAMONSWEETROLLBASE));
        }

// Raw Cookie

        if (CONFIG.isRawCookieEnabled) {
            final Item RAWCOOKIE = registerItem("raw_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWCOOKIE));
        }

// Raw Cupcake

        if (CONFIG.isRawCupcakeEnabled) {
            final Item RAW_CUPCAKE = registerItem("raw_cupcake", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_CUPCAKE));
        }

// Raw Dark Chips Chocolate Cookie

        if (CONFIG.isRawDarkChipsChocolateCookieEnabled) {
            final Item RAWDARKCHIPSCHOCOLATECOOKIE = registerItem("raw_dark_chips_chocolate_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWDARKCHIPSCHOCOLATECOOKIE));
        }

// Raw Dark Chips Cookie

        if (CONFIG.isRawDarkChipsCookieEnabled) {
            final Item RAWDARKCHIPSCOOKIE = registerItem("raw_dark_chips_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWDARKCHIPSCOOKIE));
        }

// Raw Dark Chocolate Chip Muffin

        if (CONFIG.isRawDarkChocolateChipMuffinEnabled) {
            final Item RAW_DARK_CHOCOLATE_CHIP_MUFFIN = registerItem("raw_dark_chocolate_chip_muffin", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_DARK_CHOCOLATE_CHIP_MUFFIN));
        }

// Raw Endermite Meatball

        if (CONFIG.isRawEndermiteMeatballEnabled) {
            final Item RAWENDERMITEMEATBALL = registerItem("raw_endermite_meatball", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWENDERMITEMEATBALL));
        }

// Raw Flesh Cookie

        if (CONFIG.isRawFleshCookieEnabled) {
            final Item RAWFLESHCOOKIE = registerItem("raw_flesh_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWFLESHCOOKIE));
        }

// Raw Fish Calzone

        if (CONFIG.isRawFishCalzoneEnabled) {
            final Item RAW_FISH_CALZONE = registerItem("raw_fish_calzone", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_FISH_CALZONE));
        }

// Raw Ginger Cookie

        if (CONFIG.isRawGingerCookieEnabled) {
            final Item RAWGINGERCOOKIE = registerItem("raw_ginger_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWGINGERCOOKIE));
        }

// Raw Green Tea Cookie

        if (CONFIG.isRawGreenTeaCookieEnabled) {
            final Item RAWGREENTEACOOKIE = registerItem("raw_green_tea_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWGREENTEACOOKIE));
        }

// Raw Honey Cookie

        if (CONFIG.isRawHoneyCookieEnabled) {
            final Item RAWHONEYCOOKIE = registerItem("raw_honey_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWHONEYCOOKIE));
        }

// Raw Meatball

        if (CONFIG.isRawMeatballEnabled) {
            final Item RAWMEATBALL = registerItem("raw_meatball", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWMEATBALL));
        }

// Raw Mini Chocolate Graham Cracker Pie Crust

        if (CONFIG.isRawMiniChocolateGrahamCrackerPieCrustEnabled) {
            final Item RAW_MINI_CHOCOLATE_GRAHAM_CRACKER_PIE_CRUST = registerItem("raw_mini_chocolate_graham_cracker_pie_crust", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MINI_CHOCOLATE_GRAHAM_CRACKER_PIE_CRUST));
        }

// Raw Mini Chocolate Pie (Graham Cracker)

        if (CONFIG.isRawMiniChocolatePieGrahamCrackerEnabled) {
            final Item RAW_MINI_CHOCOLATE_PIE_GRAHAM_CRACKER = registerItem("raw_mini_chocolate_pie_graham_cracker", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MINI_CHOCOLATE_PIE_GRAHAM_CRACKER));
        }

// Raw Mini Cream Pie (Chocolate Graham Cracker)

        if (CONFIG.isRawMiniCreamPieChocolateGrahamCrackerEnabled) {
            final Item RAW_MINI_CREAM_PIE_CHOCOLATE_GRAHAM_CRACKER = registerItem("raw_mini_cream_pie_chocolate_graham_cracker", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MINI_CREAM_PIE_CHOCOLATE_GRAHAM_CRACKER));
        }

// Raw Mini Cream Pie (Graham Cracker)

        if (CONFIG.isRawMiniCreamPieGrahamCrackerEnabled) {
            final Item RAW_MINI_CREAM_PIE_GRAHAM_CRACKER = registerItem("raw_mini_cream_pie_graham_cracker", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MINI_CREAM_PIE_GRAHAM_CRACKER));
        }

// Raw Mini Graham Cracker Pie Crust

        if (CONFIG.isRawMiniGrahamCrackerPieCrustEnabled) {
            final Item RAW_MINI_GRAHAM_CRACKER_PIE_CRUST = registerItem("raw_mini_graham_cracker_pie_crust", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MINI_GRAHAM_CRACKER_PIE_CRUST));
        }

// Raw Muffin

        if (CONFIG.isRawMuffinEnabled) {
            final Item RAW_MUFFIN = registerItem("raw_muffin", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MUFFIN));
        }

// Raw Mushroom Calzone

        if (CONFIG.isRawMushroomCalzoneEnabled) {
            final Item RAW_MUSHROOM_CALZONE = registerItem("raw_mushroom_calzone", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_MUSHROOM_CALZONE));
        }

// Raw Onion Calzone

        if (CONFIG.isRawOnionCalzoneEnabled) {
            final Item RAW_ONION_CALZONE = registerItem("raw_onion_calzone", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_ONION_CALZONE));
        }

// Raw Pastry Bar Base

        if (CONFIG.isRawPastryBarBaseEnabled) {
            final Item RAWPASTRYBARBASE = registerItem("raw_pastry_bar_base", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWPASTRYBARBASE));
        }

// Raw Pastry Base

        if (CONFIG.isRawPastryBaseEnabled) {
            final Item RAWPASTRYBASE = registerItem("raw_pastry_base", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWPASTRYBASE));
        }

// Raw Sausage Calzone

        if (CONFIG.isRawSausageCalzoneEnabled) {
            final Item RAW_SAUSAGE_CALZONE = registerItem("raw_sausage_calzone", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_SAUSAGE_CALZONE));
        }

// Raw Sausage Patty

        if (CONFIG.isRawSausagePattyEnabled) {
            final Item RAWSAUSAGEPATTY = registerItem("raw_sausage_patty", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSAUSAGEPATTY));
        }

// Raw Snickerdoodle

        if (CONFIG.isRawSnickerdoodleEnabled) {
            final Item RAWSNICKERDOODLE = registerItem("raw_snickerdoodle", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSNICKERDOODLE));
        }

// Raw Soul Berry Cookie

        if (CONFIG.isRawSoulBerryCookieEnabled) {
            final Item RAWSOULBERRYCOOKIE = registerItem("raw_soul_berry_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSOULBERRYCOOKIE));
        }

// Raw Spider Eye Cookie

        if (CONFIG.isRawSpiderEyeCookieEnabled) {
            final Item RAWSPIDEREYECOOKIE = registerItem("raw_spider_eye_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSPIDEREYECOOKIE));
        }

// Raw Strider Meatball

        if (CONFIG.isRawStriderMeatballEnabled) {
            final Item RAWSTRIDERMEATBALL = registerItem("raw_strider_meatball", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSTRIDERMEATBALL));
        }
// Raw Sugar Cookie

        if (CONFIG.isRawSugarCookieEnabled) {
            final Item RAWSUGARCOOKIE = registerItem("raw_sugar_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSUGARCOOKIE));
        }

// Raw Sweet Berry Cookie

        if (CONFIG.isRawSweetBerryCookieEnabled) {
            final Item RAWSWEETBERRYCOOKIE = registerItem("raw_sweet_berry_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSWEETBERRYCOOKIE));
        }

// Raw Sweet Roll Base

        if (CONFIG.isRawSweetRollBaseEnabled) {
            final Item RAWSWEETROLLBASE = registerItem("raw_sweet_roll_base", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWSWEETROLLBASE));
        }

// Raw Toffee Chips Chocolate Cookie

        if (CONFIG.isRawToffeeChipsChocolateCookieEnabled) {
            final Item RAWTOFFEECHIPSCHOCOLATECOOKIE = registerItem("raw_toffee_chips_chocolate_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWTOFFEECHIPSCHOCOLATECOOKIE));
        }

// Raw Toffee Chips Cookie

        if (CONFIG.isRawToffeeChipsCookieEnabled) {
            final Item RAWTOFFEECHIPSCOOKIE = registerItem("raw_toffee_chips_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWTOFFEECHIPSCOOKIE));
        }

// Raw Toffee Chip Muffin

        if (CONFIG.isRawToffeeChipMuffinEnabled) {
            final Item RAW_TOFFEE_CHIP_MUFFIN = registerItem("raw_toffee_chip_muffin", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_TOFFEE_CHIP_MUFFIN));
        }

// Raw Ube Cookie

        if (CONFIG.isRawUbeCookieEnabled) {
            final Item RAWUBECOOKIE = registerItem("raw_ube_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWUBECOOKIE));
        }

// Raw Ube Cake Base

        if (CONFIG.isRawUbeCakeBaseEnabled) {
            final Item RAWUBECAKEBASE = registerItem("raw_ube_cake_base", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWUBECAKEBASE));
        }

// Raw White Chips Chocolate Cookie

        if (CONFIG.isRawWhiteChipsChocolateCookieEnabled) {
            final Item RAWWHITECHIPSCHOCOLATECOOKIE = registerItem("raw_white_chips_chocolate_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWWHITECHIPSCHOCOLATECOOKIE));
        }

// Raw White Chips Cookie

        if (CONFIG.isRawWhiteChipsCookieEnabled) {
            final Item RAWWHITECHIPSCOOKIE = registerItem("raw_white_chips_cookie", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAWWHITECHIPSCOOKIE));
        }

// Raw White Chocolate Chip Muffin

        if (CONFIG.isRawWhiteChocolateChipMuffinEnabled) {
            final Item RAW_WHITE_CHOCOLATE_CHIP_MUFFIN = registerItem("raw_white_chocolate_chip_muffin", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RAW_WHITE_CHOCOLATE_CHIP_MUFFIN));
        }

// S'more

        if (CONFIG.isSmoreEnabled) {
            final Item SMORE = registerItem("smore", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 6000, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SMORE));
        }

// S'mores Pie & Slice

        if (CONFIG.isSmoresPieEnabled) {
            final Item SMORESPIESLICE = registerItem("smores_pie_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1800, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SMORESPIESLICE));
            SMORES_PIE = registerBlock("smores_pie", new PieBlock(SMORESPIESLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SMORES_PIE));
        }

// Salt

        if (CONFIG.isSaltEnabled) {
            final Item SALT = registerItem("salt", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SALT));
        }

// Salt Dough

        if (CONFIG.isSaltDoughEnabled) {
            final Item SALTDOUGH = registerItem("salt_dough", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SALTDOUGH));
        }
// Salt Dough (Small)

        if (CONFIG.isSaltDoughSmallEnabled) {
            final Item SALT_DOUGH_SMALL = registerItem("salt_dough_small", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SALT_DOUGH_SMALL));
        }

// Sausage Biscuit

        if (CONFIG.isSausageBiscuitEnabled) {
            final Item SAUSAGEBISCUIT = registerItem("sausage_biscuit", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(14).saturationModifier(0.4f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEBISCUIT));
        }

// Sausage Biscuit Sandwich

        if (CONFIG.isSausageBiscuitSandwichEnabled) {
            final Item SAUSAGEBISCUITSANDWICH = registerItem("sausage_biscuit_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(19).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEBISCUITSANDWICH));
        }

// Sausage Calzone

        if (CONFIG.isSausageCalzoneEnabled) {
            final Item SAUSAGE_CALZONE = registerItem("sausage_calzone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGE_CALZONE));
        }

// Sausage Meat

        if (CONFIG.isSausageMeatEnabled) {
            final Item SAUSAGEMEAT = registerItem("sausage_meat", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEMEAT));
        }

// Sausage Patty

        if (CONFIG.isSausagePattyEnabled) {
            final Item SAUSAGEPATTY = registerItem("sausage_patty", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEPATTY));
        }

// Sausage Pizza & Slice

        if (CONFIG.isSausagePizzaEnabled) {
            final Item SAUSAGEPIZZASLICE = registerItem("sausage_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEPIZZASLICE));
            SAUSAGE_PIZZA = registerBlock("sausage_pizza", new PizzaBlock(SAUSAGEPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGE_PIZZA));
        }

// Sausage & Bacon Pizza & Slice

        if (CONFIG.isSausageBaconPizzaEnabled) {
            final Item SAUSAGEBACONPIZZASLICE = registerItem("sausage_bacon_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEBACONPIZZASLICE));
            SAUSAGE_BACON_PIZZA = registerBlock("sausage_bacon_pizza", new PizzaBlock(SAUSAGEBACONPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGE_BACON_PIZZA));
        }

// Sausage & Fish Pizza & Slice

        if (CONFIG.isSausageFishPizzaEnabled) {
            final Item SAUSAGEFISHPIZZASLICE = registerItem("sausage_fish_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEFISHPIZZASLICE));
            SAUSAGE_FISH_PIZZA = registerBlock("sausage_fish_pizza", new PizzaBlock(SAUSAGEFISHPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGE_FISH_PIZZA));
        }

// Sausage & Mushroom Pizza & Slice

        if (CONFIG.isSausageMushroomPizzaEnabled) {
            final Item SAUSAGEMUSHROOMPIZZASLICE = registerItem("sausage_mushroom_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEMUSHROOMPIZZASLICE));
            SAUSAGE_MUSHROOM_PIZZA = registerBlock("sausage_mushroom_pizza", new PizzaBlock(SAUSAGEMUSHROOMPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGE_MUSHROOM_PIZZA));
        }

// Sausage & Onion Pizza & Slice

        if (CONFIG.isSausageOnionPizzaEnabled) {
            final Item SAUSAGEONIONPIZZASLICE = registerItem("sausage_onion_pizza_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGEONIONPIZZASLICE));
            SAUSAGE_ONION_PIZZA = registerBlock("sausage_onion_pizza", new PizzaBlock(SAUSAGEONIONPIZZASLICE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SAUSAGE_ONION_PIZZA));
        }

// Shredded Chicken

        if (CONFIG.isShreddedChickenEnabled) {
            final Item SHREDDEDCHICKEN = registerItem("shredded_chicken", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SHREDDEDCHICKEN));
        }

// Shredded Potato

        if (CONFIG.isShreddedPotatoEnabled) {
            final Item SHREDDEDPOTATO = registerItem("shredded_potato", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SHREDDEDPOTATO));
        }

// Sliced Beetroot

        if (CONFIG.isSlicedBeetrootEnabled) {
            final Item SLICEDBEETROOT = registerItem("sliced_beetroot", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SLICEDBEETROOT));
        }

// Sliced Carrot
        if (CONFIG.isSlicedCarrotEnabled) {
            final Item SLICEDCARROT = registerItem("sliced_carrot", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SLICEDCARROT));
        }

// Sliced Potato

        if (CONFIG.isSlicedPotatoEnabled) {
            final Item SLICEDPOTATO = registerItem("sliced_potato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SLICEDPOTATO));
        }

// Sliced Tomato

        if (CONFIG.isSlicedTomatoEnabled) {
            final Item SLICEDTOMATO = registerItem("sliced_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SLICEDTOMATO));
        }

// Small Endermite Meatballs

        if (CONFIG.isSmallEndermiteMeatballsEnabled) {
            final Item SMALLENDERMITEMEATBALLS = registerItem("small_endermite_meatballs", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SMALLENDERMITEMEATBALLS));
        }

// Small Meatballs

        if (CONFIG.isSmallMeatballsEnabled) {
            final Item SMALLMEATBALLS = registerItem("small_meatballs", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SMALLMEATBALLS));
        }

// Small Slimeballs

        if (CONFIG.isSmallSlimeballsEnabled) {
            final Item SMALLSLIMEBALLS = registerItem("small_slimeballs", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), 1.0F).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SMALLSLIMEBALLS));
        }

// Small Strider Meatballs

        if (CONFIG.isSmallStriderMeatballsEnabled) {
            final Item SMALLSTRIDERMEATBALLS = registerItem("small_strider_meatballs", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SMALLSTRIDERMEATBALLS));
        }

// Smoked Corn Stick

        if (CONFIG.isSmokedCornStickEnabled) {
            final Item SMOKEDCORNSTICK = registerItem("smoked_corn_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SMOKEDCORNSTICK));
        }

// Sour Cream Bottle

        if (CONFIG.isSourCreamBottleEnabled) {
            final Item SOURCREAMBOTTLE = registerItem("sour_cream_bottle", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SOURCREAMBOTTLE));
        }

// Spicy Breakfast Sausages

        if (CONFIG.isSpicyBreakfastSausagesEnabled) {
            final Item SPICYBREAKFASTSAUSAGES = registerItem("spicy_breakfast_sausages", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SPICYBREAKFASTSAUSAGES));
        }

// Spicy Chicken Nuggets

        if (CONFIG.isSpicyChickenNuggetsEnabled) {
            final Item SPICYCHICKENNUGGETS = registerItem("spicy_chicken_nuggets", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.1f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SPICYCHICKENNUGGETS));
        }

// Strider Meatball

        if (CONFIG.isStriderMeatballEnabled) {
            final Item STRIDERMEATBALL = registerItem("strider_meatball", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(STRIDERMEATBALL));
        }

// Strider Meatball Sandwich

        if (CONFIG.isStriderMeatballSandwichEnabled) {
            final Item STRIDERMEATBALLSANDWICH = registerItem("strider_meatball_sandwich", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(10).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(STRIDERMEATBALLSANDWICH));
        }

// Strider Meatball Stick

        if (CONFIG.isStriderMeatballStickEnabled) {
            final Item STRIDERMEATBALLSTICK1 = registerItem("strider_meatball_stick_1", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(STRIDERMEATBALLSTICK1));
        }
        if (CONFIG.isStriderMeatballStickEnabled) {
            final Item STRIDERMEATBALLSTICK2 = registerItem("strider_meatball_stick_2", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(STRIDERMEATBALLSTICK2));
        }
        if (CONFIG.isStriderMeatballStickEnabled) {
            final Item STRIDERMEATBALLSTICK3 = registerItem("strider_meatball_stick_3", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(STRIDERMEATBALLSTICK3));
        }

// Sugar Dough

        if (CONFIG.isSugarDoughEnabled) {
            final Item SUGARDOUGH = registerItem("sugar_dough", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SUGARDOUGH));
        }

// Sugar Dough (Small)

        if (CONFIG.isSugarDoughSmallEnabled) {
            final Item SUGAR_DOUGH_SMALL = registerItem("sugar_dough_small", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SUGAR_DOUGH_SMALL));
        }

// Sweet Roll Base

        if (CONFIG.isSweetRollBaseEnabled) {
            final Item SWEETROLLBASE = registerItem("sweet_roll_base", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SWEETROLLBASE));
        }

// Toast & Fried Egg Plate

        if (CONFIG.isToastAndFriedEggPlateEnabled) {
            final Item TOASTFRIEDEGGPLATE = registerItem("toast_fried_egg_plate", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOASTFRIEDEGGPLATE));
        }

// Toast Plate

        if (CONFIG.isToastPlateEnabled) {
            final Item TOASTPLATE = registerItem("toast_plate", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOASTPLATE));
        }

// Toast Slice

        if (CONFIG.isToastSliceEnabled) {
            final Item TOASTSLICE = registerItem("toast_slice", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOASTSLICE));
        }

// Toffee

        if (CONFIG.isToffeeEnabled) {
            final Item TOFFEE = registerItem("toffee", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1.8f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOFFEE));
        }

// Toffee Chips

        if (CONFIG.isToffeeChipsEnabled) {
            final Item TOFFEECHIPS = registerItem("toffee_chips", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOFFEECHIPS));
        }

// Toffee Chips Chocolate Cookie

        if (CONFIG.isToffeeChipsChocolateCookieEnabled) {
            final Item TOFFEECHIPSCHOCOLATECOOKIE = registerItem("toffee_chips_chocolate_cookie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOFFEECHIPSCHOCOLATECOOKIE));
        }

// Toffee Chips Cookie

        if (CONFIG.isToffeeChipsCookieEnabled) {
            final Item TOFFEECHIPSCOOKIE = registerItem("toffee_chips_cookie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOFFEECHIPSCOOKIE));
        }

// Toffee Chip Ice Cream Cone

        if (CONFIG.isToffeeChipIceCreamConeEnabled) {
            final Item TOFFEE_CHIP_ICE_CREAM_CONE = registerItem("toffee_chip_ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).snack().statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOFFEE_CHIP_ICE_CREAM_CONE));
        }

// Toffee Chip Milkshake

        if (CONFIG.isToffeeChipMilkshakeBottleEnabled) {
            final Item TOFFEECHIPMILKSHAKEBOTTLE = registerItem("toffee_chip_milkshake_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOFFEECHIPMILKSHAKEBOTTLE));
        }

// Toffee Chip Muffin

        if (CONFIG.isToffeeChipMuffinEnabled) {
            final Item TOFFEE_CHIP_MUFFIN = registerItem("toffee_chip_muffin", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOFFEE_CHIP_MUFFIN));
        }

// Toffee Chip Waffle & Mini Waffle

        if (CONFIG.isToffeeChipWaffleBlockEnabled) {
            final Item TOFFEE_CHIP_MINI_WAFFLE = registerItem("toffee_chip_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.7f).snack().statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOFFEE_CHIP_MINI_WAFFLE));
            TOFFEE_CHIP_WAFFLE = registerBlock("toffee_chip_waffle", new WaffleBlock(TOFFEE_CHIP_MINI_WAFFLE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOFFEE_CHIP_WAFFLE));
        }

// Toffee Fudge

        if (CONFIG.isToffeeFudgeEnabled) {
            final Item TOFFEEFUDGE = registerItem("toffee_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOFFEEFUDGE));
        }

// Tortilla Chip Bowl

        if (CONFIG.isTortillaChipBowlEnabled) {
            final Item TORTILLACHIPBOWL = registerItem("tortilla_chip_bowl", new BowlFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TORTILLACHIPBOWL));
        }

// Ube Cream Frosting Bottle

        if (CONFIG.isUbeCreamFrostingBottleEnabled) {
            final Item UBECREAMFROSTINGBOTTLE = registerItem("ube_cream_frosting_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(UBECREAMFROSTINGBOTTLE));
        }

// Ube Sugar Dough

        if (CONFIG.isUbeSugarDoughEnabled) {
            final Item UBESUGARDOUGH = registerItem("ube_sugar_dough", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(UBESUGARDOUGH));
        }

// Unbreaded Chicken Patty

        if (CONFIG.isUnbreadedChickenPattyEnabled) {
            final Item UNBREADEDCHICKENPATTY = registerItem("unbreaded_chicken_patty", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(UNBREADEDCHICKENPATTY));
        }

// Vegetable Sandwich (Beetroot, Lettuce)

        if (CONFIG.isVegetableSandwichBeetrootLettuceEnabled) {
            final Item VEGETABLESANDWICHBEETROOTLETTUCE = registerItem("vegetable_sandwich_beetroot_lettuce", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(VEGETABLESANDWICHBEETROOTLETTUCE));
        }

// Vegetable Sandwich (Tomato, Lettuce)

        if (CONFIG.isVegetableSandwichLettuceTomatoEnabled) {
            final Item VEGETABLESANDWICHLETTUCETOMATO = registerItem("vegetable_sandwich_lettuce_tomato", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(VEGETABLESANDWICHLETTUCETOMATO));
        }

// Vinegar Bottle

        if (CONFIG.isVinegarBottleEnabled) {
            final Item VINEGAR_BOTTLE = registerItem("vinegar_bottle", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(VINEGAR_BOTTLE));
        }

// Waffle & Mini Waffle

        if (CONFIG.isWaffleBlockEnabled) {
            final Item MINI_WAFFLE = registerItem("mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MINI_WAFFLE));
            WAFFLE = registerBlock("waffle", new WaffleBlock(MINI_WAFFLE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WAFFLE));
        }

// Waffle Cone

        if (CONFIG.isWaffleConeEnabled) {
            final Item WAFFLE_CONE = registerItem("waffle_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WAFFLE_CONE));
        }

// White Chips Chocolate Cookie

        if (CONFIG.isWhiteChipsChocolateCookieEnabled) {
            final Item WHITECHIPSCHOCOLATECOOKIE = registerItem("white_chips_chocolate_cookie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHIPSCHOCOLATECOOKIE));
        }

// White Chips Cookie

        if (CONFIG.isWhiteChipsCookieEnabled) {
            final Item WHITECHIPSCOOKIE = registerItem("white_chips_cookie", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHIPSCOOKIE));
        }

// White Chocolate Bottle

        if (CONFIG.isWhiteChocolateBottleEnabled) {
            final Item WHITECHOCOLATEBOTTLE = registerItem("white_chocolate_bottle", new BottleDrink(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build()).maxCount(64)));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATEBOTTLE));
        }

// White Chocolate Chips

        if (CONFIG.isWhiteChocolateChipsEnabled) {
            final Item WHITECHOCOLATECHIPS = registerItem("white_chocolate_chips", new ConsumableItem(new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATECHIPS));
        }

// White Chocolate Chip Ice Cream Cone

        if (CONFIG.isWhiteChocolateChipIceCreamConeEnabled) {
            final Item WHITE_CHOCOLATE_CHIP_ICE_CREAM_CONE = registerItem("white_chocolate_chip_ice_cream_cone", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).snack().statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 600, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITE_CHOCOLATE_CHIP_ICE_CREAM_CONE));
        }

// White Chocolate Chip Muffin

        if (CONFIG.isWhiteChocolateChipMuffinEnabled) {
            final Item WHITE_CHOCOLATE_CHIP_MUFFIN = registerItem("white_chocolate_chip_muffin", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITE_CHOCOLATE_CHIP_MUFFIN));
        }

// White Chocolate Chip Waffle & Mini Waffle

        if (CONFIG.isWhiteChocolateChipWaffleBlockEnabled) {
            final Item WHITE_CHOCOLATE_CHIP_MINI_WAFFLE = registerItem("white_chocolate_chip_mini_waffle", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1.7f).snack().statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 1200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITE_CHOCOLATE_CHIP_MINI_WAFFLE));
            WHITE_CHOCOLATE_CHIP_WAFFLE = registerBlock("white_chocolate_chip_waffle", new WaffleBlock(WHITE_CHOCOLATE_CHIP_MINI_WAFFLE));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITE_CHOCOLATE_CHIP_WAFFLE));
        }

// White Chocolate Covered Marshmallow Stick

        if (CONFIG.isWhiteChocolateCoveredMarshmallowStickEnabled) {
            final Item WHITECHOCOLATECOVEREDMARSHMALLOWSTICK = registerItem("white_chocolate_covered_marshmallow_stick", new StickFood(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).snack().build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATECOVEREDMARSHMALLOWSTICK));
        }

// White Chocolate Filled Chocolate Pastry

        if (CONFIG.isWhiteChocolateChocolatePastryEnabled) {
            final Item WHITECHOCOLATECHOCOLATEPASTRY = registerItem("white_chocolate_chocolate_pastry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATECHOCOLATEPASTRY));
        }

// White Chocolate Filled Pastry

        if (CONFIG.isWhiteChocolatePastryEnabled) {
            final Item WHITECHOCOLATEPASTRY = registerItem("white_chocolate_pastry", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATEPASTRY));
        }

// White Chocolate Fudge

        if (CONFIG.isWhiteChocolateFudgeEnabled) {
            final Item WHITECHOCOLATEFUDGE = registerItem("white_chocolate_fudge", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATEFUDGE));
        }

// White Chocolate Glazed Apple

        if (CONFIG.isWhiteChocolateGlazedAppleEnabled) {
            final Item WHITECHOCOLATEGLAZEDAPPLE = registerItem("white_chocolate_glazed_apple", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATEGLAZEDAPPLE));
        }

// White Chocolate Glazed Berries

        if (CONFIG.isWhiteChocolateGlazedBerriesEnabled) {
            final Item WHITECHOCOLATEGLAZEDBERRIES = registerItem("white_chocolate_glazed_berries", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 1200, 0),1.0f).build()), true));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATEGLAZEDBERRIES));
        }

// White Chocolate Toast

        if (CONFIG.isWhiteChocolateToastEnabled) {
            final Item WHITECHOCOLATETOAST = registerItem("white_chocolate_toast", new ConsumableItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITECHOCOLATETOAST));
        }

// Yoghurt

        if (CONFIG.isYogurtBottleEnabled) {
            final Item YOGURTBOTTLE = registerItem("yogurt_bottle", new BottleDrink(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.9f).build())));
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(YOGURTBOTTLE));
        }

    }
}
