package com.example.springbootvaadin;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("Main Menu")
public class MainMenu extends HorizontalLayout {
    public MainMenu() {
        MenuVerticalLayout menuVerticalLayout = new MenuVerticalLayout();
        MenuExchange menuExchange = new MenuExchange();

        add(menuVerticalLayout, menuExchange);

    }

}
