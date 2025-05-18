Questão-4

Array de Tipos Primitivos:
Quando um array é declarado com um tipo primitivo. Cada elemento do array armazena diretamente o valor primitivo, sem referências ou ponteiros.

Array de Objetos:
Em um array de objetos exemplo de (Aluno[], Produto[]), a memória é alocada em duas partes:

Um array de referências (ponteiros) que armazena endereços de memória para os objetos.
A memória dos próprios objetos, que são armazenados no heap.

No momento da declaração, o array é criado, mas seus elementos são inicializados como null.
Cada elemento do array precisa ser explicitamente instanciado. Caso contrário, o acesso a um elemento não inicializado resultará em NullPointerException.
