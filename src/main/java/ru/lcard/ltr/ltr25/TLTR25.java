package ru.lcard.ltr.ltr25;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;
import ru.lcard.ltr.ltrapi.TLTR;

/**
 * Управляющая структура модуля.
 * <p>
 * Хранит текущие настройки модуля, информацию о
 * его состоянии, структуру канала связи. Передается в большинство функций
 * библиотеки. Некоторые поля структуры доступны для изменения пользователем
 * для настройки параметров модуля. Перед использованием требует инициализации
 * с помощью функции LTR25_Init().
 */
@ToString(exclude = "Internal")
public class TLTR25 extends StructPack4 {
    /**
     * < Размер структуры. Заполняется при вызове LTR25_Init().
     */
    public DWORD Size = new DWORD();

    /**
     * Структура, содержащая состояние клиентского соединения со службой ltrd.
     * Не используется напрямую пользователем.
     */
    public TLTR Channel = inner(new TLTR());

    /**
     * Указатель на непрозрачную структуру с внутренними параметрами,
     * используемыми исключительно библиотекой и недоступными для пользователя.
     */
    public Pointer Internal = new Pointer();

    /**
     * Настройки модуля. Заполняются пользователем перед вызовом LTR25_SetADC().
     */
    public TLTR25_CONFIG Cfg = inner(new TLTR25_CONFIG());

    /**
     * Состояние модуля и рассчитанные параметры. Поля изменяются функциями
     * библиотеки. Пользовательской программой могут использоваться
     * только для чтения.
     */
    public TLTR25_STATE State = inner(new TLTR25_STATE());

    /**
     * Информация о модуле
     */
    public TLTR25_MODULE_INFO ModuleInfo = inner(new TLTR25_MODULE_INFO());
}
