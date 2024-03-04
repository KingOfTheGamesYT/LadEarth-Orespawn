//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/rhel/Descargas/1.7.10mappings"!

/*
 * Decompiled with CFR 0.0.6 (FabricMC f687381d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.entity.RenderLiving
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 */
package danger.orespawn;

import danger.orespawn.ModelTheQueen;
import danger.orespawn.QueenHead;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderQueenHead
extends RenderLiving {
    public RenderQueenHead(ModelTheQueen par1ModelBase, float par2, float par3) {
        super((ModelBase)par1ModelBase, par2 * par3);
    }

    public void renderQueenHead(QueenHead par1EntityQueenHead, double par2, double par4, double par6, float par8, float par9) {
    }

    public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    }

    protected void preRenderScale(QueenHead par1Entity, float par2) {
    }

    protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return null;
    }
}
