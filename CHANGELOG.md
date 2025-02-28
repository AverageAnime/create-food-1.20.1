### *** 1.1.8 ***

![newprev118](https://github.com/user-attachments/assets/d888474a-6f96-4d3b-aa4f-1cc8dcf90495)
> *Also added are waffle blocks which act the same as cheesecakes/pies/pizza*

General:
* 30+ new food items.
* Fix sausage pizza loot tables.
* Add Simplified Chinese Translation. [(#50)](https://github.com/AverageAnime/create-food/pull/50)

Fabric:
* Fix dried coffee beans recipes to prevent crash. [(#48)](https://github.com/AverageAnime/create-food/issues/48)

Forge:
* Compatibility tags added for:
  * Create: The Kitchen Must Grow
  * Delightful
  * Delightful Burgers
  * Delightful Sandwich

### *** 1.1.7 ***

General:
* Moved some recipes to compat folders.
* Fixed Create: Bitterballen deep-frying recipes. 

Forge:
* Fixed recipes incorrectly using strings [(#47)](https://github.com/AverageAnime/create-food/issues/47). 

### ***1.1.6***

General:
* New food: calzones, cupcakes, and muffins.
* Fix fluid amount from melting hollow chocolates [(#46)](https://github.com/AverageAnime/create-food/issues/46)
* New shaped recipes. 
* New emptying recipes.
* Added fluid tags & changed recipes to use them.
* Compatibility tags added for:
  * Create: Deepfried
  * Create: Sweets & Treats
  * Create: Bitterballen
  * Ender's Delight
* Change display names of the following items to match their recipes. IDs will remain the same for now. 
  * Chocolate Glazed Chocolate Donut > Chocolate Cream Glazed Chocolate Donut
  * Chocolate Glazed Donut > Chocolate Cream Glazed Donut
  * Chocolate Frosted Chocolate Sweet Roll > Chocolate Cream Frosted Chocolate Sweet Roll
  * Chocolate Frosted Sweet Roll > Chocolate Cream Frosted Sweet Roll

Fabric:
* Change fluid amounts in filling/emptying/mixing recipes of create:builders_tea & farmersdelight:milk_bottle to match standard bottle size (333mB > 250mB)

Forge:
* Change fluid amount in create:chocolate compacting recipe to match Fabric (250mB > 333mB) [(#46)](https://github.com/AverageAnime/create-food/issues/46)

### ***1.1.5***

General:

* New item Dumpling Wrappers.
* Compatibility tags added for:
  * Tough As Nails [(#43)](https://github.com/AverageAnime/create-food/issues/43)
  * Rustic Delight
  * Vegan Delight
  * Dumplings Delight
  * Create: Dreams & Desires
* Resource pack for Rustic Delight.
  * Animated textures for coffees.


Fabric:
* Change creative tab icon. 
* Fix pie filling fluids.

Forge:
* Compatibility tags added for:
  * Create: Confectionery
  * Create: Factory
  * Create: Gourmet

### ***1.1.4***

General:
* Fix JMC crafting recipes.
* Tag compatibility for More Delight & Casualness Delight [(#37)](https://github.com/AverageAnime/create-food/issues/37).
* New load conditions for Ube's Delight related loot tables to remove some log spam [(#38)](https://github.com/AverageAnime/create-food/issues/38). 
* Updated Ube Cake texture added to Ube's Delight resource pack.
* Fix default cake texture [(#39)](https://github.com/AverageAnime/create-food/issues/39).

Fabric:
* Change icon texture size to prevent mip map quality issues. [(#36)](https://github.com/AverageAnime/create-food/issues/36).

Forge: 
* Fix shaped recipes [(#35)](https://github.com/AverageAnime/create-food/issues/35).
* Added missing load conditions.
* Added missing item.

### ***1.1.3***

General:
* Basic recipes compatibility for [Just More Cakes](https://www.curseforge.com/minecraft/mc-mods/just-more-cakes) ([#32](https://github.com/AverageAnime/create-food/issues/33))
* Fix some compacting recipes.
* Fix some mixing recipes & added some missing ones.
* New cake textures.

Fabric:
* Added 'snack' property to various items.
* Fix missing tooltips for some items.
* Fix multiple items incorrectly being a stick food item.

Forge:
* Fruits tag fixed. ([#33](https://github.com/AverageAnime/create-food/issues/33))
* Fix for bottle items not being consumable. ([#34](https://github.com/AverageAnime/create-food/issues/34))
* Added 'fast' property to various items.
* Added tag load conditions & other tag fixes.
* Fix missing Cultural Delight items.

### ***1.1.2***
*Note: Differences between Fabric and Forge are located [here](https://github.com/AverageAnime/create-food/wiki/Fabric-&-Forge-Differences).*

![newprev112big](https://github.com/user-attachments/assets/997bf71c-9544-4de8-8979-180bfbde2c38)

* 50+ new items.
* Cakes added by this mod can now be right-clicked (with a knife) to remove a single slice, just like pies.
* Frosted Cakes now have loot tables.
* Food effects are no longer added using the tag system. Fixes [(#14)](https://github.com/AverageAnime/create-food/issues/14) / [(#25)](https://github.com/AverageAnime/create-food/issues/25) / [(#27)](https://github.com/AverageAnime/create-food/issues/27).
* Recipe compatibility for [My Nether's Delight Refabricated](https://www.curseforge.com/minecraft/mc-mods/my-nethers-delight-refabricated) [(#28)](https://github.com/AverageAnime/create-food/issues/28).
* Removed Farm & Charm salt recipe to address [(#29)](https://github.com/AverageAnime/create-food/issues/29).
* Fix bottle duplication with frosting recipes [(#31)](https://github.com/AverageAnime/create-food/issues/31).

### ***1.1.1***

![111new](https://github.com/user-attachments/assets/02396822-70ce-4a71-a0e9-2943f1cf0baa)

* New cakes, pies, and cheesecakes.
  * Related additions to Farmer's Delight resource pack.
* Renamed the following items. This will delete existing versions of the items.
  * Chocolate Filled Mini Graham Cracker Pie Crust -> Mini Chocolate Pie (Graham Cracker)
  * Chocolate Filled Graham Cracker Pie Crust -> Chocolate Pie (Graham Cracker)
  * Frosted Ube Cake -> Ube Cream Frosted Ube Cake
* Changed the following items into placeable blocks. This will delete existing versions of the items.
  * Cake Base
  * Frosted Cake
  * Chocolate Pie (Graham Cracker)
  * Ube Cake Base
  * Ube Cream Frosted Ube Cake
* All cake, pie, cheesecake, and pizza blocks will now:
  * Drop full block item when broken with an empty hand.
  * Drop the appropriate number of slices when a partially eaten block is broken with a knife.
  * Drop a single slice on the final bite when broken with an empty hand.
* Compatibility for [[Let's Do] Farm & Charm](https://www.curseforge.com/minecraft/mc-mods/lets-do-farm-charm). 
  * Cooking pot, crafting bowl, and stove recipes are now for Farm & Charm.
  * New recipes for mincer, drying, & roaster.
* Various recipe & tag updates. 
  
### ***1.1.0***

* Updated textures for pizza items.
* Fix some recipes/tags.
* Fix crash ([#21](https://github.com/AverageAnime/create-food/issues/21)).

### ***1.0.9***

![newprev2](https://github.com/AverageAnime/create-food/assets/150550990/dbfe8944-55af-4e65-847d-20cbdd7bb978)

* New placeable pizzas & s'mores pie.
* Fix for salt mixing recipe ([#20](https://github.com/AverageAnime/create-food/issues/20)). 

### ***1.0.8***

![108prevbig](https://github.com/AverageAnime/create-food/assets/150550990/7837c32e-2cc5-4867-9535-bf3fe28cb4a2)

* New breakfast-themed items.
* Some texture updates.
* Fixed Gelatin Mix Blocks causing issues when disabled.
* Recipe updates: 
  * Recipes now check for tags populated. This prevents log spam when disabling recipes & offers better compatibility for recipes with optional items compared to checking for mods loaded.  
  * Fixes for recipes. Mostly increased/consistent tag usage & correcting load conditions. 
  
### ***1.0.7***

**Big Update!**
* 100+ new items/fluids. 
  * Pasta plates, ice creams, milkshakes, jams, bread slices, sandwiches, and more.
  * Various optional items for Expanded Delight, End's Delight, Cultural Delights, Farmer's Respite, Ube's Delight, Fright's Delight, and Nether's Delight. These new items are disabled by default.
* Bunch of texture, recipe, tag & resource pack updates/fixes.
* Fixed Gelatin Mix Fluids causing issues when disabled.
* Absorption, Resistance, & Regeneration effects can now be added via tags.
* All Gelatin Dessert Blocks are now dropped when broken.

### ***1.0.6***

* Fixed issue where Gelatin Dessert Blocks could not be placed on servers.

### ***1.0.5 - Fix***

* Added some tags missing from Farmer's Delight Refabricated that were needed for recipes.
* Changed some recipes to use the proper tags.

### ***1.0.5***

* Minor tag & recipe updates.
* Fix to remove log spam related to fluids.
* New resource pack for Create. Also added dough texture from Create to Farmer's Delight resource pack for visual consistency.
* Minor updates to directly support [Farmer's Delight Refabricated](https://www.curseforge.com/minecraft/mc-mods/farmers-delight-refabricated
  ).
> Note: Deprecated port is still compatible. There's no difference between the two ports in terms of what this mod does, but I still recommend switching to Refabricated.

### ***1.0.4***

* 50 new food items & 14 new fluids.
* New resource packs for Cultural Delight, End's Delight, & Farmer's Respite.
* Some features related to Farmer's Delight & Expanded Delight have been moved to their respective resource pack. 
* Various texture/tag/recipe updates & fixes.
* Fixed some long effect tags not using the correct duration 
* In the config, items from the Expanded Delight tab are now disabled by default.
>Note: [Farmer's Delight Refabricated](https://www.curseforge.com/minecraft/mc-mods/farmers-delight-refabricated
) (2.0.10+) can be used with **any**  version of Create: Food to satisfy the Farmer's Delight dependency.

### ***1.0.3***

![expandeddelightpreview](https://github.com/AverageAnime/create-food/assets/150550990/edd77810-f6fc-4434-b7f0-063e9b233828)
* 10 new items for Expanded Delight content.
* 2 built-in Resource Packs for visual consistency:
> Farmer's Delight Resource Pack includes an animated version of Farmer's Delight Hot Cocoa texture to match Create: Food.

> Expanded Delight Resource Pack includes new Sweet Roll textures to match Create: Food. Also renames them.
* Fix missing blockbuster .json for 'Light Blue Gelatin Dessert Block'. Thanks to banya457 for reporting the issue.
* Removed Baking Station recipes due to [Let's Do] Bakery 1.1.4 removing them.
* Added new Crafting Bowl recipes for Bakery for doughs.
* Fire Resistance can now be added to items via tags.

### ***1.0.2***

* 50+ new food items:
> Pastries

> Pastry Bars

> Donuts

> Donut Holes

> Berry Topped Sweet Rolls

> Colored Gelatin Dessert

> Sliced Potato & Sliced Carrot

> Potato Chips

* Tags can now be used to apply the following status effects:
> Night Vision

> Glowing

> Slow Falling

> Jump Boost

> Haste

> Speed

> Strength

> Luck

* Various new/updated recipes
* When disabling items in the config you should no longer need to manually remove smoking/smelting/campfire recipes.


### ***1.0.1***

Note: Farmer's Delight is now a required dependency.

* Various fixes.
* New tag-based system to apply Farmer's Delight food effects. You can now add Comfort and Nourishment to any item with the appropriate tag. Example: 'create:sweet_roll' has been added to the tag 'c:brief_comfort', giving 30 seconds of Comfort.
* New food gelatin dessert slice & red gelatin dessert slice.
* New blocks gelatin dessert block & red gelatin dessert block.
* New fluids gelatin mix & red gelatin mix

### ***1.0.0***

* Initial Release