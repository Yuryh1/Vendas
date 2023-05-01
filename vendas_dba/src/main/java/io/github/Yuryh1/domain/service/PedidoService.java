package io.github.Yuryh1.domain.service;
import io.github.Yuryh1.domain.entity.Pedido;
import io.github.Yuryh1.domain.enums.StatusPedido;
import io.github.Yuryh1.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );

    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
