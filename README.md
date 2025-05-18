Questão-4

Letra A) Array de Tipos Primitivos:
Quando um array é declarado com um tipo primitivo. Cada elemento do array armazena diretamente o valor primitivo, sem referências ou ponteiros.

Array de Objetos:
Em um array de objetos exemplo de (Aluno[], Produto[]), a memória é alocada em duas partes:

Um array de referências (ponteiros) que armazena endereços de memória para os objetos.
A memória dos próprios objetos, que são armazenados no heap.

No momento da declaração, o array é criado, mas seus elementos são inicializados como null.
Cada elemento do array precisa ser explicitamente instanciado. Caso contrário, o acesso a um elemento não inicializado resultará em NullPointerException.

Letra B) Em arrays de objetos, é fundamental verificar se um elemento foi inicializado antes de acessar porque sem essa verificação, tentar acessar um método ou atributo de um objeto não inicializado resultará em NULL.
Então dá para dizer que os cuidados a serem tomados são: Inicializar todos os objetos do array pois são automaticamente setados como Null, e  gerênciar as referências pois cada elemento é uma referência.
