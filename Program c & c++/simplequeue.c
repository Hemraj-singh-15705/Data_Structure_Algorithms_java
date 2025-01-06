#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define MAX_SIZE 5
int sq[MAX_SIZE], front=0,rear=-1;
void insert_rear(int item)
        {
        if(rear==MAX_SIZE-1)
		{
        printf("Queue is overflow :)");
        return ;    
    }
    rear=rear+1;
    sq[rear]=item;
}
void display()
{
    int i ;
    if(front>rear){
        printf("Queue is empty :");
        return;
    }
    printf("the element of simple queue is :");
    for(i=front; i<=rear; i++)
	{
        printf("%d  ",sq[i]);
    }
}
void delete_front()
{
	if(front>rear)
	{
		printf("Queue is empty :) ");
		return ;
	}
	printf("delete item is =%d",sq[front]);
	front=front+1;
}
int main()
{
    int item,choise;
    char ch;
    do
    {
        printf("\n**********Queue operation**********\n");
        printf("1. INSERT ELEMENT \n");
        printf("2. DISPLAY ELEMENT \n");
        printf("3. DELETE ELEMENT \n");
        printf("4. EXIT \n ");
        printf("***Enter the choise ***\n");
        scanf("%d",&choise);
        switch(choise){
            case 1:
                printf("Enter a item :~");
                scanf("%d",&item);
                insert_rear(item);
                break;
            case 2:
            	display();
            	break;
            case 3:
                 delete_front();
                 break;
            case 4:
            exit(0);
            default:
           printf("\n Wrong value");
        }
       printf("\n Do you continue (y/n)");
        ch=getch();
        putchar(ch);
    }
      while(ch=='y');
}
