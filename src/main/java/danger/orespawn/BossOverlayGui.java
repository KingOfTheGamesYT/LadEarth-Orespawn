 package danger.orespawn;

 import cpw.mods.fml.common.eventhandler.SubscribeEvent;
 import net.minecraft.block.material.Material;
 import net.minecraft.client.Minecraft;
 import net.minecraft.client.entity.EntityClientPlayerMP;
 import net.minecraft.client.gui.FontRenderer;
 import net.minecraft.client.gui.Gui;
 import net.minecraft.client.gui.ScaledResolution;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.EntityLivingBase;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.util.ResourceLocation;
 import net.minecraft.world.World;
 import net.minecraftforge.client.event.RenderGameOverlayEvent;

 import org.lwjgl.opengl.GL11;

 public class BossOverlayGui
   extends Gui
 {
   private Minecraft mc;
   private static final ResourceLocation texture = new ResourceLocation("orespawn", "girlfriendgui.png");

   public BossOverlayGui(Minecraft mc) {
     this.mc = mc;
   }

   @SubscribeEvent
   public void onRenderOverlay(RenderGameOverlayEvent event) {
     if (event.isCancelable() || event.type != RenderGameOverlayEvent.ElementType.HOTBAR) {
       return;
     }

     int u = 0;
     int v = 0;
     String outstring = null;
     int color = 16725044;
     FontRenderer fr = this.mc.fontRenderer;
     int barWidth = 182;
     int barHeight = 5;
     float gfHealth = 0.0F;
     float bfHealth = 0.0F;
     float princeHealth = 0.0F;
     float princeteenHealth = 0.0F;
     float pprinceadultHealth = 0.0F;
     float princessHealth = 0.0F;
       Entity entity = null;
     EntityPlayer player = null;

     if (this.mc.gameSettings.hideGUI || this.mc.currentScreen != null) {
       return;
     }

     EntityClientPlayerMP entityClientPlayerMP = this.mc.thePlayer;

     if (entityClientPlayerMP == null) {
       return;
     }

     OreSpawnMain.current_dimension = ((EntityPlayer)entityClientPlayerMP).worldObj.provider.dimensionId;
     if (this.mc.gameSettings.fancyGraphics) {
       OreSpawnMain.FastGraphicsLeaves = 0;
     } else {
       OreSpawnMain.FastGraphicsLeaves = 1;
     }

     if (OreSpawnMain.GuiOverlayEnable == 0) {
       return;
     }

     entity = this.mc.pointedEntity;

    if (entity == null) {
       entity = OreSpawnMain.getPointedAtEntity((World)this.mc.theWorld, (EntityPlayer)entityClientPlayerMP, 16.0D);
       if (entity == null)
         return;
       if (!(entity instanceof EntityLivingBase))
         return;
     }
     if (entity instanceof Girlfriend) {
       Girlfriend gf = (Girlfriend)entity;

       if (!gf.isOnSameTeam((EntityLivingBase)entityClientPlayerMP)) {
         return;
       }

       if (gf.passenger != 0)
         return;
       if (gf.hasCustomNameTag()) outstring = gf.getCustomNameTag();
       if (outstring == null || outstring.equals("")) {
         outstring = "Girlfriend";
       }

       gfHealth = gf.getGirlfriendHealth() / gf.getMaxHealth();
     }

     if (entity instanceof Boyfriend) {
       Boyfriend bf = (Boyfriend)entity;

       if (!bf.isOnSameTeam((EntityLivingBase)entityClientPlayerMP)) {
        return;
      }

       if (bf.passenger != 0)
         return;
       if (bf.hasCustomNameTag()) outstring = bf.getCustomNameTag();
       if (outstring == null || outstring.equals("")) {
         outstring = "Boyfriend";
       }

       bfHealth = bf.getBoyfriendHealth() / bf.getMaxHealth();
     }

     if (entity instanceof ThePrince) {
       ThePrince prince = null;
       prince = (ThePrince)entity;

       if (!prince.isOnSameTeam((EntityLivingBase)entityClientPlayerMP)) {
         return;
       }

       if (prince.hasCustomNameTag()) outstring = prince.getCustomNameTag();
      if (outstring == null || outstring.equals("")) {
        outstring = "The Toddler Prince";
       }

       princeHealth = prince.getHealth() / prince.getMaxHealth();
     }

     if (entity instanceof ThePrincess) {
       ThePrincess princess = null;
       princess = (ThePrincess)entity;

       if (!princess.isOnSameTeam((EntityLivingBase)entityClientPlayerMP)) {
         return;
       }

       if (princess.hasCustomNameTag()) outstring = princess.getCustomNameTag();
       if (outstring == null || outstring.equals("")) {
         outstring = "The Toddler Princess";
       }

       princessHealth = princess.getHealth() / princess.getMaxHealth();
     }

     if (entity instanceof ThePrinceTeen) {
       ThePrinceTeen princeteen = null;
       princeteen = (ThePrinceTeen)entity;

       if (!princeteen.isOnSameTeam((EntityLivingBase)entityClientPlayerMP)) {
         return;
       }

       if (princeteen.hasCustomNameTag()) outstring = princeteen.getCustomNameTag();
       if (outstring == null || outstring.equals("")) {
         outstring = "The Young Prince";
       }
       if (princeteen.getActivity() != 0)
         return;
       princeteenHealth = princeteen.getHealth() / princeteen.getMaxHealth();
     }

     if (entity instanceof ThePrinceAdult) {
       ThePrinceAdult princeAdult = null;
       princeAdult = (ThePrinceAdult)entity;

       if (!princeAdult.isOnSameTeam((EntityLivingBase)entityClientPlayerMP)) {
         return;
       }

       if (princeAdult.hasCustomNameTag()) outstring = princeAdult.getCustomNameTag();
       if (outstring == null || outstring.equals("")) {
         outstring = "The Young Adult Prince";
       }
       if (princeAdult.getActivity() != 0)
         return;
       gfHealth = princeAdult.getHealth() / princeAdult.getMaxHealth();
     }
/*     */     
/* 228 */     if (entity instanceof Dragon) {
/* 229 */       Dragon df = null;
/* 230 */       df = (Dragon)entity;
/*     */       
/* 232 */       if (df.hasCustomNameTag()) outstring = df.getCustomNameTag(); 
/* 233 */       if (outstring == null || outstring.equals("")) {
/* 234 */         outstring = "Dragon";
/*     */       }
/* 236 */       if (df.getActivity() != 0)
/*     */         return; 
/* 238 */       gfHealth = df.getDragonHealth() / df.getMaxHealth();
/*     */     } 
/*     */     
/* 241 */     if (entity instanceof EmperorScorpion) {
/* 242 */       EmperorScorpion e = (EmperorScorpion)entity;
/* 243 */       outstring = "Emperor Scorpion";
/* 244 */       gfHealth = e.getEmperorScorpionHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 247 */     if (entity instanceof Basilisk) {
/* 248 */       Basilisk e = (Basilisk)entity;
/* 249 */       outstring = "Basilisk";
/* 250 */       gfHealth = e.getBasiliskHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 253 */     if (entity instanceof Mothra) {
/* 254 */       Mothra e = (Mothra)entity;
/* 255 */       outstring = "Mothra!";
/* 256 */       gfHealth = e.getMothraHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 259 */     if (entity instanceof Spyro) {
/* 260 */       Spyro e = (Spyro)entity;
/* 261 */       if (e.hasCustomNameTag()) outstring = e.getCustomNameTag(); 
/* 262 */       if (outstring == null || outstring.equals("")) {
/* 263 */         outstring = "Baby Dragon";
/*     */       }
/*     */       
/* 266 */       gfHealth = e.getSpyroHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 269 */     if (entity instanceof WormLarge) {
/* 270 */       WormLarge e = (WormLarge)entity;
/* 271 */       if (!e.noClip) {
/* 272 */         outstring = "Worm";
/* 273 */         gfHealth = e.getHealth() / e.getMaxHealth();
/*     */       } 
/*     */     } 
/*     */     
/* 277 */     if (entity instanceof Alien) {
/* 278 */       Alien e = (Alien)entity;
/* 279 */       outstring = "Alien!";
/* 280 */       gfHealth = e.getAlienHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 283 */     if (entity instanceof WaterDragon) {
/* 284 */       WaterDragon e = (WaterDragon)entity;
/* 285 */       if (e.hasCustomNameTag()) outstring = e.getCustomNameTag(); 
/* 286 */       if (outstring == null || outstring.equals("")) {
/* 287 */         outstring = "WaterDragon";
/*     */       }
/* 289 */       gfHealth = e.getWaterDragonHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 292 */     if (entity instanceof Kraken) {
/* 293 */       Kraken e = (Kraken)entity;
/* 294 */       outstring = "Kraken";
/* 295 */       gfHealth = e.getKrakenHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 298 */     if (entity instanceof Cephadrome) {
/* 299 */       Cephadrome e = (Cephadrome)entity;
/* 300 */       outstring = "Cephadrome";
/* 301 */       gfHealth = e.getCephadromeHealth() / e.getMaxHealth();
/* 302 */       if (e.getActivity() != 0)
/*     */         return; 
/*     */     } 
/* 305 */     if (entity instanceof TrooperBug) {
/* 306 */       TrooperBug e = (TrooperBug)entity;
/* 307 */       outstring = "Jumpy Bug";
/* 308 */       gfHealth = e.getTrooperBugHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 311 */     if (entity instanceof SpitBug) {
/* 312 */       SpitBug e = (SpitBug)entity;
/* 313 */       outstring = "Spit Bug";
/* 314 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 317 */     if (entity instanceof PitchBlack) {
/* 318 */       PitchBlack e = (PitchBlack)entity;
/* 319 */       outstring = "Nightmare";
/* 320 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 323 */     if (entity instanceof Alosaurus) {
/* 324 */       Alosaurus e = (Alosaurus)entity;
/* 325 */       outstring = "Alosaurus";
/* 326 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 329 */     if (entity instanceof Nastysaurus) {
/* 330 */       Nastysaurus e = (Nastysaurus)entity;
/* 331 */       outstring = "Nastysaurus";
/* 332 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 335 */     if (entity instanceof TRex) {
/* 336 */       TRex e = (TRex)entity;
/* 337 */       outstring = "T. Rex";
/* 338 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 341 */     if (entity instanceof Kyuubi) {
/* 342 */       Kyuubi e = (Kyuubi)entity;
/* 343 */       outstring = "Kyuubi";
/* 344 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 347 */     if (entity instanceof Robot2) {
/* 348 */       Robot2 e = (Robot2)entity;
/* 349 */       outstring = "Robo-Pounder";
/* 350 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 353 */     if (entity instanceof Robot4) {
/* 354 */       Robot4 e = (Robot4)entity;
/* 355 */       outstring = "Robo-Warrior";
/* 356 */       gfHealth = e.getRobot4Health() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 359 */     if (entity instanceof Triffid) {
/* 360 */       Triffid e = (Triffid)entity;
/* 361 */       outstring = "Triffid";
/* 362 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 365 */     if (entity instanceof Godzilla) {
/* 366 */       Godzilla e = (Godzilla)entity;
/* 367 */       outstring = "Mobzilla";
/* 368 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 371 */     if (entity instanceof Vortex) {
/* 372 */       Vortex e = (Vortex)entity;
/* 373 */       outstring = "Vortex";
/* 374 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 377 */     if (entity instanceof Irukandji) {
/* 378 */       Irukandji e = (Irukandji)entity;
/* 379 */       outstring = "Irukandji";
/* 380 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 383 */     if (entity instanceof Mantis) {
/* 384 */       Mantis e = (Mantis)entity;
/* 385 */       outstring = "Mantis";
/* 386 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 389 */     if (entity instanceof HerculesBeetle) {
/* 390 */       HerculesBeetle e = (HerculesBeetle)entity;
/* 391 */       outstring = "Hercules Beetle";
/* 392 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 395 */     if (entity instanceof TheKing) {
/* 396 */       TheKing e = (TheKing)entity;
/* 397 */       outstring = "The King";
/* 398 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 401 */     if (entity instanceof TheQueen) {
/* 402 */       TheQueen e = (TheQueen)entity;
/* 403 */       outstring = "The Queen";
/* 404 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 407 */     if (entity instanceof SeaViper) {
/* 408 */       SeaViper e = (SeaViper)entity;
/* 409 */       outstring = "Sea Viper";
/* 410 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 413 */     if (entity instanceof SeaMonster) {
/* 414 */       SeaMonster e = (SeaMonster)entity;
/* 415 */       outstring = "Sea Monster";
/* 416 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 419 */     if (entity instanceof Molenoid) {
/* 420 */       Molenoid e = (Molenoid)entity;
/* 421 */       outstring = "Molenoid";
/* 422 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 425 */     if (entity instanceof CaterKiller) {
/* 426 */       CaterKiller e = (CaterKiller)entity;
/* 427 */       outstring = "CaterKiller";
/* 428 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 431 */     if (entity instanceof Leon) {
/* 432 */       Leon e = (Leon)entity;
/* 433 */       if (e.hasCustomNameTag()) outstring = e.getCustomNameTag(); 
/* 434 */       if (outstring == null || outstring.equals("")) {
/* 435 */         outstring = "Leonopteryx";
/*     */       }
/* 437 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 440 */     if (entity instanceof Hammerhead) {
/* 441 */       Hammerhead e = (Hammerhead)entity;
/* 442 */       outstring = "Hammerhead";
/* 443 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 446 */     if (entity instanceof BandP) {
/* 447 */       BandP e = (BandP)entity;
/* 448 */       if (e.getWhat() == 0) {
/* 449 */         outstring = "Banker";
/*     */       } else {
/* 451 */         outstring = "Politician";
/*     */       } 
/* 453 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 456 */     if (entity instanceof SpiderRobot) {
/* 457 */       SpiderRobot e = (SpiderRobot)entity;
/* 458 */       outstring = "Giant Robot Spider";
/* 459 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 462 */     if (entity instanceof GiantRobot) {
/* 463 */       GiantRobot e = (GiantRobot)entity;
/* 464 */       outstring = "Jeffery";
/* 465 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 468 */     if (entity instanceof AntRobot) {
/* 469 */       AntRobot e = (AntRobot)entity;
/* 470 */       outstring = "Giant Robot Red Ant";
/* 471 */       gfHealth = e.getHealth() / e.getMaxHealth();
/*     */     } 
/*     */     
/* 474 */     if (entity instanceof Crab) {
/* 475 */       Crab e = (Crab)entity;
/* 476 */       float myf = e.getCrabScale();
/* 477 */       if (myf > 0.75F) {
/* 478 */         outstring = "Very Large Crab";
/* 479 */         gfHealth = e.getHealth() / e.getMaxHealth();
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 485 */     if (outstring == null) {
/*     */       return;
/*     */     }
/*     */     
/* 489 */     ScaledResolution res = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
/* 490 */     int width = res.getScaledWidth();
/* 491 */     int barWidthFilled = (int)(gfHealth * (barWidth + 1));
/*     */     
/* 493 */     int x = width / 2 - barWidth / 2;
/*     */     
/* 495 */     int y = 25;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 500 */     if (entityClientPlayerMP.isInsideOfMaterial(Material.water) || entityClientPlayerMP.getTotalArmorValue() > 0) {
/* 501 */       y -= 10;
/*     */     }
/*     */ 
/*     */     
/* 505 */     fr.drawStringWithShadow(outstring, width / 2 - fr.getStringWidth(outstring) / 2, y - 10, color);

      this.mc.renderEngine.bindTexture(texture);

     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

/* 513 */     drawTexturedModalRect(x, y, u, v, barWidth, barHeight);
/*     */     
/* 515 */     if (barWidthFilled > 0)
/* 516 */       drawTexturedModalRect(x, y, u, v + barHeight, barWidthFilled, barHeight); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin\Downloads\orespawn-1.7.10-20.3-deobf.jar!\danger\orespawn\BossOverlayGui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */