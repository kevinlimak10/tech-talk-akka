O Akka é uma biblioteca de código aberto que ajuda a desenvolver facilmente aplicações concorrentes e distribuídas usando Java ou Scala, aproveitando o Modelo de Ator².

- **Modelo de Ator**: O Akka utiliza um modelo de concorrência baseado em atores¹. Um ator representa uma unidade de computação independente². Os atores interagem apenas através de mensagens assíncronas e nunca através de chamadas diretas de métodos². Cada ator tem um endereço único e uma caixa de correio na qual outros atores podem entregar mensagens².

- **Concorrência**: Com o Akka, todas as palavras-chave de concorrência, como threads, pools, locks, etc., deixam de fazer sentido¹. Assim, nos concentramos apenas na estruturação da nossa aplicação em atores e na lógica de negócio de cada ator¹.

- **Vantagens**: Desenvolver aplicações concorrentes é difícil porque precisamos lidar com sincronização, locks e memória compartilhada. Ao usar atores Akka, podemos escrever facilmente código assíncrono sem a necessidade de locks e sincronização². Uma das vantagens de usar mensagens em vez de chamadas de método é que a thread do remetente não bloqueará para esperar um valor de retorno quando enviar uma mensagem para outro ator².


(1) Introduction to Akka Actors in Java | Baeldung. https://www.baeldung.com/akka-actors-java.

(2) Akka: Programação concorrente - DevMedia. https://www.devmedia.com.br/akka-programacao-concorrente/30714.

(3) Akka Actors Quickstart with Java · Lightbend Tech Hub. https://developer.lightbend.com/guides/akka-quickstart-java/index.html.

(4) Akka por ejemplos | Lógica Alternativa. https://www.logicaalternativa.com/akka-por-ejemplos/.
