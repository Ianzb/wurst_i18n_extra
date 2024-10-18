package org.zb.wurst_i18n_extra.mixin;

import net.wurstclient.hud.HackListHUD;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.zb.wurst_i18n_extra.translateClass;

@Mixin(HackListHUD.class)
public class HackListHUDMixin {

    @ModifyVariable(method = "drawWithOffset", at = @At("STORE"), ordinal = 0)
    private String injected(String name) {
        return translateClass.item(name);
    }
}
