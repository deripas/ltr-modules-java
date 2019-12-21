package ru.lcard.ltr.ltrapi;

import lombok.AllArgsConstructor;

/**
 * Коды ошибок.
 * <p>
 * Коды ошибок, которые могут возвращать функции библиотеки ltrapi.
 * Также включают общие коды ошибок для модулей.
 **/
@AllArgsConstructor
public enum LTR_ERRORS {
    OK(0),                                 //Выполнено без ошибок.
    ERROR_UNKNOWN(-1),                     //Неизвестная ошибка.
    ERROR_PARAMETRS(-2),                   //Ошибка входных параметров.
    ERROR_MEMORY_ALLOC(-3),                //Ошибка динамического выделения памяти.
    ERROR_OPEN_CHANNEL(-4),                //Ошибка открытия канала обмена с сервером.
    ERROR_OPEN_SOCKET(-5),                 //Ошибка открытия сокета.
    ERROR_CHANNEL_CLOSED(-6),              //Ошибка. Канал обмена с сервером не создан.
    ERROR_SEND(-7),                        //Ошибка отправления данных.
    ERROR_RECV(-8),                        //Ошибка приема данных.
    ERROR_EXECUTE(-9),                     //Ошибка обмена с крейт-контроллером.
    WARNING_MODULE_IN_USE(-10),            // Канал обмена с сервером уже был создан и не закрыт
    ERROR_NOT_CTRL_CHANNEL(-11),           // Номер канала для этой операции должен быть CC_CONTROL
    ERROR_SRV_INVALID_CMD(-12),            // Команда не поддерживается сервером
    ERROR_SRV_INVALID_CMD_PARAMS(-13),     // Сервер не поддерживает указанные параметры команды
    ERROR_INVALID_CRATE(-14),              // Указанный крейт не найден
    ERROR_EMPTY_SLOT(-15),                 // В указанном слоте отсутствует модуль
    ERROR_UNSUP_CMD_FOR_SRV_CTL(-16),      // Команда не поддерживается управляющим каналом сервера
    ERROR_INVALID_IP_ENTRY(-17),           // Неверная запись сетевого адреса крейта
    ERROR_NOT_IMPLEMENTED(-18),            // Данная возможность не реализована
    ERROR_CONNECTION_CLOSED(-19),          // Соединение было закрыто сервером
    ERROR_LTRD_UNKNOWN_RETCODE(-20),       // Неизвестный код ошибки службы ltrd
    ERROR_LTRD_CMD_FAILED(-21),            // Ошибка выполнения управляющей команды ltrd
    ERROR_INVALID_CON_SLOT_NUM(-22),       // Указан неверный номер слота при открытии соединения

    ERROR_INVALID_MODULE_DESCR(-40),        // Неверный описатель модуля
    ERROR_INVALID_MODULE_SLOT(-41),         // Указан неверный слот для модуля
    ERROR_INVALID_MODULE_ID(-42),           // Неверный ID-модуля в ответе на сброс
    ERROR_NO_RESET_RESPONSE(-43),           // Нет ответа на команду сброса
    ERROR_SEND_INSUFFICIENT_DATA(-44),      // Передано данных меньше), чем запрашивалось
    ERROR_RECV_INSUFFICIENT_DATA(-45),      // Принято данных меньше), чем запрашивалось
    ERROR_NO_CMD_RESPONSE(-46),             // Нет ответа на команду
    ERROR_INVALID_CMD_RESPONSE(-47),        // Пришел неверный ответ на команду
    ERROR_INVALID_RESP_PARITY(-48),         // Неверный бит четности в пришедшем ответе
    ERROR_INVALID_CMD_PARITY(-49),          // Ошибка четности переданной команды
    ERROR_UNSUP_BY_FIRM_VER(-50),           // Возможность не поддерживается данной версией прошивки
    ERROR_MODULE_STARTED(-51),              // Модуль уже запущен
    ERROR_MODULE_STOPPED(-52),              // Модуль остановлен
    ERROR_RECV_OVERFLOW(-53),               // Произошло переполнение буфера
    ERROR_FIRM_FILE_OPEN(-54),    // Ошибка открытия файла прошивки
    ERROR_FIRM_FILE_READ(-55),    // Ошибка чтения файла прошивки
    ERROR_FIRM_FILE_FORMAT(-56),    // Ошибка формата файла прошивки
    ERROR_FPGA_LOAD_READY_TOUT(-57),    // Превышен таймаут ожидания готовности ПЛИС к загрузке
    ERROR_FPGA_LOAD_DONE_TOUT(-58),    // Превышен таймаут ожидания перехода ПЛИС в рабочий режим
    ERROR_FPGA_IS_NOT_LOADED(-59),    // Прошивка ПЛИС не загружена
    ERROR_FLASH_INVALID_ADDR(-60),    // Неверный адрес Flash-памяти
    ERROR_FLASH_WAIT_RDY_TOUT(-61),    // Превышен таймаут ожидания завершения записи/стирания Flash-памяти
    ERROR_FIRSTFRAME_NOTFOUND(-62),    // First frame in card data stream not found
    ERROR_CARDSCONFIG_UNSUPPORTED(-63),
    ERROR_FLASH_OP_FAILED(-64),    // Ошибка выполненя операции flash-памятью
    ERROR_FLASH_NOT_PRESENT(-65),    // Flash-память не обнаружена
    ERROR_FLASH_UNSUPPORTED_ID(-66),    // Обнаружен неподдерживаемый тип flash-памяти
    ERROR_FLASH_UNALIGNED_ADDR(-67),    // Невыровненный адрес flash-памяти
    ERROR_FLASH_VERIFY(-68),    // Ошибка при проверки записанных данных во flash-память
    ERROR_FLASH_UNSUP_PAGE_SIZE(-69),    // Установлен неподдерживаемый размер страницы flash-памяти
    ERROR_FLASH_INFO_NOT_PRESENT(-70),    // Отсутствует информация о модуле во Flash-памяти
    ERROR_FLASH_INFO_UNSUP_FORMAT(-71),    // Неподдерживаемый формат информации о модуле во Flash-памяти
    ERROR_FLASH_SET_PROTECTION(-72),    // Не удалось установить защиту Flash-памяти
    ERROR_FPGA_NO_POWER(-73),    // Нет питания микросхемы ПЛИС
    ERROR_FPGA_INVALID_STATE(-74),    // Не действительное состояние загрузки ПЛИС
    ERROR_FPGA_ENABLE(-75),    // Не удалось перевести ПЛИС в разрешенное состояние
    ERROR_FPGA_AUTOLOAD_TOUT(-76),    // Истекло время ожидания автоматической загрузки ПЛИС
    ERROR_PROCDATA_UNALIGNED(-77),    // Обрабатываемые данные не выравнены на границу кадра
    ERROR_PROCDATA_CNTR(-78),    // Ошибка счетчика в обрабатываемых данных
    ERROR_PROCDATA_CHNUM(-79),    // Неверный номер канала в обрабатываемых данных
    ERROR_PROCDATA_WORD_SEQ(-80),    // Неверная последовательность слов в обрабатываемых данных
    ERROR_FLASH_INFO_CRC(-81),    // Неверная контрольная сумма в записанной информации о модуле
    ERROR_PROCDATA_UNEXP_CMD(-82),  // Обнаружена неожиданная команда в потоке данных
    ERROR_UNSUP_BY_BOARD_REV(-83),  // Возможность не поддерживается данной ревизией платы
    ERROR_MODULE_NOT_CONFIGURED(-84),  // Не выполнена конфигурация модуля

    LTR010_ERROR_GET_ARRAY(-100), //Ошибка выполнения команды GET_ARRAY.
    LTR010_ERROR_PUT_ARRAY(-101), //Ошибка выполнения команды PUT_ARRAY.
    LTR010_ERROR_GET_MODULE_NAME(-102), //Ошибка выполнения команды GET_MODULE_NAME.
    LTR010_ERROR_GET_MODULE_DESCR(-103), //Ошибка выполнения команды GET_MODULE_DESCRIPTOR.
    LTR010_ERROR_INIT_FPGA(-104), //Ошибка выполнения команды INIT_FPGA.
    LTR010_ERROR_RESET_FPGA(-105), //Ошибка выполнения команды RESET_FPGA.
    LTR010_ERROR_INIT_DMAC(-106), //Ошибка выполнения команды INIT_DMAC.
    LTR_ERROR_LOAD_FPGA(-107), //Ошибка выполнения команды LOAD_FPGA.
    LTR010_ERROR_OPEN_FILE(-108), //Ошибка открытия файла.
    LTR010_ERROR_GET_INFO_FPGA(-109), //Ошибка выполнения команды GET_INFO_FPGA.

    LTR021_ERROR_GET_ARRAY(-200), //Ошибка выполнения команды GET_ARRAY.
    LTR021_ERROR_PUT_ARRAY(-201), //Ошибка выполнения команды PUT_ARRAY.
    LTR021_ERROR_GET_MODULE_NAME(-202), //Ошибка выполнения команды GET_MODULE_NAME.
    LTR021_ERROR_GET_MODULE_GESCR(-203), //Ошибка выполнения команды GET_MODULE_DESCRIPTOR.
    LTR021_ERROR_CRATE_TYPE(-204), //Неверный тип крейта.
    LTR021_ERROR_TIMEOUT(-205), //Превышение таймаута

    LTRAVR_ERROR_RECV_PRG_DATA_ECHO(-200),     //Ошибка приема эхо ответа данных для программирования.
    LTRAVR_ERROR_SEND_PRG_DATA(-201),     //Ошибка отправки данных команды програмирования avr.
    LTRAVR_ERROR_RECV_PRG_ENABLE_ACK(-202),     //Ошибка приема подтверждения команды входа в режим программирования.
    LTRAVR_ERROR_SEND_PRG_ENB_CMD(-203),     //Ошибка отправки команды входа в режим программирования.
    LTRAVR_ERROR_CHIP_ERASE(-204),     //Ошибка стирания flash команд avr.
    LTRAVR_ERROR_READ_PRG_MEM(-205),     //Ошибка считывания flash команд avr.
    LTRAVR_ERROR_WRITE_PRG_MEM(-206),     //Ошибка программирования flash команд avr.
    LTRAVR_ERROR_READ_FUSE_BITS(-207),     //Ошибка считывания fuse витов avr.
    LTRAVR_ERROR_WRITE_FUSE_BITS(-208),     //Ошибка программирования fuse витов avr.
    LTRAVR_ERROR_READ_SIGN(-209),     //Ошибка считывания сигнатуры avr.

    LTRBOOT_ERROR_GET_ARRAY(-300),            //Ошибка выполнения команды GET_ARRAY.
    LTRBOOT_ERROR_PUT_ARRAY(-301),      //Ошибка выполнения команды PUT_ARRAY.
    LTRBOOT_ERROR_CALL_APPL(-302),      //Ошибка выполнения команды CALL_APPLICATION.
    LTRBOOT_ERROR_GET_DESCRIPTION(-303),      //Ошибка выполнения команды GET_DESCRIPTION.
    LTRBOOT_ERROR_PUT_DESCRIPTION(-304),     //Ошибка выполнения команды PUT_DESCRIPTION.


    LTR030_ERR_UNSUPORTED_CRATE_TYPE(-400), // Данный тип крейта не поддерживается библиотекой
    LTR030_ERR_FIRM_VERIFY(-401), // Ошибка проверки правильности записи прошивки
    LTR030_ERR_FIRM_SIZE(-402),  // Неверный размер прошивки

    // LTR11
    // Коды ошибок), возвращаемые функциями библиотеки
    LTR11_ERR_INVALID_DESCR(-1000), // указатель на описатель модуля равен NULL
    LTR11_ERR_INVALID_ADCMODE(-1001), // недопустимый режим запуска АЦП
    LTR11_ERR_INVALID_ADCLCHQNT(-1002), // недопустимое количество логических каналов
    LTR11_ERR_INVALID_ADCRATE(-1003), // недопустимое значение частоты дискретизации АЦП модуля
    LTR11_ERR_INVALID_ADCSTROBE(-1004), // недопустимый источник тактовой частоты для АЦП
    LTR11_ERR_GETFRAME(-1005), // ошибка получения кадра данных с АЦП
    LTR11_ERR_GETCFG(-1006), // ошибка чтения конфигурации
    LTR11_ERR_CFGDATA(-1007), // ошибка при получении конфигурации модуля
    LTR11_ERR_CFGSIGNATURE(-1008), // неверное значение первого байта конфигурационной записи модуля
    LTR11_ERR_CFGCRC(-1009), // неверная контрольная сумма конфигурационной записи
    LTR11_ERR_INVALID_ARRPOINTER(-1010), // указатель на массив равен NULL
    LTR11_ERR_ADCDATA_CHNUM(-1011), // неверный номер канала в массиве данных от АЦП
    LTR11_ERR_INVALID_CRATESN(-1012), // указатель на строку с серийным номером крейта равен NULL
    LTR11_ERR_INVALID_SLOTNUM(-1013), // недопустимый номер слота в крейте
    LTR11_ERR_NOACK(-1014), // нет подтверждения от модуля
    LTR11_ERR_MODULEID(-1015), // попытка открытия модуля), отличного от LTR11
    LTR11_ERR_INVALIDACK(-1016), // неверное подтверждение от модуля
    LTR11_ERR_ADCDATA_SLOTNUM(-1017), // неверный номер слота в данных от АЦП
    LTR11_ERR_ADCDATA_CNT(-1018), // неверный счетчик пакетов в данных от АЦП
    LTR11_ERR_INVALID_STARTADCMODE(-1019), // неверный режим старта сбора данных

    // LTR212
    LTR212_ERR_INVALID_DESCR(-2001),
    LTR212_ERR_INVALID_CRATE_SN(-2002),
    LTR212_ERR_INVALID_SLOT_NUM(-2003),
    LTR212_ERR_CANT_INIT(-2004),
    LTR212_ERR_CANT_OPEN_CHANNEL(-2005),
    LTR212_ERR_CANT_CLOSE(-2006),
    LTR212_ERR_CANT_LOAD_BIOS(-2007),
    LTR212_ERR_CANT_SEND_COMMAND(-2008),
    LTR212_ERR_CANT_READ_EEPROM(-2009),
    LTR212_ERR_CANT_WRITE_EEPROM(-2010),
    LTR212_ERR_CANT_LOAD_IIR(-2011),
    LTR212_ERR_CANT_LOAD_FIR(-2012),
    LTR212_ERR_CANT_RESET_CODECS(-2013),
    LTR212_ERR_CANT_SELECT_CODEC(-2014),
    LTR212_ERR_CANT_WRITE_REG(-2015),
    LTR212_ERR_CANT_READ_REG(-2016),
    LTR212_ERR_WRONG_ADC_SETTINGS(-2017),
    LTR212_ERR_WRONG_VCH_SETTINGS(-2018),
    LTR212_ERR_CANT_SET_ADC(-2019),
    LTR212_ERR_CANT_CALIBRATE(-2020),
    LTR212_ERR_CANT_START_ADC(-2021),
    LTR212_ERR_INVALID_ACQ_MODE(-2022),
    LTR212_ERR_CANT_GET_DATA(-2023),
    LTR212_ERR_CANT_MANAGE_FILTERS(-2024),
    LTR212_ERR_CANT_STOP(-2025),
    LTR212_ERR_CANT_GET_FRAME(-2026),
    LTR212_ERR_INV_ADC_DATA(-2026),
    LTR212_ERR_TEST_NOT_PASSED(-2027),
    LTR212_ERR_CANT_WRITE_SERIAL_NUM(-2028),
    LTR212_ERR_CANT_RESET_MODULE(-2029),
    LTR212_ERR_MODULE_NO_RESPONCE(-2030),
    LTR212_ERR_WRONG_FLASH_CRC(-2031),
    LTR212_ERR_CANT_USE_FABRIC_AND_USER_CALIBR_SYM(-2032),
    LTR212_ERR_CANT_START_INTERFACE_TEST(-2033),
    LTR212_ERR_WRONG_BIOS_FILE(-2034),
    LTR212_ERR_CANT_USE_CALIBR_MODE(-2035),
    LTR212_ERR_PARITY_ERROR(-2036),
    LTR212_ERR_CANT_LOAD_CLB_COEFFS(-2037),
    LTR212_ERR_CANT_LOAD_FABRIC_CLB_COEFFS(-2038),
    LTR212_ERR_CANT_GET_VER(-2039),
    LTR212_ERR_CANT_GET_DATE(-2040),
    LTR212_ERR_WRONG_SN(-2041),
    LTR212_ERR_CANT_EVAL_DAC(-2042),
    LTR212_ERR_ERROR_OVERFLOW(-2043),
    LTR212_ERR_SOME_CHENNEL_CANT_CLB(-2044),
    LTR212_ERR_CANT_GET_MODULE_TYPE(-2045),
    LTR212_ERR_ERASE_OR_PROGRAM_FLASH(-2046),
    LTR212_ERR_CANT_SET_BRIDGE_CONNECTIONS(-2047),
    LTR212_ERR_CANT_SET_BRIDGE_CONNECTIONS_FOR_THIS_MODULE_TYPE(-2048),
    LTR212_ERR_QB_RESISTORS_IN_ALL_CHANNELS_MUST_BE_EQUAL(-2049),
    LTR212_ERR_INVALID_EEPROM_ADDR(-2050),
    LTR212_ERR_INVALID_VCH_CNT(-2051),
    LTR212_ERR_FILTER_FILE_OPEN(-2052),
    LTR212_ERR_FILTER_FILE_READ(-2053),
    LTR212_ERR_FILTER_FILE_FORMAT(-2054),
    LTR212_ERR_FILTER_ORDER(-2055),
    LTR212_ERR_UNSUPPORTED_MODULE_TYPE(-2056),

    // LTR27
    LTR27_ERROR_SEND_DATA(-3000),
    LTR27_ERROR_RECV_DATA(-3001),
    LTR27_ERROR_RESET_MODULE(-3002),
    LTR27_ERROR_NOT_LTR27(-3003),
    LTR27_ERROR_PARITY(-3004),
    LTR27_ERROR_OVERFLOW(-3005),
    LTR27_ERROR_INDEX(-3006),
    LTR27_ERROR(-3007),
    LTR27_ERROR_EXCHANGE(-3008),
    LTR27_ERROR_FORMAT(-3008),
    LTR27_ERROR_CRC(-3010),

    // LTR43
    LTR43_ERR_WRONG_MODULE_DESCR(-4001),
    LTR43_ERR_CANT_OPEN(-4002),
    LTR43_ERR_INVALID_CRATE_SN(-4003),
    LTR43_ERR_INVALID_SLOT_NUM(-4004),
    LTR43_ERR_CANT_SEND_COMMAND(-4005),
    LTR43_ERR_CANT_RESET_MODULE(-4006),
    LTR43_ERR_MODULE_NO_RESPONCE(-4007),
    LTR43_ERR_CANT_SEND_DATA(-4008),
    LTR43_ERR_CANT_CONFIG(-4009),
    LTR43_ERR_CANT_RS485_CONFIG(-4010),
    LTR43_ERR_CANT_LAUNCH_SEC_MARK(-4011),
    LTR43_ERR_CANT_STOP_SEC_MARK(-4012),
    LTR43_ERR_CANT_LAUNCH_START_MARK(-4013),
    LTR43_ERR_CANT_STOP_RS485RCV(-4014),
    LTR43_ERR_RS485_CANT_SEND_BYTE(-4015),
    LTR43_ERR_RS485_FRAME_ERR_RCV(-4016),
    LTR43_ERR_RS485_PARITY_ERR_RCV(-4017),
    LTR43_ERR_WRONG_IO_GROUPS_CONF(-4018),
    LTR43_ERR_RS485_WRONG_BAUDRATE(-4019),
    LTR43_ERR_RS485_WRONG_FRAME_SIZE(-4020),
    LTR43_ERR_RS485_WRONG_PARITY_CONF(-4021),
    LTR43_ERR_RS485_WRONG_STOPBIT_CONF(-4022),
    LTR43_ERR_DATA_TRANSMISSON_ERROR(-4023),
    LTR43_ERR_RS485_CONFIRM_TIMEOUT(-4024),
    LTR43_ERR_RS485_SEND_TIMEOUT(-4025),
    LTR43_ERR_LESS_WORDS_RECEIVED(-4026),
    LTR43_ERR_PARITY_TO_MODULE(-4027),
    LTR43_ERR_PARITY_FROM_MODULE(-4028),
    LTR43_ERR_WRONG_IO_LINES_CONF(-4029),
    LTR43_ERR_WRONG_SECOND_MARK_CONF(-4030),
    LTR43_ERR_WRONG_START_MARK_CONF(-4031),
    LTR43_ERR_CANT_READ_DATA(-4032),
    LTR43_ERR_RS485_CANT_SEND_PACK(-4033),
    LTR43_ERR_RS485_CANT_CONFIGURE(-4034),
    LTR43_ERR_CANT_WRITE_EEPROM(-4035),
    LTR43_ERR_CANT_READ_EEPROM(-4036),
    LTR43_ERR_WRONG_EEPROM_ADDR(-4037),
    LTR43_ERR_RS485_WRONG_PACK_SIZE(-4038),
    LTR43_ERR_RS485_WRONG_OUT_TIMEOUT(-4039),
    LTR43_ERR_RS485_WRONG_IN_TIMEOUT(-4040),
    LTR43_ERR_CANT_READ_CONF_REC(-4041),
    LTR43_ERR_WRONG_CONF_REC(-4042),
    LTR43_ERR_RS485_CANT_STOP_TST_RCV(-4043),
    LTR43_ERR_CANT_START_STREAM_READ(-4044),
    LTR43_ERR_CANT_STOP_STREAM_READ(-4045),
    LTR43_ERR_WRONG_IO_DATA(-4046),
    LTR43_ERR_WRONG_STREAM_READ_FREQ_SETTINGS(-4047),
    LTR43_ERR_ERROR_OVERFLOW(-4048),

    // LTR51
    LTR51_ERR_WRONG_MODULE_DESCR(-5001),
    LTR51_ERR_CANT_OPEN(-5002),
    LTR51_ERR_CANT_LOAD_ALTERA(-5003),
    LTR51_ERR_INVALID_CRATE_SN(-5004),
    LTR51_ERR_INVALID_SLOT_NUM(-5005),
    LTR51_ERR_CANT_SEND_COMMAND(-5006),
    LTR51_ERR_CANT_RESET_MODULE(-5007),
    LTR51_ERR_MODULE_NO_RESPONCE(-5008),
    LTR51_ERR_CANT_OPEN_MODULE(-5009),
    LTR51_ERR_PARITY_TO_MODULE(-5010),
    LTR51_ERR_PARITY_FROM_MODULE(-5011),
    LTR51_ERR_ALTERA_TEST_FAILED(-5012),
    LTR51_ERR_CANT_START_DATA_AQC(-5013),
    LTR51_ERR_CANT_STOP_DATA_AQC(-5014),
    LTR51_ERR_CANT_SET_FS(-5015),
    LTR51_ERR_CANT_SET_BASE(-5016),
    LTR51_ERR_CANT_SET_EDGE_MODE(-5017),
    LTR51_ERR_CANT_SET_THRESHOLD(-5018),
    LTR51_WRONG_DATA(-5019),
    LTR51_ERR_WRONG_HIGH_THRESOLD_SETTINGS(-5020),
    LTR51_ERR_WRONG_LOW_THRESOLD_SETTINGS(-5021),
    LTR51_ERR_WRONG_FPGA_FILE(-5022),
    LTR51_ERR_CANT_READ_ID_REC(-5023),
    LTR51_ERR_WRONG_ID_REC(-5024),
    LTR51_ERR_WRONG_FS_SETTINGS(-5025),
    LTR51_ERR_WRONG_BASE_SETTINGS(-5026),
    LTR51_ERR_CANT_WRITE_EEPROM(-5027),
    LTR51_ERR_CANT_READ_EEPROM(-5028),
    LTR51_ERR_WRONG_EEPROM_ADDR(-5029),
    LTR51_ERR_WRONG_THRESHOLD_VALUES(-5030),
    LTR51_ERR_ERROR_OVERFLOW(-5031),
    LTR51_ERR_MODULE_WRONG_ACQ_TIME_SETTINGS(-5032),
    LTR51_ERR_NOT_ENOUGH_POINTS(-5033),
    LTR51_ERR_WRONG_SRC_SIZE(-5034),


    // LTR22
    LTR22_ERROR_SEND_DATA(-6000),
    LTR22_ERROR_RECV_DATA(-6001),
    LTR22_ERROR_NOT_LTR22(-6002),
    LTR22_ERROR_OVERFLOW(-6003),
    LTR22_ERROR_CANNOT_DO_WHILE_ADC_RUNNING(-6004),
    LTR22_ERROR_MODULE_INTERFACE(-6005),
    LTR22_ERROR_INVALID_FREQ_DIV(-6006),
    LTR22_ERROR_INVALID_TEST_HARD_INTERFACE(-6007),
    LTR22_ERROR_INVALID_DATA_RANGE_FOR_THIS_CHANNEL(-6008),
    LTR22_ERROR_INVALID_DATA_COUNTER(-6009),
    LTR22_ERROR_PRERARE_TO_WRITE(-6010),
    LTR22_ERROR_WRITE_AVR_MEMORY(-6011),
    LTR22_ERROR_READ_AVR_MEMORY(-6012),
    LTR22_ERROR_PARAMETERS(-6013),
    LTR22_ERROR_CLEAR_BUFFER_TOUT(-6014),
    LTR22_ERROR_SYNC_FHAZE_NOT_STARTED(-6015),
    LTR22_ERROR_INVALID_CH_NUMBER(-6016),
    LTR22_ERROR_AVR_MEMORY_COMPARE(-6017),

    LTR34_ERROR_SEND_DATA(-3001),
    LTR34_ERROR_RECV_DATA(-3002),
    LTR34_ERROR_RESET_MODULE(-3003),
    LTR34_ERROR_NOT_LTR34(-3004),
    LTR34_ERROR_CRATE_BUF_OWF(-3005),
    LTR34_ERROR_PARITY(-3006),
    LTR34_ERROR_OVERFLOW(-3007),
    LTR34_ERROR_INDEX(-3008),
    //
    LTR34_ERROR(-3009),
    LTR34_ERROR_EXCHANGE(-3010),
    LTR34_ERROR_FORMAT(-3011),
    LTR34_ERROR_PARAMETERS(-3012),
    LTR34_ERROR_ANSWER(-3013),
    LTR34_ERROR_WRONG_FLASH_CRC(-3014),
    LTR34_ERROR_CANT_WRITE_FLASH(-3015),
    LTR34_ERROR_CANT_READ_FLASH(-3016),
    LTR34_ERROR_CANT_WRITE_SERIAL_NUM(-3017),
    LTR34_ERROR_CANT_READ_SERIAL_NUM(-3018),
    LTR34_ERROR_CANT_WRITE_FPGA_VER(-3019),
    LTR34_ERROR_CANT_READ_FPGA_VER(-3020),
    LTR34_ERROR_CANT_WRITE_CALIBR_VER(-3021),
    LTR34_ERROR_CANT_READ_CALIBR_VER(-3022),
    LTR34_ERROR_CANT_STOP(-3023),
    LTR34_ERROR_SEND_CMD(-3024),
    LTR34_ERROR_CANT_WRITE_MODULE_NAME(-3025),
    LTR34_ERROR_CANT_WRITE_MAX_CH_QNT(-3026),
    LTR34_ERROR_CHANNEL_NOT_OPENED(-3027),
    LTR34_ERROR_WRONG_LCH_CONF(-3028),

    LTR41_ERR_WRONG_MODULE_DESCR(-7001),
    LTR41_ERR_CANT_OPEN(-7002),
    LTR41_ERR_INVALID_CRATE_SN(-7003),
    LTR41_ERR_INVALID_SLOT_NUM(-7004),
    LTR41_ERR_CANT_SEND_COMMAND(-7005),
    LTR41_ERR_CANT_RESET_MODULE(-7006),
    LTR41_ERR_MODULE_NO_RESPONCE(-7007),
    LTR41_ERR_CANT_CONFIG(-7008),
    LTR41_ERR_CANT_LAUNCH_SEC_MARK(-7009),
    LTR41_ERR_CANT_STOP_SEC_MARK(-7010),
    LTR41_ERR_CANT_LAUNCH_START_MARK(-7011),
    LTR41_ERR_LESS_WORDS_RECEIVED(-7012),
    LTR41_ERR_PARITY_TO_MODULE(-7013),
    LTR41_ERR_PARITY_FROM_MODULE(-7014),
    LTR41_ERR_WRONG_SECOND_MARK_CONF(-7015),
    LTR41_ERR_WRONG_START_MARK_CONF(-7016),
    LTR41_ERR_CANT_READ_DATA(-7017),
    LTR41_ERR_CANT_WRITE_EEPROM(-7018),
    LTR41_ERR_CANT_READ_EEPROM(-7019),
    LTR41_ERR_WRONG_EEPROM_ADDR(-7020),
    LTR41_ERR_CANT_READ_CONF_REC(-7021),
    LTR41_ERR_WRONG_CONF_REC(-7022),
    LTR41_ERR_CANT_START_STREAM_READ(-7023),
    LTR41_ERR_CANT_STOP_STREAM_READ(-7024),
    LTR41_ERR_WRONG_IO_DATA(-7025),
    LTR41_ERR_WRONG_STREAM_READ_FREQ_SETTINGS(-7026),
    LTR41_ERR_ERROR_OVERFLOW(-7027),

    LTR42_ERR_WRONG_MODULE_DESCR(-8001),
    LTR42_ERR_CANT_OPEN(-8002),
    LTR42_ERR_INVALID_CRATE_SN(-8003),
    LTR42_ERR_INVALID_SLOT_NUM(-8004),
    LTR42_ERR_CANT_SEND_COMMAND(-8005),
    LTR42_ERR_CANT_RESET_MODULE(-8006),
    LTR42_ERR_MODULE_NO_RESPONCE(-8007),
    LTR42_ERR_CANT_SEND_DATA(-8008),
    LTR42_ERR_CANT_CONFIG(-8009),
    LTR42_ERR_CANT_LAUNCH_SEC_MARK(-8010),
    LTR42_ERR_CANT_STOP_SEC_MARK(-8011),
    LTR42_ERR_CANT_LAUNCH_START_MARK(-8012),
    LTR42_ERR_DATA_TRANSMISSON_ERROR(-8013),
    LTR42_ERR_LESS_WORDS_RECEIVED(-8014),
    LTR42_ERR_PARITY_TO_MODULE(-8015),
    LTR42_ERR_PARITY_FROM_MODULE(-8016),
    LTR42_ERR_WRONG_SECOND_MARK_CONF(-8017),
    LTR42_ERR_WRONG_START_MARK_CONF(-8018),
    LTR42_ERR_CANT_READ_DATA(-8019),
    LTR42_ERR_CANT_WRITE_EEPROM(-8020),
    LTR42_ERR_CANT_READ_EEPROM(-8021),
    LTR42_ERR_WRONG_EEPROM_ADDR(-8022),
    LTR42_ERR_CANT_READ_CONF_REC(-8023),
    LTR42_ERR_WRONG_CONF_REC(-8024),

    LTR114_ERR_INVALID_DESCR(-10000), // указатель на описатель модуля равен NULL
    LTR114_ERR_INVALID_SYNCMODE(-10001), // недопустимый режим синхронизации модуля АЦП
    LTR114_ERR_INVALID_ADCLCHQNT(-10002), // недопустимое количество логических каналов
    LTR114_ERR_INVALID_ADCRATE(-10003), // недопустимое значение частоты дискретизации АЦП модуля

    LTR114_ERR_GETFRAME(-10004), // ошибка получения кадра данных с АЦП
    LTR114_ERR_GETCFG(-10005), // ошибка чтения конфигурации
    LTR114_ERR_CFGDATA(-10006), // ошибка при получении конфигурации модуля
    LTR114_ERR_CFGSIGNATURE(-10007), // неверное значение первого байта конфигурационной записи модуля

    LTR114_ERR_CFGCRC(-10008), // неверная контрольная сумма конфигурационной записи

    LTR114_ERR_INVALID_ARRPOINTER(-10009), // указатель на массив равен NULL
    LTR114_ERR_ADCDATA_CHNUM(-10010), // неверный номер канала в массиве данных от АЦП
    LTR114_ERR_INVALID_CRATESN(-10011), // указатель на строку с серийным номером крейта равен NULL

    LTR114_ERR_INVALID_SLOTNUM(-10012), // недопустимый номер слота в крейте
    LTR114_ERR_NOACK(-10013), // нет подтверждения от модуля
    LTR114_ERR_MODULEID(-10014), // попытка открытия модуля), отличного от LTR114
    LTR114_ERR_INVALIDACK(-10015), // неверное подтверждение от модуля
    LTR114_ERR_ADCDATA_SLOTNUM(-10016), // неверный номер слота в данных от АЦП
    LTR114_ERR_ADCDATA_CNT(-10017), // неверный счетчик пакетов в данных от АЦП
    LTR114_ERR_INVALID_LCH(-10018), // неверный режим лог. канала
    LTR114_ERR_CORRECTION_MODE(-10019), // неверный режим коррекции данных

    //LTR24
    LTR24_ERR_INVAL_FREQ(-10100),
    LTR24_ERR_INVAL_FORMAT(-10101),
    LTR24_ERR_CFG_UNSUP_CH_CNT(-10102),
    LTR24_ERR_INVAL_RANGE(-10103),
    LTR24_ERR_WRONG_CRC(-10104),
    LTR24_ERR_VERIFY_FAILED(-10105),
    LTR24_ERR_DATA_FORMAT(-10106),
    LTR24_ERR_UNALIGNED_DATA(-10107),
    LTR24_ERR_DISCONT_DATA(-10108),
    LTR24_ERR_CHANNELS_DISBL(-10109),
    LTR24_ERR_UNSUP_VERS(-10110),
    LTR24_ERR_FRAME_NOT_FOUND(-10111),
    LTR24_ERR_UNSUP_FLASH_FMT(-10116),
    LTR24_ERR_INVAL_I_SRC_VALUE(-10117),
    LTR24_ERR_UNSUP_ICP_MODE(-10118),

    //LTR032
    LTR032_ERR_NO_MEM(-10300),
    LTR032_ERR_INVAL_PARAM(-10301),
    LTR032_ERR_NOT_OPEN(-10302),
    LTR032_ERR_OPEN(-10303),
    LTR032_ERR_INVAL_CRATE_TYPE(-10304),
    LTR032_ERR_CMD_REJECTED(-10305),
    LTR032_ERR_INVALID_M1S_OUT_MODE(-10306),
    LTR032_ERR_INVALID_NAMUR_LEVELS(-10307),
    LTR032_ERR_INVALID_THERM_SENS_IND(-10308),

    //LTRT10
    LTRT10_ERR_INVALID_SWITCH_POS(-10400), //< Задан неверный код состояния коммутатора
    LTRT10_ERR_INVALID_DDS_DIV(-10401), //< Задан неверный код коэффициента передачи выходного делителя сигнала DDS
    LTRT10_ERR_INVALID_DDS_GAIN(-10402), //< Задан неверный код усиления для DDS
    LTRT10_ERR_INVALID_FREQ_VAL(-10403), //< Неверно задан код частоты сигнала DDS
    LTRT10_ERR_INVALID_DDS_AMP(-10404), //< Задан неверный код амплитуды сигнала DDS
    LTRT10_ERR_GAIN2_EXCEED_GAIN1(-10405), //< Коэф. усиления второй ступени превышает коэф. первой ступени

    LTR210_ERR_INVALID_SYNC_MODE(-10500), //< Задан неверный код условия сбора кадра
    LTR210_ERR_INVALID_GROUP_MODE(-10501), //< Задан неверный код режима работы модуля в составе группы
    LTR210_ERR_INVALID_ADC_FREQ_DIV(-10502), //< Задано неверное значение делителя частоты АЦП
    LTR210_ERR_INVALID_CH_RANGE(-10503), //< Задан неверный код диапазона канала АЦП
    LTR210_ERR_INVALID_CH_MODE(-10504), //< Задан неверный режим измерения канала
    LTR210_ERR_SYNC_LEVEL_EXCEED_RANGE(-10505), //< Установленный уровень аналоговой синхронизации  выходит за границы установленного диапазона

    LTR210_ERR_NO_ENABLED_CHANNEL(-10506), //< Ни один канал АЦП не был разрешен
    LTR210_ERR_PLL_NOT_LOCKED(-10507), //< Ошибка захвата PLL
    LTR210_ERR_INVALID_RECV_DATA_CNTR(-10508), //< Неверное значение счетчика в принятых данных
    LTR210_ERR_RECV_UNEXPECTED_CMD(-10509), //< Прием неподдерживаемой команды в потоке данных
    LTR210_ERR_FLASH_INFO_SIGN(-10510), //< Неверный признак информации о модуле во Flash-памяти
    LTR210_ERR_FLASH_INFO_SIZE(-10511), //< Неверный размер прочитанной из Flash-памяти информации о модуле
    LTR210_ERR_FLASH_INFO_UNSUP_FORMAT(-10512), //< Неподдерживаемый формат информации о модуле из Flash-памяти
    LTR210_ERR_FLASH_INFO_CRC(-10513), //< Ошибка проверки CRC информации о модуле из Flash-памяти
    LTR210_ERR_FLASH_INFO_VERIFY(-10514), //< Ошибка проверки записи информации о модуле во Flash-память
    LTR210_ERR_CHANGE_PAR_ON_THE_FLY(-10515), //< Часть измененных параметров нельзя изменять на лету
    LTR210_ERR_INVALID_ADC_DCM_CNT(-10516), //< Задан неверный коэффициент прореживания данных АЦП
    LTR210_ERR_MODE_UNSUP_ADC_FREQ(-10517), //< Установленный режим не поддерживает заданную частоту АЦП
    LTR210_ERR_INVALID_FRAME_SIZE(-10518), //< Неверно задан размер кадра
    LTR210_ERR_INVALID_HIST_SIZE(-10519), //< Неверно задан размер предыстории
    LTR210_ERR_INVALID_INTF_TRANSF_RATE(-10520), //< Неверно задано значение скорости выдачи данных в интерфейс
    LTR210_ERR_INVALID_DIG_BIT_MODE(-10521), //< Неверно задан режим работы дополнительного бита
    LTR210_ERR_SYNC_LEVEL_LOW_EXCEED_HIGH(-10522), //< Нижний порог аналоговой синхронизации превышает верхний
    LTR210_ERR_KEEPALIVE_TOUT_EXCEEDED(-10523), //< Не пришло ни одного статуса от модуля за заданный интервал
    LTR210_ERR_WAIT_FRAME_TIMEOUT(-10524), //< Не удалось дождаться прихода кадра за заданное время
    LTR210_ERR_FRAME_STATUS(-10525), //< Слово статуса в принятом кадре указывает на ошибку данных


    LTR25_ERR_FPGA_FIRM_TEMP_RANGE(-10600), //< Загружена прошивка ПЛИС для неверного температурного диапазона
    LTR25_ERR_I2C_ACK_STATUS(-10601), //< Ошибка обмена при обращении к регистрам АЦП по интерфейсу I2C
    LTR25_ERR_I2C_INVALID_RESP(-10602), //< Неверный ответ на команду при обращении к регистрам АЦП по интерфейсу I2C
    LTR25_ERR_INVALID_FREQ_CODE(-10603), //< Неверно задан код частоты АЦП
    LTR25_ERR_INVALID_DATA_FORMAT(-10604), //< Неверно задан формат данных АЦП
    LTR25_ERR_INVALID_I_SRC_VALUE(-10605), //< Неверно задано значение источника тока"
    LTR25_ERR_CFG_UNSUP_CH_CNT(-10606), //< Для заданной частоты и формата не поддерживается заданное количество каналов АЦП
    LTR25_ERR_NO_ENABLED_CH(-10607), //< Не был разрешен ни один канал АЦП
    LTR25_ERR_ADC_PLL_NOT_LOCKED(-10608), //< Ошибка захвата PLL АЦП
    LTR25_ERR_ADC_REG_CHECK(-10609), //< Ошибка проверки значения записанных регистров АЦП
    LTR25_ERR_LOW_POW_MODE_NOT_CHANGED(-10610), //< Не удалось перевести АЦП из/в низкопотребляющее состояние
    LTR25_ERR_LOW_POW_MODE(-10611), //< Модуль находится в низкопотребляющем режиме
    LTR25_ERR_INVALID_SENSOR_POWER_MODE(-10612), //< Неверное значение режима питания датчиков
    LTR25_ERR_CHANGE_SENSOR_POWER_MODE(-10613), //< Не удалось изменить режим питания датчиков
    LTR25_ERR_INVALID_CHANNEL_NUMBER(-10614), //< Указан неверный номер канала модуля
    LTR25_ERR_ICP_MODE_REQUIRED(-10615), //< Модуль не переведен в ICP-режим питания датчиков), необходимый для данной операции
    LTR25_ERR_TEDS_MODE_REQUIRED(-10616), //< Модуль не переведен в TEDS режим питания датчиков), необходимый для данной операции
    LTR25_ERR_TEDS_UNSUP_NODE_FAMILY(-10617), //< Данное семейство устройств TEDS узла не поддерживается библиотекой
    LTR25_ERR_TEDS_UNSUP_NODE_OP(-10618), //< Данная операция не поддерживается библиотекой для обнаруженого типа узла TEDS
    LTR25_ERR_TEDS_NODE_URN_CRC(-10624), //< Неверное значение контрольной суммы в URN узла TEDS
    LTR25_ERR_TEDS_DATA_CRC(-10619), //< Неверное значение контрольной суммы в прочитанных данных TEDS
    LTR25_ERR_TEDS_1W_NO_PRESENSE_PULSE(-10620), //< Не обнаружено сигнала присутствия TEDS узла на однопроводной шине
    LTR25_ERR_TEDS_1W_NOT_IDLE(-10621), //< Однопроводная шина не была в незанятом состоянии на момент начала обмена
    LTR25_ERR_TEDS_1W_UNKNOWN_ERR(-10622), //< Неизвестная ошибка при обмене по однопроводной шине с узлом TEDS
    LTR25_ERR_TEDS_MEM_STATUS(-10623), //< Неверное состояние памяти TEDS узла

    LTR216_ERR_ADC_ID_CHECK(-10700), //< Не удалось обнаружить микросхему АЦП
    LTR216_ERR_ADC_RECV_SYNC_OVERRATE(-10701), //< Частота синхронизации АЦП превысила частоту преобразования
    LTR216_ERR_ADC_RECV_INT_CYCLE_ERROR(-10702), //< Ошибка внутреннего цикла чтения данных с АЦП
    LTR216_ERR_ADC_REGS_INTEGRITY(-10703), //< Нарушена целостность регистров АЦП
    LTR216_ERR_INVALID_ADC_SWMODE(-10704), //< Задано неверное значение режима опроса каналов АЦП
    LTR216_ERR_INVALID_FILTER_TYPE(-10705), //< Задано неверное значение типа фильтра АЦП
    LTR216_ERR_INVALID_ADC_ODR_CODE(-10706), //< Задано неверное значение кода), определяющего скорость преобразования АЦП
    LTR216_ERR_INVALID_SYNC_FDIV(-10707), //< Задано неверное значение делителя частоты синхронизации АЦП
    LTR216_ERR_INVALID_LCH_CNT(-10708), //< Задано неверное количество логических каналов
    LTR216_ERR_INVALID_ISRC_CODE(-10709), //< Задан неверный код), определяющий силу тока питания датчиков
    LTR216_ERR_CH_NOT_FOUND_IN_LTABLE(-10710), //< Указанный канал не был найден в логической таблице
    LTR216_ERR_NO_CH_ENABLED(-10711), //< Ни один канал не был разрешен
    LTR216_ERR_TARE_CHANNELS(-10712), //< Не удалось найти действительное значение при тарировке некоторых каналов
    LTR216_ERR_TOO_MANY_LTABLE_CH(-10713), //< Превышено максимальное число каналов в основном цикле опроса АЦП
    LTR216_ERR_TOO_MANY_LTABLE_BG_CH(-10714), //< Превышено максимальное число каналов в фоновом цикле опроса АЦП
    LTR216_ERR_UNSUF_SW_TIME(-10715), //< Полученное время на коммутацию меньше заданного предела
    LTR216_ERR_BAD_INIT_MEAS_STATUS(-10716), //< Измеренное значение начального параметра недействительно
    LTR216_ERR_INVALID_CH_RANGE(-10717), //< Задан неверный код диапазона канала АЦП
    LTR216_ERR_INVALID_CH_NUM(-10718), //< Задан неверный номер физического канала АЦП
    LTR216_ERR_UREF_MEAS_REQ(-10719),  //< Для выполнения операции требуется измерить действительное значение напряжения \f$U_{ref}\f$

    LPW25_ERROR_FD_NOT_SET(-10800), // Не задана частота дискретизации сигнала
    LPW25_ERROR_SENS_NOT_SET(-10801), // Не задан коэффициент передачи преобразователя
    LPW25_ERROR_PROC_NOT_STARTED(-10802), // Не запущена обработка данных
    LPW25_ERROR_TEDS_MANUFACTURER_ID(-10803), // Неизвестный идентификатор производителя
    LPW25_ERROR_TEDS_MODEL_ID(-10804), // Неизвестная модель преобразователя

    LTEDS_ERROR_INSUF_SIZE(-12000), //< Недостаточно места в данных TEDS для выполнения операции
    LTEDS_ERROR_CHECKSUM(-12001), //< Неверное значение контрольной суммы в данных TEDS
    LTEDS_ERROR_INVALID_BITSIZE(-12002), //< Неверно задан битовый размер данных TEDS
    LTEDS_ERROR_UNSUPPORTED_FORMAT(-12003), //< Не поддерживается указанный формат данных TEDS
    LTEDS_ERROR_ENCODE_VALUE(-12004), //< Неверно указано значение для кодирования в TEDS
    LTEDS_ERROR_UNKNOWN_SEL_CASE(-12005), //< Неизвестный вариант выбора ветвления данных TEDS
    ;

    private int value;

    public int intValue() {
        return value;
    }
}