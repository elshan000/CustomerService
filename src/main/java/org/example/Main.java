package org.example;

import java.util.*;

import org.example.Enums.MenuEnum;
import org.example.Utils.MenuUtil;



public class Main {
    public static void main(String[] args) {

        while (true) {
            MenuUtil.showMenu();
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            MenuEnum menu = MenuEnum.getEnumOption(option);
            MenuEnum.getEnumOption(option);

        }


    }
}