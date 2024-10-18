package org.zb.wurst_i18n_extra.mixin;

import net.wurstclient.update.WurstUpdater;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(WurstUpdater.class)
public class WurstUpdaterMixin {
    /**
     * @author
     * @reason
     */
    @Overwrite
    public void onUpdate() {}
}
