package org.zb.wurst_i18n_extra.mixin;

import net.wurstclient.WurstClient;
import net.wurstclient.hack.Hack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Unique;
import org.zb.wurst_i18n_extra.translate;

@Mixin(Hack.class)
public class HackMixin {
    @Mutable
    @Unique
    @Final
    private final String name;

    HackMixin(String name) {
        this.name = name;
    }
    @Unique
    public String getTranslatedName() {
        return  translate.item(this.name);
    }

}
