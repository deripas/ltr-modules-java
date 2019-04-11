package ru.lcard.ltr.ltrapi;

import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltrapi.LtrApi.*;

/**
 * Информация о крейте и его прошивке.
 * <p>
 * Структура содержит информацию о крейте, включая все версии, связанные с крейтом.
 * Большинство полей представлены в виде окончивающейся нулевым символом строки.
 * <p>
 * Данная информация может быть получена Данная статистика может быть получена
 * через управляющее соединение с помощью LTR_GetCrateDescr().
 */
public class TLTR_CRATE_DESCR extends StructPack4 {
    public DWORD size = new DWORD();                 //< Размер всех действительных полей структуры, включая само поле size  
    public AsciiString devname = new AsciiString(LTR_CRATE_DEVNAME_SIZE);                  //< Название крейта
    public AsciiString serial = new AsciiString(LTR_CRATE_SERIAL_SIZE);                    //< Серийный номер
    public AsciiString soft_ver = new AsciiString(LTR_CRATE_SOFTVER_SIZE);                 //< Версия прошивки
    public AsciiString brd_revision = new AsciiString(LTR_CRATE_REVISION_SIZE);            //< Ревизия платы
    public AsciiString brd_opts = new AsciiString(LTR_CRATE_BOARD_OPTIONS_SIZE);           //< Опции платы
    public AsciiString bootloader_ver = new AsciiString(LTR_CRATE_BOOTVER_SIZE);           //< Версия загрузчика
    public AsciiString cpu_type = new AsciiString(LTR_CRATE_CPUTYPE_SIZE);                 //< Тип микроконтроллера
    public AsciiString fpga_name = new AsciiString(LTR_CRATE_FPGA_NAME_SIZE);              //< Название ПЛИС в крейте
    public AsciiString fpga_version = new AsciiString(LTR_CRATE_FPGA_VERSION_SIZE);        //< Версия прошивки ПЛИС
    public AsciiString crate_type_name = new AsciiString(LTR_CRATE_TYPE_NAME);             //< Строка с типом крейта
    public AsciiString spec_info = new AsciiString(LTR_CRATE_SPECINFO_SIZE);  //< Резерв  
    public BYTE protocol_ver_major = new BYTE();           //< Версия протокола между ltrd и крейтом (мажорная)  
    public BYTE protocol_ver_minor = new BYTE();           //< Версия протокола между ltrd и крейтом (минорная)  
    public BYTE slots_config_ver_major = new BYTE();       //< Версия протокола для сохранения настроек модуля (мажорная)  
    public BYTE slots_config_ver_minor = new BYTE();       //< Версия протокола для сохранения настроек модуля (минорная)  
}
