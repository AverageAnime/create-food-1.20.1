package net.averageanime.createfood.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.averageanime.createfood.fluid.ModFluids;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.client.render.Camera;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.FluidState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Environment(EnvType.CLIENT)
@Mixin(BackgroundRenderer.class)
public abstract class BackgroundRendererMixin {
    @Shadow
    private static float red;

    @Shadow
    private static float green;

    @Shadow
    private static float blue;

    @ModifyArgs(method = "render", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;clearColor(FFFF)V", remap = false))
    private static void $modifyFogColors(Args args, Camera camera, float partialTicks, ClientWorld level, int renderDistanceChunks, float bossColorModifier) {
        FluidState state = level.getFluidState(camera.getBlockPos());
        if (ModFluids.isWaffleBatter(state)) {
            red = (float) 224 / 255;
            green = (float) 213 / 255;
            blue = (float) 184 / 255;
        }
        if (ModFluids.isCreamPieFilling(state)) {
            red = (float) 225 / 255;
            green = (float) 217 / 255;
            blue = (float) 207 / 255;
        }
        if (ModFluids.isGlowBerryPieFilling(state)) {
            red = (float) 229 / 255;
            green = (float) 138 / 255;
            blue = (float) 107 / 255;
        }
        if (ModFluids.isChorusFruitPieFilling(state)) {
            red = (float) 223 / 255;
            green = (float) 70 / 255;
            blue = (float) 221 / 255;
        }
        if (ModFluids.isBerryPieFilling(state)) {
            red = (float) 230 / 255;
            green = (float) 110 / 255;
            blue = (float) 160 / 255;
        }
        if (ModFluids.isApplePieFilling(state)) {
            red = (float) 165 / 255;
            green = (float) 18 / 255;
            blue = (float) 0 / 255;
        }
        if (ModFluids.isCheesecakeFilling(state)) {
            red = (float) 225 / 255;
            green = (float) 217 / 255;
            blue = (float) 207 / 255;
        }
        if (ModFluids.isCreamCheese(state)) {
            red = (float) 225 / 255;
            green = (float) 217 / 255;
            blue = (float) 207 / 255;
        }
        if (ModFluids.isVinegar(state)) {
            red = (float) 198 / 255;
            green = (float) 197 / 255;
            blue = (float) 193 / 255;
        }
        if (ModFluids.isFruitSmoothie(state)) {
            red = (float) 255 / 255;
            green = (float) 126 / 255;
            blue = (float) 114 / 255;
        }
        if (ModFluids.isYogurt(state)) {
            red = (float) 228 / 255;
            green = (float) 212 / 255;
            blue = (float) 186 / 255;
        }
        if (ModFluids.isSourCream(state)) {
            red = (float) 228 / 255;
            green = (float) 212 / 255;
            blue = (float) 186 / 255;
        }
        if (ModFluids.isMelonCreamFrosting(state)) {
            red = (float) 255 / 255;
            green = (float) 118 / 255;
            blue = (float) 125 / 255;
        }
        if (ModFluids.isMelonJam(state)) {
            red = (float) 255 / 255;
            green = (float) 118 / 255;
            blue = (float) 125 / 255;
        }
        if (ModFluids.isMelonIceCream(state)) {
            red = (float) 255 / 255;
            green = (float) 118 / 255;
            blue = (float) 125 / 255;
        }
        if (ModFluids.isMelonMilkshake(state)) {
            red = (float) 255 / 255;
            green = (float) 118 / 255;
            blue = (float) 125 / 255;
        }
        if (ModFluids.isUbeCreamFrosting(state)) {
            red = (float) 106 / 255;
            green = (float) 98 / 255;
            blue = (float) 159 / 255;
        }
        if (ModFluids.isChocolateMilkshake(state)) {
            red = (float) 96 / 255;
            green = (float) 56 / 255;
            blue = (float) 36 / 255;
        }
        if (ModFluids.isChocolateIceCream(state)) {
            red = (float) 96 / 255;
            green = (float) 56 / 255;
            blue = (float) 36 / 255;
        }
        if (ModFluids.isMilkshake(state)) {
            red = (float) 79 / 255;
            green = (float) 67 / 255;
            blue = (float) 56 / 255;
        }
        if (ModFluids.isIceCream(state)) {
            red = (float) 79 / 255;
            green = (float) 67 / 255;
            blue = (float) 56 / 255;
        }
        if (ModFluids.isHeavyCream(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isSlime(state)) {
            red = (float) 76 / 255;
            green = (float) 164 / 255;
            blue = (float) 120 / 255;
        }
        if (ModFluids.isWhiteChocolateFudge(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isDarkChocolateFudge(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isChocolateFudge(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isToffeeFudge(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isCoffeeToffeeFudge(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isCoffeeToffee(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isCaramelFudge(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isButterscotchFudge(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isAppleCreamFrosting(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isAppleIceCream(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isAppleMilkshake(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isCondensedMilk(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isButterscotch(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isToffee(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isBlackstrapMolasses(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isMolasses(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isCaneSyrup(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isSugarCaneJuice(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isVegetableOil(state)) {
            red = (float) 172 / 255;
            green = (float) 168 / 255;
            blue = (float) 117 / 255;
        }
        if (ModFluids.isBlackGelatinMix(state)) {
            red = (float) 29 / 255;
            green = (float) 29 / 255;
            blue = (float) 33 / 255;
        }
        if (ModFluids.isBlueGelatinMix(state)) {
            red = (float) 60 / 255;
            green = (float) 68 / 255;
            blue = (float) 170 / 255;
        }
        if (ModFluids.isBrownGelatinMix(state)) {
            red = (float) 131 / 255;
            green = (float) 84 / 255;
            blue = (float) 50 / 255;
        }
        if (ModFluids.isCyanGelatinMix(state)) {
            red = (float) 22 / 255;
            green = (float) 156 / 255;
            blue = (float) 156 / 255;
        }
        if (ModFluids.isGrayGelatinMix(state)) {
            red = (float) 71 / 255;
            green = (float) 79 / 255;
            blue = (float) 82 / 255;
        }
        if (ModFluids.isGreenGelatinMix(state)) {
            red = (float) 94 / 255;
            green = (float) 124 / 255;
            blue = (float) 22 / 255;
        }
        if (ModFluids.isLightBlueGelatinMix(state)) {
            red = (float) 58 / 255;
            green = (float) 179 / 255;
            blue = (float) 218 / 255;
        }
        if (ModFluids.isLightGrayGelatinMix(state)) {
            red = (float) 157 / 255;
            green = (float) 157 / 255;
            blue = (float) 151 / 255;
        }
        if (ModFluids.isLimeGelatinMix(state)) {
            red = (float) 128 / 255;
            green = (float) 193 / 255;
            blue = (float) 127 / 255;
        }
        if (ModFluids.isMagentaGelatinMix(state)) {
            red = (float) 199 / 255;
            green = (float) 78 / 255;
            blue = (float) 189 / 255;
        }
        if (ModFluids.isOrangeGelatinMix(state)) {
            red = (float) 249 / 255;
            green = (float) 128 / 255;
            blue = (float) 29 / 255;
        }
        if (ModFluids.isPinkGelatinMix(state)) {
            red = (float) 243 / 255;
            green = (float) 139 / 255;
            blue = (float) 170 / 255;
        }
        if (ModFluids.isPurpleGelatinMix(state)) {
            red = (float) 137 / 255;
            green = (float) 50 / 255;
            blue = (float) 184 / 255;
        }
        if (ModFluids.isRedGelatinMix(state)) {
            red = (float) 226 / 255;
            green = (float) 85 / 255;
            blue = (float) 85 / 255;
        }
        if (ModFluids.isYellowGelatinMix(state)) {
            red = (float) 254 / 255;
            green = (float) 216 / 255;
            blue = (float) 61 / 255;
        }
        if (ModFluids.isGelatinMix(state)) {
            red = (float) 90 / 255;
            green = (float) 85 / 255;
            blue = (float) 80 / 255;
        }
        if (ModFluids.isCreamFrosting(state)) {
            red = (float) 87 / 255;
            green = (float) 85 / 255;
            blue = (float) 74 / 255;
        }
        if (ModFluids.isCaramel(state)) {
            red = (float) 96 / 255;
            green = (float) 56 / 255;
            blue = (float) 36 / 255;
        }
        if (ModFluids.isBerryCreamFrosting(state)) {
            red = (float) 85 / 255;
            green = (float) 32 / 255;
            blue = (float) 32 / 255;
        }
        if (ModFluids.isBerryIceCream(state)) {
            red = (float) 85 / 255;
            green = (float) 32 / 255;
            blue = (float) 32 / 255;
        }
        if (ModFluids.isBerryMilkshake(state)) {
            red = (float) 85 / 255;
            green = (float) 32 / 255;
            blue = (float) 32 / 255;
        }
        if (ModFluids.isChocolateCreamFrosting(state)) {
            red = (float) 96 / 255;
            green = (float) 56 / 255;
            blue = (float) 36 / 255;
        }
        if (ModFluids.isChocolateMilk(state)) {
            red = (float) 96 / 255;
            green = (float) 56 / 255;
            blue = (float) 36 / 255;
        }
        if (ModFluids.isHotChocolate(state)) {
            red = (float) 96 / 255;
            green = (float) 56 / 255;
            blue = (float) 36 / 255;
        }
        if (ModFluids.isHotWhiteChocolate(state)) {
            red = (float) 79 / 255;
            green = (float) 67 / 255;
            blue = (float) 56 / 255;
        }
        if (ModFluids.isHotDarkChocolate(state)) {
            red = (float) 29 / 255;
            green = (float) 12 / 255;
            blue = (float) 9 / 255;
        }
        if (ModFluids.isWhiteChocolate(state)) {
            red = (float) 79 / 255;
            green = (float) 67 / 255;
            blue = (float) 56 / 255;
        }
        if (ModFluids.isDarkChocolate(state)) {
            red = (float) 29 / 255;
            green = (float) 12 / 255;
            blue = (float) 9 / 255;
        }
        if (ModFluids.isCacaoButter(state)) {
            red = (float) 76 / 255;
            green = (float) 67 / 255;
            blue = (float) 50 / 255;
        }
        if (ModFluids.isCacaoMass(state)) {
            red = (float) 49 / 255;
            green = (float) 33 / 255;
            blue = (float) 18 / 255;
        }
        if (ModFluids.isGlowBerryCreamFrosting(state)) {
            red = (float) 69 / 255;
            green = (float) 47 / 255;
            blue = (float) 14 / 255;
        }
        if (ModFluids.isGlowBerryIceCream(state)) {
            red = (float) 69 / 255;
            green = (float) 47 / 255;
            blue = (float) 14 / 255;
        }
        if (ModFluids.isGlowBerryMilkshake(state)) {
            red = (float) 69 / 255;
            green = (float) 47 / 255;
            blue = (float) 14 / 255;
        }
        if (ModFluids.isChorusFruitCreamFrosting(state)) {
            red = (float) 42 / 255;
            green = (float) 16 / 255;
            blue = (float) 60 / 255;
        }
        if (ModFluids.isChorusFruitIceCream(state)) {
            red = (float) 42 / 255;
            green = (float) 16 / 255;
            blue = (float) 60 / 255;
        }
        if (ModFluids.isChorusFruitMilkshake(state)) {
            red = (float) 42 / 255;
            green = (float) 16 / 255;
            blue = (float) 60 / 255;
        }
        if (ModFluids.isAppleJam(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isBerryJam(state)) {
            red = (float) 85 / 255;
            green = (float) 32 / 255;
            blue = (float) 32 / 255;
        }
        if (ModFluids.isGlowBerryJam(state)) {
            red = (float) 69 / 255;
            green = (float) 47 / 255;
            blue = (float) 14 / 255;
        }
        if (ModFluids.isChorusFruitJam(state)) {
            red = (float) 42 / 255;
            green = (float) 16 / 255;
            blue = (float) 60 / 255;
        }
        if (ModFluids.isAppleJuice(state)) {
            red = (float) 190 / 255;
            green = (float) 184 / 255;
            blue = (float) 115 / 255;
        }
        if (ModFluids.isBerryJuice(state)) {
            red = (float) 85 / 255;
            green = (float) 32 / 255;
            blue = (float) 32 / 255;
        }
        if (ModFluids.isGlowBerryJuice(state)) {
            red = (float) 69 / 255;
            green = (float) 47 / 255;
            blue = (float) 14 / 255;
        }
        if (ModFluids.isChorusFruitJuice(state)) {
            red = (float) 42 / 255;
            green = (float) 16 / 255;
            blue = (float) 60 / 255;
        }
        if (ModFluids.isSquidInk(state)) {
            red = (float) 16 / 255;
            green = (float) 12 / 255;
            blue = (float) 28 / 255;
        }
    }


    @Inject(method = "applyFog", at = @At("HEAD"), cancellable = true)
    private static void $applyFog(Camera camera, FogType fogType, float viewDistance, boolean thickFog, float tickDelta, CallbackInfo ci) {
        assert MinecraftClient.getInstance().world != null;
        FluidState state = MinecraftClient.getInstance().world.getFluidState(camera.getBlockPos());
        if (ModFluids.isWaffleBatter(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChorusFruitPieFilling(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isGlowBerryPieFilling(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isBerryPieFilling(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isApplePieFilling(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCheesecakeFilling(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCreamCheese(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isVinegar(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isSourCream(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isYogurt(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isFruitSmoothie(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isSquidInk(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMelonCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMelonIceCream(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMelonMilkshake(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMelonJam(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isAppleJam(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isBerryJam(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChorusFruitJam(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isGlowBerryJam(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isAppleJuice(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isBerryJuice(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChorusFruitJuice(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isGlowBerryJuice(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isUbeCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCoffeeToffee(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCoffeeToffeeFudge(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isAppleMilkshake(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isAppleIceCream(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isBerryMilkshake(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isBerryIceCream(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isGlowBerryMilkshake(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isGlowBerryIceCream(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChorusFruitMilkshake(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChorusFruitIceCream(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMilkshake(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChocolateMilkshake(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChocolateIceCream(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isIceCream(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isHeavyCream(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isSlime(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isWhiteChocolateFudge(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isDarkChocolateFudge(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChocolateFudge(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isToffeeFudge(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCaramelFudge(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isButterscotchFudge(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isAppleCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCondensedMilk(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isButterscotch(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isToffee(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isBlackstrapMolasses(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMolasses(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCaneSyrup(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isSugarCaneJuice(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isVegetableOil(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isBlackGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isBlueGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isBrownGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCyanGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isGrayGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isGreenGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isLightBlueGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isLightGrayGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isLimeGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isMagentaGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isOrangeGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isPinkGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isPurpleGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isRedGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isYellowGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isGelatinMix(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isBerryCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isGlowBerryCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChorusFruitCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChocolateCreamFrosting(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isChocolateMilk(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isWhiteChocolate(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isDarkChocolate(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCacaoButter(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCacaoMass(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
        if (ModFluids.isCaramel(state)) {
            RenderSystem.setShaderFogStart(-1);
            RenderSystem.setShaderFogEnd(1);
            ci.cancel();
        }
    }
}