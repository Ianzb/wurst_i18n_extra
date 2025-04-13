package org.zb.wurst_i18n_extra.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.wurstclient.other_feature.OtherFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.zb.wurst_i18n_extra.translateClass;

@Mixin(OtherFeature.class)
public abstract class OtherFeatureMixin {
    @Inject(
        method = "getName()Ljava/lang/String;",
        at = @At("RETURN"),
        cancellable = true
    )
    private void onGetName(CallbackInfoReturnable<String> cir) {
        String translated = translateClass.item(cir.getReturnValue());
        cir.setReturnValue(translated);
    }
}