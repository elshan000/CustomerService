package org.example.Utils;

import org.example.Enums.MenuEnum;

public class MenuUtil {
    public static void showMenu() {
        for(MenuEnum menuEnum : MenuEnum.values()){
            System.out.println(menuEnum.getValue() + "." + menuEnum.getDescription());
        }

    }
}
