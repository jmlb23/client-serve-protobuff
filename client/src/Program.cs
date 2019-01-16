using System;
using Com.Github.Jmlb23.Todo.Server.Codegen;
using Grpc.Core;

namespace client
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("init client");
            var client = new TodoService.TodoServiceClient(new Channel("localhost:5000",ChannelCredentials.Insecure));
            client.CreateTodo(new CreateTodoRequest(){Todo = new Todo(){Id = 1, Content= "proba", Done= false}});
            Console.WriteLine(client.GetTodo(new GetTodoRequest(){Id = 1}).Todo);
        }
    }
}
