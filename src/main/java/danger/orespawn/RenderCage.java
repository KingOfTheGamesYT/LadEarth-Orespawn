//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/rhel/Descargas/1.7.10mappings"!

/*
 * Decompiled with CFR 0.0.6 (FabricMC f687381d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  net.minecraft.entity.Entity
 */
package danger.orespawn;

import danger.orespawn.EntityCage;
import danger.orespawn.RenderSpinner;
import net.minecraft.entity.Entity;

public class RenderCage
extends RenderSpinner {
    @Override
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
        this.spinItemIconIndex = 160;
        if (par1Entity instanceof EntityCage) {
            EntityCage var2 = (EntityCage)par1Entity;
            this.spinItemIconIndex = var2.getCageIndex();
        }
        super.doRender(par1Entity, par2, par4, par6, par8, par9);
    }
}
