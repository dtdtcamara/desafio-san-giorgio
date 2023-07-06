# Documento de Requisitos - Caso de Uso: Avaliação de Candidato a Desenvolvedor Java


## Introdução
O caso de uso consiste em desenvolver uma funcionalidade que recebe um objeto contendo o código do vendedor e uma lista de pagamentos realizados. Cada pagamento é identificado pelo código da cobrança a que ele se refere. O sistema deve validar se o vendedor e o código da cobrança existem na base de dados. Além disso, ele deve verificar se o pagamento é parcial, total ou excedente em comparação com o valor original cobrado. Para cada situação de pagamento, o sistema deve enviar o objeto para uma fila SQS (Simple Queue Service) distinta e retornar o mesmo objeto recebido com a informação do status de pagamento preenchida.

## Requisitos Funcionais

### 1. Receber objeto contendo código do vendedor e lista de pagamentos

### 2. Validar existência do vendedor
O sistema deve verificar se o vendedor informado no objeto existe na base de dados. Caso não exista, o sistema deve retornar uma mensagem de erro informando que o vendedor não foi encontrado.

### 3. Validar existência do código da cobrança
Para cada pagamento realizado na lista, o sistema deve verificar se o código da cobrança informado existe na base de dados. Caso não exista, o sistema deve retornar uma mensagem de erro informando que o código da cobrança não foi encontrado.

### 4. Validar valor do pagamento
O sistema deve comparar o valor do pagamento recebido na requisição com o valor original cobrado, a fim de determinar se o pagamento é parcial, total ou excedente.

### 5. Enviar objeto para fila SQS
De acordo com a situação de pagamento (parcial, total ou excedente), o sistema deve enviar o objeto para uma fila SQS distinta. Essa fila será responsável por processar o objeto de acordo com a situação de pagamento.

### 6. Preencher status de pagamento
Após o processamento do objeto, o sistema deve preencher a informação do status de pagamento no mesmo objeto recebido. Essa informação indicará se o pagamento foi parcial, total ou excedente.

## Requisitos Não Funcionais
Os requisitos não funcionais descrevem características do sistema que não estão diretamente relacionadas às funcionalidades, mas afetam seu desempenho, segurança, usabilidade, entre outros aspectos.

### 1. Teste unitários
O caso de uso deve ser testavel através de testes unitários.

### 2. Tratamento de resposta e status code
O sistema deve retornar uma resposta com status code 200 em caso de sucesso e 4XX em caso de erro.

## Pontos a serem avaliados
- Qualidade do código
- Testes unitários
- Arquitetura
- Abstração

