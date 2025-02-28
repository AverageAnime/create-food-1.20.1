package net.averageanime.createfood.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import net.averageanime.createfood.CreateFood;



@Config(name = CreateFood.MOD_ID)
@Config.Gui.CategoryBackground(category = "CreateFood", background = "minecraft:textures/block/bricks.png")
@Config.Gui.CategoryBackground(category = "CreateFoodBlock", background = "minecraft:textures/block/bricks.png")
@Config.Gui.CategoryBackground(category = "CreateFoodFluid", background = "minecraft:textures/block/bricks.png")
@Config.Gui.CategoryBackground(category = "ExpandedDelight", background = "minecraft:textures/block/quartz_bricks.png")
@Config.Gui.CategoryBackground(category = "Farmer'sDelight", background = "minecraft:textures/block/farmland_moist.png")
@Config.Gui.CategoryBackground(category = "Farmer'sRespite", background = "minecraft:textures/block/mud_bricks.png")
@Config.Gui.CategoryBackground(category = "End'sDelight", background = "minecraft:textures/block/end_stone_bricks.png")
@Config.Gui.CategoryBackground(category = "Nether'sDelight", background = "minecraft:textures/block/red_nether_bricks.png")
@Config.Gui.CategoryBackground(category = "Fright'sDelight", background = "minecraft:textures/block/sculk_catalyst_top.png")
@Config.Gui.CategoryBackground(category = "Ube'sDelight", background = "minecraft:textures/block/mushroom_block_inside.png")
@Config.Gui.CategoryBackground(category = "CulturalDelights", background = "minecraft:textures/block/prismarine_bricks.png")

public class ModConfig implements ConfigData

{
    @Comment("Enable Apple Cream Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamChocolateEnabled = true;
    @Comment("Enable Apple Cream Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamDarkChocolateEnabled = true;
    @Comment("Enable Apple Cream Frosting.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamFrostingBottleEnabled = true;
    @Comment("Enable Apple Cream White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamWhiteChocolateEnabled = true;
    @Comment("Enable Apple Cream Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Apple Cream Frosted Cupcake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamFrostedCupcakeEnabled = true;
    @Comment("Enable Apple Cream Frosted Mini Waffle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamFrostedMiniWaffleEnabled = true;
    @Comment("Enable Apple Cream Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamFrostedSweetRollEnabled = true;
    @Comment("Enable Apple Cream Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamGlazedChocolateDonutEnabled = true;
    @Comment("Enable Apple Cream Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamGlazedDonutEnabled = true;
    @Comment("Enable Apple Cream Chocolate Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamChocolatePastryBarEnabled = true;
    @Comment("Enable Apple Cream Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamPastryBarEnabled = true;
    @Comment("Enable Apple Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleIceCreamBowlEnabled = true;
    @Comment("Enable Apple Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleIceCreamConeEnabled = true;
    @Comment("Enable Scoop of Apple Ice Cream.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleIceCreamStickEnabled = true;
    @Comment("Enable Apple Jam Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleJamBottleEnabled = true;
    @Comment("Enable Apple Jam Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleJamSandwichEnabled = true;
    @Comment("Enable Apple Juice Bottle. Recommend 'disable' with Expanded Delight installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleJuiceBottleEnabled = true;
    @Comment("Enable Apple Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleMilkshakeBottleEnabled = true;
    @Comment("Enable Apple Popsicle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isApplePopsicleEnabled = true;
    @Comment("Enable Apple Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleSliceEnabled = true;
    @Comment("Enable Bacon Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBaconCalzoneEnabled = true;
    @Comment("Enable Bacon Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBaconSandwichEnabled = true;
    @Comment("Enable Bacon Sandwich (Lettuce).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBaconSandwichLettuceEnabled = true;
    @Comment("Enable Bar of Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateBarEnabled = true;
    @Comment("Enable Bar of White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateBarEnabled = true;
    @Comment("Enable Beef Bun.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunEnabled = true;
    @Comment("Enable Beef Bun (Bacon).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunBaconEnabled = true;
    @Comment("Enable Berry Cream Filled Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamChocolateEnabled = true;
    @Comment("Enable Berry Cream Filled Chocolate Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamChocolatePastryBarEnabled = true;
    @Comment("Enable Berry Cream Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamDarkChocolateEnabled = true;
    @Comment("Enable Berry Cream Filled Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamPastryBarEnabled = true;
    @Comment("Enable Berry Cream Filled White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamWhiteChocolateEnabled = true;
    @Comment("Enable Berry Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostingBottleEnabled = true;
    @Comment("Enable Berry Cream Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Berry Cream Frosted Chocolate Sweet Roll (Sweet Berry).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedChocolateSweetRollSweetBerryEnabled = true;
    @Comment("Enable Berry Cream Frosted Cupcake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedCupcakeEnabled = true;
    @Comment("Enable Berry Cream Frosted Mini Waffle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedMiniWaffleEnabled = true;
    @Comment("Enable Berry Cream Frosted Mini Waffle (Sweet Berry).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedMiniWaffleSweetBerryEnabled = true;
    @Comment("Enable Berry Cream Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedSweetRollEnabled = true;
    @Comment("Enable Berry Cream Frosted Sweet Roll (Sweet Berry).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedSweetRollSweetBerryEnabled = true;
    @Comment("Enable Berry Cream Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamGlazedChocolateDonutEnabled = true;
    @Comment("Enable Berry Cream Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamGlazedDonutEnabled = true;
    @Comment("Enable Berry Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryIceCreamBowlEnabled = true;
    @Comment("Enable Berry Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryIceCreamConeEnabled = true;
    @Comment("Enable Scoop of Berry Ice Cream.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryIceCreamStickEnabled = true;
    @Comment("Enable Berry Jam Bottle. Recommend 'disable' with Expanded Delight installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryJamBottleEnabled = true;
    @Comment("Enable Berry Jam Sandwich. Recommend 'disable' with Expanded Delight installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryJamSandwichEnabled = true;
    @Comment("Enable Berry Juice Bottle. Recommend 'disable' with Expanded Delight installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryJuiceBottleEnabled = true;
    @Comment("Enable Berry Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryMilkshakeBottleEnabled = true;
    @Comment("Enable Berry Popsicle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryPopsicleEnabled = true;
    @Comment("Enable Biscuit.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBiscuitEnabled = true;
    @Comment("Enable Black Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlackGelatinDessertSliceEnabled = true;
    @Comment("Enable Blackstrap Molasses.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlackstrapMolassesBottleEnabled = true;
    @Comment("Enable Blue Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlueGelatinDessertSliceEnabled = true;
    @Comment("Enable Brown Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBrownGelatinDessertSliceEnabled = true;
    @Comment("Enable Brown Sugar. Recommend 'disable' with Ube's Delight installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBrownSugarEnabled = true;
    @Comment("Enable Bread (Fried Egg).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadFriedEggEnabled = true;
    @Comment("Enable Bread (Lettuce).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadLettuceEnabled = true;
    @Comment("Enable Bread (Lettuce, Carrot).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadLettuceCarrotEnabled = true;
    @Comment("Enable Bread Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceEnabled = true;
    @Comment("Enable Bread Slice (Apple Jam).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceAppleJamEnabled = true;
    @Comment("Enable Bread Slice (Bacon).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceBaconEnabled = true;
    @Comment("Enable Bread Slice (Bacon, Lettuce).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceBaconLettuceEnabled = true;
    @Comment("Enable Bread Slice (Bacon, Lettuce, Tomato).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceBaconLettuceTomatoEnabled = true;
    @Comment("Enable Bread Slice (Beetroot).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceBeetrootEnabled = true;
    @Comment("Enable Bread Slice (Beetroot, Lettuce).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceBeetrootLettuceEnabled = true;
    @Comment("Enable Bread Slice (Berry Jam).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceBerryJamEnabled = true;
    @Comment("Enable Bread Slice (Cheese).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceCheeseEnabled = true;
    @Comment("Enable Bread Slice (Chorus Fruit Jam).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceChorusFruitJamEnabled = true;
    @Comment("Enable Bread Slice (Glow Berry Jam).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceGlowBerryJamEnabled = true;
    @Comment("Enable Bread Slice (Honey).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceHoneyEnabled = true;
    @Comment("Enable Bread Slice (Lettuce).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceLettuceEnabled = true;
    @Comment("Enable Bread Slice (Lettuce, Tomato).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceLettuceTomatoEnabled = true;
    @Comment("Enable Bread Slice (Melon Jam).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceMelonJamEnabled = true;
    @Comment("Enable Bread Slice (Mutton).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceMuttonEnabled = true;
    @Comment("Enable Bread Slice (Mutton, Beetroot).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSliceMuttonBeetrootEnabled = true;
    @Comment("Enable Breakfast Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreakfastBarEnabled = true;
    @Comment("Enable Breakfast Plate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreakfastPlateEnabled = true;
    @Comment("Enable Breakfast Sausages.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreakfastSausagesEnabled = true;
    @Comment("Enable Bun. Recommend 'disable' with Bakery installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBunEnabled = true;
    @Comment("Enable Butter.  Recommend 'disable' if Croptopia or Candlelight installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterEnabled = true;
    @Comment("Enable Butter Dough.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterDoughEnabled = true;
    @Comment("Enable Butter Dough (Small).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterDoughSmallEnabled = true;
    @Comment("Enable Butterscotch.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchEnabled = true;
    @Comment("Enable Butterscotch Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchChipsEnabled = true;
    @Comment("Enable Butterscotch Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchChipsChocolateCookieEnabled = true;
    @Comment("Enable Butterscotch Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchChipsCookieEnabled = true;
    @Comment("Enable Butterscotch Chip Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchChipIceCreamConeEnabled = true;
    @Comment("Enable Butterscotch Chip Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchChipMilkshakeBottleEnabled = true;
    @Comment("Enable Butterscotch Chip Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchChipMuffinEnabled = true;
    @Comment("Enable Butterscotch Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchFudgeEnabled = true;
    @Comment("Enable Buttered Toast.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButteredToastEnabled = true;
    @Comment("Enable Cacao Butter.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCacaoButterEnabled = true;
    @Comment("Enable Cacao Nibs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCacaoNibsEnabled = true;
    @Comment("Enable Cake Base. Recommend 'disable' if Create Additions or Bakery installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCakeBaseEnabled = true;
    @Comment("Enable Caramel.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelEnabled = true;
    @Comment("Enable Caramel Apple Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelAppleSliceEnabled = true;
    @Comment("Enable Caramel Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChipsEnabled = true;
    @Comment("Enable Caramel Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChipsChocolateCookieEnabled = true;
    @Comment("Enable Caramel Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChipsCookieEnabled = true;
    @Comment("Enable Caramel Chip Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChipIceCreamConeEnabled = true;
    @Comment("Enable Caramel Chip Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChipMilkshakeBottleEnabled = true;
    @Comment("Enable Caramel Chip Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChipMuffinEnabled = true;
    @Comment("Enable Caramel Filled Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChocolateEnabled = true;
    @Comment("Enable Caramel Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelDarkChocolateEnabled = true;
    @Comment("Enable Caramel Filled Chocolate Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChocolatePastryBarEnabled = true;
    @Comment("Enable Caramel Filled Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelPastryBarEnabled = true;
    @Comment("Enable Caramel Filled White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelWhiteChocolateEnabled = true;
    @Comment("Enable Caramel Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelFudgeEnabled = true;
    @Comment("Enable Caramel Glazed Apple.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelGlazedAppleEnabled = true;
    @Comment("Enable Caramel Glazed Berries.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelGlazedBerriesEnabled = true;
    @Comment("Enable Caramel Glazed Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelGlazedChocolateSweetRollEnabled = true;
    @Comment("Enable Caramel Glazed Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelGlazedSweetRollEnabled = true;
    @Comment("Enable Caramel Glazed Toast.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelToastEnabled = true;
    @Comment("Enable Cheese and Beef Bun.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Bacon).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunBaconEnabled = true;
    @Comment("Enable Cheese and Chicken Bun.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndChickenBunEnabled = true;
    @Comment("Enable Cheese and Sausage Biscuit.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndSausageBiscuitEnabled = true;
    @Comment("Enable Cheese and Sausage Biscuit Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndSausageBiscuitSandwichEnabled = true;
    @Comment("Enable Cheese Biscuit.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseBiscuitEnabled = true;
    @Comment("Enable Cheese Biscuit Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseBiscuitSandwichEnabled = true;
    @Comment("Enable Cheese (Block & Slice). Recommend 'disable' if Expanded Delight, Brewin' and Chewin', or Meadow installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseEnabled = true;
    @Comment("Enable Cheese Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseCalzoneEnabled = true;
    @Comment("Enable Cheese Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseSandwichEnabled = true;
    @Comment("Enable Cheeseburger.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerEnabled = true;
    @Comment("Enable Cheeseburger (Bacon).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerBaconEnabled = true;
    @Comment("Enable Chicken Bun.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBunEnabled = true;
    @Comment("Enable Chicken Burger.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBurgerEnabled = true;
    @Comment("Enable Chicken Cheeseburger.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenCheeseburgerEnabled = true;
    @Comment("Enable Chicken Nuggets.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenNuggetsEnabled = true;
    @Comment("Enable Chicken Patty.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenPattyEnabled = true;
    @Comment("Enable Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateBottleEnabled = true;
    @Comment("Enable Chocolate Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateChipsEnabled = true;
    @Comment("Enable Chocolate Chip Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateChipIceCreamConeEnabled = true;
    @Comment("Enable Chocolate Chip Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateChipMilkshakeBottleEnabled = true;
    @Comment("Enable Chocolate Chip Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateChipMuffinEnabled = true;
    @Comment("Enable Chocolate Cookie. Recommend 'disable' with Expanded Delight installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCookieEnabled = true;
    @Comment("Enable Chocolate Covered Marshmallow Stick.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCoveredMarshmallowStickEnabled = true;
    @Comment("Enable Chocolate Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamFrostingBottleEnabled = true;
    @Comment("Enable Chocolate Cream Frosted Cupcake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamFrostedCupcakeEnabled = true;
    @Comment("Enable Chocolate Cream Frosted Mini Waffle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamFrostedMiniWaffleEnabled = true;
    @Comment("Enable Chocolate Donut Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateDonutBaseEnabled = true;
    @Comment("Enable Chocolate Donut Hole.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateDonutHoleEnabled = true;
    @Comment("Enable Chocolate Donut Hole (Sugar).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateDonutHoleSugarEnabled = true;
    @Comment("Enable Chocolate Donut (Sugar).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateDonutSugarEnabled = true;
    @Comment("Enable Chocolate Filled Chocolate Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateChocolatePastryEnabled = true;
    @Comment("Enable Chocolate Filled Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolatePastryEnabled = true;
    @Comment("Enable Chocolate Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Chocolate Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateFrostedSweetRollEnabled = true;
    @Comment("Enable Chocolate Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateFudgeEnabled = true;
    @Comment("Enable Chocolate Glazed Apple.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGlazedAppleEnabled = true;
    @Comment("Enable Chocolate Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGlazedChocolateDonutEnabled = true;
    @Comment("Enable Chocolate Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGlazedDonutEnabled = true;
    @Comment("Enable Chocolate Graham Cracker.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGrahamCrackerEnabled = true;
    @Comment("Enable Chocolate Graham Cracker Crumbs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGrahamCrackerCrumbsEnabled = true;
    @Comment("Enable Chocolate Graham Cracker (Ice Cream).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGrahamCrackerIceCreamEnabled = true;
    @Comment("Enable Chocolate Graham Cracker (Neapolitan, Scoop #1).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGrahamCrackerNeapolitanScoop1Enabled = true;
    @Comment("Enable Chocolate Graham Cracker (Neapolitan, Scoop #2).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGrahamCrackerNeapolitanScoop2Enabled = true;
    @Comment("Enable Chocolate Graham Cracker (Neapolitan, Scoop #3).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGrahamCrackerNeapolitanScoop3Enabled = true;
    @Comment("Enable Chocolate Graham Cracker Pie Crust.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateGrahamCrackerPieCrustEnabled = true;
    @Comment("Enable Chocolate Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateIceCreamBowlEnabled = true;
    @Comment("Enable Chocolate Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateIceCreamConeEnabled = true;
    @Comment("Enable Scoop of Chocolate Ice Cream.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateIceCreamStickEnabled = true;
    @Comment("Enable Chocolate Milk Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateMilkBottleEnabled = true;
    @Comment("Enable Chocolate Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateMilkshakeBottleEnabled = true;
    @Comment("Enable Chocolate Pastry Bar Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolatePastryBarBaseEnabled = true;
    @Comment("Enable Chocolate Pastry Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolatePastryBaseEnabled = true;
    @Comment("Enable Chocolate Sugar Dough.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateSugarDoughEnabled = true;
    @Comment("Enable Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateSweetRollEnabled = true;
    @Comment("Enable Chocolate Sweet Roll Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateSweetRollBaseEnabled = true;
    @Comment("Enable Chocolate Toast.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateToastEnabled = true;
    @Comment("Enable Cloth Filter.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isClothFilterEnabled = true;
    @Comment("Enable Cloth Filter (Cacao Mass).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isClothFilterCacaoMassEnabled = true;
    @Comment("Enable Cocoa Powder.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCocoaPowderEnabled = true;
    @Comment("Enable Condensed Milk.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCondensedMilkBottleEnabled = true;
    @Comment("Enable Cookie Crumbs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCookieCrumbsEnabled = true;
    @Comment("Enable Cotton Candy.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCottonCandyStickEnabled = true;
    @Comment("Enable Chorus Fruit Cream Filled Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamChocolateEnabled = true;
    @Comment("Enable Chorus Fruit Cream Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamDarkChocolateEnabled = true;
    @Comment("Enable Chorus Fruit Cream Filled White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamWhiteChocolateEnabled = true;
    @Comment("Enable Chorus Fruit Cream Filled Chocolate Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamChocolatePastryBarEnabled = true;
    @Comment("Enable Chorus Fruit Cream Filled Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamPastryBarEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostingBottleEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Chocolate Sweet Roll (Chorus Fruit).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedChocolateSweetRollChorusFruitEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Cupcake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedCupcakeEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Mini Waffle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedMiniWaffleEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Mini Waffle (Chorus Fruit).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedMiniWaffleChorusFruitEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedSweetRollEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Sweet Roll (Chorus Fruit).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedSweetRollChorusFruitEnabled = true;
    @Comment("Enable Chorus Fruit Cream Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamGlazedChocolateDonutEnabled = true;
    @Comment("Enable Chorus Fruit Cream Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamGlazedDonutEnabled = true;
    @Comment("Enable Chorus Fruit Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitIceCreamBowlEnabled = true;
    @Comment("Enable Chorus Fruit Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitIceCreamConeEnabled = true;
    @Comment("Enable Scoop of Chorus Fruit Ice Cream.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitIceCreamStickEnabled = true;
    @Comment("Enable Chorus Fruit Jam Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitJamBottleEnabled = true;
    @Comment("Enable Chorus Fruit Jam Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitJamSandwichEnabled = true;
    @Comment("Enable Chorus Fruit Juice Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitJuiceBottleEnabled = true;
    @Comment("Enable Chorus Fruit Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitMilkshakeBottleEnabled = true;
    @Comment("Enable Chorus Fruit Popsicle. Recommend 'disable' with End's Delight installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitPopsicleEnabled = true;
    @Comment("Enable Chorus Fruit Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitSliceEnabled = true;
    @Comment("Enable Cream Cheese.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamCheeseEnabled = true;
    @Comment("Enable Cream Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamChocolateEnabled = true;
    @Comment("Enable Cream Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamDarkChocolateEnabled = true;
    @Comment("Enable Cream Filled Chocolate Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamChocolatePastryEnabled = true;
    @Comment("Enable Cream Filled Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamPastryEnabled = true;
    @Comment("Enable Cream White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamWhiteChocolateEnabled = true;
    @Comment("Enable Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamFrostingBottleEnabled = true;
    @Comment("Enable Cupcake Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCupcakeBaseEnabled = true;
    @Comment("Enable Cyan Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCyanGelatinDessertSliceEnabled = true;
    @Comment("Enable Dark Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChipsChocolateCookieEnabled = true;
    @Comment("Enable Dark Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChipsCookieEnabled = true;
    @Comment("Enable Dark Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateBottleEnabled = true;
    @Comment("Enable Dark Chocolate Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateChipsEnabled = true;
    @Comment("Enable Dark Chocolate Chip Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateChipIceCreamConeEnabled = true;
    @Comment("Enable Dark Chocolate Chip Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateChipMuffinEnabled = true;
    @Comment("Enable Dark Chocolate Covered Marshmallow Stick.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateCoveredMarshmallowStickEnabled = true;
    @Comment("Enable Dark Chocolate Filled Chocolate Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateChocolatePastryEnabled = true;
    @Comment("Enable Dark Chocolate Filled Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolatePastryEnabled = true;
    @Comment("Enable Dark Chocolate Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateFudgeEnabled = true;
    @Comment("Enable Dark Chocolate Glazed Apple.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateGlazedAppleEnabled = true;
    @Comment("Enable Dark Chocolate Glazed Berries.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateGlazedBerriesEnabled = true;
    @Comment("Enable Dark Chocolate Toast.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateToastEnabled = true;
    @Comment("Enable Donut Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDonutBaseEnabled = true;
    @Comment("Enable Donut Hole.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDonutHoleEnabled = true;
    @Comment("Enable Donut Hole (Sugar).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDonutHoleSugarEnabled = true;
    @Comment("Enable Donut (Sugar).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDonutSugarEnabled = true;
    @Comment("Enable Dumpling Wrappers.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDumplingWrappersEnabled = true;
    @Comment("Enable Egg Powder.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggPowderEnabled = true;
    @Comment("Enable Fish Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFishCalzoneEnabled = true;
    @Comment("Enable Frosted Cake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFrostedCakeEnabled = true;
    @Comment("Enable Frosted Cupcake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFrostedCupcakeEnabled = true;
    @Comment("Enable Frosted Mini Waffle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFrostedMiniWaffleEnabled = true;
    @Comment("Enable Fried Egg & Hash Brown Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFriedEggAndHashBrownSandwichEnabled = true;
    @Comment("Enable Fried Egg Plate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFriedEggPlateEnabled = true;
    @Comment("Enable Fruit Smoothie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFruitSmoothieBottleEnabled = true;
    @Comment("Enable Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamGlazedChocolateDonutEnabled = true;
    @Comment("Enable Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamGlazedDonutEnabled = true;
    @Comment("Enable Gelatin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGelatinEnabled = true;
    @Comment("Enable Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGelatinDessertSliceEnabled = true;
    @Comment("Enable Glow Berry Cream Filled Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamChocolateEnabled = true;
    @Comment("Enable Glow Berry Cream Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamDarkChocolateEnabled = true;
    @Comment("Enable Glow Berry Cream Filled White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamWhiteChocolateEnabled = true;
    @Comment("Enable Glow Berry Cream Filled Chocolate Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamChocolatePastryBarEnabled = true;
    @Comment("Enable Glow Berry Cream Filled Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamPastryBarEnabled = true;
    @Comment("Enable Glow Berry Cream Frosting Jar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostingBottleEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Chocolate Sweet Roll (Glow Berry).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedChocolateSweetRollGlowBerryEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Cupcake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedCupcakeEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Mini Waffle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedMiniWaffleEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Mini Waffle (Glow Berry).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedMiniWaffleGlowBerryEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedSweetRollEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Sweet Roll (Glow Berry).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedSweetRollGlowBerryEnabled = true;
    @Comment("Enable Glow Berry Cream Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamGlazedChocolateDonutEnabled = true;
    @Comment("Enable Glow Berry Cream Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamGlazedDonutEnabled = true;
    @Comment("Enable Glow Berry Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryIceCreamBowlEnabled = true;
    @Comment("Enable Glow Berry Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryIceCreamConeEnabled = true;
    @Comment("Enable Scoop of Glow Berry Ice Cream.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryIceCreamStickEnabled = true;
    @Comment("Enable Glow Berry Jam Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryJamBottleEnabled = true;
    @Comment("Enable Glow Berry Jam Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryJamSandwichEnabled = true;
    @Comment("Enable Glow Berry Juice Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryJuiceBottleEnabled = true;
    @Comment("Enable Glow Berry Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryMilkshakeBottleEnabled = true;
    @Comment("Enable Glow Berry Popsicle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryPopsicleEnabled = true;
    @Comment("Enable Graham Cracker.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrahamCrackerEnabled = true;
    @Comment("Enable Graham Cracker (Chocolate).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrahamCrackerChocolateEnabled = true;
    @Comment("Enable Graham Cracker (Chocolate, Marshmallow).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrahamCrackerChocolateMarshmallowEnabled = true;
    @Comment("Enable Graham Cracker Crumbs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrahamCrackerCrumbsEnabled = true;
    @Comment("Enable Graham Cracker (Marshmallow).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrahamCrackerMarshmallowEnabled = true;
    @Comment("Enable Graham Cracker Pie Crust.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrahamCrackerPieCrustEnabled = true;
    @Comment("Enable Gray Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrayGelatinDessertSliceEnabled = true;
    @Comment("Enable Green Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGreenGelatinDessertSliceEnabled = true;
    @Comment("Enable Ground Beef.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGroundBeefEnabled = true;
    @Comment("Enable Grilled Cheese Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrilledCheeseSandwichEnabled = true;
    @Comment("Enable Hamburger.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerEnabled = true;
    @Comment("Enable Hamburger (Bacon).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerBaconEnabled = true;
    @Comment("Enable Hash Browns.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHashBrownsEnabled = true;
    @Comment("Enable Hash Browns & Fried Egg Plate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHashBrownAndFriedEggPlateEnabled = true;
    @Comment("Enable Hash Browns Plate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHashBrownPlateEnabled = true;
    @Comment("Enable Hash Browns & Toast Plate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHashBrownAndToastPlateEnabled = true;
    @Comment("Enable Hollow Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHollowChocolateEnabled = true;
    @Comment("Enable Hollow Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHollowDarkChocolateEnabled = true;
    @Comment("Enable Hollow White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHollowWhiteChocolateEnabled = true;
    @Comment("Enable Honeyed Berries.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedBerriesEnabled = true;
    @Comment("Enable Honeyed Biscuit.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedBiscuitEnabled = true;
    @Comment("Enable Honeyed Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedChocolateSweetRollEnabled = true;
    @Comment("Enable Honeyed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedChocolateDonutEnabled = true;
    @Comment("Enable Honeyed Cupcake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedCupcakeEnabled = true;
    @Comment("Enable Honeyed Mini Waffle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedMiniWaffleEnabled = true;
    @Comment("Enable Honeyed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedDonutEnabled = true;
    @Comment("Enable Honeyed Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedMuffinEnabled = true;
    @Comment("Enable Honey Glazed Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedSweetRollEnabled = true;
    @Comment("Enable Honeyed Toast.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHoneyedToastEnabled = true;
    @Comment("Enable Hot Cheese & Sausage Biscuit Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotCheeseAndSausageBiscuitSandwichEnabled = true;
    @Comment("Enable Hot Cheese Biscuit Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotCheeseBiscuitSandwichEnabled = true;
    @Comment("Enable Hot Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotChocolateBottleEnabled = true;
    @Comment("Enable Hot Dark Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotDarkChocolateBottleEnabled = true;
    @Comment("Enable Hot Sausage Biscuit Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotSausageBiscuitSandwichEnabled = true;
    @Comment("Enable Hot White Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotWhiteChocolateBottleEnabled = true;
    @Comment("Enable Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isIceCreamBowlEnabled = true;
    @Comment("Enable Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isIceCreamConeEnabled = true;
    @Comment("Enable Ice Cream Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isIceCreamSandwichEnabled = true;
    @Comment("Enable Ice Cream Sandwich (Neapolitan).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isIceCreamSandwichNeapolitanEnabled = true;
    @Comment("Enable Scoop of Ice Cream.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isIceCreamStickEnabled = true;
    @Comment("Enable Light Blue Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLightBlueGelatinDessertSliceEnabled = true;
    @Comment("Enable Light Gray Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLightGrayGelatinDessertSliceEnabled = true;
    @Comment("Enable Lime Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLimeGelatinDessertSliceEnabled = true;
    @Comment("Enable Magenta Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMagentaGelatinDessertSliceEnabled = true;
    @Comment("Enable Marshmallow.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowEnabled = true;
    @Comment("Enable Marshmallow Butterscotch Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowButterscotchFudgeEnabled = true;
    @Comment("Enable Marshmallow Caramel Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowCaramelFudgeEnabled = true;
    @Comment("Enable Marshmallow Chocolate Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowChocolateFudgeEnabled = true;
    @Comment("Enable Marshmallow Dark Chocolate Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowDarkChocolateFudgeEnabled = true;
    @Comment("Enable Marshmallow Toffee Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowToffeeFudgeEnabled = true;
    @Comment("Enable Marshmallow White Chocolate Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowWhiteChocolateFudgeEnabled = true;
    @Comment("Enable Marshmallow Filled Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowChocolateEnabled = true;
    @Comment("Enable Marshmallow Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowDarkChocolateEnabled = true;
    @Comment("Enable Marshmallow Filled White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowWhiteChocolateEnabled = true;
    @Comment("Enable Marshmallow Stick.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowStickEnabled = true;
    @Comment("Enable Meatball.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMeatballEnabled = true;
    @Comment("Enable Meatball Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMeatballSandwichEnabled = true;
    @Comment("Enable Meatball Stick.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMeatballStickEnabled = true;
    @Comment("Enable Melon Cream Filled Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamChocolateEnabled = true;
    @Comment("Enable Melon Cream Filled Dark Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamDarkChocolateEnabled = true;
    @Comment("Enable Melon Cream Filled Chocolate Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamChocolatePastryBarEnabled = true;
    @Comment("Enable Melon Cream Filled Pastry Bar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamPastryBarEnabled = true;
    @Comment("Enable Melon Cream Filled White Chocolate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamWhiteChocolateEnabled = true;
    @Comment("Enable Melon Cream Frosted Chocolate Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamFrostedChocolateSweetRollEnabled = true;
    @Comment("Enable Melon Cream Frosted Cupcake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamFrostedCupcakeEnabled = true;
    @Comment("Enable Melon Cream Frosted Mini Waffle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamFrostedMiniWaffleEnabled = true;
    @Comment("Enable Melon Cream Frosted Sweet Roll.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamFrostedSweetRollEnabled = true;
    @Comment("Enable Melon Cream Frosting.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamFrostingBottleEnabled = true;
    @Comment("Enable Melon Cream Glazed Chocolate Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamGlazedChocolateDonutEnabled = true;
    @Comment("Enable Melon Cream Glazed Donut.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamGlazedDonutEnabled = true;
    @Comment("Enable Melon Ice Cream Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonIceCreamBowlEnabled = true;
    @Comment("Enable Melon Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonIceCreamConeEnabled = true;
    @Comment("Enable Scoop of Melon Ice Cream.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonIceCreamStickEnabled = true;
    @Comment("Enable Melon Jam.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonJamBottleEnabled = true;
    @Comment("Enable Melon Jam Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonJamSandwichEnabled = true;
    @Comment("Enable Melon Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonMilkshakeBottleEnabled = true;
    @Comment("Enable Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMilkshakeBottleEnabled = true;
    @Comment("Enable Mini Chocolate Graham Cracker Pie Crust.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMiniChocolateGrahamCrackerPieCrustEnabled = true;
    @Comment("Enable Mini Chocolate Pie (Graham Cracker).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMiniChocolatePieGrahamCrackerEnabled = true;
    @Comment("Enable Mini Cookies & Cream Pie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMiniCookieCreamPieEnabled = true;
    @Comment("Enable Mini Cream Pie (Chocolate Graham Cracker).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMiniCreamPieChocolateGrahamCrackerEnabled = true;
    @Comment("Enable Mini Cream Pie (Graham Cracker).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMiniCreamPieGrahamCrackerEnabled = true;
    @Comment("Enable Mini Graham Cracker Pie Crust.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMiniGrahamCrackerPieCrustEnabled = true;
    @Comment("Enable Mini S'mores Pie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMiniSmoresPieEnabled = true;
    @Comment("Enable Milk Powder. Recommend 'disable' with Ube's Delight installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMilkPowderEnabled = true;
    @Comment("Enable Molasses.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMolassesBottleEnabled = true;
    @Comment("Enable Muffin Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMuffinBaseEnabled = true;
    @Comment("Enable Mushroom Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMushroomCalzoneEnabled = true;
    @Comment("Enable Mutton Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMuttonSandwichEnabled = true;
    @Comment("Enable Mutton Sandwich (Beetroot).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMuttonSandwichBeetrootEnabled = true;
    @Comment("Enable Onion Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isOnionCalzoneEnabled = true;
    @Comment("Enable Orange Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isOrangeGelatinDessertSliceEnabled = true;
    @Comment("Enable Pasta.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaEnabled = true;
    @Comment("Enable Pasta Plate. Recommend 'disable' with Delightful Creators installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateEnabled = true;
    @Comment("Enable Pasta Plate with Butter.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateButterEnabled = true;
    @Comment("Enable Pasta with Endermite Meatballs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateEndermiteMeatballsEnabled = true;
    @Comment("Enable Pasta With Endermite Meatballs & Tomato Sauce.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateEndermiteMeatballsTomatoSauceEnabled = true;
    @Comment("Enable Pasta with Fish.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateFishEnabled = true;
    @Comment("Enable Pasta with Meatballs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateMeatballsEnabled = true;
    @Comment("Enable Pasta with Mutton Chop.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateMuttonChopEnabled = true;
    @Comment("Enable Pasta with Slime.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateSlimeEnabled = true;
    @Comment("Enable Pasta with Slimeballs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateSlimeballsEnabled = true;
    @Comment("Enable Pasta with Strider Meatballs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateStriderMeatballsEnabled = true;
    @Comment("Enable Pasta with Strider Meatballs & Tomato Sauce.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateStriderMeatballsTomatoSauceEnabled = true;
    @Comment("Enable Pasta with Squid Ink.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateSquidInkEnabled = true;
    @Comment("Enable Pastry Bar Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastryBarBaseEnabled = true;
    @Comment("Enable Pastry Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastryBaseEnabled = true;
    @Comment("Enable Pink Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPinkGelatinDessertSliceEnabled = true;
    @Comment("Enable Potato Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPotatoChipsEnabled = true;
    @Comment("Enable Potato Chip Bowl.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPotatoChipBowlEnabled = true;
    @Comment("Enable Powdered Sugar.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPowderedSugarEnabled = true;
    @Comment("Enable Pressed Cocoa.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPressedCocoaEnabled = true;
    @Comment("Enable Pumpernickel Bread.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPumpernickelBreadEnabled = true;
    @Comment("Enable Pumpernickel Bread Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPumpernickelBreadSliceEnabled = true;
    @Comment("Enable Pumpernickel Dough.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPumpernickelDoughEnabled = true;
    @Comment("Enable Pumpernickel Toast Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPumpernickelToastSliceEnabled = true;
    @Comment("Enable Purple Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPurpleGelatinDessertSliceEnabled = true;
    @Comment("Enable Raw Bacon Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawBaconCalzoneEnabled = true;
    @Comment("Enable Raw Butterscotch Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawButterscotchChipsChocolateCookieEnabled = true;
    @Comment("Enable Raw Butterscotch Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawButterscotchChipsCookieEnabled = true;
    @Comment("Enable Raw Butterscotch Chip Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawButterscotchChipMuffinEnabled = true;
    @Comment("Enable Raw Cake Base. Recommend 'disable' if Create Additions installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCakeBaseEnabled = true;
    @Comment("Enable Raw Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCalzoneEnabled = true;
    @Comment("Enable Raw Caramel Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCaramelChipsChocolateCookieEnabled = true;
    @Comment("Enable Raw Caramel Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCaramelChipsCookieEnabled = true;
    @Comment("Enable Raw Caramel Chip Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCaramelChipMuffinEnabled = true;
    @Comment("Enable Raw Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolateCookieEnabled = true;
    @Comment("Enable Raw Chocolate Chip Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolateChipMuffinEnabled = true;
    @Comment("Enable Raw Chocolate Pastry Bar Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolatePastryBarBaseEnabled = true;
    @Comment("Enable Raw Chocolate Pastry Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolatePastryBaseEnabled = true;
    @Comment("Enable Raw Chocolate Sweet Roll Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolateSweetRollBaseEnabled = true;
    @Comment("Enable Raw Cheese Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCheeseCalzoneEnabled = true;
    @Comment("Enable Raw Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCookieEnabled = true;
    @Comment("Enable Raw Cupcake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCupcakeEnabled = true;
    @Comment("Enable Raw Dark Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawDarkChipsChocolateCookieEnabled = true;
    @Comment("Enable Raw Dark Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawDarkChipsCookieEnabled = true;
    @Comment("Enable Raw Dark Chocolate Chip Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawDarkChocolateChipMuffinEnabled = true;
    @Comment("Enable Raw Fish Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawFishCalzoneEnabled = true;
    @Comment("Enable Raw Meatball.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMeatballEnabled = true;
    @Comment("Enable Raw Mini Chocolate Pie (Graham Cracker).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMiniChocolatePieGrahamCrackerEnabled = true;
    @Comment("Enable Raw Mini Cream Pie (Chocolate Graham Cracker).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMiniCreamPieChocolateGrahamCrackerEnabled = true;
    @Comment("Enable Raw Mini Cream Pie (Graham Cracker).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMiniCreamPieGrahamCrackerEnabled = true;
    @Comment("Enable Raw Mini Chocolate Graham Cracker Pie Crust.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMiniChocolateGrahamCrackerPieCrustEnabled = true;
    @Comment("Enable Raw Mini Graham Cracker Pie Crust.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMiniGrahamCrackerPieCrustEnabled = true;
    @Comment("Enable Raw Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMuffinEnabled = true;
    @Comment("Enable Raw Mushroom Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMushroomCalzoneEnabled = true;
    @Comment("Enable Raw Onion Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawOnionCalzoneEnabled = true;
    @Comment("Enable Raw Pastry Bar Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawPastryBarBaseEnabled = true;
    @Comment("Enable Raw Pastry Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawPastryBaseEnabled = true;
    @Comment("Enable Raw Sausage Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSausageCalzoneEnabled = true;
    @Comment("Enable Raw Sausage Patty.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSausagePattyEnabled = true;
    @Comment("Enable Raw Sweet Roll Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSweetRollBaseEnabled = true;
    @Comment("Enable Raw Toffee Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawToffeeChipsChocolateCookieEnabled = true;
    @Comment("Enable Raw Toffee Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawToffeeChipsCookieEnabled = true;
    @Comment("Enable Raw Toffee Chip Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawToffeeChipMuffinEnabled = true;
    @Comment("Enable Raw White Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawWhiteChipsChocolateCookieEnabled = true;
    @Comment("Enable Raw White Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawWhiteChipsCookieEnabled = true;
    @Comment("Enable Raw White Chocolate Chip Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawWhiteChocolateChipMuffinEnabled = true;
    @Comment("Enable Red Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRedGelatinDessertSliceEnabled = true;
    @Comment("Enable S'more.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSmoreEnabled = true;
    @Comment("Enable Salt. Recommend 'disable' with Croptopia, Expanded Delight, Brewin' and Chewin', or Meadow installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSaltEnabled = true;
    @Comment("Enable Salt Dough.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSaltDoughEnabled = true;
    @Comment("Enable Salt Dough (Small).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSaltDoughSmallEnabled = true;
    @Comment("Enable Sausage Biscuit.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausageBiscuitEnabled = true;
    @Comment("Enable Sausage Biscuit Sandwich.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausageBiscuitSandwichEnabled = true;
    @Comment("Enable Sausage Calzone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausageCalzoneEnabled = true;
    @Comment("Enable Sausage Meat.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausageMeatEnabled = true;
    @Comment("Enable Sausage Patty.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausagePattyEnabled = true;
    @Comment("Enable Shredded Chicken.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isShreddedChickenEnabled = true;
    @Comment("Enable Shredded Potato.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isShreddedPotatoEnabled = true;
    @Comment("Enable Sliced Beetroot.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSlicedBeetrootEnabled = true;
    @Comment("Enable Sliced Potato.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSlicedPotatoEnabled = true;
    @Comment("Enable Sliced Carrot.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSlicedCarrotEnabled = true;
    @Comment("Enable Small Meatballs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSmallMeatballsEnabled = true;
    @Comment("Enable Small Slimeballs.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSmallSlimeballsEnabled = true;
    @Comment("Enable Sour Cream Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSourCreamBottleEnabled = true;
    @Comment("Enable Sugar Dough. Recommend 'disable' with Bakery installed.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSugarDoughEnabled = true;
    @Comment("Enable Sugar Dough (Small).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSugarDoughSmallEnabled = true;
    @Comment("Enable Sweet Roll Base.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSweetRollBaseEnabled = true;
    @Comment("Enable Toast & Fried Eggs Plate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToastAndFriedEggPlateEnabled = true;
    @Comment("Enable Toast Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToastSliceEnabled = true;
    @Comment("Enable Toast Plate.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToastPlateEnabled = true;
    @Comment("Enable Toffee.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeEnabled = true;
    @Comment("Enable Toffee Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeChipsEnabled = true;
    @Comment("Enable Toffee Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeChipsChocolateCookieEnabled = true;
    @Comment("Enable Toffee Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeChipsCookieEnabled = true;
    @Comment("Enable Toffee Chip Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeChipIceCreamConeEnabled = true;
    @Comment("Enable Toffee Chip Milkshake.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeChipMilkshakeBottleEnabled = true;
    @Comment("Enable Toffee Chip Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeChipMuffinEnabled = true;
    @Comment("Enable Toffee Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeFudgeEnabled = true;
    @Comment("Enable Unbreaded Chicken Patty.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isUnbreadedChickenPattyEnabled = true;
    @Comment("Enable Vegetable Sandwich (Beetroot, Lettuce).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isVegetableSandwichBeetrootLettuceEnabled = true;
    @Comment("Enable Vegetable Sandwich (Lettuce, Tomato).")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isVegetableSandwichLettuceTomatoEnabled = true;
    @Comment("Enable Vinegar")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isVinegarBottleEnabled = true;
    @Comment("Enable Waffle Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWaffleConeEnabled = true;
    @Comment("Enable White Chips Chocolate Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChipsChocolateCookieEnabled = true;
    @Comment("Enable White Chips Cookie.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChipsCookieEnabled = true;
    @Comment("Enable White Chocolate Bottle.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateBottleEnabled = true;
    @Comment("Enable White Chocolate Chips.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateChipsEnabled = true;
    @Comment("Enable White Chocolate Chip Ice Cream Cone.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateChipIceCreamConeEnabled = true;
    @Comment("Enable White Chocolate Chip Muffin.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateChipMuffinEnabled = true;
    @Comment("Enable White Chocolate Covered Marshmallow Stick.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateCoveredMarshmallowStickEnabled = true;
    @Comment("Enable White Chocolate Filled Chocolate Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateChocolatePastryEnabled = true;
    @Comment("Enable White Chocolate Filled Pastry.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolatePastryEnabled = true;
    @Comment("Enable White Chocolate Fudge.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateFudgeEnabled = true;
    @Comment("Enable White Chocolate Glazed Apple.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateGlazedAppleEnabled = true;
    @Comment("Enable White Chocolate Glazed Berries.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateGlazedBerriesEnabled = true;
    @Comment("Enable White Chocolate Toast.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateToastEnabled = true;
    @Comment("Enable Yellow Gelatin Dessert Slice.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isYellowGelatinDessertSliceEnabled = true;
    @Comment("Enable Yogurt.")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isYogurtBottleEnabled = true;

// Blocks

    @Comment("Enable Apple Cheesecake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCheesecakeEnabled = true;
    @Comment("Enable Bacon Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBaconPizzaEnabled = true;
    @Comment("Enable Black Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlackGelatinDessertBlockEnabled = true;
    @Comment("Enable Blue Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlueGelatinDessertBlockEnabled = true;
    @Comment("Enable Brown Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBrownGelatinDessertBlockEnabled = true;
    @Comment("Enable Berry Cream Cake (Chorus Fruit).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamCakeChorusFruitEnabled = true;
    @Comment("Enable Berry Cream Cake (Glow Berry).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamCakeGlowBerryEnabled = true;
    @Comment("Enable Berry Cream Cake (Sweet Berry).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamCakeSweetBerryEnabled = true;
    @Comment("Enable Berry Cream Frosted Cake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostedCakeEnabled = true;
    @Comment("Enable Berry Pie.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryPieEnabled = true;
    @Comment("Enable Butterscotch Chip Waffle Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchChipWaffleBlockEnabled = true;
    @Comment("Enable Cake (Chorus Fruit).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCakeChorusFruitEnabled = true;
    @Comment("Enable Cake (Glow Berry).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCakeGlowBerryEnabled = true;
    @Comment("Enable Caramel Chip Waffle Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelChipWaffleBlockEnabled = true;
    @Comment("Enable Cheese Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheesePizzaEnabled = true;
    @Comment("Enable Cheesecake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheesecakeEnabled = true;
    @Comment("Enable Cookies & Cream Pie.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCookieCreamPieEnabled = true;
    @Comment("Enable Cream Pie (Chocolate Graham Cracker).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamPieChocolateGrahamCrackerEnabled = true;
    @Comment("Enable Cream Pie (Graham Cracker).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamPieGrahamCrackerEnabled = true;
    @Comment("Enable Chocolate Chip Waffle Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateChipWaffleBlockEnabled = true;
    @Comment("Enable Chocolate Cream Cake (Butterscotch).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamCakeButterscotchEnabled = true;
    @Comment("Enable Chocolate Cream Cake (Caramel).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamCakeCaramelEnabled = true;
    @Comment("Enable Chocolate Cream Cake (Chocolate).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamCakeChocolateEnabled = true;
    @Comment("Enable Chocolate Cream Cake (Dark Chocolate).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamCakeDarkChocolateEnabled = true;
    @Comment("Enable Chocolate Cream Cake (Toffee).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamCakeToffeeEnabled = true;
    @Comment("Enable Chocolate Cream Cake (White Chocolate).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamCakeWhiteChocolateEnabled = true;
    @Comment("Enable Chocolate Cream Frosted Cake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamFrostedCakeEnabled = true;
    @Comment("Enable Chocolate Pie (Graham Cracker).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolatePieGrahamCrackerEnabled = true;
    @Comment("Enable Chorus Fruit Cheesecake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCheesecakeEnabled = true;
    @Comment("Enable Chorus Fruit Cream Cake (Chorus Fruit).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamCakeChorusFruitEnabled = true;
    @Comment("Enable Chorus Fruit Cream Cake (Glow Berry).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamCakeGlowBerryEnabled = true;
    @Comment("Enable Chorus Fruit Cream Cake (Sweet Berry).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamCakeSweetBerryEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosted Cake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostedCakeEnabled = true;
    @Comment("Enable Chorus Fruit Pie.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitPieEnabled = true;
    @Comment("Enable Cyan Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCyanGelatinDessertBlockEnabled = true;
    @Comment("Enable Dark Chocolate Chip Waffle Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateChipWaffleBlockEnabled = true;
    @Comment("Enable Fish Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFishPizzaEnabled = true;
    @Comment("Enable Fish & Bacon Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFishBaconPizzaEnabled = true;
    @Comment("Enable Fish & Onion Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFishOnionPizzaEnabled = true;
    @Comment("Enable Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGelatinDessertBlockEnabled = true;
    @Comment("Enable Gray Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrayGelatinDessertBlockEnabled = true;
    @Comment("Enable Green Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGreenGelatinDessertBlockEnabled = true;
    @Comment("Enable Glow Berry Cheesecake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCheesecakeEnabled = true;
    @Comment("Enable Glow Berry Cream Cake (Chorus Fruit).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamCakeChorusFruitEnabled = true;
    @Comment("Enable Glow Berry Cream Cake (Glow Berry).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamCakeGlowBerryEnabled = true;
    @Comment("Enable Glow Berry Cream Cake (Sweet Berry).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamCakeSweetBerryEnabled = true;
    @Comment("Enable Glow Berry Cream Frosted Cake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostedCakeEnabled = true;
    @Comment("Enable Glow Berry Pie.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryPieEnabled = true;
    @Comment("Enable Light Blue Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLightBlueGelatinDessertBlockEnabled = true;
    @Comment("Enable Light Gray Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLightGrayGelatinDessertBlockEnabled = true;
    @Comment("Enable Lime Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLimeGelatinDessertBlockEnabled = true;
    @Comment("Enable Magenta Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMagentaGelatinDessertBlockEnabled = true;
    @Comment("Enable Mushroom Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMushroomPizzaEnabled = true;
    @Comment("Enable Mushroom & Bacon Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMushroomBaconPizzaEnabled = true;
    @Comment("Enable Mushroom & Fish Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMushroomFishPizzaEnabled = true;
    @Comment("Enable Mushroom & Onion Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMushroomOnionPizzaEnabled = true;
    @Comment("Enable Onion Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isOnionPizzaEnabled = true;
    @Comment("Enable Onion & Bacon Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isOnionBaconPizzaEnabled = true;
    @Comment("Enable Orange Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isOrangeGelatinDessertBlockEnabled = true;
    @Comment("Enable Pink Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPinkGelatinDessertBlockEnabled = true;
    @Comment("Enable Purple Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPurpleGelatinDessertBlockEnabled = true;
    @Comment("Enable Pizza Dough.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPizzaDoughEnabled = true;
    @Comment("Enable Pizza Dough (Tomato Sauce).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPizzaDoughTomatoSauceEnabled = true;
    @Comment("Enable Raw Apple Cheesecake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawAppleCheesecakeEnabled = true;
    @Comment("Enable Raw Apple Pie.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawApplePieEnabled = true;
    @Comment("Enable Raw Bacon Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawBaconPizzaEnabled = true;
    @Comment("Enable Raw Berry Cheesecake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawBerryCheesecakeEnabled = true;
    @Comment("Enable Raw Berry Pie.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawBerryPieEnabled = true;
    @Comment("Enable Raw Cheese Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCheesePizzaEnabled = true;
    @Comment("Enable Raw Cheesecake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCheesecakeEnabled = true;
    @Comment("Enable Raw Chocolate Graham Cracker Pie Crust.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolateGrahamCrackerPieCrustEnabled = true;
    @Comment("Enable Raw Chocolate Pie.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolatePieEnabled = true;
    @Comment("Enable Raw Chocolate Pie (Graham Cracker).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChocolatePieGrahamCrackerEnabled = true;
    @Comment("Enable Raw Chorus Fruit Pie.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChorusFruitPieEnabled = true;
    @Comment("Enable Raw Chorus Fruit Cheesecake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChorusFruitCheesecakeEnabled = true;
    @Comment("Enable Raw Cream Pie (Chocolate Graham Cracker).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCreamPieChocolateGrahamCrackerEnabled = true;
    @Comment("Enable Raw Cream Pie (Graham Cracker).")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCreamPieGrahamCrackerEnabled = true;
    @Comment("Enable Raw Fish Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawFishPizzaEnabled = true;
    @Comment("Enable Raw Fish & Bacon Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawFishBaconPizzaEnabled = true;
    @Comment("Enable Raw Fish & Onion Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawFishOnionPizzaEnabled = true;
    @Comment("Enable Raw Glow Berry Pie.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawGlowBerryPieEnabled = true;
    @Comment("Enable Raw Glow Berry Cheesecake.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawGlowBerryCheesecakeEnabled = true;
    @Comment("Enable Raw Graham Cracker Pie Crust.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawGrahamCrackerPieCrustEnabled = true;
    @Comment("Enable Raw Mushroom Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMushroomPizzaEnabled = true;
    @Comment("Enable Raw Mushroom & Bacon Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMushroomBaconPizzaEnabled = true;
    @Comment("Enable Raw Mushroom & Fish Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMushroomFishPizzaEnabled = true;
    @Comment("Enable Raw Mushroom & Onion Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawMushroomOnionPizzaEnabled = true;
    @Comment("Enable Raw Onion Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawOnionPizzaEnabled = true;
    @Comment("Enable Raw Onion & Bacon Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawOnionBaconPizzaEnabled = true;
    @Comment("Enable Raw Pie Crust.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawPieCrustEnabled = true;
    @Comment("Enable Raw Sausage Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSausagePizzaEnabled = true;
    @Comment("Enable Raw Sausage & Bacon Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSausageBaconPizzaEnabled = true;
    @Comment("Enable Raw Sausage & Fish Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSausageFishPizzaEnabled = true;
    @Comment("Enable Raw Sausage & Mushroom Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSausageMushroomPizzaEnabled = true;
    @Comment("Enable Raw Sausage & Onion Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSausageOnionPizzaEnabled = true;
    @Comment("Enable Red Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRedGelatinDessertBlockEnabled = true;
    @Comment("Enable Sausage Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausagePizzaEnabled = true;
    @Comment("Enable Sausage & Bacon Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausageBaconPizzaEnabled = true;
    @Comment("Enable Sausage & Fish Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausageFishPizzaEnabled = true;
    @Comment("Enable Sausage & Mushroom Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausageMushroomPizzaEnabled = true;
    @Comment("Enable Sausage & Onion Pizza.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSausageOnionPizzaEnabled = true;
    @Comment("Enable S'mores Pie.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSmoresPieEnabled = true;
    @Comment("Enable Toffee Chip Waffle Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeChipWaffleBlockEnabled = true;
    @Comment("Enable Waffle Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWaffleBlockEnabled = true;
    @Comment("Enable White Chocolate Chip Waffle Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateChipWaffleBlockEnabled = true;
    @Comment("Enable Yellow Gelatin Dessert Block.")
    @ConfigEntry.Category("CreateFoodBlock")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isYellowGelatinDessertBlockEnabled = true;


// Fluids

    @Comment("Enable Apple Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleCreamFrostingFluidEnabled = true;
    @Comment("Enable Apple Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleIceCreamFluidEnabled = true;
    @Comment("Enable Apple Jam Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleJamFluidEnabled = true;
    @Comment("Enable Apple Juice Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleJuiceFluidEnabled = true;
    @Comment("Enable Apple Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isAppleMilkshakeFluidEnabled = true;
    @Comment("Enable Apple Pie Filling Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isApplePieFillingFluidEnabled = true;
    @Comment("Enable Berry Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryCreamFrostingFluidEnabled = true;
    @Comment("Enable Berry Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryIceCreamFluidEnabled = true;
    @Comment("Enable Berry Jam Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryJamFluidEnabled = true;
    @Comment("Enable Berry Juice Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryJuiceFluidEnabled = true;
    @Comment("Enable Berry Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryMilkshakeFluidEnabled = true;
    @Comment("Enable Berry Pie Filling Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBerryPieFillingFluidEnabled = true;
    @Comment("Enable Blackstrap Molasses Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlackstrapMolassesFluidEnabled = true;
    @Comment("Enable Black Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlackGelatinMixFluidEnabled = true;
    @Comment("Enable Blue Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBlueGelatinMixFluidEnabled = true;
    @Comment("Enable Brown Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBrownGelatinMixFluidEnabled = true;
    @Comment("Enable Butterscotch Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchFluidEnabled = true;
    @Comment("Enable Butterscotch Fudge Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isButterscotchFudgeFluidEnabled = true;
    @Comment("Enable Cacao Butter Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCacaoButterFluidEnabled = true;
    @Comment("Enable Cacao Mass Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCacaoMassFluidEnabled = true;
    @Comment("Enable Cane Syrup Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaneSyrupFluidEnabled = true;
    @Comment("Enable Caramel Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelFluidEnabled = true;
    @Comment("Enable Caramel Fudge Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelFudgeFluidEnabled = true;
    @Comment("Enable Chocolate Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateCreamFrostingFluidEnabled = true;
    @Comment("Enable Chocolate Fudge Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateFudgeFluidEnabled = true;
    @Comment("Enable Chocolate Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateIceCreamFluidEnabled = true;
    @Comment("Enable Chocolate Milk Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateMilkFluidEnabled = true;
    @Comment("Enable Chocolate Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChocolateMilkshakeFluidEnabled = true;
    @Comment("Enable Chorus Fruit Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitCreamFrostingFluidEnabled = true;
    @Comment("Enable Chorus Fruit Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitIceCreamFluidEnabled = true;
    @Comment("Enable Chorus Fruit Jam Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitJamFluidEnabled = true;
    @Comment("Enable Chorus Fruit Juice Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitJuiceFluidEnabled = true;
    @Comment("Enable Chorus Fruit Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitMilkshakeFluidEnabled = true;
    @Comment("Enable Chorus Fruit Pie Filling Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChorusFruitPieFillingFluidEnabled = true;
    @Comment("Enable Cheesecake Filling Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheesecakeFillingFluidEnabled = true;
    @Comment("Enable Condensed Milk Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCondensedMilkFluidEnabled = true;
    @Comment("Enable Cream Cheese Fluid .")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamCheeseFluidEnabled = true;
    @Comment("Enable Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamFrostingFluidEnabled = true;
    @Comment("Enable Cream Pie Filling Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCreamPieFillingFluidEnabled = true;
    @Comment("Enable Cyan Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCyanGelatinMixFluidEnabled = true;
    @Comment("Enable Dark Chocolate Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateFluidEnabled = true;
    @Comment("Enable Dark Chocolate Fudge Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDarkChocolateFudgeFluidEnabled = true;
    @Comment("Enable Fruit Smoothie Fluid .")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isFruitSmoothieFluidEnabled = true;
    @Comment("Enable Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGelatinMixFluidEnabled = true;
    @Comment("Enable Glow Berry Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryCreamFrostingFluidEnabled = true;
    @Comment("Enable Glow Berry Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryIceCreamFluidEnabled = true;
    @Comment("Enable Glow Berry Jam Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryJamFluidEnabled = true;
    @Comment("Enable Glow Berry Juice Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryJuiceFluidEnabled = true;
    @Comment("Enable Glow Berry Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryMilkshakeFluidEnabled = true;
    @Comment("Enable Glow Berry Pie Filling Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGlowBerryPieFillingFluidEnabled = true;
    @Comment("Enable Gray Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGrayGelatinMixFluidEnabled = true;
    @Comment("Enable Green Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGreenGelatinMixFluidEnabled = true;
    @Comment("Enable Heavy Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHeavyCreamFluidEnabled = true;
    @Comment("Enable Hot Chocolate Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotChocolateFluidEnabled = true;
    @Comment("Enable Hot Dark Chocolate Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotDarkChocolateFluidEnabled = true;
    @Comment("Enable Hot White Chocolate Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHotWhiteChocolateFluidEnabled = true;
    @Comment("Enable Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isIceCreamFluidEnabled = true;
    @Comment("Enable Light Blue Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLightBlueGelatinMixFluidEnabled = true;
    @Comment("Enable Light Gray Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLightGrayGelatinMixFluidEnabled = true;
    @Comment("Enable Lime Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isLimeGelatinMixFluidEnabled = true;
    @Comment("Enable Magenta Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMagentaGelatinMixFluidEnabled = true;
    @Comment("Enable Melon Cream Frosting Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonCreamFrostingFluidEnabled = true;
    @Comment("Enable Melon Ice Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonIceCreamFluidEnabled = true;
    @Comment("Enable Melon Jam Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonJamFluidEnabled = true;
    @Comment("Enable Melon Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMelonMilkshakeFluidEnabled = true;
    @Comment("Enable Milkshake Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMilkshakeFluidEnabled = true;
    @Comment("Enable Molasses Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMolassesFluidEnabled = true;
    @Comment("Enable Orange Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isOrangeGelatinMixFluidEnabled = true;
    @Comment("Enable Pink Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPinkGelatinMixFluidEnabled = true;
    @Comment("Enable Purple Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPurpleGelatinMixFluidEnabled = true;
    @Comment("Enable Red Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRedGelatinMixFluidEnabled = true;
    @Comment("Enable Slime Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSlimeFluidEnabled = true;
    @Comment("Enable Sour Cream Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSourCreamFluidEnabled = true;
    @Comment("Enable Sugar Cane Juice Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSugarCaneJuiceFluidEnabled = true;
    @Comment("Enable Squid Ink Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSquidInkFluidEnabled = true;
    @Comment("Enable Toffee Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeFluidEnabled = true;
    @Comment("Enable Toffee Fudge Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isToffeeFudgeFluidEnabled = true;
    @Comment("Enable Vegetable Oil Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isVegetableOilFluidEnabled = true;
    @Comment("Enable Vinegar Fluid .")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isVinegarFluidEnabled = true;
    @Comment("Enable Waffle Batter Fluid .")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWaffleBatterFluidEnabled = true;
    @Comment("Enable White Chocolate Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateFluidEnabled = true;
    @Comment("Enable White Chocolate Fudge Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isWhiteChocolateFudgeFluidEnabled = true;
    @Comment("Enable Yellow Gelatin Mix Fluid.")
    @ConfigEntry.Category("CreateFoodFluid")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isYellowGelatinMixFluidEnabled = true;
    @Comment("Enable Yogurt Fluid .")
    @ConfigEntry.Category("CreateFood")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isYogurtFluidEnabled = true;

// Farmer's Delight

    @Comment("Enable Beef Bun (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunBaconLettuceEnabled = true;
    @Comment("Enable Beef Bun (Bacon, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunBaconLettuceTomatoEnabled = true;
    @Comment("Enable Beef Bun (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunLettuceEnabled = true;
    @Comment("Enable Beef Bun (Onion).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunOnionEnabled = true;
    @Comment("Enable Beef Bun (Onion, Bacon).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunOnionBaconEnabled = true;
    @Comment("Enable Beef Bun (Onion, Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunOnionBaconLettuceEnabled = true;
    @Comment("Enable Beef Bun (Onion, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunOnionLettuceEnabled = true;
    @Comment("Enable Beef Bun (Onion, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunOnionLettuceTomatoEnabled = true;
    @Comment("Enable Beef Bun (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunLettuceTomatoEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunBaconLettuceEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Bacon, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunBaconLettuceTomatoEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Onion).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunOnionEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Onion, Bacon).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunOnionBaconEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Onion, Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunOnionBaconLettuceEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Onion, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunOnionLettuceEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Onion, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunOnionLettuceTomatoEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunLettuceEnabled = true;
    @Comment("Enable Cheese and Beef Bun (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndBeefBunLettuceTomatoEnabled = true;
    @Comment("Enable Cheese and Chicken Bun (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndChickenBunBaconLettuceEnabled = true;
    @Comment("Enable Cheese and Chicken Bun (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndChickenBunLettuceEnabled = true;
    @Comment("Enable Cheese and Chicken Bun (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndChickenBunLettuceTomatoEnabled = true;
    @Comment("Enable Cheeseburger (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerBaconLettuceEnabled = true;
    @Comment("Enable Cheeseburger (Bacon, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerBaconLettuceTomatoEnabled = true;
    @Comment("Enable Cheeseburger (Onion).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerOnionEnabled = true;
    @Comment("Enable Cheeseburger (Onion, Bacon).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerOnionBaconEnabled = true;
    @Comment("Enable Cheeseburger (Onion, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerOnionLettuceEnabled = true;
    @Comment("Enable Cheeseburger (Onion, Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerOnionBaconLettuceEnabled = true;
    @Comment("Enable Cheeseburger (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerLettuceEnabled = true;
    @Comment("Enable Cheeseburger (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerLettuceTomatoEnabled = true;
    @Comment("Enable Cheeseburger (Onion, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseburgerOnionLettuceTomatoEnabled = true;
    @Comment("Enable Chicken Bun (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBunBaconLettuceEnabled = true;
    @Comment("Enable Chicken Bun (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBunLettuceEnabled = true;
    @Comment("Enable Chicken Bun (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBunLettuceTomatoEnabled = true;
    @Comment("Enable Chicken Burger (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBurgerBaconLettuceEnabled = true;
    @Comment("Enable Chicken Burger (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBurgerLettuceEnabled = true;
    @Comment("Enable Chicken Burger (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenBurgerLettuceTomatoEnabled = true;
    @Comment("Enable Chicken Cheeseburger (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenCheeseburgerBaconLettuceEnabled = true;
    @Comment("Enable Chicken Cheeseburger (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenCheeseburgerLettuceEnabled = true;
    @Comment("Enable Chicken Cheeseburger (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isChickenCheeseburgerLettuceTomatoEnabled = true;
    @Comment("Enable Diced Onion.")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDicedOnionEnabled = true;
    @Comment("Enable Hamburger (Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerBaconLettuceEnabled = true;
    @Comment("Enable Hamburger (Onion).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerOnionEnabled = true;
    @Comment("Enable Hamburger (Onion, Bacon).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerOnionBaconEnabled = true;
    @Comment("Enable Hamburger (Onion, Bacon, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerOnionBaconLettuceEnabled = true;
    @Comment("Enable Hamburger (Onion, Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerOnionLettuceEnabled = true;
    @Comment("Enable Hamburger (Lettuce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerLettuceEnabled = true;
    @Comment("Enable Hamburger (Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerLettuceTomatoEnabled = true;
    @Comment("Enable Hamburger (Bacon, Lettuce, Tomato).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerBaconLettuceTomatoEnabled = true;
    @Comment("Enable Pasta Plate (Tomato Sauce).")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateTomatoSauceEnabled = true;
    @Comment("Enable Raw Honey Cookie.")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawHoneyCookieEnabled = true;
    @Comment("Enable Raw Sweet Berry Cookie.")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSweetBerryCookieEnabled = true;
    @Comment("Enable Sliced Tomato.")
    @ConfigEntry.Category("Farmer'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSlicedTomatoEnabled = true;

// Expanded Delight

    @Comment("Enable Bread Slice (Peanut Butter).")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBreadSlicePeanutButterEnabled = false;
    @Comment("Enable Beef Bun (Peanut Butter).")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunPeanutButterEnabled = false;
    @Comment("Enable Beef Bun (Peanut Butter, Bacon).")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isBeefBunPeanutButterBaconEnabled = false;
    @Comment("Enable Hamburger (Peanut Butter).")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerPeanutButterEnabled = false;
    @Comment("Enable Hamburger (Peanut Butter, Bacon).")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isHamburgerPeanutButterBaconEnabled = false;
    @Comment("Enable Cinnamon Sweet Roll Base.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCinnamonSweetRollBaseEnabled = false;
    @Comment("Enable Paprika.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPaprikaEnabled = false;
    @Comment("Enable Peanut Butter & Apple Jam Sandwich.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPeanutButterAppleJamSandwichEnabled = false;
    @Comment("Enable Peanut Butter & Chorus Fruit Jam Sandwich.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPeanutButterChorusFruitJamSandwichEnabled = false;
    @Comment("Enable Peanut Butter & Melon Jam Sandwich.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPeanutButterMelonJamSandwichEnabled = false;
    @Comment("Enable Raw Cinnamon Sweet Roll Base.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawCinnamonSweetRollBaseEnabled = false;
    @Comment("Enable Raw Snickerdoodle.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSnickerdoodleEnabled = false;
    @Comment("Enable Raw Sugar Cookie.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSugarCookieEnabled = false;
    @Comment("Enable Spicy Breakfast Sausages.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSpicyBreakfastSausagesEnabled = false;
    @Comment("Enable Spicy Chicken Nuggets.")
    @ConfigEntry.Category("ExpandedDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSpicyChickenNuggetsEnabled = false;

    // Farmer's Respite
    @Comment("Enable Coffee Toffee.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCoffeeToffeeEnabled = false;
    @Comment("Enable Coffee Toffee Fluid.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCoffeeToffeeFluidEnabled = false;
    @Comment("Enable Coffee Toffee Fudge.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCoffeeToffeeFudgeEnabled = false;
    @Comment("Enable Coffee Toffee Fudge Fluid.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCoffeeToffeeFudgeFluidEnabled = false;
    @Comment("Enable Dried Coffee Beans.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDriedCoffeeBeansEnabled = false;
    @Comment("Enable Espresso Powder.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEspressoPowderEnabled = false;
    @Comment("Enable Marshmallow Coffee Toffee Fudge.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMarshmallowCoffeeToffeeFudgeEnabled = false;
    @Comment("Enable Raw Green Tea Cookie.")
    @ConfigEntry.Category("Farmer'sRespite")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawGreenTeaCookieEnabled = false;

    // End's Delight
    @Comment("Enable Dragon Bun.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonBunEnabled = false;
    @Comment("Enable Dragon Bun (Crimson Fungus).")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonBunCrimsonFungusEnabled = false;
    @Comment("Enable Dragon Bun (Warped Fungus).")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonBunWarpedFungusEnabled = false;
    @Comment("Enable Dragon Burger.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonBurgerEnabled = false;
    @Comment("Enable Dragon Burger (Crimson Fungus).")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonBurgerCrimsonFungusEnabled = false;
    @Comment("Enable Dragon Burger (Warped Fungus).")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonBurgerWarpedFungusEnabled = false;
    @Comment("Enable Dragon Patty.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isDragonPattyEnabled = false;
    @Comment("Enable Endermite Meatball.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEndermiteMeatballEnabled = false;
    @Comment("Enable Endermite Meatball Sandwich.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEndermiteMeatballSandwichEnabled = false;
    @Comment("Enable Endermite Meatball Stick.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEndermiteMeatballStickEnabled = false;
    @Comment("Enable Ground Endermite.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isGroundEndermiteEnabled = false;
    @Comment("Enable Minced Dragon.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMincedDragonEnabled = false;
    @Comment("Enable Raw Chorus Cookie.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawChorusCookieEnabled = false;
    @Comment("Enable Raw Endermite Meatball.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawEndermiteMeatballEnabled = false;
    @Comment("Enable Small Endermite Meatballs.")
    @ConfigEntry.Category("End'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSmallEndermiteMeatballsEnabled = false;

    // Cultural Delight
    @Comment("Enable Caramel Popcorn.")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCaramelPopcornEnabled = false;
    @Comment("Enable Cheese and Eggplant Bun.")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndEggplantBunEnabled = false;
    @Comment("Enable Cheese and Eggplant Bun (Lettuce).")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndEggplantBunLettuceEnabled = false;
    @Comment("Enable Cheese and Eggplant Bun (Lettuce, Tomato).")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCheeseAndEggplantBunLettuceTomatoEnabled = false;
    @Comment("Enable Corn Flour.")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isCornFlourEnabled = false;
    @Comment("Enable Eggplant Bun.")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantBunEnabled = false;
    @Comment("Enable Eggplant Bun (Lettuce).")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantBunLettuceEnabled = false;
    @Comment("Enable Eggplant Bun (Lettuce, Tomato).")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantBunLettuceTomatoEnabled = false;
    @Comment("Enable Eggplant Burger.")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantBurgerEnabled = false;
    @Comment("Enable Eggplant Burger (Lettuce).")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantBurgerLettuceEnabled = false;
    @Comment("Enable Eggplant Cheeseburger.")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantCheeseburgerEnabled = false;
    @Comment("Enable Eggplant Cheeseburger (Lettuce).")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantCheeseburgerLettuceEnabled = false;
    @Comment("Enable Eggplant Cheeseburger (Lettuce, Tomato).")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isEggplantCheeseburgerLettuceTomatoEnabled = false;
    @Comment("Enable Nacho Bowl.")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isNachoBowlEnabled = false;
    @Comment("Enable Pasta with Eggplant.")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isPastaPlateEggplantEnabled = false;
    @Comment("Enable Smoked Corn Stick.")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSmokedCornStickEnabled = false;
    @Comment("Enable Tortilla Chip Bowl.")
    @ConfigEntry.Category("CulturalDelights")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isTortillaChipBowlEnabled = false;

    // Ube Delight
    @Comment("Enable Ube Cream Frosted Ube Cake.")
    @ConfigEntry.Category("Ube'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isUbeCreamFrostedUbeCakeEnabled = false;
    @Comment("Enable Raw Ginger Cookie.")
    @ConfigEntry.Category("Ube'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawGingerCookieEnabled = false;
    @Comment("Enable Raw Ube Cake Base.")
    @ConfigEntry.Category("Ube'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawUbeCakeBaseEnabled = false;
    @Comment("Enable Raw Ube Cookie.")
    @ConfigEntry.Category("Ube'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawUbeCookieEnabled = false;
    @Comment("Enable Ube Cake Base.")
    @ConfigEntry.Category("Ube'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isUbeCakeBaseEnabled = false;
    @Comment("Enable Ube Cream Frosting.")
    @ConfigEntry.Category("Ube'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isUbeCreamFrostingBottleEnabled = false;
    @Comment("Enable Ube Cream Frosting Fluid.")
    @ConfigEntry.Category("Ube'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isUbeCreamFrostingFluidEnabled = false;
    @Comment("Enable Ube Sugar Dough.")
    @ConfigEntry.Category("Ube'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isUbeSugarDoughEnabled = false;

    // Fright's Delight
    @Comment("Enable Raw Flesh Cookie.")
    @ConfigEntry.Category("Fright'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawFleshCookieEnabled = false;
    @Comment("Enable Raw Soul Berry Cookie.")
    @ConfigEntry.Category("Fright'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSoulBerryCookieEnabled = false;
    @Comment("Enable Raw Spider Eye Cookie.")
    @ConfigEntry.Category("Fright'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawSpiderEyeCookieEnabled = false;

    // Nether's Delight
    @Comment("Enable Magma Cream Marshmallow.")
    @ConfigEntry.Category("Nether'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMagmaCreamMarshmallowEnabled = false;
    @Comment("Enable Magma Cream Marshmallow Stick.")
    @ConfigEntry.Category("Nether'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isMagmaCreamMarshmallowStickEnabled = false;
    @Comment("Enable Raw Strider Meatball.")
    @ConfigEntry.Category("Nether'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isRawStriderMeatballEnabled = false;
    @Comment("Enable Small Strider Meatballs.")
    @ConfigEntry.Category("Nether'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isSmallStriderMeatballsEnabled = false;
    @Comment("Enable Strider Meatball.")
    @ConfigEntry.Category("Nether'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isStriderMeatballEnabled = false;
    @Comment("Enable Strider Meatball Sandwich.")
    @ConfigEntry.Category("Nether'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isStriderMeatballSandwichEnabled = false;
    @Comment("Enable Strider Meatball Stick.")
    @ConfigEntry.Category("Nether'sDelight")
    @ConfigEntry.Gui.RequiresRestart
    public boolean isStriderMeatballStickEnabled = false;
}
