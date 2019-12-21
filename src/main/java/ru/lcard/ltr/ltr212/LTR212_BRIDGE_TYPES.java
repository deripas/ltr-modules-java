package ru.lcard.ltr.ltr212;

import lombok.AllArgsConstructor;

/**
 * типы возможных мостов
 */
@AllArgsConstructor
public enum LTR212_BRIDGE_TYPES {
    LTR212_FULL_OR_HALF_BRIDGE,
    LTR212_QUARTER_BRIDGE_WITH_200_Ohm,
    LTR212_QUARTER_BRIDGE_WITH_350_Ohm,
    LTR212_QUARTER_BRIDGE_WITH_CUSTOM_Ohm,
    LTR212_UNBALANCED_QUARTER_BRIDGE_WITH_200_Ohm,
    LTR212_UNBALANCED_QUARTER_BRIDGE_WITH_350_Ohm,
    LTR212_UNBALANCED_QUARTER_BRIDGE_WITH_CUSTOM_Ohm,
    ;
}
