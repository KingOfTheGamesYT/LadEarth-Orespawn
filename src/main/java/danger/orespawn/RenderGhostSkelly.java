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
 *  org.lwjgl.opengl.GL11
 */
package danger.orespawn;

import danger.orespawn.GhostSkelly;
import danger.orespawn.ModelGhostSkelly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderGhostSkelly
extends RenderLiving {
    protected ModelGhostSkelly model = (ModelGhostSkelly)this.mainModel;
    private float scale = 1.0f;
    private static final ResourceLocation texture = new ResourceLocation("orespawn", "GhostSkellytexture.png");

    public RenderGhostSkelly(ModelGhostSkelly par1ModelBase, float par2, float par3) {
        super((ModelBase)par1ModelBase, par2 * par3);
        this.scale = par3;
    }

    public void renderGhostSkelly(GhostSkelly par1GhostSkelly, double par2, double par4, double par6, float par8, float par9) {
        super.doRender((EntityLiving)par1GhostSkelly, par2, par4, par6, par8, par9);
    }

    public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
        this.renderGhostSkelly((GhostSkelly)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
        this.renderGhostSkelly((GhostSkelly)par1Entity, par2, par4, par6, par8, par9);
    }

    protected void preRenderScale(GhostSkelly par1Entity, float par2) {
        GL11.glScalef((float)this.scale, (float)this.scale, (float)this.scale);
    }

    protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
        this.preRenderScale((GhostSkelly)par1EntityLiving, par2);
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return texture;
    }
}
