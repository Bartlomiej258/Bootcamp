package com.bootcamp.patterns2.facade;

import com.bootcamp.patterns2.facade.api.ItemDto;
import com.bootcamp.patterns2.facade.api.OrderDto;
import com.bootcamp.patterns2.facade.api.OrderFacade;
import com.bootcamp.patterns2.facade.api.OrderProcessingException;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class OrderFacadeAopTestSuite {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);

    @Autowired
    private ShopService shopService;

    @Test
    void testProcessOrder() throws OrderProcessingException {
        //given
        OrderFacade orderFacade = new OrderFacade(shopService);
        OrderDto orderDto = new OrderDto();
        orderDto.addItem(new ItemDto(1L, 2));

        //when
        orderFacade.processOrder(orderDto, 1L);
        //then
//        Assertions.assertEquals("Adding item", orderFacade.processOrder(orderDto, 1L));
    }
}
