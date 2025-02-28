package net.averageanime.createfood;

import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
import net.averageanime.createfood.block.ModBlocks;
import net.averageanime.createfood.fluid.ModFluids;
import net.averageanime.createfood.item.ModTags;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.averageanime.createfood.CreateFood.CONFIG;
@Environment(value= EnvType.CLIENT)
public class CreateFoodClient implements ClientModInitializer {

    public static final String MOD_ID = "createfood";

    public static Identifier asId(String path) {
        return new Identifier(MOD_ID, path);
    }

    @Override
    public void onInitializeClient() {

// Resource Packs

        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container -> {
            ResourceManagerHelper.registerBuiltinResourcePack(asId("create"), container, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(asId("farmers_delight"), container, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(asId("expanded_delight"), container, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(asId("farmers_respite"), container, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(asId("ends_delight"), container, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(asId("cultural_delight"), container, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(asId("ubes_delight"), container, ResourcePackActivationType.NORMAL);
            ResourceManagerHelper.registerBuiltinResourcePack(asId("rustic_delight"), container, ResourcePackActivationType.NORMAL);
        });

// Food Effect Tooltips

        ItemTooltipCallback.EVENT.register((stack, context, lines) -> {
            if (stack.isIn(ModTags.BRIEF_COMFORT)) {
                StatusEffect effect = EffectsRegistry.COMFORT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }

            if (stack.isIn(ModTags.SHORT_COMFORT)) {
                StatusEffect effect = EffectsRegistry.COMFORT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_COMFORT)) {
                StatusEffect effect = EffectsRegistry.COMFORT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_COMFORT)) {
                StatusEffect effect = EffectsRegistry.COMFORT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }

            if (stack.isIn(ModTags.BRIEF_NOURISHMENT)) {
                StatusEffect effect = EffectsRegistry.NOURISHMENT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_NOURISHMENT)) {
                StatusEffect effect = EffectsRegistry.NOURISHMENT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_NOURISHMENT)) {
                StatusEffect effect = EffectsRegistry.NOURISHMENT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_NOURISHMENT)) {
                StatusEffect effect = EffectsRegistry.NOURISHMENT.get();
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_GLOWING)) {
                StatusEffect effect = StatusEffects.GLOWING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_GLOWING)) {
                StatusEffect effect = StatusEffects.GLOWING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_GLOWING)) {
                StatusEffect effect = StatusEffects.GLOWING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_GLOWING)) {
                StatusEffect effect = StatusEffects.GLOWING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_NIGHT_VISION)) {
                StatusEffect effect = StatusEffects.NIGHT_VISION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_NIGHT_VISION)) {
                StatusEffect effect = StatusEffects.NIGHT_VISION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_NIGHT_VISION)) {
                StatusEffect effect = StatusEffects.NIGHT_VISION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_NIGHT_VISION)) {
                StatusEffect effect = StatusEffects.NIGHT_VISION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_SLOW_FALLING)) {
                StatusEffect effect = StatusEffects.SLOW_FALLING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_SLOW_FALLING)) {
                StatusEffect effect = StatusEffects.SLOW_FALLING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_SLOW_FALLING)) {
                StatusEffect effect = StatusEffects.SLOW_FALLING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_SLOW_FALLING)) {
                StatusEffect effect = StatusEffects.SLOW_FALLING;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_JUMP_BOOST)) {
                StatusEffect effect = StatusEffects.JUMP_BOOST;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_JUMP_BOOST)) {
                StatusEffect effect = StatusEffects.JUMP_BOOST;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_JUMP_BOOST)) {
                StatusEffect effect = StatusEffects.JUMP_BOOST;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_JUMP_BOOST)) {
                StatusEffect effect = StatusEffects.JUMP_BOOST;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_SPEED)) {
                StatusEffect effect = StatusEffects.SPEED;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_SPEED)) {
                StatusEffect effect = StatusEffects.SPEED;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_SPEED)) {
                StatusEffect effect = StatusEffects.SPEED;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_SPEED)) {
                StatusEffect effect = StatusEffects.SPEED;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_HASTE)) {
                StatusEffect effect = StatusEffects.HASTE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_HASTE)) {
                StatusEffect effect = StatusEffects.HASTE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_HASTE)) {
                StatusEffect effect = StatusEffects.HASTE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_HASTE)) {
                StatusEffect effect = StatusEffects.HASTE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_STRENGTH)) {
                StatusEffect effect = StatusEffects.STRENGTH;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_STRENGTH)) {
                StatusEffect effect = StatusEffects.STRENGTH;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_STRENGTH)) {
                StatusEffect effect = StatusEffects.STRENGTH;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_STRENGTH)) {
                StatusEffect effect = StatusEffects.STRENGTH;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_LUCK)) {
                StatusEffect effect = StatusEffects.LUCK;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_LUCK)) {
                StatusEffect effect = StatusEffects.LUCK;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_LUCK)) {
                StatusEffect effect = StatusEffects.LUCK;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_LUCK)) {
                StatusEffect effect = StatusEffects.LUCK;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_FIRE_RESISTANCE)) {
                StatusEffect effect = StatusEffects.FIRE_RESISTANCE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_FIRE_RESISTANCE)) {
                StatusEffect effect = StatusEffects.FIRE_RESISTANCE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_FIRE_RESISTANCE)) {
                StatusEffect effect = StatusEffects.FIRE_RESISTANCE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_FIRE_RESISTANCE)) {
                StatusEffect effect = StatusEffects.FIRE_RESISTANCE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_ABSORPTION)) {
                StatusEffect effect = StatusEffects.ABSORPTION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_ABSORPTION)) {
                StatusEffect effect = StatusEffects.ABSORPTION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_ABSORPTION)) {
                StatusEffect effect = StatusEffects.ABSORPTION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_ABSORPTION)) {
                StatusEffect effect = StatusEffects.ABSORPTION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.BRIEF_RESISTANCE)) {
                StatusEffect effect = StatusEffects.RESISTANCE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_RESISTANCE)) {
                StatusEffect effect = StatusEffects.RESISTANCE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_RESISTANCE)) {
                StatusEffect effect = StatusEffects.RESISTANCE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_RESISTANCE)) {
                StatusEffect effect = StatusEffects.RESISTANCE;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }

            if (stack.isIn(ModTags.BRIEF_REGENERATION)) {
                StatusEffect effect = StatusEffects.REGENERATION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.SHORT_REGENERATION)) {
                StatusEffect effect = StatusEffects.REGENERATION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 1200), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.MEDIUM_REGENERATION)) {
                StatusEffect effect = StatusEffects.REGENERATION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 3600), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
            if (stack.isIn(ModTags.LONG_REGENERATION)) {
                StatusEffect effect = StatusEffects.REGENERATION;
                lines.add(Text.translatable("potion.withDuration", Text.translatable(effect.getTranslationKey()),
                                StatusEffectUtil.getDurationText(
                                        new StatusEffectInstance(effect, 6000), 1))
                        .formatted(effect.getCategory().getFormatting()));
            }
        });

// Fluids

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_WAFFLE_BATTER, ModFluids.FLOWING_WAFFLE_BATTER, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/waffle_batter_still"),
                new Identifier("createfood:block/waffle_batter_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CREAM_PIE_FILLING, ModFluids.FLOWING_CREAM_PIE_FILLING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cream_pie_filling_still"),
                new Identifier("createfood:block/cream_pie_filling_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHORUS_FRUIT_PIE_FILLING, ModFluids.FLOWING_CHORUS_FRUIT_PIE_FILLING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chorus_fruit_pie_filling_still"),
                new Identifier("createfood:block/chorus_fruit_pie_filling_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GLOW_BERRY_PIE_FILLING, ModFluids.FLOWING_GLOW_BERRY_PIE_FILLING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/glow_berry_pie_filling_still"),
                new Identifier("createfood:block/glow_berry_pie_filling_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BERRY_PIE_FILLING, ModFluids.FLOWING_BERRY_PIE_FILLING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/berry_pie_filling_still"),
                new Identifier("createfood:block/berry_pie_filling_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_APPLE_PIE_FILLING, ModFluids.FLOWING_APPLE_PIE_FILLING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/apple_pie_filling_still"),
                new Identifier("createfood:block/apple_pie_filling_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHEESECAKE_FILLING, ModFluids.FLOWING_CHEESECAKE_FILLING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cheesecake_filling_still"),
                new Identifier("createfood:block/cheesecake_filling_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CREAM_CHEESE, ModFluids.FLOWING_CREAM_CHEESE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cream_cheese_still"),
                new Identifier("createfood:block/cream_cheese_flow")
        ));

        if (CONFIG.isVinegarFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_VINEGAR, ModFluids.FLOWING_VINEGAR);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_VINEGAR, ModFluids.FLOWING_VINEGAR, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0xc5c6c1
            ));
        }

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SOUR_CREAM, ModFluids.FLOWING_SOUR_CREAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/sour_cream_still"),
                new Identifier("createfood:block/sour_cream_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_YOGURT, ModFluids.FLOWING_YOGURT, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/yogurt_still"),
                new Identifier("createfood:block/yogurt_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_FRUIT_SMOOTHIE, ModFluids.FLOWING_FRUIT_SMOOTHIE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/fruit_smoothie_still"),
                new Identifier("createfood:block/fruit_smoothie_flow")
        ));
        if (CONFIG.isSquidInkFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_SQUID_INK, ModFluids.FLOWING_SQUID_INK);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SQUID_INK, ModFluids.FLOWING_SQUID_INK, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0x100c1c
            ));
        }
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MELON_JAM, ModFluids.FLOWING_MELON_JAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/melon_jam_still"),
                new Identifier("createfood:block/melon_jam_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MELON_ICE_CREAM, ModFluids.FLOWING_MELON_ICE_CREAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/melon_ice_cream_still"),
                new Identifier("createfood:block/melon_ice_cream_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MELON_MILKSHAKE, ModFluids.FLOWING_MELON_MILKSHAKE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/melon_milkshake_still"),
                new Identifier("createfood:block/melon_milkshake_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MELON_CREAM_FROSTING, ModFluids.FLOWING_MELON_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/melon_cream_frosting_still"),
                new Identifier("createfood:block/melon_cream_frosting_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_APPLE_JAM, ModFluids.FLOWING_APPLE_JAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/apple_jam_still"),
                new Identifier("createfood:block/apple_jam_flow")
        ));
        if (CONFIG.isAppleJuiceFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_APPLE_JUICE, ModFluids.FLOWING_APPLE_JUICE);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_APPLE_JUICE, ModFluids.FLOWING_APPLE_JUICE, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0xffec82
            ));
        }
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BERRY_JAM, ModFluids.FLOWING_BERRY_JAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/berry_jam_still"),
                new Identifier("createfood:block/berry_jam_flow")
        ));
        if (CONFIG.isBerryJuiceFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BERRY_JUICE, ModFluids.FLOWING_BERRY_JUICE);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BERRY_JUICE, ModFluids.FLOWING_BERRY_JUICE, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0xde88a7
            ));
        }
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHORUS_FRUIT_JAM, ModFluids.FLOWING_CHORUS_FRUIT_JAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chorus_fruit_jam_still"),
                new Identifier("createfood:block/chorus_fruit_jam_flow")
        ));
        if (CONFIG.isChorusFruitJuiceFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_CHORUS_FRUIT_JUICE, ModFluids.FLOWING_CHORUS_FRUIT_JUICE);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHORUS_FRUIT_JUICE, ModFluids.FLOWING_CHORUS_FRUIT_JUICE, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0xe243d6
            ));
        }
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GLOW_BERRY_JAM, ModFluids.FLOWING_GLOW_BERRY_JAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/glow_berry_jam_still"),
                new Identifier("createfood:block/glow_berry_jam_flow")
        ));
        if (CONFIG.isGlowBerryJuiceFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GLOW_BERRY_JUICE, ModFluids.FLOWING_GLOW_BERRY_JUICE);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GLOW_BERRY_JUICE, ModFluids.FLOWING_GLOW_BERRY_JUICE, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0xf6ae4b
            ));
        }
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_APPLE_ICE_CREAM, ModFluids.FLOWING_APPLE_ICE_CREAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/apple_ice_cream_still"),
                new Identifier("createfood:block/apple_ice_cream_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_APPLE_MILKSHAKE, ModFluids.FLOWING_APPLE_MILKSHAKE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/apple_milkshake_still"),
                new Identifier("createfood:block/apple_milkshake_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BERRY_ICE_CREAM, ModFluids.FLOWING_BERRY_ICE_CREAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/berry_ice_cream_still"),
                new Identifier("createfood:block/berry_ice_cream_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BERRY_MILKSHAKE, ModFluids.FLOWING_BERRY_MILKSHAKE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/berry_milkshake_still"),
                new Identifier("createfood:block/berry_milkshake_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GLOW_BERRY_ICE_CREAM, ModFluids.FLOWING_GLOW_BERRY_ICE_CREAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/glow_berry_ice_cream_still"),
                new Identifier("createfood:block/glow_berry_ice_cream_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GLOW_BERRY_MILKSHAKE, ModFluids.FLOWING_GLOW_BERRY_MILKSHAKE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/glow_berry_milkshake_still"),
                new Identifier("createfood:block/glow_berry_milkshake_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHORUS_FRUIT_ICE_CREAM, ModFluids.FLOWING_CHORUS_FRUIT_ICE_CREAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chorus_fruit_ice_cream_still"),
                new Identifier("createfood:block/chorus_fruit_ice_cream_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHORUS_FRUIT_MILKSHAKE, ModFluids.FLOWING_CHORUS_FRUIT_MILKSHAKE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chorus_fruit_milkshake_still"),
                new Identifier("createfood:block/chorus_fruit_milkshake_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MILKSHAKE, ModFluids.FLOWING_MILKSHAKE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/milkshake_still"),
                new Identifier("createfood:block/milkshake_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHOCOLATE_ICE_CREAM, ModFluids.FLOWING_CHOCOLATE_ICE_CREAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chocolate_ice_cream_still"),
                new Identifier("createfood:block/chocolate_ice_cream_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHOCOLATE_MILKSHAKE, ModFluids.FLOWING_CHOCOLATE_MILKSHAKE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chocolate_milkshake_still"),
                new Identifier("createfood:block/chocolate_milkshake_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_ICE_CREAM, ModFluids.FLOWING_ICE_CREAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/ice_cream_still"),
                new Identifier("createfood:block/ice_cream_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_HEAVY_CREAM, ModFluids.FLOWING_HEAVY_CREAM, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/heavy_cream_still"),
                new Identifier("createfood:block/heavy_cream_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SLIME, ModFluids.FLOWING_SLIME, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/slime_still"),
                new Identifier("createfood:block/slime_flow")
                ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_WHITE_CHOCOLATE_FUDGE, ModFluids.FLOWING_WHITE_CHOCOLATE_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/white_chocolate_fudge_still"),
                new Identifier("createfood:block/white_chocolate_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_DARK_CHOCOLATE_FUDGE, ModFluids.FLOWING_DARK_CHOCOLATE_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/dark_chocolate_fudge_still"),
                new Identifier("createfood:block/dark_chocolate_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHOCOLATE_FUDGE, ModFluids.FLOWING_CHOCOLATE_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chocolate_fudge_still"),
                new Identifier("createfood:block/chocolate_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_TOFFEE_FUDGE, ModFluids.FLOWING_TOFFEE_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/toffee_fudge_still"),
                new Identifier("createfood:block/toffee_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_COFFEE_TOFFEE_FUDGE, ModFluids.FLOWING_COFFEE_TOFFEE_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/coffee_toffee_fudge_still"),
                new Identifier("createfood:block/coffee_toffee_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_COFFEE_TOFFEE, ModFluids.FLOWING_COFFEE_TOFFEE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/coffee_toffee_still"),
                new Identifier("createfood:block/coffee_toffee_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CARAMEL_FUDGE, ModFluids.FLOWING_CARAMEL_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/caramel_fudge_still"),
                new Identifier("createfood:block/caramel_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BUTTERSCOTCH_FUDGE, ModFluids.FLOWING_BUTTERSCOTCH_FUDGE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/butterscotch_fudge_still"),
                new Identifier("createfood:block/butterscotch_fudge_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_APPLE_CREAM_FROSTING, ModFluids.FLOWING_APPLE_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/apple_cream_frosting_still"),
                new Identifier("createfood:block/apple_cream_frosting_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_UBE_CREAM_FROSTING, ModFluids.FLOWING_UBE_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/ube_cream_frosting_still"),
                new Identifier("createfood:block/ube_cream_frosting_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CONDENSED_MILK, ModFluids.FLOWING_CONDENSED_MILK, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/condensed_milk_still"),
                new Identifier("createfood:block/condensed_milk_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BUTTERSCOTCH, ModFluids.FLOWING_BUTTERSCOTCH, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/butterscotch_still"),
                new Identifier("createfood:block/butterscotch_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_TOFFEE, ModFluids.FLOWING_TOFFEE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/toffee_still"),
                new Identifier("createfood:block/toffee_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BLACKSTRAP_MOLASSES, ModFluids.FLOWING_BLACKSTRAP_MOLASSES, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/blackstrap_molasses_still"),
                new Identifier("createfood:block/blackstrap_molasses_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MOLASSES, ModFluids.FLOWING_MOLASSES, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/molasses_still"),
                new Identifier("createfood:block/molasses_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CANE_SYRUP, ModFluids.FLOWING_CANE_SYRUP, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cane_syrup_still"),
                new Identifier("createfood:block/cane_syrup_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SUGAR_CANE_JUICE, ModFluids.FLOWING_SUGAR_CANE_JUICE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/sugar_cane_juice_still"),
                new Identifier("createfood:block/sugar_cane_juice_flow")

        ));
        if (CONFIG.isVegetableOilFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_VEGETABLE_OIL, ModFluids.FLOWING_VEGETABLE_OIL);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_VEGETABLE_OIL, ModFluids.FLOWING_VEGETABLE_OIL, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0xaca875
            ));
        }
        if (CONFIG.isBlackGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BLACK_GELATIN_MIX, ModFluids.FLOWING_BLACK_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BLACK_GELATIN_MIX, ModFluids.FLOWING_BLACK_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0x1D1D21
            ));
        }
        if (CONFIG.isBlueGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BLUE_GELATIN_MIX, ModFluids.FLOWING_BLUE_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BLUE_GELATIN_MIX, ModFluids.FLOWING_BLUE_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0x3C44AA
            ));
        }
        if (CONFIG.isBrownGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BROWN_GELATIN_MIX, ModFluids.FLOWING_BROWN_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BROWN_GELATIN_MIX, ModFluids.FLOWING_BROWN_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0x835432
            ));
        }
        if (CONFIG.isCyanGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_CYAN_GELATIN_MIX, ModFluids.FLOWING_CYAN_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CYAN_GELATIN_MIX, ModFluids.FLOWING_CYAN_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0x169C9C
            ));
        }
        if (CONFIG.isGrayGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GRAY_GELATIN_MIX, ModFluids.FLOWING_GRAY_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GRAY_GELATIN_MIX, ModFluids.FLOWING_GRAY_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0x474F52
            ));
        }
        if (CONFIG.isGreenGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GREEN_GELATIN_MIX, ModFluids.FLOWING_GREEN_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GREEN_GELATIN_MIX, ModFluids.FLOWING_GREEN_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0x5E7C16
            ));
        }
        if (CONFIG.isLightBlueGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIGHT_BLUE_GELATIN_MIX, ModFluids.FLOWING_LIGHT_BLUE_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIGHT_BLUE_GELATIN_MIX, ModFluids.FLOWING_LIGHT_BLUE_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0x3AB3DA
            ));
        }
        if (CONFIG.isLightGrayGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIGHT_GRAY_GELATIN_MIX, ModFluids.FLOWING_LIGHT_GRAY_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIGHT_GRAY_GELATIN_MIX, ModFluids.FLOWING_LIGHT_GRAY_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0x9D9D97
            ));
        }
        if (CONFIG.isLimeGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIME_GELATIN_MIX, ModFluids.FLOWING_LIME_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIME_GELATIN_MIX, ModFluids.FLOWING_LIME_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0x80C71F
            ));
        }
        if (CONFIG.isMagentaGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_MAGENTA_GELATIN_MIX, ModFluids.FLOWING_MAGENTA_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MAGENTA_GELATIN_MIX, ModFluids.FLOWING_MAGENTA_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0xC74EBD
            ));
        }
        if (CONFIG.isOrangeGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_ORANGE_GELATIN_MIX, ModFluids.FLOWING_ORANGE_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_ORANGE_GELATIN_MIX, ModFluids.FLOWING_ORANGE_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0xF9801D
            ));
        }
        if (CONFIG.isPinkGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_PINK_GELATIN_MIX, ModFluids.FLOWING_PINK_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_PINK_GELATIN_MIX, ModFluids.FLOWING_PINK_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0xF38BAA
            ));
        }
        if (CONFIG.isPurpleGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_PURPLE_GELATIN_MIX, ModFluids.FLOWING_PURPLE_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_PURPLE_GELATIN_MIX, ModFluids.FLOWING_PURPLE_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0x8932B8
            ));
        }
        if (CONFIG.isRedGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_RED_GELATIN_MIX, ModFluids.FLOWING_RED_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_RED_GELATIN_MIX, ModFluids.FLOWING_RED_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0xb02e26
            ));
        }
        if (CONFIG.isYellowGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_YELLOW_GELATIN_MIX, ModFluids.FLOWING_YELLOW_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_YELLOW_GELATIN_MIX, ModFluids.FLOWING_YELLOW_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0xFED83D
            ));
        }
        if (CONFIG.isGelatinMixFluidEnabled) {
            BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GELATIN_MIX, ModFluids.FLOWING_GELATIN_MIX);
            FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GELATIN_MIX, ModFluids.FLOWING_GELATIN_MIX, new SimpleFluidRenderHandler(
                    new Identifier("minecraft:block/water_still"),
                    new Identifier("minecraft:block/water_flow"),
                    0xdfdfdf
            ));
        }
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CREAM_FROSTING, ModFluids.FLOWING_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cream_frosting_still"),
                new Identifier("createfood:block/cream_frosting_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BERRY_CREAM_FROSTING, ModFluids.FLOWING_BERRY_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/berry_cream_frosting_still"),
                new Identifier("createfood:block/berry_cream_frosting_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CARAMEL, ModFluids.FLOWING_CARAMEL, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/caramel_still"),
                new Identifier("createfood:block/caramel_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHOCOLATE_CREAM_FROSTING, ModFluids.FLOWING_CHOCOLATE_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chocolate_frosting_still"),
                new Identifier("createfood:block/chocolate_frosting_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHOCOLATE_MILK, ModFluids.FLOWING_CHOCOLATE_MILK, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chocolate_milk_still"),
                new Identifier("createfood:block/chocolate_milk_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_HOT_CHOCOLATE, ModFluids.FLOWING_HOT_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/hot_chocolate_still"),
                new Identifier("createfood:block/hot_chocolate_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CACAO_MASS, ModFluids.FLOWING_CACAO_MASS, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cacao_mass_still"),
                new Identifier("createfood:block/cacao_mass_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CACAO_BUTTER, ModFluids.FLOWING_CACAO_BUTTER, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/cacao_butter_still"),
                new Identifier("createfood:block/cacao_butter_flow")

        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_WHITE_CHOCOLATE, ModFluids.FLOWING_WHITE_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/white_chocolate_still"),
                new Identifier("createfood:block/white_chocolate_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_DARK_CHOCOLATE, ModFluids.FLOWING_DARK_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/dark_chocolate_still"),
                new Identifier("createfood:block/dark_chocolate_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_HOT_WHITE_CHOCOLATE, ModFluids.FLOWING_HOT_WHITE_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/hot_white_chocolate_still"),
                new Identifier("createfood:block/hot_white_chocolate_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_HOT_DARK_CHOCOLATE, ModFluids.FLOWING_HOT_DARK_CHOCOLATE, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/hot_dark_chocolate_still"),
                new Identifier("createfood:block/hot_dark_chocolate_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GLOW_BERRY_CREAM_FROSTING, ModFluids.FLOWING_GLOW_BERRY_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/glow_berry_cream_frosting_still"),
                new Identifier("createfood:block/glow_berry_cream_frosting_flow")
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHORUS_FRUIT_CREAM_FROSTING, ModFluids.FLOWING_CHORUS_FRUIT_CREAM_FROSTING, new SimpleFluidRenderHandler(
                new Identifier("createfood:block/chorus_fruit_cream_frosting_still"),
                new Identifier("createfood:block/chorus_fruit_cream_frosting_flow")
        ));

// Gelatin Dessert Blocks

        if (CONFIG.isBlackGelatinDessertBlockEnabled) {
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isBlueGelatinDessertBlockEnabled) {
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isBrownGelatinDessertBlockEnabled) {
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isCyanGelatinDessertBlockEnabled) {
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isGelatinDessertBlockEnabled) {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isGrayGelatinDessertBlockEnabled) {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isGreenGelatinDessertBlockEnabled) {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isLightBlueGelatinDessertBlockEnabled) {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isLightGrayGelatinDessertBlockEnabled) {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isLimeGelatinDessertBlockEnabled) {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isMagentaGelatinDessertBlockEnabled) {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isOrangeGelatinDessertBlockEnabled) {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isPinkGelatinDessertBlockEnabled) {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isPurpleGelatinDessertBlockEnabled) {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isRedGelatinDessertBlockEnabled) {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }
        if (CONFIG.isYellowGelatinDessertBlockEnabled) {
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_GELATIN_DESSERT, RenderLayer.getTranslucent());
        }

    }
}
