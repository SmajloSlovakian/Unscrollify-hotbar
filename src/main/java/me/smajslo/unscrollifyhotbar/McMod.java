package me.smajslo.unscrollifyhotbar;

import lombok.Getter;
import lombok.Setter;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = McMod.MOD_ID,
        name = McMod.NAME,
        version = McMod.VERSION,
        clientSideOnly = true
)

@Setter
public class McMod {
    public static final String MOD_ID = "unscrollifyhotbar";
    public static final String NAME = "Unscrollify Hotbar";
    public static final String VERSION = "0.1";
    public static int previousHotbarPos=0;


    @Getter
    @Mod.Instance(value = McMod.MOD_ID)
    private static McMod instance;

    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        // Setup your config here
    }

    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
        // Setup your events here & register your commands here
        //
        // MinecraftForge.EVENT_BUS.register(...);
        //
        // ClientCommandHandler.instance.registerCommand(...);
    }
    public static void print(String s){
        System.out.println(s);
    }
}
