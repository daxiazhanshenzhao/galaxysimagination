package org.galaxysimagination.Util;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

import java.util.Objects;

public class Debug {
    public static void info(String msg){

        LogUtils.getLogger().info(msg);
    }
}
