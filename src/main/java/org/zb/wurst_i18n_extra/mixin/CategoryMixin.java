package org.zb.wurst_i18n_extra.mixin;

import net.wurstclient.Category;
import org.spongepowered.asm.mixin.*;
import org.zb.wurst_i18n_extra.translateClass;

@Mixin(Category.class)
abstract class CategoryMixin {
//    @Final
//    @Mutable
//    @Shadow
//    private final String name;
//
//    CategoryMixin(String name) {
//        this.name = name;
//    }
//
//    public String getName(){
//		return translateClass.category(this.name);
//	}
}
