//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/rhel/Descargas/1.7.10mappings"!

//Decompiled by Procyon!

package danger.orespawn;

import net.minecraft.world.*;

public class RubyBird extends Cockateil
{
    public RubyBird(final World par1World) {
        super(par1World);
    }
    
    protected void entityInit() {
        super.entityInit();
        this.setBirdType(this.birdtype = 5);
        this.setFlyUp();
    }
    
    protected String getLivingSound() {
        if (this.worldObj.isDaytime() && !this.worldObj.isRaining()) {
            return "orespawn:rubybird";
        }
        return null;
    }
    
    public boolean getCanSpawnHere() {
        return true;
    }
}
