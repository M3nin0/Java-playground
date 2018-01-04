package controller;

import view.MenuView;

public class Principal {
	public static void main(String[] args) {
		MenuController menuController = new MenuController();
		MenuView menuView = new MenuView(menuController);
		menuView.frame.setVisible(true);
	}
}
