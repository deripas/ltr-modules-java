package ru.lcard.ltr.ltr42;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;
import ru.lcard.ltr.ltrapi.TLTR;

@ToString
public class TLTR42 extends StructPack4 {
    public TLTR Channel = inner(new TLTR());
    public DWORD Size = new DWORD();   // размер структуры
    public Boolean AckEna = new Boolean();
    public TMarks Marks = inner(new TMarks());  // Структура для работы с временными метками
    public TINFO_LTR42 ModuleInfo = inner(new TINFO_LTR42());
}
