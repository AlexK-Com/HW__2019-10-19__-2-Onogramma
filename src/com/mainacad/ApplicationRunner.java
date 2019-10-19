package com.mainacad;

import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

public class ApplicationRunner {
    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());
    public static void main(String[] args) {
        int test = 0;
        String testText = null;
        LOGGER.info("Начало программы!" );
        for (int j = 9999; j > 1000; j--){
            for (int i = 9999; i > 1000; i--){
                test = j * i;
                testText = Integer.toString(test);
                if ( testText.equalsIgnoreCase(StringUtils.reverse(testText)) ){
                    LOGGER.info("Максимальное число-онограмма: " + testText);
                    LOGGER.info("Результат умножения: " + j + " на " + i );
                    i = 0;
                    j = 0;
                }
            }
        }
        LOGGER.info("Конец программы! " );
    }

}
