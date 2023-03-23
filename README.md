## Funcionário e Gerente 

> Essa aplicação contém duas classes, Funcionário e Gerente, com o objetivo de armazenar informações relevantes sobre um funcionário e um gerente.

### Funcionário

> A classe Funcionário possui os seguintes campos:

- Nome
- CPF
- Salário
- Bonificação

>E os seguintes métodos:

```sh
getBonificação(): calcula e retorna a bonificação do funcionário, que é igual a 10% do salário.
setBonificação(): permite definir o valor da bonificação.
getNome(): retorna o nome do funcionário.
setNome(): permite definir o nome do funcionário.
getCpf(): retorna o CPF do funcionário.
setCpf(): permite definir o CPF do funcionário.
getSalario(): retorna o salário do funcionário.
setSalario(): permite definir o salário do funcionário.
getCalcularSalarioTotal(): calcula e retorna o salário total do funcionário, somando o salário base e a bonificação.
setCalcularSalarioTotal(): permite atualizar o salário total do funcionário adicionando uma bonificação específica.
```

## Gerente


>A classe Gerente é uma extensão da classe Funcionário e possui os seguintes campos adicionais:

```sh
Senha
E o seguinte método:

autentica(): verifica se a senha fornecida pelo usuário corresponde à senha do gerente.

```

## TesteGerente

```sh
A classe TesteGerente instancia um objeto Gerente e define algumas informações sobre ele, 
como nome, CPF e salário.
O programa imprime as informações do gerente, incluindo a bonificação e o salário total, usando os métodos da classe Funcionário.
```
