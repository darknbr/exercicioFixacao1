# Exercicio de Fixação

# Projeto: Gerenciamento de Tarefas com Spring Boot (Sem Banco de Dados)

## Criação do Projeto:

### Crie um novo projeto Spring Boot com a dependência Spring Web.
### Modelo de Dados:

### Crie a classe Tarefa com atributos como id, descricao e concluida.
### Controlador:

### Crie um controlador chamado TarefaController.
### Implemente os métodos para lidar com as operações CRUD usando as anotações @GetMapping, @PostMapping, @PutMapping e @DeleteMapping.
### Serviço:

### Crie um serviço chamado TarefaService para realizar operações nas tarefas.
### Implemente os métodos para adicionar, listar, atualizar e excluir tarefas usando uma lista em memória.
### Execução:

### Execute o projeto e teste as operações CRUD usando ferramentas como Postman ou cURL.
### Utilize os endpoints /tarefas para listar todas as tarefas, /tarefas/{id} para visualizar uma tarefa por ID, /tarefas (POST) para adicionar uma nova tarefa, /tarefas/{id} (PUT) para atualizar uma tarefa existente e /tarefas/{id} (DELETE) para excluir uma tarefa.
### Desafio Adicional:

### Adicione validações nos campos da tarefa (por exemplo, não permitir descrição em branco).
### Implemente ordenação na listagem de tarefas.
### Crie uma busca por descrição de tarefas.
### Esse projeto lhe proporcionará uma compreensão prática de como criar um aplicativo Spring Boot com operações CRUD completas usando os métodos HTTP GET, POST, PUT e DELETE, sem a necessidade de um banco de dados. À medida que você constrói e testa cada parte do projeto, você ganhará mais confiança em desenvolver aplicativos web com o Spring Boot.