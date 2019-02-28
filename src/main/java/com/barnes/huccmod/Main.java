package com.barnes.huccmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.barnes.huccmod.proxy.CommonProxy;
import com.barnes.huccmod.util.Reference;;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		System.out.println("peeron");
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) 
	{
		System.out.println("ron");
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) 
	{
		System.out.println("post ronlone");
	}
}