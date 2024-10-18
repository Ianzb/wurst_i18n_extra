package org.zb.wurst_i18n_extra.mixin;

import net.wurstclient.other_features.HackListOtf;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.zb.wurst_i18n_extra.translateClass;

@Mixin(HackListOtf.class)
public class HackListOtfMixin {
//    @ModifyArg(method = "SortBy()", at = @At(value = "INVOKE", target = "Lget"), index = 0)
//    public String init(String title) {
//        return translateClass.item(title);
//    }
}
