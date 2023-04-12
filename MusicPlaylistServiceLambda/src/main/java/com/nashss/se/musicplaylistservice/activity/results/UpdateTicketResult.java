package com.nashss.se.musicplaylistservice.activity.results;

import com.nashss.se.musicplaylistservice.models.TicketModel;

public class UpdateTicketResult {

    private final TicketModel ticketModel;

    private UpdateTicketResult(TicketModel ticketModel) {
        this.ticketModel = ticketModel;
    }

    public TicketModel getTicketModel() {
        return ticketModel;
    }

    @Override
    public String toString() {
        return "UpdateTicketResult{" +
                "ticketModel=" + ticketModel +
                '}';
    }

    //CHECKSTYLE:OFF:Builder
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private TicketModel ticketModel;

        public Builder withTicketModel(TicketModel ticketModel) {
            this.ticketModel = ticketModel;
            return this;
        }

        public UpdateTicketResult build() {
            return new UpdateTicketResult(ticketModel);
        }
    }
}
