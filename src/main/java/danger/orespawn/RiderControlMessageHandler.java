//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/rhel/Descargas/1.7.10mappings"!

//Decompiled by Procyon!

package danger.orespawn;

import io.netty.channel.*;
import cpw.mods.fml.common.network.simpleimpl.*;
import cpw.mods.fml.relauncher.*;
import org.apache.logging.log4j.*;

@ChannelHandler.Sharable
public class RiderControlMessageHandler implements IMessageHandler<RiderControlMessage, IMessage>
{
    private static final Logger L;
    
    public IMessage onMessage(final RiderControlMessage message, final MessageContext ctx) {
        if (ctx.side == Side.CLIENT) {
            return null;
        }
        OreSpawnMain.flyup_keystate = message.keystate;
        return null;
    }
    
    static {
        L = LogManager.getLogger();
    }
}
