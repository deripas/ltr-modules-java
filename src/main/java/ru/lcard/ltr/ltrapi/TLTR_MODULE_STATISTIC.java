package ru.lcard.ltr.ltrapi;

import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltrapi.LtrApi.LTR_MODULE_NAME_SIZE;

/**
 * Статистика модуля.
 * <p>
 * Структура содержит информацию о состоянии модуля и параметры статистики
 * работы с данным модулем, которую ведет служба ltrd.
 * Данная статистика может быть получена через управляющее соединение с помощью
 * функции LTR_GetModuleStatistic().
 * Статистика ведется с момента обнаружения модуля и сбрасывается вместе со
 * сбросом модуля через LTR_ResetModule()
 */
public class TLTR_MODULE_STATISTIC extends StructPack4 {
    /**
     * < Размер всех действительных полей
     * структуры, включая само поле size
     */
    public DWORD size = new DWORD();
    /**
     * < Количество клиентов, установивших соединение
     * с модулем
     */
    public WORD client_cnt = new WORD();
    /**
     * < Идентификатор модуля из #en_LTR_MIDs
     */
    public WORD mid = new WORD();
    /**
     * < Набор флагов, описывающих особенности
     * модуля, из #en_LTR_ModuleDescrFlags
     */
    public DWORD flags = new DWORD();
    /**
     * < Строка с названием модуля (возможно с модификациями,
     * если ltrd способен их определить)
     */
    public AsciiString name = new AsciiString(LTR_MODULE_NAME_SIZE);
    /**
     * < Резерв
     */
    public Unsigned32[] res = array(new DWORD[5]);
    /**
     * < Количество слов, переданных модулю
     */
    public Unsigned64 wrd_sent = new Unsigned64();
    /**
     * < Количество слов, принятых от модуля
     */
    public Unsigned64 wrd_recv = new Unsigned64();
    /**
     * < Текущая скорость передачи слов в модуль (слов/с)
     */
    public Double bw_send = new Double();
    /**
     * < Текущая скорость приема слов из модуля (слов/с)
     */
    public Double bw_recv = new Double();
    /**
     * < Количество слов, переданных клиенту
     */
    public Unsigned64 wrd_sent_to_client = new Unsigned64();
    /**
     * < Количество слов, принятых от клиента
     */
    public Unsigned64 wrd_recv_from_client = new Unsigned64();
    /**
     * < Количество отброшенных слов из-за переполнения
     * буфера на прием в службе ltrd
     */
    public Unsigned64 wrd_recv_drop = new Unsigned64();
    /**
     * < Количество переполнений буфера на прием
     * в службе ltrd
     */
    public DWORD rbuf_ovfls = new DWORD();
    /**
     * < Размер буфера в ltrd для модуля на передачу
     */
    public DWORD send_srvbuf_size = new DWORD();
    /**
     * < Размер буфера в ltrd для модуля на прием
     */
    public DWORD recv_srvbuf_size = new DWORD();
    /**
     * < На сколько слов заполнен буфер на передачу
     */
    public DWORD send_srvbuf_full = new DWORD();
    /**
     * < На сколько слов заполнен буфер на прием
     */
    public DWORD recv_srvbuf_full = new DWORD();
    /**
     * < На сколько слов был максимально заполнен буфер на передачу
     */
    public DWORD send_srvbuf_full_max = new DWORD();
    /**
     * < На сколько слов был максимально заполнен буфер на прием
     */
    public DWORD recv_srvbuf_full_max = new DWORD();
    /**
     * < Резерв
     */
    public Unsigned32[] res2 = array(new DWORD[17]);
    /**
     * < Количество принятых меток "СТАРТ" от модуля
     */
    public DWORD start_mark = new DWORD();
    /**
     * < Количество принятых секундных меток от модуля
     */
    /* Поля, описывающие состояние внутренней аппаратной очереди модуля.
     * Действительны, только если есть флаг
     */
    public DWORD sec_mark = new DWORD();
    /**
     * < Размер аппаратной очереди внутри модуля. Данное поле, а также
     * все остальные поля hard_send_... действительны только
     * для модулей вывода с наличием контролируемой ltrd очереди
     * в модуле (для этих модулей также установлен соответствующий
     * флаг в поле flags)
     */
    public DWORD hard_send_fifo_size = new DWORD();
    /**
     * < Заполненность аппаратной очереди (количество отправленных,
     * но не подтвержденных слов)
     */
    public DWORD hard_send_fifo_unack_words = new DWORD();
    /**
     * < Количество "голоданий" очереди (очередь пуста
     * при попытке вывода значения из нее) с момента
     * последнего сброса модуля
     */
    public DWORD hard_send_fifo_underrun = new DWORD();
    /**
     * < Количество переполнений очереди с момента
     * последнего сброса модуля
     */
    public DWORD hard_send_fifo_overrun = new DWORD();
    /**
     * < Внутренне состояние аппаратной очереди
     */
    public DWORD hard_send_fifo_internal = new DWORD();
    /**
     * < Резерв
     */
    public Unsigned32[] res3 = array(new DWORD[25]);
}
