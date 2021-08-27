#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct ll
{
    char name[20];
    int age;
    struct ll *next;
} ll;

void print_options()
{
    system("clear");
    printf("\n ********************************");
    printf("\n [1] - Inserindo dados na Lista..");
    printf("\n [2] - Exibindo os dados da Lista");
    printf("\n [3] - Pesquisa a Lista......... ");
    printf("\n [4] - Alterar dados da Lista....");
    printf("\n [5] - Remover dados da Lista....");
    printf("\n [6] - Inserir dados em lista organizada");
    printf("\n [9] - Sair");
}

void insert(ll **list)
{
   
    ll *temp_list = (ll *)malloc(sizeof(ll));

    // the first link
    if (*list == NULL)
    {
        printf("\n Informe a idade da Pessoa");
        scanf("%d", &temp_list->age);
        printf("\n Informe o nome da Pessoa..");
        scanf(" %s", &temp_list->name);
        if(*list)
            temp_list->next = *list;
        *list = temp_list;
    }
}

void show(ll **list)
{
    char a;
    ll *aux = (ll *)malloc(sizeof(ll));
    aux = *list;
    
    while (aux != NULL)
    {
        printf("\n Nome da Pessoa %s  tem a idade de  %d", aux->name, aux->age);
        aux = aux->next;
    }
    printf("\n\n");
    getchar(); getchar(); 
}
void search() {}
void change() {}
void remove() {}
void organize_list() {}

int main()
{
    bool exit = false;
    int op = 0;

    //my linked_list
    struct ll *my_list = NULL;

    do
    {
        print_options();
        printf("\n Informe a opcao Desejada ...");
        scanf("%d", &op);

        switch (op)
        {
        case 1:
            insert(&my_list);
            break;
        case 2:
            show(&my_list);
            break;
        case 3:
            search();
            break;
        case 4:
            change();
            break;
        case 5:
            remove();
            break;
        case 6:
            organize_list();
            break;
        case 9:
            exit = true;
            break;
        default:
            printf("\n Opcao Invalida... tente novamente");
        }
    } while (op != 9);

    return 0;
}