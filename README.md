#🧮 Calculadora Android

Este projeto é uma calculadora simples desenvolvida em Kotlin utilizando o Android Studio.
Ela permite realizar operações matemáticas básicas com suporte a múltiplas operações na mesma expressão.

##📱 Funcionalidades
-Inserção de números de 0 a 9
-Operações básicas:
  -➕ Soma
  -➖ Subtração
  -✖️ Multiplicação
  -➗ Divisão
-Suporte a contas com múltiplas operações (ex: 1+2*3-1)
-Respeito à prioridade matemática:
  -Primeiro: multiplicação e divisão
  -Depois: soma e subtração
-Botão CE para limpar tudo
-Tratamento de erro:
  -❌ Divisão por zero
  
##🛠️ Tecnologias utilizadas
-Kotlin
-Android SDK
-Android Studio

##🧠 Lógica do Projeto

A calculadora não usa bibliotecas prontas para cálculo.
Toda a lógica foi implementada manualmente, seguindo estes passos:

1. O usuário digita a expressão no `EditText`
2. Ao clicar em `=`, a string é processada
3. Primeiro são resolvidas:
   - Multiplicações (`*`)
   - Divisões (`/`)
4. Depois:
   - Soma (`+`)
   - Subtração (`-`)
5. O resultado final é exibido na tela
   
##⚠️ Tratamento de erros

-Caso o usuário tente dividir por zero:
  -Erro! Divisão por 0
  -O app também impede inserir dois operadores seguidos
  
##📂 Estrutura principal

  - `MainActivity.kt` → Contém toda a lógica da calculadora
  - `activity_main.xml` → Interface com botões e campo de entrada
  
##▶️ Como executar

1. Clone o repositório:
2. git clone https://github.com/seu-usuario/seu-repositorio.git
3. Abra no Android Studio
4. Execute em:
  -Emulador ou
  -Celular físico

##🚀 Melhorias futuras
  -Suporte a números negativos
  -Parênteses ( )
  -Interface mais moderna
  -Histórico de cálculos
  -Suporte a ponto decimal com botão dedicado
