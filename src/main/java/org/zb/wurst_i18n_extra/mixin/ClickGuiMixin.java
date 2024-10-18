package org.zb.wurst_i18n_extra.mixin;

import net.wurstclient.clickgui.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.zb.wurst_i18n_extra.translateClass;

@Mixin(ClickGui.class)
public class ClickGuiMixin {

    @ModifyArg(method = "init()V", at = @At(value = "INVOKE", target = "Ljava/util/LinkedHashMap;put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), index = 1)
    public Object init(Object par1) {
        return par1;
    }
}
