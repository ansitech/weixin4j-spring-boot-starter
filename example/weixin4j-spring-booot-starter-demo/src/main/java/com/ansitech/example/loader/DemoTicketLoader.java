package com.ansitech.example.loader;

import org.springframework.stereotype.Component;
import org.weixin4j.loader.ITicketLoader;
import org.weixin4j.model.js.Ticket;
import org.weixin4j.model.js.TicketType;

import java.util.HashMap;
import java.util.Map;

/**
 * DemoTicketLoader
 *
 * @author yangqisheng
 * @date 2023/6/5 22:09
 */
@Component
public class DemoTicketLoader implements ITicketLoader {

    private Map<String, Ticket> ticketMap = new HashMap<>();

    @Override
    public Ticket get(TicketType ticketType) {
        return ticketMap.get(ticketType.name());
    }

    @Override
    public void refresh(Ticket ticket) {
        ticketMap.put(ticket.getTicketType().name(), ticket);
    }
}
