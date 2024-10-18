package org.zb.wurst_i18n_extra.mixin;

import net.wurstclient.WurstClient;
import net.wurstclient.Category;
import org.spongepowered.asm.mixin.*;
import org.zb.wurst_i18n_extra.translate;

@Mixin(Category.class)
abstract class CategoryMixin {
    @Mutable
    @Unique
    @Final private final String name;

    CategoryMixin(String name) {
        this.name = name;
    }


    @Unique
    public String getTranslatedName(){
		return translate.category(this.name);
	}
}
