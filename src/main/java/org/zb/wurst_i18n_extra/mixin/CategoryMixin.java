package org.zb.wurst_i18n_extra.mixin;

import net.wurstclient.WurstClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

//@ModifyVariable(method = "Category", at = @At("HEAD"), argsOnly = true)
@Mixin(targets = "net.wurstclient.Category")
public class Category {
    @Shadow
    private final String name;

    public Category(String name) {
        this.name = name;
    }

    @Unique
    public String getTranslatedName(){
		return WurstClient.INSTANCE.translate("category.wurst." + name.toLowerCase());
	}
}
