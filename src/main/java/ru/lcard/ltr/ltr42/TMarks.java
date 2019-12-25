package ru.lcard.ltr.ltr42;

import ru.lcard.ltr.StructPack4;

/**
 * Структура для работы с временными метками
 */
public class TMarks extends StructPack4 {
    public DWORD SecondMark_Mode = new DWORD(); // Режим меток. 0 - внутр., 1-внутр.+выход, 2-внешн
    public DWORD StartMark_Mode = new DWORD();
}
