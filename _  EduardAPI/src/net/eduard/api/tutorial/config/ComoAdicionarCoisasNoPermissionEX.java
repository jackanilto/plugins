package net.eduard.api.tutorial.config;

import net.eduard.api.manager.VaultAPI;

public class ComoAdicionarCoisasNoPermissionEX {
	public ComoAdicionarCoisasNoPermissionEX() {
		VaultAPI.getChat().getGroupInfoDouble("null", "Membro", "price", 20);
	}
}