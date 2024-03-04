//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/rhel/Descargas/1.7.10mappings"!

//Decompiled by Procyon!

package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class ItemRayGun extends Item
{
    public ItemRayGun(final int i) {
        this.maxStackSize = 1;
        this.setMaxDamage(50);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        if (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() <= 1) {
            return par1ItemStack;
        }
        par2World.playSoundAtEntity((Entity)par3EntityPlayer, "fireworks.launch", 3.5f, 0.5f);
        if (!par2World.isRemote) {
            final double xzoff = 1.0;
            final double yoff = 1.55;
            final LaserBall lb = new LaserBall(par2World, (EntityLivingBase)par3EntityPlayer);
            lb.setSpecial();
            lb.setLocationAndAngles(par3EntityPlayer.posX - xzoff * Math.sin(Math.toRadians(par3EntityPlayer.rotationYawHead + 45.0f)), par3EntityPlayer.posY + yoff, par3EntityPlayer.posZ + xzoff * Math.cos(Math.toRadians(par3EntityPlayer.rotationYawHead + 45.0f)), par3EntityPlayer.rotationYawHead, par3EntityPlayer.rotationPitch);
            final LaserBall laserBall = lb;
            laserBall.motionX *= 3.0;
            final LaserBall laserBall2 = lb;
            laserBall2.motionY *= 3.0;
            final LaserBall laserBall3 = lb;
            laserBall3.motionZ *= 3.0;
            par2World.spawnEntityInWorld((Entity)lb);
        }
        par3EntityPlayer.swingItem();
        par3EntityPlayer.addVelocity(Math.cos(Math.toRadians(par3EntityPlayer.rotationYawHead - 90.0f)) * 1.5, 0.3, Math.sin(Math.toRadians(par3EntityPlayer.rotationYawHead - 90.0f)) * 1.5);
        par1ItemStack.damageItem(1, (EntityLivingBase)par3EntityPlayer);
        return par1ItemStack;
    }
    
    public String getMaterialName() {
        return "Unknown";
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
