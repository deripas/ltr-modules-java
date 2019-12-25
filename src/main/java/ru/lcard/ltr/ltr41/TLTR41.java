package ru.lcard.ltr.ltr41;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;
import ru.lcard.ltr.ltrapi.TLTR;

@ToString
public class TLTR41 extends StructPack4 {
    public DWORD Size = new DWORD();   // размер структуры
    public TLTR Channel = inner(new TLTR());
    public Double StreamReadRate = new Double();
    public TMarks Marks = inner(new TMarks());  // Структура для работы с временными метками
    public TINFO_LTR41 ModuleInfo = inner(new TINFO_LTR41());
}
