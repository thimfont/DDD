package payment.shared;

import java.util.UUID;

public class Entidade {
    private UUID uuid;

    public Entidade() {
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }
}
