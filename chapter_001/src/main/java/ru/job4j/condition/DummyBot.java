package ru.job4j.condition;

/**
 * Глупый бот.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class DummyBot {

    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {

        /**
        * String стандартный ответ на неизвестную фразу
        */
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";                    
        } else if ("Пока.".equals(question)) { 
            rsl = "До скорой встречи.";
        }
        return rsl;
     }

}


