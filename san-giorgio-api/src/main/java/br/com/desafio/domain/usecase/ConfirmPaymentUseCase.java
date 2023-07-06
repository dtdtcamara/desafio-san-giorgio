package br.com.desafio.domain.usecase;


import br.com.desafio.domain.model.PaymentModel;

public interface ConfirmPaymentUseCase {
    PaymentModel confirm(PaymentModel paymentModel);
}
