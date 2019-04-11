package ru.lcard.ltr.ltrapi;

import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltrapi.LtrApi.LTR_CRATE_THERM_MAX_CNT;
import static ru.lcard.ltr.ltrapi.LtrApi.LTR_MODULES_PER_CRATE_MAX;

/**
 * Статистика крейта.
 * <p>
 * Структура содержит информацию о состоянии крейта и параметры статистики
 * работы с крейтом, которую ведет служба ltrd.
 * Данная статистика может быть получена через управляющее соединение с помощью
 * функции LTR_GetCrateStatistic().
 * Статистика ведется с момента установления связи между ltrd и крейтом.
 */
public class TLTR_CRATE_STATISTIC extends StructPack4 {
    /**
     * < Размер всех действительных полей
     * структуры, включая само поле size
     */
    public DWORD size = new DWORD();
    /**
     * < Флаги --- резерв
     */
    public DWORD flags = new DWORD();
    /**
     * < Тип крейта из #en_LTR_CrateTypes
     */
    public WORD crate_type = new WORD();
    /**
     * < Интерфейс, по которому подключен
     * крейт из #en_LTR_CrateIface
     */
    public WORD crate_intf = new WORD();
    /**
     * < Резерв
     */
    public WORD crate_state = new WORD();
    /**
     * < Режим работы крейта из #en_LTR_CrateMode
     */
    public WORD crate_mode = new WORD();
    /**
     * < Время установления соединения службы
     * с крейтом (формат unixtime)
     */
    public Unsigned64 con_time = new Unsigned64();
    /**
     * < Резерв
     */
    public Unsigned16[] res = array(new WORD[11]);
    /**
     * < Количество слотов в данном типе крейта
     */
    public WORD modules_cnt = new WORD();
    /**
     * < ID-модулей для всех слотов крейта
     */
    public Unsigned16[] mids = array(new WORD[LTR_MODULES_PER_CRATE_MAX]);
    /**
     * < Резерв
     */
    public Unsigned16[] res2 = array(new WORD[3 * LTR_MODULES_PER_CRATE_MAX]);
    /**
     * < Количество клиентов, подключенных по
     * управляющему каналу к крейту
     */
    public WORD ctl_clients_cnt = new WORD();
    /**
     * < Количество клиентов, подключенных ко
     * всем модулям крейта
     */
    public WORD total_mod_clients_cnt = new WORD();
    /**
     * < Резерв
     */
    public Unsigned32[] res3 = array(new DWORD[11]);
    /**
     * < Общее количество слов, переданных в
     * крейт (крейту и всем его модулям)
     */
    public Unsigned64 wrd_sent = new Unsigned64();
    /**
     * < Общее количество слов, принятое от
     * крейта (от самого крейта и всех его модулей)
     */
    public Unsigned64 wrd_recv = new Unsigned64();
    /**
     * < Текущая скорость передачи слов в крейт (слов/с)
     */
    public Double bw_send = new Double();
    /**
     * < Текущая скорость приема слов из крейта (слов/c)
     */
    public Double bw_recv = new Double();
    /**
     * < Количество принятых слов
     * непосредственно от крейта
     */
    public Unsigned64 crate_wrd_recv = new Unsigned64();
    /**
     * < Количество потерянных буферов в крейте
     * из-за внутреннего переполнения
     */
    public Unsigned64 internal_rbuf_miss = new Unsigned64();
    /**
     * < Количество переполнений внутреннго
     * буфера крейта
     */
    public DWORD internal_rbuf_ovfls = new DWORD();
    /**
     * < Количество переполнений буфера  прима данных от модулей в службе
     * ltrd для модулей крейта (суммарное
     * по всем модулям)
     */
    public DWORD rbuf_ovfls = new DWORD();
    /**
     * < Количество принятых меток "Старт" как от крейта, так и от модулей
     */
    public DWORD total_start_marks = new DWORD();
    /**
     * < Количество принятых секундных меток как от крейта, так и от модулей
     */
    public DWORD total_sec_marks = new DWORD();
    /**
     * < Количество принятых меток "Старт" непосредственно от крейта
     */
    public DWORD crate_start_marks = new DWORD();
    /**
     * < Количество принятых секундных меток непосредственно от крейта
     */
    public DWORD crate_sec_marks = new DWORD();
    /**
     * < Последнее значение расширенной  секундной метки (формат unixtime),  если поддерживается крейтом
     */
    public Unsigned64 crate_unixtime = new Unsigned64();
    /**
     * < Маска действительных показаний термометров (если не поддерживается --- 0)
     */
    public DWORD therm_mask = new DWORD();
    /**
     * < значение показаний термометров крейта. действительны  только если соответствующий бит в therm_mask в 1
     */
    public Float[] therm_vals = array(new Float[LTR_CRATE_THERM_MAX_CNT]);
    /**
     * < Резерв
     */
    public Unsigned32[] res4 = array(new DWORD[19]);
}
