package mods.fossil.items.forge;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ForgeItem extends Item
{
	String TextureFileName;
	public ForgeItem(int par1, String TextureFileName0)
	{
		super(par1);
		this.TextureFileName=TextureFileName0;
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("fossil:"+TextureFileName);
    }
}
