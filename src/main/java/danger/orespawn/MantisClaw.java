//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/rhel/Descargas/1.7.10mappings"!

//Decompiled by Procyon!

package danger.orespawn;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.relauncher.*;

public class MantisClaw extends ItemSword
{
    private int weaponDamage;
    private final Item.ToolMaterial toolMaterial;
    
    public MantisClaw(final int par1, final Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.weaponDamage = 10;
        this.maxStackSize = 1;
        this.setMaxDamage(1000);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
    
    public String getMaterialName() {
        return "AMETHYST";
    }
    
    public boolean hitEntity(final ItemStack par1ItemStack, final EntityLivingBase par2EntityLiving, final EntityLivingBase par3EntityLiving) {
        final int var2 = 5;
        if (par2EntityLiving != null && par3EntityLiving != null && !par2EntityLiving.worldObj.isRemote) {
            par2EntityLiving.heal(-1.0f);
            par3EntityLiving.heal(1.0f);
        }
        par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 3000;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("OreSpawn:" + this.getUnlocalizedName().substring(5));
    }
}
