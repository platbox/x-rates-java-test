package com.platbox.xrjt;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "/currencies", produces = MediaType.TEXT_PLAIN_VALUE)
public class Currencies {
    /**
     * Конвертер валют
     *
     * @param provider идентификатор поставщика котировок (CBR, CBM)
     * @param from     трёхбуквенный ISO-код исходной валюты
     * @param to       трёхбуквенный ISO-код целевой валюты
     * @param amount   сумма конвертации
     * @return результат конвертации
     */
    @RequestMapping(value = "/convert/{from}/to/{to}", method = RequestMethod.GET)
    public ResponseEntity<String> convert(
            @RequestHeader("X-Liquidity-Provider") String provider,
            @PathVariable("from") String from,
            @PathVariable("to") String to,
            @RequestParam("amount") BigDecimal amount) {
        return new ResponseEntity<>("Implement me!", HttpStatus.NOT_IMPLEMENTED);
    }
}
