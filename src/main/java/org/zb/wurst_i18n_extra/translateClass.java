package org.zb.wurst_i18n_extra;

import net.wurstclient.WurstClient;

public class translateClass {
    public static String translate(String key) {
        return WurstClient.INSTANCE.translate(key.toLowerCase());

    }

    public static String category(String name) {
        return translate("category.wurst." + name.toLowerCase());
    }

    public static String item(String name) {
        return translate("item.wurst.hack." + name.toLowerCase());
    }


}
