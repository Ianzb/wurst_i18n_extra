package org.zb.wurst_i18n_extra.mixin;

import net.wurstclient.hack.Hack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Unique;
import org.zb.wurst_i18n_extra.translateClass;

@Mixin(Hack.class)
public class HackMixin {
    @Mutable
    @Unique
    @Final
    private final String name;

    HackMixin(String name) {
        this.name = name;
    }

    public String getTranslatedName() {
        return  translateClass.item(this.name);
    }
    public String getRenderName() {
        return  translateClass.item(this.name);
    }
}
