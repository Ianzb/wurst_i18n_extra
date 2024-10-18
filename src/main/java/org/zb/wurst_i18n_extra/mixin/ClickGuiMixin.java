package org.zb.wurst_i18n_extra.mixin;

import net.wurstclient.Category;
import net.wurstclient.clickgui.*;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.*;
import org.zb.wurst_i18n_extra.translate;

@Mixin(ClickGui.class)
public class ClickGuiMixin {

    @ModifyArg(method = "init()V", at = @At(value = "INVOKE", target = "Lnet/wurstclient/Category;getName()Ljava/lang/String;", opcode = Opcodes.GETFIELD), index = 0)
    public String init(String title) {
        return translate.item(title);
    }
}
