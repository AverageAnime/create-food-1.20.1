package net.averageanime.createfood.fluid;

import net.averageanime.createfood.CreateFood;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.averageanime.createfood.CreateFood.CONFIG;

public class ModFluids {
    public static FlowableFluid STILL_WAFFLE_BATTER,STILL_CREAM_PIE_FILLING,STILL_GLOW_BERRY_PIE_FILLING,STILL_CHORUS_FRUIT_PIE_FILLING,STILL_BERRY_PIE_FILLING,STILL_APPLE_PIE_FILLING,STILL_CHEESECAKE_FILLING,STILL_CREAM_CHEESE,STILL_VINEGAR,STILL_SOUR_CREAM,STILL_CREAM_FROSTING,STILL_CARAMEL,STILL_BERRY_CREAM_FROSTING, STILL_HOT_CHOCOLATE, STILL_CACAO_MASS,STILL_CACAO_BUTTER, STILL_WHITE_CHOCOLATE, STILL_DARK_CHOCOLATE, STILL_HOT_DARK_CHOCOLATE, STILL_HOT_WHITE_CHOCOLATE,STILL_CHOCOLATE_CREAM_FROSTING,STILL_CHOCOLATE_MILK,STILL_GLOW_BERRY_CREAM_FROSTING,STILL_CHORUS_FRUIT_CREAM_FROSTING, STILL_GELATIN_MIX,STILL_RED_GELATIN_MIX,STILL_BLACK_GELATIN_MIX,STILL_BLUE_GELATIN_MIX,STILL_BROWN_GELATIN_MIX,STILL_CYAN_GELATIN_MIX,STILL_GRAY_GELATIN_MIX,STILL_GREEN_GELATIN_MIX,STILL_LIGHT_BLUE_GELATIN_MIX,STILL_LIGHT_GRAY_GELATIN_MIX,STILL_LIME_GELATIN_MIX,STILL_MAGENTA_GELATIN_MIX,STILL_ORANGE_GELATIN_MIX,STILL_PINK_GELATIN_MIX,STILL_PURPLE_GELATIN_MIX,STILL_YELLOW_GELATIN_MIX,STILL_VEGETABLE_OIL,STILL_SUGAR_CANE_JUICE,STILL_CANE_SYRUP,STILL_MOLASSES,STILL_BLACKSTRAP_MOLASSES,STILL_TOFFEE,STILL_BUTTERSCOTCH,STILL_CONDENSED_MILK,STILL_APPLE_CREAM_FROSTING,STILL_BUTTERSCOTCH_FUDGE,STILL_CARAMEL_FUDGE,STILL_TOFFEE_FUDGE,STILL_CHOCOLATE_FUDGE,STILL_DARK_CHOCOLATE_FUDGE,STILL_WHITE_CHOCOLATE_FUDGE,STILL_SLIME,STILL_HEAVY_CREAM,STILL_ICE_CREAM,STILL_MILKSHAKE,STILL_CHOCOLATE_MILKSHAKE,STILL_CHOCOLATE_ICE_CREAM,STILL_APPLE_MILKSHAKE,STILL_APPLE_ICE_CREAM,STILL_BERRY_MILKSHAKE,STILL_BERRY_ICE_CREAM,STILL_GLOW_BERRY_MILKSHAKE,STILL_GLOW_BERRY_ICE_CREAM,STILL_CHORUS_FRUIT_MILKSHAKE,STILL_CHORUS_FRUIT_ICE_CREAM,STILL_COFFEE_TOFFEE,STILL_COFFEE_TOFFEE_FUDGE,STILL_UBE_CREAM_FROSTING,STILL_APPLE_JAM,STILL_BERRY_JAM,STILL_CHORUS_FRUIT_JAM,STILL_GLOW_BERRY_JAM,STILL_APPLE_JUICE,STILL_BERRY_JUICE,STILL_CHORUS_FRUIT_JUICE,STILL_GLOW_BERRY_JUICE,STILL_MELON_CREAM_FROSTING,STILL_MELON_MILKSHAKE,STILL_MELON_ICE_CREAM,STILL_MELON_JAM,STILL_SQUID_INK,STILL_FRUIT_SMOOTHIE,STILL_YOGURT;
    public static FlowableFluid FLOWING_WAFFLE_BATTER,FLOWING_CREAM_PIE_FILLING,FLOWING_GLOW_BERRY_PIE_FILLING,FLOWING_CHORUS_FRUIT_PIE_FILLING,FLOWING_BERRY_PIE_FILLING,FLOWING_APPLE_PIE_FILLING,FLOWING_CHEESECAKE_FILLING,FLOWING_CREAM_CHEESE,FLOWING_VINEGAR,FLOWING_SOUR_CREAM,FLOWING_CREAM_FROSTING,FLOWING_CARAMEL,FLOWING_BERRY_CREAM_FROSTING, FLOWING_HOT_CHOCOLATE, FLOWING_CACAO_MASS,FLOWING_CACAO_BUTTER, FLOWING_WHITE_CHOCOLATE, FLOWING_DARK_CHOCOLATE, FLOWING_HOT_DARK_CHOCOLATE, FLOWING_HOT_WHITE_CHOCOLATE,FLOWING_CHOCOLATE_CREAM_FROSTING,FLOWING_CHOCOLATE_MILK,FLOWING_GLOW_BERRY_CREAM_FROSTING,FLOWING_CHORUS_FRUIT_CREAM_FROSTING, FLOWING_GELATIN_MIX,FLOWING_RED_GELATIN_MIX,FLOWING_BLACK_GELATIN_MIX,FLOWING_BLUE_GELATIN_MIX,FLOWING_BROWN_GELATIN_MIX,FLOWING_CYAN_GELATIN_MIX,FLOWING_GRAY_GELATIN_MIX,FLOWING_GREEN_GELATIN_MIX,FLOWING_LIGHT_BLUE_GELATIN_MIX,FLOWING_LIGHT_GRAY_GELATIN_MIX,FLOWING_LIME_GELATIN_MIX,FLOWING_MAGENTA_GELATIN_MIX,FLOWING_ORANGE_GELATIN_MIX,FLOWING_PINK_GELATIN_MIX,FLOWING_PURPLE_GELATIN_MIX,FLOWING_YELLOW_GELATIN_MIX,FLOWING_VEGETABLE_OIL,FLOWING_SUGAR_CANE_JUICE,FLOWING_CANE_SYRUP,FLOWING_MOLASSES,FLOWING_BLACKSTRAP_MOLASSES,FLOWING_TOFFEE,FLOWING_BUTTERSCOTCH,FLOWING_CONDENSED_MILK,FLOWING_APPLE_CREAM_FROSTING,FLOWING_BUTTERSCOTCH_FUDGE,FLOWING_CARAMEL_FUDGE,FLOWING_TOFFEE_FUDGE,FLOWING_CHOCOLATE_FUDGE,FLOWING_DARK_CHOCOLATE_FUDGE,FLOWING_WHITE_CHOCOLATE_FUDGE,FLOWING_SLIME,FLOWING_HEAVY_CREAM,FLOWING_ICE_CREAM,FLOWING_MILKSHAKE,FLOWING_CHOCOLATE_MILKSHAKE,FLOWING_CHOCOLATE_ICE_CREAM,FLOWING_APPLE_MILKSHAKE,FLOWING_APPLE_ICE_CREAM,FLOWING_BERRY_MILKSHAKE,FLOWING_BERRY_ICE_CREAM,FLOWING_GLOW_BERRY_MILKSHAKE,FLOWING_GLOW_BERRY_ICE_CREAM,FLOWING_CHORUS_FRUIT_MILKSHAKE,FLOWING_CHORUS_FRUIT_ICE_CREAM,FLOWING_COFFEE_TOFFEE,FLOWING_COFFEE_TOFFEE_FUDGE,FLOWING_UBE_CREAM_FROSTING,FLOWING_APPLE_JAM,FLOWING_BERRY_JAM,FLOWING_CHORUS_FRUIT_JAM,FLOWING_GLOW_BERRY_JAM,FLOWING_APPLE_JUICE,FLOWING_BERRY_JUICE,FLOWING_CHORUS_FRUIT_JUICE,FLOWING_GLOW_BERRY_JUICE,FLOWING_MELON_CREAM_FROSTING,FLOWING_MELON_MILKSHAKE,FLOWING_MELON_ICE_CREAM,FLOWING_MELON_JAM,FLOWING_SQUID_INK,FLOWING_FRUIT_SMOOTHIE,FLOWING_YOGURT;
    public static Block WAFFLE_BATTER_BLOCK,CREAM_PIE_FILLING_BLOCK,GLOW_BERRY_PIE_FILLING_BLOCK,CHORUS_FRUIT_PIE_FILLING_BLOCK,BERRY_PIE_FILLING_BLOCK,APPLE_PIE_FILLING_BLOCK,CHEESECAKE_FILLING_BLOCK,CREAM_CHEESE_BLOCK,VINEGAR_BLOCK,SOUR_CREAM_BLOCK,CREAM_FROSTING_BLOCK,CARAMEL_BLOCK,BERRY_CREAM_FROSTING_BLOCK, HOT_CHOCOLATE_BLOCK, CACAO_MASS_BLOCK,CACAO_BUTTER_BLOCK, WHITE_CHOCOLATE_BLOCK, DARK_CHOCOLATE_BLOCK, HOT_DARK_CHOCOLATE_BLOCK, HOT_WHITE_CHOCOLATE_BLOCK,CHOCOLATE_CREAM_FROSTING_BLOCK,CHOCOLATE_MILK_BLOCK,GLOW_BERRY_CREAM_FROSTING_BLOCK,CHORUS_FRUIT_CREAM_FROSTING_BLOCK, GELATIN_MIX_BLOCK,RED_GELATIN_MIX_BLOCK,BLACK_GELATIN_MIX_BLOCK,BLUE_GELATIN_MIX_BLOCK,BROWN_GELATIN_MIX_BLOCK,CYAN_GELATIN_MIX_BLOCK,GRAY_GELATIN_MIX_BLOCK,GREEN_GELATIN_MIX_BLOCK,LIGHT_BLUE_GELATIN_MIX_BLOCK,LIGHT_GRAY_GELATIN_MIX_BLOCK,LIME_GELATIN_MIX_BLOCK,MAGENTA_GELATIN_MIX_BLOCK,ORANGE_GELATIN_MIX_BLOCK,PINK_GELATIN_MIX_BLOCK,PURPLE_GELATIN_MIX_BLOCK,YELLOW_GELATIN_MIX_BLOCK,VEGETABLE_OIL_BLOCK,SUGAR_CANE_JUICE_BLOCK,CANE_SYRUP_BLOCK,MOLASSES_BLOCK,BLACKSTRAP_MOLASSES_BLOCK,TOFFEE_BLOCK,BUTTERSCOTCH_BLOCK,CONDENSED_MILK_BLOCK,APPLE_CREAM_FROSTING_BLOCK,BUTTERSCOTCH_FUDGE_BLOCK,CARAMEL_FUDGE_BLOCK,TOFFEE_FUDGE_BLOCK,CHOCOLATE_FUDGE_BLOCK,DARK_CHOCOLATE_FUDGE_BLOCK,WHITE_CHOCOLATE_FUDGE_BLOCK,SLIME_BLOCK,HEAVY_CREAM_BLOCK,ICE_CREAM_BLOCK,MILKSHAKE_BLOCK,CHOCOLATE_MILKSHAKE_BLOCK,CHOCOLATE_ICE_CREAM_BLOCK,APPLE_MILKSHAKE_BLOCK,APPLE_ICE_CREAM_BLOCK,BERRY_MILKSHAKE_BLOCK,BERRY_ICE_CREAM_BLOCK,GLOW_BERRY_MILKSHAKE_BLOCK,GLOW_BERRY_ICE_CREAM_BLOCK,CHORUS_FRUIT_MILKSHAKE_BLOCK,CHORUS_FRUIT_ICE_CREAM_BLOCK,COFFEE_TOFFEE_BLOCK,COFFEE_TOFFEE_FUDGE_BLOCK,UBE_CREAM_FROSTING_BLOCK,APPLE_JAM_BLOCK,BERRY_JAM_BLOCK,CHORUS_FRUIT_JAM_BLOCK,GLOW_BERRY_JAM_BLOCK,APPLE_JUICE_BLOCK,BERRY_JUICE_BLOCK,CHORUS_FRUIT_JUICE_BLOCK,GLOW_BERRY_JUICE_BLOCK,MELON_CREAM_FROSTING_BLOCK,MELON_MILKSHAKE_BLOCK,MELON_ICE_CREAM_BLOCK,MELON_JAM_BLOCK,SQUID_INK_BLOCK,FRUIT_SMOOTHIE_BLOCK,YOGURT_BLOCK;
    public static Item WAFFLE_BATTER_BUCKET,CREAM_PIE_FILLING_BUCKET,GLOW_BERRY_PIE_FILLING_BUCKET,CHORUS_FRUIT_PIE_FILLING_BUCKET,BERRY_PIE_FILLING_BUCKET,APPLE_PIE_FILLING_BUCKET,CHEESECAKE_FILLING_BUCKET,CREAM_CHEESE_BUCKET,VINEGAR_BUCKET,SOUR_CREAM_BUCKET,CREAM_FROSTING_BUCKET,CARAMEL_BUCKET,BERRY_CREAM_FROSTING_BUCKET, HOT_CHOCOLATE_BUCKET, CACAO_MASS_BUCKET, CACAO_BUTTER_BUCKET, WHITE_CHOCOLATE_BUCKET, DARK_CHOCOLATE_BUCKET, HOT_DARK_CHOCOLATE_BUCKET, HOT_WHITE_CHOCOLATE_BUCKET,CHOCOLATE_CREAM_FROSTING_BUCKET,CHOCOLATE_MILK_BUCKET,GLOW_BERRY_CREAM_FROSTING_BUCKET,CHORUS_FRUIT_CREAM_FROSTING_BUCKET, GELATIN_MIX_BUCKET,RED_GELATIN_MIX_BUCKET,BLACK_GELATIN_MIX_BUCKET,BLUE_GELATIN_MIX_BUCKET,BROWN_GELATIN_MIX_BUCKET,CYAN_GELATIN_MIX_BUCKET,GRAY_GELATIN_MIX_BUCKET,GREEN_GELATIN_MIX_BUCKET,LIGHT_BLUE_GELATIN_MIX_BUCKET,LIGHT_GRAY_GELATIN_MIX_BUCKET,LIME_GELATIN_MIX_BUCKET,MAGENTA_GELATIN_MIX_BUCKET,ORANGE_GELATIN_MIX_BUCKET,PINK_GELATIN_MIX_BUCKET,PURPLE_GELATIN_MIX_BUCKET,YELLOW_GELATIN_MIX_BUCKET,VEGETABLE_OIL_BUCKET,SUGAR_CANE_JUICE_BUCKET,CANE_SYRUP_BUCKET,MOLASSES_BUCKET,BLACKSTRAP_MOLASSES_BUCKET,TOFFEE_BUCKET,BUTTERSCOTCH_BUCKET,CONDENSED_MILK_BUCKET,APPLE_CREAM_FROSTING_BUCKET,BUTTERSCOTCH_FUDGE_BUCKET,CARAMEL_FUDGE_BUCKET,TOFFEE_FUDGE_BUCKET,CHOCOLATE_FUDGE_BUCKET,DARK_CHOCOLATE_FUDGE_BUCKET,WHITE_CHOCOLATE_FUDGE_BUCKET,SLIME_BUCKET,HEAVY_CREAM_BUCKET,ICE_CREAM_BUCKET,MILKSHAKE_BUCKET,CHOCOLATE_MILKSHAKE_BUCKET,CHOCOLATE_ICE_CREAM_BUCKET,APPLE_MILKSHAKE_BUCKET,APPLE_ICE_CREAM_BUCKET,BERRY_MILKSHAKE_BUCKET,BERRY_ICE_CREAM_BUCKET,CHORUS_FRUIT_MILKSHAKE_BUCKET,CHORUS_FRUIT_ICE_CREAM_BUCKET,GLOW_BERRY_MILKSHAKE_BUCKET,GLOW_BERRY_ICE_CREAM_BUCKET,COFFEE_TOFFEE_BUCKET,COFFEE_TOFFEE_FUDGE_BUCKET,UBE_CREAM_FROSTING_BUCKET,APPLE_JAM_BUCKET,BERRY_JAM_BUCKET,CHORUS_FRUIT_JAM_BUCKET,GLOW_BERRY_JAM_BUCKET,APPLE_JUICE_BUCKET,BERRY_JUICE_BUCKET,CHORUS_FRUIT_JUICE_BUCKET,GLOW_BERRY_JUICE_BUCKET,MELON_CREAM_FROSTING_BUCKET,MELON_MILKSHAKE_BUCKET,MELON_ICE_CREAM_BUCKET,MELON_JAM_BUCKET,SQUID_INK_BUCKET,FRUIT_SMOOTHIE_BUCKET,YOGURT_BUCKET;

    public static boolean isWaffleBatter(FluidState state) {
        return state.isOf(ModFluids.STILL_WAFFLE_BATTER) || state.isOf(ModFluids.FLOWING_WAFFLE_BATTER);
    }
    public static boolean isCreamPieFilling(FluidState state) {
        return state.isOf(ModFluids.STILL_CREAM_PIE_FILLING) || state.isOf(ModFluids.FLOWING_CREAM_PIE_FILLING);
    }
    public static boolean isGlowBerryPieFilling(FluidState state) {
        return state.isOf(ModFluids.STILL_GLOW_BERRY_PIE_FILLING) || state.isOf(ModFluids.FLOWING_GLOW_BERRY_PIE_FILLING);
    }
    public static boolean isChorusFruitPieFilling(FluidState state) {
        return state.isOf(ModFluids.STILL_CHORUS_FRUIT_PIE_FILLING) || state.isOf(ModFluids.FLOWING_CHORUS_FRUIT_PIE_FILLING);
    }
    public static boolean isBerryPieFilling(FluidState state) {
        return state.isOf(ModFluids.STILL_BERRY_PIE_FILLING) || state.isOf(ModFluids.FLOWING_BERRY_PIE_FILLING);
    }
    public static boolean isApplePieFilling(FluidState state) {
        return state.isOf(ModFluids.STILL_APPLE_PIE_FILLING) || state.isOf(ModFluids.FLOWING_APPLE_PIE_FILLING);
    }
    public static boolean isCheesecakeFilling(FluidState state) {
        return state.isOf(ModFluids.STILL_CHEESECAKE_FILLING) || state.isOf(ModFluids.FLOWING_CHEESECAKE_FILLING);
    }
    public static boolean isCreamCheese(FluidState state) {
        return state.isOf(ModFluids.STILL_CREAM_CHEESE) || state.isOf(ModFluids.FLOWING_CREAM_CHEESE);
    }
    public static boolean isVinegar(FluidState state) {
        return state.isOf(ModFluids.STILL_VINEGAR) || state.isOf(ModFluids.FLOWING_VINEGAR);
    }
    public static boolean isSourCream(FluidState state) {
        return state.isOf(ModFluids.STILL_SOUR_CREAM) || state.isOf(ModFluids.FLOWING_SOUR_CREAM);
    }
    public static boolean isYogurt(FluidState state) {
        return state.isOf(ModFluids.STILL_YOGURT) || state.isOf(ModFluids.FLOWING_YOGURT);
    }
    public static boolean isFruitSmoothie(FluidState state) {
        return state.isOf(ModFluids.STILL_FRUIT_SMOOTHIE) || state.isOf(ModFluids.FLOWING_FRUIT_SMOOTHIE);
    }
    public static boolean isSquidInk(FluidState state) {
        return state.isOf(ModFluids.STILL_SQUID_INK) || state.isOf(ModFluids.FLOWING_SQUID_INK);
    }
    public static boolean isMelonJam(FluidState state) {
        return state.isOf(ModFluids.STILL_MELON_JAM) || state.isOf(ModFluids.FLOWING_MELON_JAM);
    }
    public static boolean isMelonCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_MELON_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_MELON_CREAM_FROSTING);
    }
    public static boolean isMelonIceCream(FluidState state) {
        return state.isOf(ModFluids.STILL_MELON_ICE_CREAM) || state.isOf(ModFluids.FLOWING_MELON_ICE_CREAM);
    }
    public static boolean isMelonMilkshake(FluidState state) {
        return state.isOf(ModFluids.STILL_MELON_MILKSHAKE) || state.isOf(ModFluids.FLOWING_MELON_MILKSHAKE);
    }
    public static boolean isAppleJam(FluidState state) {
        return state.isOf(ModFluids.STILL_APPLE_JAM) || state.isOf(ModFluids.FLOWING_APPLE_JAM);
    }
    public static boolean isBerryJam(FluidState state) {
        return state.isOf(ModFluids.STILL_BERRY_JAM) || state.isOf(ModFluids.FLOWING_BERRY_JAM);
    }
    public static boolean isChorusFruitJam(FluidState state) {
        return state.isOf(ModFluids.STILL_CHORUS_FRUIT_JAM) || state.isOf(ModFluids.FLOWING_CHORUS_FRUIT_JAM);
    }
    public static boolean isGlowBerryJam(FluidState state) {
        return state.isOf(ModFluids.STILL_GLOW_BERRY_JAM) || state.isOf(ModFluids.FLOWING_GLOW_BERRY_JAM);
    }
    public static boolean isAppleJuice(FluidState state) {
        return state.isOf(ModFluids.STILL_APPLE_JUICE) || state.isOf(ModFluids.FLOWING_APPLE_JUICE);
    }
    public static boolean isBerryJuice(FluidState state) {
        return state.isOf(ModFluids.STILL_BERRY_JUICE) || state.isOf(ModFluids.FLOWING_BERRY_JUICE);
    }
    public static boolean isChorusFruitJuice(FluidState state) {
        return state.isOf(ModFluids.STILL_CHORUS_FRUIT_JUICE) || state.isOf(ModFluids.FLOWING_CHORUS_FRUIT_JUICE);
    }
    public static boolean isGlowBerryJuice(FluidState state) {
        return state.isOf(ModFluids.STILL_GLOW_BERRY_JUICE) || state.isOf(ModFluids.FLOWING_GLOW_BERRY_JUICE);
    }
    public static boolean isUbeCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_UBE_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_UBE_CREAM_FROSTING);
    }
    public static boolean isCoffeeToffeeFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_COFFEE_TOFFEE_FUDGE) || state.isOf(ModFluids.FLOWING_COFFEE_TOFFEE_FUDGE);
    }
    public static boolean isCoffeeToffee(FluidState state) {
        return state.isOf(ModFluids.STILL_COFFEE_TOFFEE) || state.isOf(ModFluids.FLOWING_COFFEE_TOFFEE);
    }
    public static boolean isAppleMilkshake(FluidState state) {
        return state.isOf(ModFluids.STILL_APPLE_MILKSHAKE) || state.isOf(ModFluids.FLOWING_APPLE_MILKSHAKE);
    }
    public static boolean isAppleIceCream(FluidState state) {
        return state.isOf(ModFluids.STILL_APPLE_ICE_CREAM) || state.isOf(ModFluids.FLOWING_APPLE_ICE_CREAM);
    }
    public static boolean isBerryMilkshake(FluidState state) {
        return state.isOf(ModFluids.STILL_BERRY_MILKSHAKE) || state.isOf(ModFluids.FLOWING_BERRY_MILKSHAKE);
    }
    public static boolean isBerryIceCream(FluidState state) {
        return state.isOf(ModFluids.STILL_BERRY_ICE_CREAM) || state.isOf(ModFluids.FLOWING_BERRY_ICE_CREAM);
    }
    public static boolean isGlowBerryMilkshake(FluidState state) {
        return state.isOf(ModFluids.STILL_GLOW_BERRY_MILKSHAKE) || state.isOf(ModFluids.FLOWING_GLOW_BERRY_MILKSHAKE);
    }
    public static boolean isGlowBerryIceCream(FluidState state) {
        return state.isOf(ModFluids.STILL_GLOW_BERRY_ICE_CREAM) || state.isOf(ModFluids.FLOWING_GLOW_BERRY_ICE_CREAM);
    }
    public static boolean isChorusFruitMilkshake(FluidState state) {
        return state.isOf(ModFluids.STILL_CHORUS_FRUIT_MILKSHAKE) || state.isOf(ModFluids.FLOWING_CHORUS_FRUIT_MILKSHAKE);
    }
    public static boolean isChorusFruitIceCream(FluidState state) {
        return state.isOf(ModFluids.STILL_CHORUS_FRUIT_ICE_CREAM) || state.isOf(ModFluids.FLOWING_CHORUS_FRUIT_ICE_CREAM);
    }
    public static boolean isChocolateMilkshake(FluidState state) {
        return state.isOf(ModFluids.STILL_CHOCOLATE_MILKSHAKE) || state.isOf(ModFluids.FLOWING_CHOCOLATE_MILKSHAKE);
    }
    public static boolean isChocolateIceCream(FluidState state) {
        return state.isOf(ModFluids.STILL_CHOCOLATE_ICE_CREAM) || state.isOf(ModFluids.FLOWING_CHOCOLATE_ICE_CREAM);
    }
    public static boolean isMilkshake(FluidState state) {
        return state.isOf(ModFluids.STILL_MILKSHAKE) || state.isOf(ModFluids.FLOWING_MILKSHAKE);
    }
    public static boolean isIceCream(FluidState state) {
        return state.isOf(ModFluids.STILL_ICE_CREAM) || state.isOf(ModFluids.FLOWING_ICE_CREAM);
    }
    public static boolean isHeavyCream(FluidState state) {
        return state.isOf(ModFluids.STILL_HEAVY_CREAM) || state.isOf(ModFluids.FLOWING_HEAVY_CREAM);
    }
    public static boolean isSlime(FluidState state) {
        return state.isOf(ModFluids.STILL_SLIME) || state.isOf(ModFluids.FLOWING_SLIME);
    }
    public static boolean isWhiteChocolateFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_WHITE_CHOCOLATE_FUDGE) || state.isOf(ModFluids.FLOWING_WHITE_CHOCOLATE_FUDGE);
    }
    public static boolean isDarkChocolateFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_DARK_CHOCOLATE_FUDGE) || state.isOf(ModFluids.FLOWING_DARK_CHOCOLATE_FUDGE);
    }
    public static boolean isChocolateFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_CHOCOLATE_FUDGE) || state.isOf(ModFluids.FLOWING_CHOCOLATE_FUDGE);
    }
    public static boolean isToffeeFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_TOFFEE_FUDGE) || state.isOf(ModFluids.FLOWING_TOFFEE_FUDGE);
    }
    public static boolean isCaramelFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_CARAMEL_FUDGE) || state.isOf(ModFluids.FLOWING_CARAMEL_FUDGE);
    }
    public static boolean isButterscotchFudge(FluidState state) {
        return state.isOf(ModFluids.STILL_BUTTERSCOTCH_FUDGE) || state.isOf(ModFluids.FLOWING_BUTTERSCOTCH_FUDGE);
    }
    public static boolean isAppleCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_APPLE_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_APPLE_CREAM_FROSTING);
    }
    public static boolean isCondensedMilk(FluidState state) {
        return state.isOf(ModFluids.STILL_CONDENSED_MILK) || state.isOf(ModFluids.FLOWING_CONDENSED_MILK);
    }
    public static boolean isButterscotch(FluidState state) {
        return state.isOf(ModFluids.STILL_BUTTERSCOTCH) || state.isOf(ModFluids.FLOWING_BUTTERSCOTCH);
    }
    public static boolean isToffee(FluidState state) {
        return state.isOf(ModFluids.STILL_TOFFEE) || state.isOf(ModFluids.FLOWING_TOFFEE);
    }
    public static boolean isBlackstrapMolasses(FluidState state) {
        return state.isOf(ModFluids.STILL_BLACKSTRAP_MOLASSES) || state.isOf(ModFluids.FLOWING_BLACKSTRAP_MOLASSES);
    }
    public static boolean isMolasses(FluidState state) {
        return state.isOf(ModFluids.STILL_MOLASSES) || state.isOf(ModFluids.FLOWING_MOLASSES);
    }
    public static boolean isCaneSyrup(FluidState state) {
        return state.isOf(ModFluids.STILL_CANE_SYRUP) || state.isOf(ModFluids.FLOWING_CANE_SYRUP);
    }
    public static boolean isSugarCaneJuice(FluidState state) {
        return state.isOf(ModFluids.STILL_SUGAR_CANE_JUICE) || state.isOf(ModFluids.FLOWING_SUGAR_CANE_JUICE);
    }
    public static boolean isVegetableOil(FluidState state) {
        return state.isOf(ModFluids.STILL_VEGETABLE_OIL) || state.isOf(ModFluids.FLOWING_VEGETABLE_OIL);
    }
    public static boolean isBlackGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_BLACK_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_BLACK_GELATIN_MIX);
    }
    public static boolean isBlueGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_BLUE_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_BLUE_GELATIN_MIX);
    }
    public static boolean isBrownGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_BROWN_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_BROWN_GELATIN_MIX);
    }
    public static boolean isCyanGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_CYAN_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_CYAN_GELATIN_MIX);
    }
    public static boolean isGrayGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_GRAY_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_GRAY_GELATIN_MIX);
    }
    public static boolean isGreenGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_GREEN_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_GREEN_GELATIN_MIX);
    }
    public static boolean isLightBlueGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_LIGHT_BLUE_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_LIGHT_BLUE_GELATIN_MIX);
    }
    public static boolean isLightGrayGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_LIGHT_GRAY_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_LIGHT_GRAY_GELATIN_MIX);
    }
    public static boolean isLimeGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_LIME_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_LIME_GELATIN_MIX);
    }
    public static boolean isMagentaGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_MAGENTA_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_MAGENTA_GELATIN_MIX);
    }
    public static boolean isOrangeGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_ORANGE_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_ORANGE_GELATIN_MIX);
    }
    public static boolean isPinkGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_PINK_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_PINK_GELATIN_MIX);
    }
    public static boolean isPurpleGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_PURPLE_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_PURPLE_GELATIN_MIX);
    }
    public static boolean isRedGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_RED_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_RED_GELATIN_MIX);
    }
    public static boolean isYellowGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_YELLOW_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_YELLOW_GELATIN_MIX);
    }
    public static boolean isGelatinMix(FluidState state) {
        return state.isOf(ModFluids.STILL_GELATIN_MIX) || state.isOf(ModFluids.FLOWING_GELATIN_MIX);
    }
    public static boolean isBerryCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_BERRY_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_BERRY_CREAM_FROSTING);
    }
    public static boolean isCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_CREAM_FROSTING);
    }
    public static boolean isCaramel(FluidState state) {
        return state.isOf(ModFluids.STILL_CARAMEL) || state.isOf(ModFluids.FLOWING_CARAMEL);
    }
    public static boolean isCacaoButter(FluidState state) {
        return state.isOf(ModFluids.STILL_CACAO_BUTTER) || state.isOf(ModFluids.FLOWING_CACAO_BUTTER);
    }
    public static boolean isChorusFruitCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_CHORUS_FRUIT_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_CHORUS_FRUIT_CREAM_FROSTING);
    }
    public static boolean isHotChocolate(FluidState state) {
        return state.isOf(ModFluids.STILL_HOT_CHOCOLATE) || state.isOf(ModFluids.FLOWING_HOT_CHOCOLATE);
    }
    public static boolean isHotWhiteChocolate(FluidState state) {
        return state.isOf(ModFluids.STILL_HOT_WHITE_CHOCOLATE) || state.isOf(ModFluids.FLOWING_HOT_WHITE_CHOCOLATE);
    }
    public static boolean isHotDarkChocolate(FluidState state) {
        return state.isOf(ModFluids.STILL_HOT_DARK_CHOCOLATE) || state.isOf(ModFluids.FLOWING_HOT_DARK_CHOCOLATE);
    }
    public static boolean isWhiteChocolate(FluidState state) {
        return state.isOf(ModFluids.STILL_WHITE_CHOCOLATE) || state.isOf(ModFluids.FLOWING_WHITE_CHOCOLATE);
    }
    public static boolean isDarkChocolate(FluidState state) {
        return state.isOf(ModFluids.STILL_DARK_CHOCOLATE) || state.isOf(ModFluids.FLOWING_DARK_CHOCOLATE);
    }
    public static boolean isCacaoMass(FluidState state) {
        return state.isOf(ModFluids.STILL_CACAO_MASS) || state.isOf(ModFluids.FLOWING_CACAO_MASS);
    }
    public static boolean isChocolateCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_CHOCOLATE_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_CHOCOLATE_CREAM_FROSTING);
    }
    public static boolean isChocolateMilk(FluidState state) {
        return state.isOf(ModFluids.STILL_CHOCOLATE_MILK) || state.isOf(ModFluids.FLOWING_CHOCOLATE_MILK);
    }
    public static boolean isGlowBerryCreamFrosting(FluidState state) {
        return state.isOf(ModFluids.STILL_GLOW_BERRY_CREAM_FROSTING) || state.isOf(ModFluids.FLOWING_GLOW_BERRY_CREAM_FROSTING);
    }
    public static void registerModFluids () {
        CreateFood.LOGGER.info("Registering Fluids for " + CreateFood.MOD_ID);
    }
    public static void registerFluid(){

        if (CONFIG.isWaffleBatterFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WAFFLE_BATTER_BUCKET));
            STILL_WAFFLE_BATTER = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "waffle_batter"), new WaffleBatterFluid.Still());
            FLOWING_WAFFLE_BATTER = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_waffle_batter"), new WaffleBatterFluid.Flowing());
            WAFFLE_BATTER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "waffle_batter_block"),
                    new FluidBlock(ModFluids.STILL_WAFFLE_BATTER, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            WAFFLE_BATTER_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "waffle_batter_bucket"),
                    new BucketItem(ModFluids.STILL_WAFFLE_BATTER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }

        if (CONFIG.isCreamPieFillingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAM_PIE_FILLING_BUCKET));
            STILL_CREAM_PIE_FILLING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cream_pie_filling"), new CreamPieFillingFluid.Still());
            FLOWING_CREAM_PIE_FILLING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cream_pie_filling"), new CreamPieFillingFluid.Flowing());
            CREAM_PIE_FILLING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cream_pie_filling_block"),
                    new FluidBlock(ModFluids.STILL_CREAM_PIE_FILLING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CREAM_PIE_FILLING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cream_pie_filling_bucket"),
                    new BucketItem(ModFluids.STILL_CREAM_PIE_FILLING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }

        if (CONFIG.isGlowBerryPieFillingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_PIE_FILLING_BUCKET));
            STILL_GLOW_BERRY_PIE_FILLING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "glow_berry_pie_filling"), new GlowBerryPieFillingFluid.Still());
            FLOWING_GLOW_BERRY_PIE_FILLING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_glow_berry_pie_filling"), new GlowBerryPieFillingFluid.Flowing());
            GLOW_BERRY_PIE_FILLING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "glow_berry_pie_filling_block"),
                    new FluidBlock(ModFluids.STILL_GLOW_BERRY_PIE_FILLING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GLOW_BERRY_PIE_FILLING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "glow_berry_pie_filling_bucket"),
                    new BucketItem(ModFluids.STILL_GLOW_BERRY_PIE_FILLING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }

        if (CONFIG.isBerryPieFillingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_PIE_FILLING_BUCKET));
            STILL_BERRY_PIE_FILLING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "berry_pie_filling"), new BerryPieFillingFluid.Still());
            FLOWING_BERRY_PIE_FILLING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_berry_pie_filling"), new BerryPieFillingFluid.Flowing());
            BERRY_PIE_FILLING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "berry_pie_filling_block"),
                    new FluidBlock(ModFluids.STILL_BERRY_PIE_FILLING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BERRY_PIE_FILLING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "berry_pie_filling_bucket"),
                    new BucketItem(ModFluids.STILL_BERRY_PIE_FILLING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }

        if (CONFIG.isChorusFruitPieFillingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_PIE_FILLING_BUCKET));
            STILL_CHORUS_FRUIT_PIE_FILLING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chorus_fruit_pie_filling"), new ChorusFruitPieFillingFluid.Still());
            FLOWING_CHORUS_FRUIT_PIE_FILLING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chorus_fruit_pie_filling"), new ChorusFruitPieFillingFluid.Flowing());
            CHORUS_FRUIT_PIE_FILLING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chorus_fruit_pie_filling_block"),
                    new FluidBlock(ModFluids.STILL_CHORUS_FRUIT_PIE_FILLING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHORUS_FRUIT_PIE_FILLING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chorus_fruit_pie_filling_bucket"),
                    new BucketItem(ModFluids.STILL_CHORUS_FRUIT_PIE_FILLING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }

        if (CONFIG.isApplePieFillingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_PIE_FILLING_BUCKET));
            STILL_APPLE_PIE_FILLING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "apple_pie_filling"), new ApplePieFillingFluid.Still());
            FLOWING_APPLE_PIE_FILLING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_apple_pie_filling"), new ApplePieFillingFluid.Flowing());
            APPLE_PIE_FILLING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "apple_pie_filling_block"),
                    new FluidBlock(ModFluids.STILL_APPLE_PIE_FILLING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            APPLE_PIE_FILLING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "apple_pie_filling_bucket"),
                    new BucketItem(ModFluids.STILL_APPLE_PIE_FILLING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }

        if (CONFIG.isCheesecakeFillingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHEESECAKE_FILLING_BUCKET));
            STILL_CHEESECAKE_FILLING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cheesecake_filling"), new CheesecakeFillingFluid.Still());
            FLOWING_CHEESECAKE_FILLING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cheesecake_filling"), new CheesecakeFillingFluid.Flowing());
            CHEESECAKE_FILLING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cheesecake_filling_block"),
                    new FluidBlock(ModFluids.STILL_CHEESECAKE_FILLING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHEESECAKE_FILLING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cheesecake_filling_bucket"),
                    new BucketItem(ModFluids.STILL_CHEESECAKE_FILLING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }

        if (CONFIG.isCreamCheeseFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAM_CHEESE_BUCKET));
            STILL_CREAM_CHEESE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cream_cheese"), new CreamCheeseFluid.Still());
            FLOWING_CREAM_CHEESE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cream_cheese"), new CreamCheeseFluid.Flowing());
            CREAM_CHEESE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cream_cheese_block"),
                    new FluidBlock(ModFluids.STILL_CREAM_CHEESE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CREAM_CHEESE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cream_cheese_bucket"),
                    new BucketItem(ModFluids.STILL_CREAM_CHEESE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }

        if (CONFIG.isVinegarFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(VINEGAR_BUCKET));
            STILL_VINEGAR = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "vinegar"), new VinegarFluid.Still());
            FLOWING_VINEGAR = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_vinegar"), new VinegarFluid.Flowing());
            VINEGAR_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "vinegar_block"),
                    new FluidBlock(ModFluids.STILL_VINEGAR, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            VINEGAR_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "vinegar_bucket"),
                    new BucketItem(ModFluids.STILL_VINEGAR, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }

        if (CONFIG.isSourCreamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SOUR_CREAM_BUCKET));
            STILL_SOUR_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "sour_cream"), new SourCreamFluid.Still());
            FLOWING_SOUR_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_sour_cream"), new SourCreamFluid.Flowing());
            SOUR_CREAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "sour_cream_block"),
                    new FluidBlock(ModFluids.STILL_SOUR_CREAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            SOUR_CREAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "sour_cream_bucket"),
                    new BucketItem(ModFluids.STILL_SOUR_CREAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isYogurtFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(YOGURT_BUCKET));
            STILL_YOGURT = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "yogurt"), new YogurtFluid.Still());
            FLOWING_YOGURT = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_yogurt"), new YogurtFluid.Flowing());
            YOGURT_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "yogurt_block"),
                    new FluidBlock(ModFluids.STILL_YOGURT, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            YOGURT_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "yogurt_bucket"),
                    new BucketItem(ModFluids.STILL_YOGURT, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isFruitSmoothieFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(FRUIT_SMOOTHIE_BUCKET));
            STILL_FRUIT_SMOOTHIE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "fruit_smoothie"), new FruitSmoothieFluid.Still());
            FLOWING_FRUIT_SMOOTHIE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_fruit_smoothie"), new FruitSmoothieFluid.Flowing());
            FRUIT_SMOOTHIE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "fruit_smoothie_block"),
                    new FluidBlock(ModFluids.STILL_FRUIT_SMOOTHIE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            FRUIT_SMOOTHIE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "fruit_smoothie_bucket"),
                    new BucketItem(ModFluids.STILL_FRUIT_SMOOTHIE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isSquidInkFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SQUID_INK_BUCKET));
            STILL_SQUID_INK = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "squid_ink"), new SquidInkFluid.Still());
            FLOWING_SQUID_INK = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_squid_ink"), new SquidInkFluid.Flowing());
            SQUID_INK_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "squid_ink_block"),
                    new FluidBlock(ModFluids.STILL_SQUID_INK, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            SQUID_INK_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "squid_ink_bucket"),
                    new BucketItem(ModFluids.STILL_SQUID_INK, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isMelonJamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELON_JAM_BUCKET));
            STILL_MELON_JAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "melon_jam"), new MelonJamFluid.Still());
            FLOWING_MELON_JAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_melon_jam"), new MelonJamFluid.Flowing());
            MELON_JAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "melon_jam_block"),
                    new FluidBlock(ModFluids.STILL_MELON_JAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            MELON_JAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "melon_jam_bucket"),
                    new BucketItem(ModFluids.STILL_MELON_JAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isMelonMilkshakeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELON_MILKSHAKE_BUCKET));
            STILL_MELON_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "melon_milkshake"), new MelonMilkshakeFluid.Still());
            FLOWING_MELON_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_melon_milkshake"), new MelonMilkshakeFluid.Flowing());
            MELON_MILKSHAKE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "melon_milkshake_block"),
                    new FluidBlock(ModFluids.STILL_MELON_MILKSHAKE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            MELON_MILKSHAKE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "melon_milkshake_bucket"),
                    new BucketItem(ModFluids.STILL_MELON_MILKSHAKE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isMelonIceCreamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELON_ICE_CREAM_BUCKET));
            STILL_MELON_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "melon_ice_cream"), new MelonIceCreamFluid.Still());
            FLOWING_MELON_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_melon_ice_cream"), new MelonIceCreamFluid.Flowing());
            MELON_ICE_CREAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "melon_ice_cream_block"),
                    new FluidBlock(ModFluids.STILL_MELON_ICE_CREAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            MELON_ICE_CREAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "melon_ice_cream_bucket"),
                    new BucketItem(ModFluids.STILL_MELON_ICE_CREAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isMelonCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MELON_CREAM_FROSTING_BUCKET));
            STILL_MELON_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "melon_cream_frosting"), new MelonCreamFrostingFluid.Still());
            FLOWING_MELON_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_melon_cream_frosting"), new MelonCreamFrostingFluid.Flowing());
            MELON_CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "melon_cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_MELON_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            MELON_CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "melon_cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_MELON_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isAppleJamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_JAM_BUCKET));
            STILL_APPLE_JAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "apple_jam"), new AppleJamFluid.Still());
            FLOWING_APPLE_JAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_apple_jam"), new AppleJamFluid.Flowing());
            APPLE_JAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "apple_jam_block"),
                    new FluidBlock(ModFluids.STILL_APPLE_JAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            APPLE_JAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "apple_jam_bucket"),
                    new BucketItem(ModFluids.STILL_APPLE_JAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBerryJamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_JAM_BUCKET));
            STILL_BERRY_JAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "berry_jam"), new BerryJamFluid.Still());
            FLOWING_BERRY_JAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_berry_jam"), new BerryJamFluid.Flowing());
            BERRY_JAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "berry_jam_block"),
                    new FluidBlock(ModFluids.STILL_BERRY_JAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BERRY_JAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "berry_jam_bucket"),
                    new BucketItem(ModFluids.STILL_BERRY_JAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChorusFruitJamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_JAM_BUCKET));
            STILL_CHORUS_FRUIT_JAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chorus_fruit_jam"), new ChorusFruitJamFluid.Still());
            FLOWING_CHORUS_FRUIT_JAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chorus_fruit_jam"), new ChorusFruitJamFluid.Flowing());
            CHORUS_FRUIT_JAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chorus_fruit_jam_block"),
                    new FluidBlock(ModFluids.STILL_CHORUS_FRUIT_JAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHORUS_FRUIT_JAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chorus_fruit_jam_bucket"),
                    new BucketItem(ModFluids.STILL_CHORUS_FRUIT_JAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isGlowBerryJamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_JAM_BUCKET));
            STILL_GLOW_BERRY_JAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "glow_berry_jam"), new GlowBerryJamFluid.Still());
            FLOWING_GLOW_BERRY_JAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_glow_berry_jam"), new GlowBerryJamFluid.Flowing());
            GLOW_BERRY_JAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "glow_berry_jam_block"),
                    new FluidBlock(ModFluids.STILL_GLOW_BERRY_JAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GLOW_BERRY_JAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "glow_berry_jam_bucket"),
                    new BucketItem(ModFluids.STILL_GLOW_BERRY_JAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isAppleJuiceFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_JUICE_BUCKET));
            STILL_APPLE_JUICE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "apple_juice"), new AppleJuiceFluid.Still());
            FLOWING_APPLE_JUICE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_apple_juice"), new AppleJuiceFluid.Flowing());
            APPLE_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "apple_juice_block"),
                    new FluidBlock(ModFluids.STILL_APPLE_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            APPLE_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "apple_juice_bucket"),
                    new BucketItem(ModFluids.STILL_APPLE_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBerryJuiceFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_JUICE_BUCKET));
            STILL_BERRY_JUICE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "berry_juice"), new BerryJuiceFluid.Still());
            FLOWING_BERRY_JUICE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_berry_juice"), new BerryJuiceFluid.Flowing());
            BERRY_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "berry_juice_block"),
                    new FluidBlock(ModFluids.STILL_BERRY_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BERRY_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "berry_juice_bucket"),
                    new BucketItem(ModFluids.STILL_BERRY_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChorusFruitJuiceFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_JUICE_BUCKET));
            STILL_CHORUS_FRUIT_JUICE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chorus_fruit_juice"), new ChorusFruitJuiceFluid.Still());
            FLOWING_CHORUS_FRUIT_JUICE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chorus_fruit_juice"), new ChorusFruitJuiceFluid.Flowing());
            CHORUS_FRUIT_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chorus_fruit_juice_block"),
                    new FluidBlock(ModFluids.STILL_CHORUS_FRUIT_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHORUS_FRUIT_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chorus_fruit_juice_bucket"),
                    new BucketItem(ModFluids.STILL_CHORUS_FRUIT_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isGlowBerryJuiceFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_JUICE_BUCKET));
            STILL_GLOW_BERRY_JUICE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "glow_berry_juice"), new GlowBerryJuiceFluid.Still());
            FLOWING_GLOW_BERRY_JUICE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_glow_berry_juice"), new GlowBerryJuiceFluid.Flowing());
            GLOW_BERRY_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "glow_berry_juice_block"),
                    new FluidBlock(ModFluids.STILL_GLOW_BERRY_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GLOW_BERRY_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "glow_berry_juice_bucket"),
                    new BucketItem(ModFluids.STILL_GLOW_BERRY_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isUbeCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(UBE_CREAM_FROSTING_BUCKET));
            STILL_UBE_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "ube_cream_frosting"), new UbeCreamFrostingFluid.Still());
            FLOWING_UBE_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_ube_cream_frosting"), new UbeCreamFrostingFluid.Flowing());
            UBE_CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "ube_cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_UBE_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            UBE_CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "ube_cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_UBE_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCoffeeToffeeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(COFFEE_TOFFEE_BUCKET));
            STILL_COFFEE_TOFFEE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "coffee_toffee"), new CoffeeToffeeFluid.Still());
            FLOWING_COFFEE_TOFFEE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_coffee_toffee"), new CoffeeToffeeFluid.Flowing());
            COFFEE_TOFFEE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "coffee_toffee_block"),
                    new FluidBlock(ModFluids.STILL_COFFEE_TOFFEE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            COFFEE_TOFFEE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "coffee_toffee_bucket"),
                    new BucketItem(ModFluids.STILL_COFFEE_TOFFEE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCoffeeToffeeFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(COFFEE_TOFFEE_FUDGE_BUCKET));
            STILL_COFFEE_TOFFEE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "coffee_toffee_fudge"), new CoffeeToffeeFudgeFluid.Still());
            FLOWING_COFFEE_TOFFEE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_coffee_toffee_fudge"), new CoffeeToffeeFudgeFluid.Flowing());
            COFFEE_TOFFEE_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "coffee_toffee_fudge_block"),
                    new FluidBlock(ModFluids.STILL_COFFEE_TOFFEE_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            COFFEE_TOFFEE_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "coffee_toffee_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_COFFEE_TOFFEE_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isAppleMilkshakeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_MILKSHAKE_BUCKET));
            STILL_APPLE_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "apple_milkshake"), new AppleMilkshakeFluid.Still());
            FLOWING_APPLE_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_apple_milkshake"), new AppleMilkshakeFluid.Flowing());
            APPLE_MILKSHAKE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "apple_milkshake_block"),
                    new FluidBlock(ModFluids.STILL_APPLE_MILKSHAKE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            APPLE_MILKSHAKE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "apple_milkshake_bucket"),
                    new BucketItem(ModFluids.STILL_APPLE_MILKSHAKE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isAppleIceCreamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_ICE_CREAM_BUCKET));
            STILL_APPLE_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "apple_ice_cream"), new AppleIceCreamFluid.Still());
            FLOWING_APPLE_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_apple_ice_cream"), new AppleIceCreamFluid.Flowing());
            APPLE_ICE_CREAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "apple_ice_cream_block"),
                    new FluidBlock(ModFluids.STILL_APPLE_ICE_CREAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            APPLE_ICE_CREAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "apple_ice_cream_bucket"),
                    new BucketItem(ModFluids.STILL_APPLE_ICE_CREAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBerryMilkshakeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_MILKSHAKE_BUCKET));
            STILL_BERRY_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "berry_milkshake"), new BerryMilkshakeFluid.Still());
            FLOWING_BERRY_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_berry_milkshake"), new BerryMilkshakeFluid.Flowing());
            BERRY_MILKSHAKE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "berry_milkshake_block"),
                    new FluidBlock(ModFluids.STILL_BERRY_MILKSHAKE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BERRY_MILKSHAKE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "berry_milkshake_bucket"),
                    new BucketItem(ModFluids.STILL_BERRY_MILKSHAKE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBerryIceCreamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_ICE_CREAM_BUCKET));
            STILL_BERRY_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "berry_ice_cream"), new BerryIceCreamFluid.Still());
            FLOWING_BERRY_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_berry_ice_cream"), new BerryIceCreamFluid.Flowing());
            BERRY_ICE_CREAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "berry_ice_cream_block"),
                    new FluidBlock(ModFluids.STILL_BERRY_ICE_CREAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BERRY_ICE_CREAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "berry_ice_cream_bucket"),
                    new BucketItem(ModFluids.STILL_BERRY_ICE_CREAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isGlowBerryMilkshakeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_MILKSHAKE_BUCKET));
            STILL_GLOW_BERRY_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "glow_berry_milkshake"), new GlowBerryMilkshakeFluid.Still());
            FLOWING_GLOW_BERRY_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_glow_berry_milkshake"), new GlowBerryMilkshakeFluid.Flowing());
            GLOW_BERRY_MILKSHAKE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "glow_berry_milkshake_block"),
                    new FluidBlock(ModFluids.STILL_GLOW_BERRY_MILKSHAKE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GLOW_BERRY_MILKSHAKE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "glow_berry_milkshake_bucket"),
                    new BucketItem(ModFluids.STILL_GLOW_BERRY_MILKSHAKE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isGlowBerryIceCreamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_ICE_CREAM_BUCKET));
            STILL_GLOW_BERRY_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "glow_berry_ice_cream"), new GlowBerryIceCreamFluid.Still());
            FLOWING_GLOW_BERRY_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_glow_berry_ice_cream"), new GlowBerryIceCreamFluid.Flowing());
            GLOW_BERRY_ICE_CREAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "glow_berry_ice_cream_block"),
                    new FluidBlock(ModFluids.STILL_GLOW_BERRY_ICE_CREAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GLOW_BERRY_ICE_CREAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "glow_berry_ice_cream_bucket"),
                    new BucketItem(ModFluids.STILL_GLOW_BERRY_ICE_CREAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChorusFruitMilkshakeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_MILKSHAKE_BUCKET));
            STILL_CHORUS_FRUIT_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chorus_fruit_milkshake"), new ChorusFruitMilkshakeFluid.Still());
            FLOWING_CHORUS_FRUIT_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chorus_fruit_milkshake"), new ChorusFruitMilkshakeFluid.Flowing());
            CHORUS_FRUIT_MILKSHAKE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chorus_fruit_milkshake_block"),
                    new FluidBlock(ModFluids.STILL_CHORUS_FRUIT_MILKSHAKE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHORUS_FRUIT_MILKSHAKE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chorus_fruit_milkshake_bucket"),
                    new BucketItem(ModFluids.STILL_CHORUS_FRUIT_MILKSHAKE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChorusFruitIceCreamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_ICE_CREAM_BUCKET));
            STILL_CHORUS_FRUIT_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chorus_fruit_ice_cream"), new ChorusFruitIceCreamFluid.Still());
            FLOWING_CHORUS_FRUIT_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chorus_fruit_ice_cream"), new ChorusFruitIceCreamFluid.Flowing());
            CHORUS_FRUIT_ICE_CREAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chorus_fruit_ice_cream_block"),
                    new FluidBlock(ModFluids.STILL_CHORUS_FRUIT_ICE_CREAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHORUS_FRUIT_ICE_CREAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chorus_fruit_ice_cream_bucket"),
                    new BucketItem(ModFluids.STILL_CHORUS_FRUIT_ICE_CREAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChocolateMilkshakeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_MILKSHAKE_BUCKET));
            STILL_CHOCOLATE_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chocolate_milkshake"), new ChocolateMilkshakeFluid.Still());
            FLOWING_CHOCOLATE_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chocolate_milkshake"), new ChocolateMilkshakeFluid.Flowing());
            CHOCOLATE_MILKSHAKE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chocolate_milkshake_block"),
                    new FluidBlock(ModFluids.STILL_CHOCOLATE_MILKSHAKE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHOCOLATE_MILKSHAKE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chocolate_milkshake_bucket"),
                    new BucketItem(ModFluids.STILL_CHOCOLATE_MILKSHAKE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChocolateIceCreamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_ICE_CREAM_BUCKET));
            STILL_CHOCOLATE_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chocolate_ice_cream"), new ChocolateIceCreamFluid.Still());
            FLOWING_CHOCOLATE_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chocolate_ice_cream"), new ChocolateIceCreamFluid.Flowing());
            CHOCOLATE_ICE_CREAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chocolate_ice_cream_block"),
                    new FluidBlock(ModFluids.STILL_CHOCOLATE_ICE_CREAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHOCOLATE_ICE_CREAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chocolate_ice_cream_bucket"),
                    new BucketItem(ModFluids.STILL_CHOCOLATE_ICE_CREAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isMilkshakeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MILKSHAKE_BUCKET));
            STILL_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "milkshake"), new MilkshakeFluid.Still());
            FLOWING_MILKSHAKE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_milkshake"), new MilkshakeFluid.Flowing());
            MILKSHAKE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "milkshake_block"),
                    new FluidBlock(ModFluids.STILL_MILKSHAKE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            MILKSHAKE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "milkshake_bucket"),
                    new BucketItem(ModFluids.STILL_MILKSHAKE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isIceCreamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ICE_CREAM_BUCKET));
            STILL_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "ice_cream"), new IceCreamFluid.Still());
            FLOWING_ICE_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_ice_cream"), new IceCreamFluid.Flowing());
            ICE_CREAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "ice_cream_block"),
                    new FluidBlock(ModFluids.STILL_ICE_CREAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            ICE_CREAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "ice_cream_bucket"),
                    new BucketItem(ModFluids.STILL_ICE_CREAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isHeavyCreamFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HEAVY_CREAM_BUCKET));
            STILL_HEAVY_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "heavy_cream"), new HeavyCreamFluid.Still());
            FLOWING_HEAVY_CREAM = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_heavy_cream"), new HeavyCreamFluid.Flowing());
            HEAVY_CREAM_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "heavy_cream_block"),
                    new FluidBlock(ModFluids.STILL_HEAVY_CREAM, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            HEAVY_CREAM_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "heavy_cream_bucket"),
                    new BucketItem(ModFluids.STILL_HEAVY_CREAM, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isSlimeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SLIME_BUCKET));
            STILL_SLIME = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "slime"), new SlimeFluid.Still());
            FLOWING_SLIME = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_slime"), new SlimeFluid.Flowing());
            SLIME_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "slime_block"),
                    new FluidBlock(ModFluids.STILL_SLIME, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            SLIME_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "slime_bucket"),
                    new BucketItem(ModFluids.STILL_SLIME, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isWhiteChocolateFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITE_CHOCOLATE_FUDGE_BUCKET));
            STILL_WHITE_CHOCOLATE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "white_chocolate_fudge"), new WhiteChocolateFudgeFluid.Still());
            FLOWING_WHITE_CHOCOLATE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_white_chocolate_fudge"), new WhiteChocolateFudgeFluid.Flowing());
            WHITE_CHOCOLATE_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "white_chocolate_fudge_block"),
                    new FluidBlock(ModFluids.STILL_WHITE_CHOCOLATE_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            WHITE_CHOCOLATE_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "white_chocolate_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_WHITE_CHOCOLATE_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isDarkChocolateFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARK_CHOCOLATE_FUDGE_BUCKET));
            STILL_DARK_CHOCOLATE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "dark_chocolate_fudge"), new DarkChocolateFudgeFluid.Still());
            FLOWING_DARK_CHOCOLATE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_dark_chocolate_fudge"), new DarkChocolateFudgeFluid.Flowing());
            DARK_CHOCOLATE_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "dark_chocolate_fudge_block"),
                    new FluidBlock(ModFluids.STILL_DARK_CHOCOLATE_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            DARK_CHOCOLATE_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "dark_chocolate_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_DARK_CHOCOLATE_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChocolateFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_FUDGE_BUCKET));
            STILL_CHOCOLATE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chocolate_fudge"), new ChocolateFudgeFluid.Still());
            FLOWING_CHOCOLATE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chocolate_fudge"), new ChocolateFudgeFluid.Flowing());
            CHOCOLATE_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chocolate_fudge_block"),
                    new FluidBlock(ModFluids.STILL_CHOCOLATE_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHOCOLATE_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chocolate_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_CHOCOLATE_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isToffeeFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOFFEE_FUDGE_BUCKET));
            STILL_TOFFEE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "toffee_fudge"), new ToffeeFudgeFluid.Still());
            FLOWING_TOFFEE_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_toffee_fudge"), new ToffeeFudgeFluid.Flowing());
            TOFFEE_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "toffee_fudge_block"),
                    new FluidBlock(ModFluids.STILL_TOFFEE_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            TOFFEE_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "toffee_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_TOFFEE_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCaramelFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMEL_FUDGE_BUCKET));
            STILL_CARAMEL_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "caramel_fudge"), new CaramelFudgeFluid.Still());
            FLOWING_CARAMEL_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_caramel_fudge"), new CaramelFudgeFluid.Flowing());
            CARAMEL_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "caramel_fudge_block"),
                    new FluidBlock(ModFluids.STILL_CARAMEL_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CARAMEL_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "caramel_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_CARAMEL_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isButterscotchFudgeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERSCOTCH_FUDGE_BUCKET));
            STILL_BUTTERSCOTCH_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "butterscotch_fudge"), new ButterscotchFudgeFluid.Still());
            FLOWING_BUTTERSCOTCH_FUDGE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_butterscotch_fudge"), new ButterscotchFudgeFluid.Flowing());
            BUTTERSCOTCH_FUDGE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "butterscotch_fudge_block"),
                    new FluidBlock(ModFluids.STILL_BUTTERSCOTCH_FUDGE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BUTTERSCOTCH_FUDGE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "butterscotch_fudge_bucket"),
                    new BucketItem(ModFluids.STILL_BUTTERSCOTCH_FUDGE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isAppleCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(APPLE_CREAM_FROSTING_BUCKET));
            STILL_APPLE_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "apple_cream_frosting"), new AppleCreamFrostingFluid.Still());
            FLOWING_APPLE_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_apple_cream_frosting"), new AppleCreamFrostingFluid.Flowing());
            APPLE_CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "apple_cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_APPLE_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            APPLE_CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "apple_cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_APPLE_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCondensedMilkFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CONDENSED_MILK_BUCKET));
            STILL_CONDENSED_MILK = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "condensed_milk"), new CondensedMilkFluid.Still());
            FLOWING_CONDENSED_MILK = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_condensed_milk"), new CondensedMilkFluid.Flowing());
            CONDENSED_MILK_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "condensed_milk_block"),
                    new FluidBlock(ModFluids.STILL_CONDENSED_MILK, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CONDENSED_MILK_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "condensed_milk_bucket"),
                    new BucketItem(ModFluids.STILL_CONDENSED_MILK, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isButterscotchFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BUTTERSCOTCH_BUCKET));
            STILL_BUTTERSCOTCH = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "butterscotch"), new ButterscotchFluid.Still());
            FLOWING_BUTTERSCOTCH = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_butterscotch"), new ButterscotchFluid.Flowing());
            BUTTERSCOTCH_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "butterscotch_block"),
                    new FluidBlock(ModFluids.STILL_BUTTERSCOTCH, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BUTTERSCOTCH_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "butterscotch_bucket"),
                    new BucketItem(ModFluids.STILL_BUTTERSCOTCH, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isToffeeFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(TOFFEE_BUCKET));
            STILL_TOFFEE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "toffee"), new ToffeeFluid.Still());
            FLOWING_TOFFEE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_toffee"), new ToffeeFluid.Flowing());
            TOFFEE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "toffee_block"),
                    new FluidBlock(ModFluids.STILL_TOFFEE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            TOFFEE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "toffee_bucket"),
                    new BucketItem(ModFluids.STILL_TOFFEE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBlackstrapMolassesFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BLACKSTRAP_MOLASSES_BUCKET));
            STILL_BLACKSTRAP_MOLASSES = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "blackstrap_molasses"), new BlackstrapMolassesFluid.Still());
            FLOWING_BLACKSTRAP_MOLASSES = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_blackstrap_molasses"), new BlackstrapMolassesFluid.Flowing());
            BLACKSTRAP_MOLASSES_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "blackstrap_molasses_block"),
                    new FluidBlock(ModFluids.STILL_BLACKSTRAP_MOLASSES, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BLACKSTRAP_MOLASSES_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "blackstrap_molasses_bucket"),
                    new BucketItem(ModFluids.STILL_BLACKSTRAP_MOLASSES, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isMolassesFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MOLASSES_BUCKET));
            STILL_MOLASSES = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "molasses"), new MolassesFluid.Still());
            FLOWING_MOLASSES = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_molasses"), new MolassesFluid.Flowing());
            MOLASSES_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "molasses_block"),
                    new FluidBlock(ModFluids.STILL_MOLASSES, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            MOLASSES_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "molasses_bucket"),
                    new BucketItem(ModFluids.STILL_MOLASSES, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCaneSyrupFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CANE_SYRUP_BUCKET));
            STILL_CANE_SYRUP = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cane_syrup"), new CaneSyrupFluid.Still());
            FLOWING_CANE_SYRUP = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cane_syrup"), new CaneSyrupFluid.Flowing());
            CANE_SYRUP_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cane_syrup_block"),
                    new FluidBlock(ModFluids.STILL_CANE_SYRUP, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CANE_SYRUP_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cane_syrup_bucket"),
                    new BucketItem(ModFluids.STILL_CANE_SYRUP, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isSugarCaneJuiceFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(SUGAR_CANE_JUICE_BUCKET));
            STILL_SUGAR_CANE_JUICE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "sugar_cane_juice"), new SugarCaneJuiceFluid.Still());
            FLOWING_SUGAR_CANE_JUICE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_sugar_cane_juice"), new SugarCaneJuiceFluid.Flowing());
            SUGAR_CANE_JUICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "sugar_cane_juice_block"),
                    new FluidBlock(ModFluids.STILL_SUGAR_CANE_JUICE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            SUGAR_CANE_JUICE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "sugar_cane_juice_bucket"),
                    new BucketItem(ModFluids.STILL_SUGAR_CANE_JUICE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isVegetableOilFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(VEGETABLE_OIL_BUCKET));
            STILL_VEGETABLE_OIL = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "vegetable_oil"), new VegetableOilFluid.Still());
            FLOWING_VEGETABLE_OIL = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_vegetable_oil"), new VegetableOilFluid.Flowing());
            VEGETABLE_OIL_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "vegetable_oil_block"),
                    new FluidBlock(ModFluids.STILL_VEGETABLE_OIL, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            VEGETABLE_OIL_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "vegetable_oil_bucket"),
                    new BucketItem(ModFluids.STILL_VEGETABLE_OIL, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBlackGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BLACK_GELATIN_MIX_BUCKET));
            STILL_BLACK_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "black_gelatin_mix"), new BlackGelatinMixFluid.Still());
            FLOWING_BLACK_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_black_gelatin_mix"), new BlackGelatinMixFluid.Flowing());
            BLACK_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "black_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_BLACK_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BLACK_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "black_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_BLACK_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBlueGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BLUE_GELATIN_MIX_BUCKET));
            STILL_BLUE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "blue_gelatin_mix"), new BlueGelatinMixFluid.Still());
            FLOWING_BLUE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_blue_gelatin_mix"), new BlueGelatinMixFluid.Flowing());
            BLUE_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "blue_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_BLUE_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BLUE_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "blue_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_BLUE_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBrownGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BROWN_GELATIN_MIX_BUCKET));
            STILL_BROWN_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "brown_gelatin_mix"), new BrownGelatinMixFluid.Still());
            FLOWING_BROWN_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_brown_gelatin_mix"), new BrownGelatinMixFluid.Flowing());
            BROWN_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "brown_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_BROWN_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BROWN_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "brown_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_BROWN_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCyanGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CYAN_GELATIN_MIX_BUCKET));
            STILL_CYAN_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cyan_gelatin_mix"), new CyanGelatinMixFluid.Still());
            FLOWING_CYAN_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cyan_gelatin_mix"), new CyanGelatinMixFluid.Flowing());
            CYAN_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cyan_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_CYAN_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CYAN_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cyan_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_CYAN_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isGrayGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GRAY_GELATIN_MIX_BUCKET));
            STILL_GRAY_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "gray_gelatin_mix"), new GrayGelatinMixFluid.Still());
            FLOWING_GRAY_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_gray_gelatin_mix"), new GrayGelatinMixFluid.Flowing());
            GRAY_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "gray_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_GRAY_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GRAY_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "gray_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_GRAY_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isGreenGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GREEN_GELATIN_MIX_BUCKET));
            STILL_GREEN_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "green_gelatin_mix"), new GreenGelatinMixFluid.Still());
            FLOWING_GREEN_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_green_gelatin_mix"), new GreenGelatinMixFluid.Flowing());
            GREEN_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "green_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_GREEN_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GREEN_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "green_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_GREEN_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isLightBlueGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIGHT_BLUE_GELATIN_MIX_BUCKET));
            STILL_LIGHT_BLUE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "light_blue_gelatin_mix"), new LightBlueGelatinMixFluid.Still());
            FLOWING_LIGHT_BLUE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_light_blue_gelatin_mix"), new LightBlueGelatinMixFluid.Flowing());
            LIGHT_BLUE_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "light_blue_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_LIGHT_BLUE_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            LIGHT_BLUE_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "light_blue_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_LIGHT_BLUE_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isLightGrayGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIGHT_GRAY_GELATIN_MIX_BUCKET));
            STILL_LIGHT_GRAY_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "light_gray_gelatin_mix"), new LightGrayGelatinMixFluid.Still());
            FLOWING_LIGHT_GRAY_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_light_gray_gelatin_mix"), new LightGrayGelatinMixFluid.Flowing());
            LIGHT_GRAY_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "light_gray_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_LIGHT_GRAY_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            LIGHT_GRAY_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "light_gray_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_LIGHT_GRAY_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isLimeGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(LIME_GELATIN_MIX_BUCKET));
            STILL_LIME_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "lime_gelatin_mix"), new LimeGelatinMixFluid.Still());
            FLOWING_LIME_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_lime_gelatin_mix"), new LimeGelatinMixFluid.Flowing());
            LIME_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "lime_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_LIME_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            LIME_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "lime_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_LIME_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isMagentaGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(MAGENTA_GELATIN_MIX_BUCKET));
            STILL_MAGENTA_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "magenta_gelatin_mix"), new MagentaGelatinMixFluid.Still());
            FLOWING_MAGENTA_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_magenta_gelatin_mix"), new MagentaGelatinMixFluid.Flowing());
            MAGENTA_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "magenta_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_MAGENTA_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            MAGENTA_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "magenta_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_MAGENTA_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isOrangeGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(ORANGE_GELATIN_MIX_BUCKET));
            STILL_ORANGE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "orange_gelatin_mix"), new OrangeGelatinMixFluid.Still());
            FLOWING_ORANGE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_orange_gelatin_mix"), new OrangeGelatinMixFluid.Flowing());
            ORANGE_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "orange_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_ORANGE_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            ORANGE_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "orange_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_ORANGE_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isPinkGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PINK_GELATIN_MIX_BUCKET));
            STILL_PINK_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "pink_gelatin_mix"), new PinkGelatinMixFluid.Still());
            FLOWING_PINK_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_pink_gelatin_mix"), new PinkGelatinMixFluid.Flowing());
            PINK_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "pink_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_PINK_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            PINK_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "pink_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_PINK_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isPurpleGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(PURPLE_GELATIN_MIX_BUCKET));
            STILL_PURPLE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "purple_gelatin_mix"), new PurpleGelatinMixFluid.Still());
            FLOWING_PURPLE_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_purple_gelatin_mix"), new PurpleGelatinMixFluid.Flowing());
            PURPLE_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "purple_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_PURPLE_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            PURPLE_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "purple_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_PURPLE_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isRedGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(RED_GELATIN_MIX_BUCKET));
            STILL_RED_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "red_gelatin_mix"), new RedGelatinMixFluid.Still());
            FLOWING_RED_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_red_gelatin_mix"), new RedGelatinMixFluid.Flowing());
            RED_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "red_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_RED_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            RED_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "red_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_RED_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isYellowGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(YELLOW_GELATIN_MIX_BUCKET));
            STILL_YELLOW_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "yellow_gelatin_mix"), new YellowGelatinMixFluid.Still());
            FLOWING_YELLOW_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_yellow_gelatin_mix"), new YellowGelatinMixFluid.Flowing());
            YELLOW_GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "yellow_gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_YELLOW_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            YELLOW_GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "yellow_gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_YELLOW_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isGelatinMixFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GELATIN_MIX_BUCKET));
            STILL_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "gelatin_mix"), new GelatinMixFluid.Still());
            FLOWING_GELATIN_MIX = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_gelatin_mix"), new GelatinMixFluid.Flowing());
            GELATIN_MIX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "gelatin_mix_block"),
                    new FluidBlock(ModFluids.STILL_GELATIN_MIX, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GELATIN_MIX_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "gelatin_mix_bucket"),
                    new BucketItem(ModFluids.STILL_GELATIN_MIX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isBerryCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(BERRY_CREAM_FROSTING_BUCKET));
            STILL_BERRY_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "berry_cream_frosting"), new BerryCreamFrostingFluid.Still());
            FLOWING_BERRY_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_berry_cream_frosting"), new BerryCreamFrostingFluid.Flowing());
            BERRY_CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "berry_cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_BERRY_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            BERRY_CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "berry_cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_BERRY_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCacaoButterFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CACAO_BUTTER_BUCKET));
            STILL_CACAO_BUTTER = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cacao_butter"), new CacaoButterFluid.Still());
            FLOWING_CACAO_BUTTER = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cacao_butter"), new CacaoButterFluid.Flowing());
            CACAO_BUTTER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cacao_butter_block"),
                    new FluidBlock(ModFluids.STILL_CACAO_BUTTER, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CACAO_BUTTER_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cacao_butter_bucket"),
                    new BucketItem(ModFluids.STILL_CACAO_BUTTER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCacaoMassFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CACAO_MASS_BUCKET));
            STILL_CACAO_MASS = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cacao_mass"), new CacaoMassFluid.Still());
            FLOWING_CACAO_MASS = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cacao_mass"), new CacaoMassFluid.Flowing());
            CACAO_MASS_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cacao_mass_block"),
                    new FluidBlock(ModFluids.STILL_CACAO_MASS, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CACAO_MASS_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cacao_mass_bucket"),
                    new BucketItem(ModFluids.STILL_CACAO_MASS, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCaramelFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CARAMEL_BUCKET));
            STILL_CARAMEL = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "caramel"), new CaramelFluid.Still());
            FLOWING_CARAMEL = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_caramel"), new CaramelFluid.Flowing());
            CARAMEL_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "caramel_block"),
                    new FluidBlock(ModFluids.STILL_CARAMEL, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CARAMEL_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "caramel_bucket"),
                    new BucketItem(ModFluids.STILL_CARAMEL, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChocolateCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_CREAM_FROSTING_BUCKET));
            STILL_CHOCOLATE_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chocolate_cream_frosting"), new ChocolateCreamFrostingFluid.Still());
            FLOWING_CHOCOLATE_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chocolate_cream_frosting"), new ChocolateCreamFrostingFluid.Flowing());
            CHOCOLATE_CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chocolate_cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_CHOCOLATE_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHOCOLATE_CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chocolate_cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_CHOCOLATE_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChocolateMilkFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHOCOLATE_MILK_BUCKET));
            STILL_CHOCOLATE_MILK = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chocolate_milk"), new ChocolateMilkFluid.Still());
            FLOWING_CHOCOLATE_MILK = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chocolate_milk"), new ChocolateMilkFluid.Flowing());
            CHOCOLATE_MILK_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chocolate_milk_block"),
                    new FluidBlock(ModFluids.STILL_CHOCOLATE_MILK, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHOCOLATE_MILK_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chocolate_milk_bucket"),
                    new BucketItem(ModFluids.STILL_CHOCOLATE_MILK, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isChorusFruitCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CHORUS_FRUIT_CREAM_FROSTING_BUCKET));
            STILL_CHORUS_FRUIT_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "chorus_fruit_cream_frosting"), new ChorusFruitCreamFrostingFluid.Still());
            FLOWING_CHORUS_FRUIT_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_chorus_fruit_cream_frosting"), new ChorusFruitCreamFrostingFluid.Flowing());
            CHORUS_FRUIT_CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "chorus_fruit_cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_CHORUS_FRUIT_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CHORUS_FRUIT_CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "chorus_fruit_cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_CHORUS_FRUIT_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(CREAM_FROSTING_BUCKET));
            STILL_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "cream_frosting"), new CreamFrostingFluid.Still());
            FLOWING_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_cream_frosting"), new CreamFrostingFluid.Flowing());
            CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isDarkChocolateFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(DARK_CHOCOLATE_BUCKET));
            STILL_DARK_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "dark_chocolate"), new DarkChocolateFluid.Still());
            FLOWING_DARK_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_dark_chocolate"), new DarkChocolateFluid.Flowing());
            DARK_CHOCOLATE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "dark_chocolate_block"),
                    new FluidBlock(ModFluids.STILL_DARK_CHOCOLATE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            DARK_CHOCOLATE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "dark_chocolate_bucket"),
                    new BucketItem(ModFluids.STILL_DARK_CHOCOLATE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isGlowBerryCreamFrostingFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(GLOW_BERRY_CREAM_FROSTING_BUCKET));
            STILL_GLOW_BERRY_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "glow_berry_cream_frosting"), new GlowBerryCreamFrostingFluid.Still());
            FLOWING_GLOW_BERRY_CREAM_FROSTING = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_glow_berry_cream_frosting"), new GlowBerryCreamFrostingFluid.Flowing());
            GLOW_BERRY_CREAM_FROSTING_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "glow_berry_cream_frosting_block"),
                    new FluidBlock(ModFluids.STILL_GLOW_BERRY_CREAM_FROSTING, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            GLOW_BERRY_CREAM_FROSTING_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "glow_berry_cream_frosting_bucket"),
                    new BucketItem(ModFluids.STILL_GLOW_BERRY_CREAM_FROSTING, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isHotChocolateFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOT_CHOCOLATE_BUCKET));
            STILL_HOT_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "hot_chocolate"), new HotChocolateFluid.Still());
            FLOWING_HOT_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_hot_chocolate"), new HotChocolateFluid.Flowing());
            HOT_CHOCOLATE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "hot_chocolate_block"),
                    new FluidBlock(ModFluids.STILL_HOT_CHOCOLATE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            HOT_CHOCOLATE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "hot_chocolate_bucket"),
                    new BucketItem(ModFluids.STILL_HOT_CHOCOLATE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isHotDarkChocolateFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOT_DARK_CHOCOLATE_BUCKET));
            STILL_HOT_DARK_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "hot_dark_chocolate"), new HotDarkChocolateFluid.Still());
            FLOWING_HOT_DARK_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_hot_dark_chocolate"), new HotDarkChocolateFluid.Flowing());
            HOT_DARK_CHOCOLATE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "hot_dark_chocolate_block"),
                    new FluidBlock(ModFluids.STILL_HOT_DARK_CHOCOLATE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            HOT_DARK_CHOCOLATE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "hot_dark_chocolate_bucket"),
                    new BucketItem(ModFluids.STILL_HOT_DARK_CHOCOLATE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isHotWhiteChocolateFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(HOT_WHITE_CHOCOLATE_BUCKET));
            STILL_HOT_WHITE_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "hot_white_chocolate"), new HotWhiteChocolateFluid.Still());
            FLOWING_HOT_WHITE_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_hot_white_chocolate"), new HotWhiteChocolateFluid.Flowing());
            HOT_WHITE_CHOCOLATE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "hot_white_chocolate_block"),
                    new FluidBlock(ModFluids.STILL_HOT_WHITE_CHOCOLATE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            HOT_WHITE_CHOCOLATE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "hot_white_chocolate_bucket"),
                    new BucketItem(ModFluids.STILL_HOT_WHITE_CHOCOLATE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
        if (CONFIG.isWhiteChocolateFluidEnabled) {
            ItemGroupEvents.modifyEntriesEvent(CreateFood.GROUP).register(entries -> entries.add(WHITE_CHOCOLATE_BUCKET));
            STILL_WHITE_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "white_chocolate"), new WhiteChocolateFluid.Still());
            FLOWING_WHITE_CHOCOLATE = Registry.register(Registries.FLUID,
                    new Identifier(CreateFood.MOD_ID, "flowing_white_chocolate"), new WhiteChocolateFluid.Flowing());
            WHITE_CHOCOLATE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateFood.MOD_ID, "white_chocolate_block"),
                    new FluidBlock(ModFluids.STILL_WHITE_CHOCOLATE, FabricBlockSettings.copyOf(Blocks.WATER)) {
                    });
            WHITE_CHOCOLATE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateFood.MOD_ID, "white_chocolate_bucket"),
                    new BucketItem(ModFluids.STILL_WHITE_CHOCOLATE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
    }
}