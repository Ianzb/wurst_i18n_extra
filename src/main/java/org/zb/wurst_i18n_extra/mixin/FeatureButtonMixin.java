package org.zb.wurst_i18n_extra.mixin;

import net.wurstclient.WurstClient;
import net.wurstclient.clickgui.components.FeatureButton;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.zb.wurst_i18n_extra.translate;

@Mixin(FeatureButton.class)
public class FeatureButtonMixin {
    @ModifyVariable(method = "drawName", at = @At("STORE"), ordinal = 0)
    private String injected(String name) {
        return translate.item(name);
    }
}
