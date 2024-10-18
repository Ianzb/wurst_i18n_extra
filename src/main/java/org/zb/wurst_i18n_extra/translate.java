package org.zb.wurst_i18n_extra;

import net.wurstclient.WurstClient;

public class translate {
    public static String category(String name){
		return WurstClient.INSTANCE.translate("category.wurst." + name.toLowerCase());
	}
    public static String item(String name) {
        return WurstClient.INSTANCE.translate("item.wurst.hack." + name.toLowerCase());
    }
}
