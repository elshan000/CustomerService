package org.example.Enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.Strategy.*;

@Getter
@RequiredArgsConstructor

public enum MenuEnum {
    CREATE_CUSTOMER(1, "Create customer", new CreateCustomer());
    // REMOVE_CUSTOMER(2,"Remove Customer",  new RemoveCustomer()),
    // UPDATE_CUSTOMER(3, "Update Customer", new UpdateCustomerStrategy()),
    // SHOW_ALL_CUSTOMER(4, "Show all customer",new ShowAllCustomerStrategy()),
    // CREATE_CARD(5, "Create Card", new CreateCustomerStrategy());
//    UPDATE_CARD(6, "Update Card"),
//    BLOCK_CARD(7, "Block Card"),
//    UNBLOCK_CARD(8, "Unblock Card"),
//    CARD_TO_CARD(9, "Card to card"),
//    SHOW_ALL_CARD(10, "Show all card");

    private final String description;
    private final int value;

    MenuEnum(int value, String description, CreateCustomer strategy) {
        this.description = description;
        this.value = value;
    }

    public static MenuEnum getEnumOption(int value) {
        for (MenuEnum menuEnum : MenuEnum.values()) {
            if (menuEnum.getValue() == value) {
                return menuEnum;
            }
        }
        throw new IllegalArgumentException("Option is wrong");
    }
}

