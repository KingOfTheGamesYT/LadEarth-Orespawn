//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/rhel/Descargas/1.7.10mappings"!

//Decompiled by Procyon!

package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelRobot4 extends ModelBase
{
    private float wingspeed;
    ModelRenderer leftfootfront;
    ModelRenderer leftfootbase;
    ModelRenderer leftfootback;
    ModelRenderer leftfoottip;
    ModelRenderer leftshin;
    ModelRenderer leftcalf;
    ModelRenderer leftkneegaurd;
    ModelRenderer leftthigh;
    ModelRenderer rightfootfront;
    ModelRenderer rightfoottip;
    ModelRenderer rightfootbase;
    ModelRenderer rightfootback;
    ModelRenderer rightshin;
    ModelRenderer rightcalf;
    ModelRenderer rightkneegaurd;
    ModelRenderer rightthigh;
    ModelRenderer hips;
    ModelRenderer stomach;
    ModelRenderer chest;
    ModelRenderer neck;
    ModelRenderer head;
    ModelRenderer righttopspinebase;
    ModelRenderer lefttopspinebase;
    ModelRenderer righttopspinetip;
    ModelRenderer lefttopspinetip;
    ModelRenderer middlerightspinebase;
    ModelRenderer middleleftspinebase;
    ModelRenderer middleleftspinetip;
    ModelRenderer middlerightspinetip;
    ModelRenderer torso;
    ModelRenderer rightsholder;
    ModelRenderer leftsholder;
    ModelRenderer rightsholdergaurd;
    ModelRenderer sheildbase;
    ModelRenderer sheildtip;
    ModelRenderer rightupperarm;
    ModelRenderer rightlowerarm;
    ModelRenderer sheildend;
    ModelRenderer leftupperarm;
    ModelRenderer sholdergaurdtip;
    ModelRenderer cannonbase;
    ModelRenderer cannonend;
    ModelRenderer leftcannonpiece;
    ModelRenderer topcannonpiece;
    ModelRenderer rightcannonpiece;
    ModelRenderer bottomcannonpiece;
    ModelRenderer glowycannonbit1;
    ModelRenderer glowycannonbit2;
    ModelRenderer glowycannonbit3;
    ModelRenderer glowycannonbit4;
    ModelRenderer glowycannonbit5;
    ModelRenderer cannonammo;
    ModelRenderer lowerrightspinebase;
    ModelRenderer lowerleftspinebase;
    ModelRenderer lowerrightspinetip;
    ModelRenderer lowerleftspinetip;
    
    public ModelRobot4(final float f1) {
        this.wingspeed = 1.0f;
        this.wingspeed = f1;
        this.textureWidth = 512;
        this.textureHeight = 512;
        (this.leftfootfront = new ModelRenderer((ModelBase)this, 20, 50)).addBox(-6.0f, 22.0f, -9.0f, 8, 5, 7);
        this.leftfootfront.setRotationPoint(-8.0f, -3.0f, 6.0f);
        this.leftfootfront.setTextureSize(512, 512);
        this.leftfootfront.mirror = true;
        this.setRotation(this.leftfootfront, 0.0f, 0.0f, 0.0f);
        (this.leftfootbase = new ModelRenderer((ModelBase)this, 20, 100)).addBox(-4.0f, 22.0f, -4.0f, 4, 5, 5);
        this.leftfootbase.setRotationPoint(-8.0f, -3.0f, 6.0f);
        this.leftfootbase.setTextureSize(512, 512);
        this.leftfootbase.mirror = true;
        this.setRotation(this.leftfootbase, 0.0f, 0.0f, 0.0f);
        (this.leftfootback = new ModelRenderer((ModelBase)this, 20, 150)).addBox(-4.5f, 22.0f, 1.0f, 5, 5, 4);
        this.leftfootback.setRotationPoint(-8.0f, -3.0f, 6.0f);
        this.leftfootback.setTextureSize(512, 512);
        this.leftfootback.mirror = true;
        this.setRotation(this.leftfootback, 0.0f, 0.0f, 0.0f);
        (this.leftfoottip = new ModelRenderer((ModelBase)this, 20, 200)).addBox(-4.5f, 23.0f, -12.0f, 5, 4, 3);
        this.leftfoottip.setRotationPoint(-8.0f, -3.0f, 6.0f);
        this.leftfoottip.setTextureSize(512, 512);
        this.leftfoottip.mirror = true;
        this.setRotation(this.leftfoottip, 0.0f, 0.0f, 0.0f);
        (this.leftshin = new ModelRenderer((ModelBase)this, 20, 250)).addBox(-5.0f, 10.0f, -9.0f, 6, 13, 6);
        this.leftshin.setRotationPoint(-8.0f, -3.0f, 6.0f);
        this.leftshin.setTextureSize(512, 512);
        this.leftshin.mirror = true;
        this.setRotation(this.leftshin, 0.1745329f, 0.0f, 0.0f);
        (this.leftcalf = new ModelRenderer((ModelBase)this, 20, 300)).addBox(-6.0f, 10.0f, -9.0f, 8, 8, 9);
        this.leftcalf.setRotationPoint(-8.0f, -3.0f, 6.0f);
        this.leftcalf.setTextureSize(512, 512);
        this.leftcalf.mirror = true;
        this.setRotation(this.leftcalf, 0.1745329f, 0.0f, 0.0f);
        (this.leftkneegaurd = new ModelRenderer((ModelBase)this, 20, 350)).addBox(-5.5f, 4.0f, -14.0f, 7, 7, 1);
        this.leftkneegaurd.setRotationPoint(-8.0f, -3.0f, 6.0f);
        this.leftkneegaurd.setTextureSize(512, 512);
        this.leftkneegaurd.mirror = true;
        this.setRotation(this.leftkneegaurd, 0.6283185f, 0.0f, 0.0f);
        (this.leftthigh = new ModelRenderer((ModelBase)this, 20, 400)).addBox(-5.0f, 0.0f, -4.0f, 6, 13, 8);
        this.leftthigh.setRotationPoint(-8.0f, -3.0f, 6.0f);
        this.leftthigh.setTextureSize(512, 512);
        this.leftthigh.mirror = true;
        this.setRotation(this.leftthigh, -0.1745329f, 0.1745329f, 0.0f);
        (this.rightfootfront = new ModelRenderer((ModelBase)this, 20, 450)).addBox(0.0f, 22.0f, -9.0f, 8, 5, 7);
        this.rightfootfront.setRotationPoint(5.0f, -3.0f, 6.0f);
        this.rightfootfront.setTextureSize(512, 512);
        this.rightfootfront.mirror = true;
        this.setRotation(this.rightfootfront, 0.0f, 0.0f, 0.0f);
        (this.rightfoottip = new ModelRenderer((ModelBase)this, 100, 50)).addBox(1.5f, 23.0f, -12.0f, 5, 4, 3);
        this.rightfoottip.setRotationPoint(5.0f, -3.0f, 6.0f);
        this.rightfoottip.setTextureSize(512, 512);
        this.rightfoottip.mirror = true;
        this.setRotation(this.rightfoottip, 0.0f, 0.0f, 0.0f);
        (this.rightfootbase = new ModelRenderer((ModelBase)this, 100, 150)).addBox(2.0f, 22.0f, -4.0f, 4, 5, 5);
        this.rightfootbase.setRotationPoint(5.0f, -3.0f, 6.0f);
        this.rightfootbase.setTextureSize(512, 512);
        this.rightfootbase.mirror = true;
        this.setRotation(this.rightfootbase, 0.0f, 0.0f, 0.0f);
        (this.rightfootback = new ModelRenderer((ModelBase)this, 100, 100)).addBox(1.5f, 22.0f, 1.0f, 5, 5, 4);
        this.rightfootback.setRotationPoint(5.0f, -3.0f, 6.0f);
        this.rightfootback.setTextureSize(512, 512);
        this.rightfootback.mirror = true;
        this.setRotation(this.rightfootback, 0.0f, 0.0f, 0.0f);
        (this.rightshin = new ModelRenderer((ModelBase)this, 100, 200)).addBox(1.0f, 10.0f, -9.0f, 6, 13, 6);
        this.rightshin.setRotationPoint(5.0f, -3.0f, 6.0f);
        this.rightshin.setTextureSize(512, 512);
        this.rightshin.mirror = true;
        this.setRotation(this.rightshin, 0.1745329f, 0.0f, 0.0f);
        (this.rightcalf = new ModelRenderer((ModelBase)this, 100, 250)).addBox(0.0f, 10.0f, -10.0f, 8, 8, 9);
        this.rightcalf.setRotationPoint(5.0f, -3.0f, 6.0f);
        this.rightcalf.setTextureSize(512, 512);
        this.rightcalf.mirror = true;
        this.setRotation(this.rightcalf, 0.1745329f, 0.0f, 0.0f);
        (this.rightkneegaurd = new ModelRenderer((ModelBase)this, 100, 300)).addBox(0.5f, 4.0f, -15.0f, 7, 7, 1);
        this.rightkneegaurd.setRotationPoint(5.0f, -3.0f, 6.0f);
        this.rightkneegaurd.setTextureSize(512, 512);
        this.rightkneegaurd.mirror = true;
        this.setRotation(this.rightkneegaurd, 0.6283185f, 0.0f, 0.0f);
        (this.rightthigh = new ModelRenderer((ModelBase)this, 100, 400)).addBox(0.0f, 0.0f, -5.0f, 6, 13, 8);
        this.rightthigh.setRotationPoint(5.0f, -3.0f, 6.0f);
        this.rightthigh.setTextureSize(512, 512);
        this.rightthigh.mirror = true;
        this.setRotation(this.rightthigh, -0.1745329f, -0.1745329f, 0.0f);
        this.rightthigh.mirror = false;
        (this.hips = new ModelRenderer((ModelBase)this, 100, 350)).addBox(0.0f, 0.0f, 0.0f, 14, 7, 8);
        this.hips.setRotationPoint(-8.0f, -3.0f, 2.0f);
        this.hips.setTextureSize(512, 512);
        this.hips.mirror = true;
        this.setRotation(this.hips, 0.1396263f, 0.0f, 0.0f);
        (this.stomach = new ModelRenderer((ModelBase)this, 100, 450)).addBox(0.0f, 0.0f, 0.0f, 12, 6, 7);
        this.stomach.setRotationPoint(-7.0f, -9.0f, 2.0f);
        this.stomach.setTextureSize(512, 512);
        this.stomach.mirror = true;
        this.setRotation(this.stomach, 0.1396263f, 0.0f, 0.0f);
        (this.chest = new ModelRenderer((ModelBase)this, 200, 50)).addBox(0.0f, 0.0f, 0.0f, 18, 12, 13);
        this.chest.setRotationPoint(-10.0f, -23.0f, -4.0f);
        this.chest.setTextureSize(512, 512);
        this.chest.mirror = true;
        this.setRotation(this.chest, 0.2443461f, 0.0f, 0.0f);
        (this.neck = new ModelRenderer((ModelBase)this, 200, 100)).addBox(0.0f, 0.0f, 0.0f, 6, 7, 6);
        this.neck.setRotationPoint(-4.0f, -22.0f, -7.0f);
        this.neck.setTextureSize(512, 512);
        this.neck.mirror = true;
        this.setRotation(this.neck, 0.8726646f, 0.0f, 0.0f);
        (this.head = new ModelRenderer((ModelBase)this, 200, 150)).addBox(-3.0f, -3.0f, -5.0f, 6, 6, 8);
        this.head.setRotationPoint(-1.0f, -26.0f, -5.0f);
        this.head.setTextureSize(512, 512);
        this.head.mirror = true;
        this.setRotation(this.head, 0.5235988f, 0.0f, 0.0f);
        (this.righttopspinebase = new ModelRenderer((ModelBase)this, 200, 200)).addBox(0.0f, 0.0f, 0.0f, 2, 8, 2);
        this.righttopspinebase.setRotationPoint(3.0f, -29.0f, 5.0f);
        this.righttopspinebase.setTextureSize(512, 512);
        this.righttopspinebase.mirror = true;
        this.setRotation(this.righttopspinebase, -0.1396263f, 0.0f, 0.0f);
        (this.lefttopspinebase = new ModelRenderer((ModelBase)this, 200, 250)).addBox(0.0f, 0.0f, 0.0f, 2, 8, 2);
        this.lefttopspinebase.setRotationPoint(-7.0f, -29.0f, 5.0f);
        this.lefttopspinebase.setTextureSize(512, 512);
        this.lefttopspinebase.mirror = true;
        this.setRotation(this.lefttopspinebase, -0.1396263f, 0.0f, 0.0f);
        (this.righttopspinetip = new ModelRenderer((ModelBase)this, 200, 300)).addBox(0.0f, 0.0f, 0.0f, 1, 8, 1);
        this.righttopspinetip.setRotationPoint(3.5f, -35.0f, 8.0f);
        this.righttopspinetip.setTextureSize(512, 512);
        this.righttopspinetip.mirror = true;
        this.setRotation(this.righttopspinetip, -0.3316126f, 0.0f, 0.0f);
        (this.lefttopspinetip = new ModelRenderer((ModelBase)this, 200, 350)).addBox(0.0f, 0.0f, 0.0f, 1, 8, 1);
        this.lefttopspinetip.setRotationPoint(-6.5f, -35.0f, 8.0f);
        this.lefttopspinetip.setTextureSize(512, 512);
        this.lefttopspinetip.mirror = true;
        this.setRotation(this.lefttopspinetip, -0.3316126f, 0.0f, 0.0f);
        (this.middlerightspinebase = new ModelRenderer((ModelBase)this, 200, 400)).addBox(0.0f, 0.0f, 0.0f, 2, 8, 2);
        this.middlerightspinebase.setRotationPoint(-6.0f, -25.0f, 14.0f);
        this.middlerightspinebase.setTextureSize(512, 512);
        this.middlerightspinebase.mirror = true;
        this.setRotation(this.middlerightspinebase, -0.6981317f, 0.0f, 0.0f);
        (this.middleleftspinebase = new ModelRenderer((ModelBase)this, 200, 450)).addBox(0.0f, 0.0f, 0.0f, 2, 8, 2);
        this.middleleftspinebase.setRotationPoint(2.0f, -25.0f, 14.0f);
        this.middleleftspinebase.setTextureSize(512, 512);
        this.middleleftspinebase.mirror = true;
        this.setRotation(this.middleleftspinebase, -0.6981317f, 0.0f, 0.0f);
        (this.middleleftspinetip = new ModelRenderer((ModelBase)this, 300, 50)).addBox(0.0f, 0.0f, 0.0f, 1, 7, 1);
        this.middleleftspinetip.setRotationPoint(2.5f, -28.0f, 18.0f);
        this.middleleftspinetip.setTextureSize(512, 512);
        this.middleleftspinetip.mirror = true;
        this.setRotation(this.middleleftspinetip, -0.7853982f, 0.0f, 0.0f);
        (this.middlerightspinetip = new ModelRenderer((ModelBase)this, 300, 100)).addBox(0.0f, 0.0f, 0.0f, 1, 7, 1);
        this.middlerightspinetip.setRotationPoint(-5.5f, -28.0f, 18.0f);
        this.middlerightspinetip.setTextureSize(512, 512);
        this.middlerightspinetip.mirror = true;
        this.setRotation(this.middlerightspinetip, -0.7853982f, 0.0f, 0.0f);
        (this.torso = new ModelRenderer((ModelBase)this, 300, 150)).addBox(0.0f, 0.0f, 0.0f, 14, 6, 10);
        this.torso.setRotationPoint(-8.0f, -13.0f, 0.0f);
        this.torso.setTextureSize(512, 512);
        this.torso.mirror = true;
        this.setRotation(this.torso, 0.1396263f, 0.0f, 0.0f);
        (this.rightsholder = new ModelRenderer((ModelBase)this, 300, 200)).addBox(0.0f, -3.0f, -3.0f, 6, 6, 6);
        this.rightsholder.setRotationPoint(7.0f, -18.0f, 4.0f);
        this.rightsholder.setTextureSize(512, 512);
        this.rightsholder.mirror = true;
        this.setRotation(this.rightsholder, 0.0f, 0.0f, 0.0f);
        (this.leftsholder = new ModelRenderer((ModelBase)this, 300, 250)).addBox(-6.0f, -3.0f, -3.0f, 6, 6, 6);
        this.leftsholder.setRotationPoint(-9.0f, -18.0f, 4.0f);
        this.leftsholder.setTextureSize(512, 512);
        this.leftsholder.mirror = true;
        this.setRotation(this.leftsholder, 0.0f, 0.0f, 0.0f);
        (this.rightsholdergaurd = new ModelRenderer((ModelBase)this, 300, 300)).addBox(8.0f, -4.0f, -4.0f, 4, 12, 9);
        this.rightsholdergaurd.setRotationPoint(7.0f, -18.0f, 4.0f);
        this.rightsholdergaurd.setTextureSize(512, 512);
        this.rightsholdergaurd.mirror = true;
        this.setRotation(this.rightsholdergaurd, -0.2094395f, 0.0f, 0.0f);
        (this.sheildbase = new ModelRenderer((ModelBase)this, 300, 350)).addBox(8.0f, -4.0f, -30.0f, 3, 12, 19);
        this.sheildbase.setRotationPoint(7.0f, -18.0f, 4.0f);
        this.sheildbase.setTextureSize(512, 512);
        this.sheildbase.mirror = true;
        this.setRotation(this.sheildbase, 1.047198f, 0.0f, 0.0f);
        (this.sheildtip = new ModelRenderer((ModelBase)this, 300, 400)).addBox(9.0f, -2.0f, -34.0f, 3, 8, 4);
        this.sheildtip.setRotationPoint(6.0f, -18.0f, 4.0f);
        this.sheildtip.setTextureSize(512, 512);
        this.sheildtip.mirror = true;
        this.setRotation(this.sheildtip, 1.047198f, 0.0f, 0.0f);
        (this.rightupperarm = new ModelRenderer((ModelBase)this, 300, 450)).addBox(3.0f, -1.0f, -4.0f, 6, 13, 6);
        this.rightupperarm.setRotationPoint(7.0f, -18.0f, 4.0f);
        this.rightupperarm.setTextureSize(512, 512);
        this.rightupperarm.mirror = true;
        this.setRotation(this.rightupperarm, -0.2094395f, 0.0f, 0.0f);
        (this.rightlowerarm = new ModelRenderer((ModelBase)this, 350, 50)).addBox(3.0f, 0.0f, -25.0f, 6, 6, 14);
        this.rightlowerarm.setRotationPoint(7.0f, -18.0f, 4.0f);
        this.rightlowerarm.setTextureSize(512, 512);
        this.rightlowerarm.mirror = true;
        this.setRotation(this.rightlowerarm, 1.047198f, 0.0f, 0.0f);
        (this.sheildend = new ModelRenderer((ModelBase)this, 350, 100)).addBox(8.0f, -1.0f, -11.0f, 3, 8, 4);
        this.sheildend.setRotationPoint(7.0f, -18.0f, 4.0f);
        this.sheildend.setTextureSize(512, 512);
        this.sheildend.mirror = true;
        this.setRotation(this.sheildend, 1.047198f, 0.0f, 0.0f);
        (this.leftupperarm = new ModelRenderer((ModelBase)this, 350, 200)).addBox(-9.0f, -1.0f, -4.0f, 6, 15, 6);
        this.leftupperarm.setRotationPoint(-9.0f, -18.0f, 4.0f);
        this.leftupperarm.setTextureSize(512, 512);
        this.leftupperarm.mirror = true;
        this.setRotation(this.leftupperarm, -0.2094395f, 0.0f, 0.0f);
        (this.sholdergaurdtip = new ModelRenderer((ModelBase)this, 350, 250)).addBox(10.0f, -3.0f, -7.0f, 2, 5, 3);
        this.sholdergaurdtip.setRotationPoint(7.0f, -18.0f, 4.0f);
        this.sholdergaurdtip.setTextureSize(512, 512);
        this.sholdergaurdtip.mirror = true;
        this.setRotation(this.sholdergaurdtip, -0.2094395f, 0.0f, 0.0f);
        (this.cannonbase = new ModelRenderer((ModelBase)this, 350, 300)).addBox(-4.0f, 0.0f, -4.0f, 8, 12, 8);
        this.cannonbase.setRotationPoint(-15.0f, -5.0f, 1.0f);
        this.cannonbase.setTextureSize(512, 512);
        this.cannonbase.mirror = true;
        this.setRotation(this.cannonbase, -0.6981317f, 0.0f, 0.0f);
        (this.cannonend = new ModelRenderer((ModelBase)this, 350, 400)).addBox(-3.0f, 11.0f, -3.0f, 6, 4, 6);
        this.cannonend.setRotationPoint(-15.0f, -5.0f, 1.0f);
        this.cannonend.setTextureSize(512, 512);
        this.cannonend.mirror = true;
        this.setRotation(this.cannonend, -0.6981317f, 0.0f, 0.0f);
        (this.leftcannonpiece = new ModelRenderer((ModelBase)this, 20, 20)).addBox(-5.0f, 11.0f, -1.5f, 3, 6, 3);
        this.leftcannonpiece.setRotationPoint(-15.0f, -5.0f, 1.0f);
        this.leftcannonpiece.setTextureSize(512, 512);
        this.leftcannonpiece.mirror = true;
        this.setRotation(this.leftcannonpiece, -0.6981317f, 0.0f, 0.0f);
        (this.topcannonpiece = new ModelRenderer((ModelBase)this, 40, 20)).addBox(-1.5f, 11.0f, -5.0f, 3, 6, 3);
        this.topcannonpiece.setRotationPoint(-15.0f, -5.0f, 1.0f);
        this.topcannonpiece.setTextureSize(512, 512);
        this.topcannonpiece.mirror = true;
        this.setRotation(this.topcannonpiece, -0.6981317f, 0.0f, 0.0f);
        (this.rightcannonpiece = new ModelRenderer((ModelBase)this, 80, 20)).addBox(2.0f, 11.0f, -1.5f, 3, 6, 3);
        this.rightcannonpiece.setRotationPoint(-15.0f, -5.0f, 1.0f);
        this.rightcannonpiece.setTextureSize(512, 512);
        this.rightcannonpiece.mirror = true;
        this.setRotation(this.rightcannonpiece, -0.6981317f, 0.0f, 0.0f);
        (this.bottomcannonpiece = new ModelRenderer((ModelBase)this, 100, 20)).addBox(-1.5f, 11.0f, 2.0f, 3, 6, 3);
        this.bottomcannonpiece.setRotationPoint(-15.0f, -5.0f, 1.0f);
        this.bottomcannonpiece.setTextureSize(512, 512);
        this.bottomcannonpiece.mirror = true;
        this.setRotation(this.bottomcannonpiece, -0.6981317f, 0.0f, 0.0f);
        (this.glowycannonbit1 = new ModelRenderer((ModelBase)this, 150, 20)).addBox(-3.5f, 0.0f, -11.0f, 2, 5, 2);
        this.glowycannonbit1.setRotationPoint(-15.0f, -5.0f, 1.0f);
        this.glowycannonbit1.setTextureSize(512, 512);
        this.glowycannonbit1.mirror = true;
        this.setRotation(this.glowycannonbit1, 0.1745329f, 0.0f, 0.0f);
        (this.glowycannonbit2 = new ModelRenderer((ModelBase)this, 200, 20)).addBox(1.5f, 0.0f, -11.0f, 2, 5, 2);
        this.glowycannonbit2.setRotationPoint(-15.0f, -5.0f, 1.0f);
        this.glowycannonbit2.setTextureSize(512, 512);
        this.glowycannonbit2.mirror = true;
        this.setRotation(this.glowycannonbit2, 0.1745329f, 0.0f, 0.0f);
        (this.glowycannonbit3 = new ModelRenderer((ModelBase)this, 250, 20)).addBox(-3.0f, -2.0f, -8.0f, 2, 5, 2);
        this.glowycannonbit3.setRotationPoint(-15.0f, -5.0f, 1.0f);
        this.glowycannonbit3.setTextureSize(512, 512);
        this.glowycannonbit3.mirror = true;
        this.setRotation(this.glowycannonbit3, 0.0872665f, 0.0f, 0.0f);
        (this.glowycannonbit4 = new ModelRenderer((ModelBase)this, 300, 20)).addBox(1.0f, -2.0f, -8.0f, 2, 5, 2);
        this.glowycannonbit4.setRotationPoint(-15.0f, -5.0f, 1.0f);
        this.glowycannonbit4.setTextureSize(512, 512);
        this.glowycannonbit4.mirror = true;
        this.setRotation(this.glowycannonbit4, 0.0872665f, 0.0f, 0.0f);
        (this.glowycannonbit5 = new ModelRenderer((ModelBase)this, 350, 20)).addBox(-1.0f, -5.0f, -5.0f, 2, 5, 2);
        this.glowycannonbit5.setRotationPoint(-15.0f, -5.0f, 1.0f);
        this.glowycannonbit5.setTextureSize(512, 512);
        this.glowycannonbit5.mirror = true;
        this.setRotation(this.glowycannonbit5, 0.0f, 0.0f, 0.0f);
        (this.cannonammo = new ModelRenderer((ModelBase)this, 400, 400)).addBox(-6.0f, 3.0f, 0.0f, 5, 5, 5);
        this.cannonammo.setRotationPoint(-15.0f, -5.0f, 1.0f);
        this.cannonammo.setTextureSize(512, 512);
        this.cannonammo.mirror = true;
        this.setRotation(this.cannonammo, -0.6981317f, 0.0f, 0.0f);
        (this.lowerrightspinebase = new ModelRenderer((ModelBase)this, 400, 450)).addBox(0.0f, 0.0f, 0.0f, 2, 8, 2);
        this.lowerrightspinebase.setRotationPoint(4.0f, -19.0f, 15.0f);
        this.lowerrightspinebase.setTextureSize(512, 512);
        this.lowerrightspinebase.mirror = true;
        this.setRotation(this.lowerrightspinebase, -1.047198f, 0.0f, 0.0f);
        (this.lowerleftspinebase = new ModelRenderer((ModelBase)this, 360, 450)).addBox(0.0f, 0.0f, 0.0f, 2, 8, 2);
        this.lowerleftspinebase.setRotationPoint(-8.0f, -19.0f, 15.0f);
        this.lowerleftspinebase.setTextureSize(512, 512);
        this.lowerleftspinebase.mirror = true;
        this.setRotation(this.lowerleftspinebase, -1.047198f, 0.0f, 0.0f);
        (this.lowerrightspinetip = new ModelRenderer((ModelBase)this, 250, 100)).addBox(0.0f, 0.0f, 0.0f, 1, 7, 1);
        this.lowerrightspinetip.setRotationPoint(4.5f, -21.0f, 20.0f);
        this.lowerrightspinetip.setTextureSize(512, 512);
        this.lowerrightspinetip.mirror = true;
        this.setRotation(this.lowerrightspinetip, -1.134464f, 0.0f, 0.0f);
        (this.lowerleftspinetip = new ModelRenderer((ModelBase)this, 150, 100)).addBox(0.0f, 0.0f, 0.0f, 1, 7, 1);
        this.lowerleftspinetip.setRotationPoint(-7.5f, -21.0f, 20.0f);
        this.lowerleftspinetip.setTextureSize(512, 512);
        this.lowerleftspinetip.mirror = true;
        this.setRotation(this.lowerleftspinetip, -1.134464f, 0.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final Robot4 e = (Robot4)entity;
        float newangle = 0.0f;
        final float nextangle = 0.0f;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (f1 > 0.1) {
            newangle = MathHelper.cos(f2 * 0.5f * this.wingspeed) * 3.1415927f * 0.15f * f1;
        }
        else {
            newangle = 0.0f;
        }
        this.leftfootfront.rotateAngleX = newangle;
        this.leftfootbase.rotateAngleX = newangle;
        this.leftfootback.rotateAngleX = newangle;
        this.leftfoottip.rotateAngleX = newangle;
        this.leftshin.rotateAngleX = newangle;
        this.leftcalf.rotateAngleX = newangle + 0.175f;
        this.leftkneegaurd.rotateAngleX = newangle + 0.63f;
        this.leftthigh.rotateAngleX = newangle - 0.175f;
        this.rightfootfront.rotateAngleX = -newangle;
        this.rightfoottip.rotateAngleX = -newangle;
        this.rightfootbase.rotateAngleX = -newangle;
        this.rightfootback.rotateAngleX = -newangle;
        this.rightshin.rotateAngleX = -newangle;
        this.rightcalf.rotateAngleX = -newangle + 0.175f;
        this.rightkneegaurd.rotateAngleX = -newangle + 0.63f;
        this.rightthigh.rotateAngleX = -newangle - 0.175f;
        this.head.rotateAngleY = (float)Math.toRadians(f3 / 1.5);
        final float amp = 0.7853982f;
        if (e.getAttacking() != 0) {
            newangle = MathHelper.cos((float)Math.toRadians(f2 % 360.0f) * this.wingspeed * 6.0f) * amp;
            newangle = Math.abs(newangle);
            newangle += 0.75f;
        }
        else {
            newangle = 0.0f;
        }
        if (newangle > amp / 3.0) {
            e.setShielding(1);
        }
        else {
            e.setShielding(0);
        }
        this.rightsholder.rotateAngleX = -newangle;
        this.rightsholdergaurd.rotateAngleX = -newangle - 0.21f;
        this.sheildbase.rotateAngleX = -newangle + 1.047f;
        this.sheildtip.rotateAngleX = -newangle + 1.047f;
        this.rightupperarm.rotateAngleX = -newangle - 0.21f;
        this.rightlowerarm.rotateAngleX = -newangle + 1.047f;
        this.sheildend.rotateAngleX = -newangle + 1.04f;
        this.sholdergaurdtip.rotateAngleX = -newangle - 0.21f;
        if (e.getAttacking() != 0) {
            newangle = 0.85f;
        }
        else {
            newangle = 0.0f;
        }
        this.leftsholder.rotateAngleX = -newangle;
        this.leftupperarm.rotateAngleX = -newangle - 0.21f;
        this.cannonbase.rotateAngleX = -newangle - 0.7f;
        this.cannonend.rotateAngleX = -newangle - 0.7f;
        this.leftcannonpiece.rotateAngleX = -newangle - 0.7f;
        this.topcannonpiece.rotateAngleX = -newangle - 0.7f;
        this.rightcannonpiece.rotateAngleX = -newangle - 0.7f;
        this.bottomcannonpiece.rotateAngleX = -newangle - 0.7f;
        this.glowycannonbit1.rotateAngleX = -newangle + 0.17f;
        this.glowycannonbit2.rotateAngleX = -newangle + 0.17f;
        this.glowycannonbit3.rotateAngleX = -newangle + 0.08f;
        this.glowycannonbit4.rotateAngleX = -newangle + 0.08f;
        this.glowycannonbit5.rotateAngleX = -newangle;
        this.cannonammo.rotateAngleX = -newangle - 0.7f;
        final double newposy = (float)(this.leftsholder.rotationPointY + Math.cos(this.leftupperarm.rotateAngleX) * 14.0);
        final double newposz = (float)(this.leftsholder.rotationPointZ + Math.sin(this.leftupperarm.rotateAngleX) * 14.0);
        this.cannonbase.rotationPointY = (float)newposy;
        this.cannonbase.rotationPointZ = (float)newposz;
        this.cannonend.rotationPointY = (float)newposy;
        this.cannonend.rotationPointZ = (float)newposz;
        this.leftcannonpiece.rotationPointY = (float)newposy;
        this.leftcannonpiece.rotationPointZ = (float)newposz;
        this.topcannonpiece.rotationPointY = (float)newposy;
        this.topcannonpiece.rotationPointZ = (float)newposz;
        this.rightcannonpiece.rotationPointY = (float)newposy;
        this.rightcannonpiece.rotationPointZ = (float)newposz;
        this.bottomcannonpiece.rotationPointY = (float)newposy;
        this.bottomcannonpiece.rotationPointZ = (float)newposz;
        this.glowycannonbit1.rotationPointY = (float)newposy;
        this.glowycannonbit1.rotationPointZ = (float)newposz;
        this.glowycannonbit2.rotationPointY = (float)newposy;
        this.glowycannonbit2.rotationPointZ = (float)newposz;
        this.glowycannonbit3.rotationPointY = (float)newposy;
        this.glowycannonbit3.rotationPointZ = (float)newposz;
        this.glowycannonbit4.rotationPointY = (float)newposy;
        this.glowycannonbit4.rotationPointZ = (float)newposz;
        this.glowycannonbit5.rotationPointY = (float)newposy;
        this.glowycannonbit5.rotationPointZ = (float)newposz;
        this.cannonammo.rotationPointY = (float)newposy;
        this.cannonammo.rotationPointZ = (float)newposz;
        this.leftfootfront.render(f5);
        this.leftfootbase.render(f5);
        this.leftfootback.render(f5);
        this.leftfoottip.render(f5);
        this.leftshin.render(f5);
        this.leftcalf.render(f5);
        this.leftkneegaurd.render(f5);
        this.leftthigh.render(f5);
        this.rightfootfront.render(f5);
        this.rightfoottip.render(f5);
        this.rightfootbase.render(f5);
        this.rightfootback.render(f5);
        this.rightshin.render(f5);
        this.rightcalf.render(f5);
        this.rightkneegaurd.render(f5);
        this.rightthigh.render(f5);
        this.hips.render(f5);
        this.stomach.render(f5);
        this.chest.render(f5);
        this.neck.render(f5);
        this.head.render(f5);
        this.righttopspinebase.render(f5);
        this.lefttopspinebase.render(f5);
        this.righttopspinetip.render(f5);
        this.lefttopspinetip.render(f5);
        this.middlerightspinebase.render(f5);
        this.middleleftspinebase.render(f5);
        this.middleleftspinetip.render(f5);
        this.middlerightspinetip.render(f5);
        this.torso.render(f5);
        this.rightsholder.render(f5);
        this.leftsholder.render(f5);
        this.rightsholdergaurd.render(f5);
        this.sheildbase.render(f5);
        this.sheildtip.render(f5);
        this.rightupperarm.render(f5);
        this.rightlowerarm.render(f5);
        this.sheildend.render(f5);
        this.leftupperarm.render(f5);
        this.sholdergaurdtip.render(f5);
        this.cannonbase.render(f5);
        this.cannonend.render(f5);
        this.leftcannonpiece.render(f5);
        this.topcannonpiece.render(f5);
        this.rightcannonpiece.render(f5);
        this.bottomcannonpiece.render(f5);
        this.glowycannonbit1.render(f5);
        this.glowycannonbit2.render(f5);
        this.glowycannonbit3.render(f5);
        this.glowycannonbit4.render(f5);
        this.glowycannonbit5.render(f5);
        this.cannonammo.render(f5);
        this.lowerrightspinebase.render(f5);
        this.lowerleftspinebase.render(f5);
        this.lowerrightspinetip.render(f5);
        this.lowerleftspinetip.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
