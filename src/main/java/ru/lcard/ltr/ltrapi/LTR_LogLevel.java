package ru.lcard.ltr.ltrapi;

/**
 * Уровень вывода журнала службой ltrd.
 */
public enum LTR_LogLevel {
    LTR_LOGLVL_ERR_FATAL, //< Фатальные ошибки
    LTR_LOGLVL_ERR, //< Ошибки
    LTR_LOGLVL_WARN, //< Предупреждения
    LTR_LOGLVL_INFO, //< Информационные сообщения
    LTR_LOGLVL_DETAIL, //< Детали
    LTR_LOGLVL_DBG_HIGH, //< Отладочные сообщения повышенного уровня важности
    LTR_LOGLVL_DBG_MED, //< Отладочные сообщения среднего уровня важности
    LTR_LOGLVL_DBG_LOW        //< Отладочные сообщения низкого уровня важности
}