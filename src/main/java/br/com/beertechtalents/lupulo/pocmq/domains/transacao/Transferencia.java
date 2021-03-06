package br.com.beertechtalents.lupulo.pocmq.domains.transacao;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class Transferencia {

    private BigDecimal valor;

    private UUID hashContaDe;

    private UUID hashContaPara;
}
